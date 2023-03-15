package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0969a;
import p070e.C4906j;

/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
public class C0508n0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1704a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1705b = {-16842910};

    /* renamed from: c */
    static final int[] f1706c = {16842908};

    /* renamed from: d */
    static final int[] f1707d = {16842919};

    /* renamed from: e */
    static final int[] f1708e = {16842912};

    /* renamed from: f */
    static final int[] f1709f = new int[0];

    /* renamed from: g */
    private static final int[] f1710g = new int[1];

    /* renamed from: a */
    public static void m40495a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4906j.f13592u0);
        try {
            if (!obtainStyledAttributes.hasValue(C4906j.f13617z0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m40494b(Context context, int i) {
        ColorStateList m40491e = m40491e(context, i);
        if (m40491e != null && m40491e.isStateful()) {
            return m40491e.getColorForState(f1705b, m40491e.getDefaultColor());
        }
        TypedValue m40490f = m40490f();
        context.getTheme().resolveAttribute(16842803, m40490f, true);
        return m40492d(context, i, m40490f.getFloat());
    }

    /* renamed from: c */
    public static int m40493c(Context context, int i) {
        int[] iArr = f1710g;
        iArr[0] = i;
        C0520s0 m40454u = C0520s0.m40454u(context, null, iArr);
        try {
            return m40454u.m40473b(0, 0);
        } finally {
            m40454u.m40452w();
        }
    }

    /* renamed from: d */
    static int m40492d(Context context, int i, float f) {
        int m40493c = m40493c(context, i);
        return C0969a.m38939j(m40493c, Math.round(Color.alpha(m40493c) * f));
    }

    /* renamed from: e */
    public static ColorStateList m40491e(Context context, int i) {
        int[] iArr = f1710g;
        iArr[0] = i;
        C0520s0 m40454u = C0520s0.m40454u(context, null, iArr);
        try {
            return m40454u.m40472c(0);
        } finally {
            m40454u.m40452w();
        }
    }

    /* renamed from: f */
    private static TypedValue m40490f() {
        ThreadLocal<TypedValue> threadLocal = f1704a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
