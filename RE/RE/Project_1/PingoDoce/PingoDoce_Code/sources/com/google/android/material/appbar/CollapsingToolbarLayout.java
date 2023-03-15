package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1070c;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C3625b;
import com.google.android.material.internal.C3628c;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5428k;
import p100f8.C5429l;
import p120g8.C5616a;
import p170j2.C6298a;
import p252n8.C7688a;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: c0 */
    private static final int f9333c0 = C5428k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    private View f9334A;

    /* renamed from: B */
    private int f9335B;

    /* renamed from: C */
    private int f9336C;

    /* renamed from: D */
    private int f9337D;

    /* renamed from: E */
    private int f9338E;

    /* renamed from: F */
    private final Rect f9339F;

    /* renamed from: G */
    final C3625b f9340G;

    /* renamed from: H */
    final C7688a f9341H;

    /* renamed from: I */
    private boolean f9342I;

    /* renamed from: J */
    private boolean f9343J;

    /* renamed from: K */
    private Drawable f9344K;

    /* renamed from: L */
    Drawable f9345L;

    /* renamed from: M */
    private int f9346M;

    /* renamed from: N */
    private boolean f9347N;

    /* renamed from: O */
    private ValueAnimator f9348O;

    /* renamed from: P */
    private long f9349P;

    /* renamed from: Q */
    private int f9350Q;

    /* renamed from: R */
    private AppBarLayout.InterfaceC3457h f9351R;

    /* renamed from: S */
    int f9352S;

    /* renamed from: T */
    private int f9353T;

    /* renamed from: U */
    C1183m0 f9354U;

    /* renamed from: V */
    private int f9355V;

    /* renamed from: W */
    private boolean f9356W;

    /* renamed from: a0 */
    private int f9357a0;

    /* renamed from: b0 */
    private boolean f9358b0;

    /* renamed from: w */
    private boolean f9359w;

    /* renamed from: x */
    private int f9360x;

    /* renamed from: y */
    private ViewGroup f9361y;

    /* renamed from: z */
    private View f9362z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    /* loaded from: classes.dex */
    class C3458a implements InterfaceC1211u {
        C3458a() {
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            return CollapsingToolbarLayout.this.m30649n(c1183m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes.dex */
    public class C3459b implements ValueAnimator.AnimatorUpdateListener {
        C3459b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    /* loaded from: classes.dex */
    private class C3461d implements AppBarLayout.InterfaceC3457h {
        C3461d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC3452c
        /* renamed from: a */
        public void mo30638a(AppBarLayout appBarLayout, int i) {
            int height;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f9352S = i;
            C1183m0 c1183m0 = collapsingToolbarLayout.f9354U;
            int m38103k = c1183m0 != null ? c1183m0.m38103k() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                C3460c c3460c = (C3460c) childAt.getLayoutParams();
                C3466d m30653j = CollapsingToolbarLayout.m30653j(childAt);
                int i3 = c3460c.f9365a;
                if (i3 == 1) {
                    m30653j.m30604f(C6298a.m21277b(-i, 0, CollapsingToolbarLayout.this.m30655h(childAt)));
                } else if (i3 == 2) {
                    m30653j.m30604f(Math.round((-i) * c3460c.f9366b));
                }
            }
            CollapsingToolbarLayout.this.m30642u();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f9345L != null && m38103k > 0) {
                C1112b0.m38423j0(collapsingToolbarLayout2);
            }
            int height2 = (CollapsingToolbarLayout.this.getHeight() - C1112b0.m38474F(CollapsingToolbarLayout.this)) - m38103k;
            float f = height2;
            CollapsingToolbarLayout.this.f9340G.m29557w0(Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f9340G.m29583j0(collapsingToolbarLayout3.f9352S + height2);
            CollapsingToolbarLayout.this.f9340G.m29561u0(Math.abs(i) / f);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.collapsingToolbarLayoutStyle);
    }

    /* renamed from: a */
    private void m30662a(int i) {
        TimeInterpolator timeInterpolator;
        m30660c();
        ValueAnimator valueAnimator = this.f9348O;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f9348O = valueAnimator2;
            if (i > this.f9346M) {
                timeInterpolator = C5616a.f15855c;
            } else {
                timeInterpolator = C5616a.f15856d;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.f9348O.addUpdateListener(new C3459b());
        } else if (valueAnimator.isRunning()) {
            this.f9348O.cancel();
        }
        this.f9348O.setDuration(this.f9349P);
        this.f9348O.setIntValues(this.f9346M, i);
        this.f9348O.start();
    }

    /* renamed from: b */
    private void m30661b(AppBarLayout appBarLayout) {
        if (m30652k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* renamed from: c */
    private void m30660c() {
        if (this.f9359w) {
            ViewGroup viewGroup = null;
            this.f9361y = null;
            this.f9362z = null;
            int i = this.f9360x;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f9361y = viewGroup2;
                if (viewGroup2 != null) {
                    this.f9362z = m30659d(viewGroup2);
                }
            }
            if (this.f9361y == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (m30651l(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.f9361y = viewGroup;
            }
            m30643t();
            this.f9359w = false;
        }
    }

    /* renamed from: d */
    private View m30659d(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    /* renamed from: g */
    private static int m30656g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: i */
    private static CharSequence m30654i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (Build.VERSION.SDK_INT < 21 || !(view instanceof android.widget.Toolbar)) {
            return null;
        }
        return ((android.widget.Toolbar) view).getTitle();
    }

    /* renamed from: j */
    static C3466d m30653j(View view) {
        int i = C5423f.view_offset_helper;
        C3466d c3466d = (C3466d) view.getTag(i);
        if (c3466d == null) {
            C3466d c3466d2 = new C3466d(view);
            view.setTag(i, c3466d2);
            return c3466d2;
        }
        return c3466d;
    }

    /* renamed from: k */
    private boolean m30652k() {
        return this.f9353T == 1;
    }

    /* renamed from: l */
    private static boolean m30651l(View view) {
        return (view instanceof Toolbar) || (Build.VERSION.SDK_INT >= 21 && (view instanceof android.widget.Toolbar));
    }

    /* renamed from: m */
    private boolean m30650m(View view) {
        View view2 = this.f9362z;
        if (view2 == null || view2 == this) {
            if (view == this.f9361y) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m30647p(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f9362z;
        if (view == null) {
            view = this.f9361y;
        }
        int m30655h = m30655h(view);
        C3628c.m29550a(this, this.f9334A, this.f9339F);
        ViewGroup viewGroup = this.f9361y;
        int i4 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i4 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i3 = toolbar.getTitleMarginTop();
            i = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i4 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i3 = toolbar2.getTitleMarginTop();
            i = toolbar2.getTitleMarginBottom();
        }
        C3625b c3625b = this.f9340G;
        Rect rect = this.f9339F;
        int i5 = rect.left + (z ? i2 : i4);
        int i6 = rect.top + m30655h + i3;
        int i7 = rect.right;
        if (!z) {
            i4 = i2;
        }
        c3625b.m29599b0(i5, i6, i7 - i4, (rect.bottom + m30655h) - i);
    }

    /* renamed from: q */
    private void m30646q() {
        setContentDescription(getTitle());
    }

    /* renamed from: r */
    private void m30645r(Drawable drawable, int i, int i2) {
        m30644s(drawable, this.f9361y, i, i2);
    }

    /* renamed from: s */
    private void m30644s(Drawable drawable, View view, int i, int i2) {
        if (m30652k() && view != null && this.f9342I) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: t */
    private void m30643t() {
        View view;
        if (!this.f9342I && (view = this.f9334A) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9334A);
            }
        }
        if (!this.f9342I || this.f9361y == null) {
            return;
        }
        if (this.f9334A == null) {
            this.f9334A = new View(getContext());
        }
        if (this.f9334A.getParent() == null) {
            this.f9361y.addView(this.f9334A, -1, -1);
        }
    }

    /* renamed from: v */
    private void m30641v(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.f9342I || (view = this.f9334A) == null) {
            return;
        }
        boolean z2 = C1112b0.m38447V(view) && this.f9334A.getVisibility() == 0;
        this.f9343J = z2;
        if (z2 || z) {
            boolean z3 = C1112b0.m38476E(this) == 1;
            m30647p(z3);
            this.f9340G.m29581k0(z3 ? this.f9337D : this.f9335B, this.f9339F.top + this.f9336C, (i3 - i) - (z3 ? this.f9335B : this.f9337D), (i4 - i2) - this.f9338E);
            this.f9340G.m29603Z(z);
        }
    }

    /* renamed from: w */
    private void m30640w() {
        if (this.f9361y != null && this.f9342I && TextUtils.isEmpty(this.f9340G.m29616M())) {
            setTitle(m30654i(this.f9361y));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3460c;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m30660c();
        if (this.f9361y == null && (drawable = this.f9344K) != null && this.f9346M > 0) {
            drawable.mutate().setAlpha(this.f9346M);
            this.f9344K.draw(canvas);
        }
        if (this.f9342I && this.f9343J) {
            if (this.f9361y != null && this.f9344K != null && this.f9346M > 0 && m30652k() && this.f9340G.m29631D() < this.f9340G.m29629E()) {
                int save = canvas.save();
                canvas.clipRect(this.f9344K.getBounds(), Region.Op.DIFFERENCE);
                this.f9340G.m29580l(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f9340G.m29580l(canvas);
            }
        }
        if (this.f9345L == null || this.f9346M <= 0) {
            return;
        }
        C1183m0 c1183m0 = this.f9354U;
        int m38103k = c1183m0 != null ? c1183m0.m38103k() : 0;
        if (m38103k > 0) {
            this.f9345L.setBounds(0, -this.f9352S, getWidth(), m38103k - this.f9352S);
            this.f9345L.mutate().setAlpha(this.f9346M);
            this.f9345L.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f9344K == null || this.f9346M <= 0 || !m30650m(view)) {
            z = false;
        } else {
            m30644s(this.f9344K, view, getWidth(), getHeight());
            this.f9344K.mutate().setAlpha(this.f9346M);
            this.f9344K.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9345L;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f9344K;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C3625b c3625b = this.f9340G;
        if (c3625b != null) {
            z |= c3625b.m29628E0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e */
    public C3460c mo30658e() {
        return new C3460c(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public FrameLayout.LayoutParams mo30657f(ViewGroup.LayoutParams layoutParams) {
        return new C3460c(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f9340G.m29570q();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f9340G.m29562u();
    }

    public Drawable getContentScrim() {
        return this.f9344K;
    }

    public int getExpandedTitleGravity() {
        return this.f9340G.m29637A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f9338E;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f9337D;
    }

    public int getExpandedTitleMarginStart() {
        return this.f9335B;
    }

    public int getExpandedTitleMarginTop() {
        return this.f9336C;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f9340G.m29633C();
    }

    public int getHyphenationFrequency() {
        return this.f9340G.m29627F();
    }

    public int getLineCount() {
        return this.f9340G.m29625G();
    }

    public float getLineSpacingAdd() {
        return this.f9340G.m29623H();
    }

    public float getLineSpacingMultiplier() {
        return this.f9340G.m29621I();
    }

    public int getMaxLines() {
        return this.f9340G.m29619J();
    }

    int getScrimAlpha() {
        return this.f9346M;
    }

    public long getScrimAnimationDuration() {
        return this.f9349P;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f9350Q;
        if (i >= 0) {
            return i + this.f9355V + this.f9357a0;
        }
        C1183m0 c1183m0 = this.f9354U;
        int m38103k = c1183m0 != null ? c1183m0.m38103k() : 0;
        int m38474F = C1112b0.m38474F(this);
        if (m38474F > 0) {
            return Math.min((m38474F * 2) + m38103k, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f9345L;
    }

    public CharSequence getTitle() {
        if (this.f9342I) {
            return this.f9340G.m29616M();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f9353T;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f9340G.m29617L();
    }

    /* renamed from: h */
    final int m30655h(View view) {
        return ((getHeight() - m30653j(view).m30608b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((C3460c) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: n */
    C1183m0 m30649n(C1183m0 c1183m0) {
        C1183m0 c1183m02 = C1112b0.m38482B(this) ? c1183m0 : null;
        if (!C1070c.m38634a(this.f9354U, c1183m02)) {
            this.f9354U = c1183m02;
            requestLayout();
        }
        return c1183m0.m38111c();
    }

    /* renamed from: o */
    public void m30648o(boolean z, boolean z2) {
        if (this.f9347N != z) {
            if (z2) {
                m30662a(z ? 255 : 0);
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.f9347N = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m30661b(appBarLayout);
            C1112b0.m38483A0(this, C1112b0.m38482B(appBarLayout));
            if (this.f9351R == null) {
                this.f9351R = new C3461d();
            }
            appBarLayout.m30735d(this.f9351R);
            C1112b0.m38411p0(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9340G.m29607V(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC3457h interfaceC3457h = this.f9351R;
        if (interfaceC3457h != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m30721r(interfaceC3457h);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1183m0 c1183m0 = this.f9354U;
        if (c1183m0 != null) {
            int m38103k = c1183m0.m38103k();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C1112b0.m38482B(childAt) && childAt.getTop() < m38103k) {
                    C1112b0.m38435d0(childAt, m38103k);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m30653j(getChildAt(i6)).m30606d();
        }
        m30641v(i, i2, i3, i4, false);
        m30640w();
        m30642u();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m30653j(getChildAt(i7)).m30609a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m30660c();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C1183m0 c1183m0 = this.f9354U;
        int m38103k = c1183m0 != null ? c1183m0.m38103k() : 0;
        if ((mode == 0 || this.f9356W) && m38103k > 0) {
            this.f9355V = m38103k;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + m38103k, 1073741824));
        }
        if (this.f9358b0 && this.f9340G.m29619J() > 1) {
            m30640w();
            m30641v(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int m29554y = this.f9340G.m29554y();
            if (m29554y > 1) {
                this.f9357a0 = Math.round(this.f9340G.m29552z()) * (m29554y - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f9357a0, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f9361y;
        if (viewGroup != null) {
            View view = this.f9362z;
            if (view != null && view != this) {
                setMinimumHeight(m30656g(view));
            } else {
                setMinimumHeight(m30656g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f9344K;
        if (drawable != null) {
            m30645r(drawable, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f9340G.m29589g0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f9340G.m29595d0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f9340G.m29587h0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f9344K;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9344K = mutate;
            if (mutate != null) {
                m30645r(mutate, getWidth(), getHeight());
                this.f9344K.setCallback(this);
                this.f9344K.setAlpha(this.f9346M);
            }
            C1112b0.m38423j0(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0928a.m39111f(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f9340G.m29569q0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f9338E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f9337D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f9335B = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f9336C = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f9340G.m29575n0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f9340G.m29571p0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f9340G.m29565s0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f9358b0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f9356W = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f9340G.m29555x0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f9340G.m29551z0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f9340G.m29636A0(f);
    }

    public void setMaxLines(int i) {
        this.f9340G.m29634B0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f9340G.m29630D0(z);
    }

    void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f9346M) {
            if (this.f9344K != null && (viewGroup = this.f9361y) != null) {
                C1112b0.m38423j0(viewGroup);
            }
            this.f9346M = i;
            C1112b0.m38423j0(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f9349P = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f9350Q != i) {
            this.f9350Q = i;
            m30642u();
        }
    }

    public void setScrimsShown(boolean z) {
        m30648o(z, C1112b0.m38446W(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f9345L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9345L = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9345L.setState(getDrawableState());
                }
                C0981a.m38864m(this.f9345L, C1112b0.m38476E(this));
                this.f9345L.setVisible(getVisibility() == 0, false);
                this.f9345L.setCallback(this);
                this.f9345L.setAlpha(this.f9346M);
            }
            C1112b0.m38423j0(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0928a.m39111f(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f9340G.m29626F0(charSequence);
        m30646q();
    }

    public void setTitleCollapseMode(int i) {
        this.f9353T = i;
        boolean m30652k = m30652k();
        this.f9340G.m29559v0(m30652k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m30661b((AppBarLayout) parent);
        }
        if (m30652k && this.f9344K == null) {
            setContentScrimColor(this.f9341H.m17714d(getResources().getDimension(C5421d.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f9342I) {
            this.f9342I = z;
            m30646q();
            m30643t();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f9340G.m29632C0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f9345L;
        if (drawable != null && drawable.isVisible() != z) {
            this.f9345L.setVisible(z, false);
        }
        Drawable drawable2 = this.f9344K;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.f9344K.setVisible(z, false);
    }

    /* renamed from: u */
    final void m30642u() {
        if (this.f9344K == null && this.f9345L == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f9352S < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9344K || drawable == this.f9345L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f9340G.m29591f0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3460c(getContext(), attributeSet);
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes.dex */
    public static class C3460c extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f9365a;

        /* renamed from: b */
        float f9366b;

        public C3460c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9365a = 0;
            this.f9366b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f14997N1);
            this.f9365a = obtainStyledAttributes.getInt(C5429l.f15005O1, 0);
            m30639a(obtainStyledAttributes.getFloat(C5429l.f15013P1, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m30639a(float f) {
            this.f9366b = f;
        }

        public C3460c(int i, int i2) {
            super(i, i2);
            this.f9365a = 0;
            this.f9366b = 0.5f;
        }

        public C3460c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9365a = 0;
            this.f9366b = 0.5f;
        }
    }
}
