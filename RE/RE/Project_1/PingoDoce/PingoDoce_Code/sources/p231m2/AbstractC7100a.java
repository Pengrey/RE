package p231m2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.C1090d;
import androidx.core.view.accessibility.C1094e;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import java.util.List;
import p231m2.C7104b;
import p301q.C9559h;

/* renamed from: m2.a */
/* loaded from: classes.dex */
public abstract class AbstractC7100a extends C1078a {

    /* renamed from: n */
    private static final Rect f18836n = new Rect(Reader.READ_DONE, Reader.READ_DONE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C7104b.InterfaceC7105a<C1085c> f18837o = new C7101a();

    /* renamed from: p */
    private static final C7104b.InterfaceC7106b<C9559h<C1085c>, C1085c> f18838p = new C7102b();

    /* renamed from: h */
    private final AccessibilityManager f18843h;

    /* renamed from: i */
    private final View f18844i;

    /* renamed from: j */
    private C7103c f18845j;

    /* renamed from: d */
    private final Rect f18839d = new Rect();

    /* renamed from: e */
    private final Rect f18840e = new Rect();

    /* renamed from: f */
    private final Rect f18841f = new Rect();

    /* renamed from: g */
    private final int[] f18842g = new int[2];

    /* renamed from: k */
    int f18846k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f18847l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f18848m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: m2.a$a */
    /* loaded from: classes.dex */
    class C7101a implements C7104b.InterfaceC7105a<C1085c> {
        C7101a() {
        }

        @Override // p231m2.C7104b.InterfaceC7105a
        /* renamed from: b */
        public void mo19245a(C1085c c1085c, Rect rect) {
            c1085c.m38539m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: m2.a$b */
    /* loaded from: classes.dex */
    class C7102b implements C7104b.InterfaceC7106b<C9559h<C1085c>, C1085c> {
        C7102b() {
        }

        @Override // p231m2.C7104b.InterfaceC7106b
        /* renamed from: c */
        public C1085c mo19244a(C9559h<C1085c> c9559h, int i) {
            return c9559h.m10597n(i);
        }

        @Override // p231m2.C7104b.InterfaceC7106b
        /* renamed from: d */
        public int mo19243b(C9559h<C1085c> c9559h) {
            return c9559h.m10598m();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: m2.a$c */
    /* loaded from: classes.dex */
    private class C7103c extends C1090d {
        C7103c() {
        }

        @Override // androidx.core.view.accessibility.C1090d
        /* renamed from: b */
        public C1085c mo19263b(int i) {
            return C1085c.m38574P(AbstractC7100a.this.m19297H(i));
        }

        @Override // androidx.core.view.accessibility.C1090d
        /* renamed from: d */
        public C1085c mo19262d(int i) {
            int i2 = i == 2 ? AbstractC7100a.this.f18846k : AbstractC7100a.this.f18847l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo19263b(i2);
        }

        @Override // androidx.core.view.accessibility.C1090d
        /* renamed from: f */
        public boolean mo19261f(int i, int i2, Bundle bundle) {
            return AbstractC7100a.this.m19289P(i, i2, bundle);
        }
    }

    public AbstractC7100a(View view) {
        if (view != null) {
            this.f18844i = view;
            this.f18843h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1112b0.m38480C(view) == 0) {
                C1112b0.m38479C0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m19301D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m19300E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f18844i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f18844i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: F */
    private static int m19299F(int i) {
        if (i != 19) {
            if (i != 21) {
                return i != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    /* renamed from: G */
    private boolean m19298G(int i, Rect rect) {
        C1085c c1085c;
        C9559h<C1085c> m19268y = m19268y();
        int i2 = this.f18847l;
        C1085c m10604f = i2 == Integer.MIN_VALUE ? null : m19268y.m10604f(i2);
        if (i == 1 || i == 2) {
            c1085c = (C1085c) C7104b.m19257d(m19268y, f18838p, f18837o, m10604f, i, C1112b0.m38476E(this.f18844i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.f18847l;
            if (i3 != Integer.MIN_VALUE) {
                m19267z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m19301D(this.f18844i, i, rect2);
            }
            c1085c = (C1085c) C7104b.m19258c(m19268y, f18838p, f18837o, m10604f, rect2, i);
        }
        return m19285T(c1085c != null ? m19268y.m10600k(m19268y.m10601j(c1085c)) : Integer.MIN_VALUE);
    }

    /* renamed from: Q */
    private boolean m19288Q(int i, int i2, Bundle bundle) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        return mo19295J(i, i2, bundle);
                    }
                    return m19279n(i);
                }
                return m19286S(i);
            }
            return m19278o(i);
        }
        return m19285T(i);
    }

    /* renamed from: R */
    private boolean m19287R(int i, Bundle bundle) {
        return C1112b0.m38427h0(this.f18844i, i, bundle);
    }

    /* renamed from: S */
    private boolean m19286S(int i) {
        int i2;
        if (this.f18843h.isEnabled() && this.f18843h.isTouchExplorationEnabled() && (i2 = this.f18846k) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m19279n(i2);
            }
            this.f18846k = i;
            this.f18844i.invalidate();
            m19284U(i, 32768);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private void m19283V(int i) {
        int i2 = this.f18848m;
        if (i2 == i) {
            return;
        }
        this.f18848m = i;
        m19284U(i, 128);
        m19284U(i2, 256);
    }

    /* renamed from: n */
    private boolean m19279n(int i) {
        if (this.f18846k == i) {
            this.f18846k = Integer.MIN_VALUE;
            this.f18844i.invalidate();
            m19284U(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m19277p() {
        int i = this.f18847l;
        return i != Integer.MIN_VALUE && mo19295J(i, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m19276q(int i, int i2) {
        if (i != -1) {
            return m19275r(i, i2);
        }
        return m19274s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m19275r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C1085c m19297H = m19297H(i);
        obtain.getText().add(m19297H.m38515y());
        obtain.setContentDescription(m19297H.m38529r());
        obtain.setScrollable(m19297H.m38581K());
        obtain.setPassword(m19297H.m38583J());
        obtain.setEnabled(m19297H.m38591F());
        obtain.setChecked(m19297H.m38595D());
        m19293L(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(m19297H.m38533p());
        C1094e.m38499c(obtain, this.f18844i, i);
        obtain.setPackageName(this.f18844i.getContext().getPackageName());
        return obtain;
    }

    /* renamed from: s */
    private AccessibilityEvent m19274s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f18844i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C1085c m19273t(int i) {
        C1085c m38576N = C1085c.m38576N();
        m38576N.m38546i0(true);
        m38576N.m38542k0(true);
        m38576N.m38562a0("android.view.View");
        Rect rect = f18836n;
        m38576N.m38567W(rect);
        m38576N.m38566X(rect);
        m38576N.m38520v0(this.f18844i);
        mo19291N(i, m38576N);
        if (m38576N.m38515y() == null && m38576N.m38529r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m38576N.m38539m(this.f18840e);
        if (!this.f18840e.equals(rect)) {
            int m38543k = m38576N.m38543k();
            if ((m38543k & 64) == 0) {
                if ((m38543k & 128) == 0) {
                    m38576N.m38524t0(this.f18844i.getContext().getPackageName());
                    m38576N.m38592E0(this.f18844i, i);
                    if (this.f18846k == i) {
                        m38576N.m38569U(true);
                        m38576N.m38563a(128);
                    } else {
                        m38576N.m38569U(false);
                        m38576N.m38563a(64);
                    }
                    boolean z = this.f18847l == i;
                    if (z) {
                        m38576N.m38563a(2);
                    } else if (m38576N.m38589G()) {
                        m38576N.m38563a(1);
                    }
                    m38576N.m38540l0(z);
                    this.f18844i.getLocationOnScreen(this.f18842g);
                    m38576N.m38537n(this.f18839d);
                    if (this.f18839d.equals(rect)) {
                        m38576N.m38539m(this.f18839d);
                        if (m38576N.f3423b != -1) {
                            C1085c m38576N2 = C1085c.m38576N();
                            for (int i2 = m38576N.f3423b; i2 != -1; i2 = m38576N2.f3423b) {
                                m38576N2.m38518w0(this.f18844i, -1);
                                m38576N2.m38567W(f18836n);
                                mo19291N(i2, m38576N2);
                                m38576N2.m38539m(this.f18840e);
                                Rect rect2 = this.f18839d;
                                Rect rect3 = this.f18840e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            m38576N2.m38572R();
                        }
                        this.f18839d.offset(this.f18842g[0] - this.f18844i.getScrollX(), this.f18842g[1] - this.f18844i.getScrollY());
                    }
                    if (this.f18844i.getLocalVisibleRect(this.f18841f)) {
                        this.f18841f.offset(this.f18842g[0] - this.f18844i.getScrollX(), this.f18842g[1] - this.f18844i.getScrollY());
                        if (this.f18839d.intersect(this.f18841f)) {
                            m38576N.m38566X(this.f18839d);
                            if (m19300E(this.f18839d)) {
                                m38576N.m38582J0(true);
                            }
                        }
                    }
                    return m38576N;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: u */
    private C1085c m19272u() {
        C1085c m38575O = C1085c.m38575O(this.f18844i);
        C1112b0.m38431f0(this.f18844i, m38575O);
        ArrayList arrayList = new ArrayList();
        mo19302C(arrayList);
        if (m38575O.m38535o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m38575O.m38557d(this.f18844i, ((Integer) arrayList.get(i)).intValue());
        }
        return m38575O;
    }

    /* renamed from: y */
    private C9559h<C1085c> m19268y() {
        ArrayList arrayList = new ArrayList();
        mo19302C(arrayList);
        C9559h<C1085c> c9559h = new C9559h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c9559h.m10599l(arrayList.get(i).intValue(), m19273t(arrayList.get(i).intValue()));
        }
        return c9559h;
    }

    /* renamed from: z */
    private void m19267z(int i, Rect rect) {
        m19297H(i).m38539m(rect);
    }

    /* renamed from: A */
    public final int m19304A() {
        return this.f18847l;
    }

    /* renamed from: B */
    protected abstract int mo19303B(float f, float f2);

    /* renamed from: C */
    protected abstract void mo19302C(List<Integer> list);

    /* renamed from: H */
    C1085c m19297H(int i) {
        if (i == -1) {
            return m19272u();
        }
        return m19273t(i);
    }

    /* renamed from: I */
    public final void m19296I(boolean z, int i, Rect rect) {
        int i2 = this.f18847l;
        if (i2 != Integer.MIN_VALUE) {
            m19278o(i2);
        }
        if (z) {
            m19298G(i, rect);
        }
    }

    /* renamed from: J */
    protected abstract boolean mo19295J(int i, int i2, Bundle bundle);

    /* renamed from: K */
    protected void m19294K(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: L */
    protected void m19293L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: M */
    protected abstract void mo19292M(C1085c c1085c);

    /* renamed from: N */
    protected abstract void mo19291N(int i, C1085c c1085c);

    /* renamed from: O */
    protected abstract void mo19290O(int i, boolean z);

    /* renamed from: P */
    boolean m19289P(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m19288Q(i, i2, bundle);
        }
        return m19287R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean m19285T(int i) {
        int i2;
        if ((this.f18844i.isFocused() || this.f18844i.requestFocus()) && (i2 = this.f18847l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m19278o(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.f18847l = i;
            mo19290O(i, true);
            m19284U(i, 8);
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m19284U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f18843h.isEnabled() || (parent = this.f18844i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f18844i, m19276q(i, i2));
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: b */
    public C1090d mo19282b(View view) {
        if (this.f18845j == null) {
            this.f18845j = new C7103c();
        }
        return this.f18845j;
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: f */
    public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo19281f(view, accessibilityEvent);
        m19294K(accessibilityEvent);
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: g */
    public void mo19280g(View view, C1085c c1085c) {
        super.mo19280g(view, c1085c);
        mo19292M(c1085c);
    }

    /* renamed from: o */
    public final boolean m19278o(int i) {
        if (this.f18847l != i) {
            return false;
        }
        this.f18847l = Integer.MIN_VALUE;
        mo19290O(i, false);
        m19284U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean m19271v(MotionEvent motionEvent) {
        if (this.f18843h.isEnabled() && this.f18843h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f18848m != Integer.MIN_VALUE) {
                    m19283V(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int mo19303B = mo19303B(motionEvent.getX(), motionEvent.getY());
            m19283V(mo19303B);
            return mo19303B != Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m19270w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int m19299F = m19299F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && m19298G(m19299F, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    m19277p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return m19298G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return m19298G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final int m19269x() {
        return this.f18846k;
    }
}
