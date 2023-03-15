package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: androidx.core.view.f */
/* loaded from: classes.dex */
public final class C1158f {

    /* compiled from: GravityCompat.java */
    /* renamed from: androidx.core.view.f$a */
    /* loaded from: classes.dex */
    static class C1159a {
        /* renamed from: a */
        static void m38196a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        static void m38195b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        static void m38194c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m38198a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            C1159a.m38195b(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: b */
    public static int m38197b(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & (-8388609);
    }
}
