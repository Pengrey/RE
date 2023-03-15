package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1070c;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1205o;
import androidx.core.view.InterfaceC1211u;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.InterfaceC1097f;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5424g;
import p100f8.C5428k;
import p100f8.C5429l;
import p111g.C5586a;
import p120g8.C5616a;
import p170j2.C6298a;
import p401v8.C11141g;
import p401v8.C11145h;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC0872b {

    /* renamed from: P */
    private static final int f9285P = C5428k.Widget_Design_AppBarLayout;

    /* renamed from: A */
    private boolean f9286A;

    /* renamed from: B */
    private int f9287B;

    /* renamed from: C */
    private C1183m0 f9288C;

    /* renamed from: D */
    private List<InterfaceC3452c> f9289D;

    /* renamed from: E */
    private boolean f9290E;

    /* renamed from: F */
    private boolean f9291F;

    /* renamed from: G */
    private boolean f9292G;

    /* renamed from: H */
    private boolean f9293H;

    /* renamed from: I */
    private int f9294I;

    /* renamed from: J */
    private WeakReference<View> f9295J;

    /* renamed from: K */
    private ValueAnimator f9296K;

    /* renamed from: L */
    private final List<InterfaceC3456g> f9297L;

    /* renamed from: M */
    private int[] f9298M;

    /* renamed from: N */
    private Drawable f9299N;

    /* renamed from: O */
    private Behavior f9300O;

    /* renamed from: w */
    private int f9301w;

    /* renamed from: x */
    private int f9302x;

    /* renamed from: y */
    private int f9303y;

    /* renamed from: z */
    private int f9304z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC3462a<T> {

        /* renamed from: k */
        private int f9305k;

        /* renamed from: l */
        private int f9306l;

        /* renamed from: m */
        private ValueAnimator f9307m;

        /* renamed from: n */
        private SavedState f9308n;

        /* renamed from: o */
        private WeakReference<View> f9309o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes.dex */
        public class C3447a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f9315a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f9316b;

            C3447a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f9315a = coordinatorLayout;
                this.f9316b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m30623P(this.f9315a, this.f9316b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes.dex */
        public class C3448b implements InterfaceC1097f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f9318a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f9319b;

            /* renamed from: c */
            final /* synthetic */ View f9320c;

            /* renamed from: d */
            final /* synthetic */ int f9321d;

            C3448b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f9318a = coordinatorLayout;
                this.f9319b = appBarLayout;
                this.f9320c = view;
                this.f9321d = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.accessibility.InterfaceC1097f
            /* renamed from: a */
            public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
                BaseBehavior.this.mo30694j0(this.f9318a, this.f9319b, this.f9320c, 0, this.f9321d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes.dex */
        public class C3449c implements InterfaceC1097f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f9323a;

            /* renamed from: b */
            final /* synthetic */ boolean f9324b;

            C3449c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.f9323a = appBarLayout;
                this.f9324b = z;
            }

            @Override // androidx.core.view.accessibility.InterfaceC1097f
            /* renamed from: a */
            public boolean mo30335a(View view, InterfaceC1097f.AbstractC1098a abstractC1098a) {
                this.f9323a.setExpanded(this.f9324b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: S */
        private void m30711S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo30626M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m30710T(coordinatorLayout, t, C1085c.C1086a.f3428h, false);
            }
            if (mo30626M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        C1112b0.m38413o0(coordinatorLayout, C1085c.C1086a.f3429i, null, new C3448b(coordinatorLayout, t, view, i));
                        return;
                    }
                    return;
                }
                m30710T(coordinatorLayout, t, C1085c.C1086a.f3429i, true);
            }
        }

        /* renamed from: T */
        private void m30710T(CoordinatorLayout coordinatorLayout, T t, C1085c.C1086a c1086a, boolean z) {
            C1112b0.m38413o0(coordinatorLayout, c1086a, null, new C3449c(this, t, z));
        }

        /* renamed from: U */
        private void m30709U(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int height;
            int abs = Math.abs(mo30626M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            m30708V(coordinatorLayout, t, i, height);
        }

        /* renamed from: V */
        private void m30708V(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int mo30626M = mo30626M();
            if (mo30626M == i) {
                ValueAnimator valueAnimator = this.f9307m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f9307m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9307m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9307m = valueAnimator3;
                valueAnimator3.setInterpolator(C5616a.f15857e);
                this.f9307m.addUpdateListener(new C3447a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f9307m.setDuration(Math.min(i2, 600));
            this.f9307m.setIntValues(mo30626M, i);
            this.f9307m.start();
        }

        /* renamed from: W */
        private int m30707W(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: Y */
        private boolean m30705Y(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.m30727l() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: Z */
        private static boolean m30704Z(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a0 */
        private View m30703a0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC1205o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private static View m30702b0(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: c0 */
        private int m30701c0(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C3455f c3455f = (C3455f) childAt.getLayoutParams();
                if (m30704Z(c3455f.m30668c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c3455f).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c3455f).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: f0 */
        private int m30698f0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C3455f c3455f = (C3455f) childAt.getLayoutParams();
                Interpolator m30667d = c3455f.m30667d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (m30667d != null) {
                    int m30668c = c3455f.m30668c();
                    if ((m30668c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c3455f).topMargin + ((LinearLayout.LayoutParams) c3455f).bottomMargin;
                        if ((m30668c & 2) != 0) {
                            i2 -= C1112b0.m38474F(childAt);
                        }
                    }
                    if (C1112b0.m38482B(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * m30667d.getInterpolation((abs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: s0 */
        private boolean m30685s0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m39326s = coordinatorLayout.m39326s(t);
            int size = m39326s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.AbstractC0873c m39298f = ((CoordinatorLayout.C0876f) m39326s.get(i).getLayoutParams()).m39298f();
                if (m39298f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) m39298f).m30618K() != 0;
                }
            }
            return false;
        }

        /* renamed from: t0 */
        private void m30684t0(CoordinatorLayout coordinatorLayout, T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int mo30626M = mo30626M() - topInset;
            int m30701c0 = m30701c0(t, mo30626M);
            if (m30701c0 >= 0) {
                View childAt = t.getChildAt(m30701c0);
                C3455f c3455f = (C3455f) childAt.getLayoutParams();
                int m30668c = c3455f.m30668c();
                if ((m30668c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m30701c0 == 0 && C1112b0.m38482B(t) && C1112b0.m38482B(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (m30704Z(m30668c, 2)) {
                        i2 += C1112b0.m38474F(childAt);
                    } else if (m30704Z(m30668c, 5)) {
                        int m38474F = C1112b0.m38474F(childAt) + i2;
                        if (mo30626M < m38474F) {
                            i = m38474F;
                        } else {
                            i2 = m38474F;
                        }
                    }
                    if (m30704Z(m30668c, 32)) {
                        i += ((LinearLayout.LayoutParams) c3455f).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) c3455f).bottomMargin;
                    }
                    m30709U(coordinatorLayout, t, C6298a.m21277b(m30707W(mo30626M, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: u0 */
        private void m30683u0(CoordinatorLayout coordinatorLayout, T t) {
            C1112b0.m38417m0(coordinatorLayout, C1085c.C1086a.f3428h.m38510b());
            C1112b0.m38417m0(coordinatorLayout, C1085c.C1086a.f3429i.m38510b());
            View m30703a0 = m30703a0(coordinatorLayout);
            if (m30703a0 == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C0876f) m30703a0.getLayoutParams()).m39298f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m30711S(coordinatorLayout, t, m30703a0);
        }

        /* renamed from: v0 */
        private void m30682v0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View m30702b0 = m30702b0(t, i);
            boolean z2 = false;
            if (m30702b0 != null) {
                int m30668c = ((C3455f) m30702b0.getLayoutParams()).m30668c();
                if ((m30668c & 1) != 0) {
                    int m38474F = C1112b0.m38474F(m30702b0);
                    if (i2 <= 0 || (m30668c & 12) == 0 ? !((m30668c & 2) == 0 || (-i) < (m30702b0.getBottom() - m38474F) - t.getTopInset()) : (-i) >= (m30702b0.getBottom() - m38474F) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.m30725n()) {
                z2 = t.m30742A(m30703a0(coordinatorLayout));
            }
            boolean m30715x = t.m30715x(z2);
            if (z || (m30715x && m30685s0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: M */
        int mo30626M() {
            return m30612E() + this.f9305k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: X */
        public boolean mo30706X(T t) {
            WeakReference<View> weakReference = this.f9309o;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: d0 */
        public int mo30700d0(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: e0 */
        public int mo30699e0(T t) {
            return t.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: g0 */
        public void mo30697g0(CoordinatorLayout coordinatorLayout, T t) {
            m30684t0(coordinatorLayout, t);
            if (t.m30725n()) {
                t.m30715x(t.m30742A(m30703a0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.C3465c, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: h0 */
        public boolean mo30696h0(CoordinatorLayout coordinatorLayout, T t, int i) {
            int round;
            boolean mo30696h0 = super.mo30696h0(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            SavedState savedState = this.f9308n;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            m30709U(coordinatorLayout, t, i2, 0.0f);
                        } else {
                            m30623P(coordinatorLayout, t, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m30709U(coordinatorLayout, t, 0, 0.0f);
                        } else {
                            m30623P(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.f9313y) {
                m30623P(coordinatorLayout, t, -t.getTotalScrollRange());
            } else if (savedState.f9314z) {
                m30623P(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(savedState.f9310A);
                int i3 = -childAt.getBottom();
                if (this.f9308n.f9312C) {
                    round = C1112b0.m38474F(childAt) + t.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f9308n.f9311B);
                }
                m30623P(coordinatorLayout, t, i3 + round);
            }
            t.m30720s();
            this.f9308n = null;
            m30610G(C6298a.m21277b(m30612E(), -t.getTotalScrollRange(), 0));
            m30682v0(coordinatorLayout, t, m30612E(), 0, true);
            t.m30724o(m30612E());
            m30683u0(coordinatorLayout, t);
            return mo30696h0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: i0 */
        public boolean mo30695i0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0876f) t.getLayoutParams())).height == -2) {
                coordinatorLayout.m39353J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.mo30695i0(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: j0 */
        public void mo30694j0(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    iArr[1] = m30624O(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.m30725n()) {
                t.m30715x(t.m30742A(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: k0 */
        public void mo30693k0(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m30624O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m30683u0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: l0 */
        public void mo30692l0(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                m30688p0((SavedState) parcelable, true);
                super.mo30692l0(coordinatorLayout, t, this.f9308n.m37835a());
                return;
            }
            super.mo30692l0(coordinatorLayout, t, parcelable);
            this.f9308n = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: m0 */
        public Parcelable mo30691m0(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable mo30691m0 = super.mo30691m0(coordinatorLayout, t);
            SavedState m30687q0 = m30687q0(mo30691m0, t);
            return m30687q0 == null ? mo30691m0 : m30687q0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: n0 */
        public boolean mo30690n0(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.m30725n() || m30705Y(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f9307m) != null) {
                valueAnimator.cancel();
            }
            this.f9309o = null;
            this.f9306l = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: o0 */
        public void mo30689o0(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f9306l == 0 || i == 1) {
                m30684t0(coordinatorLayout, t);
                if (t.m30725n()) {
                    t.m30715x(t.m30742A(view));
                }
            }
            this.f9309o = new WeakReference<>(view);
        }

        /* renamed from: p0 */
        void m30688p0(SavedState savedState, boolean z) {
            if (this.f9308n == null || z) {
                this.f9308n = savedState;
            }
        }

        /* renamed from: q0 */
        SavedState m30687q0(Parcelable parcelable, T t) {
            int m30612E = m30612E();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + m30612E;
                if (childAt.getTop() + m30612E <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f3661x;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = m30612E == 0;
                    savedState.f9314z = z;
                    savedState.f9313y = !z && (-m30612E) >= t.getTotalScrollRange();
                    savedState.f9310A = i;
                    savedState.f9312C = bottom == C1112b0.m38474F(childAt) + t.getTopInset();
                    savedState.f9311B = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3462a
        /* renamed from: r0 */
        public int mo30686r0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int mo30626M = mo30626M();
            int i4 = 0;
            if (i2 != 0 && mo30626M >= i2 && mo30626M <= i3) {
                int m21277b = C6298a.m21277b(i, i2, i3);
                if (mo30626M != m21277b) {
                    int m30698f0 = t.m30729j() ? m30698f0(t, m21277b) : m21277b;
                    boolean m30610G = m30610G(m30698f0);
                    int i5 = mo30626M - m21277b;
                    this.f9305k = m21277b - m30698f0;
                    if (m30610G) {
                        while (i4 < t.getChildCount()) {
                            C3455f c3455f = (C3455f) t.getChildAt(i4).getLayoutParams();
                            AbstractC3453d m30669b = c3455f.m30669b();
                            if (m30669b != null && (c3455f.m30668c() & 1) != 0) {
                                m30669b.mo30672a(t, t.getChildAt(i4), m30612E());
                            }
                            i4++;
                        }
                    }
                    if (!m30610G && t.m30729j()) {
                        coordinatorLayout.m39333f(t);
                    }
                    t.m30724o(m30612E());
                    m30682v0(coordinatorLayout, t, m21277b, m21277b < mo30626M ? -1 : 1, false);
                    i4 = i5;
                }
            } else {
                this.f9305k = 0;
            }
            m30683u0(coordinatorLayout, t);
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C3446a();

            /* renamed from: A */
            int f9310A;

            /* renamed from: B */
            float f9311B;

            /* renamed from: C */
            boolean f9312C;

            /* renamed from: y */
            boolean f9313y;

            /* renamed from: z */
            boolean f9314z;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes.dex */
            class C3446a implements Parcelable.ClassLoaderCreator<SavedState> {
                C3446a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState mo30681a(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState mo30680b(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] mo30679c(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f9313y = parcel.readByte() != 0;
                this.f9314z = parcel.readByte() != 0;
                this.f9310A = parcel.readInt();
                this.f9311B = parcel.readFloat();
                this.f9312C = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f9313y ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f9314z ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f9310A);
                parcel.writeFloat(this.f9311B);
                parcel.writeByte(this.f9312C ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC3464b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m30677R(AppBarLayout appBarLayout) {
            CoordinatorLayout.AbstractC0873c m39298f = ((CoordinatorLayout.C0876f) appBarLayout.getLayoutParams()).m39298f();
            if (m39298f instanceof BaseBehavior) {
                return ((BaseBehavior) m39298f).mo30626M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m30676S(View view, View view2) {
            CoordinatorLayout.AbstractC0873c m39298f = ((CoordinatorLayout.C0876f) view2.getLayoutParams()).m39298f();
            if (m39298f instanceof BaseBehavior) {
                C1112b0.m38435d0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m39298f).f9305k) + m30616M()) - m30620I(view2));
            }
        }

        /* renamed from: T */
        private void m30675T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m30725n()) {
                    appBarLayout.m30715x(appBarLayout.m30742A(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.AbstractC3464b
        /* renamed from: J */
        float mo30619J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m30677R = m30677R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m30677R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m30677R / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.AbstractC3464b
        /* renamed from: L */
        int mo30617L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo30617L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3464b
        /* renamed from: Q */
        public AppBarLayout mo30678Q(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: e */
        public boolean mo28776e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: h */
        public boolean mo29768H(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m30676S(view, view2);
            m30675T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: i */
        public void mo30674i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C1112b0.m38417m0(coordinatorLayout, C1085c.C1086a.f3428h.m38510b());
                C1112b0.m38417m0(coordinatorLayout, C1085c.C1086a.f3429i.m38510b());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: w */
        public boolean mo30673w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout mo30678Q = mo30678Q(coordinatorLayout.m39327r(view));
            if (mo30678Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f9385d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo30678Q.m30719t(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f14920D4);
            m30614O(obtainStyledAttributes.getDimensionPixelSize(C5429l.f14928E4, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes.dex */
    class C3450a implements InterfaceC1211u {
        C3450a() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            return AppBarLayout.this.m30723p(c1183m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes.dex */
    public class C3451b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C11141g f9326a;

        C3451b(C11141g c11141g) {
            this.f9326a = c11141g;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f9326a.m6005Y(floatValue);
            if (AppBarLayout.this.f9299N instanceof C11141g) {
                ((C11141g) AppBarLayout.this.f9299N).m6005Y(floatValue);
            }
            for (InterfaceC3456g interfaceC3456g : AppBarLayout.this.f9297L) {
                interfaceC3456g.m30663a(floatValue, this.f9326a.m6029A());
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3452c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo30638a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3453d {
        /* renamed from: a */
        public abstract void mo30672a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    /* loaded from: classes.dex */
    public static class C3454e extends AbstractC3453d {

        /* renamed from: a */
        private final Rect f9328a = new Rect();

        /* renamed from: b */
        private final Rect f9329b = new Rect();

        /* renamed from: b */
        private static void m30671b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC3453d
        /* renamed from: a */
        public void mo30672a(AppBarLayout appBarLayout, View view, float f) {
            m30671b(this.f9328a, appBarLayout, view);
            float abs = this.f9328a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float m21278a = 1.0f - C6298a.m21278a(Math.abs(abs / this.f9328a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.f9328a.height() * 0.3f) * (1.0f - (m21278a * m21278a)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f9329b);
                this.f9329b.offset(0, (int) (-height));
                C1112b0.m38393y0(view, this.f9329b);
                return;
            }
            C1112b0.m38393y0(view, null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    /* loaded from: classes.dex */
    public interface InterfaceC3456g {
        /* renamed from: a */
        void m30663a(float f, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$h */
    /* loaded from: classes.dex */
    public interface InterfaceC3457h extends InterfaceC3452c<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.appBarLayoutStyle);
    }

    /* renamed from: B */
    private boolean m30741B() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || C1112b0.m38482B(childAt)) ? false : true;
        }
        return false;
    }

    /* renamed from: C */
    private void m30740C(C11141g c11141g, boolean z) {
        float dimension = getResources().getDimension(C5421d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f9296K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.f9296K = ofFloat;
        ofFloat.setDuration(getResources().getInteger(C5424g.app_bar_elevation_anim_duration));
        this.f9296K.setInterpolator(C5616a.f15853a);
        this.f9296K.addUpdateListener(new C3451b(c11141g));
        this.f9296K.start();
    }

    /* renamed from: D */
    private void m30739D() {
        setWillNotDraw(!m30713z());
    }

    /* renamed from: e */
    private void m30734e() {
        WeakReference<View> weakReference = this.f9295J;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9295J = null;
    }

    /* renamed from: f */
    private View m30733f(View view) {
        int i;
        if (this.f9295J == null && (i = this.f9294I) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f9294I);
            }
            if (findViewById != null) {
                this.f9295J = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f9295J;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    private boolean m30728k() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C3455f) getChildAt(i).getLayoutParams()).m30666e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m30726m() {
        Behavior behavior = this.f9300O;
        BaseBehavior.SavedState m30687q0 = (behavior == null || this.f9302x == -1 || this.f9287B != 0) ? null : behavior.m30687q0(AbsSavedState.f3661x, this);
        this.f9302x = -1;
        this.f9303y = -1;
        this.f9304z = -1;
        if (m30687q0 != null) {
            this.f9300O.m30688p0(m30687q0, false);
        }
    }

    /* renamed from: u */
    private void m30718u(boolean z, boolean z2, boolean z3) {
        this.f9287B = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: v */
    private boolean m30717v(boolean z) {
        if (this.f9291F != z) {
            this.f9291F = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m30713z() {
        return this.f9299N != null && getTopInset() > 0;
    }

    /* renamed from: A */
    boolean m30742A(View view) {
        View m30733f = m30733f(view);
        if (m30733f != null) {
            view = m30733f;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: c */
    public void m30736c(InterfaceC3452c interfaceC3452c) {
        if (this.f9289D == null) {
            this.f9289D = new ArrayList();
        }
        if (interfaceC3452c == null || this.f9289D.contains(interfaceC3452c)) {
            return;
        }
        this.f9289D.add(interfaceC3452c);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3455f;
    }

    /* renamed from: d */
    public void m30735d(InterfaceC3457h interfaceC3457h) {
        m30736c(interfaceC3457h);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m30713z()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f9301w);
            this.f9299N.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9299N;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public C3455f mo30732g() {
        return new C3455f(-1, -2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0872b
    public CoordinatorLayout.AbstractC0873c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f9300O = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int i;
        int m38474F;
        int i2 = this.f9303y;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C3455f c3455f = (C3455f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c3455f.f9330a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) c3455f).topMargin + ((LinearLayout.LayoutParams) c3455f).bottomMargin;
                if ((i4 & 8) != 0) {
                    m38474F = C1112b0.m38474F(childAt);
                } else if ((i4 & 2) != 0) {
                    m38474F = measuredHeight - C1112b0.m38474F(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1112b0.m38482B(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + m38474F;
                if (childCount == 0) {
                    i = Math.min(i, measuredHeight - getTopInset());
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f9303y = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i = this.f9304z;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C3455f c3455f = (C3455f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c3455f).topMargin + ((LinearLayout.LayoutParams) c3455f).bottomMargin;
            int i4 = c3455f.f9330a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1112b0.m38474F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f9304z = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f9294I;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m38474F = C1112b0.m38474F(this);
        if (m38474F == 0) {
            int childCount = getChildCount();
            m38474F = childCount >= 1 ? C1112b0.m38474F(getChildAt(childCount - 1)) : 0;
            if (m38474F == 0) {
                return getHeight() / 3;
            }
        }
        return (m38474F * 2) + topInset;
    }

    int getPendingAction() {
        return this.f9287B;
    }

    public Drawable getStatusBarForeground() {
        return this.f9299N;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C1183m0 c1183m0 = this.f9288C;
        if (c1183m0 != null) {
            return c1183m0.m38103k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f9302x;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C3455f c3455f = (C3455f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c3455f.f9330a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + ((LinearLayout.LayoutParams) c3455f).topMargin + ((LinearLayout.LayoutParams) c3455f).bottomMargin;
            if (i2 == 0 && C1112b0.m38482B(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C1112b0.m38474F(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f9302x = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h */
    public C3455f mo30731h(AttributeSet attributeSet) {
        return new C3455f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i */
    public C3455f mo30730i(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C3455f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C3455f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C3455f(layoutParams);
    }

    /* renamed from: j */
    boolean m30729j() {
        return this.f9286A;
    }

    /* renamed from: l */
    boolean m30727l() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: n */
    public boolean m30725n() {
        return this.f9293H;
    }

    /* renamed from: o */
    void m30724o(int i) {
        this.f9301w = i;
        if (!willNotDraw()) {
            C1112b0.m38423j0(this);
        }
        List<InterfaceC3452c> list = this.f9289D;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC3452c interfaceC3452c = this.f9289D.get(i2);
                if (interfaceC3452c != null) {
                    interfaceC3452c.mo30638a(this, i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5961e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.f9298M == null) {
            this.f9298M = new int[4];
        }
        int[] iArr = this.f9298M;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f9291F;
        int i2 = C5419b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f9292G) ? C5419b.state_lifted : -C5419b.state_lifted;
        int i3 = C5419b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f9292G) ? C5419b.state_collapsed : -C5419b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m30734e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C1112b0.m38482B(this) && m30741B()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1112b0.m38435d0(getChildAt(childCount), topInset);
            }
        }
        m30726m();
        this.f9286A = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C3455f) getChildAt(i5).getLayoutParams()).m30667d() != null) {
                this.f9286A = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f9299N;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f9290E) {
            return;
        }
        if (!this.f9293H && !m30728k()) {
            z2 = false;
        }
        m30717v(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1112b0.m38482B(this) && m30741B()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C6298a.m21277b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m30726m();
    }

    /* renamed from: p */
    C1183m0 m30723p(C1183m0 c1183m0) {
        C1183m0 c1183m02 = C1112b0.m38482B(this) ? c1183m0 : null;
        if (!C1070c.m38634a(this.f9288C, c1183m02)) {
            this.f9288C = c1183m02;
            m30739D();
            requestLayout();
        }
        return c1183m0;
    }

    /* renamed from: q */
    public void m30722q(InterfaceC3452c interfaceC3452c) {
        List<InterfaceC3452c> list = this.f9289D;
        if (list == null || interfaceC3452c == null) {
            return;
        }
        list.remove(interfaceC3452c);
    }

    /* renamed from: r */
    public void m30721r(InterfaceC3457h interfaceC3457h) {
        m30722q(interfaceC3457h);
    }

    /* renamed from: s */
    void m30720s() {
        this.f9287B = 0;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C11145h.m5962d(this, f);
    }

    public void setExpanded(boolean z) {
        m30719t(z, C1112b0.m38446W(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f9293H = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f9294I = i;
        m30734e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f9290E = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f9299N;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9299N = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9299N.setState(getDrawableState());
                }
                C0981a.m38864m(this.f9299N, C1112b0.m38476E(this));
                this.f9299N.setVisible(getVisibility() == 0, false);
                this.f9299N.setCallback(this);
            }
            m30739D();
            C1112b0.m38423j0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C5586a.m23699b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3467e.m30602b(this, f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f9299N;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public void m30719t(boolean z, boolean z2) {
        m30718u(z, z2, true);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9299N;
    }

    /* renamed from: w */
    public boolean m30716w(boolean z) {
        return m30714y(z, true);
    }

    /* renamed from: x */
    boolean m30715x(boolean z) {
        return m30714y(z, !this.f9290E);
    }

    /* renamed from: y */
    boolean m30714y(boolean z, boolean z2) {
        if (!z2 || this.f9292G == z) {
            return false;
        }
        this.f9292G = z;
        refreshDrawableState();
        if (this.f9293H && (getBackground() instanceof C11141g)) {
            m30740C((C11141g) getBackground(), z);
            return true;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f9285P
            android.content.Context r11 = p419w8.C11602a.m4640c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f9302x = r11
            r10.f9303y = r11
            r10.f9304z = r11
            r6 = 0
            r10.f9287B = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f9297L = r0
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L36
            android.view.ViewOutlineProvider r0 = r10.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L33
            com.google.android.material.appbar.C3467e.m30603a(r10)
        L33:
            com.google.android.material.appbar.C3467e.m30601c(r10, r12, r13, r4)
        L36:
            int[] r2 = p100f8.C5429l.f15099a
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r13 = p100f8.C5429l.f15108b
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.C1112b0.m38399v0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L6e
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            v8.g r0 = new v8.g
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.m6004Z(r13)
            r0.m6015O(r7)
            androidx.core.view.C1112b0.m38399v0(r10, r0)
        L6e:
            int r13 = p100f8.C5429l.f15144f
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L7d
            boolean r13 = r12.getBoolean(r13, r6)
            r10.m30718u(r13, r6, r6)
        L7d:
            if (r8 < r9) goto L8f
            int r13 = p100f8.C5429l.f15135e
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L8f
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.C3467e.m30602b(r10, r13)
        L8f:
            r13 = 26
            if (r8 < r13) goto Lb1
            int r13 = p100f8.C5429l.f15126d
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        La2:
            int r13 = p100f8.C5429l.f15117c
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lb1
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        Lb1:
            int r13 = p100f8.C5429l.f15153g
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f9293H = r13
            int r13 = p100f8.C5429l.f15162h
            int r11 = r12.getResourceId(r13, r11)
            r10.f9294I = r11
            int r11 = p100f8.C5429l.f15171i
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            androidx.core.view.C1112b0.m38475E0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    /* loaded from: classes.dex */
    public static class C3455f extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f9330a;

        /* renamed from: b */
        private AbstractC3453d f9331b;

        /* renamed from: c */
        Interpolator f9332c;

        public C3455f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9330a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15180j);
            this.f9330a = obtainStyledAttributes.getInt(C5429l.f15197l, 0);
            m30665f(m30670a(obtainStyledAttributes.getInt(C5429l.f15189k, 0)));
            int i = C5429l.f15205m;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f9332c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private AbstractC3453d m30670a(int i) {
            if (i != 1) {
                return null;
            }
            return new C3454e();
        }

        /* renamed from: b */
        public AbstractC3453d m30669b() {
            return this.f9331b;
        }

        /* renamed from: c */
        public int m30668c() {
            return this.f9330a;
        }

        /* renamed from: d */
        public Interpolator m30667d() {
            return this.f9332c;
        }

        /* renamed from: e */
        boolean m30666e() {
            int i = this.f9330a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void m30665f(AbstractC3453d abstractC3453d) {
            this.f9331b = abstractC3453d;
        }

        /* renamed from: g */
        public void m30664g(int i) {
            this.f9330a = i;
        }

        public C3455f(int i, int i2) {
            super(i, i2);
            this.f9330a = 1;
        }

        public C3455f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9330a = 1;
        }

        public C3455f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9330a = 1;
        }

        public C3455f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9330a = 1;
        }
    }
}
