package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.core.view.C1206p;
import androidx.core.view.C1210t;
import androidx.core.view.InterfaceC1205o;
import androidx.core.view.InterfaceC1209s;
import androidx.core.widget.C1235g;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC1209s, InterfaceC1205o {

    /* renamed from: n0 */
    private static final String f5058n0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: o0 */
    private static final int[] f5059o0 = {16842766};

    /* renamed from: A */
    private float f5060A;

    /* renamed from: B */
    private float f5061B;

    /* renamed from: C */
    private final C1210t f5062C;

    /* renamed from: D */
    private final C1206p f5063D;

    /* renamed from: E */
    private final int[] f5064E;

    /* renamed from: F */
    private final int[] f5065F;

    /* renamed from: G */
    private boolean f5066G;

    /* renamed from: H */
    private int f5067H;

    /* renamed from: I */
    int f5068I;

    /* renamed from: J */
    private float f5069J;

    /* renamed from: K */
    private float f5070K;

    /* renamed from: L */
    private boolean f5071L;

    /* renamed from: M */
    private int f5072M;

    /* renamed from: N */
    boolean f5073N;

    /* renamed from: O */
    private boolean f5074O;

    /* renamed from: P */
    private final DecelerateInterpolator f5075P;

    /* renamed from: Q */
    C1686a f5076Q;

    /* renamed from: R */
    private int f5077R;

    /* renamed from: S */
    protected int f5078S;

    /* renamed from: T */
    float f5079T;

    /* renamed from: U */
    protected int f5080U;

    /* renamed from: V */
    int f5081V;

    /* renamed from: W */
    int f5082W;

    /* renamed from: a0 */
    C1688b f5083a0;

    /* renamed from: b0 */
    private Animation f5084b0;

    /* renamed from: c0 */
    private Animation f5085c0;

    /* renamed from: d0 */
    private Animation f5086d0;

    /* renamed from: e0 */
    private Animation f5087e0;

    /* renamed from: f0 */
    private Animation f5088f0;

    /* renamed from: g0 */
    boolean f5089g0;

    /* renamed from: h0 */
    private int f5090h0;

    /* renamed from: i0 */
    boolean f5091i0;

    /* renamed from: j0 */
    private InterfaceC1684i f5092j0;

    /* renamed from: k0 */
    private Animation.AnimationListener f5093k0;

    /* renamed from: l0 */
    private final Animation f5094l0;

    /* renamed from: m0 */
    private final Animation f5095m0;

    /* renamed from: w */
    private View f5096w;

    /* renamed from: x */
    InterfaceC1685j f5097x;

    /* renamed from: y */
    boolean f5098y;

    /* renamed from: z */
    private int f5099z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    class animationAnimation$AnimationListenerC1676a implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1676a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC1685j interfaceC1685j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5098y) {
                swipeRefreshLayout.f5083a0.setAlpha(255);
                SwipeRefreshLayout.this.f5083a0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f5089g0 && (interfaceC1685j = swipeRefreshLayout2.f5097x) != null) {
                    interfaceC1685j.mo6745a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f5068I = swipeRefreshLayout3.f5076Q.getTop();
                return;
            }
            swipeRefreshLayout.m35748q();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    /* loaded from: classes.dex */
    public class C1677b extends Animation {
        C1677b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    /* loaded from: classes.dex */
    public class C1678c extends Animation {
        C1678c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    /* loaded from: classes.dex */
    public class C1679d extends Animation {

        /* renamed from: w */
        final /* synthetic */ int f5103w;

        /* renamed from: x */
        final /* synthetic */ int f5104x;

        C1679d(int i, int i2) {
            this.f5103w = i;
            this.f5104x = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            C1688b c1688b = SwipeRefreshLayout.this.f5083a0;
            int i = this.f5103w;
            c1688b.setAlpha((int) (i + ((this.f5104x - i) * f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e  reason: invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name and invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC1680e implements Animation.AnimationListener {
        animationAnimation$AnimationListenerC1680e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5073N) {
                return;
            }
            swipeRefreshLayout.m35742w(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    /* loaded from: classes.dex */
    class C1681f extends Animation {
        C1681f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5091i0) {
                i = swipeRefreshLayout.f5081V - Math.abs(swipeRefreshLayout.f5080U);
            } else {
                i = swipeRefreshLayout.f5081V;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f5078S;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) ((i - i2) * f))) - swipeRefreshLayout2.f5076Q.getTop());
            SwipeRefreshLayout.this.f5083a0.m35729g(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    /* loaded from: classes.dex */
    class C1682g extends Animation {
        C1682g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m35750l(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    /* loaded from: classes.dex */
    public class C1683h extends Animation {
        C1683h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f5079T;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m35750l(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    /* loaded from: classes.dex */
    public interface InterfaceC1684i {
        /* renamed from: a */
        boolean m35739a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    /* loaded from: classes.dex */
    public interface InterfaceC1685j {
        /* renamed from: a */
        void mo6745a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5098y = false;
        this.f5060A = -1.0f;
        this.f5064E = new int[2];
        this.f5065F = new int[2];
        this.f5072M = -1;
        this.f5077R = -1;
        this.f5093k0 = new animationAnimation$AnimationListenerC1676a();
        this.f5094l0 = new C1681f();
        this.f5095m0 = new C1682g();
        this.f5099z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5067H = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5075P = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5090h0 = (int) (displayMetrics.density * 40.0f);
        m35755d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f5081V = i;
        this.f5060A = i;
        this.f5062C = new C1210t(this);
        this.f5063D = new C1206p(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f5090h0;
        this.f5068I = i2;
        this.f5080U = i2;
        m35750l(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5059o0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m35758a(int i, Animation.AnimationListener animationListener) {
        this.f5078S = i;
        this.f5094l0.reset();
        this.f5094l0.setDuration(200L);
        this.f5094l0.setInterpolator(this.f5075P);
        if (animationListener != null) {
            this.f5076Q.m35737b(animationListener);
        }
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(this.f5094l0);
    }

    /* renamed from: b */
    private void m35757b(int i, Animation.AnimationListener animationListener) {
        if (this.f5073N) {
            m35741x(i, animationListener);
            return;
        }
        this.f5078S = i;
        this.f5095m0.reset();
        this.f5095m0.setDuration(200L);
        this.f5095m0.setInterpolator(this.f5075P);
        if (animationListener != null) {
            this.f5076Q.m35737b(animationListener);
        }
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(this.f5095m0);
    }

    /* renamed from: d */
    private void m35755d() {
        this.f5076Q = new C1686a(getContext(), -328966);
        C1688b c1688b = new C1688b(getContext());
        this.f5083a0 = c1688b;
        c1688b.m35721o(1);
        this.f5076Q.setImageDrawable(this.f5083a0);
        this.f5076Q.setVisibility(8);
        addView(this.f5076Q);
    }

    /* renamed from: e */
    private void m35754e() {
        if (this.f5096w == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f5076Q)) {
                    this.f5096w = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m35753f(float f) {
        if (f > this.f5060A) {
            m35747r(true, true);
            return;
        }
        this.f5098y = false;
        this.f5083a0.m35723m(0.0f, 0.0f);
        m35757b(this.f5068I, this.f5073N ? null : new animationAnimation$AnimationListenerC1680e());
        this.f5083a0.m35730f(false);
    }

    /* renamed from: g */
    private boolean m35752g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: k */
    private void m35751k(float f) {
        this.f5083a0.m35730f(true);
        float min = Math.min(1.0f, Math.abs(f / this.f5060A));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f5060A;
        int i = this.f5082W;
        if (i <= 0) {
            i = this.f5091i0 ? this.f5081V - this.f5080U : this.f5081V;
        }
        float f2 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f5080U + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f5076Q.getVisibility() != 0) {
            this.f5076Q.setVisibility(0);
        }
        if (!this.f5073N) {
            this.f5076Q.setScaleX(1.0f);
            this.f5076Q.setScaleY(1.0f);
        }
        if (this.f5073N) {
            setAnimationProgress(Math.min(1.0f, f / this.f5060A));
        }
        if (f < this.f5060A) {
            if (this.f5083a0.getAlpha() > 76 && !m35752g(this.f5086d0)) {
                m35743v();
            }
        } else if (this.f5083a0.getAlpha() < 255 && !m35752g(this.f5087e0)) {
            m35744u();
        }
        this.f5083a0.m35723m(0.0f, Math.min(0.8f, max * 0.8f));
        this.f5083a0.m35729g(Math.min(1.0f, max));
        this.f5083a0.m35726j((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f5068I);
    }

    /* renamed from: p */
    private void m35749p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5072M) {
            this.f5072M = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: r */
    private void m35747r(boolean z, boolean z2) {
        if (this.f5098y != z) {
            this.f5089g0 = z2;
            m35754e();
            this.f5098y = z;
            if (z) {
                m35758a(this.f5068I, this.f5093k0);
            } else {
                m35742w(this.f5093k0);
            }
        }
    }

    /* renamed from: s */
    private Animation m35746s(int i, int i2) {
        C1679d c1679d = new C1679d(i, i2);
        c1679d.setDuration(300L);
        this.f5076Q.m35737b(null);
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(c1679d);
        return c1679d;
    }

    private void setColorViewAlpha(int i) {
        this.f5076Q.getBackground().setAlpha(i);
        this.f5083a0.setAlpha(i);
    }

    /* renamed from: t */
    private void m35745t(float f) {
        float f2 = this.f5070K;
        int i = this.f5099z;
        if (f - f2 <= i || this.f5071L) {
            return;
        }
        this.f5069J = f2 + i;
        this.f5071L = true;
        this.f5083a0.setAlpha(76);
    }

    /* renamed from: u */
    private void m35744u() {
        this.f5087e0 = m35746s(this.f5083a0.getAlpha(), 255);
    }

    /* renamed from: v */
    private void m35743v() {
        this.f5086d0 = m35746s(this.f5083a0.getAlpha(), 76);
    }

    /* renamed from: x */
    private void m35741x(int i, Animation.AnimationListener animationListener) {
        this.f5078S = i;
        this.f5079T = this.f5076Q.getScaleX();
        C1683h c1683h = new C1683h();
        this.f5088f0 = c1683h;
        c1683h.setDuration(150L);
        if (animationListener != null) {
            this.f5076Q.m35737b(animationListener);
        }
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(this.f5088f0);
    }

    /* renamed from: y */
    private void m35740y(Animation.AnimationListener animationListener) {
        this.f5076Q.setVisibility(0);
        this.f5083a0.setAlpha(255);
        C1677b c1677b = new C1677b();
        this.f5084b0 = c1677b;
        c1677b.setDuration(this.f5067H);
        if (animationListener != null) {
            this.f5076Q.m35737b(animationListener);
        }
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(this.f5084b0);
    }

    /* renamed from: c */
    public boolean m35756c() {
        InterfaceC1684i interfaceC1684i = this.f5092j0;
        if (interfaceC1684i != null) {
            return interfaceC1684i.m35739a(this, this.f5096w);
        }
        View view = this.f5096w;
        if (view instanceof ListView) {
            return C1235g.m37900a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5063D.m38040a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5063D.m38039b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5063D.m38038c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5063D.m38035f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f5077R;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5062C.m38022a();
    }

    public int getProgressCircleDiameter() {
        return this.f5090h0;
    }

    public int getProgressViewEndOffset() {
        return this.f5081V;
    }

    public int getProgressViewStartOffset() {
        return this.f5080U;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f5063D.m38031j();
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public boolean isNestedScrollingEnabled() {
        return this.f5063D.m38029l();
    }

    /* renamed from: l */
    void m35750l(float f) {
        int i = this.f5078S;
        setTargetOffsetTopAndBottom((i + ((int) ((this.f5080U - i) * f))) - this.f5076Q.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m35748q();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m35754e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5074O && actionMasked == 0) {
            this.f5074O = false;
        }
        if (!isEnabled() || this.f5074O || m35756c() || this.f5098y || this.f5066G) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f5072M;
                    if (i == -1) {
                        Log.e(f5058n0, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m35745t(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m35749p(motionEvent);
                    }
                }
            }
            this.f5071L = false;
            this.f5072M = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f5080U - this.f5076Q.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5072M = pointerId;
            this.f5071L = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5070K = motionEvent.getY(findPointerIndex2);
        }
        return this.f5071L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f5096w == null) {
            m35754e();
        }
        View view = this.f5096w;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f5076Q.getMeasuredWidth();
        int measuredHeight2 = this.f5076Q.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f5068I;
        this.f5076Q.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5096w == null) {
            m35754e();
        }
        View view = this.f5096w;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f5076Q.measure(View.MeasureSpec.makeMeasureSpec(this.f5090h0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5090h0, 1073741824));
        this.f5077R = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.f5076Q) {
                this.f5077R = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f5061B;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f5061B = 0.0f;
                } else {
                    this.f5061B = f - f2;
                    iArr[1] = i2;
                }
                m35751k(this.f5061B);
            }
        }
        if (this.f5091i0 && i2 > 0 && this.f5061B == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f5076Q.setVisibility(8);
        }
        int[] iArr2 = this.f5064E;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f5065F);
        int i5 = i4 + this.f5065F[1];
        if (i5 >= 0 || m35756c()) {
            return;
        }
        float abs = this.f5061B + Math.abs(i5);
        this.f5061B = abs;
        m35751k(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5062C.m38021b(view, view2, i);
        startNestedScroll(i & 2);
        this.f5061B = 0.0f;
        this.f5066G = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f5074O || this.f5098y || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onStopNestedScroll(View view) {
        this.f5062C.m38019d(view);
        this.f5066G = false;
        float f = this.f5061B;
        if (f > 0.0f) {
            m35753f(f);
            this.f5061B = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5074O && actionMasked == 0) {
            this.f5074O = false;
        }
        if (!isEnabled() || this.f5074O || m35756c() || this.f5098y || this.f5066G) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5072M = motionEvent.getPointerId(0);
            this.f5071L = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5072M);
            if (findPointerIndex < 0) {
                Log.e(f5058n0, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5071L) {
                this.f5071L = false;
                m35753f((motionEvent.getY(findPointerIndex) - this.f5069J) * 0.5f);
            }
            this.f5072M = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5072M);
            if (findPointerIndex2 < 0) {
                Log.e(f5058n0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m35745t(y);
            if (this.f5071L) {
                float f = (y - this.f5069J) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m35751k(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f5058n0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5072M = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m35749p(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: q */
    void m35748q() {
        this.f5076Q.clearAnimation();
        this.f5083a0.stop();
        this.f5076Q.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f5073N) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f5080U - this.f5068I);
        }
        this.f5068I = this.f5076Q.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.f5096w instanceof AbsListView)) {
            View view = this.f5096w;
            if (view == null || C1112b0.m38445X(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    void setAnimationProgress(float f) {
        this.f5076Q.setScaleX(f);
        this.f5076Q.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m35754e();
        this.f5083a0.m35727i(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0928a.m39113d(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f5060A = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m35748q();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f5063D.m38028m(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC1684i interfaceC1684i) {
        this.f5092j0 = interfaceC1684i;
    }

    public void setOnRefreshListener(InterfaceC1685j interfaceC1685j) {
        this.f5097x = interfaceC1685j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f5076Q.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0928a.m39113d(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.f5098y != z) {
            this.f5098y = z;
            if (!this.f5091i0) {
                i = this.f5081V + this.f5080U;
            } else {
                i = this.f5081V;
            }
            setTargetOffsetTopAndBottom(i - this.f5068I);
            this.f5089g0 = false;
            m35740y(this.f5093k0);
            return;
        }
        m35747r(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f5090h0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f5090h0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f5076Q.setImageDrawable(null);
            this.f5083a0.m35721o(i);
            this.f5076Q.setImageDrawable(this.f5083a0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f5082W = i;
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f5076Q.bringToFront();
        C1112b0.m38435d0(this.f5076Q, i);
        this.f5068I = this.f5076Q.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f5063D.m38026o(i);
    }

    @Override // android.view.View, androidx.core.view.InterfaceC1205o
    public void stopNestedScroll() {
        this.f5063D.m38024q();
    }

    /* renamed from: w */
    void m35742w(Animation.AnimationListener animationListener) {
        C1678c c1678c = new C1678c();
        this.f5085c0 = c1678c;
        c1678c.setDuration(150L);
        this.f5076Q.m35737b(animationListener);
        this.f5076Q.clearAnimation();
        this.f5076Q.startAnimation(this.f5085c0);
    }
}
