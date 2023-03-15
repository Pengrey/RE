package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1198n;
import androidx.core.view.C1206p;
import androidx.core.view.C1210t;
import androidx.core.view.InterfaceC1205o;
import androidx.core.view.InterfaceC1208r;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.C1094e;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.ArrayList;
import p128h2.C5814a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1208r, InterfaceC1205o {

    /* renamed from: W */
    private static final C1219a f3584W = new C1219a();

    /* renamed from: a0 */
    private static final int[] f3585a0 = {16843130};

    /* renamed from: A */
    public EdgeEffect f3586A;

    /* renamed from: B */
    private int f3587B;

    /* renamed from: C */
    private boolean f3588C;

    /* renamed from: D */
    private boolean f3589D;

    /* renamed from: E */
    private View f3590E;

    /* renamed from: F */
    private boolean f3591F;

    /* renamed from: G */
    private VelocityTracker f3592G;

    /* renamed from: H */
    private boolean f3593H;

    /* renamed from: I */
    private boolean f3594I;

    /* renamed from: J */
    private int f3595J;

    /* renamed from: K */
    private int f3596K;

    /* renamed from: L */
    private int f3597L;

    /* renamed from: M */
    private int f3598M;

    /* renamed from: N */
    private final int[] f3599N;

    /* renamed from: O */
    private final int[] f3600O;

    /* renamed from: P */
    private int f3601P;

    /* renamed from: Q */
    private int f3602Q;

    /* renamed from: R */
    private SavedState f3603R;

    /* renamed from: S */
    private final C1210t f3604S;

    /* renamed from: T */
    private final C1206p f3605T;

    /* renamed from: U */
    private float f3606U;

    /* renamed from: V */
    private InterfaceC1221c f3607V;

    /* renamed from: w */
    private long f3608w;

    /* renamed from: x */
    private final Rect f3609x;

    /* renamed from: y */
    private OverScroller f3610y;

    /* renamed from: z */
    public EdgeEffect f3611z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1218a();

        /* renamed from: w */
        public int f3612w;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes.dex */
        class C1218a implements Parcelable.Creator<SavedState> {
            C1218a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo37963a(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] mo37962b(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3612w + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3612w);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3612w = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    static class C1219a extends C1078a {
        C1219a() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: f */
        public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo19281f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1094e.m38501a(accessibilityEvent, nestedScrollView.getScrollX());
            C1094e.m38500b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            int scrollRange;
            super.mo19280g(view, c1085c);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1085c.m38562a0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c1085c.m38598B0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1085c.m38561b(C1085c.C1086a.f3429i);
                c1085c.m38561b(C1085c.C1086a.f3433m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c1085c.m38561b(C1085c.C1086a.f3428h);
                c1085c.m38561b(C1085c.C1086a.f3435o);
            }
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: j */
        public boolean mo28844j(View view, int i, Bundle bundle) {
            if (super.mo28844j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                int height = nestedScrollView.getHeight();
                Rect rect = new Rect();
                if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                    height = rect.height();
                }
                if (i != 4096) {
                    if (i == 8192 || i == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.m37993Q(0, max, true);
                            return true;
                        }
                        return false;
                    } else if (i != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.m37993Q(0, min, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    static class C1220b {
        /* renamed from: a */
        static boolean m37961a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1221c {
        /* renamed from: a */
        void mo6751a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5814a.nestedScrollViewStyle);
    }

    /* renamed from: A */
    private boolean m38009A(View view) {
        return !m38007C(view, 0, getHeight());
    }

    /* renamed from: B */
    private static boolean m38008B(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m38008B((View) parent, view2);
    }

    /* renamed from: C */
    private boolean m38007C(View view, int i, int i2) {
        view.getDrawingRect(this.f3609x);
        offsetDescendantRectToMyCoords(view, this.f3609x);
        return this.f3609x.bottom + i >= getScrollY() && this.f3609x.top - i <= getScrollY() + i2;
    }

    /* renamed from: D */
    private void m38006D(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3605T.m38036e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: E */
    private void m38005E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3598M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3587B = (int) motionEvent.getY(i);
            this.f3598M = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3592G;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: H */
    private void m38002H() {
        VelocityTracker velocityTracker = this.f3592G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3592G = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m38001I(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3611z
            float r0 = androidx.core.widget.C1229d.m37918b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3611z
            float r4 = -r4
            float r4 = androidx.core.widget.C1229d.m37916d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3611z
            float r5 = androidx.core.widget.C1229d.m37918b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3611z
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3586A
            float r0 = androidx.core.widget.C1229d.m37918b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3586A
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C1229d.m37916d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3586A
            float r5 = androidx.core.widget.C1229d.m37918b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3586A
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m38001I(int, float):int");
    }

    /* renamed from: J */
    private void m38000J(boolean z) {
        if (z) {
            m37992R(2, 1);
        } else {
            m37990T(1);
        }
        this.f3602Q = getScrollY();
        C1112b0.m38423j0(this);
    }

    /* renamed from: K */
    private boolean m37999K(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View m37971s = m37971s(z2, i2, i3);
        if (m37971s == null) {
            m37971s = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m37978l(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (m37971s != findFocus()) {
            m37971s.requestFocus(i);
        }
        return z;
    }

    /* renamed from: L */
    private void m37998L(View view) {
        view.getDrawingRect(this.f3609x);
        offsetDescendantRectToMyCoords(view, this.f3609x);
        int m37984f = m37984f(this.f3609x);
        if (m37984f != 0) {
            scrollBy(0, m37984f);
        }
    }

    /* renamed from: M */
    private boolean m37997M(Rect rect, boolean z) {
        int m37984f = m37984f(rect);
        boolean z2 = m37984f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m37984f);
            } else {
                m37996N(0, m37984f);
            }
        }
        return z2;
    }

    /* renamed from: O */
    private void m37995O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3608w > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f3610y;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
            m38000J(z);
        } else {
            if (!this.f3610y.isFinished()) {
                m37989a();
            }
            scrollBy(i, i2);
        }
        this.f3608w = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: S */
    private boolean m37991S(MotionEvent motionEvent) {
        boolean z;
        if (C1229d.m37918b(this.f3611z) != 0.0f) {
            C1229d.m37916d(this.f3611z, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C1229d.m37918b(this.f3586A) != 0.0f) {
            C1229d.m37916d(this.f3586A, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    /* renamed from: a */
    private void m37989a() {
        this.f3610y.abortAnimation();
        m37990T(1);
    }

    /* renamed from: c */
    private boolean m37987c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m37986d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
        }
        return false;
    }

    /* renamed from: e */
    private static int m37985e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3606U == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3606U = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3606U;
    }

    /* renamed from: l */
    private void m37978l(int i) {
        if (i != 0) {
            if (this.f3594I) {
                m37996N(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: p */
    private boolean m37974p(int i) {
        if (C1229d.m37918b(this.f3611z) != 0.0f) {
            this.f3611z.onAbsorb(i);
        } else if (C1229d.m37918b(this.f3586A) == 0.0f) {
            return false;
        } else {
            this.f3586A.onAbsorb(-i);
        }
        return true;
    }

    /* renamed from: q */
    private void m37973q() {
        this.f3591F = false;
        m38002H();
        m37990T(0);
        this.f3611z.onRelease();
        this.f3586A.onRelease();
    }

    /* renamed from: s */
    private View m37971s(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: w */
    private boolean m37967w(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
        }
        return false;
    }

    /* renamed from: x */
    private void m37966x() {
        VelocityTracker velocityTracker = this.f3592G;
        if (velocityTracker == null) {
            this.f3592G = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: y */
    private void m37965y() {
        this.f3610y = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3595J = viewConfiguration.getScaledTouchSlop();
        this.f3596K = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3597L = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: z */
    private void m37964z() {
        if (this.f3592G == null) {
            this.f3592G = VelocityTracker.obtain();
        }
    }

    /* renamed from: F */
    boolean m38004F(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !m37968v(1)) {
            this.f3610y.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    /* renamed from: G */
    public boolean m38003G(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3609x.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3609x;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3609x.top = getScrollY() - height;
            Rect rect2 = this.f3609x;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3609x;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m37999K(i, i2, i3);
    }

    /* renamed from: N */
    public final void m37996N(int i, int i2) {
        m37995O(i, i2, 250, false);
    }

    /* renamed from: P */
    void m37994P(int i, int i2, int i3, boolean z) {
        m37995O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: Q */
    void m37993Q(int i, int i2, boolean z) {
        m37994P(i, i2, 250, z);
    }

    /* renamed from: R */
    public boolean m37992R(int i, int i2) {
        return this.f3605T.m38025p(i, i2);
    }

    /* renamed from: T */
    public void m37990T(int i) {
        this.f3605T.m38023r(i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean m37988b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m38007C(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f3609x);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3609x);
            m37978l(m37984f(this.f3609x));
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m37978l(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && m38009A(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3610y.isFinished()) {
            return;
        }
        this.f3610y.computeScrollOffset();
        int currY = this.f3610y.getCurrY();
        int i = currY - this.f3602Q;
        this.f3602Q = currY;
        int[] iArr = this.f3600O;
        boolean z = false;
        iArr[1] = 0;
        m37983g(0, i, iArr, null, 1);
        int i2 = i - this.f3600O[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m38004F(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f3600O;
            iArr2[1] = 0;
            m37979k(0, scrollY2, 0, i3, this.f3599N, 1, iArr2);
            i2 = i3 - this.f3600O[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i2 < 0) {
                    if (this.f3611z.isFinished()) {
                        this.f3611z.onAbsorb((int) this.f3610y.getCurrVelocity());
                    }
                } else if (this.f3586A.isFinished()) {
                    this.f3586A.onAbsorb((int) this.f3610y.getCurrVelocity());
                }
            }
            m37989a();
        }
        if (!this.f3610y.isFinished()) {
            C1112b0.m38423j0(this);
        } else {
            m37990T(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m37972r(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3605T.m38040a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3605T.m38039b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m37983g(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3605T.m38035f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i = 0;
        if (!this.f3611z.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 21 || C1220b.m37961a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i2 >= 21 && C1220b.m37961a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f3611z.setSize(width, height);
            if (this.f3611z.draw(canvas)) {
                C1112b0.m38423j0(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f3586A.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21 || C1220b.m37961a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i = 0 + getPaddingLeft();
        }
        if (i3 >= 21 && C1220b.m37961a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3586A.setSize(width2, height2);
        if (this.f3586A.draw(canvas)) {
            C1112b0.m38423j0(this);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: f */
    protected int m37984f(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: g */
    public boolean m37983g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3605T.m38037d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3604S.m38022a();
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: h */
    public void mo37982h(View view, View view2, int i, int i2) {
        this.f3604S.m38020c(view, view2, i, i2);
        m37992R(2, i2);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m37968v(0);
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: i */
    public void mo37981i(View view, int i) {
        this.f3604S.m38018e(view, i);
        m37990T(i);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public boolean isNestedScrollingEnabled() {
        return this.f3605T.m38029l();
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: j */
    public void mo37980j(View view, int i, int i2, int[] iArr, int i3) {
        m37983g(i, i2, iArr, null, i3);
    }

    /* renamed from: k */
    public void m37979k(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3605T.m38036e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // androidx.core.view.InterfaceC1208r
    /* renamed from: m */
    public void mo37977m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m38006D(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: n */
    public void mo37976n(View view, int i, int i2, int i3, int i4, int i5) {
        m38006D(i4, i5, null);
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: o */
    public boolean mo37975o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3589D = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        boolean z;
        int i = 0;
        if (motionEvent.getAction() == 8 && !this.f3591F) {
            if (C1198n.m38051a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
            } else {
                axisValue = C1198n.m38051a(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            }
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    if (m37987c() && !C1198n.m38051a(motionEvent, 8194)) {
                        C1229d.m37916d(this.f3611z, (-verticalScrollFactorCompat) / getHeight(), 0.5f);
                        this.f3611z.onRelease();
                        invalidate();
                        z = 1;
                    } else {
                        z = 0;
                    }
                } else if (verticalScrollFactorCompat > scrollRange) {
                    if (m37987c() && !C1198n.m38051a(motionEvent, 8194)) {
                        C1229d.m37916d(this.f3586A, (verticalScrollFactorCompat - scrollRange) / getHeight(), 0.5f);
                        this.f3586A.onRelease();
                        invalidate();
                        i = 1;
                    }
                    z = i;
                    i = scrollRange;
                } else {
                    z = 0;
                    i = verticalScrollFactorCompat;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3591F) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3598M;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3587B) > this.f3595J && (2 & getNestedScrollAxes()) == 0) {
                                this.f3591F = true;
                                this.f3587B = y;
                                m37964z();
                                this.f3592G.addMovement(motionEvent);
                                this.f3601P = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m38005E(motionEvent);
                    }
                }
            }
            this.f3591F = false;
            this.f3598M = -1;
            m38002H();
            if (this.f3610y.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C1112b0.m38423j0(this);
            }
            m37990T(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m37967w((int) motionEvent.getX(), y2)) {
                if (!m37991S(motionEvent) && this.f3610y.isFinished()) {
                    z = false;
                }
                this.f3591F = z;
                m38002H();
            } else {
                this.f3587B = y2;
                this.f3598M = motionEvent.getPointerId(0);
                m37966x();
                this.f3592G.addMovement(motionEvent);
                this.f3610y.computeScrollOffset();
                if (!m37991S(motionEvent) && this.f3610y.isFinished()) {
                    z = false;
                }
                this.f3591F = z;
                m37992R(2, 0);
            }
        }
        return this.f3591F;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3588C = false;
        View view = this.f3590E;
        if (view != null && m38008B(view, this)) {
            m37998L(this.f3590E);
        }
        this.f3590E = null;
        if (!this.f3589D) {
            if (this.f3603R != null) {
                scrollTo(getScrollX(), this.f3603R.f3612w);
                this.f3603R = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m37985e = m37985e(scrollY, paddingTop, i5);
            if (m37985e != scrollY) {
                scrollTo(getScrollX(), m37985e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3589D = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3593H && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m37970t((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo37980j(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m38006D(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo37982h(view, view2, i, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || m38009A(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3603R = savedState;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3612w = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1221c interfaceC1221c = this.f3607V;
        if (interfaceC1221c != null) {
            interfaceC1221c.mo6751a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m38007C(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f3609x);
        offsetDescendantRectToMyCoords(findFocus, this.f3609x);
        m37978l(m37984f(this.f3609x));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo37975o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onStopNestedScroll(View view) {
        mo37981i(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean m37972r(KeyEvent keyEvent) {
        this.f3609x.setEmpty();
        if (!m37986d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (!keyEvent.isAltPressed()) {
                    return m37988b(33);
                }
                return m37969u(33);
            } else if (keyCode == 20) {
                if (!keyEvent.isAltPressed()) {
                    return m37988b(130);
                }
                return m37969u(130);
            } else if (keyCode != 62) {
                return false;
            } else {
                m38003G(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3588C) {
            m37998L(view2);
        } else {
            this.f3590E = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m37997M(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m38002H();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3588C = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int m37985e = m37985e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int m37985e2 = m37985e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (m37985e == getScrollX() && m37985e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m37985e, m37985e2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3593H) {
            this.f3593H = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f3605T.m38028m(z);
    }

    public void setOnScrollChangeListener(InterfaceC1221c interfaceC1221c) {
        this.f3607V = interfaceC1221c;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3594I = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m37992R(i, 0);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public void stopNestedScroll() {
        m37990T(0);
    }

    /* renamed from: t */
    public void m37970t(int i) {
        if (getChildCount() > 0) {
            this.f3610y.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Reader.READ_DONE, 0, 0);
            m38000J(true);
        }
    }

    /* renamed from: u */
    public boolean m37969u(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3609x;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3609x.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3609x;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3609x;
        return m37999K(i, rect3.top, rect3.bottom);
    }

    /* renamed from: v */
    public boolean m37968v(int i) {
        return this.f3605T.m38030k(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3609x = new Rect();
        this.f3588C = true;
        this.f3589D = false;
        this.f3590E = null;
        this.f3591F = false;
        this.f3594I = true;
        this.f3598M = -1;
        this.f3599N = new int[2];
        this.f3600O = new int[2];
        this.f3611z = C1229d.m37919a(context, attributeSet);
        this.f3586A = C1229d.m37919a(context, attributeSet);
        m37965y();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3585a0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3604S = new C1210t(this);
        this.f3605T = new C1206p(this);
        setNestedScrollingEnabled(true);
        C1112b0.m38405s0(this, f3584W);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
