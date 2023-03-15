package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.l0 */
/* loaded from: classes.dex */
public final class C1179l0 {

    /* compiled from: WindowCompat.java */
    /* renamed from: androidx.core.view.l0$a */
    /* loaded from: classes.dex */
    static class C1180a {
        /* renamed from: a */
        static void m38117a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* compiled from: WindowCompat.java */
    /* renamed from: androidx.core.view.l0$b */
    /* loaded from: classes.dex */
    static class C1181b {
        /* renamed from: a */
        static void m38116a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static C1199n0 m38119a(Window window, View view) {
        return new C1199n0(window, view);
    }

    /* renamed from: b */
    public static void m38118b(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C1181b.m38116a(window, z);
        } else if (i >= 16) {
            C1180a.m38117a(window, z);
        }
    }
}
