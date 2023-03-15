package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.i */
/* loaded from: classes.dex */
public final class C1170i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MarginLayoutParamsCompat.java */
    /* renamed from: androidx.core.view.i$a */
    /* loaded from: classes.dex */
    public static class C1171a {
        /* renamed from: a */
        static int m38153a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m38152b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m38151c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m38150d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m38149e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m38148f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m38147g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m38146h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m38157a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1171a.m38152b(marginLayoutParams);
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m38156b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C1171a.m38151c(marginLayoutParams);
        }
        return marginLayoutParams.leftMargin;
    }

    /* renamed from: c */
    public static void m38155c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            C1171a.m38147g(marginLayoutParams, i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }

    /* renamed from: d */
    public static void m38154d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            C1171a.m38146h(marginLayoutParams, i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }
}
