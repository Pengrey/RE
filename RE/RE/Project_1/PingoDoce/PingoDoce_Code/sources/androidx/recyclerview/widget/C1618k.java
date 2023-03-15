package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.C1112b0;
import androidx.core.view.C1151e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p480z2.C13628b;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C1618k extends RecyclerView.AbstractC1545n implements RecyclerView.InterfaceC1552q {

    /* renamed from: A */
    private C1627g f4919A;

    /* renamed from: C */
    private Rect f4920C;

    /* renamed from: D */
    private long f4921D;

    /* renamed from: d */
    float f4922d;

    /* renamed from: e */
    float f4923e;

    /* renamed from: f */
    private float f4924f;

    /* renamed from: g */
    private float f4925g;

    /* renamed from: h */
    float f4926h;

    /* renamed from: i */
    float f4927i;

    /* renamed from: j */
    private float f4928j;

    /* renamed from: k */
    private float f4929k;

    /* renamed from: m */
    AbstractC1624f f4930m;

    /* renamed from: o */
    int f4931o;

    /* renamed from: q */
    private int f4932q;

    /* renamed from: r */
    RecyclerView f4933r;

    /* renamed from: t */
    VelocityTracker f4934t;

    /* renamed from: u */
    private List<RecyclerView.AbstractC1531c0> f4935u;

    /* renamed from: v */
    private List<Integer> f4936v;

    /* renamed from: z */
    C1151e f4937z;

    /* renamed from: a */
    final List<View> f4938a = new ArrayList();

    /* renamed from: b */
    private final float[] f4939b = new float[2];

    /* renamed from: c */
    RecyclerView.AbstractC1531c0 f4940c = null;

    /* renamed from: l */
    int f4941l = -1;

    /* renamed from: n */
    private int f4942n = 0;

    /* renamed from: p */
    List<C1628h> f4943p = new ArrayList();

    /* renamed from: s */
    final Runnable f4944s = new RunnableC1619a();

    /* renamed from: w */
    private RecyclerView.InterfaceC1538j f4945w = null;

    /* renamed from: x */
    View f4946x = null;

    /* renamed from: y */
    int f4947y = -1;

    /* renamed from: B */
    private final RecyclerView.InterfaceC1554s f4948B = new C1620b();

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    class RunnableC1619a implements Runnable {
        RunnableC1619a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1618k c1618k = C1618k.this;
            if (c1618k.f4940c == null || !c1618k.m35991E()) {
                return;
            }
            C1618k c1618k2 = C1618k.this;
            RecyclerView.AbstractC1531c0 abstractC1531c0 = c1618k2.f4940c;
            if (abstractC1531c0 != null) {
                c1618k2.m35968z(abstractC1531c0);
            }
            C1618k c1618k3 = C1618k.this;
            c1618k3.f4933r.removeCallbacks(c1618k3.f4944s);
            C1112b0.m38421k0(C1618k.this.f4933r, this);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes.dex */
    class C1620b implements RecyclerView.InterfaceC1554s {
        C1620b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
        /* renamed from: a */
        public boolean mo35967a(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1628h m35975s;
            C1618k.this.f4937z.m38210a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1618k.this.f4941l = motionEvent.getPointerId(0);
                C1618k.this.f4922d = motionEvent.getX();
                C1618k.this.f4923e = motionEvent.getY();
                C1618k.this.m35995A();
                C1618k c1618k = C1618k.this;
                if (c1618k.f4940c == null && (m35975s = c1618k.m35975s(motionEvent)) != null) {
                    C1618k c1618k2 = C1618k.this;
                    c1618k2.f4922d -= m35975s.f4971i;
                    c1618k2.f4923e -= m35975s.f4972j;
                    c1618k2.m35976r(m35975s.f4967e, true);
                    if (C1618k.this.f4938a.remove(m35975s.f4967e.f4581a)) {
                        C1618k c1618k3 = C1618k.this;
                        c1618k3.f4930m.mo35958c(c1618k3.f4933r, m35975s.f4967e);
                    }
                    C1618k.this.m35990F(m35975s.f4967e, m35975s.f4968f);
                    C1618k c1618k4 = C1618k.this;
                    c1618k4.m35985K(motionEvent, c1618k4.f4931o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = C1618k.this.f4941l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C1618k.this.m35979o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                C1618k c1618k5 = C1618k.this;
                c1618k5.f4941l = -1;
                c1618k5.m35990F(null, 0);
            }
            VelocityTracker velocityTracker = C1618k.this.f4934t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C1618k.this.f4940c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
        /* renamed from: c */
        public void mo35966c(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1618k.this.f4937z.m38210a(motionEvent);
            VelocityTracker velocityTracker = C1618k.this.f4934t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1618k.this.f4941l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(C1618k.this.f4941l);
            if (findPointerIndex >= 0) {
                C1618k.this.m35979o(actionMasked, motionEvent, findPointerIndex);
            }
            C1618k c1618k = C1618k.this;
            RecyclerView.AbstractC1531c0 abstractC1531c0 = c1618k.f4940c;
            if (abstractC1531c0 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        c1618k.m35985K(motionEvent, c1618k.f4931o, findPointerIndex);
                        C1618k.this.m35968z(abstractC1531c0);
                        C1618k c1618k2 = C1618k.this;
                        c1618k2.f4933r.removeCallbacks(c1618k2.f4944s);
                        C1618k.this.f4944s.run();
                        C1618k.this.f4933r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C1618k c1618k3 = C1618k.this;
                    if (pointerId == c1618k3.f4941l) {
                        c1618k3.f4941l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        C1618k c1618k4 = C1618k.this;
                        c1618k4.m35985K(motionEvent, c1618k4.f4931o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = c1618k.f4934t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            C1618k.this.m35990F(null, 0);
            C1618k.this.f4941l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1554s
        /* renamed from: e */
        public void mo35965e(boolean z) {
            if (z) {
                C1618k.this.m35990F(null, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$c */
    /* loaded from: classes.dex */
    public class C1621c extends C1628h {

        /* renamed from: n */
        final /* synthetic */ int f4951n;

        /* renamed from: o */
        final /* synthetic */ RecyclerView.AbstractC1531c0 f4952o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1621c(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC1531c0 abstractC1531c02) {
            super(abstractC1531c0, i, i2, f, f2, f3, f4);
            this.f4951n = i3;
            this.f4952o = abstractC1531c02;
        }

        @Override // androidx.recyclerview.widget.C1618k.C1628h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f4973k) {
                return;
            }
            if (this.f4951n <= 0) {
                C1618k c1618k = C1618k.this;
                c1618k.f4930m.mo35958c(c1618k.f4933r, this.f4952o);
            } else {
                C1618k.this.f4938a.add(this.f4952o.f4581a);
                this.f4970h = true;
                int i = this.f4951n;
                if (i > 0) {
                    C1618k.this.m35994B(this, i);
                }
            }
            C1618k c1618k2 = C1618k.this;
            View view = c1618k2.f4946x;
            View view2 = this.f4952o.f4581a;
            if (view == view2) {
                c1618k2.m35992D(view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$d */
    /* loaded from: classes.dex */
    public class RunnableC1622d implements Runnable {

        /* renamed from: w */
        final /* synthetic */ C1628h f4954w;

        /* renamed from: x */
        final /* synthetic */ int f4955x;

        RunnableC1622d(C1628h c1628h, int i) {
            this.f4954w = c1628h;
            this.f4955x = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C1618k.this.f4933r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            C1628h c1628h = this.f4954w;
            if (c1628h.f4973k || c1628h.f4967e.m36568j() == -1) {
                return;
            }
            RecyclerView.AbstractC1540l itemAnimator = C1618k.this.f4933r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.m36518q(null)) && !C1618k.this.m35970x()) {
                C1618k.this.f4930m.mo35961C(this.f4954w.f4967e, this.f4955x);
            } else {
                C1618k.this.f4933r.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$e */
    /* loaded from: classes.dex */
    public class C1623e implements RecyclerView.InterfaceC1538j {
        C1623e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1538j
        /* renamed from: a */
        public int mo35964a(int i, int i2) {
            C1618k c1618k = C1618k.this;
            View view = c1618k.f4946x;
            if (view == null) {
                return i2;
            }
            int i3 = c1618k.f4947y;
            if (i3 == -1) {
                i3 = c1618k.f4933r.indexOfChild(view);
                C1618k.this.f4947y = i3;
            }
            return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1624f {

        /* renamed from: b */
        private static final Interpolator f4958b = new animationInterpolatorC1625a();

        /* renamed from: c */
        private static final Interpolator f4959c = new animationInterpolatorC1626b();

        /* renamed from: a */
        private int f4960a = -1;

        /* compiled from: ItemTouchHelper.java */
        /* renamed from: androidx.recyclerview.widget.k$f$a  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
        /* loaded from: classes.dex */
        static class animationInterpolatorC1625a implements Interpolator {
            animationInterpolatorC1625a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* renamed from: androidx.recyclerview.widget.k$f$b  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
        /* loaded from: classes.dex */
        static class animationInterpolatorC1626b implements Interpolator {
            animationInterpolatorC1626b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m35956e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: i */
        public static InterfaceC1632l m35952i() {
            return C1633m.f4977a;
        }

        /* renamed from: j */
        private int m35951j(RecyclerView recyclerView) {
            if (this.f4960a == -1) {
                this.f4960a = recyclerView.getResources().getDimensionPixelSize(C13628b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f4960a;
        }

        /* renamed from: t */
        public static int m35941t(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: u */
        public static int m35940u(int i, int i2) {
            int m35941t = m35941t(0, i2 | i);
            return m35941t(2, i) | m35941t(1, i2) | m35941t;
        }

        /* renamed from: A */
        public void m35963A(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, int i, RecyclerView.AbstractC1531c0 abstractC1531c02, int i2, int i3, int i4) {
            RecyclerView.AbstractC1546o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC1631j) {
                ((InterfaceC1631j) layoutManager).mo35928b(abstractC1531c0.f4581a, abstractC1531c02.f4581a, i3, i4);
                return;
            }
            if (layoutManager.mo36256l()) {
                if (layoutManager.m36472R(abstractC1531c02.f4581a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m36643l1(i2);
                }
                if (layoutManager.m36468U(abstractC1531c02.f4581a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m36643l1(i2);
                }
            }
            if (layoutManager.mo36253m()) {
                if (layoutManager.m36467V(abstractC1531c02.f4581a) <= recyclerView.getPaddingTop()) {
                    recyclerView.m36643l1(i2);
                }
                if (layoutManager.m36475P(abstractC1531c02.f4581a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m36643l1(i2);
                }
            }
        }

        /* renamed from: B */
        public void mo35962B(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
            if (abstractC1531c0 != null) {
                C1633m.f4977a.mo35926b(abstractC1531c0.f4581a);
            }
        }

        /* renamed from: C */
        public abstract void mo35961C(RecyclerView.AbstractC1531c0 abstractC1531c0, int i);

        /* renamed from: a */
        public boolean m35960a(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.AbstractC1531c0 m35959b(RecyclerView.AbstractC1531c0 abstractC1531c0, List<RecyclerView.AbstractC1531c0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + abstractC1531c0.f4581a.getWidth();
            int height = i2 + abstractC1531c0.f4581a.getHeight();
            int left2 = i - abstractC1531c0.f4581a.getLeft();
            int top2 = i2 - abstractC1531c0.f4581a.getTop();
            int size = list.size();
            RecyclerView.AbstractC1531c0 abstractC1531c02 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC1531c0 abstractC1531c03 = list.get(i4);
                if (left2 > 0 && (right = abstractC1531c03.f4581a.getRight() - width) < 0 && abstractC1531c03.f4581a.getRight() > abstractC1531c0.f4581a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    abstractC1531c02 = abstractC1531c03;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = abstractC1531c03.f4581a.getLeft() - i) > 0 && abstractC1531c03.f4581a.getLeft() < abstractC1531c0.f4581a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    abstractC1531c02 = abstractC1531c03;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = abstractC1531c03.f4581a.getTop() - i2) > 0 && abstractC1531c03.f4581a.getTop() < abstractC1531c0.f4581a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    abstractC1531c02 = abstractC1531c03;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = abstractC1531c03.f4581a.getBottom() - height) < 0 && abstractC1531c03.f4581a.getBottom() > abstractC1531c0.f4581a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    abstractC1531c02 = abstractC1531c03;
                    i3 = abs;
                }
            }
            return abstractC1531c02;
        }

        /* renamed from: c */
        public void mo35958c(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
            C1633m.f4977a.mo35927a(abstractC1531c0.f4581a);
        }

        /* renamed from: d */
        public int m35957d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: f */
        final int m35955f(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
            return m35957d(mo35949l(recyclerView, abstractC1531c0), C1112b0.m38476E(recyclerView));
        }

        /* renamed from: g */
        public long m35954g(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC1540l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            } else if (i == 8) {
                return itemAnimator.m36520n();
            } else {
                return itemAnimator.m36519o();
            }
        }

        /* renamed from: h */
        public int m35953h() {
            return 0;
        }

        /* renamed from: k */
        public float m35950k(RecyclerView.AbstractC1531c0 abstractC1531c0) {
            return 0.5f;
        }

        /* renamed from: l */
        public abstract int mo35949l(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0);

        /* renamed from: m */
        public float m35948m(float f) {
            return f;
        }

        /* renamed from: n */
        public float m35947n(RecyclerView.AbstractC1531c0 abstractC1531c0) {
            return 0.5f;
        }

        /* renamed from: o */
        public float m35946o(float f) {
            return f;
        }

        /* renamed from: p */
        boolean m35945p(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
            return (m35955f(recyclerView, abstractC1531c0) & 16711680) != 0;
        }

        /* renamed from: q */
        public int m35944q(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int signum = (int) (((int) (((int) Math.signum(i2)) * m35951j(recyclerView) * f4959c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * f4958b.getInterpolation(j <= 2000 ? ((float) j) / 2000.0f : 1.0f));
            return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
        }

        /* renamed from: r */
        public boolean mo35943r() {
            return true;
        }

        /* renamed from: s */
        public boolean m35942s() {
            return true;
        }

        /* renamed from: v */
        public void mo35939v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, float f, float f2, int i, boolean z) {
            C1633m.f4977a.mo35924d(canvas, recyclerView, abstractC1531c0.f4581a, f, f2, i, z);
        }

        /* renamed from: w */
        public void m35938w(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, float f, float f2, int i, boolean z) {
            C1633m.f4977a.mo35925c(canvas, recyclerView, abstractC1531c0.f4581a, f, f2, i, z);
        }

        /* renamed from: x */
        void m35937x(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, List<C1628h> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1628h c1628h = list.get(i2);
                c1628h.m35929e();
                int save = canvas.save();
                mo35939v(canvas, recyclerView, c1628h.f4967e, c1628h.f4971i, c1628h.f4972j, c1628h.f4968f, false);
                canvas.restoreToCount(save);
            }
            if (abstractC1531c0 != null) {
                int save2 = canvas.save();
                mo35939v(canvas, recyclerView, abstractC1531c0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: y */
        void m35936y(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, List<C1628h> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1628h c1628h = list.get(i2);
                int save = canvas.save();
                m35938w(canvas, recyclerView, c1628h.f4967e, c1628h.f4971i, c1628h.f4972j, c1628h.f4968f, false);
                canvas.restoreToCount(save);
            }
            if (abstractC1531c0 != null) {
                int save2 = canvas.save();
                m35938w(canvas, recyclerView, abstractC1531c0, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1628h c1628h2 = list.get(i3);
                boolean z2 = c1628h2.f4974l;
                if (z2 && !c1628h2.f4970h) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: z */
        public abstract boolean mo35935z(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$g */
    /* loaded from: classes.dex */
    public class C1627g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        private boolean f4961a = true;

        C1627g() {
        }

        /* renamed from: a */
        void m35934a() {
            this.f4961a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m35974t;
            RecyclerView.AbstractC1531c0 m36656h0;
            if (!this.f4961a || (m35974t = C1618k.this.m35974t(motionEvent)) == null || (m36656h0 = C1618k.this.f4933r.m36656h0(m35974t)) == null) {
                return;
            }
            C1618k c1618k = C1618k.this;
            if (c1618k.f4930m.m35945p(c1618k.f4933r, m36656h0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = C1618k.this.f4941l;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C1618k c1618k2 = C1618k.this;
                    c1618k2.f4922d = x;
                    c1618k2.f4923e = y;
                    c1618k2.f4927i = 0.0f;
                    c1618k2.f4926h = 0.0f;
                    if (c1618k2.f4930m.m35942s()) {
                        C1618k.this.m35990F(m36656h0, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$h */
    /* loaded from: classes.dex */
    public static class C1628h implements Animator.AnimatorListener {

        /* renamed from: a */
        final float f4963a;

        /* renamed from: b */
        final float f4964b;

        /* renamed from: c */
        final float f4965c;

        /* renamed from: d */
        final float f4966d;

        /* renamed from: e */
        final RecyclerView.AbstractC1531c0 f4967e;

        /* renamed from: f */
        final int f4968f;

        /* renamed from: g */
        private final ValueAnimator f4969g;

        /* renamed from: h */
        boolean f4970h;

        /* renamed from: i */
        float f4971i;

        /* renamed from: j */
        float f4972j;

        /* renamed from: k */
        boolean f4973k = false;

        /* renamed from: l */
        boolean f4974l = false;

        /* renamed from: m */
        private float f4975m;

        /* compiled from: ItemTouchHelper.java */
        /* renamed from: androidx.recyclerview.widget.k$h$a */
        /* loaded from: classes.dex */
        class C1629a implements ValueAnimator.AnimatorUpdateListener {
            C1629a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1628h.this.m35931c(valueAnimator.getAnimatedFraction());
            }
        }

        C1628h(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4968f = i2;
            this.f4967e = abstractC1531c0;
            this.f4963a = f;
            this.f4964b = f2;
            this.f4965c = f3;
            this.f4966d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4969g = ofFloat;
            ofFloat.addUpdateListener(new C1629a());
            ofFloat.setTarget(abstractC1531c0.f4581a);
            ofFloat.addListener(this);
            m35931c(0.0f);
        }

        /* renamed from: a */
        public void m35933a() {
            this.f4969g.cancel();
        }

        /* renamed from: b */
        public void m35932b(long j) {
            this.f4969g.setDuration(j);
        }

        /* renamed from: c */
        public void m35931c(float f) {
            this.f4975m = f;
        }

        /* renamed from: d */
        public void m35930d() {
            this.f4967e.m36583G(false);
            this.f4969g.start();
        }

        /* renamed from: e */
        public void m35929e() {
            float f = this.f4963a;
            float f2 = this.f4965c;
            if (f == f2) {
                this.f4971i = this.f4967e.f4581a.getTranslationX();
            } else {
                this.f4971i = f + (this.f4975m * (f2 - f));
            }
            float f3 = this.f4964b;
            float f4 = this.f4966d;
            if (f3 == f4) {
                this.f4972j = this.f4967e.f4581a.getTranslationY();
            } else {
                this.f4972j = f3 + (this.f4975m * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m35931c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4974l) {
                this.f4967e.m36583G(true);
            }
            this.f4974l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1630i extends AbstractC1624f {
        public AbstractC1630i(int i, int i2) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* renamed from: androidx.recyclerview.widget.k$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1631j {
        /* renamed from: b */
        void mo35928b(View view, View view2, int i, int i2);
    }

    public C1618k(AbstractC1624f abstractC1624f) {
        this.f4930m = abstractC1624f;
    }

    /* renamed from: C */
    private void m35993C() {
        VelocityTracker velocityTracker = this.f4934t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4934t = null;
        }
    }

    /* renamed from: G */
    private void m35989G() {
        this.f4932q = ViewConfiguration.get(this.f4933r.getContext()).getScaledTouchSlop();
        this.f4933r.m36657h(this);
        this.f4933r.m36648k(this.f4948B);
        this.f4933r.m36651j(this);
        m35988H();
    }

    /* renamed from: H */
    private void m35988H() {
        this.f4919A = new C1627g();
        this.f4937z = new C1151e(this.f4933r.getContext(), this.f4919A);
    }

    /* renamed from: I */
    private void m35987I() {
        C1627g c1627g = this.f4919A;
        if (c1627g != null) {
            c1627g.m35934a();
            this.f4919A = null;
        }
        if (this.f4937z != null) {
            this.f4937z = null;
        }
    }

    /* renamed from: J */
    private int m35986J(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        if (this.f4942n == 2) {
            return 0;
        }
        int mo35949l = this.f4930m.mo35949l(this.f4933r, abstractC1531c0);
        int m35957d = (this.f4930m.m35957d(mo35949l, C1112b0.m38476E(this.f4933r)) & 65280) >> 8;
        if (m35957d == 0) {
            return 0;
        }
        int i = (mo35949l & 65280) >> 8;
        if (Math.abs(this.f4926h) > Math.abs(this.f4927i)) {
            int m35980n = m35980n(abstractC1531c0, m35957d);
            if (m35980n > 0) {
                return (i & m35980n) == 0 ? AbstractC1624f.m35956e(m35980n, C1112b0.m38476E(this.f4933r)) : m35980n;
            }
            int m35978p = m35978p(abstractC1531c0, m35957d);
            if (m35978p > 0) {
                return m35978p;
            }
        } else {
            int m35978p2 = m35978p(abstractC1531c0, m35957d);
            if (m35978p2 > 0) {
                return m35978p2;
            }
            int m35980n2 = m35980n(abstractC1531c0, m35957d);
            if (m35980n2 > 0) {
                return (i & m35980n2) == 0 ? AbstractC1624f.m35956e(m35980n2, C1112b0.m38476E(this.f4933r)) : m35980n2;
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m35982l() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.f4945w == null) {
            this.f4945w = new C1623e();
        }
        this.f4933r.setChildDrawingOrderCallback(this.f4945w);
    }

    /* renamed from: n */
    private int m35980n(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        if ((i & 12) != 0) {
            int i2 = this.f4926h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f4934t;
            if (velocityTracker != null && this.f4941l > -1) {
                velocityTracker.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND, this.f4930m.m35946o(this.f4925g));
                float xVelocity = this.f4934t.getXVelocity(this.f4941l);
                float yVelocity = this.f4934t.getYVelocity(this.f4941l);
                int i3 = xVelocity <= 0.0f ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4930m.m35948m(this.f4924f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.f4933r.getWidth() * this.f4930m.m35947n(abstractC1531c0);
            if ((i & i2) == 0 || Math.abs(this.f4926h) <= width) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: p */
    private int m35978p(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        if ((i & 3) != 0) {
            int i2 = this.f4927i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f4934t;
            if (velocityTracker != null && this.f4941l > -1) {
                velocityTracker.computeCurrentVelocity(DateTimeConstants.MILLIS_PER_SECOND, this.f4930m.m35946o(this.f4925g));
                float xVelocity = this.f4934t.getXVelocity(this.f4941l);
                float yVelocity = this.f4934t.getYVelocity(this.f4941l);
                int i3 = yVelocity <= 0.0f ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4930m.m35948m(this.f4924f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.f4933r.getHeight() * this.f4930m.m35947n(abstractC1531c0);
            if ((i & i2) == 0 || Math.abs(this.f4927i) <= height) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: q */
    private void m35977q() {
        this.f4933r.m36678Z0(this);
        this.f4933r.m36673b1(this.f4948B);
        this.f4933r.m36675a1(this);
        for (int size = this.f4943p.size() - 1; size >= 0; size--) {
            this.f4930m.mo35958c(this.f4933r, this.f4943p.get(0).f4967e);
        }
        this.f4943p.clear();
        this.f4946x = null;
        this.f4947y = -1;
        m35993C();
        m35987I();
    }

    /* renamed from: u */
    private List<RecyclerView.AbstractC1531c0> m35973u(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        RecyclerView.AbstractC1531c0 abstractC1531c02 = abstractC1531c0;
        List<RecyclerView.AbstractC1531c0> list = this.f4935u;
        if (list == null) {
            this.f4935u = new ArrayList();
            this.f4936v = new ArrayList();
        } else {
            list.clear();
            this.f4936v.clear();
        }
        int m35953h = this.f4930m.m35953h();
        int round = Math.round(this.f4928j + this.f4926h) - m35953h;
        int round2 = Math.round(this.f4929k + this.f4927i) - m35953h;
        int i = m35953h * 2;
        int width = abstractC1531c02.f4581a.getWidth() + round + i;
        int height = abstractC1531c02.f4581a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.AbstractC1546o layoutManager = this.f4933r.getLayoutManager();
        int m36483K = layoutManager.m36483K();
        int i4 = 0;
        while (i4 < m36483K) {
            View m36484J = layoutManager.m36484J(i4);
            if (m36484J != abstractC1531c02.f4581a && m36484J.getBottom() >= round2 && m36484J.getTop() <= height && m36484J.getRight() >= round && m36484J.getLeft() <= width) {
                RecyclerView.AbstractC1531c0 m36656h0 = this.f4933r.m36656h0(m36484J);
                if (this.f4930m.m35960a(this.f4933r, this.f4940c, m36656h0)) {
                    int abs = Math.abs(i2 - ((m36484J.getLeft() + m36484J.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((m36484J.getTop() + m36484J.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f4935u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f4936v.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f4935u.add(i6, m36656h0);
                    this.f4936v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            abstractC1531c02 = abstractC1531c0;
        }
        return this.f4935u;
    }

    /* renamed from: v */
    private RecyclerView.AbstractC1531c0 m35972v(MotionEvent motionEvent) {
        View m35974t;
        RecyclerView.AbstractC1546o layoutManager = this.f4933r.getLayoutManager();
        int i = this.f4941l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f4922d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f4923e);
        int i2 = this.f4932q;
        if (abs >= i2 || abs2 >= i2) {
            if (abs <= abs2 || !layoutManager.mo36256l()) {
                if ((abs2 <= abs || !layoutManager.mo36253m()) && (m35974t = m35974t(motionEvent)) != null) {
                    return this.f4933r.m36656h0(m35974t);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: w */
    private void m35971w(float[] fArr) {
        if ((this.f4931o & 12) != 0) {
            fArr[0] = (this.f4928j + this.f4926h) - this.f4940c.f4581a.getLeft();
        } else {
            fArr[0] = this.f4940c.f4581a.getTranslationX();
        }
        if ((this.f4931o & 3) != 0) {
            fArr[1] = (this.f4929k + this.f4927i) - this.f4940c.f4581a.getTop();
        } else {
            fArr[1] = this.f4940c.f4581a.getTranslationY();
        }
    }

    /* renamed from: y */
    private static boolean m35969y(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: A */
    void m35995A() {
        VelocityTracker velocityTracker = this.f4934t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4934t = VelocityTracker.obtain();
    }

    /* renamed from: B */
    void m35994B(C1628h c1628h, int i) {
        this.f4933r.post(new RunnableC1622d(c1628h, i));
    }

    /* renamed from: D */
    void m35992D(View view) {
        if (view == this.f4946x) {
            this.f4946x = null;
            if (this.f4945w != null) {
                this.f4933r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m35991E() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1618k.m35991E():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m35990F(androidx.recyclerview.widget.RecyclerView.AbstractC1531c0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1618k.m35990F(androidx.recyclerview.widget.RecyclerView$c0, int):void");
    }

    /* renamed from: K */
    void m35985K(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4922d;
        this.f4926h = f;
        this.f4927i = y - this.f4923e;
        if ((i & 4) == 0) {
            this.f4926h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f4926h = Math.min(0.0f, this.f4926h);
        }
        if ((i & 1) == 0) {
            this.f4927i = Math.max(0.0f, this.f4927i);
        }
        if ((i & 2) == 0) {
            this.f4927i = Math.min(0.0f, this.f4927i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1552q
    /* renamed from: b */
    public void mo35479b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1552q
    /* renamed from: d */
    public void mo35478d(View view) {
        m35992D(view);
        RecyclerView.AbstractC1531c0 m36656h0 = this.f4933r.m36656h0(view);
        if (m36656h0 == null) {
            return;
        }
        RecyclerView.AbstractC1531c0 abstractC1531c0 = this.f4940c;
        if (abstractC1531c0 != null && m36656h0 == abstractC1531c0) {
            m35990F(null, 0);
            return;
        }
        m35976r(m36656h0, false);
        if (this.f4938a.remove(m36656h0.f4581a)) {
            this.f4930m.mo35958c(this.f4933r, m36656h0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1545n
    /* renamed from: g */
    public void mo35984g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1545n
    /* renamed from: i */
    public void mo29915i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        float f;
        float f2;
        this.f4947y = -1;
        if (this.f4940c != null) {
            m35971w(this.f4939b);
            float[] fArr = this.f4939b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4930m.m35937x(canvas, recyclerView, this.f4940c, this.f4943p, this.f4942n, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1545n
    /* renamed from: k */
    public void mo35983k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        float f;
        float f2;
        if (this.f4940c != null) {
            m35971w(this.f4939b);
            float[] fArr = this.f4939b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4930m.m35936y(canvas, recyclerView, this.f4940c, this.f4943p, this.f4942n, f, f2);
    }

    /* renamed from: m */
    public void m35981m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4933r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m35977q();
        }
        this.f4933r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f4924f = resources.getDimension(C13628b.item_touch_helper_swipe_escape_velocity);
            this.f4925g = resources.getDimension(C13628b.item_touch_helper_swipe_escape_max_velocity);
            m35989G();
        }
    }

    /* renamed from: o */
    void m35979o(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC1531c0 m35972v;
        int m35955f;
        if (this.f4940c != null || i != 2 || this.f4942n == 2 || !this.f4930m.mo35943r() || this.f4933r.getScrollState() == 1 || (m35972v = m35972v(motionEvent)) == null || (m35955f = (this.f4930m.m35955f(this.f4933r, m35972v) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f4922d;
        float f2 = y - this.f4923e;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        int i3 = this.f4932q;
        if (abs >= i3 || abs2 >= i3) {
            if (abs > abs2) {
                if (f < 0.0f && (m35955f & 4) == 0) {
                    return;
                }
                if (f > 0.0f && (m35955f & 8) == 0) {
                    return;
                }
            } else if (f2 < 0.0f && (m35955f & 1) == 0) {
                return;
            } else {
                if (f2 > 0.0f && (m35955f & 2) == 0) {
                    return;
                }
            }
            this.f4927i = 0.0f;
            this.f4926h = 0.0f;
            this.f4941l = motionEvent.getPointerId(0);
            m35990F(m35972v, 1);
        }
    }

    /* renamed from: r */
    void m35976r(RecyclerView.AbstractC1531c0 abstractC1531c0, boolean z) {
        for (int size = this.f4943p.size() - 1; size >= 0; size--) {
            C1628h c1628h = this.f4943p.get(size);
            if (c1628h.f4967e == abstractC1531c0) {
                c1628h.f4973k |= z;
                if (!c1628h.f4974l) {
                    c1628h.m35933a();
                }
                this.f4943p.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    C1628h m35975s(MotionEvent motionEvent) {
        if (this.f4943p.isEmpty()) {
            return null;
        }
        View m35974t = m35974t(motionEvent);
        for (int size = this.f4943p.size() - 1; size >= 0; size--) {
            C1628h c1628h = this.f4943p.get(size);
            if (c1628h.f4967e.f4581a == m35974t) {
                return c1628h;
            }
        }
        return null;
    }

    /* renamed from: t */
    View m35974t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC1531c0 abstractC1531c0 = this.f4940c;
        if (abstractC1531c0 != null) {
            View view = abstractC1531c0.f4581a;
            if (m35969y(view, x, y, this.f4928j + this.f4926h, this.f4929k + this.f4927i)) {
                return view;
            }
        }
        for (int size = this.f4943p.size() - 1; size >= 0; size--) {
            C1628h c1628h = this.f4943p.get(size);
            View view2 = c1628h.f4967e.f4581a;
            if (m35969y(view2, x, y, c1628h.f4971i, c1628h.f4972j)) {
                return view2;
            }
        }
        return this.f4933r.m36693S(x, y);
    }

    /* renamed from: x */
    boolean m35970x() {
        int size = this.f4943p.size();
        for (int i = 0; i < size; i++) {
            if (!this.f4943p.get(i).f4974l) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    void m35968z(RecyclerView.AbstractC1531c0 abstractC1531c0) {
        if (!this.f4933r.isLayoutRequested() && this.f4942n == 2) {
            float m35950k = this.f4930m.m35950k(abstractC1531c0);
            int i = (int) (this.f4928j + this.f4926h);
            int i2 = (int) (this.f4929k + this.f4927i);
            if (Math.abs(i2 - abstractC1531c0.f4581a.getTop()) >= abstractC1531c0.f4581a.getHeight() * m35950k || Math.abs(i - abstractC1531c0.f4581a.getLeft()) >= abstractC1531c0.f4581a.getWidth() * m35950k) {
                List<RecyclerView.AbstractC1531c0> m35973u = m35973u(abstractC1531c0);
                if (m35973u.size() == 0) {
                    return;
                }
                RecyclerView.AbstractC1531c0 m35959b = this.f4930m.m35959b(abstractC1531c0, m35973u, i, i2);
                if (m35959b == null) {
                    this.f4935u.clear();
                    this.f4936v.clear();
                    return;
                }
                int m36568j = m35959b.m36568j();
                int m36568j2 = abstractC1531c0.m36568j();
                if (this.f4930m.mo35935z(this.f4933r, abstractC1531c0, m35959b)) {
                    this.f4930m.m35963A(this.f4933r, abstractC1531c0, m36568j2, m35959b, m36568j, i, i2);
                }
            }
        }
    }
}
