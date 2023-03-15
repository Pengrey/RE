package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.p020os.C1020i;
import androidx.core.util.C1076h;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1148d0;
import androidx.core.view.C1198n;
import androidx.core.view.C1206p;
import androidx.core.view.InterfaceC1205o;
import androidx.core.view.accessibility.C1083b;
import androidx.core.view.accessibility.C1085c;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1571a;
import androidx.recyclerview.widget.C1574a0;
import androidx.recyclerview.widget.C1587f;
import androidx.recyclerview.widget.C1647v;
import androidx.recyclerview.widget.C1654z;
import androidx.recyclerview.widget.RunnableC1614j;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p480z2.C13627a;
import p480z2.C13628b;
import p480z2.C13630d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC1205o {

    /* renamed from: U0 */
    private static final int[] f4488U0 = {16843830};

    /* renamed from: V0 */
    static final boolean f4489V0;

    /* renamed from: W0 */
    static final boolean f4490W0;

    /* renamed from: X0 */
    static final boolean f4491X0;

    /* renamed from: Y0 */
    static final boolean f4492Y0;

    /* renamed from: Z0 */
    private static final boolean f4493Z0;

    /* renamed from: a1 */
    private static final boolean f4494a1;

    /* renamed from: b1 */
    private static final Class<?>[] f4495b1;

    /* renamed from: c1 */
    static final Interpolator f4496c1;

    /* renamed from: A */
    C1587f f4497A;

    /* renamed from: A0 */
    final RunnableC1529b0 f4498A0;

    /* renamed from: B */
    final C1574a0 f4499B;

    /* renamed from: B0 */
    RunnableC1614j f4500B0;

    /* renamed from: C */
    boolean f4501C;

    /* renamed from: C0 */
    RunnableC1614j.C1616b f4502C0;

    /* renamed from: D */
    final Runnable f4503D;

    /* renamed from: D0 */
    final C1564z f4504D0;

    /* renamed from: E */
    final Rect f4505E;

    /* renamed from: E0 */
    private AbstractC1555t f4506E0;

    /* renamed from: F */
    private final Rect f4507F;

    /* renamed from: F0 */
    private List<AbstractC1555t> f4508F0;

    /* renamed from: G */
    final RectF f4509G;

    /* renamed from: G0 */
    boolean f4510G0;

    /* renamed from: H */
    AbstractC1535g f4511H;

    /* renamed from: H0 */
    boolean f4512H0;

    /* renamed from: I */
    AbstractC1546o f4513I;

    /* renamed from: I0 */
    private AbstractC1540l.InterfaceC1542b f4514I0;

    /* renamed from: J */
    InterfaceC1559w f4515J;

    /* renamed from: J0 */
    boolean f4516J0;

    /* renamed from: K */
    final ArrayList<AbstractC1545n> f4517K;

    /* renamed from: K0 */
    C1647v f4518K0;

    /* renamed from: L */
    private final ArrayList<InterfaceC1554s> f4519L;

    /* renamed from: L0 */
    private InterfaceC1538j f4520L0;

    /* renamed from: M */
    private InterfaceC1554s f4521M;

    /* renamed from: M0 */
    private final int[] f4522M0;

    /* renamed from: N */
    boolean f4523N;

    /* renamed from: N0 */
    private C1206p f4524N0;

    /* renamed from: O */
    boolean f4525O;

    /* renamed from: O0 */
    private final int[] f4526O0;

    /* renamed from: P */
    boolean f4527P;

    /* renamed from: P0 */
    private final int[] f4528P0;

    /* renamed from: Q */
    boolean f4529Q;

    /* renamed from: Q0 */
    final int[] f4530Q0;

    /* renamed from: R */
    private int f4531R;

    /* renamed from: R0 */
    final List<AbstractC1531c0> f4532R0;

    /* renamed from: S */
    boolean f4533S;

    /* renamed from: S0 */
    private Runnable f4534S0;

    /* renamed from: T */
    boolean f4535T;

    /* renamed from: T0 */
    private final C1574a0.InterfaceC1576b f4536T0;

    /* renamed from: U */
    private boolean f4537U;

    /* renamed from: V */
    private int f4538V;

    /* renamed from: W */
    boolean f4539W;

    /* renamed from: a0 */
    private final AccessibilityManager f4540a0;

    /* renamed from: b0 */
    private List<InterfaceC1552q> f4541b0;

    /* renamed from: c0 */
    boolean f4542c0;

    /* renamed from: d0 */
    boolean f4543d0;

    /* renamed from: e0 */
    private int f4544e0;

    /* renamed from: f0 */
    private int f4545f0;

    /* renamed from: g0 */
    private C1539k f4546g0;

    /* renamed from: h0 */
    private EdgeEffect f4547h0;

    /* renamed from: i0 */
    private EdgeEffect f4548i0;

    /* renamed from: j0 */
    private EdgeEffect f4549j0;

    /* renamed from: k0 */
    private EdgeEffect f4550k0;

    /* renamed from: l0 */
    AbstractC1540l f4551l0;

    /* renamed from: m0 */
    private int f4552m0;

    /* renamed from: n0 */
    private int f4553n0;

    /* renamed from: o0 */
    private VelocityTracker f4554o0;

    /* renamed from: p0 */
    private int f4555p0;

    /* renamed from: q0 */
    private int f4556q0;

    /* renamed from: r0 */
    private int f4557r0;

    /* renamed from: s0 */
    private int f4558s0;

    /* renamed from: t0 */
    private int f4559t0;

    /* renamed from: u0 */
    private AbstractC1553r f4560u0;

    /* renamed from: v0 */
    private final int f4561v0;

    /* renamed from: w */
    private final C1560x f4562w;

    /* renamed from: w0 */
    private final int f4563w0;

    /* renamed from: x */
    final C1558v f4564x;

    /* renamed from: x0 */
    private float f4565x0;

    /* renamed from: y */
    private SavedState f4566y;

    /* renamed from: y0 */
    private float f4567y0;

    /* renamed from: z */
    C1571a f4568z;

    /* renamed from: z0 */
    private boolean f4569z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    class RunnableC1526a implements Runnable {
        RunnableC1526a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4529Q || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4523N) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4535T) {
                recyclerView2.f4533S = true;
            } else {
                recyclerView2.m36615v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1527a0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    class RunnableC1528b implements Runnable {
        RunnableC1528b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1540l abstractC1540l = RecyclerView.this.f4551l0;
            if (abstractC1540l != null) {
                abstractC1540l.mo36055v();
            }
            RecyclerView.this.f4516J0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public class RunnableC1529b0 implements Runnable {

        /* renamed from: A */
        private boolean f4573A;

        /* renamed from: B */
        private boolean f4574B;

        /* renamed from: w */
        private int f4576w;

        /* renamed from: x */
        private int f4577x;

        /* renamed from: y */
        OverScroller f4578y;

        /* renamed from: z */
        Interpolator f4579z;

        RunnableC1529b0() {
            Interpolator interpolator = RecyclerView.f4496c1;
            this.f4579z = interpolator;
            this.f4573A = false;
            this.f4574B = false;
            this.f4578y = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m36596a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float m36595b = f2 + (m36595b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(m36595b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        /* renamed from: b */
        private float m36595b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        private void m36593d() {
            RecyclerView.this.removeCallbacks(this);
            C1112b0.m38421k0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void m36594c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f4577x = 0;
            this.f4576w = 0;
            Interpolator interpolator = this.f4579z;
            Interpolator interpolator2 = RecyclerView.f4496c1;
            if (interpolator != interpolator2) {
                this.f4579z = interpolator2;
                this.f4578y = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4578y.fling(0, 0, i, i2, Integer.MIN_VALUE, Reader.READ_DONE, Integer.MIN_VALUE, Reader.READ_DONE);
            m36592e();
        }

        /* renamed from: e */
        void m36592e() {
            if (this.f4573A) {
                this.f4574B = true;
            } else {
                m36593d();
            }
        }

        /* renamed from: f */
        public void m36591f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m36596a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f4496c1;
            }
            if (this.f4579z != interpolator) {
                this.f4579z = interpolator;
                this.f4578y = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4577x = 0;
            this.f4576w = 0;
            RecyclerView.this.setScrollState(2);
            this.f4578y.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4578y.computeScrollOffset();
            }
            m36592e();
        }

        /* renamed from: g */
        public void m36590g() {
            RecyclerView.this.removeCallbacks(this);
            this.f4578y.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4513I == null) {
                m36590g();
                return;
            }
            this.f4574B = false;
            this.f4573A = true;
            recyclerView.m36615v();
            OverScroller overScroller = this.f4578y;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f4576w;
                int i4 = currY - this.f4577x;
                this.f4576w = currX;
                this.f4577x = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4530Q0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m36717G(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4530Q0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m36618u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4511H != null) {
                    int[] iArr3 = recyclerView3.f4530Q0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m36646k1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4530Q0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC1561y abstractC1561y = recyclerView4.f4513I.f4619g;
                    if (abstractC1561y != null && !abstractC1561y.m36343g() && abstractC1561y.m36342h()) {
                        int m36329b = RecyclerView.this.f4504D0.m36329b();
                        if (m36329b == 0) {
                            abstractC1561y.m36336r();
                        } else if (abstractC1561y.m36344f() >= m36329b) {
                            abstractC1561y.m36338p(m36329b - 1);
                            abstractC1561y.m36340j(i2, i);
                        } else {
                            abstractC1561y.m36340j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f4517K.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4530Q0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m36715H(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4530Q0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m36711J(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC1561y abstractC1561y2 = RecyclerView.this.f4513I.f4619g;
                if (!(abstractC1561y2 != null && abstractC1561y2.m36343g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m36677a(i7, currVelocity);
                    }
                    if (RecyclerView.f4492Y0) {
                        RecyclerView.this.f4502C0.m36000b();
                    }
                } else {
                    m36592e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC1614j runnableC1614j = recyclerView7.f4500B0;
                    if (runnableC1614j != null) {
                        runnableC1614j.m36007f(recyclerView7, i2, i);
                    }
                }
            }
            AbstractC1561y abstractC1561y3 = RecyclerView.this.f4513I.f4619g;
            if (abstractC1561y3 != null && abstractC1561y3.m36343g()) {
                abstractC1561y3.m36340j(0, 0);
            }
            this.f4573A = false;
            if (this.f4574B) {
                m36593d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.m36607x1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC1530c implements Interpolator {
        animationInterpolatorC1530c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1531c0 {

        /* renamed from: s */
        private static final List<Object> f4580s = Collections.emptyList();

        /* renamed from: a */
        public final View f4581a;

        /* renamed from: b */
        WeakReference<RecyclerView> f4582b;

        /* renamed from: j */
        int f4583j;

        /* renamed from: r */
        RecyclerView f4584r;

        /* renamed from: c */
        int f4585c = -1;

        /* renamed from: d */
        int f4586d = -1;

        /* renamed from: e */
        long f4587e = -1;

        /* renamed from: f */
        int f4588f = -1;

        /* renamed from: g */
        int f4589g = -1;

        /* renamed from: h */
        AbstractC1531c0 f4590h = null;

        /* renamed from: i */
        AbstractC1531c0 f4591i = null;

        /* renamed from: k */
        List<Object> f4592k = null;

        /* renamed from: l */
        List<Object> f4593l = null;

        /* renamed from: m */
        private int f4594m = 0;

        /* renamed from: n */
        C1558v f4595n = null;

        /* renamed from: o */
        boolean f4596o = false;

        /* renamed from: p */
        private int f4597p = 0;

        /* renamed from: q */
        int f4598q = -1;

        public AbstractC1531c0(View view) {
            if (view != null) {
                this.f4581a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: g */
        private void m36571g() {
            if (this.f4592k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4592k = arrayList;
                this.f4593l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: A */
        void m36589A(int i, boolean z) {
            if (this.f4586d == -1) {
                this.f4586d = this.f4585c;
            }
            if (this.f4589g == -1) {
                this.f4589g = this.f4585c;
            }
            if (z) {
                this.f4589g += i;
            }
            this.f4585c += i;
            if (this.f4581a.getLayoutParams() != null) {
                ((C1551p) this.f4581a.getLayoutParams()).f4639c = true;
            }
        }

        /* renamed from: B */
        void m36588B(RecyclerView recyclerView) {
            int i = this.f4598q;
            if (i != -1) {
                this.f4597p = i;
            } else {
                this.f4597p = C1112b0.m38480C(this.f4581a);
            }
            recyclerView.m36637n1(this, 4);
        }

        /* renamed from: C */
        void m36587C(RecyclerView recyclerView) {
            recyclerView.m36637n1(this, this.f4597p);
            this.f4597p = 0;
        }

        /* renamed from: D */
        void m36586D() {
            this.f4583j = 0;
            this.f4585c = -1;
            this.f4586d = -1;
            this.f4587e = -1L;
            this.f4589g = -1;
            this.f4594m = 0;
            this.f4590h = null;
            this.f4591i = null;
            m36574d();
            this.f4597p = 0;
            this.f4598q = -1;
            RecyclerView.m36624s(this);
        }

        /* renamed from: E */
        void m36585E() {
            if (this.f4586d == -1) {
                this.f4586d = this.f4585c;
            }
        }

        /* renamed from: F */
        void m36584F(int i, int i2) {
            this.f4583j = (i & i2) | (this.f4583j & (~i2));
        }

        /* renamed from: G */
        public final void m36583G(boolean z) {
            int i = this.f4594m;
            int i2 = z ? i - 1 : i + 1;
            this.f4594m = i2;
            if (i2 < 0) {
                this.f4594m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.f4583j |= 16;
            } else if (z && i2 == 0) {
                this.f4583j &= -17;
            }
        }

        /* renamed from: H */
        void m36582H(C1558v c1558v, boolean z) {
            this.f4595n = c1558v;
            this.f4596o = z;
        }

        /* renamed from: I */
        boolean m36581I() {
            return (this.f4583j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean m36580J() {
            return (this.f4583j & 128) != 0;
        }

        /* renamed from: K */
        void m36579K() {
            this.f4595n.m36381J(this);
        }

        /* renamed from: L */
        boolean m36578L() {
            return (this.f4583j & 32) != 0;
        }

        /* renamed from: a */
        void m36577a(Object obj) {
            if (obj == null) {
                m36576b(1024);
            } else if ((1024 & this.f4583j) == 0) {
                m36571g();
                this.f4592k.add(obj);
            }
        }

        /* renamed from: b */
        void m36576b(int i) {
            this.f4583j = i | this.f4583j;
        }

        /* renamed from: c */
        void m36575c() {
            this.f4586d = -1;
            this.f4589g = -1;
        }

        /* renamed from: d */
        void m36574d() {
            List<Object> list = this.f4592k;
            if (list != null) {
                list.clear();
            }
            this.f4583j &= -1025;
        }

        /* renamed from: e */
        void m36573e() {
            this.f4583j &= -33;
        }

        /* renamed from: f */
        void m36572f() {
            this.f4583j &= -257;
        }

        /* renamed from: h */
        boolean m36570h() {
            return (this.f4583j & 16) == 0 && C1112b0.m38449T(this.f4581a);
        }

        /* renamed from: i */
        void m36569i(int i, int i2, boolean z) {
            m36576b(8);
            m36589A(i2, z);
            this.f4585c = i;
        }

        /* renamed from: j */
        public final int m36568j() {
            RecyclerView recyclerView = this.f4584r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m36668d0(this);
        }

        /* renamed from: k */
        public final long m36567k() {
            return this.f4587e;
        }

        /* renamed from: l */
        public final int m36566l() {
            return this.f4588f;
        }

        /* renamed from: m */
        public final int m36565m() {
            int i = this.f4589g;
            return i == -1 ? this.f4585c : i;
        }

        /* renamed from: n */
        public final int m36564n() {
            return this.f4586d;
        }

        /* renamed from: o */
        List<Object> m36563o() {
            if ((this.f4583j & 1024) == 0) {
                List<Object> list = this.f4592k;
                if (list != null && list.size() != 0) {
                    return this.f4593l;
                }
                return f4580s;
            }
            return f4580s;
        }

        /* renamed from: p */
        boolean m36562p(int i) {
            return (i & this.f4583j) != 0;
        }

        /* renamed from: q */
        boolean m36561q() {
            return (this.f4583j & 512) != 0 || m36558t();
        }

        /* renamed from: r */
        boolean m36560r() {
            return (this.f4581a.getParent() == null || this.f4581a.getParent() == this.f4584r) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean m36559s() {
            return (this.f4583j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t */
        public boolean m36558t() {
            return (this.f4583j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4585c + " id=" + this.f4587e + ", oldPos=" + this.f4586d + ", pLpos:" + this.f4589g);
            if (m36555w()) {
                sb2.append(" scrap ");
                sb2.append(this.f4596o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m36558t()) {
                sb2.append(" invalid");
            }
            if (!m36559s()) {
                sb2.append(" unbound");
            }
            if (m36552z()) {
                sb2.append(" update");
            }
            if (m36556v()) {
                sb2.append(" removed");
            }
            if (m36580J()) {
                sb2.append(" ignored");
            }
            if (m36554x()) {
                sb2.append(" tmpDetached");
            }
            if (!m36557u()) {
                sb2.append(" not recyclable(" + this.f4594m + ")");
            }
            if (m36561q()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f4581a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* renamed from: u */
        public final boolean m36557u() {
            return (this.f4583j & 16) == 0 && !C1112b0.m38449T(this.f4581a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v */
        public boolean m36556v() {
            return (this.f4583j & 8) != 0;
        }

        /* renamed from: w */
        boolean m36555w() {
            return this.f4595n != null;
        }

        /* renamed from: x */
        boolean m36554x() {
            return (this.f4583j & 256) != 0;
        }

        /* renamed from: y */
        boolean m36553y() {
            return (this.f4583j & 2) != 0;
        }

        /* renamed from: z */
        boolean m36552z() {
            return (this.f4583j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    class C1532d implements C1574a0.InterfaceC1576b {
        C1532d() {
        }

        @Override // androidx.recyclerview.widget.C1574a0.InterfaceC1576b
        /* renamed from: a */
        public void mo36123a(AbstractC1531c0 abstractC1531c0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4513I.m36431n1(abstractC1531c0.f4581a, recyclerView.f4564x);
        }

        @Override // androidx.recyclerview.widget.C1574a0.InterfaceC1576b
        /* renamed from: b */
        public void mo36122b(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2) {
            RecyclerView.this.m36642m(abstractC1531c0, c1543c, c1543c2);
        }

        @Override // androidx.recyclerview.widget.C1574a0.InterfaceC1576b
        /* renamed from: c */
        public void mo36121c(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2) {
            RecyclerView.this.f4564x.m36381J(abstractC1531c0);
            RecyclerView.this.m36636o(abstractC1531c0, c1543c, c1543c2);
        }

        @Override // androidx.recyclerview.widget.C1574a0.InterfaceC1576b
        /* renamed from: d */
        public void mo36120d(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2) {
            abstractC1531c0.m36583G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4542c0) {
                if (recyclerView.f4551l0.mo35829b(abstractC1531c0, abstractC1531c0, c1543c, c1543c2)) {
                    RecyclerView.this.m36698P0();
                }
            } else if (recyclerView.f4551l0.mo35827d(abstractC1531c0, c1543c, c1543c2)) {
                RecyclerView.this.m36698P0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C1533e implements C1587f.InterfaceC1589b {
        C1533e() {
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: a */
        public View mo36080a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: b */
        public void mo36079b(View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0 != null) {
                m36653i0.m36588B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: c */
        public AbstractC1531c0 mo36078c(View view) {
            return RecyclerView.m36653i0(view);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: d */
        public void mo36077d(int i) {
            AbstractC1531c0 m36653i0;
            View mo36080a = mo36080a(i);
            if (mo36080a != null && (m36653i0 = RecyclerView.m36653i0(mo36080a)) != null) {
                if (m36653i0.m36554x() && !m36653i0.m36580J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m36653i0 + RecyclerView.this.m36697Q());
                }
                m36653i0.m36576b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: e */
        public void mo36076e(View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0 != null) {
                m36653i0.m36587C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: f */
        public void mo36075f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m36603z(view);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: g */
        public int mo36074g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: h */
        public void mo36073h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m36730A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: i */
        public void mo36072i() {
            int mo36074g = mo36074g();
            for (int i = 0; i < mo36074g; i++) {
                View mo36080a = mo36080a(i);
                RecyclerView.this.m36730A(mo36080a);
                mo36080a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: j */
        public void mo36071j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0 != null) {
                if (!m36653i0.m36554x() && !m36653i0.m36580J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m36653i0 + RecyclerView.this.m36697Q());
                }
                m36653i0.m36572f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.C1587f.InterfaceC1589b
        /* renamed from: k */
        public int mo36070k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C1534f implements C1571a.InterfaceC1572a {
        C1534f() {
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: a */
        public void mo36152a(int i, int i2) {
            RecyclerView.this.m36718F0(i, i2);
            RecyclerView.this.f4510G0 = true;
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: b */
        public void mo36151b(C1571a.C1573b c1573b) {
            m36551i(c1573b);
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: c */
        public AbstractC1531c0 mo36150c(int i) {
            AbstractC1531c0 m36674b0 = RecyclerView.this.m36674b0(i, true);
            if (m36674b0 == null || RecyclerView.this.f4497A.m36095n(m36674b0.f4581a)) {
                return null;
            }
            return m36674b0;
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: d */
        public void mo36149d(int i, int i2) {
            RecyclerView.this.m36716G0(i, i2, false);
            RecyclerView.this.f4510G0 = true;
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: e */
        public void mo36148e(int i, int i2) {
            RecyclerView.this.m36720E0(i, i2);
            RecyclerView.this.f4510G0 = true;
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: f */
        public void mo36147f(int i, int i2) {
            RecyclerView.this.m36716G0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4510G0 = true;
            recyclerView.f4504D0.f4678d += i2;
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: g */
        public void mo36146g(C1571a.C1573b c1573b) {
            m36551i(c1573b);
        }

        @Override // androidx.recyclerview.widget.C1571a.InterfaceC1572a
        /* renamed from: h */
        public void mo36145h(int i, int i2, Object obj) {
            RecyclerView.this.m36728A1(i, i2, obj);
            RecyclerView.this.f4512H0 = true;
        }

        /* renamed from: i */
        void m36551i(C1571a.C1573b c1573b) {
            int i = c1573b.f4751a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4513I.mo36288S0(recyclerView, c1573b.f4752b, c1573b.f4754d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4513I.mo36281V0(recyclerView2, c1573b.f4752b, c1573b.f4754d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4513I.mo36278X0(recyclerView3, c1573b.f4752b, c1573b.f4754d, c1573b.f4753c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4513I.mo36283U0(recyclerView4, c1573b.f4752b, c1573b.f4754d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1535g<VH extends AbstractC1531c0> {

        /* renamed from: a */
        private final C1536h f4602a = new C1536h();

        /* renamed from: b */
        private boolean f4603b = false;

        /* renamed from: A */
        public void m36550A(AbstractC1537i abstractC1537i) {
            this.f4602a.registerObserver(abstractC1537i);
        }

        /* renamed from: B */
        public void m36549B(boolean z) {
            if (!m36544i()) {
                this.f4603b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: C */
        public void m36548C(AbstractC1537i abstractC1537i) {
            this.f4602a.unregisterObserver(abstractC1537i);
        }

        /* renamed from: d */
        public final void m36547d(VH vh, int i) {
            vh.f4585c = i;
            if (m36543j()) {
                vh.f4587e = mo29862g(i);
            }
            vh.m36584F(1, 519);
            C1020i.m38740a("RV OnBindView");
            mo36535t(vh, i, vh.m36563o());
            vh.m36574d();
            ViewGroup.LayoutParams layoutParams = vh.f4581a.getLayoutParams();
            if (layoutParams instanceof C1551p) {
                ((C1551p) layoutParams).f4639c = true;
            }
            C1020i.m38739b();
        }

        /* renamed from: e */
        public final VH m36546e(ViewGroup viewGroup, int i) {
            try {
                C1020i.m38740a("RV CreateView");
                VH mo42215u = mo42215u(viewGroup, i);
                if (mo42215u.f4581a.getParent() == null) {
                    mo42215u.f4588f = i;
                    return mo42215u;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1020i.m38739b();
            }
        }

        /* renamed from: f */
        public abstract int mo29834f();

        /* renamed from: g */
        public long mo29862g(int i) {
            return -1L;
        }

        /* renamed from: h */
        public int mo36545h(int i) {
            return 0;
        }

        /* renamed from: i */
        public final boolean m36544i() {
            return this.f4602a.m36533a();
        }

        /* renamed from: j */
        public final boolean m36543j() {
            return this.f4603b;
        }

        /* renamed from: k */
        public final void m36542k() {
            this.f4602a.m36532b();
        }

        /* renamed from: l */
        public final void m36541l(int i) {
            this.f4602a.m36530d(i, 1);
        }

        /* renamed from: m */
        public final void m36540m(int i, Object obj) {
            this.f4602a.m36529e(i, 1, obj);
        }

        /* renamed from: n */
        public final void m36539n(int i, int i2) {
            this.f4602a.m36531c(i, i2);
        }

        /* renamed from: o */
        public final void m36538o(int i, int i2, Object obj) {
            this.f4602a.m36529e(i, i2, obj);
        }

        /* renamed from: p */
        public final void m36537p(int i, int i2) {
            this.f4602a.m36528f(i, i2);
        }

        /* renamed from: q */
        public final void m36536q(int i, int i2) {
            this.f4602a.m36527g(i, i2);
        }

        /* renamed from: r */
        public void mo35512r(RecyclerView recyclerView) {
        }

        /* renamed from: s */
        public abstract void mo35523M(VH vh, int i);

        /* renamed from: t */
        public void mo36535t(VH vh, int i, List<Object> list) {
            mo35523M(vh, i);
        }

        /* renamed from: u */
        public abstract VH mo42215u(ViewGroup viewGroup, int i);

        /* renamed from: v */
        public void mo35511v(RecyclerView recyclerView) {
        }

        /* renamed from: w */
        public boolean mo35521O(VH vh) {
            return false;
        }

        /* renamed from: x */
        public void mo35520P(VH vh) {
        }

        /* renamed from: y */
        public void m36534y(VH vh) {
        }

        /* renamed from: z */
        public void mo35519Q(VH vh) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static class C1536h extends Observable<AbstractC1537i> {
        C1536h() {
        }

        /* renamed from: a */
        public boolean m36533a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m36532b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1537i) ((Observable) this).mObservers.get(size)).mo29102a();
            }
        }

        /* renamed from: c */
        public void m36531c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1537i) ((Observable) this).mObservers.get(size)).mo29098e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m36530d(int i, int i2) {
            m36529e(i, i2, null);
        }

        /* renamed from: e */
        public void m36529e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1537i) ((Observable) this).mObservers.get(size)).mo29100c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m36528f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1537i) ((Observable) this).mObservers.get(size)).mo29099d(i, i2);
            }
        }

        /* renamed from: g */
        public void m36527g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1537i) ((Observable) this).mObservers.get(size)).mo29097f(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1537i {
        /* renamed from: a */
        public void mo29102a() {
        }

        /* renamed from: b */
        public void mo29101b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo29100c(int i, int i2, Object obj) {
            mo29101b(i, i2);
        }

        /* renamed from: d */
        public void mo29099d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo29098e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo29097f(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1538j {
        /* renamed from: a */
        int mo35964a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C1539k {
        /* renamed from: a */
        protected EdgeEffect m36526a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1540l {

        /* renamed from: a */
        private InterfaceC1542b f4604a = null;

        /* renamed from: b */
        private ArrayList<InterfaceC1541a> f4605b = new ArrayList<>();

        /* renamed from: c */
        private long f4606c = 120;

        /* renamed from: d */
        private long f4607d = 120;

        /* renamed from: e */
        private long f4608e = 250;

        /* renamed from: f */
        private long f4609f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        /* loaded from: classes.dex */
        public interface InterfaceC1541a {
            /* renamed from: a */
            void m36512a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1542b {
            /* renamed from: a */
            void mo36509a(AbstractC1531c0 abstractC1531c0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        /* loaded from: classes.dex */
        public static class C1543c {

            /* renamed from: a */
            public int f4610a;

            /* renamed from: b */
            public int f4611b;

            /* renamed from: a */
            public C1543c m36511a(AbstractC1531c0 abstractC1531c0) {
                return m36510b(abstractC1531c0, 0);
            }

            /* renamed from: b */
            public C1543c m36510b(AbstractC1531c0 abstractC1531c0, int i) {
                View view = abstractC1531c0.f4581a;
                this.f4610a = view.getLeft();
                this.f4611b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m36525e(AbstractC1531c0 abstractC1531c0) {
            int i = abstractC1531c0.f4583j & 14;
            if (abstractC1531c0.m36558t()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int m36564n = abstractC1531c0.m36564n();
                int m36568j = abstractC1531c0.m36568j();
                return (m36564n == -1 || m36568j == -1 || m36564n == m36568j) ? i : i | 2048;
            }
            return i;
        }

        /* renamed from: a */
        public abstract boolean mo35830a(AbstractC1531c0 abstractC1531c0, C1543c c1543c, C1543c c1543c2);

        /* renamed from: b */
        public abstract boolean mo35829b(AbstractC1531c0 abstractC1531c0, AbstractC1531c0 abstractC1531c02, C1543c c1543c, C1543c c1543c2);

        /* renamed from: c */
        public abstract boolean mo35828c(AbstractC1531c0 abstractC1531c0, C1543c c1543c, C1543c c1543c2);

        /* renamed from: d */
        public abstract boolean mo35827d(AbstractC1531c0 abstractC1531c0, C1543c c1543c, C1543c c1543c2);

        /* renamed from: f */
        public abstract boolean mo35826f(AbstractC1531c0 abstractC1531c0);

        /* renamed from: g */
        public boolean mo36059g(AbstractC1531c0 abstractC1531c0, List<Object> list) {
            return mo35826f(abstractC1531c0);
        }

        /* renamed from: h */
        public final void m36524h(AbstractC1531c0 abstractC1531c0) {
            m36516s(abstractC1531c0);
            InterfaceC1542b interfaceC1542b = this.f4604a;
            if (interfaceC1542b != null) {
                interfaceC1542b.mo36509a(abstractC1531c0);
            }
        }

        /* renamed from: i */
        public final void m36523i() {
            int size = this.f4605b.size();
            for (int i = 0; i < size; i++) {
                this.f4605b.get(i).m36512a();
            }
            this.f4605b.clear();
        }

        /* renamed from: j */
        public abstract void mo36058j(AbstractC1531c0 abstractC1531c0);

        /* renamed from: k */
        public abstract void mo36057k();

        /* renamed from: l */
        public long m36522l() {
            return this.f4606c;
        }

        /* renamed from: m */
        public long m36521m() {
            return this.f4609f;
        }

        /* renamed from: n */
        public long m36520n() {
            return this.f4608e;
        }

        /* renamed from: o */
        public long m36519o() {
            return this.f4607d;
        }

        /* renamed from: p */
        public abstract boolean mo36056p();

        /* renamed from: q */
        public final boolean m36518q(InterfaceC1541a interfaceC1541a) {
            boolean mo36056p = mo36056p();
            if (interfaceC1541a != null) {
                if (!mo36056p) {
                    interfaceC1541a.m36512a();
                } else {
                    this.f4605b.add(interfaceC1541a);
                }
            }
            return mo36056p;
        }

        /* renamed from: r */
        public C1543c m36517r() {
            return new C1543c();
        }

        /* renamed from: s */
        public void m36516s(AbstractC1531c0 abstractC1531c0) {
        }

        /* renamed from: t */
        public C1543c m36515t(C1564z c1564z, AbstractC1531c0 abstractC1531c0) {
            return m36517r().m36511a(abstractC1531c0);
        }

        /* renamed from: u */
        public C1543c m36514u(C1564z c1564z, AbstractC1531c0 abstractC1531c0, int i, List<Object> list) {
            return m36517r().m36511a(abstractC1531c0);
        }

        /* renamed from: v */
        public abstract void mo36055v();

        /* renamed from: w */
        void m36513w(InterfaceC1542b interfaceC1542b) {
            this.f4604a = interfaceC1542b;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    private class C1544m implements AbstractC1540l.InterfaceC1542b {
        C1544m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1540l.InterfaceC1542b
        /* renamed from: a */
        public void mo36509a(AbstractC1531c0 abstractC1531c0) {
            abstractC1531c0.m36583G(true);
            if (abstractC1531c0.f4590h != null && abstractC1531c0.f4591i == null) {
                abstractC1531c0.f4590h = null;
            }
            abstractC1531c0.f4591i = null;
            if (abstractC1531c0.m36581I() || RecyclerView.this.m36680Y0(abstractC1531c0.f4581a) || !abstractC1531c0.m36554x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC1531c0.f4581a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1545n {
        @Deprecated
        /* renamed from: f */
        public void m36508f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo35984g(Rect rect, View view, RecyclerView recyclerView, C1564z c1564z) {
            m36508f(rect, ((C1551p) view.getLayoutParams()).m36406a(), recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void m36507h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo29915i(Canvas canvas, RecyclerView recyclerView, C1564z c1564z) {
            m36507h(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: j */
        public void m36506j(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo35983k(Canvas canvas, RecyclerView recyclerView, C1564z c1564z) {
            m36506j(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1546o {

        /* renamed from: a */
        C1587f f4613a;

        /* renamed from: b */
        RecyclerView f4614b;

        /* renamed from: c */
        private final C1654z.InterfaceC1656b f4615c;

        /* renamed from: d */
        private final C1654z.InterfaceC1656b f4616d;

        /* renamed from: e */
        C1654z f4617e;

        /* renamed from: f */
        C1654z f4618f;

        /* renamed from: g */
        AbstractC1561y f4619g;

        /* renamed from: h */
        boolean f4620h;

        /* renamed from: i */
        boolean f4621i;

        /* renamed from: j */
        boolean f4622j;

        /* renamed from: k */
        private boolean f4623k;

        /* renamed from: l */
        private boolean f4624l;

        /* renamed from: m */
        int f4625m;

        /* renamed from: n */
        boolean f4626n;

        /* renamed from: o */
        private int f4627o;

        /* renamed from: p */
        private int f4628p;

        /* renamed from: q */
        private int f4629q;

        /* renamed from: r */
        private int f4630r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        /* loaded from: classes.dex */
        class C1547a implements C1654z.InterfaceC1656b {
            C1547a() {
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: a */
            public View mo35803a(int i) {
                return AbstractC1546o.this.m36484J(i);
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: b */
            public int mo35802b() {
                return AbstractC1546o.this.m36427p0() - AbstractC1546o.this.m36447g0();
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: c */
            public int mo35801c(View view) {
                return AbstractC1546o.this.m36472R(view) - ((ViewGroup.MarginLayoutParams) ((C1551p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: d */
            public int mo35800d() {
                return AbstractC1546o.this.m36449f0();
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: e */
            public int mo35799e(View view) {
                return AbstractC1546o.this.m36468U(view) + ((ViewGroup.MarginLayoutParams) ((C1551p) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        /* loaded from: classes.dex */
        class C1548b implements C1654z.InterfaceC1656b {
            C1548b() {
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: a */
            public View mo35803a(int i) {
                return AbstractC1546o.this.m36484J(i);
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: b */
            public int mo35802b() {
                return AbstractC1546o.this.m36464X() - AbstractC1546o.this.m36451e0();
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: c */
            public int mo35801c(View view) {
                return AbstractC1546o.this.m36467V(view) - ((ViewGroup.MarginLayoutParams) ((C1551p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: d */
            public int mo35800d() {
                return AbstractC1546o.this.m36445h0();
            }

            @Override // androidx.recyclerview.widget.C1654z.InterfaceC1656b
            /* renamed from: e */
            public int mo35799e(View view) {
                return AbstractC1546o.this.m36475P(view) + ((ViewGroup.MarginLayoutParams) ((C1551p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        /* loaded from: classes.dex */
        public interface InterfaceC1549c {
            /* renamed from: a */
            void mo36001a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        /* loaded from: classes.dex */
        public static class C1550d {

            /* renamed from: a */
            public int f4633a;

            /* renamed from: b */
            public int f4634b;

            /* renamed from: c */
            public boolean f4635c;

            /* renamed from: d */
            public boolean f4636d;
        }

        public AbstractC1546o() {
            C1547a c1547a = new C1547a();
            this.f4615c = c1547a;
            C1548b c1548b = new C1548b();
            this.f4616d = c1548b;
            this.f4617e = new C1654z(c1547a);
            this.f4618f = new C1654z(c1548b);
            this.f4620h = false;
            this.f4621i = false;
            this.f4622j = false;
            this.f4623k = true;
            this.f4624l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /* renamed from: L */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m36481L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1546o.m36481L(int, int, int, int, boolean):int");
        }

        /* renamed from: M */
        private int[] m36479M(View view, Rect rect) {
            int[] iArr = new int[2];
            int m36449f0 = m36449f0();
            int m36445h0 = m36445h0();
            int m36427p0 = m36427p0() - m36447g0();
            int m36464X = m36464X() - m36451e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - m36449f0;
            int min = Math.min(0, i);
            int i2 = top - m36445h0;
            int min2 = Math.min(0, i2);
            int i3 = width - m36427p0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - m36464X);
            if (m36461a0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: g */
        private void m36448g(View view, int i, boolean z) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (!z && !m36653i0.m36556v()) {
                this.f4614b.f4499B.m36128p(m36653i0);
            } else {
                this.f4614b.f4499B.m36142b(m36653i0);
            }
            C1551p c1551p = (C1551p) view.getLayoutParams();
            if (!m36653i0.m36578L() && !m36653i0.m36555w()) {
                if (view.getParent() == this.f4614b) {
                    int m36096m = this.f4613a.m36096m(view);
                    if (i == -1) {
                        i = this.f4613a.m36102g();
                    }
                    if (m36096m == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4614b.indexOfChild(view) + this.f4614b.m36697Q());
                    } else if (m36096m != i) {
                        this.f4614b.f4513I.m36498C0(m36096m, i);
                    }
                } else {
                    this.f4613a.m36108a(view, i, false);
                    c1551p.f4639c = true;
                    AbstractC1561y abstractC1561y = this.f4619g;
                    if (abstractC1561y != null && abstractC1561y.m36342h()) {
                        this.f4619g.m36339k(view);
                    }
                }
            } else {
                if (m36653i0.m36555w()) {
                    m36653i0.m36579K();
                } else {
                    m36653i0.m36573e();
                }
                this.f4613a.m36106c(view, i, view.getLayoutParams(), false);
            }
            if (c1551p.f4640d) {
                m36653i0.f4581a.invalidate();
                c1551p.f4640d = false;
            }
        }

        /* renamed from: j0 */
        public static C1550d m36440j0(Context context, AttributeSet attributeSet, int i, int i2) {
            C1550d c1550d = new C1550d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13630d.f34625a, i, i2);
            c1550d.f4633a = obtainStyledAttributes.getInt(C13630d.f34626b, 1);
            c1550d.f4634b = obtainStyledAttributes.getInt(C13630d.f34636l, 1);
            c1550d.f4635c = obtainStyledAttributes.getBoolean(C13630d.f34635k, false);
            c1550d.f4636d = obtainStyledAttributes.getBoolean(C13630d.f34637m, false);
            obtainStyledAttributes.recycle();
            return c1550d;
        }

        /* renamed from: o */
        public static int m36430o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: u0 */
        private boolean m36418u0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m36449f0 = m36449f0();
            int m36445h0 = m36445h0();
            int m36427p0 = m36427p0() - m36447g0();
            int m36464X = m36464X() - m36451e0();
            Rect rect = this.f4614b.f4505E;
            m36473Q(focusedChild, rect);
            return rect.left - i < m36427p0 && rect.right - i > m36449f0 && rect.top - i2 < m36464X && rect.bottom - i2 > m36445h0;
        }

        /* renamed from: w1 */
        private void m36413w1(C1558v c1558v, int i, View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0.m36580J()) {
                return;
            }
            if (m36653i0.m36558t() && !m36653i0.m36556v() && !this.f4614b.f4511H.m36543j()) {
                m36421r1(i);
                c1558v.m36388C(m36653i0);
                return;
            }
            m36410y(i);
            c1558v.m36387D(view);
            this.f4614b.f4499B.m36133k(m36653i0);
        }

        /* renamed from: x0 */
        private static boolean m36411x0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: z */
        private void m36408z(int i, View view) {
            this.f4613a.m36105d(i);
        }

        /* renamed from: A */
        void m36505A(RecyclerView recyclerView) {
            this.f4621i = true;
            m36489H0(recyclerView);
        }

        /* renamed from: A0 */
        public void m36504A0(View view, int i, int i2, int i3, int i4) {
            C1551p c1551p = (C1551p) view.getLayoutParams();
            Rect rect = c1551p.f4638b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c1551p).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c1551p).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c1551p).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin);
        }

        /* renamed from: A1 */
        void m36503A1(RecyclerView recyclerView) {
            m36500B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: B */
        void m36502B(RecyclerView recyclerView, C1558v c1558v) {
            this.f4621i = false;
            mo36308J0(recyclerView, c1558v);
        }

        /* renamed from: B0 */
        public void m36501B0(View view, int i, int i2) {
            C1551p c1551p = (C1551p) view.getLayoutParams();
            Rect m36641m0 = this.f4614b.m36641m0(view);
            int i3 = i + m36641m0.left + m36641m0.right;
            int i4 = i2 + m36641m0.top + m36641m0.bottom;
            int m36481L = m36481L(m36427p0(), m36424q0(), m36449f0() + m36447g0() + ((ViewGroup.MarginLayoutParams) c1551p).leftMargin + ((ViewGroup.MarginLayoutParams) c1551p).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c1551p).width, mo36256l());
            int m36481L2 = m36481L(m36464X(), m36463Y(), m36445h0() + m36451e0() + ((ViewGroup.MarginLayoutParams) c1551p).topMargin + ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c1551p).height, mo36253m());
            if (m36491G1(view, m36481L, m36481L2, c1551p)) {
                view.measure(m36481L, m36481L2);
            }
        }

        /* renamed from: B1 */
        void m36500B1(int i, int i2) {
            this.f4629q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f4627o = mode;
            if (mode == 0 && !RecyclerView.f4490W0) {
                this.f4629q = 0;
            }
            this.f4630r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4628p = mode2;
            if (mode2 != 0 || RecyclerView.f4490W0) {
                return;
            }
            this.f4630r = 0;
        }

        /* renamed from: C */
        public View m36499C(View view) {
            View m36691T;
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null || (m36691T = recyclerView.m36691T(view)) == null || this.f4613a.m36095n(m36691T)) {
                return null;
            }
            return m36691T;
        }

        /* renamed from: C0 */
        public void m36498C0(int i, int i2) {
            View m36484J = m36484J(i);
            if (m36484J != null) {
                m36410y(i);
                m36443i(m36484J, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f4614b.toString());
        }

        /* renamed from: C1 */
        public void m36497C1(int i, int i2) {
            this.f4614b.setMeasuredDimension(i, i2);
        }

        /* renamed from: D */
        public View mo36496D(int i) {
            int m36483K = m36483K();
            for (int i2 = 0; i2 < m36483K; i2++) {
                View m36484J = m36484J(i2);
                AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(m36484J);
                if (m36653i0 != null && m36653i0.m36565m() == i && !m36653i0.m36580J() && (this.f4614b.f4504D0.m36326e() || !m36653i0.m36556v())) {
                    return m36484J;
                }
            }
            return null;
        }

        /* renamed from: D0 */
        public void mo36320D0(int i) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                recyclerView.m36724C0(i);
            }
        }

        /* renamed from: D1 */
        public void mo36319D1(Rect rect, int i, int i2) {
            m36497C1(m36430o(i, rect.width() + m36449f0() + m36447g0(), m36453d0()), m36430o(i2, rect.height() + m36445h0() + m36451e0(), m36456c0()));
        }

        /* renamed from: E */
        public abstract C1551p mo36317E();

        /* renamed from: E0 */
        public void mo36316E0(int i) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                recyclerView.m36722D0(i);
            }
        }

        /* renamed from: E1 */
        void m36495E1(int i, int i2) {
            int m36483K = m36483K();
            if (m36483K == 0) {
                this.f4614b.m36609x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < m36483K; i7++) {
                View m36484J = m36484J(i7);
                Rect rect = this.f4614b.f4505E;
                m36473Q(m36484J, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f4614b.f4505E.set(i4, i5, i3, i6);
            mo36319D1(this.f4614b.f4505E, i, i2);
        }

        /* renamed from: F */
        public C1551p mo36314F(Context context, AttributeSet attributeSet) {
            return new C1551p(context, attributeSet);
        }

        /* renamed from: F0 */
        public void m36494F0(AbstractC1535g abstractC1535g, AbstractC1535g abstractC1535g2) {
        }

        /* renamed from: F1 */
        void m36493F1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4614b = null;
                this.f4613a = null;
                this.f4629q = 0;
                this.f4630r = 0;
            } else {
                this.f4614b = recyclerView;
                this.f4613a = recyclerView.f4497A;
                this.f4629q = recyclerView.getWidth();
                this.f4630r = recyclerView.getHeight();
            }
            this.f4627o = 1073741824;
            this.f4628p = 1073741824;
        }

        /* renamed from: G */
        public C1551p mo36312G(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C1551p) {
                return new C1551p((C1551p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C1551p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new C1551p(layoutParams);
        }

        /* renamed from: G0 */
        public boolean m36492G0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean m36491G1(View view, int i, int i2, C1551p c1551p) {
            return (!view.isLayoutRequested() && this.f4623k && m36411x0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1551p).width) && m36411x0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1551p).height)) ? false : true;
        }

        /* renamed from: H */
        public int m36490H() {
            return -1;
        }

        /* renamed from: H0 */
        public void m36489H0(RecyclerView recyclerView) {
        }

        /* renamed from: H1 */
        boolean mo36488H1() {
            return false;
        }

        /* renamed from: I */
        public int m36487I(View view) {
            return ((C1551p) view.getLayoutParams()).f4638b.bottom;
        }

        @Deprecated
        /* renamed from: I0 */
        public void m36486I0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I1 */
        public boolean m36485I1(View view, int i, int i2, C1551p c1551p) {
            return (this.f4623k && m36411x0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c1551p).width) && m36411x0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c1551p).height)) ? false : true;
        }

        /* renamed from: J */
        public View m36484J(int i) {
            C1587f c1587f = this.f4613a;
            if (c1587f != null) {
                return c1587f.m36103f(i);
            }
            return null;
        }

        /* renamed from: J0 */
        public void mo36308J0(RecyclerView recyclerView, C1558v c1558v) {
            m36486I0(recyclerView);
        }

        /* renamed from: J1 */
        public void mo29858J1(RecyclerView recyclerView, C1564z c1564z, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: K */
        public int m36483K() {
            C1587f c1587f = this.f4613a;
            if (c1587f != null) {
                return c1587f.m36102g();
            }
            return 0;
        }

        /* renamed from: K0 */
        public View mo36306K0(View view, int i, C1558v c1558v, C1564z c1564z) {
            return null;
        }

        /* renamed from: K1 */
        public void m36482K1(AbstractC1561y abstractC1561y) {
            AbstractC1561y abstractC1561y2 = this.f4619g;
            if (abstractC1561y2 != null && abstractC1561y != abstractC1561y2 && abstractC1561y2.m36342h()) {
                this.f4619g.m36336r();
            }
            this.f4619g = abstractC1561y;
            abstractC1561y.m36337q(this.f4614b, this);
        }

        /* renamed from: L0 */
        public void mo36304L0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4614b;
            m36478M0(recyclerView.f4564x, recyclerView.f4504D0, accessibilityEvent);
        }

        /* renamed from: L1 */
        void m36480L1() {
            AbstractC1561y abstractC1561y = this.f4619g;
            if (abstractC1561y != null) {
                abstractC1561y.m36336r();
            }
        }

        /* renamed from: M0 */
        public void m36478M0(C1558v c1558v, C1564z c1564z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4614b.canScrollVertically(-1) && !this.f4614b.canScrollHorizontally(-1) && !this.f4614b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC1535g abstractC1535g = this.f4614b.f4511H;
            if (abstractC1535g != null) {
                accessibilityEvent.setItemCount(abstractC1535g.mo29834f());
            }
        }

        /* renamed from: M1 */
        public boolean mo36302M1() {
            return false;
        }

        /* renamed from: N */
        public boolean m36477N() {
            RecyclerView recyclerView = this.f4614b;
            return recyclerView != null && recyclerView.f4501C;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void m36476N0(C1085c c1085c) {
            RecyclerView recyclerView = this.f4614b;
            mo35472O0(recyclerView.f4564x, recyclerView.f4504D0, c1085c);
        }

        /* renamed from: O */
        public int mo36298O(C1558v c1558v, C1564z c1564z) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null || recyclerView.f4511H == null || !mo36256l()) {
                return 1;
            }
            return this.f4614b.f4511H.mo29834f();
        }

        /* renamed from: O0 */
        public void mo35472O0(C1558v c1558v, C1564z c1564z, C1085c c1085c) {
            if (this.f4614b.canScrollVertically(-1) || this.f4614b.canScrollHorizontally(-1)) {
                c1085c.m38563a(8192);
                c1085c.m38598B0(true);
            }
            if (this.f4614b.canScrollVertically(1) || this.f4614b.canScrollHorizontally(1)) {
                c1085c.m38563a(4096);
                c1085c.m38598B0(true);
            }
            c1085c.m38558c0(C1085c.C1087b.m38507a(mo36255l0(c1558v, c1564z), mo36298O(c1558v, c1564z), m36414w0(c1558v, c1564z), m36434m0(c1558v, c1564z)));
        }

        /* renamed from: P */
        public int m36475P(View view) {
            return view.getBottom() + m36487I(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P0 */
        public void m36474P0(View view, C1085c c1085c) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0 == null || m36653i0.m36556v() || this.f4613a.m36095n(m36653i0.f4581a)) {
                return;
            }
            RecyclerView recyclerView = this.f4614b;
            mo36293Q0(recyclerView.f4564x, recyclerView.f4504D0, view, c1085c);
        }

        /* renamed from: Q */
        public void m36473Q(View view, Rect rect) {
            RecyclerView.m36650j0(view, rect);
        }

        /* renamed from: Q0 */
        public void mo36293Q0(C1558v c1558v, C1564z c1564z, View view, C1085c c1085c) {
            c1085c.m38556d0(C1085c.C1088c.m38506a(mo36253m() ? m36442i0(view) : 0, 1, mo36256l() ? m36442i0(view) : 0, 1, false, false));
        }

        /* renamed from: R */
        public int m36472R(View view) {
            return view.getLeft() - m36459b0(view);
        }

        /* renamed from: R0 */
        public View m36471R0(View view, int i) {
            return null;
        }

        /* renamed from: S */
        public int m36470S(View view) {
            Rect rect = ((C1551p) view.getLayoutParams()).f4638b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: S0 */
        public void mo36288S0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: T */
        public int m36469T(View view) {
            Rect rect = ((C1551p) view.getLayoutParams()).f4638b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: T0 */
        public void mo36285T0(RecyclerView recyclerView) {
        }

        /* renamed from: U */
        public int m36468U(View view) {
            return view.getRight() + m36437k0(view);
        }

        /* renamed from: U0 */
        public void mo36283U0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: V */
        public int m36467V(View view) {
            return view.getTop() - m36432n0(view);
        }

        /* renamed from: V0 */
        public void mo36281V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public View m36466W() {
            View focusedChild;
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4613a.m36095n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: W0 */
        public void m36465W0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: X */
        public int m36464X() {
            return this.f4630r;
        }

        /* renamed from: X0 */
        public void mo36278X0(RecyclerView recyclerView, int i, int i2, Object obj) {
            m36465W0(recyclerView, i, i2);
        }

        /* renamed from: Y */
        public int m36463Y() {
            return this.f4628p;
        }

        /* renamed from: Y0 */
        public void mo36276Y0(C1558v c1558v, C1564z c1564z) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Z */
        public int m36462Z() {
            RecyclerView recyclerView = this.f4614b;
            AbstractC1535g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo29834f();
            }
            return 0;
        }

        /* renamed from: Z0 */
        public void mo36274Z0(C1564z c1564z) {
        }

        /* renamed from: a0 */
        public int m36461a0() {
            return C1112b0.m38476E(this.f4614b);
        }

        /* renamed from: a1 */
        public void m36460a1(C1558v c1558v, C1564z c1564z, int i, int i2) {
            this.f4614b.m36609x(i, i2);
        }

        /* renamed from: b0 */
        public int m36459b0(View view) {
            return ((C1551p) view.getLayoutParams()).f4638b.left;
        }

        @Deprecated
        /* renamed from: b1 */
        public boolean m36458b1(RecyclerView recyclerView, View view, View view2) {
            return m36409y0() || recyclerView.m36608x0();
        }

        /* renamed from: c */
        public void m36457c(View view) {
            m36454d(view, -1);
        }

        /* renamed from: c0 */
        public int m36456c0() {
            return C1112b0.m38474F(this.f4614b);
        }

        /* renamed from: c1 */
        public boolean m36455c1(RecyclerView recyclerView, C1564z c1564z, View view, View view2) {
            return m36458b1(recyclerView, view, view2);
        }

        /* renamed from: d */
        public void m36454d(View view, int i) {
            m36448g(view, i, true);
        }

        /* renamed from: d0 */
        public int m36453d0() {
            return C1112b0.m38472G(this.f4614b);
        }

        /* renamed from: d1 */
        public void mo36268d1(Parcelable parcelable) {
        }

        /* renamed from: e */
        public void m36452e(View view) {
            m36450f(view, -1);
        }

        /* renamed from: e0 */
        public int m36451e0() {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: e1 */
        public Parcelable mo36266e1() {
            return null;
        }

        /* renamed from: f */
        public void m36450f(View view, int i) {
            m36448g(view, i, false);
        }

        /* renamed from: f0 */
        public int m36449f0() {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: f1 */
        public void mo36264f1(int i) {
        }

        /* renamed from: g0 */
        public int m36447g0() {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: g1 */
        void m36446g1(AbstractC1561y abstractC1561y) {
            if (this.f4619g == abstractC1561y) {
                this.f4619g = null;
            }
        }

        /* renamed from: h */
        public void mo36261h(String str) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                recyclerView.m36633p(str);
            }
        }

        /* renamed from: h0 */
        public int m36445h0() {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h1 */
        public boolean m36444h1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4614b;
            return mo35471i1(recyclerView.f4564x, recyclerView.f4504D0, i, bundle);
        }

        /* renamed from: i */
        public void m36443i(View view, int i) {
            m36441j(view, i, (C1551p) view.getLayoutParams());
        }

        /* renamed from: i0 */
        public int m36442i0(View view) {
            return ((C1551p) view.getLayoutParams()).m36406a();
        }

        /* renamed from: i1 */
        public boolean mo35471i1(C1558v c1558v, C1564z c1564z, int i, Bundle bundle) {
            int m36464X;
            int m36427p0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                m36464X = recyclerView.canScrollVertically(1) ? (m36464X() - m36445h0()) - m36451e0() : 0;
                if (this.f4614b.canScrollHorizontally(1)) {
                    m36427p0 = (m36427p0() - m36449f0()) - m36447g0();
                    i2 = m36464X;
                    i3 = m36427p0;
                }
                i2 = m36464X;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                m36464X = recyclerView.canScrollVertically(-1) ? -((m36464X() - m36445h0()) - m36451e0()) : 0;
                if (this.f4614b.canScrollHorizontally(-1)) {
                    m36427p0 = -((m36427p0() - m36449f0()) - m36447g0());
                    i2 = m36464X;
                    i3 = m36427p0;
                }
                i2 = m36464X;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f4614b.m36622s1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: j */
        public void m36441j(View view, int i, C1551p c1551p) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0.m36556v()) {
                this.f4614b.f4499B.m36142b(m36653i0);
            } else {
                this.f4614b.f4499B.m36128p(m36653i0);
            }
            this.f4613a.m36106c(view, i, c1551p, m36653i0.m36556v());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j1 */
        public boolean m36439j1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f4614b;
            return m36436k1(recyclerView.f4564x, recyclerView.f4504D0, view, i, bundle);
        }

        /* renamed from: k */
        public void m36438k(View view, Rect rect) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m36641m0(view));
            }
        }

        /* renamed from: k0 */
        public int m36437k0(View view) {
            return ((C1551p) view.getLayoutParams()).f4638b.right;
        }

        /* renamed from: k1 */
        public boolean m36436k1(C1558v c1558v, C1564z c1564z, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: l */
        public boolean mo36256l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo36255l0(C1558v c1558v, C1564z c1564z) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView == null || recyclerView.f4511H == null || !mo36253m()) {
                return 1;
            }
            return this.f4614b.f4511H.mo29834f();
        }

        /* renamed from: l1 */
        public void m36435l1(C1558v c1558v) {
            for (int m36483K = m36483K() - 1; m36483K >= 0; m36483K--) {
                if (!RecyclerView.m36653i0(m36484J(m36483K)).m36580J()) {
                    m36428o1(m36483K, c1558v);
                }
            }
        }

        /* renamed from: m */
        public boolean mo36253m() {
            return false;
        }

        /* renamed from: m0 */
        public int m36434m0(C1558v c1558v, C1564z c1564z) {
            return 0;
        }

        /* renamed from: m1 */
        void m36433m1(C1558v c1558v) {
            int m36368j = c1558v.m36368j();
            for (int i = m36368j - 1; i >= 0; i--) {
                View m36364n = c1558v.m36364n(i);
                AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(m36364n);
                if (!m36653i0.m36580J()) {
                    m36653i0.m36583G(false);
                    if (m36653i0.m36554x()) {
                        this.f4614b.removeDetachedView(m36364n, false);
                    }
                    AbstractC1540l abstractC1540l = this.f4614b.f4551l0;
                    if (abstractC1540l != null) {
                        abstractC1540l.mo36058j(m36653i0);
                    }
                    m36653i0.m36583G(true);
                    c1558v.m36353y(m36364n);
                }
            }
            c1558v.m36373e();
            if (m36368j > 0) {
                this.f4614b.invalidate();
            }
        }

        /* renamed from: n */
        public boolean mo36251n(C1551p c1551p) {
            return c1551p != null;
        }

        /* renamed from: n0 */
        public int m36432n0(View view) {
            return ((C1551p) view.getLayoutParams()).f4638b.top;
        }

        /* renamed from: n1 */
        public void m36431n1(View view, C1558v c1558v) {
            m36423q1(view);
            c1558v.m36389B(view);
        }

        /* renamed from: o0 */
        public void m36429o0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C1551p) view.getLayoutParams()).f4638b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4614b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4614b.f4509G;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: o1 */
        public void m36428o1(int i, C1558v c1558v) {
            View m36484J = m36484J(i);
            m36421r1(i);
            c1558v.m36389B(m36484J);
        }

        /* renamed from: p */
        public void mo36248p(int i, int i2, C1564z c1564z, InterfaceC1549c interfaceC1549c) {
        }

        /* renamed from: p0 */
        public int m36427p0() {
            return this.f4629q;
        }

        /* renamed from: p1 */
        public boolean m36426p1(Runnable runnable) {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: q */
        public void mo36425q(int i, InterfaceC1549c interfaceC1549c) {
        }

        /* renamed from: q0 */
        public int m36424q0() {
            return this.f4627o;
        }

        /* renamed from: q1 */
        public void m36423q1(View view) {
            this.f4613a.m36093p(view);
        }

        /* renamed from: r */
        public int mo36245r(C1564z c1564z) {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: r0 */
        public boolean m36422r0() {
            int m36483K = m36483K();
            for (int i = 0; i < m36483K; i++) {
                ViewGroup.LayoutParams layoutParams = m36484J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r1 */
        public void m36421r1(int i) {
            if (m36484J(i) != null) {
                this.f4613a.m36092q(i);
            }
        }

        /* renamed from: s */
        public int mo36243s(C1564z c1564z) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean m36420s0() {
            return this.f4621i;
        }

        /* renamed from: s1 */
        public boolean m36419s1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo35470t1(recyclerView, view, rect, z, false);
        }

        /* renamed from: t */
        public int mo36241t(C1564z c1564z) {
            return 0;
        }

        /* renamed from: t0 */
        public boolean mo36240t0() {
            return this.f4622j;
        }

        /* renamed from: t1 */
        public boolean mo35470t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] m36479M = m36479M(view, rect);
            int i = m36479M[0];
            int i2 = m36479M[1];
            if ((!z2 || m36418u0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.m36631p1(i, i2);
                }
                return true;
            }
            return false;
        }

        /* renamed from: u */
        public int mo36238u(C1564z c1564z) {
            return 0;
        }

        /* renamed from: u1 */
        public void m36417u1() {
            RecyclerView recyclerView = this.f4614b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: v */
        public int mo36236v(C1564z c1564z) {
            return 0;
        }

        /* renamed from: v0 */
        public final boolean m36416v0() {
            return this.f4624l;
        }

        /* renamed from: v1 */
        public void m36415v1() {
            this.f4620h = true;
        }

        /* renamed from: w */
        public int mo36234w(C1564z c1564z) {
            return 0;
        }

        /* renamed from: w0 */
        public boolean m36414w0(C1558v c1558v, C1564z c1564z) {
            return false;
        }

        /* renamed from: x */
        public void m36412x(C1558v c1558v) {
            for (int m36483K = m36483K() - 1; m36483K >= 0; m36483K--) {
                m36413w1(c1558v, m36483K, m36484J(m36483K));
            }
        }

        /* renamed from: x1 */
        public int mo36232x1(int i, C1558v c1558v, C1564z c1564z) {
            return 0;
        }

        /* renamed from: y */
        public void m36410y(int i) {
            m36408z(i, m36484J(i));
        }

        /* renamed from: y0 */
        public boolean m36409y0() {
            AbstractC1561y abstractC1561y = this.f4619g;
            return abstractC1561y != null && abstractC1561y.m36342h();
        }

        /* renamed from: y1 */
        public void mo36230y1(int i) {
        }

        /* renamed from: z0 */
        public boolean m36407z0(View view, boolean z, boolean z2) {
            boolean z3 = this.f4617e.m35809b(view, 24579) && this.f4618f.m35809b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: z1 */
        public int mo36228z1(int i, C1558v c1558v, C1564z c1564z) {
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes.dex */
    public interface InterfaceC1552q {
        /* renamed from: b */
        void mo35479b(View view);

        /* renamed from: d */
        void mo35478d(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1553r {
        /* renamed from: a */
        public abstract boolean mo35822a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes.dex */
    public interface InterfaceC1554s {
        /* renamed from: a */
        boolean mo35967a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        void mo35966c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo35965e(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1555t {
        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo29913b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public static class C1556u {

        /* renamed from: a */
        SparseArray<C1557a> f4641a = new SparseArray<>();

        /* renamed from: b */
        private int f4642b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        /* loaded from: classes.dex */
        public static class C1557a {

            /* renamed from: a */
            final ArrayList<AbstractC1531c0> f4643a = new ArrayList<>();

            /* renamed from: b */
            int f4644b = 5;

            /* renamed from: c */
            long f4645c = 0;

            /* renamed from: d */
            long f4646d = 0;

            C1557a() {
            }
        }

        /* renamed from: g */
        private C1557a m36396g(int i) {
            C1557a c1557a = this.f4641a.get(i);
            if (c1557a == null) {
                C1557a c1557a2 = new C1557a();
                this.f4641a.put(i, c1557a2);
                return c1557a2;
            }
            return c1557a;
        }

        /* renamed from: a */
        void m36402a() {
            this.f4642b++;
        }

        /* renamed from: b */
        public void m36401b() {
            for (int i = 0; i < this.f4641a.size(); i++) {
                this.f4641a.valueAt(i).f4643a.clear();
            }
        }

        /* renamed from: c */
        void m36400c() {
            this.f4642b--;
        }

        /* renamed from: d */
        void m36399d(int i, long j) {
            C1557a m36396g = m36396g(i);
            m36396g.f4646d = m36393j(m36396g.f4646d, j);
        }

        /* renamed from: e */
        void m36398e(int i, long j) {
            C1557a m36396g = m36396g(i);
            m36396g.f4645c = m36393j(m36396g.f4645c, j);
        }

        /* renamed from: f */
        public AbstractC1531c0 m36397f(int i) {
            C1557a c1557a = this.f4641a.get(i);
            if (c1557a == null || c1557a.f4643a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC1531c0> arrayList = c1557a.f4643a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m36560r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: h */
        void m36395h(AbstractC1535g abstractC1535g, AbstractC1535g abstractC1535g2, boolean z) {
            if (abstractC1535g != null) {
                m36400c();
            }
            if (!z && this.f4642b == 0) {
                m36401b();
            }
            if (abstractC1535g2 != null) {
                m36402a();
            }
        }

        /* renamed from: i */
        public void m36394i(AbstractC1531c0 abstractC1531c0) {
            int m36566l = abstractC1531c0.m36566l();
            ArrayList<AbstractC1531c0> arrayList = m36396g(m36566l).f4643a;
            if (this.f4641a.get(m36566l).f4644b <= arrayList.size()) {
                return;
            }
            abstractC1531c0.m36586D();
            arrayList.add(abstractC1531c0);
        }

        /* renamed from: j */
        long m36393j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: k */
        boolean m36392k(int i, long j, long j2) {
            long j3 = m36396g(i).f4646d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: l */
        boolean m36391l(int i, long j, long j2) {
            long j3 = m36396g(i).f4645c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes.dex */
    public final class C1558v {

        /* renamed from: a */
        final ArrayList<AbstractC1531c0> f4647a;

        /* renamed from: b */
        ArrayList<AbstractC1531c0> f4648b;

        /* renamed from: c */
        final ArrayList<AbstractC1531c0> f4649c;

        /* renamed from: d */
        private final List<AbstractC1531c0> f4650d;

        /* renamed from: e */
        private int f4651e;

        /* renamed from: f */
        int f4652f;

        /* renamed from: g */
        C1556u f4653g;

        public C1558v() {
            ArrayList<AbstractC1531c0> arrayList = new ArrayList<>();
            this.f4647a = arrayList;
            this.f4648b = null;
            this.f4649c = new ArrayList<>();
            this.f4650d = Collections.unmodifiableList(arrayList);
            this.f4651e = 2;
            this.f4652f = 2;
        }

        /* renamed from: H */
        private boolean m36383H(AbstractC1531c0 abstractC1531c0, int i, int i2, long j) {
            abstractC1531c0.f4584r = RecyclerView.this;
            int m36566l = abstractC1531c0.m36566l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.f4653g.m36392k(m36566l, nanoTime, j)) {
                RecyclerView.this.f4511H.m36547d(abstractC1531c0, i);
                this.f4653g.m36399d(abstractC1531c0.m36566l(), RecyclerView.this.getNanoTime() - nanoTime);
                m36376b(abstractC1531c0);
                if (RecyclerView.this.f4504D0.m36326e()) {
                    abstractC1531c0.f4589g = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private void m36376b(AbstractC1531c0 abstractC1531c0) {
            if (RecyclerView.this.m36614v0()) {
                View view = abstractC1531c0.f4581a;
                if (C1112b0.m38480C(view) == 0) {
                    C1112b0.m38479C0(view, 1);
                }
                C1647v c1647v = RecyclerView.this.f4518K0;
                if (c1647v == null) {
                    return;
                }
                C1078a m35859n = c1647v.m35859n();
                if (m35859n instanceof C1647v.C1648a) {
                    ((C1647v.C1648a) m35859n).m35852o(view);
                }
                C1112b0.m38405s0(view, m35859n);
            }
        }

        /* renamed from: q */
        private void m36361q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m36361q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m36360r(AbstractC1531c0 abstractC1531c0) {
            View view = abstractC1531c0.f4581a;
            if (view instanceof ViewGroup) {
                m36361q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m36390A(int i) {
            m36377a(this.f4649c.get(i), true);
            this.f4649c.remove(i);
        }

        /* renamed from: B */
        public void m36389B(View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (m36653i0.m36554x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m36653i0.m36555w()) {
                m36653i0.m36579K();
            } else if (m36653i0.m36578L()) {
                m36653i0.m36573e();
            }
            m36388C(m36653i0);
            if (RecyclerView.this.f4551l0 == null || m36653i0.m36557u()) {
                return;
            }
            RecyclerView.this.f4551l0.mo36058j(m36653i0);
        }

        /* renamed from: C */
        void m36388C(AbstractC1531c0 abstractC1531c0) {
            boolean z;
            boolean z2 = true;
            if (!abstractC1531c0.m36555w() && abstractC1531c0.f4581a.getParent() == null) {
                if (!abstractC1531c0.m36554x()) {
                    if (!abstractC1531c0.m36580J()) {
                        boolean m36570h = abstractC1531c0.m36570h();
                        AbstractC1535g abstractC1535g = RecyclerView.this.f4511H;
                        if ((abstractC1535g != null && m36570h && abstractC1535g.mo35521O(abstractC1531c0)) || abstractC1531c0.m36557u()) {
                            if (this.f4652f <= 0 || abstractC1531c0.m36562p(526)) {
                                z = false;
                            } else {
                                int size = this.f4649c.size();
                                if (size >= this.f4652f && size > 0) {
                                    m36390A(0);
                                    size--;
                                }
                                if (RecyclerView.f4492Y0 && size > 0 && !RecyclerView.this.f4502C0.m35998d(abstractC1531c0.f4585c)) {
                                    int i = size - 1;
                                    while (i >= 0) {
                                        if (!RecyclerView.this.f4502C0.m35998d(this.f4649c.get(i).f4585c)) {
                                            break;
                                        }
                                        i--;
                                    }
                                    size = i + 1;
                                }
                                this.f4649c.add(size, abstractC1531c0);
                                z = true;
                            }
                            if (z) {
                                z2 = false;
                            } else {
                                m36377a(abstractC1531c0, true);
                            }
                            r1 = z;
                        } else {
                            z2 = false;
                        }
                        RecyclerView.this.f4499B.m36127q(abstractC1531c0);
                        if (r1 || z2 || !m36570h) {
                            return;
                        }
                        abstractC1531c0.f4584r = null;
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m36697Q());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1531c0 + RecyclerView.this.m36697Q());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC1531c0.m36555w());
            sb2.append(" isAttached:");
            sb2.append(abstractC1531c0.f4581a.getParent() != null);
            sb2.append(RecyclerView.this.m36697Q());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: D */
        void m36387D(View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            if (!m36653i0.m36562p(12) && m36653i0.m36553y() && !RecyclerView.this.m36630q(m36653i0)) {
                if (this.f4648b == null) {
                    this.f4648b = new ArrayList<>();
                }
                m36653i0.m36582H(this, true);
                this.f4648b.add(m36653i0);
            } else if (m36653i0.m36558t() && !m36653i0.m36556v() && !RecyclerView.this.f4511H.m36543j()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m36697Q());
            } else {
                m36653i0.m36582H(this, false);
                this.f4647a.add(m36653i0);
            }
        }

        /* renamed from: E */
        void m36386E(C1556u c1556u) {
            C1556u c1556u2 = this.f4653g;
            if (c1556u2 != null) {
                c1556u2.m36400c();
            }
            this.f4653g = c1556u;
            if (c1556u == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4653g.m36402a();
        }

        /* renamed from: F */
        void m36385F(AbstractC1527a0 abstractC1527a0) {
        }

        /* renamed from: G */
        public void m36384G(int i) {
            this.f4651e = i;
            m36380K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC1531c0 m36382I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1558v.m36382I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* renamed from: J */
        void m36381J(AbstractC1531c0 abstractC1531c0) {
            if (abstractC1531c0.f4596o) {
                this.f4648b.remove(abstractC1531c0);
            } else {
                this.f4647a.remove(abstractC1531c0);
            }
            abstractC1531c0.f4595n = null;
            abstractC1531c0.f4596o = false;
            abstractC1531c0.m36573e();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K */
        public void m36380K() {
            AbstractC1546o abstractC1546o = RecyclerView.this.f4513I;
            this.f4652f = this.f4651e + (abstractC1546o != null ? abstractC1546o.f4625m : 0);
            for (int size = this.f4649c.size() - 1; size >= 0 && this.f4649c.size() > this.f4652f; size--) {
                m36390A(size);
            }
        }

        /* renamed from: L */
        boolean m36379L(AbstractC1531c0 abstractC1531c0) {
            if (abstractC1531c0.m36556v()) {
                return RecyclerView.this.f4504D0.m36326e();
            }
            int i = abstractC1531c0.f4585c;
            if (i >= 0 && i < RecyclerView.this.f4511H.mo29834f()) {
                if (RecyclerView.this.f4504D0.m36326e() || RecyclerView.this.f4511H.mo36545h(abstractC1531c0.f4585c) == abstractC1531c0.m36566l()) {
                    return !RecyclerView.this.f4511H.m36543j() || abstractC1531c0.m36567k() == RecyclerView.this.f4511H.mo29862g(abstractC1531c0.f4585c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1531c0 + RecyclerView.this.m36697Q());
        }

        /* renamed from: M */
        void m36378M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f4649c.size() - 1; size >= 0; size--) {
                AbstractC1531c0 abstractC1531c0 = this.f4649c.get(size);
                if (abstractC1531c0 != null && (i3 = abstractC1531c0.f4585c) >= i && i3 < i4) {
                    abstractC1531c0.m36576b(2);
                    m36390A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m36377a(AbstractC1531c0 abstractC1531c0, boolean z) {
            RecyclerView.m36624s(abstractC1531c0);
            View view = abstractC1531c0.f4581a;
            C1647v c1647v = RecyclerView.this.f4518K0;
            if (c1647v != null) {
                C1078a m35859n = c1647v.m35859n();
                C1112b0.m38405s0(view, m35859n instanceof C1647v.C1648a ? ((C1647v.C1648a) m35859n).m35853n(view) : null);
            }
            if (z) {
                m36371g(abstractC1531c0);
            }
            abstractC1531c0.f4584r = null;
            m36369i().m36394i(abstractC1531c0);
        }

        /* renamed from: c */
        public void m36375c() {
            this.f4647a.clear();
            m36352z();
        }

        /* renamed from: d */
        void m36374d() {
            int size = this.f4649c.size();
            for (int i = 0; i < size; i++) {
                this.f4649c.get(i).m36575c();
            }
            int size2 = this.f4647a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f4647a.get(i2).m36575c();
            }
            ArrayList<AbstractC1531c0> arrayList = this.f4648b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f4648b.get(i3).m36575c();
                }
            }
        }

        /* renamed from: e */
        void m36373e() {
            this.f4647a.clear();
            ArrayList<AbstractC1531c0> arrayList = this.f4648b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m36372f(int i) {
            if (i >= 0 && i < RecyclerView.this.f4504D0.m36329b()) {
                return !RecyclerView.this.f4504D0.m36326e() ? i : RecyclerView.this.f4568z.m36166m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f4504D0.m36329b() + RecyclerView.this.m36697Q());
        }

        /* renamed from: g */
        void m36371g(AbstractC1531c0 abstractC1531c0) {
            InterfaceC1559w interfaceC1559w = RecyclerView.this.f4515J;
            if (interfaceC1559w != null) {
                interfaceC1559w.m36351a(abstractC1531c0);
            }
            AbstractC1535g abstractC1535g = RecyclerView.this.f4511H;
            if (abstractC1535g != null) {
                abstractC1535g.mo35519Q(abstractC1531c0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4504D0 != null) {
                recyclerView.f4499B.m36127q(abstractC1531c0);
            }
        }

        /* renamed from: h */
        AbstractC1531c0 m36370h(int i) {
            int size;
            int m36166m;
            ArrayList<AbstractC1531c0> arrayList = this.f4648b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC1531c0 abstractC1531c0 = this.f4648b.get(i2);
                    if (!abstractC1531c0.m36578L() && abstractC1531c0.m36565m() == i) {
                        abstractC1531c0.m36576b(32);
                        return abstractC1531c0;
                    }
                }
                if (RecyclerView.this.f4511H.m36543j() && (m36166m = RecyclerView.this.f4568z.m36166m(i)) > 0 && m36166m < RecyclerView.this.f4511H.mo29834f()) {
                    long mo29862g = RecyclerView.this.f4511H.mo29862g(m36166m);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC1531c0 abstractC1531c02 = this.f4648b.get(i3);
                        if (!abstractC1531c02.m36578L() && abstractC1531c02.m36567k() == mo29862g) {
                            abstractC1531c02.m36576b(32);
                            return abstractC1531c02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C1556u m36369i() {
            if (this.f4653g == null) {
                this.f4653g = new C1556u();
            }
            return this.f4653g;
        }

        /* renamed from: j */
        int m36368j() {
            return this.f4647a.size();
        }

        /* renamed from: k */
        public List<AbstractC1531c0> m36367k() {
            return this.f4650d;
        }

        /* renamed from: l */
        AbstractC1531c0 m36366l(long j, int i, boolean z) {
            for (int size = this.f4647a.size() - 1; size >= 0; size--) {
                AbstractC1531c0 abstractC1531c0 = this.f4647a.get(size);
                if (abstractC1531c0.m36567k() == j && !abstractC1531c0.m36578L()) {
                    if (i == abstractC1531c0.m36566l()) {
                        abstractC1531c0.m36576b(32);
                        if (abstractC1531c0.m36556v() && !RecyclerView.this.f4504D0.m36326e()) {
                            abstractC1531c0.m36584F(2, 14);
                        }
                        return abstractC1531c0;
                    } else if (!z) {
                        this.f4647a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC1531c0.f4581a, false);
                        m36353y(abstractC1531c0.f4581a);
                    }
                }
            }
            int size2 = this.f4649c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC1531c0 abstractC1531c02 = this.f4649c.get(size2);
                if (abstractC1531c02.m36567k() == j && !abstractC1531c02.m36560r()) {
                    if (i == abstractC1531c02.m36566l()) {
                        if (!z) {
                            this.f4649c.remove(size2);
                        }
                        return abstractC1531c02;
                    } else if (!z) {
                        m36390A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC1531c0 m36365m(int i, boolean z) {
            View m36104e;
            int size = this.f4647a.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1531c0 abstractC1531c0 = this.f4647a.get(i2);
                if (!abstractC1531c0.m36578L() && abstractC1531c0.m36565m() == i && !abstractC1531c0.m36558t() && (RecyclerView.this.f4504D0.f4682h || !abstractC1531c0.m36556v())) {
                    abstractC1531c0.m36576b(32);
                    return abstractC1531c0;
                }
            }
            if (!z && (m36104e = RecyclerView.this.f4497A.m36104e(i)) != null) {
                AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(m36104e);
                RecyclerView.this.f4497A.m36090s(m36104e);
                int m36096m = RecyclerView.this.f4497A.m36096m(m36104e);
                if (m36096m != -1) {
                    RecyclerView.this.f4497A.m36105d(m36096m);
                    m36387D(m36104e);
                    m36653i0.m36576b(8224);
                    return m36653i0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m36653i0 + RecyclerView.this.m36697Q());
            }
            int size2 = this.f4649c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC1531c0 abstractC1531c02 = this.f4649c.get(i3);
                if (!abstractC1531c02.m36558t() && abstractC1531c02.m36565m() == i && !abstractC1531c02.m36560r()) {
                    if (!z) {
                        this.f4649c.remove(i3);
                    }
                    return abstractC1531c02;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m36364n(int i) {
            return this.f4647a.get(i).f4581a;
        }

        /* renamed from: o */
        public View m36363o(int i) {
            return m36362p(i, false);
        }

        /* renamed from: p */
        View m36362p(int i, boolean z) {
            return m36382I(i, z, Long.MAX_VALUE).f4581a;
        }

        /* renamed from: s */
        void m36359s() {
            int size = this.f4649c.size();
            for (int i = 0; i < size; i++) {
                C1551p c1551p = (C1551p) this.f4649c.get(i).f4581a.getLayoutParams();
                if (c1551p != null) {
                    c1551p.f4639c = true;
                }
            }
        }

        /* renamed from: t */
        void m36358t() {
            int size = this.f4649c.size();
            for (int i = 0; i < size; i++) {
                AbstractC1531c0 abstractC1531c0 = this.f4649c.get(i);
                if (abstractC1531c0 != null) {
                    abstractC1531c0.m36576b(6);
                    abstractC1531c0.m36577a(null);
                }
            }
            AbstractC1535g abstractC1535g = RecyclerView.this.f4511H;
            if (abstractC1535g == null || !abstractC1535g.m36543j()) {
                m36352z();
            }
        }

        /* renamed from: u */
        void m36357u(int i, int i2) {
            int size = this.f4649c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC1531c0 abstractC1531c0 = this.f4649c.get(i3);
                if (abstractC1531c0 != null && abstractC1531c0.f4585c >= i) {
                    abstractC1531c0.m36589A(i2, true);
                }
            }
        }

        /* renamed from: v */
        void m36356v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f4649c.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC1531c0 abstractC1531c0 = this.f4649c.get(i7);
                if (abstractC1531c0 != null && (i6 = abstractC1531c0.f4585c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC1531c0.m36589A(i2 - i, false);
                    } else {
                        abstractC1531c0.m36589A(i3, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m36355w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f4649c.size() - 1; size >= 0; size--) {
                AbstractC1531c0 abstractC1531c0 = this.f4649c.get(size);
                if (abstractC1531c0 != null) {
                    int i4 = abstractC1531c0.f4585c;
                    if (i4 >= i3) {
                        abstractC1531c0.m36589A(-i2, z);
                    } else if (i4 >= i) {
                        abstractC1531c0.m36576b(8);
                        m36390A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m36354x(AbstractC1535g abstractC1535g, AbstractC1535g abstractC1535g2, boolean z) {
            m36375c();
            m36369i().m36395h(abstractC1535g, abstractC1535g2, z);
        }

        /* renamed from: y */
        void m36353y(View view) {
            AbstractC1531c0 m36653i0 = RecyclerView.m36653i0(view);
            m36653i0.f4595n = null;
            m36653i0.f4596o = false;
            m36653i0.m36573e();
            m36388C(m36653i0);
        }

        /* renamed from: z */
        void m36352z() {
            for (int size = this.f4649c.size() - 1; size >= 0; size--) {
                m36390A(size);
            }
            this.f4649c.clear();
            if (RecyclerView.f4492Y0) {
                RecyclerView.this.f4502C0.m36000b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public interface InterfaceC1559w {
        /* renamed from: a */
        void m36351a(AbstractC1531c0 abstractC1531c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes.dex */
    public class C1560x extends AbstractC1537i {
        C1560x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: a */
        public void mo29102a() {
            RecyclerView.this.m36633p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4504D0.f4681g = true;
            recyclerView.m36692S0(true);
            if (RecyclerView.this.f4568z.m36163p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: c */
        public void mo29100c(int i, int i2, Object obj) {
            RecyclerView.this.m36633p(null);
            if (RecyclerView.this.f4568z.m36161r(i, i2, obj)) {
                m36350g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: d */
        public void mo29099d(int i, int i2) {
            RecyclerView.this.m36633p(null);
            if (RecyclerView.this.f4568z.m36160s(i, i2)) {
                m36350g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: e */
        public void mo29098e(int i, int i2, int i3) {
            RecyclerView.this.m36633p(null);
            if (RecyclerView.this.f4568z.m36159t(i, i2, i3)) {
                m36350g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1537i
        /* renamed from: f */
        public void mo29097f(int i, int i2) {
            RecyclerView.this.m36633p(null);
            if (RecyclerView.this.f4568z.m36158u(i, i2)) {
                m36350g();
            }
        }

        /* renamed from: g */
        void m36350g() {
            if (RecyclerView.f4491X0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4525O && recyclerView.f4523N) {
                    C1112b0.m38421k0(recyclerView, recyclerView.f4503D);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f4539W = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1561y {

        /* renamed from: b */
        private RecyclerView f4656b;

        /* renamed from: c */
        private AbstractC1546o f4657c;

        /* renamed from: d */
        private boolean f4658d;

        /* renamed from: e */
        private boolean f4659e;

        /* renamed from: f */
        private View f4660f;

        /* renamed from: h */
        private boolean f4661h;

        /* renamed from: a */
        private int f4662a = -1;

        /* renamed from: g */
        private final C1562a f4663g = new C1562a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        /* loaded from: classes.dex */
        public static class C1562a {

            /* renamed from: a */
            private int f4664a;

            /* renamed from: b */
            private int f4665b;

            /* renamed from: c */
            private int f4666c;

            /* renamed from: d */
            private int f4667d;

            /* renamed from: e */
            private Interpolator f4668e;

            /* renamed from: f */
            private boolean f4669f;

            /* renamed from: g */
            private int f4670g;

            public C1562a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m36331e() {
                if (this.f4668e != null && this.f4666c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4666c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m36335a() {
                return this.f4667d >= 0;
            }

            /* renamed from: b */
            public void m36334b(int i) {
                this.f4667d = i;
            }

            /* renamed from: c */
            void m36333c(RecyclerView recyclerView) {
                int i = this.f4667d;
                if (i >= 0) {
                    this.f4667d = -1;
                    recyclerView.m36602z0(i);
                    this.f4669f = false;
                } else if (this.f4669f) {
                    m36331e();
                    recyclerView.f4498A0.m36591f(this.f4664a, this.f4665b, this.f4666c, this.f4668e);
                    int i2 = this.f4670g + 1;
                    this.f4670g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4669f = false;
                } else {
                    this.f4670g = 0;
                }
            }

            /* renamed from: d */
            public void m36332d(int i, int i2, int i3, Interpolator interpolator) {
                this.f4664a = i;
                this.f4665b = i2;
                this.f4666c = i3;
                this.f4668e = interpolator;
                this.f4669f = true;
            }

            public C1562a(int i, int i2, int i3, Interpolator interpolator) {
                this.f4667d = -1;
                this.f4669f = false;
                this.f4670g = 0;
                this.f4664a = i;
                this.f4665b = i2;
                this.f4666c = i3;
                this.f4668e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        /* loaded from: classes.dex */
        public interface InterfaceC1563b {
            /* renamed from: a */
            PointF mo36272a(int i);
        }

        /* renamed from: a */
        public PointF m36349a(int i) {
            AbstractC1546o m36345e = m36345e();
            if (m36345e instanceof InterfaceC1563b) {
                return ((InterfaceC1563b) m36345e).mo36272a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1563b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m36348b(int i) {
            return this.f4656b.f4513I.mo36496D(i);
        }

        /* renamed from: c */
        public int m36347c() {
            return this.f4656b.f4513I.m36483K();
        }

        /* renamed from: d */
        public int m36346d(View view) {
            return this.f4656b.m36659g0(view);
        }

        /* renamed from: e */
        public AbstractC1546o m36345e() {
            return this.f4657c;
        }

        /* renamed from: f */
        public int m36344f() {
            return this.f4662a;
        }

        /* renamed from: g */
        public boolean m36343g() {
            return this.f4658d;
        }

        /* renamed from: h */
        public boolean m36342h() {
            return this.f4659e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: i */
        public void m36341i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        void m36340j(int i, int i2) {
            PointF m36349a;
            RecyclerView recyclerView = this.f4656b;
            if (this.f4662a == -1 || recyclerView == null) {
                m36336r();
            }
            if (this.f4658d && this.f4660f == null && this.f4657c != null && (m36349a = m36349a(this.f4662a)) != null) {
                float f = m36349a.x;
                if (f != 0.0f || m36349a.y != 0.0f) {
                    recyclerView.m36646k1((int) Math.signum(f), (int) Math.signum(m36349a.y), null);
                }
            }
            this.f4658d = false;
            View view = this.f4660f;
            if (view != null) {
                if (m36346d(view) == this.f4662a) {
                    mo35811o(this.f4660f, recyclerView.f4504D0, this.f4663g);
                    this.f4663g.m36333c(recyclerView);
                    m36336r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4660f = null;
                }
            }
            if (this.f4659e) {
                mo35917l(i, i2, recyclerView.f4504D0, this.f4663g);
                boolean m36335a = this.f4663g.m36335a();
                this.f4663g.m36333c(recyclerView);
                if (m36335a && this.f4659e) {
                    this.f4658d = true;
                    recyclerView.f4498A0.m36592e();
                }
            }
        }

        /* renamed from: k */
        protected void m36339k(View view) {
            if (m36346d(view) == m36344f()) {
                this.f4660f = view;
            }
        }

        /* renamed from: l */
        protected abstract void mo35917l(int i, int i2, C1564z c1564z, C1562a c1562a);

        /* renamed from: m */
        protected abstract void mo35916m();

        /* renamed from: n */
        protected abstract void mo35915n();

        /* renamed from: o */
        protected abstract void mo35811o(View view, C1564z c1564z, C1562a c1562a);

        /* renamed from: p */
        public void m36338p(int i) {
            this.f4662a = i;
        }

        /* renamed from: q */
        void m36337q(RecyclerView recyclerView, AbstractC1546o abstractC1546o) {
            recyclerView.f4498A0.m36590g();
            if (this.f4661h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4656b = recyclerView;
            this.f4657c = abstractC1546o;
            int i = this.f4662a;
            if (i != -1) {
                recyclerView.f4504D0.f4676a = i;
                this.f4659e = true;
                this.f4658d = true;
                this.f4660f = m36348b(m36344f());
                mo35916m();
                this.f4656b.f4498A0.m36592e();
                this.f4661h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public final void m36336r() {
            if (this.f4659e) {
                this.f4659e = false;
                mo35915n();
                this.f4656b.f4504D0.f4676a = -1;
                this.f4660f = null;
                this.f4662a = -1;
                this.f4658d = false;
                this.f4657c.m36446g1(this);
                this.f4657c = null;
                this.f4656b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C1564z {

        /* renamed from: b */
        private SparseArray<Object> f4671b;

        /* renamed from: m */
        int f4672m;

        /* renamed from: n */
        long f4673n;

        /* renamed from: o */
        int f4674o;

        /* renamed from: p */
        int f4675p;

        /* renamed from: a */
        int f4676a = -1;

        /* renamed from: c */
        int f4677c = 0;

        /* renamed from: d */
        int f4678d = 0;

        /* renamed from: e */
        int f4679e = 1;

        /* renamed from: f */
        int f4680f = 0;

        /* renamed from: g */
        boolean f4681g = false;

        /* renamed from: h */
        boolean f4682h = false;

        /* renamed from: i */
        boolean f4683i = false;

        /* renamed from: j */
        boolean f4684j = false;

        /* renamed from: k */
        boolean f4685k = false;

        /* renamed from: l */
        boolean f4686l = false;

        /* renamed from: a */
        void m36330a(int i) {
            if ((this.f4679e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4679e));
        }

        /* renamed from: b */
        public int m36329b() {
            return this.f4682h ? this.f4677c - this.f4678d : this.f4680f;
        }

        /* renamed from: c */
        public int m36328c() {
            return this.f4676a;
        }

        /* renamed from: d */
        public boolean m36327d() {
            return this.f4676a != -1;
        }

        /* renamed from: e */
        public boolean m36326e() {
            return this.f4682h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public void m36325f(AbstractC1535g abstractC1535g) {
            this.f4679e = 1;
            this.f4680f = abstractC1535g.mo29834f();
            this.f4682h = false;
            this.f4683i = false;
            this.f4684j = false;
        }

        /* renamed from: g */
        public boolean m36324g() {
            return this.f4686l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4676a + ", mData=" + this.f4671b + ", mItemCount=" + this.f4680f + ", mIsMeasuring=" + this.f4684j + ", mPreviousLayoutItemCount=" + this.f4677c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4678d + ", mStructureChanged=" + this.f4681g + ", mInPreLayout=" + this.f4682h + ", mRunSimpleAnimations=" + this.f4685k + ", mRunPredictiveAnimations=" + this.f4686l + '}';
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f4489V0 = i == 18 || i == 19 || i == 20;
        f4490W0 = i >= 23;
        f4491X0 = i >= 16;
        f4492Y0 = i >= 21;
        f4493Z0 = i <= 15;
        f4494a1 = i <= 15;
        Class<?> cls = Integer.TYPE;
        f4495b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4496c1 = new animationInterpolatorC1530c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: B */
    private void m36727B() {
        int i = this.f4538V;
        this.f4538V = 0;
        if (i == 0 || !m36614v0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C1083b.m38604b(obtain, i);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: D */
    private void m36723D() {
        boolean z = true;
        this.f4504D0.m36330a(1);
        m36695R(this.f4504D0);
        this.f4504D0.f4684j = false;
        m36616u1();
        this.f4499B.m36138f();
        m36710J0();
        m36694R0();
        m36655h1();
        C1564z c1564z = this.f4504D0;
        c1564z.f4683i = (c1564z.f4685k && this.f4512H0) ? false : false;
        this.f4512H0 = false;
        this.f4510G0 = false;
        c1564z.f4682h = c1564z.f4686l;
        c1564z.f4680f = this.f4511H.mo29834f();
        m36685W(this.f4522M0);
        if (this.f4504D0.f4685k) {
            int m36102g = this.f4497A.m36102g();
            for (int i = 0; i < m36102g; i++) {
                AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36103f(i));
                if (!m36653i0.m36580J() && (!m36653i0.m36558t() || this.f4511H.m36543j())) {
                    this.f4499B.m36139e(m36653i0, this.f4551l0.m36514u(this.f4504D0, m36653i0, AbstractC1540l.m36525e(m36653i0), m36653i0.m36563o()));
                    if (this.f4504D0.f4683i && m36653i0.m36553y() && !m36653i0.m36556v() && !m36653i0.m36580J() && !m36653i0.m36558t()) {
                        this.f4499B.m36141c(m36665e0(m36653i0), m36653i0);
                    }
                }
            }
        }
        if (this.f4504D0.f4686l) {
            m36652i1();
            C1564z c1564z2 = this.f4504D0;
            boolean z2 = c1564z2.f4681g;
            c1564z2.f4681g = false;
            this.f4513I.mo36276Y0(this.f4564x, c1564z2);
            this.f4504D0.f4681g = z2;
            for (int i2 = 0; i2 < this.f4497A.m36102g(); i2++) {
                AbstractC1531c0 m36653i02 = m36653i0(this.f4497A.m36103f(i2));
                if (!m36653i02.m36580J() && !this.f4499B.m36135i(m36653i02)) {
                    int m36525e = AbstractC1540l.m36525e(m36653i02);
                    boolean m36562p = m36653i02.m36562p(8192);
                    if (!m36562p) {
                        m36525e |= 4096;
                    }
                    AbstractC1540l.C1543c m36514u = this.f4551l0.m36514u(this.f4504D0, m36653i02, m36525e, m36653i02.m36563o());
                    if (m36562p) {
                        m36688U0(m36653i02, m36514u);
                    } else {
                        this.f4499B.m36143a(m36653i02, m36514u);
                    }
                }
            }
            m36621t();
        } else {
            m36621t();
        }
        m36708K0();
        m36610w1(false);
        this.f4504D0.f4679e = 2;
    }

    /* renamed from: E */
    private void m36721E() {
        m36616u1();
        m36710J0();
        this.f4504D0.m36330a(6);
        this.f4568z.m36169j();
        this.f4504D0.f4680f = this.f4511H.mo29834f();
        C1564z c1564z = this.f4504D0;
        c1564z.f4678d = 0;
        c1564z.f4682h = false;
        this.f4513I.mo36276Y0(this.f4564x, c1564z);
        C1564z c1564z2 = this.f4504D0;
        c1564z2.f4681g = false;
        this.f4566y = null;
        c1564z2.f4685k = c1564z2.f4685k && this.f4551l0 != null;
        c1564z2.f4679e = 4;
        m36708K0();
        m36610w1(false);
    }

    /* renamed from: F */
    private void m36719F() {
        this.f4504D0.m36330a(4);
        m36616u1();
        m36710J0();
        C1564z c1564z = this.f4504D0;
        c1564z.f4679e = 1;
        if (c1564z.f4685k) {
            for (int m36102g = this.f4497A.m36102g() - 1; m36102g >= 0; m36102g--) {
                AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36103f(m36102g));
                if (!m36653i0.m36580J()) {
                    long m36665e0 = m36665e0(m36653i0);
                    AbstractC1540l.C1543c m36515t = this.f4551l0.m36515t(this.f4504D0, m36653i0);
                    AbstractC1531c0 m36137g = this.f4499B.m36137g(m36665e0);
                    if (m36137g != null && !m36137g.m36580J()) {
                        boolean m36136h = this.f4499B.m36136h(m36137g);
                        boolean m36136h2 = this.f4499B.m36136h(m36653i0);
                        if (m36136h && m36137g == m36653i0) {
                            this.f4499B.m36140d(m36653i0, m36515t);
                        } else {
                            AbstractC1540l.C1543c m36130n = this.f4499B.m36130n(m36137g);
                            this.f4499B.m36140d(m36653i0, m36515t);
                            AbstractC1540l.C1543c m36131m = this.f4499B.m36131m(m36653i0);
                            if (m36130n == null) {
                                m36638n0(m36665e0, m36653i0, m36137g);
                            } else {
                                m36639n(m36137g, m36653i0, m36130n, m36131m, m36136h, m36136h2);
                            }
                        }
                    } else {
                        this.f4499B.m36140d(m36653i0, m36515t);
                    }
                }
            }
            this.f4499B.m36129o(this.f4536T0);
        }
        this.f4513I.m36433m1(this.f4564x);
        C1564z c1564z2 = this.f4504D0;
        c1564z2.f4677c = c1564z2.f4680f;
        this.f4542c0 = false;
        this.f4543d0 = false;
        c1564z2.f4685k = false;
        c1564z2.f4686l = false;
        this.f4513I.f4620h = false;
        ArrayList<AbstractC1531c0> arrayList = this.f4564x.f4648b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o.f4626n) {
            abstractC1546o.f4625m = 0;
            abstractC1546o.f4626n = false;
            this.f4564x.m36380K();
        }
        this.f4513I.mo36274Z0(this.f4504D0);
        m36708K0();
        m36610w1(false);
        this.f4499B.m36138f();
        int[] iArr = this.f4522M0;
        if (m36606y(iArr[0], iArr[1])) {
            m36711J(0, 0);
        }
        m36686V0();
        m36661f1();
    }

    /* renamed from: L */
    private boolean m36707L(MotionEvent motionEvent) {
        InterfaceC1554s interfaceC1554s = this.f4521M;
        if (interfaceC1554s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m36687V(motionEvent);
        }
        interfaceC1554s.mo35966c(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4521M = null;
        }
        return true;
    }

    /* renamed from: M0 */
    private void m36704M0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4553n0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4553n0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4557r0 = x;
            this.f4555p0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4558s0 = y;
            this.f4556q0 = y;
        }
    }

    /* renamed from: Q0 */
    private boolean m36696Q0() {
        return this.f4551l0 != null && this.f4513I.mo36302M1();
    }

    /* renamed from: R0 */
    private void m36694R0() {
        boolean z;
        if (this.f4542c0) {
            this.f4568z.m36154y();
            if (this.f4543d0) {
                this.f4513I.mo36285T0(this);
            }
        }
        if (m36696Q0()) {
            this.f4568z.m36156w();
        } else {
            this.f4568z.m36169j();
        }
        boolean z2 = false;
        boolean z3 = this.f4510G0 || this.f4512H0;
        this.f4504D0.f4685k = this.f4529Q && this.f4551l0 != null && ((z = this.f4542c0) || z3 || this.f4513I.f4620h) && (!z || this.f4511H.m36543j());
        C1564z c1564z = this.f4504D0;
        if (c1564z.f4685k && z3 && !this.f4542c0 && m36696Q0()) {
            z2 = true;
        }
        c1564z.f4686l = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36690T0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.m36703N()
            android.widget.EdgeEffect r1 = r6.f4547h0
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C1229d.m37917c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.m36701O()
            android.widget.EdgeEffect r1 = r6.f4549j0
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C1229d.m37917c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.m36699P()
            android.widget.EdgeEffect r9 = r6.f4548i0
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C1229d.m37917c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.m36705M()
            android.widget.EdgeEffect r9 = r6.f4550k0
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C1229d.m37917c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C1112b0.m38423j0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m36690T0(float, float, float, float):void");
    }

    /* renamed from: V */
    private boolean m36687V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4519L.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1554s interfaceC1554s = this.f4519L.get(i);
            if (interfaceC1554s.mo35967a(this, motionEvent) && action != 3) {
                this.f4521M = interfaceC1554s;
                return true;
            }
        }
        return false;
    }

    /* renamed from: V0 */
    private void m36686V0() {
        View findViewById;
        if (!this.f4569z0 || this.f4511H == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (f4494a1 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.f4497A.m36102g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.f4497A.m36095n(focusedChild)) {
                return;
            }
        }
        View view = null;
        AbstractC1531c0 m36676a0 = (this.f4504D0.f4673n == -1 || !this.f4511H.m36543j()) ? null : m36676a0(this.f4504D0.f4673n);
        if (m36676a0 != null && !this.f4497A.m36095n(m36676a0.f4581a) && m36676a0.f4581a.hasFocusable()) {
            view = m36676a0.f4581a;
        } else if (this.f4497A.m36102g() > 0) {
            view = m36681Y();
        }
        if (view != null) {
            int i = this.f4504D0.f4674o;
            if (i != -1 && (findViewById = view.findViewById(i)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    /* renamed from: W */
    private void m36685W(int[] iArr) {
        int m36102g = this.f4497A.m36102g();
        if (m36102g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Reader.READ_DONE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m36102g; i3++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36103f(i3));
            if (!m36653i0.m36580J()) {
                int m36565m = m36653i0.m36565m();
                if (m36565m < i) {
                    i = m36565m;
                }
                if (m36565m > i2) {
                    i2 = m36565m;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: W0 */
    private void m36684W0() {
        boolean z;
        EdgeEffect edgeEffect = this.f4547h0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f4547h0.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f4548i0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4548i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4549j0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4549j0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4550k0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4550k0.isFinished();
        }
        if (z) {
            C1112b0.m38423j0(this);
        }
    }

    /* renamed from: X */
    static RecyclerView m36683X(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView m36683X = m36683X(viewGroup.getChildAt(i));
                if (m36683X != null) {
                    return m36683X;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: Y */
    private View m36681Y() {
        AbstractC1531c0 m36679Z;
        C1564z c1564z = this.f4504D0;
        int i = c1564z.f4672m;
        if (i == -1) {
            i = 0;
        }
        int m36329b = c1564z.m36329b();
        for (int i2 = i; i2 < m36329b; i2++) {
            AbstractC1531c0 m36679Z2 = m36679Z(i2);
            if (m36679Z2 == null) {
                break;
            } else if (m36679Z2.f4581a.hasFocusable()) {
                return m36679Z2.f4581a;
            }
        }
        int min = Math.min(m36329b, i);
        while (true) {
            min--;
            if (min < 0 || (m36679Z = m36679Z(min)) == null) {
                return null;
            }
            if (m36679Z.f4581a.hasFocusable()) {
                return m36679Z.f4581a;
            }
        }
    }

    /* renamed from: e1 */
    private void m36664e1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4505E.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1551p) {
            C1551p c1551p = (C1551p) layoutParams;
            if (!c1551p.f4639c) {
                Rect rect = c1551p.f4638b;
                Rect rect2 = this.f4505E;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4505E);
            offsetRectIntoDescendantCoords(view, this.f4505E);
        }
        this.f4513I.mo35470t1(this, view, this.f4505E, !this.f4529Q, view2 == null);
    }

    /* renamed from: f1 */
    private void m36661f1() {
        C1564z c1564z = this.f4504D0;
        c1564z.f4673n = -1L;
        c1564z.f4672m = -1;
        c1564z.f4674o = -1;
    }

    /* renamed from: g */
    private void m36660g(AbstractC1531c0 abstractC1531c0) {
        View view = abstractC1531c0.f4581a;
        boolean z = view.getParent() == this;
        this.f4564x.m36381J(m36656h0(view));
        if (abstractC1531c0.m36554x()) {
            this.f4497A.m36106c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4497A.m36107b(view, true);
        } else {
            this.f4497A.m36098k(view);
        }
    }

    /* renamed from: g1 */
    private void m36658g1() {
        VelocityTracker velocityTracker = this.f4554o0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m36607x1(0);
        m36684W0();
    }

    private C1206p getScrollingChildHelper() {
        if (this.f4524N0 == null) {
            this.f4524N0 = new C1206p(this);
        }
        return this.f4524N0;
    }

    /* renamed from: h1 */
    private void m36655h1() {
        int m36568j;
        View focusedChild = (this.f4569z0 && hasFocus() && this.f4511H != null) ? getFocusedChild() : null;
        AbstractC1531c0 m36689U = focusedChild != null ? m36689U(focusedChild) : null;
        if (m36689U == null) {
            m36661f1();
            return;
        }
        this.f4504D0.f4673n = this.f4511H.m36543j() ? m36689U.m36567k() : -1L;
        C1564z c1564z = this.f4504D0;
        if (this.f4542c0) {
            m36568j = -1;
        } else {
            m36568j = m36689U.m36556v() ? m36689U.f4586d : m36689U.m36568j();
        }
        c1564z.f4672m = m36568j;
        this.f4504D0.f4674o = m36647k0(m36689U.f4581a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static AbstractC1531c0 m36653i0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1551p) view.getLayoutParams()).f4637a;
    }

    /* renamed from: j0 */
    static void m36650j0(View view, Rect rect) {
        C1551p c1551p = (C1551p) view.getLayoutParams();
        Rect rect2 = c1551p.f4638b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c1551p).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c1551p).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c1551p).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1551p).bottomMargin);
    }

    /* renamed from: k0 */
    private int m36647k0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    /* renamed from: l0 */
    private String m36644l0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: m1 */
    private void m36640m1(AbstractC1535g abstractC1535g, boolean z, boolean z2) {
        AbstractC1535g abstractC1535g2 = this.f4511H;
        if (abstractC1535g2 != null) {
            abstractC1535g2.m36548C(this.f4562w);
            this.f4511H.mo35511v(this);
        }
        if (!z || z2) {
            m36682X0();
        }
        this.f4568z.m36154y();
        AbstractC1535g abstractC1535g3 = this.f4511H;
        this.f4511H = abstractC1535g;
        if (abstractC1535g != null) {
            abstractC1535g.m36550A(this.f4562w);
            abstractC1535g.mo35512r(this);
        }
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.m36494F0(abstractC1535g3, this.f4511H);
        }
        this.f4564x.m36354x(abstractC1535g3, this.f4511H, z);
        this.f4504D0.f4681g = true;
    }

    /* renamed from: n */
    private void m36639n(AbstractC1531c0 abstractC1531c0, AbstractC1531c0 abstractC1531c02, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2, boolean z, boolean z2) {
        abstractC1531c0.m36583G(false);
        if (z) {
            m36660g(abstractC1531c0);
        }
        if (abstractC1531c0 != abstractC1531c02) {
            if (z2) {
                m36660g(abstractC1531c02);
            }
            abstractC1531c0.f4590h = abstractC1531c02;
            m36660g(abstractC1531c0);
            this.f4564x.m36381J(abstractC1531c0);
            abstractC1531c02.m36583G(false);
            abstractC1531c02.f4591i = abstractC1531c0;
        }
        if (this.f4551l0.mo35829b(abstractC1531c0, abstractC1531c02, c1543c, c1543c2)) {
            m36698P0();
        }
    }

    /* renamed from: n0 */
    private void m36638n0(long j, AbstractC1531c0 abstractC1531c0, AbstractC1531c0 abstractC1531c02) {
        int m36102g = this.f4497A.m36102g();
        for (int i = 0; i < m36102g; i++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36103f(i));
            if (m36653i0 != abstractC1531c0 && m36665e0(m36653i0) == j) {
                AbstractC1535g abstractC1535g = this.f4511H;
                if (abstractC1535g != null && abstractC1535g.m36543j()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m36653i0 + " \n View Holder 2:" + abstractC1531c0 + m36697Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m36653i0 + " \n View Holder 2:" + abstractC1531c0 + m36697Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC1531c02 + " cannot be found but it is necessary for " + abstractC1531c0 + m36697Q());
    }

    /* renamed from: p0 */
    private boolean m36632p0() {
        int m36102g = this.f4497A.m36102g();
        for (int i = 0; i < m36102g; i++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36103f(i));
            if (m36653i0 != null && !m36653i0.m36580J() && m36653i0.m36553y()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private void m36627r() {
        m36658g1();
        setScrollState(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: r0 */
    private void m36626r0() {
        if (C1112b0.m38478D(this) == 0) {
            C1112b0.m38477D0(this, 8);
        }
    }

    /* renamed from: s */
    static void m36624s(AbstractC1531c0 abstractC1531c0) {
        WeakReference<RecyclerView> weakReference = abstractC1531c0.f4582b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1531c0.f4581a) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1531c0.f4582b = null;
        }
    }

    /* renamed from: s0 */
    private void m36623s0() {
        this.f4497A = new C1587f(new C1533e());
    }

    /* renamed from: w */
    private void m36612w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m36644l0 = m36644l0(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(m36644l0, false, classLoader).asSubclass(AbstractC1546o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(f4495b1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m36644l0, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1546o) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m36644l0, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m36644l0, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m36644l0, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m36644l0, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m36644l0, e7);
            }
        }
    }

    /* renamed from: y */
    private boolean m36606y(int i, int i2) {
        m36685W(this.f4522M0);
        int[] iArr = this.f4522M0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* renamed from: y0 */
    private boolean m36605y0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || m36691T(view2) == null) {
            return false;
        }
        if (view == null || m36691T(view) == null) {
            return true;
        }
        this.f4505E.set(0, 0, view.getWidth(), view.getHeight());
        this.f4507F.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4505E);
        offsetDescendantRectToMyCoords(view2, this.f4507F);
        char c = 65535;
        int i3 = this.f4513I.m36461a0() == 1 ? -1 : 1;
        Rect rect = this.f4505E;
        int i4 = rect.left;
        Rect rect2 = this.f4507F;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 <= 0);
        } else if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 >= 0);
        } else if (i == 17) {
            return i2 < 0;
        } else if (i == 33) {
            return c < 0;
        } else if (i == 66) {
            return i2 > 0;
        } else if (i == 130) {
            return c > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i + m36697Q());
        }
    }

    /* renamed from: z1 */
    private void m36601z1() {
        this.f4498A0.m36590g();
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.m36480L1();
        }
    }

    /* renamed from: A */
    void m36730A(View view) {
        AbstractC1531c0 m36653i0 = m36653i0(view);
        m36712I0(view);
        AbstractC1535g abstractC1535g = this.f4511H;
        if (abstractC1535g != null && m36653i0 != null) {
            abstractC1535g.m36534y(m36653i0);
        }
        List<InterfaceC1552q> list = this.f4541b0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4541b0.get(size).mo35478d(view);
            }
        }
    }

    /* renamed from: A0 */
    void m36729A0() {
        int m36099j = this.f4497A.m36099j();
        for (int i = 0; i < m36099j; i++) {
            ((C1551p) this.f4497A.m36100i(i).getLayoutParams()).f4639c = true;
        }
        this.f4564x.m36359s();
    }

    /* renamed from: A1 */
    void m36728A1(int i, int i2, Object obj) {
        int i3;
        int m36099j = this.f4497A.m36099j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < m36099j; i5++) {
            View m36100i = this.f4497A.m36100i(i5);
            AbstractC1531c0 m36653i0 = m36653i0(m36100i);
            if (m36653i0 != null && !m36653i0.m36580J() && (i3 = m36653i0.f4585c) >= i && i3 < i4) {
                m36653i0.m36576b(2);
                m36653i0.m36577a(obj);
                ((C1551p) m36100i.getLayoutParams()).f4639c = true;
            }
        }
        this.f4564x.m36378M(i, i2);
    }

    /* renamed from: B0 */
    void m36726B0() {
        int m36099j = this.f4497A.m36099j();
        for (int i = 0; i < m36099j; i++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i));
            if (m36653i0 != null && !m36653i0.m36580J()) {
                m36653i0.m36576b(6);
            }
        }
        m36729A0();
        this.f4564x.m36358t();
    }

    /* renamed from: C */
    void m36725C() {
        if (this.f4511H == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f4513I == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            C1564z c1564z = this.f4504D0;
            c1564z.f4684j = false;
            if (c1564z.f4679e == 1) {
                m36723D();
                this.f4513I.m36503A1(this);
                m36721E();
            } else if (!this.f4568z.m36162q() && this.f4513I.m36427p0() == getWidth() && this.f4513I.m36464X() == getHeight()) {
                this.f4513I.m36503A1(this);
            } else {
                this.f4513I.m36503A1(this);
                m36721E();
            }
            m36719F();
        }
    }

    /* renamed from: C0 */
    public void m36724C0(int i) {
        int m36102g = this.f4497A.m36102g();
        for (int i2 = 0; i2 < m36102g; i2++) {
            this.f4497A.m36103f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: D0 */
    public void m36722D0(int i) {
        int m36102g = this.f4497A.m36102g();
        for (int i2 = 0; i2 < m36102g; i2++) {
            this.f4497A.m36103f(i2).offsetTopAndBottom(i);
        }
    }

    /* renamed from: E0 */
    void m36720E0(int i, int i2) {
        int m36099j = this.f4497A.m36099j();
        for (int i3 = 0; i3 < m36099j; i3++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i3));
            if (m36653i0 != null && !m36653i0.m36580J() && m36653i0.f4585c >= i) {
                m36653i0.m36589A(i2, false);
                this.f4504D0.f4681g = true;
            }
        }
        this.f4564x.m36357u(i, i2);
        requestLayout();
    }

    /* renamed from: F0 */
    void m36718F0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int m36099j = this.f4497A.m36099j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < m36099j; i7++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i7));
            if (m36653i0 != null && (i6 = m36653i0.f4585c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    m36653i0.m36589A(i2 - i, false);
                } else {
                    m36653i0.m36589A(i5, false);
                }
                this.f4504D0.f4681g = true;
            }
        }
        this.f4564x.m36356v(i, i2);
        requestLayout();
    }

    /* renamed from: G */
    public boolean m36717G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m38037d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: G0 */
    void m36716G0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m36099j = this.f4497A.m36099j();
        for (int i4 = 0; i4 < m36099j; i4++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i4));
            if (m36653i0 != null && !m36653i0.m36580J()) {
                int i5 = m36653i0.f4585c;
                if (i5 >= i3) {
                    m36653i0.m36589A(-i2, z);
                    this.f4504D0.f4681g = true;
                } else if (i5 >= i) {
                    m36653i0.m36569i(i - 1, -i2, z);
                    this.f4504D0.f4681g = true;
                }
            }
        }
        this.f4564x.m36355w(i, i2, z);
        requestLayout();
    }

    /* renamed from: H */
    public final void m36715H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m38036e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    public void m36714H0(View view) {
    }

    /* renamed from: I */
    void m36713I(int i) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.mo36264f1(i);
        }
        m36702N0(i);
        AbstractC1555t abstractC1555t = this.f4506E0;
        if (abstractC1555t != null) {
            abstractC1555t.mo29914a(this, i);
        }
        List<AbstractC1555t> list = this.f4508F0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4508F0.get(size).mo29914a(this, i);
            }
        }
    }

    /* renamed from: I0 */
    public void m36712I0(View view) {
    }

    /* renamed from: J */
    void m36711J(int i, int i2) {
        this.f4545f0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        m36700O0(i, i2);
        AbstractC1555t abstractC1555t = this.f4506E0;
        if (abstractC1555t != null) {
            abstractC1555t.mo29913b(this, i, i2);
        }
        List<AbstractC1555t> list = this.f4508F0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4508F0.get(size).mo29913b(this, i, i2);
            }
        }
        this.f4545f0--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void m36710J0() {
        this.f4544e0++;
    }

    /* renamed from: K */
    void m36709K() {
        int i;
        for (int size = this.f4532R0.size() - 1; size >= 0; size--) {
            AbstractC1531c0 abstractC1531c0 = this.f4532R0.get(size);
            if (abstractC1531c0.f4581a.getParent() == this && !abstractC1531c0.m36580J() && (i = abstractC1531c0.f4598q) != -1) {
                C1112b0.m38479C0(abstractC1531c0.f4581a, i);
                abstractC1531c0.f4598q = -1;
            }
        }
        this.f4532R0.clear();
    }

    /* renamed from: K0 */
    void m36708K0() {
        m36706L0(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public void m36706L0(boolean z) {
        int i = this.f4544e0 - 1;
        this.f4544e0 = i;
        if (i < 1) {
            this.f4544e0 = 0;
            if (z) {
                m36727B();
                m36709K();
            }
        }
    }

    /* renamed from: M */
    void m36705M() {
        if (this.f4550k0 != null) {
            return;
        }
        EdgeEffect m36526a = this.f4546g0.m36526a(this, 3);
        this.f4550k0 = m36526a;
        if (this.f4501C) {
            m36526a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m36526a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: N */
    void m36703N() {
        if (this.f4547h0 != null) {
            return;
        }
        EdgeEffect m36526a = this.f4546g0.m36526a(this, 0);
        this.f4547h0 = m36526a;
        if (this.f4501C) {
            m36526a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m36526a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: N0 */
    public void m36702N0(int i) {
    }

    /* renamed from: O */
    void m36701O() {
        if (this.f4549j0 != null) {
            return;
        }
        EdgeEffect m36526a = this.f4546g0.m36526a(this, 2);
        this.f4549j0 = m36526a;
        if (this.f4501C) {
            m36526a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m36526a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: O0 */
    public void m36700O0(int i, int i2) {
    }

    /* renamed from: P */
    void m36699P() {
        if (this.f4548i0 != null) {
            return;
        }
        EdgeEffect m36526a = this.f4546g0.m36526a(this, 1);
        this.f4548i0 = m36526a;
        if (this.f4501C) {
            m36526a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m36526a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: P0 */
    void m36698P0() {
        if (this.f4516J0 || !this.f4523N) {
            return;
        }
        C1112b0.m38421k0(this, this.f4534S0);
        this.f4516J0 = true;
    }

    /* renamed from: Q */
    String m36697Q() {
        return " " + super.toString() + ", adapter:" + this.f4511H + ", layout:" + this.f4513I + ", context:" + getContext();
    }

    /* renamed from: R */
    final void m36695R(C1564z c1564z) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4498A0.f4578y;
            c1564z.f4675p = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c1564z.f4675p = 0;
    }

    /* renamed from: S */
    public View m36693S(float f, float f2) {
        for (int m36102g = this.f4497A.m36102g() - 1; m36102g >= 0; m36102g--) {
            View m36103f = this.f4497A.m36103f(m36102g);
            float translationX = m36103f.getTranslationX();
            float translationY = m36103f.getTranslationY();
            if (f >= m36103f.getLeft() + translationX && f <= m36103f.getRight() + translationX && f2 >= m36103f.getTop() + translationY && f2 <= m36103f.getBottom() + translationY) {
                return m36103f;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    void m36692S0(boolean z) {
        this.f4543d0 = z | this.f4543d0;
        this.f4542c0 = true;
        m36726B0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View m36691T(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m36691T(android.view.View):android.view.View");
    }

    /* renamed from: U */
    public AbstractC1531c0 m36689U(View view) {
        View m36691T = m36691T(view);
        if (m36691T == null) {
            return null;
        }
        return m36656h0(m36691T);
    }

    /* renamed from: U0 */
    void m36688U0(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c) {
        abstractC1531c0.m36584F(0, 8192);
        if (this.f4504D0.f4683i && abstractC1531c0.m36553y() && !abstractC1531c0.m36556v() && !abstractC1531c0.m36580J()) {
            this.f4499B.m36141c(m36665e0(abstractC1531c0), abstractC1531c0);
        }
        this.f4499B.m36139e(abstractC1531c0, c1543c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void m36682X0() {
        AbstractC1540l abstractC1540l = this.f4551l0;
        if (abstractC1540l != null) {
            abstractC1540l.mo36057k();
        }
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.m36435l1(this.f4564x);
            this.f4513I.m36433m1(this.f4564x);
        }
        this.f4564x.m36375c();
    }

    /* renamed from: Y0 */
    boolean m36680Y0(View view) {
        m36616u1();
        boolean m36091r = this.f4497A.m36091r(view);
        if (m36091r) {
            AbstractC1531c0 m36653i0 = m36653i0(view);
            this.f4564x.m36381J(m36653i0);
            this.f4564x.m36388C(m36653i0);
        }
        m36610w1(!m36091r);
        return m36091r;
    }

    /* renamed from: Z */
    public AbstractC1531c0 m36679Z(int i) {
        AbstractC1531c0 abstractC1531c0 = null;
        if (this.f4542c0) {
            return null;
        }
        int m36099j = this.f4497A.m36099j();
        for (int i2 = 0; i2 < m36099j; i2++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i2));
            if (m36653i0 != null && !m36653i0.m36556v() && m36668d0(m36653i0) == i) {
                if (!this.f4497A.m36095n(m36653i0.f4581a)) {
                    return m36653i0;
                }
                abstractC1531c0 = m36653i0;
            }
        }
        return abstractC1531c0;
    }

    /* renamed from: Z0 */
    public void m36678Z0(AbstractC1545n abstractC1545n) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.mo36261h("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4517K.remove(abstractC1545n);
        if (this.f4517K.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m36729A0();
        requestLayout();
    }

    /* renamed from: a */
    void m36677a(int i, int i2) {
        if (i < 0) {
            m36703N();
            if (this.f4547h0.isFinished()) {
                this.f4547h0.onAbsorb(-i);
            }
        } else if (i > 0) {
            m36701O();
            if (this.f4549j0.isFinished()) {
                this.f4549j0.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m36699P();
            if (this.f4548i0.isFinished()) {
                this.f4548i0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m36705M();
            if (this.f4550k0.isFinished()) {
                this.f4550k0.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        C1112b0.m38423j0(this);
    }

    /* renamed from: a0 */
    public AbstractC1531c0 m36676a0(long j) {
        AbstractC1535g abstractC1535g = this.f4511H;
        AbstractC1531c0 abstractC1531c0 = null;
        if (abstractC1535g != null && abstractC1535g.m36543j()) {
            int m36099j = this.f4497A.m36099j();
            for (int i = 0; i < m36099j; i++) {
                AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i));
                if (m36653i0 != null && !m36653i0.m36556v() && m36653i0.m36567k() == j) {
                    if (!this.f4497A.m36095n(m36653i0.f4581a)) {
                        return m36653i0;
                    }
                    abstractC1531c0 = m36653i0;
                }
            }
        }
        return abstractC1531c0;
    }

    /* renamed from: a1 */
    public void m36675a1(InterfaceC1552q interfaceC1552q) {
        List<InterfaceC1552q> list = this.f4541b0;
        if (list == null) {
            return;
        }
        list.remove(interfaceC1552q);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null || !abstractC1546o.m36492G0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.AbstractC1531c0 m36674b0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.f4497A
            int r0 = r0.m36099j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.f4497A
            android.view.View r3 = r3.m36100i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = m36653i0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.m36556v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4585c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m36565m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.f4497A
            android.view.View r4 = r3.f4581a
            boolean r1 = r1.m36095n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m36674b0(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    /* renamed from: b1 */
    public void m36673b1(InterfaceC1554s interfaceC1554s) {
        this.f4519L.remove(interfaceC1554s);
        if (this.f4521M == interfaceC1554s) {
            this.f4521M = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: c0 */
    public boolean m36671c0(int i, int i2) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f4535T) {
            return false;
        } else {
            int mo36256l = abstractC1546o.mo36256l();
            boolean mo36253m = this.f4513I.mo36253m();
            if (mo36256l == 0 || Math.abs(i) < this.f4561v0) {
                i = 0;
            }
            if (!mo36253m || Math.abs(i2) < this.f4561v0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            float f2 = i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = mo36256l != 0 || mo36253m;
                dispatchNestedFling(f, f2, z);
                AbstractC1553r abstractC1553r = this.f4560u0;
                if (abstractC1553r != null && abstractC1553r.mo35822a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (mo36253m) {
                        mo36256l = (mo36256l == true ? 1 : 0) | 2;
                    }
                    m36613v1(mo36256l, 1);
                    int i3 = this.f4563w0;
                    int max = Math.max(-i3, Math.min(i, i3));
                    int i4 = this.f4563w0;
                    this.f4498A0.m36594c(max, Math.max(-i4, Math.min(i2, i4)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c1 */
    public void m36670c1(AbstractC1555t abstractC1555t) {
        List<AbstractC1555t> list = this.f4508F0;
        if (list != null) {
            list.remove(abstractC1555t);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1551p) && this.f4513I.mo36251n((C1551p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36256l()) {
            return this.f4513I.mo36245r(this.f4504D0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36256l()) {
            return this.f4513I.mo36243s(this.f4504D0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36256l()) {
            return this.f4513I.mo36241t(this.f4504D0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36253m()) {
            return this.f4513I.mo36238u(this.f4504D0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36253m()) {
            return this.f4513I.mo36236v(this.f4504D0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null && abstractC1546o.mo36253m()) {
            return this.f4513I.mo36234w(this.f4504D0);
        }
        return 0;
    }

    /* renamed from: d0 */
    int m36668d0(AbstractC1531c0 abstractC1531c0) {
        if (abstractC1531c0.m36562p(524) || !abstractC1531c0.m36559s()) {
            return -1;
        }
        return this.f4568z.m36174e(abstractC1531c0.f4585c);
    }

    /* renamed from: d1 */
    void m36667d1() {
        AbstractC1531c0 abstractC1531c0;
        int m36102g = this.f4497A.m36102g();
        for (int i = 0; i < m36102g; i++) {
            View m36103f = this.f4497A.m36103f(i);
            AbstractC1531c0 m36656h0 = m36656h0(m36103f);
            if (m36656h0 != null && (abstractC1531c0 = m36656h0.f4591i) != null) {
                View view = abstractC1531c0.f4581a;
                int left = m36103f.getLeft();
                int top = m36103f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m38040a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m38039b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m38038c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m38035f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f4517K.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f4517K.get(i).mo35983k(canvas, this, this.f4504D0);
        }
        EdgeEffect edgeEffect = this.f4547h0;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4501C ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4547h0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4548i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4501C) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4548i0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4549j0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4501C ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4549j0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4550k0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4501C) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4550k0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f4551l0 == null || this.f4517K.size() <= 0 || !this.f4551l0.mo36056p()) {
            z3 = z;
        }
        if (z3) {
            C1112b0.m38423j0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    long m36665e0(AbstractC1531c0 abstractC1531c0) {
        return this.f4511H.m36543j() ? abstractC1531c0.m36567k() : abstractC1531c0.f4585c;
    }

    /* renamed from: f0 */
    public int m36662f0(View view) {
        AbstractC1531c0 m36653i0 = m36653i0(view);
        if (m36653i0 != null) {
            return m36653i0.m36568j();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View m36471R0 = this.f4513I.m36471R0(view, i);
        if (m36471R0 != null) {
            return m36471R0;
        }
        boolean z2 = (this.f4511H == null || this.f4513I == null || m36608x0() || this.f4535T) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f4513I.mo36253m()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (f4493Z0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f4513I.mo36256l()) {
                int i3 = (this.f4513I.m36461a0() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (f4493Z0) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                m36615v();
                if (m36691T(view) == null) {
                    return null;
                }
                m36616u1();
                this.f4513I.mo36306K0(view, i, this.f4564x, this.f4504D0);
                m36610w1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                m36615v();
                if (m36691T(view) == null) {
                    return null;
                }
                m36616u1();
                view2 = this.f4513I.mo36306K0(view, i, this.f4564x, this.f4504D0);
                m36610w1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m36605y0(view, view2, i) ? view2 : super.focusSearch(view, i);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            m36664e1(view2, null);
            return view;
        }
    }

    /* renamed from: g0 */
    public int m36659g0(View view) {
        AbstractC1531c0 m36653i0 = m36653i0(view);
        if (m36653i0 != null) {
            return m36653i0.m36565m();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            return abstractC1546o.mo36317E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m36697Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            return abstractC1546o.mo36314F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m36697Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1535g getAdapter() {
        return this.f4511H;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            return abstractC1546o.m36490H();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        InterfaceC1538j interfaceC1538j = this.f4520L0;
        if (interfaceC1538j == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return interfaceC1538j.mo35964a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4501C;
    }

    public C1647v getCompatAccessibilityDelegate() {
        return this.f4518K0;
    }

    public C1539k getEdgeEffectFactory() {
        return this.f4546g0;
    }

    public AbstractC1540l getItemAnimator() {
        return this.f4551l0;
    }

    public int getItemDecorationCount() {
        return this.f4517K.size();
    }

    public AbstractC1546o getLayoutManager() {
        return this.f4513I;
    }

    public int getMaxFlingVelocity() {
        return this.f4563w0;
    }

    public int getMinFlingVelocity() {
        return this.f4561v0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f4492Y0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1553r getOnFlingListener() {
        return this.f4560u0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4569z0;
    }

    public C1556u getRecycledViewPool() {
        return this.f4564x.m36369i();
    }

    public int getScrollState() {
        return this.f4552m0;
    }

    /* renamed from: h */
    public void m36657h(AbstractC1545n abstractC1545n) {
        m36654i(abstractC1545n, -1);
    }

    /* renamed from: h0 */
    public AbstractC1531c0 m36656h0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m36653i0(view);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m38031j();
    }

    /* renamed from: i */
    public void m36654i(AbstractC1545n abstractC1545n, int i) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.mo36261h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4517K.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4517K.add(abstractC1545n);
        } else {
            this.f4517K.add(i, abstractC1545n);
        }
        m36729A0();
        requestLayout();
    }

    /* renamed from: i1 */
    void m36652i1() {
        int m36099j = this.f4497A.m36099j();
        for (int i = 0; i < m36099j; i++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i));
            if (!m36653i0.m36580J()) {
                m36653i0.m36585E();
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4523N;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4535T;
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m38029l();
    }

    /* renamed from: j */
    public void m36651j(InterfaceC1552q interfaceC1552q) {
        if (this.f4541b0 == null) {
            this.f4541b0 = new ArrayList();
        }
        this.f4541b0.add(interfaceC1552q);
    }

    /* renamed from: j1 */
    boolean m36649j1(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        m36615v();
        if (this.f4511H != null) {
            int[] iArr = this.f4530Q0;
            iArr[0] = 0;
            iArr[1] = 0;
            m36646k1(i, i2, iArr);
            int[] iArr2 = this.f4530Q0;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f4517K.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4530Q0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m36715H(i4, i3, i5, i6, this.f4526O0, 0, iArr3);
        int[] iArr4 = this.f4530Q0;
        int i9 = i5 - iArr4[0];
        int i10 = i6 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.f4557r0;
        int[] iArr5 = this.f4526O0;
        this.f4557r0 = i11 - iArr5[0];
        this.f4558s0 -= iArr5[1];
        int[] iArr6 = this.f4528P0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C1198n.m38051a(motionEvent, 8194)) {
                m36690T0(motionEvent.getX(), i9, motionEvent.getY(), i10);
            }
            m36618u(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            m36711J(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    /* renamed from: k */
    public void m36648k(InterfaceC1554s interfaceC1554s) {
        this.f4519L.add(interfaceC1554s);
    }

    /* renamed from: k1 */
    void m36646k1(int i, int i2, int[] iArr) {
        m36616u1();
        m36710J0();
        C1020i.m38740a("RV Scroll");
        m36695R(this.f4504D0);
        int mo36232x1 = i != 0 ? this.f4513I.mo36232x1(i, this.f4564x, this.f4504D0) : 0;
        int mo36228z1 = i2 != 0 ? this.f4513I.mo36228z1(i2, this.f4564x, this.f4504D0) : 0;
        C1020i.m38739b();
        m36667d1();
        m36708K0();
        m36610w1(false);
        if (iArr != null) {
            iArr[0] = mo36232x1;
            iArr[1] = mo36228z1;
        }
    }

    /* renamed from: l */
    public void m36645l(AbstractC1555t abstractC1555t) {
        if (this.f4508F0 == null) {
            this.f4508F0 = new ArrayList();
        }
        this.f4508F0.add(abstractC1555t);
    }

    /* renamed from: l1 */
    public void m36643l1(int i) {
        if (this.f4535T) {
            return;
        }
        m36604y1();
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        abstractC1546o.mo36230y1(i);
        awakenScrollBars();
    }

    /* renamed from: m */
    void m36642m(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2) {
        abstractC1531c0.m36583G(false);
        if (this.f4551l0.mo35830a(abstractC1531c0, c1543c, c1543c2)) {
            m36698P0();
        }
    }

    /* renamed from: m0 */
    Rect m36641m0(View view) {
        C1551p c1551p = (C1551p) view.getLayoutParams();
        if (!c1551p.f4639c) {
            return c1551p.f4638b;
        }
        if (this.f4504D0.m36326e() && (c1551p.m36405b() || c1551p.m36403d())) {
            return c1551p.f4638b;
        }
        Rect rect = c1551p.f4638b;
        rect.set(0, 0, 0, 0);
        int size = this.f4517K.size();
        for (int i = 0; i < size; i++) {
            this.f4505E.set(0, 0, 0, 0);
            this.f4517K.get(i).mo35984g(this.f4505E, view, this, this.f4504D0);
            int i2 = rect.left;
            Rect rect2 = this.f4505E;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1551p.f4639c = false;
        return rect;
    }

    /* renamed from: n1 */
    boolean m36637n1(AbstractC1531c0 abstractC1531c0, int i) {
        if (m36608x0()) {
            abstractC1531c0.f4598q = i;
            this.f4532R0.add(abstractC1531c0);
            return false;
        }
        C1112b0.m38479C0(abstractC1531c0.f4581a, i);
        return true;
    }

    /* renamed from: o */
    void m36636o(AbstractC1531c0 abstractC1531c0, AbstractC1540l.C1543c c1543c, AbstractC1540l.C1543c c1543c2) {
        m36660g(abstractC1531c0);
        abstractC1531c0.m36583G(false);
        if (this.f4551l0.mo35828c(abstractC1531c0, c1543c, c1543c2)) {
            m36698P0();
        }
    }

    /* renamed from: o0 */
    public boolean m36635o0() {
        return !this.f4529Q || this.f4542c0 || this.f4568z.m36163p();
    }

    /* renamed from: o1 */
    boolean m36634o1(AccessibilityEvent accessibilityEvent) {
        if (m36608x0()) {
            int m38605a = accessibilityEvent != null ? C1083b.m38605a(accessibilityEvent) : 0;
            this.f4538V |= m38605a != 0 ? m38605a : 0;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4544e0 = 0;
        boolean z = true;
        this.f4523N = true;
        if (!this.f4529Q || isLayoutRequested()) {
            z = false;
        }
        this.f4529Q = z;
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.m36505A(this);
        }
        this.f4516J0 = false;
        if (f4492Y0) {
            ThreadLocal<RunnableC1614j> threadLocal = RunnableC1614j.f4904A;
            RunnableC1614j runnableC1614j = threadLocal.get();
            this.f4500B0 = runnableC1614j;
            if (runnableC1614j == null) {
                this.f4500B0 = new RunnableC1614j();
                Display m38396x = C1112b0.m38396x(this);
                float f = 60.0f;
                if (!isInEditMode() && m38396x != null) {
                    float refreshRate = m38396x.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                RunnableC1614j runnableC1614j2 = this.f4500B0;
                runnableC1614j2.f4908y = 1.0E9f / f;
                threadLocal.set(runnableC1614j2);
            }
            this.f4500B0.m36012a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC1614j runnableC1614j;
        super.onDetachedFromWindow();
        AbstractC1540l abstractC1540l = this.f4551l0;
        if (abstractC1540l != null) {
            abstractC1540l.mo36057k();
        }
        m36604y1();
        this.f4523N = false;
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            abstractC1546o.m36502B(this, this.f4564x);
        }
        this.f4532R0.clear();
        removeCallbacks(this.f4534S0);
        this.f4499B.m36134j();
        if (!f4492Y0 || (runnableC1614j = this.f4500B0) == null) {
            return;
        }
        runnableC1614j.m36003j(this);
        this.f4500B0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4517K.size();
        for (int i = 0; i < size; i++) {
            this.f4517K.get(i).mo29915i(canvas, this, this.f4504D0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4513I
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4535T
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4513I
            boolean r0 = r0.mo36253m()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4513I
            boolean r3 = r3.mo36256l()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4513I
            boolean r3 = r3.mo36253m()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4513I
            boolean r3 = r3.mo36256l()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4565x0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4567y0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m36649j1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4535T) {
            return false;
        }
        this.f4521M = null;
        if (m36687V(motionEvent)) {
            m36627r();
            return true;
        }
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            return false;
        }
        boolean mo36256l = abstractC1546o.mo36256l();
        boolean mo36253m = this.f4513I.mo36253m();
        if (this.f4554o0 == null) {
            this.f4554o0 = VelocityTracker.obtain();
        }
        this.f4554o0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4537U) {
                this.f4537U = false;
            }
            this.f4553n0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4557r0 = x;
            this.f4555p0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4558s0 = y;
            this.f4556q0 = y;
            if (this.f4552m0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m36607x1(1);
            }
            int[] iArr = this.f4528P0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = mo36256l;
            if (mo36253m) {
                i = (mo36256l ? 1 : 0) | 2;
            }
            m36613v1(i, 0);
        } else if (actionMasked == 1) {
            this.f4554o0.clear();
            m36607x1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4553n0);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4553n0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4552m0 != 1) {
                int i2 = x2 - this.f4555p0;
                int i3 = y2 - this.f4556q0;
                if (!mo36256l || Math.abs(i2) <= this.f4559t0) {
                    z = false;
                } else {
                    this.f4557r0 = x2;
                    z = true;
                }
                if (mo36253m && Math.abs(i3) > this.f4559t0) {
                    this.f4558s0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m36627r();
        } else if (actionMasked == 5) {
            this.f4553n0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4557r0 = x3;
            this.f4555p0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4558s0 = y3;
            this.f4556q0 = y3;
        } else if (actionMasked == 6) {
            m36704M0(motionEvent);
        }
        return this.f4552m0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1020i.m38740a("RV OnLayout");
        m36725C();
        C1020i.m38739b();
        this.f4529Q = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            m36609x(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC1546o.mo36240t0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4513I.m36460a1(this.f4564x, this.f4504D0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (z || this.f4511H == null) {
                return;
            }
            if (this.f4504D0.f4679e == 1) {
                m36723D();
            }
            this.f4513I.m36500B1(i, i2);
            this.f4504D0.f4684j = true;
            m36721E();
            this.f4513I.m36495E1(i, i2);
            if (this.f4513I.mo36488H1()) {
                this.f4513I.m36500B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f4504D0.f4684j = true;
                m36721E();
                this.f4513I.m36495E1(i, i2);
            }
        } else if (this.f4525O) {
            this.f4513I.m36460a1(this.f4564x, this.f4504D0, i, i2);
        } else {
            if (this.f4539W) {
                m36616u1();
                m36710J0();
                m36694R0();
                m36708K0();
                C1564z c1564z = this.f4504D0;
                if (c1564z.f4686l) {
                    c1564z.f4682h = true;
                } else {
                    this.f4568z.m36169j();
                    this.f4504D0.f4682h = false;
                }
                this.f4539W = false;
                m36610w1(false);
            } else if (this.f4504D0.f4686l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1535g abstractC1535g = this.f4511H;
            if (abstractC1535g != null) {
                this.f4504D0.f4680f = abstractC1535g.mo29834f();
            } else {
                this.f4504D0.f4680f = 0;
            }
            m36616u1();
            this.f4513I.m36460a1(this.f4564x, this.f4504D0, i, i2);
            m36610w1(false);
            this.f4504D0.f4682h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m36608x0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f4566y = savedState;
        super.onRestoreInstanceState(savedState.m37835a());
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null || (parcelable2 = this.f4566y.f4570y) == null) {
            return;
        }
        abstractC1546o.mo36268d1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f4566y;
        if (savedState2 != null) {
            savedState.m36600b(savedState2);
        } else {
            AbstractC1546o abstractC1546o = this.f4513I;
            if (abstractC1546o != null) {
                savedState.f4570y = abstractC1546o.mo36266e1();
            } else {
                savedState.f4570y = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        m36617u0();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    void m36633p(String str) {
        if (m36608x0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m36697Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f4545f0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.VERSION_NAME + m36697Q()));
        }
    }

    /* renamed from: p1 */
    public void m36631p1(int i, int i2) {
        m36628q1(i, i2, null);
    }

    /* renamed from: q */
    boolean m36630q(AbstractC1531c0 abstractC1531c0) {
        AbstractC1540l abstractC1540l = this.f4551l0;
        return abstractC1540l == null || abstractC1540l.mo36059g(abstractC1531c0, abstractC1531c0.m36563o());
    }

    /* renamed from: q0 */
    void m36629q0() {
        this.f4568z = new C1571a(new C1534f());
    }

    /* renamed from: q1 */
    public void m36628q1(int i, int i2, Interpolator interpolator) {
        m36625r1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: r1 */
    public void m36625r1(int i, int i2, Interpolator interpolator, int i3) {
        m36622s1(i, i2, interpolator, i3, false);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        AbstractC1531c0 m36653i0 = m36653i0(view);
        if (m36653i0 != null) {
            if (m36653i0.m36554x()) {
                m36653i0.m36572f();
            } else if (!m36653i0.m36580J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m36653i0 + m36697Q());
            }
        }
        view.clearAnimation();
        m36730A(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4513I.m36455c1(this, this.f4504D0, view, view2) && view2 != null) {
            m36664e1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4513I.m36419s1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4519L.size();
        for (int i = 0; i < size; i++) {
            this.f4519L.get(i).mo35965e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4531R == 0 && !this.f4535T) {
            super.requestLayout();
        } else {
            this.f4533S = true;
        }
    }

    /* renamed from: s1 */
    void m36622s1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4535T) {
        } else {
            if (!abstractC1546o.mo36256l()) {
                i = 0;
            }
            if (!this.f4513I.mo36253m()) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return;
            }
            if (i3 == Integer.MIN_VALUE || i3 > 0) {
                if (z) {
                    int i4 = i != 0 ? 1 : 0;
                    if (i2 != 0) {
                        i4 |= 2;
                    }
                    m36613v1(i4, 1);
                }
                this.f4498A0.m36591f(i, i2, i3, interpolator);
                return;
            }
            scrollBy(i, i2);
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f4535T) {
        } else {
            boolean mo36256l = abstractC1546o.mo36256l();
            boolean mo36253m = this.f4513I.mo36253m();
            if (mo36256l || mo36253m) {
                if (!mo36256l) {
                    i = 0;
                }
                if (!mo36253m) {
                    i2 = 0;
                }
                m36649j1(i, i2, null);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m36634o1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1647v c1647v) {
        this.f4518K0 = c1647v;
        C1112b0.m38405s0(this, c1647v);
    }

    public void setAdapter(AbstractC1535g abstractC1535g) {
        setLayoutFrozen(false);
        m36640m1(abstractC1535g, false, true);
        m36692S0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1538j interfaceC1538j) {
        if (interfaceC1538j == this.f4520L0) {
            return;
        }
        this.f4520L0 = interfaceC1538j;
        setChildrenDrawingOrderEnabled(interfaceC1538j != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f4501C) {
            m36617u0();
        }
        this.f4501C = z;
        super.setClipToPadding(z);
        if (this.f4529Q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1539k c1539k) {
        C1076h.m38619f(c1539k);
        this.f4546g0 = c1539k;
        m36617u0();
    }

    public void setHasFixedSize(boolean z) {
        this.f4525O = z;
    }

    public void setItemAnimator(AbstractC1540l abstractC1540l) {
        AbstractC1540l abstractC1540l2 = this.f4551l0;
        if (abstractC1540l2 != null) {
            abstractC1540l2.mo36057k();
            this.f4551l0.m36513w(null);
        }
        this.f4551l0 = abstractC1540l;
        if (abstractC1540l != null) {
            abstractC1540l.m36513w(this.f4514I0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f4564x.m36384G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1546o abstractC1546o) {
        if (abstractC1546o == this.f4513I) {
            return;
        }
        m36604y1();
        if (this.f4513I != null) {
            AbstractC1540l abstractC1540l = this.f4551l0;
            if (abstractC1540l != null) {
                abstractC1540l.mo36057k();
            }
            this.f4513I.m36435l1(this.f4564x);
            this.f4513I.m36433m1(this.f4564x);
            this.f4564x.m36375c();
            if (this.f4523N) {
                this.f4513I.m36502B(this, this.f4564x);
            }
            this.f4513I.m36493F1(null);
            this.f4513I = null;
        } else {
            this.f4564x.m36375c();
        }
        this.f4497A.m36094o();
        this.f4513I = abstractC1546o;
        if (abstractC1546o != null) {
            if (abstractC1546o.f4614b == null) {
                abstractC1546o.m36493F1(this);
                if (this.f4523N) {
                    this.f4513I.m36505A(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC1546o + " is already attached to a RecyclerView:" + abstractC1546o.f4614b.m36697Q());
            }
        }
        this.f4564x.m36380K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m38028m(z);
    }

    public void setOnFlingListener(AbstractC1553r abstractC1553r) {
        this.f4560u0 = abstractC1553r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1555t abstractC1555t) {
        this.f4506E0 = abstractC1555t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4569z0 = z;
    }

    public void setRecycledViewPool(C1556u c1556u) {
        this.f4564x.m36386E(c1556u);
    }

    public void setRecyclerListener(InterfaceC1559w interfaceC1559w) {
        this.f4515J = interfaceC1559w;
    }

    void setScrollState(int i) {
        if (i == this.f4552m0) {
            return;
        }
        this.f4552m0 = i;
        if (i != 2) {
            m36601z1();
        }
        m36713I(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f4559t0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f4559t0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1527a0 abstractC1527a0) {
        this.f4564x.m36385F(abstractC1527a0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m38026o(i);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public void stopNestedScroll() {
        getScrollingChildHelper().m38024q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.f4535T) {
            m36633p("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4535T = false;
                if (this.f4533S && this.f4513I != null && this.f4511H != null) {
                    requestLayout();
                }
                this.f4533S = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f4535T = true;
            this.f4537U = true;
            m36604y1();
        }
    }

    /* renamed from: t */
    void m36621t() {
        int m36099j = this.f4497A.m36099j();
        for (int i = 0; i < m36099j; i++) {
            AbstractC1531c0 m36653i0 = m36653i0(this.f4497A.m36100i(i));
            if (!m36653i0.m36580J()) {
                m36653i0.m36575c();
            }
        }
        this.f4564x.m36374d();
    }

    /* renamed from: t0 */
    void m36620t0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1609i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C13628b.fastscroll_default_thickness), resources.getDimensionPixelSize(C13628b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C13628b.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m36697Q());
    }

    /* renamed from: t1 */
    public void m36619t1(int i) {
        if (this.f4535T) {
            return;
        }
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1546o.mo29858J1(this, this.f4504D0, i);
        }
    }

    /* renamed from: u */
    void m36618u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f4547h0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4547h0.onRelease();
            z = this.f4547h0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4549j0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4549j0.onRelease();
            z |= this.f4549j0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4548i0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4548i0.onRelease();
            z |= this.f4548i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4550k0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4550k0.onRelease();
            z |= this.f4550k0.isFinished();
        }
        if (z) {
            C1112b0.m38423j0(this);
        }
    }

    /* renamed from: u0 */
    void m36617u0() {
        this.f4550k0 = null;
        this.f4548i0 = null;
        this.f4549j0 = null;
        this.f4547h0 = null;
    }

    /* renamed from: u1 */
    void m36616u1() {
        int i = this.f4531R + 1;
        this.f4531R = i;
        if (i != 1 || this.f4535T) {
            return;
        }
        this.f4533S = false;
    }

    /* renamed from: v */
    void m36615v() {
        if (this.f4529Q && !this.f4542c0) {
            if (this.f4568z.m36163p()) {
                if (this.f4568z.m36164o(4) && !this.f4568z.m36164o(11)) {
                    C1020i.m38740a("RV PartialInvalidate");
                    m36616u1();
                    m36710J0();
                    this.f4568z.m36156w();
                    if (!this.f4533S) {
                        if (m36632p0()) {
                            m36725C();
                        } else {
                            this.f4568z.m36170i();
                        }
                    }
                    m36610w1(true);
                    m36708K0();
                    C1020i.m38739b();
                    return;
                } else if (this.f4568z.m36163p()) {
                    C1020i.m38740a("RV FullInvalidate");
                    m36725C();
                    C1020i.m38739b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        C1020i.m38740a("RV FullInvalidate");
        m36725C();
        C1020i.m38739b();
    }

    /* renamed from: v0 */
    boolean m36614v0() {
        AccessibilityManager accessibilityManager = this.f4540a0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: v1 */
    public boolean m36613v1(int i, int i2) {
        return getScrollingChildHelper().m38025p(i, i2);
    }

    /* renamed from: w0 */
    public boolean m36611w0() {
        AbstractC1540l abstractC1540l = this.f4551l0;
        return abstractC1540l != null && abstractC1540l.mo36056p();
    }

    /* renamed from: w1 */
    void m36610w1(boolean z) {
        if (this.f4531R < 1) {
            this.f4531R = 1;
        }
        if (!z && !this.f4535T) {
            this.f4533S = false;
        }
        if (this.f4531R == 1) {
            if (z && this.f4533S && !this.f4535T && this.f4513I != null && this.f4511H != null) {
                m36725C();
            }
            if (!this.f4535T) {
                this.f4533S = false;
            }
        }
        this.f4531R--;
    }

    /* renamed from: x */
    void m36609x(int i, int i2) {
        setMeasuredDimension(AbstractC1546o.m36430o(i, getPaddingLeft() + getPaddingRight(), C1112b0.m38472G(this)), AbstractC1546o.m36430o(i2, getPaddingTop() + getPaddingBottom(), C1112b0.m38474F(this)));
    }

    /* renamed from: x0 */
    public boolean m36608x0() {
        return this.f4544e0 > 0;
    }

    /* renamed from: x1 */
    public void m36607x1(int i) {
        getScrollingChildHelper().m38023r(i);
    }

    /* renamed from: y1 */
    public void m36604y1() {
        setScrollState(0);
        m36601z1();
    }

    /* renamed from: z */
    void m36603z(View view) {
        AbstractC1531c0 m36653i0 = m36653i0(view);
        m36714H0(view);
        AbstractC1535g abstractC1535g = this.f4511H;
        if (abstractC1535g != null && m36653i0 != null) {
            abstractC1535g.mo35520P(m36653i0);
        }
        List<InterfaceC1552q> list = this.f4541b0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4541b0.get(size).mo35479b(view);
            }
        }
    }

    /* renamed from: z0 */
    void m36602z0(int i) {
        if (this.f4513I == null) {
            return;
        }
        setScrollState(2);
        this.f4513I.mo36230y1(i);
        awakenScrollBars();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13627a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4562w = new C1560x();
        this.f4564x = new C1558v();
        this.f4499B = new C1574a0();
        this.f4503D = new RunnableC1526a();
        this.f4505E = new Rect();
        this.f4507F = new Rect();
        this.f4509G = new RectF();
        this.f4517K = new ArrayList<>();
        this.f4519L = new ArrayList<>();
        this.f4531R = 0;
        this.f4542c0 = false;
        this.f4543d0 = false;
        this.f4544e0 = 0;
        this.f4545f0 = 0;
        this.f4546g0 = new C1539k();
        this.f4551l0 = new C1590g();
        this.f4552m0 = 0;
        this.f4553n0 = -1;
        this.f4565x0 = Float.MIN_VALUE;
        this.f4567y0 = Float.MIN_VALUE;
        boolean z = true;
        this.f4569z0 = true;
        this.f4498A0 = new RunnableC1529b0();
        this.f4502C0 = f4492Y0 ? new RunnableC1614j.C1616b() : null;
        this.f4504D0 = new C1564z();
        this.f4510G0 = false;
        this.f4512H0 = false;
        this.f4514I0 = new C1544m();
        this.f4516J0 = false;
        this.f4522M0 = new int[2];
        this.f4526O0 = new int[2];
        this.f4528P0 = new int[2];
        this.f4530Q0 = new int[2];
        this.f4532R0 = new ArrayList();
        this.f4534S0 = new RunnableC1528b();
        this.f4536T0 = new C1532d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4559t0 = viewConfiguration.getScaledTouchSlop();
        this.f4565x0 = C1148d0.m38218b(viewConfiguration, context);
        this.f4567y0 = C1148d0.m38216d(viewConfiguration, context);
        this.f4561v0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4563w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4551l0.m36513w(this.f4514I0);
        m36629q0();
        m36623s0();
        m36626r0();
        if (C1112b0.m38480C(this) == 0) {
            C1112b0.m38479C0(this, 1);
        }
        this.f4540a0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1647v(this));
        int[] iArr = C13630d.f34625a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C13630d.f34634j);
        if (obtainStyledAttributes.getInt(C13630d.f34628d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4501C = obtainStyledAttributes.getBoolean(C13630d.f34627c, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C13630d.f34629e, false);
        this.f4527P = z2;
        if (z2) {
            m36620t0((StateListDrawable) obtainStyledAttributes.getDrawable(C13630d.f34632h), obtainStyledAttributes.getDrawable(C13630d.f34633i), (StateListDrawable) obtainStyledAttributes.getDrawable(C13630d.f34630f), obtainStyledAttributes.getDrawable(C13630d.f34631g));
        }
        obtainStyledAttributes.recycle();
        m36612w(context, string, attributeSet, i, 0);
        if (i2 >= 21) {
            int[] iArr2 = f4488U0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            if (i2 >= 29) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1525a();

        /* renamed from: y */
        Parcelable f4570y;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes.dex */
        static class C1525a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1525a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo36599a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState mo36598b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] mo36597c(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4570y = parcel.readParcelable(classLoader == null ? AbstractC1546o.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m36600b(SavedState savedState) {
            this.f4570y = savedState.f4570y;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4570y, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes.dex */
    public static class C1551p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC1531c0 f4637a;

        /* renamed from: b */
        final Rect f4638b;

        /* renamed from: c */
        boolean f4639c;

        /* renamed from: d */
        boolean f4640d;

        public C1551p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4638b = new Rect();
            this.f4639c = true;
            this.f4640d = false;
        }

        /* renamed from: a */
        public int m36406a() {
            return this.f4637a.m36565m();
        }

        /* renamed from: b */
        public boolean m36405b() {
            return this.f4637a.m36553y();
        }

        /* renamed from: c */
        public boolean m36404c() {
            return this.f4637a.m36556v();
        }

        /* renamed from: d */
        public boolean m36403d() {
            return this.f4637a.m36558t();
        }

        public C1551p(int i, int i2) {
            super(i, i2);
            this.f4638b = new Rect();
            this.f4639c = true;
            this.f4640d = false;
        }

        public C1551p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4638b = new Rect();
            this.f4639c = true;
            this.f4640d = false;
        }

        public C1551p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4638b = new Rect();
            this.f4639c = true;
            this.f4640d = false;
        }

        public C1551p(C1551p c1551p) {
            super((ViewGroup.LayoutParams) c1551p);
            this.f4638b = new Rect();
            this.f4639c = true;
            this.f4640d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1546o abstractC1546o = this.f4513I;
        if (abstractC1546o != null) {
            return abstractC1546o.mo36312G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m36697Q());
    }
}
