package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: x0 */
    static final int[] f5257x0 = {16842931};

    /* renamed from: y0 */
    private static final Comparator<C1720d> f5258y0 = new C1717a();

    /* renamed from: z0 */
    private static final C1725i f5259z0;

    /* renamed from: A */
    AbstractC1726a f5260A;

    /* renamed from: B */
    int f5261B;

    /* renamed from: C */
    private int f5262C;

    /* renamed from: D */
    private Parcelable f5263D;

    /* renamed from: E */
    private ClassLoader f5264E;

    /* renamed from: F */
    private Scroller f5265F;

    /* renamed from: G */
    private boolean f5266G;

    /* renamed from: H */
    private int f5267H;

    /* renamed from: I */
    private Drawable f5268I;

    /* renamed from: J */
    private int f5269J;

    /* renamed from: K */
    private int f5270K;

    /* renamed from: L */
    private float f5271L;

    /* renamed from: M */
    private float f5272M;

    /* renamed from: N */
    private int f5273N;

    /* renamed from: O */
    private boolean f5274O;

    /* renamed from: P */
    private boolean f5275P;

    /* renamed from: Q */
    private boolean f5276Q;

    /* renamed from: R */
    private int f5277R;

    /* renamed from: S */
    private boolean f5278S;

    /* renamed from: T */
    private boolean f5279T;

    /* renamed from: U */
    private int f5280U;

    /* renamed from: V */
    private int f5281V;

    /* renamed from: W */
    private int f5282W;

    /* renamed from: a0 */
    private float f5283a0;

    /* renamed from: b0 */
    private float f5284b0;

    /* renamed from: c0 */
    private float f5285c0;

    /* renamed from: d0 */
    private float f5286d0;

    /* renamed from: e0 */
    private int f5287e0;

    /* renamed from: f0 */
    private VelocityTracker f5288f0;

    /* renamed from: g0 */
    private int f5289g0;

    /* renamed from: h0 */
    private boolean f5290h0;

    /* renamed from: i0 */
    private EdgeEffect f5291i0;

    /* renamed from: j0 */
    private EdgeEffect f5292j0;

    /* renamed from: k0 */
    private boolean f5293k0;

    /* renamed from: l0 */
    private boolean f5294l0;

    /* renamed from: m0 */
    private int f5295m0;

    /* renamed from: n0 */
    private List<InterfaceC1723g> f5296n0;

    /* renamed from: o0 */
    private InterfaceC1723g f5297o0;

    /* renamed from: p0 */
    private InterfaceC1723g f5298p0;

    /* renamed from: q0 */
    private List<InterfaceC1722f> f5299q0;

    /* renamed from: r0 */
    private InterfaceC1724h f5300r0;

    /* renamed from: s0 */
    private int f5301s0;

    /* renamed from: t0 */
    private int f5302t0;

    /* renamed from: u0 */
    private ArrayList<View> f5303u0;

    /* renamed from: v0 */
    private final Runnable f5304v0;

    /* renamed from: w */
    private int f5305w;

    /* renamed from: w0 */
    private int f5306w0;

    /* renamed from: x */
    private final ArrayList<C1720d> f5307x;

    /* renamed from: y */
    private final C1720d f5308y;

    /* renamed from: z */
    private final Rect f5309z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1716a();

        /* renamed from: A */
        ClassLoader f5310A;

        /* renamed from: y */
        int f5311y;

        /* renamed from: z */
        Parcelable f5312z;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes.dex */
        static class C1716a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1716a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5311y + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5311y);
            parcel.writeParcelable(this.f5312z, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5311y = parcel.readInt();
            this.f5312z = parcel.readParcelable(classLoader);
            this.f5310A = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes.dex */
    static class C1717a implements Comparator<C1720d> {
        C1717a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1720d c1720d, C1720d c1720d2) {
            return c1720d.f5314b - c1720d2.f5314b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    static class animationInterpolatorC1718b implements Interpolator {
        animationInterpolatorC1718b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes.dex */
    public @interface InterfaceC1719c {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes.dex */
    public static class C1720d {

        /* renamed from: a */
        Object f5313a;

        /* renamed from: b */
        int f5314b;

        /* renamed from: c */
        boolean f5315c;

        /* renamed from: d */
        float f5316d;

        /* renamed from: e */
        float f5317e;

        C1720d() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes.dex */
    public interface InterfaceC1722f {
        /* renamed from: a */
        void mo29167a(ViewPager viewPager, AbstractC1726a abstractC1726a, AbstractC1726a abstractC1726a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes.dex */
    public interface InterfaceC1723g {
        /* renamed from: a */
        void mo29137a(int i, float f, int i2);

        /* renamed from: b */
        void mo29136b(int i);

        /* renamed from: c */
        void mo29135c(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes.dex */
    public interface InterfaceC1724h {
        /* renamed from: a */
        void m35534a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes.dex */
    public static class C1725i implements Comparator<View> {
        C1725i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            C1721e c1721e = (C1721e) view.getLayoutParams();
            C1721e c1721e2 = (C1721e) view2.getLayoutParams();
            boolean z = c1721e.f5318a;
            if (z != c1721e2.f5318a) {
                return z ? 1 : -1;
            }
            return c1721e.f5322e - c1721e2.f5322e;
        }
    }

    static {
        new animationInterpolatorC1718b();
        f5259z0 = new C1725i();
    }

    /* renamed from: A */
    private void m35575A(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.f5307x.isEmpty()) {
            if (!this.f5265F.isFinished()) {
                this.f5265F.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C1720d m35549p = m35549p(this.f5261B);
        int min = (int) ((m35549p != null ? Math.min(m35549p.f5317e, this.f5272M) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m35560e(false);
            scrollTo(min, getScrollY());
        }
    }

    /* renamed from: D */
    private void m35572D(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: E */
    private boolean m35571E() {
        this.f5287e0 = -1;
        m35554k();
        this.f5291i0.onRelease();
        this.f5292j0.onRelease();
        return this.f5291i0.isFinished() || this.f5292j0.isFinished();
    }

    /* renamed from: F */
    private void m35570F(int i, boolean z, int i2, boolean z2) {
        C1720d m35549p = m35549p(i);
        int clientWidth = m35549p != null ? (int) (getClientWidth() * Math.max(this.f5271L, Math.min(m35549p.f5317e, this.f5272M))) : 0;
        if (z) {
            m35566J(clientWidth, 0, i2);
            if (z2) {
                m35558g(i);
                return;
            }
            return;
        }
        if (z2) {
            m35558g(i);
        }
        m35560e(false);
        scrollTo(clientWidth, 0);
        m35542w(clientWidth);
    }

    /* renamed from: K */
    private void m35565K() {
        if (this.f5302t0 != 0) {
            ArrayList<View> arrayList = this.f5303u0;
            if (arrayList == null) {
                this.f5303u0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5303u0.add(getChildAt(i));
            }
            Collections.sort(this.f5303u0, f5259z0);
        }
    }

    /* renamed from: e */
    private void m35560e(boolean z) {
        boolean z2 = this.f5306w0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f5265F.isFinished()) {
                this.f5265F.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5265F.getCurrX();
                int currY = this.f5265F.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m35542w(currX);
                    }
                }
            }
        }
        this.f5276Q = false;
        for (int i = 0; i < this.f5307x.size(); i++) {
            C1720d c1720d = this.f5307x.get(i);
            if (c1720d.f5315c) {
                c1720d.f5315c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C1112b0.m38421k0(this, this.f5304v0);
            } else {
                this.f5304v0.run();
            }
        }
    }

    /* renamed from: f */
    private void m35559f(int i, float f, int i2) {
        InterfaceC1723g interfaceC1723g = this.f5297o0;
        if (interfaceC1723g != null) {
            interfaceC1723g.mo29137a(i, f, i2);
        }
        List<InterfaceC1723g> list = this.f5296n0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1723g interfaceC1723g2 = this.f5296n0.get(i3);
                if (interfaceC1723g2 != null) {
                    interfaceC1723g2.mo29137a(i, f, i2);
                }
            }
        }
        InterfaceC1723g interfaceC1723g3 = this.f5298p0;
        if (interfaceC1723g3 != null) {
            interfaceC1723g3.mo29137a(i, f, i2);
        }
    }

    /* renamed from: g */
    private void m35558g(int i) {
        InterfaceC1723g interfaceC1723g = this.f5297o0;
        if (interfaceC1723g != null) {
            interfaceC1723g.mo29135c(i);
        }
        List<InterfaceC1723g> list = this.f5296n0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1723g interfaceC1723g2 = this.f5296n0.get(i2);
                if (interfaceC1723g2 != null) {
                    interfaceC1723g2.mo29135c(i);
                }
            }
        }
        InterfaceC1723g interfaceC1723g3 = this.f5298p0;
        if (interfaceC1723g3 != null) {
            interfaceC1723g3.mo29135c(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m35557h(int i) {
        InterfaceC1723g interfaceC1723g = this.f5297o0;
        if (interfaceC1723g != null) {
            interfaceC1723g.mo29136b(i);
        }
        List<InterfaceC1723g> list = this.f5296n0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1723g interfaceC1723g2 = this.f5296n0.get(i2);
                if (interfaceC1723g2 != null) {
                    interfaceC1723g2.mo29136b(i);
                }
            }
        }
        InterfaceC1723g interfaceC1723g3 = this.f5298p0;
        if (interfaceC1723g3 != null) {
            interfaceC1723g3.mo29136b(i);
        }
    }

    /* renamed from: j */
    private void m35555j(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f5301s0 : 0, null);
        }
    }

    /* renamed from: k */
    private void m35554k() {
        this.f5278S = false;
        this.f5279T = false;
        VelocityTracker velocityTracker = this.f5288f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5288f0 = null;
        }
    }

    /* renamed from: m */
    private Rect m35552m(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: o */
    private C1720d m35550o() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.f5267H / clientWidth : 0.0f;
        int i2 = -1;
        float f3 = 0.0f;
        int i3 = 0;
        C1720d c1720d = null;
        boolean z = true;
        while (i3 < this.f5307x.size()) {
            C1720d c1720d2 = this.f5307x.get(i3);
            if (!z && c1720d2.f5314b != (i = i2 + 1)) {
                C1720d c1720d3 = this.f5308y;
                c1720d3.f5317e = f + f3 + f2;
                c1720d3.f5314b = i;
                throw null;
            }
            f = c1720d2.f5317e;
            float f4 = c1720d2.f5316d + f + f2;
            if (!z && scrollX < f) {
                return c1720d;
            }
            if (scrollX < f4 || i3 == this.f5307x.size() - 1) {
                return c1720d2;
            }
            i2 = c1720d2.f5314b;
            f3 = c1720d2.f5316d;
            i3++;
            z = false;
            c1720d = c1720d2;
        }
        return c1720d;
    }

    /* renamed from: q */
    private static boolean m35548q(View view) {
        return view.getClass().getAnnotation(InterfaceC1719c.class) != null;
    }

    /* renamed from: r */
    private boolean m35547r(float f, float f2) {
        return (f < ((float) this.f5281V) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f5281V)) && f2 < 0.0f);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f5275P != z) {
            this.f5275P = z;
        }
    }

    /* renamed from: t */
    private void m35545t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5287e0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5283a0 = motionEvent.getX(i);
            this.f5287e0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5288f0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: w */
    private boolean m35542w(int i) {
        if (this.f5307x.size() == 0) {
            if (this.f5293k0) {
                return false;
            }
            this.f5294l0 = false;
            m35546s(0, 0.0f, 0);
            if (this.f5294l0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C1720d m35550o = m35550o();
        int clientWidth = getClientWidth();
        int i2 = this.f5267H;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = m35550o.f5314b;
        float f2 = ((i / f) - m35550o.f5317e) / (m35550o.f5316d + (i2 / f));
        this.f5294l0 = false;
        m35546s(i4, f2, (int) (i3 * f2));
        if (this.f5294l0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: x */
    private boolean m35541x(float f) {
        this.f5283a0 = f;
        getScrollX();
        getClientWidth();
        ArrayList<C1720d> arrayList = this.f5307x;
        int i = this.f5307x.get(0).f5314b;
        int i2 = arrayList.get(arrayList.size() - 1).f5314b;
        throw null;
    }

    /* renamed from: B */
    public void m35574B(InterfaceC1722f interfaceC1722f) {
        List<InterfaceC1722f> list = this.f5299q0;
        if (list != null) {
            list.remove(interfaceC1722f);
        }
    }

    /* renamed from: C */
    public void m35573C(InterfaceC1723g interfaceC1723g) {
        List<InterfaceC1723g> list = this.f5296n0;
        if (list != null) {
            list.remove(interfaceC1723g);
        }
    }

    /* renamed from: G */
    public void m35569G(int i, boolean z) {
        this.f5276Q = false;
        m35568H(i, z, false);
    }

    /* renamed from: H */
    void m35568H(int i, boolean z, boolean z2) {
        m35567I(i, z, z2, 0);
    }

    /* renamed from: I */
    void m35567I(int i, boolean z, boolean z2, int i2) {
        setScrollingCacheEnabled(false);
    }

    /* renamed from: J */
    void m35566J(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5265F;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f5266G ? this.f5265F.getCurrX() : this.f5265F.getStartX();
            this.f5265F.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m35560e(false);
            m35540y();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f = clientWidth / 2;
        float m35556i = f + (m35556i(Math.min(1.0f, (Math.abs(i5) * 1.0f) / clientWidth)) * f);
        int abs = Math.abs(i3);
        if (abs > 0) {
            int min = Math.min(Math.round(Math.abs(m35556i / abs) * 1000.0f) * 4, 600);
            this.f5266G = false;
            this.f5265F.startScroll(i4, scrollY, i5, i6, min);
            C1112b0.m38423j0(this);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public void m35564a(InterfaceC1722f interfaceC1722f) {
        if (this.f5299q0 == null) {
            this.f5299q0 = new ArrayList();
        }
        this.f5299q0.add(interfaceC1722f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1720d m35551n;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (m35551n = m35551n(childAt)) != null && m35551n.f5314b == this.f5261B) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C1720d m35551n;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m35551n = m35551n(childAt)) != null && m35551n.f5314b == this.f5261B) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1721e c1721e = (C1721e) layoutParams;
        boolean m35548q = c1721e.f5318a | m35548q(view);
        c1721e.f5318a = m35548q;
        if (!this.f5274O) {
            super.addView(view, i, layoutParams);
        } else if (!m35548q) {
            c1721e.f5321d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void m35563b(InterfaceC1723g interfaceC1723g) {
        if (this.f5296n0 == null) {
            this.f5296n0 = new ArrayList();
        }
        this.f5296n0.add(interfaceC1723g);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m35562c(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.f5309z
            android.graphics.Rect r1 = r6.m35552m(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5309z
            android.graphics.Rect r2 = r6.m35552m(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.m35544u()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.f5309z
            android.graphics.Rect r1 = r6.m35552m(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5309z
            android.graphics.Rect r2 = r6.m35552m(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.m35543v()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.m35543v()
            goto Lcd
        Lc9:
            boolean r2 = r6.m35544u()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m35562c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1721e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f5266G = true;
        if (!this.f5265F.isFinished() && this.f5265F.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f5265F.getCurrX();
            int currY = this.f5265F.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m35542w(currX)) {
                    this.f5265F.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C1112b0.m38423j0(this);
            return;
        }
        m35560e(true);
    }

    /* renamed from: d */
    protected boolean m35561d(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m35561d(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m35553l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1720d m35551n;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (m35551n = m35551n(childAt)) != null && m35551n.f5314b == this.f5261B && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        if (getOverScrollMode() != 0) {
            this.f5291i0.finish();
            this.f5292j0.finish();
        } else {
            if (!this.f5291i0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f5271L * width);
                this.f5291i0.setSize(height, width);
                z = false | this.f5291i0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5292j0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f5272M + 1.0f)) * width2);
                this.f5292j0.setSize(height2, width2);
                z |= this.f5292j0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z) {
            C1112b0.m38423j0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5268I;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1721e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC1726a getAdapter() {
        return this.f5260A;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f5302t0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C1721e) this.f5303u0.get(i2).getLayoutParams()).f5323f;
    }

    public int getCurrentItem() {
        return this.f5261B;
    }

    public int getOffscreenPageLimit() {
        return this.f5277R;
    }

    public int getPageMargin() {
        return this.f5267H;
    }

    /* renamed from: i */
    float m35556i(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: l */
    public boolean m35553l(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return m35544u();
                }
                return m35562c(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return m35543v();
                }
                return m35562c(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m35562c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m35562c(1);
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    C1720d m35551n(View view) {
        if (this.f5307x.size() <= 0) {
            return null;
        }
        Object obj = this.f5307x.get(0).f5313a;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5293k0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f5304v0);
        Scroller scroller = this.f5265F;
        if (scroller != null && !scroller.isFinished()) {
            this.f5265F.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5267H <= 0 || this.f5268I == null) {
            return;
        }
        this.f5307x.size();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f5278S) {
                    return true;
                }
                if (this.f5279T) {
                    return false;
                }
            }
            if (action == 0) {
                float x = motionEvent.getX();
                this.f5285c0 = x;
                this.f5283a0 = x;
                float y = motionEvent.getY();
                this.f5286d0 = y;
                this.f5284b0 = y;
                this.f5287e0 = motionEvent.getPointerId(0);
                this.f5279T = false;
                this.f5266G = true;
                this.f5265F.computeScrollOffset();
                if (this.f5306w0 == 2 && Math.abs(this.f5265F.getFinalX() - this.f5265F.getCurrX()) > this.f5289g0) {
                    this.f5265F.abortAnimation();
                    this.f5276Q = false;
                    m35540y();
                    this.f5278S = true;
                    m35572D(true);
                    setScrollState(1);
                } else {
                    m35560e(false);
                    this.f5278S = false;
                }
            } else if (action == 2) {
                int i = this.f5287e0;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.f5283a0;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f5286d0);
                    int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    if (i2 != 0 && !m35547r(this.f5283a0, f) && m35561d(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f5283a0 = x2;
                        this.f5284b0 = y2;
                        this.f5279T = true;
                        return false;
                    }
                    int i3 = this.f5282W;
                    if (abs > i3 && abs * 0.5f > abs2) {
                        this.f5278S = true;
                        m35572D(true);
                        setScrollState(1);
                        float f2 = this.f5285c0;
                        float f3 = this.f5282W;
                        this.f5283a0 = i2 > 0 ? f2 + f3 : f2 - f3;
                        this.f5284b0 = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i3) {
                        this.f5279T = true;
                    }
                    if (this.f5278S && m35541x(x2)) {
                        C1112b0.m38423j0(this);
                    }
                }
            } else if (action == 6) {
                m35545t(motionEvent);
            }
            if (this.f5288f0 == null) {
                this.f5288f0 = VelocityTracker.obtain();
            }
            this.f5288f0.addMovement(motionEvent);
            return this.f5278S;
        }
        m35571E();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C1721e c1721e;
        C1721e c1721e2;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f5281V = Math.min(measuredWidth / 10, this.f5280U);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c1721e2 = (C1721e) childAt.getLayoutParams()) != null && c1721e2.f5318a) {
                int i6 = c1721e2.f5319b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c1721e2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c1721e2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f5273N = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f5274O = true;
        m35540y();
        this.f5274O = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c1721e = (C1721e) childAt2.getLayoutParams()) == null || !c1721e.f5318a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c1721e.f5320c), 1073741824), this.f5273N);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1720d m35551n;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (m35551n = m35551n(childAt)) != null && m35551n.f5314b == this.f5261B && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        this.f5262C = savedState.f5311y;
        this.f5263D = savedState.f5312z;
        this.f5264E = savedState.f5310A;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5311y = this.f5261B;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f5267H;
            m35575A(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5290h0) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    /* renamed from: p */
    C1720d m35549p(int i) {
        for (int i2 = 0; i2 < this.f5307x.size(); i2++) {
            C1720d c1720d = this.f5307x.get(i2);
            if (c1720d.f5314b == i) {
                return c1720d;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f5274O) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m35546s(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f5295m0
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r9 = (androidx.viewpager.widget.ViewPager.C1721e) r9
            boolean r10 = r9.f5318a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f5319b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.m35559f(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$h r13 = r12.f5300r0
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r0 = (androidx.viewpager.widget.ViewPager.C1721e) r0
            boolean r0 = r0.f5318a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$h r3 = r12.f5300r0
            r3.m35534a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.f5294l0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m35546s(int, float, int):void");
    }

    public void setAdapter(AbstractC1726a abstractC1726a) {
        AbstractC1726a abstractC1726a2 = this.f5260A;
        this.f5305w = 0;
        List<InterfaceC1722f> list = this.f5299q0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f5299q0.size();
        for (int i = 0; i < size; i++) {
            this.f5299q0.get(i).mo29167a(this, abstractC1726a2, abstractC1726a);
        }
    }

    public void setCurrentItem(int i) {
        this.f5276Q = false;
        m35568H(i, !this.f5293k0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.f5277R) {
            this.f5277R = i;
            m35540y();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1723g interfaceC1723g) {
        this.f5297o0 = interfaceC1723g;
    }

    public void setPageMargin(int i) {
        int i2 = this.f5267H;
        this.f5267H = i;
        int width = getWidth();
        m35575A(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5268I = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.f5306w0 == i) {
            return;
        }
        this.f5306w0 = i;
        if (this.f5300r0 != null) {
            m35555j(i != 0);
        }
        m35557h(i);
    }

    /* renamed from: u */
    boolean m35544u() {
        int i = this.f5261B;
        if (i > 0) {
            m35569G(i - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    boolean m35543v() {
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5268I;
    }

    /* renamed from: y */
    void m35540y() {
        m35539z(this.f5261B);
    }

    /* renamed from: z */
    void m35539z(int i) {
        int i2 = this.f5261B;
        if (i2 != i) {
            m35549p(i2);
            this.f5261B = i;
        }
        m35565K();
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes.dex */
    public static class C1721e extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5318a;

        /* renamed from: b */
        public int f5319b;

        /* renamed from: c */
        float f5320c;

        /* renamed from: d */
        boolean f5321d;

        /* renamed from: e */
        int f5322e;

        /* renamed from: f */
        int f5323f;

        public C1721e() {
            super(-1, -1);
            this.f5320c = 0.0f;
        }

        public C1721e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5320c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f5257x0);
            this.f5319b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1721e(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0928a.m39111f(getContext(), i));
    }
}
