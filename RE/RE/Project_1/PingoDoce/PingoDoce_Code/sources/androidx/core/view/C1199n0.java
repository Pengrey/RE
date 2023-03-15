package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p301q.C9558g;

/* renamed from: androidx.core.view.n0 */
/* loaded from: classes.dex */
public final class C1199n0 {

    /* renamed from: a */
    private final C1204e f3569a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: androidx.core.view.n0$a */
    /* loaded from: classes.dex */
    private static class C1200a extends C1204e {

        /* renamed from: a */
        protected final Window f3570a;

        C1200a(Window window, View view) {
            this.f3570a = window;
        }

        /* renamed from: c */
        protected void m38048c(int i) {
            View decorView = this.f3570a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        protected void m38047d(int i) {
            this.f3570a.addFlags(i);
        }

        /* renamed from: e */
        protected void m38046e(int i) {
            View decorView = this.f3570a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: f */
        protected void m38045f(int i) {
            this.f3570a.clearFlags(i);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: androidx.core.view.n0$b */
    /* loaded from: classes.dex */
    private static class C1201b extends C1200a {
        C1201b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.C1199n0.C1204e
        /* renamed from: b */
        public void mo38041b(boolean z) {
            if (z) {
                m38045f(67108864);
                m38047d(Integer.MIN_VALUE);
                m38048c(8192);
                return;
            }
            m38046e(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: androidx.core.view.n0$c */
    /* loaded from: classes.dex */
    private static class C1202c extends C1201b {
        C1202c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.C1199n0.C1204e
        /* renamed from: a */
        public void mo38042a(boolean z) {
            if (z) {
                m38045f(134217728);
                m38047d(Integer.MIN_VALUE);
                m38048c(16);
                return;
            }
            m38046e(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: androidx.core.view.n0$e */
    /* loaded from: classes.dex */
    private static class C1204e {
        C1204e() {
        }

        /* renamed from: a */
        public void mo38042a(boolean z) {
        }

        /* renamed from: b */
        public void mo38041b(boolean z) {
        }
    }

    public C1199n0(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3569a = new C1203d(window, this);
        } else if (i >= 26) {
            this.f3569a = new C1202c(window, view);
        } else if (i >= 23) {
            this.f3569a = new C1201b(window, view);
        } else if (i >= 20) {
            this.f3569a = new C1200a(window, view);
        } else {
            this.f3569a = new C1204e();
        }
    }

    /* renamed from: a */
    public void m38050a(boolean z) {
        this.f3569a.mo38042a(z);
    }

    /* renamed from: b */
    public void m38049b(boolean z) {
        this.f3569a.mo38041b(z);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* renamed from: androidx.core.view.n0$d */
    /* loaded from: classes.dex */
    private static class C1203d extends C1204e {

        /* renamed from: a */
        final WindowInsetsController f3571a;

        /* renamed from: b */
        protected Window f3572b;

        C1203d(Window window, C1199n0 c1199n0) {
            this(window.getInsetsController(), c1199n0);
            this.f3572b = window;
        }

        @Override // androidx.core.view.C1199n0.C1204e
        /* renamed from: a */
        public void mo38042a(boolean z) {
            if (z) {
                if (this.f3572b != null) {
                    m38044c(16);
                }
                this.f3571a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3572b != null) {
                m38043d(16);
            }
            this.f3571a.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.C1199n0.C1204e
        /* renamed from: b */
        public void mo38041b(boolean z) {
            if (z) {
                if (this.f3572b != null) {
                    m38044c(8192);
                }
                this.f3571a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3572b != null) {
                m38043d(8192);
            }
            this.f3571a.setSystemBarsAppearance(0, 8);
        }

        /* renamed from: c */
        protected void m38044c(int i) {
            View decorView = this.f3572b.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: d */
        protected void m38043d(int i) {
            View decorView = this.f3572b.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        C1203d(WindowInsetsController windowInsetsController, C1199n0 c1199n0) {
            new C9558g();
            this.f3571a = windowInsetsController;
        }
    }
}
