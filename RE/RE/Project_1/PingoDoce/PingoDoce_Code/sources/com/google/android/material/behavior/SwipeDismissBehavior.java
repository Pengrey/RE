package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.InterfaceC1097f;
import p231m2.C7108c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0873c<V> {

    /* renamed from: a */
    C7108c f9447a;

    /* renamed from: b */
    InterfaceC3475c f9448b;

    /* renamed from: c */
    private boolean f9449c;

    /* renamed from: e */
    private boolean f9451e;

    /* renamed from: d */
    private float f9450d = 0.0f;

    /* renamed from: f */
    int f9452f = 2;

    /* renamed from: g */
    float f9453g = 0.5f;

    /* renamed from: h */
    float f9454h = 0.0f;

    /* renamed from: i */
    float f9455i = 0.5f;

    /* renamed from: j */
    private final C7108c.AbstractC7111c f9456j = new C3473a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes.dex */
    class C3473a extends C7108c.AbstractC7111c {

        /* renamed from: a */
        private int f9457a;

        /* renamed from: b */
        private int f9458b = -1;

        C3473a() {
        }

        /* renamed from: n */
        private boolean m30483n(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.f9457a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f9453g);
            }
            boolean z = C1112b0.m38476E(view) == 1;
            int i2 = SwipeDismissBehavior.this.f9452f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: a */
        public int mo19207a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = C1112b0.m38476E(view) == 1;
            int i3 = SwipeDismissBehavior.this.f9452f;
            if (i3 == 0) {
                if (z) {
                    width = this.f9457a - view.getWidth();
                    width2 = this.f9457a;
                } else {
                    width = this.f9457a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f9457a - view.getWidth();
                width2 = view.getWidth() + this.f9457a;
            } else if (z) {
                width = this.f9457a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f9457a - view.getWidth();
                width2 = this.f9457a;
            }
            return SwipeDismissBehavior.m30491G(width, i, width2);
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: b */
        public int mo19206b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: d */
        public int mo19204d(View view) {
            return view.getWidth();
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: i */
        public void mo19199i(View view, int i) {
            this.f9458b = i;
            this.f9457a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: j */
        public void mo19198j(int i) {
            InterfaceC3475c interfaceC3475c = SwipeDismissBehavior.this.f9448b;
            if (interfaceC3475c != null) {
                interfaceC3475c.mo29257b(i);
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: k */
        public void mo19197k(View view, int i, int i2, int i3, int i4) {
            float width = this.f9457a + (view.getWidth() * SwipeDismissBehavior.this.f9454h);
            float width2 = this.f9457a + (view.getWidth() * SwipeDismissBehavior.this.f9455i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m30492F(0.0f, 1.0f - SwipeDismissBehavior.m30489I(width, width2, f), 1.0f));
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: l */
        public void mo19196l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC3475c interfaceC3475c;
            this.f9458b = -1;
            int width = view.getWidth();
            if (m30483n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f9457a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f9457a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f9447a.m19237F(i, view.getTop())) {
                C1112b0.m38421k0(view, new RunnableC3476d(view, z));
            } else if (!z || (interfaceC3475c = SwipeDismissBehavior.this.f9448b) == null) {
            } else {
                interfaceC3475c.mo29258a(view);
            }
        }

        @Override // p231m2.C7108c.AbstractC7111c
        /* renamed from: m */
        public boolean mo19195m(View view, int i) {
            int i2 = this.f9458b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo29263E(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes.dex */
    public class C3474b implements InterfaceC1097f {
        C3474b() {
        }

        @Override // androidx.core.view.accessibility.InterfaceC1097f
        /* renamed from: a */
        public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
            boolean z = false;
            if (SwipeDismissBehavior.this.mo29263E(view)) {
                boolean z2 = C1112b0.m38476E(view) == 1;
                int i = SwipeDismissBehavior.this.f9452f;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                C1112b0.m38437c0(view, width);
                view.setAlpha(0.0f);
                InterfaceC3475c interfaceC3475c = SwipeDismissBehavior.this.f9448b;
                if (interfaceC3475c != null) {
                    interfaceC3475c.mo29258a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3475c {
        /* renamed from: a */
        void mo29258a(View view);

        /* renamed from: b */
        void mo29257b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes.dex */
    private class RunnableC3476d implements Runnable {

        /* renamed from: w */
        private final View f9461w;

        /* renamed from: x */
        private final boolean f9462x;

        RunnableC3476d(View view, boolean z) {
            this.f9461w = view;
            this.f9462x = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC3475c interfaceC3475c;
            C7108c c7108c = SwipeDismissBehavior.this.f9447a;
            if (c7108c != null && c7108c.m19223k(true)) {
                C1112b0.m38421k0(this.f9461w, this);
            } else if (!this.f9462x || (interfaceC3475c = SwipeDismissBehavior.this.f9448b) == null) {
            } else {
                interfaceC3475c.mo29258a(this.f9461w);
            }
        }
    }

    /* renamed from: F */
    static float m30492F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m30491G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m30490H(ViewGroup viewGroup) {
        C7108c m19221m;
        if (this.f9447a == null) {
            if (this.f9451e) {
                m19221m = C7108c.m19222l(viewGroup, this.f9450d, this.f9456j);
            } else {
                m19221m = C7108c.m19221m(viewGroup, this.f9456j);
            }
            this.f9447a = m19221m;
        }
    }

    /* renamed from: I */
    static float m30489I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m30484N(View view) {
        C1112b0.m38417m0(view, 1048576);
        if (mo29263E(view)) {
            C1112b0.m38413o0(view, C1085c.C1086a.f3432l, null, new C3474b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: D */
    public boolean mo28779D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7108c c7108c = this.f9447a;
        if (c7108c != null) {
            c7108c.m19208z(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo29263E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m30488J(float f) {
        this.f9455i = m30492F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m30487K(InterfaceC3475c interfaceC3475c) {
        this.f9448b = interfaceC3475c;
    }

    /* renamed from: L */
    public void m30486L(float f) {
        this.f9454h = m30492F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void m30485M(int i) {
        this.f9452f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: k */
    public boolean mo29260k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f9449c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m39361B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9449c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9449c = false;
        }
        if (z) {
            m30490H(coordinatorLayout);
            return this.f9447a.m19236G(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: l */
    public boolean mo30696h0(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean mo30696h0 = super.mo30696h0(coordinatorLayout, v, i);
        if (C1112b0.m38480C(v) == 0) {
            C1112b0.m38479C0(v, 1);
            m30484N(v);
        }
        return mo30696h0;
    }
}
