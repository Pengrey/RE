package p039c3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p039c3.AbstractC2037m;
import p039c3.C1990a;

/* renamed from: c3.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC2029j0 extends AbstractC2037m {

    /* renamed from: g0 */
    private static final String[] f5876g0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: f0 */
    private int f5877f0 = 3;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Visibility.java */
    /* renamed from: c3.j0$a */
    /* loaded from: classes.dex */
    public class C2030a extends C2045n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5878a;

        /* renamed from: b */
        final /* synthetic */ View f5879b;

        /* renamed from: c */
        final /* synthetic */ View f5880c;

        C2030a(ViewGroup viewGroup, View view, View view2) {
            this.f5878a = viewGroup;
            this.f5879b = view;
            this.f5880c = view2;
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: a */
        public void mo34856a(AbstractC2037m abstractC2037m) {
            C2059x.m34809a(this.f5878a).mo34810c(this.f5879b);
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: d */
        public void mo34854d(AbstractC2037m abstractC2037m) {
            if (this.f5879b.getParent() == null) {
                C2059x.m34809a(this.f5878a).mo34811a(this.f5879b);
            } else {
                AbstractC2029j0.this.cancel();
            }
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            this.f5880c.setTag(C2028j.save_overlay_view, null);
            C2059x.m34809a(this.f5878a).mo34810c(this.f5879b);
            abstractC2037m.mo34846T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: c3.j0$b */
    /* loaded from: classes.dex */
    public static class C2031b extends AnimatorListenerAdapter implements AbstractC2037m.InterfaceC2043f, C1990a.InterfaceC1991a {

        /* renamed from: a */
        private final View f5882a;

        /* renamed from: b */
        private final int f5883b;

        /* renamed from: c */
        private final ViewGroup f5884c;

        /* renamed from: d */
        private final boolean f5885d;

        /* renamed from: e */
        private boolean f5886e;

        /* renamed from: f */
        boolean f5887f = false;

        C2031b(View view, int i, boolean z) {
            this.f5882a = view;
            this.f5883b = i;
            this.f5884c = (ViewGroup) view.getParent();
            this.f5885d = z;
            m34895g(true);
        }

        /* renamed from: f */
        private void m34896f() {
            if (!this.f5887f) {
                C2007c0.m34942h(this.f5882a, this.f5883b);
                ViewGroup viewGroup = this.f5884c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m34895g(false);
        }

        /* renamed from: g */
        private void m34895g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f5885d || this.f5886e == z || (viewGroup = this.f5884c) == null) {
                return;
            }
            this.f5886e = z;
            C2059x.m34807c(viewGroup, z);
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: a */
        public void mo34856a(AbstractC2037m abstractC2037m) {
            m34895g(false);
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: b */
        public void mo34855b(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: c */
        public void mo34817c(AbstractC2037m abstractC2037m) {
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: d */
        public void mo34854d(AbstractC2037m abstractC2037m) {
            m34895g(true);
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            m34896f();
            abstractC2037m.mo34846T(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5887f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m34896f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p039c3.C1990a.InterfaceC1991a
        public void onAnimationPause(Animator animator) {
            if (this.f5887f) {
                return;
            }
            C2007c0.m34942h(this.f5882a, this.f5883b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p039c3.C1990a.InterfaceC1991a
        public void onAnimationResume(Animator animator) {
            if (this.f5887f) {
                return;
            }
            C2007c0.m34942h(this.f5882a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Visibility.java */
    /* renamed from: c3.j0$c */
    /* loaded from: classes.dex */
    public static class C2032c {

        /* renamed from: a */
        boolean f5888a;

        /* renamed from: b */
        boolean f5889b;

        /* renamed from: c */
        int f5890c;

        /* renamed from: d */
        int f5891d;

        /* renamed from: e */
        ViewGroup f5892e;

        /* renamed from: f */
        ViewGroup f5893f;

        C2032c() {
        }
    }

    /* renamed from: g0 */
    private void m34903g0(C2054s c2054s) {
        c2054s.f5959a.put("android:visibility:visibility", Integer.valueOf(c2054s.f5960b.getVisibility()));
        c2054s.f5959a.put("android:visibility:parent", c2054s.f5960b.getParent());
        int[] iArr = new int[2];
        c2054s.f5960b.getLocationOnScreen(iArr);
        c2054s.f5959a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: h0 */
    private C2032c m34902h0(C2054s c2054s, C2054s c2054s2) {
        C2032c c2032c = new C2032c();
        c2032c.f5888a = false;
        c2032c.f5889b = false;
        if (c2054s != null && c2054s.f5959a.containsKey("android:visibility:visibility")) {
            c2032c.f5890c = ((Integer) c2054s.f5959a.get("android:visibility:visibility")).intValue();
            c2032c.f5892e = (ViewGroup) c2054s.f5959a.get("android:visibility:parent");
        } else {
            c2032c.f5890c = -1;
            c2032c.f5892e = null;
        }
        if (c2054s2 != null && c2054s2.f5959a.containsKey("android:visibility:visibility")) {
            c2032c.f5891d = ((Integer) c2054s2.f5959a.get("android:visibility:visibility")).intValue();
            c2032c.f5893f = (ViewGroup) c2054s2.f5959a.get("android:visibility:parent");
        } else {
            c2032c.f5891d = -1;
            c2032c.f5893f = null;
        }
        if (c2054s != null && c2054s2 != null) {
            int i = c2032c.f5890c;
            int i2 = c2032c.f5891d;
            if (i == i2 && c2032c.f5892e == c2032c.f5893f) {
                return c2032c;
            }
            if (i != i2) {
                if (i == 0) {
                    c2032c.f5889b = false;
                    c2032c.f5888a = true;
                } else if (i2 == 0) {
                    c2032c.f5889b = true;
                    c2032c.f5888a = true;
                }
            } else if (c2032c.f5893f == null) {
                c2032c.f5889b = false;
                c2032c.f5888a = true;
            } else if (c2032c.f5892e == null) {
                c2032c.f5889b = true;
                c2032c.f5888a = true;
            }
        } else if (c2054s == null && c2032c.f5891d == 0) {
            c2032c.f5889b = true;
            c2032c.f5888a = true;
        } else if (c2054s2 == null && c2032c.f5890c == 0) {
            c2032c.f5889b = false;
            c2032c.f5888a = true;
        }
        return c2032c;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: H */
    public String[] mo34884H() {
        return f5876g0;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: J */
    public boolean mo34882J(C2054s c2054s, C2054s c2054s2) {
        if (c2054s == null && c2054s2 == null) {
            return false;
        }
        if (c2054s == null || c2054s2 == null || c2054s2.f5959a.containsKey("android:visibility:visibility") == c2054s.f5959a.containsKey("android:visibility:visibility")) {
            C2032c m34902h0 = m34902h0(c2054s, c2054s2);
            if (m34902h0.f5888a) {
                return m34902h0.f5890c == 0 || m34902h0.f5891d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: f */
    public void mo29511f(C2054s c2054s) {
        m34903g0(c2054s);
    }

    /* renamed from: i0 */
    public abstract Animator mo34901i0(ViewGroup viewGroup, View view, C2054s c2054s, C2054s c2054s2);

    @Override // p039c3.AbstractC2037m
    /* renamed from: j */
    public void mo29509j(C2054s c2054s) {
        m34903g0(c2054s);
    }

    /* renamed from: j0 */
    public Animator m34900j0(ViewGroup viewGroup, C2054s c2054s, int i, C2054s c2054s2, int i2) {
        if ((this.f5877f0 & 1) != 1 || c2054s2 == null) {
            return null;
        }
        if (c2054s == null) {
            View view = (View) c2054s2.f5960b.getParent();
            if (m34902h0(m34861u(view, false), m34883I(view, false)).f5888a) {
                return null;
            }
        }
        return mo34901i0(viewGroup, c2054s2.f5960b, c2054s, c2054s2);
    }

    /* renamed from: k0 */
    public abstract Animator mo34899k0(ViewGroup viewGroup, View view, C2054s c2054s, C2054s c2054s2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.f5919R != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m34898l0(android.view.ViewGroup r18, p039c3.C2054s r19, int r20, p039c3.C2054s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p039c3.AbstractC2029j0.m34898l0(android.view.ViewGroup, c3.s, int, c3.s, int):android.animation.Animator");
    }

    /* renamed from: m0 */
    public void m34897m0(int i) {
        if ((i & (-4)) == 0) {
            this.f5877f0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: n */
    public Animator mo29508n(ViewGroup viewGroup, C2054s c2054s, C2054s c2054s2) {
        C2032c m34902h0 = m34902h0(c2054s, c2054s2);
        if (m34902h0.f5888a) {
            if (m34902h0.f5892e == null && m34902h0.f5893f == null) {
                return null;
            }
            if (m34902h0.f5889b) {
                return m34900j0(viewGroup, c2054s, m34902h0.f5890c, c2054s2, m34902h0.f5891d);
            }
            return m34898l0(viewGroup, c2054s, m34902h0.f5890c, c2054s2, m34902h0.f5891d);
        }
        return null;
    }
}
