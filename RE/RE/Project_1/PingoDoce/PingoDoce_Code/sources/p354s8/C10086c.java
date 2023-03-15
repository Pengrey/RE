package p354s8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0520s0;
import p100f8.C5429l;
import p111g.C5586a;

/* renamed from: s8.c */
/* loaded from: classes.dex */
public class C10086c {
    /* renamed from: a */
    public static ColorStateList m9229a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList m23700a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m23700a = C5586a.m23700a(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i);
        }
        return m23700a;
    }

    /* renamed from: b */
    public static ColorStateList m9228b(Context context, C0520s0 c0520s0, int i) {
        int m40473b;
        int m40461n;
        ColorStateList m23700a;
        if (!c0520s0.m40456s(i) || (m40461n = c0520s0.m40461n(i, 0)) == 0 || (m23700a = C5586a.m23700a(context, m40461n)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (m40473b = c0520s0.m40473b(i, -1)) != -1) {
                return ColorStateList.valueOf(m40473b);
            }
            return c0520s0.m40472c(i);
        }
        return m23700a;
    }

    /* renamed from: c */
    private static int m9227c(TypedValue typedValue) {
        if (Build.VERSION.SDK_INT >= 22) {
            return typedValue.getComplexUnit();
        }
        return (typedValue.data >> 0) & 15;
    }

    /* renamed from: d */
    public static int m9226d(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public static Drawable m9225e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m23699b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m23699b = C5586a.m23699b(context, resourceId)) == null) ? typedArray.getDrawable(i) : m23699b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m9224f(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: g */
    public static C10087d m9223g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C10087d(context, resourceId);
    }

    /* renamed from: h */
    public static int m9222h(Context context, int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5429l.f14913C5);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(C5429l.f14921D5, typedValue);
        obtainStyledAttributes.recycle();
        if (value) {
            if (m9227c(typedValue) == 2) {
                return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
            }
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return i2;
    }

    /* renamed from: i */
    public static boolean m9221i(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: j */
    public static boolean m9220j(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
