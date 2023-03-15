package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.core.graphics.C0970b;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.C1210t;
import androidx.core.view.InterfaceC1207q;
import androidx.core.view.InterfaceC1208r;
import androidx.core.view.InterfaceC1209s;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p070e.C4897a;
import p070e.C4902f;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0542z, InterfaceC1209s, InterfaceC1207q, InterfaceC1208r {

    /* renamed from: e0 */
    static final int[] f1189e0 = {C4897a.actionBarSize, 16842841};

    /* renamed from: A */
    private InterfaceC0454a0 f1190A;

    /* renamed from: B */
    private Drawable f1191B;

    /* renamed from: C */
    private boolean f1192C;

    /* renamed from: D */
    private boolean f1193D;

    /* renamed from: E */
    private boolean f1194E;

    /* renamed from: F */
    private boolean f1195F;

    /* renamed from: G */
    boolean f1196G;

    /* renamed from: H */
    private int f1197H;

    /* renamed from: I */
    private int f1198I;

    /* renamed from: J */
    private final Rect f1199J;

    /* renamed from: K */
    private final Rect f1200K;

    /* renamed from: L */
    private final Rect f1201L;

    /* renamed from: M */
    private final Rect f1202M;

    /* renamed from: N */
    private final Rect f1203N;

    /* renamed from: O */
    private final Rect f1204O;

    /* renamed from: P */
    private final Rect f1205P;

    /* renamed from: Q */
    private C1183m0 f1206Q;

    /* renamed from: R */
    private C1183m0 f1207R;

    /* renamed from: S */
    private C1183m0 f1208S;

    /* renamed from: T */
    private C1183m0 f1209T;

    /* renamed from: U */
    private InterfaceC0399d f1210U;

    /* renamed from: V */
    private OverScroller f1211V;

    /* renamed from: W */
    ViewPropertyAnimator f1212W;

    /* renamed from: a0 */
    final AnimatorListenerAdapter f1213a0;

    /* renamed from: b0 */
    private final Runnable f1214b0;

    /* renamed from: c0 */
    private final Runnable f1215c0;

    /* renamed from: d0 */
    private final C1210t f1216d0;

    /* renamed from: w */
    private int f1217w;

    /* renamed from: x */
    private int f1218x;

    /* renamed from: y */
    private ContentFrameLayout f1219y;

    /* renamed from: z */
    ActionBarContainer f1220z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    class C0396a extends AnimatorListenerAdapter {
        C0396a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1212W = null;
            actionBarOverlayLayout.f1196G = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1212W = null;
            actionBarOverlayLayout.f1196G = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    class RunnableC0397b implements Runnable {
        RunnableC0397b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40915u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1212W = actionBarOverlayLayout.f1220z.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1213a0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    class RunnableC0398c implements Runnable {
        RunnableC0398c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m40915u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1212W = actionBarOverlayLayout.f1220z.animate().translationY(-ActionBarOverlayLayout.this.f1220z.getHeight()).setListener(ActionBarOverlayLayout.this.f1213a0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0399d {
        /* renamed from: a */
        void mo40909a();

        /* renamed from: b */
        void mo40908b();

        /* renamed from: c */
        void mo40907c(int i);

        /* renamed from: d */
        void mo40906d();

        /* renamed from: e */
        void mo40905e(boolean z);

        /* renamed from: f */
        void mo40904f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0400e extends ViewGroup.MarginLayoutParams {
        public C0400e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0400e(int i, int i2) {
            super(i, i2);
        }

        public C0400e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1218x = 0;
        this.f1199J = new Rect();
        this.f1200K = new Rect();
        this.f1201L = new Rect();
        this.f1202M = new Rect();
        this.f1203N = new Rect();
        this.f1204O = new Rect();
        this.f1205P = new Rect();
        C1183m0 c1183m0 = C1183m0.f3536b;
        this.f1206Q = c1183m0;
        this.f1207R = c1183m0;
        this.f1208S = c1183m0;
        this.f1209T = c1183m0;
        this.f1213a0 = new C0396a();
        this.f1214b0 = new RunnableC0397b();
        this.f1215c0 = new RunnableC0398c();
        m40914v(context);
        this.f1216d0 = new C1210t(this);
    }

    /* renamed from: A */
    private void m40922A() {
        m40915u();
        this.f1214b0.run();
    }

    /* renamed from: B */
    private boolean m40921B(float f) {
        this.f1211V.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Reader.READ_DONE);
        return this.f1211V.getFinalY() > this.f1220z.getHeight();
    }

    /* renamed from: p */
    private void m40920p() {
        m40915u();
        this.f1215c0.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40919q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0400e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m40919q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: t */
    private InterfaceC0454a0 m40916t(View view) {
        if (view instanceof InterfaceC0454a0) {
            return (InterfaceC0454a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: v */
    private void m40914v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1189e0);
        this.f1217w = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1191B = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1192C = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1211V = new OverScroller(context);
    }

    /* renamed from: x */
    private void m40912x() {
        m40915u();
        postDelayed(this.f1215c0, 600L);
    }

    /* renamed from: y */
    private void m40911y() {
        m40915u();
        postDelayed(this.f1214b0, 600L);
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: a */
    public void mo40328a(Menu menu, InterfaceC0387j.InterfaceC0388a interfaceC0388a) {
        m40910z();
        this.f1190A.mo40443a(menu, interfaceC0388a);
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: b */
    public boolean mo40327b() {
        m40910z();
        return this.f1190A.mo40442b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: c */
    public void mo40326c() {
        m40910z();
        this.f1190A.mo40441c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0400e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: d */
    public boolean mo40325d() {
        m40910z();
        return this.f1190A.mo40440d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1191B == null || this.f1192C) {
            return;
        }
        int bottom = this.f1220z.getVisibility() == 0 ? (int) (this.f1220z.getBottom() + this.f1220z.getTranslationY() + 0.5f) : 0;
        this.f1191B.setBounds(0, bottom, getWidth(), this.f1191B.getIntrinsicHeight() + bottom);
        this.f1191B.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: e */
    public boolean mo40324e() {
        m40910z();
        return this.f1190A.mo40439e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: f */
    public boolean mo40323f() {
        m40910z();
        return this.f1190A.mo40438f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m40910z();
        boolean m40919q = m40919q(this.f1220z, rect, true, true, false, true);
        this.f1202M.set(rect);
        C0541y0.m40331a(this, this.f1202M, this.f1199J);
        if (!this.f1203N.equals(this.f1202M)) {
            this.f1203N.set(this.f1202M);
            m40919q = true;
        }
        if (!this.f1200K.equals(this.f1199J)) {
            this.f1200K.set(this.f1199J);
            m40919q = true;
        }
        if (m40919q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: g */
    public boolean mo40322g() {
        m40910z();
        return this.f1190A.mo40437g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1220z;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1216d0.m38022a();
    }

    public CharSequence getTitle() {
        m40910z();
        return this.f1190A.getTitle();
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: h */
    public void mo37982h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: i */
    public void mo37981i(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: j */
    public void mo37980j(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: k */
    public void mo40321k(int i) {
        m40910z();
        if (i == 2) {
            this.f1190A.mo40425s();
        } else if (i == 5) {
            this.f1190A.mo40424t();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    /* renamed from: l */
    public void mo40320l() {
        m40910z();
        this.f1190A.mo40436h();
    }

    @Override // androidx.core.view.InterfaceC1208r
    /* renamed from: m */
    public void mo37977m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo37976n(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: n */
    public void mo37976n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.view.InterfaceC1207q
    /* renamed from: o */
    public boolean mo37975o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m40910z();
        C1183m0 m38092v = C1183m0.m38092v(windowInsets, this);
        boolean m40919q = m40919q(this.f1220z, new Rect(m38092v.m38105i(), m38092v.m38103k(), m38092v.m38104j(), m38092v.m38106h()), true, true, false, true);
        C1112b0.m38428h(this, m38092v, this.f1199J);
        Rect rect = this.f1199J;
        C1183m0 m38102l = m38092v.m38102l(rect.left, rect.top, rect.right, rect.bottom);
        this.f1206Q = m38102l;
        boolean z = true;
        if (!this.f1207R.equals(m38102l)) {
            this.f1207R = this.f1206Q;
            m40919q = true;
        }
        if (this.f1200K.equals(this.f1199J)) {
            z = m40919q;
        } else {
            this.f1200K.set(this.f1199J);
        }
        if (z) {
            requestLayout();
        }
        return m38092v.m38113a().m38111c().m38112b().m38094t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m40914v(getContext());
        C1112b0.m38411p0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40915u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0400e c0400e = (C0400e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0400e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0400e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        m40910z();
        measureChildWithMargins(this.f1220z, i, 0, i2, 0);
        C0400e c0400e = (C0400e) this.f1220z.getLayoutParams();
        int max = Math.max(0, this.f1220z.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0400e).leftMargin + ((ViewGroup.MarginLayoutParams) c0400e).rightMargin);
        int max2 = Math.max(0, this.f1220z.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0400e).topMargin + ((ViewGroup.MarginLayoutParams) c0400e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1220z.getMeasuredState());
        boolean z = (C1112b0.m38454P(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1217w;
            if (this.f1194E && this.f1220z.getTabContainer() != null) {
                measuredHeight += this.f1217w;
            }
        } else {
            measuredHeight = this.f1220z.getVisibility() != 8 ? this.f1220z.getMeasuredHeight() : 0;
        }
        this.f1201L.set(this.f1199J);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            this.f1208S = this.f1206Q;
        } else {
            this.f1204O.set(this.f1202M);
        }
        if (!this.f1193D && !z) {
            Rect rect = this.f1201L;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i3 >= 21) {
                this.f1208S = this.f1208S.m38102l(0, measuredHeight, 0, 0);
            }
        } else if (i3 >= 21) {
            this.f1208S = new C1183m0.C1185b(this.f1208S).m38088c(C0970b.m38937b(this.f1208S.m38105i(), this.f1208S.m38103k() + measuredHeight, this.f1208S.m38104j(), this.f1208S.m38106h() + 0)).m38090a();
        } else {
            Rect rect2 = this.f1204O;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m40919q(this.f1219y, this.f1201L, true, true, true, true);
        if (i3 >= 21 && !this.f1209T.equals(this.f1208S)) {
            C1183m0 c1183m0 = this.f1208S;
            this.f1209T = c1183m0;
            C1112b0.m38426i(this.f1219y, c1183m0);
        } else if (i3 < 21 && !this.f1205P.equals(this.f1204O)) {
            this.f1205P.set(this.f1204O);
            this.f1219y.m40828a(this.f1204O);
        }
        measureChildWithMargins(this.f1219y, i, 0, i2, 0);
        C0400e c0400e2 = (C0400e) this.f1219y.getLayoutParams();
        int max3 = Math.max(max, this.f1219y.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0400e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0400e2).rightMargin);
        int max4 = Math.max(max2, this.f1219y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0400e2).topMargin + ((ViewGroup.MarginLayoutParams) c0400e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1219y.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.f1195F && z) {
            if (m40921B(f2)) {
                m40920p();
            } else {
                m40922A();
            }
            this.f1196G = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1197H + i2;
        this.f1197H = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1216d0.m38021b(view, view2, i);
        this.f1197H = getActionBarHideOffset();
        m40915u();
        InterfaceC0399d interfaceC0399d = this.f1210U;
        if (interfaceC0399d != null) {
            interfaceC0399d.mo40908b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1220z.getVisibility() != 0) {
            return false;
        }
        return this.f1195F;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.InterfaceC1209s
    public void onStopNestedScroll(View view) {
        if (this.f1195F && !this.f1196G) {
            if (this.f1197H <= this.f1220z.getHeight()) {
                m40911y();
            } else {
                m40912x();
            }
        }
        InterfaceC0399d interfaceC0399d = this.f1210U;
        if (interfaceC0399d != null) {
            interfaceC0399d.mo40906d();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m40910z();
        int i2 = this.f1198I ^ i;
        this.f1198I = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0399d interfaceC0399d = this.f1210U;
        if (interfaceC0399d != null) {
            interfaceC0399d.mo40905e(!z2);
            if (!z && z2) {
                this.f1210U.mo40904f();
            } else {
                this.f1210U.mo40909a();
            }
        }
        if ((i2 & 256) == 0 || this.f1210U == null) {
            return;
        }
        C1112b0.m38411p0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1218x = i;
        InterfaceC0399d interfaceC0399d = this.f1210U;
        if (interfaceC0399d != null) {
            interfaceC0399d.mo40907c(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r */
    public C0400e generateDefaultLayoutParams() {
        return new C0400e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s */
    public C0400e generateLayoutParams(AttributeSet attributeSet) {
        return new C0400e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i) {
        m40915u();
        this.f1220z.setTranslationY(-Math.max(0, Math.min(i, this.f1220z.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0399d interfaceC0399d) {
        this.f1210U = interfaceC0399d;
        if (getWindowToken() != null) {
            this.f1210U.mo40907c(this.f1218x);
            int i = this.f1198I;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C1112b0.m38411p0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1194E = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1195F) {
            this.f1195F = z;
            if (z) {
                return;
            }
            m40915u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m40910z();
        this.f1190A.setIcon(i);
    }

    public void setLogo(int i) {
        m40910z();
        this.f1190A.mo40428p(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1193D = z;
        this.f1192C = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    public void setWindowCallback(Window.Callback callback) {
        m40910z();
        this.f1190A.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0542z
    public void setWindowTitle(CharSequence charSequence) {
        m40910z();
        this.f1190A.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    void m40915u() {
        removeCallbacks(this.f1214b0);
        removeCallbacks(this.f1215c0);
        ViewPropertyAnimator viewPropertyAnimator = this.f1212W;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: w */
    public boolean m40913w() {
        return this.f1193D;
    }

    /* renamed from: z */
    void m40910z() {
        if (this.f1219y == null) {
            this.f1219y = (ContentFrameLayout) findViewById(C4902f.action_bar_activity_content);
            this.f1220z = (ActionBarContainer) findViewById(C4902f.action_bar_container);
            this.f1190A = m40916t(findViewById(C4902f.action_bar));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0400e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m40910z();
        this.f1190A.setIcon(drawable);
    }
}
