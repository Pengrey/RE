package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C3628c;
import java.util.List;
import p100f8.C5418a;
import p100f8.C5419b;
import p100f8.C5428k;
import p100f8.C5429l;
import p120g8.C5623h;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0872b {

    /* renamed from: f0 */
    private static final int f9937f0 = C5428k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: g0 */
    static final Property<View, Float> f9938g0 = new C3582d(Float.class, "width");

    /* renamed from: h0 */
    static final Property<View, Float> f9939h0 = new C3583e(Float.class, "height");

    /* renamed from: i0 */
    static final Property<View, Float> f9940i0 = new C3584f(Float.class, "paddingStart");

    /* renamed from: j0 */
    static final Property<View, Float> f9941j0 = new C3585g(Float.class, "paddingEnd");

    /* renamed from: O */
    private int f9942O;

    /* renamed from: P */
    private final C3595a f9943P;

    /* renamed from: Q */
    private final InterfaceC3617f f9944Q;

    /* renamed from: R */
    private final InterfaceC3617f f9945R;

    /* renamed from: S */
    private final InterfaceC3617f f9946S;

    /* renamed from: T */
    private final InterfaceC3617f f9947T;

    /* renamed from: U */
    private final int f9948U;

    /* renamed from: V */
    private int f9949V;

    /* renamed from: W */
    private int f9950W;

    /* renamed from: a0 */
    private final CoordinatorLayout.AbstractC0873c<ExtendedFloatingActionButton> f9951a0;

    /* renamed from: b0 */
    private boolean f9952b0;

    /* renamed from: c0 */
    private boolean f9953c0;

    /* renamed from: d0 */
    private boolean f9954d0;

    /* renamed from: e0 */
    protected ColorStateList f9955e0;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes.dex */
    class C3579a implements InterfaceC3590l {
        C3579a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: a */
        public int mo29795a() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: b */
        public int mo29794b() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f9949V + ExtendedFloatingActionButton.this.f9950W;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: c */
        public int mo29793c() {
            return ExtendedFloatingActionButton.this.f9950W;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: d */
        public int mo29792d() {
            return ExtendedFloatingActionButton.this.f9949V;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: e */
        public ViewGroup.LayoutParams mo29791e() {
            return new ViewGroup.LayoutParams(-2, -2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes.dex */
    class C3580b implements InterfaceC3590l {
        C3580b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: a */
        public int mo29795a() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: b */
        public int mo29794b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: c */
        public int mo29793c() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: d */
        public int mo29792d() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC3590l
        /* renamed from: e */
        public ViewGroup.LayoutParams mo29791e() {
            return new ViewGroup.LayoutParams(mo29794b(), mo29795a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C3581c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f9963a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC3617f f9964b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3588j f9965c;

        C3581c(ExtendedFloatingActionButton extendedFloatingActionButton, InterfaceC3617f interfaceC3617f, AbstractC3588j abstractC3588j) {
            this.f9964b = interfaceC3617f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9963a = true;
            this.f9964b.mo29677b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9964b.mo29678a();
            if (this.f9963a) {
                return;
            }
            this.f9964b.mo29671h(this.f9965c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f9964b.onAnimationStart(animator);
            this.f9963a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes.dex */
    class C3582d extends Property<View, Float> {
        C3582d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes.dex */
    class C3583e extends Property<View, Float> {
        C3583e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes.dex */
    class C3584f extends Property<View, Float> {
        C3584f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1112b0.m38466J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C1112b0.m38473F0(view, f.intValue(), view.getPaddingTop(), C1112b0.m38468I(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    /* loaded from: classes.dex */
    class C3585g extends Property<View, Float> {
        C3585g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1112b0.m38468I(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C1112b0.m38473F0(view, C1112b0.m38466J(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    /* loaded from: classes.dex */
    class C3586h extends AbstractC3596b {

        /* renamed from: g */
        private final InterfaceC3590l f9966g;

        /* renamed from: h */
        private final boolean f9967h;

        C3586h(C3595a c3595a, InterfaceC3590l interfaceC3590l, boolean z) {
            super(ExtendedFloatingActionButton.this, c3595a);
            this.f9966g = interfaceC3590l;
            this.f9967h = z;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: a */
        public void mo29678a() {
            super.mo29678a();
            ExtendedFloatingActionButton.this.f9953c0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f9966g.mo29791e().width;
            layoutParams.height = this.f9966g.mo29791e().height;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: c */
        public int mo29676c() {
            if (this.f9967h) {
                return C5418a.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C5418a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: d */
        public void mo29675d() {
            ExtendedFloatingActionButton.this.f9952b0 = this.f9967h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f9966g.mo29791e().width;
            layoutParams.height = this.f9966g.mo29791e().height;
            C1112b0.m38473F0(ExtendedFloatingActionButton.this, this.f9966g.mo29792d(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f9966g.mo29793c(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: f */
        public AnimatorSet mo29673f() {
            C5623h m29755m = m29755m();
            if (m29755m.m23543j("width")) {
                PropertyValuesHolder[] m23546g = m29755m.m23546g("width");
                m23546g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f9966g.mo29794b());
                m29755m.m23541l("width", m23546g);
            }
            if (m29755m.m23543j("height")) {
                PropertyValuesHolder[] m23546g2 = m29755m.m23546g("height");
                m23546g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f9966g.mo29795a());
                m29755m.m23541l("height", m23546g2);
            }
            if (m29755m.m23543j("paddingStart")) {
                PropertyValuesHolder[] m23546g3 = m29755m.m23546g("paddingStart");
                m23546g3[0].setFloatValues(C1112b0.m38466J(ExtendedFloatingActionButton.this), this.f9966g.mo29792d());
                m29755m.m23541l("paddingStart", m23546g3);
            }
            if (m29755m.m23543j("paddingEnd")) {
                PropertyValuesHolder[] m23546g4 = m29755m.m23546g("paddingEnd");
                m23546g4[0].setFloatValues(C1112b0.m38468I(ExtendedFloatingActionButton.this), this.f9966g.mo29793c());
                m29755m.m23541l("paddingEnd", m23546g4);
            }
            if (m29755m.m23543j("labelOpacity")) {
                PropertyValuesHolder[] m23546g5 = m29755m.m23546g("labelOpacity");
                boolean z = this.f9967h;
                m23546g5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                m29755m.m23541l("labelOpacity", m23546g5);
            }
            return super.m29756l(m29755m);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: h */
        public void mo29671h(AbstractC3588j abstractC3588j) {
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: i */
        public boolean mo29670i() {
            return this.f9967h == ExtendedFloatingActionButton.this.f9952b0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f9952b0 = this.f9967h;
            ExtendedFloatingActionButton.this.f9953c0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    /* loaded from: classes.dex */
    class C3587i extends AbstractC3596b {

        /* renamed from: g */
        private boolean f9969g;

        public C3587i(C3595a c3595a) {
            super(ExtendedFloatingActionButton.this, c3595a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: a */
        public void mo29678a() {
            super.mo29678a();
            ExtendedFloatingActionButton.this.f9942O = 0;
            if (this.f9969g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: b */
        public void mo29677b() {
            super.mo29677b();
            this.f9969g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: c */
        public int mo29676c() {
            return C5418a.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: d */
        public void mo29675d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: h */
        public void mo29671h(AbstractC3588j abstractC3588j) {
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: i */
        public boolean mo29670i() {
            return ExtendedFloatingActionButton.this.m29816w();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f9969g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f9942O = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3588j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    /* loaded from: classes.dex */
    class C3589k extends AbstractC3596b {
        public C3589k(C3595a c3595a) {
            super(ExtendedFloatingActionButton.this, c3595a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: a */
        public void mo29678a() {
            super.mo29678a();
            ExtendedFloatingActionButton.this.f9942O = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: c */
        public int mo29676c() {
            return C5418a.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: d */
        public void mo29675d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: h */
        public void mo29671h(AbstractC3588j abstractC3588j) {
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
        /* renamed from: i */
        public boolean mo29670i() {
            return ExtendedFloatingActionButton.this.m29815x();
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC3596b, com.google.android.material.floatingactionbutton.InterfaceC3617f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f9942O = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    /* loaded from: classes.dex */
    interface InterfaceC3590l {
        /* renamed from: a */
        int mo29795a();

        /* renamed from: b */
        int mo29794b();

        /* renamed from: c */
        int mo29793c();

        /* renamed from: d */
        int mo29792d();

        /* renamed from: e */
        ViewGroup.LayoutParams mo29791e();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.extendedFloatingActionButtonStyle);
    }

    /* renamed from: A */
    private boolean m29831A() {
        return (C1112b0.m38446W(this) || (!m29815x() && this.f9954d0)) && !isInEditMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public boolean m29816w() {
        return getVisibility() == 0 ? this.f9942O == 1 : this.f9942O != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public boolean m29815x() {
        return getVisibility() != 0 ? this.f9942O == 2 : this.f9942O != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m29814y(InterfaceC3617f interfaceC3617f, AbstractC3588j abstractC3588j) {
        if (interfaceC3617f.mo29670i()) {
            return;
        }
        if (!m29831A()) {
            interfaceC3617f.mo29675d();
            interfaceC3617f.mo29671h(abstractC3588j);
            return;
        }
        measure(0, 0);
        AnimatorSet mo29673f = interfaceC3617f.mo29673f();
        mo29673f.addListener(new C3581c(this, interfaceC3617f, abstractC3588j));
        for (Animator.AnimatorListener animatorListener : interfaceC3617f.mo29672g()) {
            mo29673f.addListener(animatorListener);
        }
        mo29673f.start();
    }

    /* renamed from: z */
    private void m29813z() {
        this.f9955e0 = getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void m29830B(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0872b
    public CoordinatorLayout.AbstractC0873c<ExtendedFloatingActionButton> getBehavior() {
        return this.f9951a0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i = this.f9948U;
        return i < 0 ? (Math.min(C1112b0.m38466J(this), C1112b0.m38468I(this)) * 2) + getIconSize() : i;
    }

    public C5623h getExtendMotionSpec() {
        return this.f9945R.mo29674e();
    }

    public C5623h getHideMotionSpec() {
        return this.f9947T.mo29674e();
    }

    public C5623h getShowMotionSpec() {
        return this.f9946S.mo29674e();
    }

    public C5623h getShrinkMotionSpec() {
        return this.f9944Q.mo29674e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9952b0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f9952b0 = false;
            this.f9944Q.mo29675d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f9954d0 = z;
    }

    public void setExtendMotionSpec(C5623h c5623h) {
        this.f9945R.mo29669j(c5623h);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C5623h.m23549d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f9952b0 == z) {
            return;
        }
        InterfaceC3617f interfaceC3617f = z ? this.f9945R : this.f9944Q;
        if (interfaceC3617f.mo29670i()) {
            return;
        }
        interfaceC3617f.mo29675d();
    }

    public void setHideMotionSpec(C5623h c5623h) {
        this.f9947T.mo29669j(c5623h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C5623h.m23549d(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.f9952b0 || this.f9953c0) {
            return;
        }
        this.f9949V = C1112b0.m38466J(this);
        this.f9950W = C1112b0.m38468I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f9952b0 || this.f9953c0) {
            return;
        }
        this.f9949V = i;
        this.f9950W = i3;
    }

    public void setShowMotionSpec(C5623h c5623h) {
        this.f9946S.mo29669j(c5623h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C5623h.m23549d(getContext(), i));
    }

    public void setShrinkMotionSpec(C5623h c5623h) {
        this.f9944Q.mo29669j(c5623h);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C5623h.m23549d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m29813z();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.f9937f0
            r1 = r17
            android.content.Context r1 = p419w8.C11602a.m4640c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f9942O = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f9943P = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f9946S = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f9947T = r12
            r13 = 1
            r0.f9952b0 = r13
            r0.f9953c0 = r10
            r0.f9954d0 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f9951a0 = r1
            int[] r3 = p100f8.C5429l.f15021Q1
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C3646n.m29500h(r1, r2, r3, r4, r5, r6)
            int r2 = p100f8.C5429l.f15053U1
            g8.h r2 = p120g8.C5623h.m23550c(r14, r1, r2)
            int r3 = p100f8.C5429l.f15045T1
            g8.h r3 = p120g8.C5623h.m23550c(r14, r1, r3)
            int r4 = p100f8.C5429l.f15037S1
            g8.h r4 = p120g8.C5623h.m23550c(r14, r1, r4)
            int r5 = p100f8.C5429l.f15061V1
            g8.h r5 = p120g8.C5623h.m23550c(r14, r1, r5)
            int r6 = p100f8.C5429l.f15029R1
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f9948U = r6
            int r6 = androidx.core.view.C1112b0.m38466J(r16)
            r0.f9949V = r6
            int r6 = androidx.core.view.C1112b0.m38468I(r16)
            r0.f9950W = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f9945R = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f9944Q = r10
            r11.mo29669j(r2)
            r12.mo29669j(r3)
            r15.mo29669j(r4)
            r10.mo29669j(r5)
            r1.recycle()
            v8.c r1 = p401v8.C11148k.f28622m
            r2 = r18
            v8.k$b r1 = p401v8.C11148k.m5951g(r14, r2, r8, r9, r1)
            v8.k r1 = r1.m5914m()
            r0.setShapeAppearanceModel(r1)
            r16.m29813z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0873c<T> {

        /* renamed from: a */
        private Rect f9956a;

        /* renamed from: b */
        private AbstractC3588j f9957b;

        /* renamed from: c */
        private AbstractC3588j f9958c;

        /* renamed from: d */
        private boolean f9959d;

        /* renamed from: e */
        private boolean f9960e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9959d = false;
            this.f9960e = true;
        }

        /* renamed from: G */
        private static boolean m29810G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0876f) {
                return ((CoordinatorLayout.C0876f) layoutParams).m39298f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m29807J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f9959d || this.f9960e) && ((CoordinatorLayout.C0876f) extendedFloatingActionButton.getLayoutParams()).m39299e() == view.getId();
        }

        /* renamed from: L */
        private boolean m29805L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m29807J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f9956a == null) {
                    this.f9956a = new Rect();
                }
                Rect rect = this.f9956a;
                C3628c.m29550a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    m29806K(extendedFloatingActionButton);
                    return true;
                }
                m29812E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: M */
        private boolean m29804M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (m29807J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0876f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    m29806K(extendedFloatingActionButton);
                    return true;
                }
                m29812E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        /* renamed from: E */
        protected void m29812E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC3588j abstractC3588j;
            boolean z = this.f9960e;
            if (z) {
                abstractC3588j = this.f9958c;
            } else {
                abstractC3588j = this.f9957b;
            }
            extendedFloatingActionButton.m29814y(z ? extendedFloatingActionButton.f9945R : extendedFloatingActionButton.f9946S, abstractC3588j);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: F */
        public boolean mo29771E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo29771E(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: H */
        public boolean mo29768H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m29805L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m29810G(view)) {
                m29804M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: I */
        public boolean mo30696h0(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> m39327r = coordinatorLayout.m39327r(extendedFloatingActionButton);
            int size = m39327r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m39327r.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m29805L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m29810G(view) && m29804M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m39354I(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: K */
        protected void m29806K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            AbstractC3588j abstractC3588j;
            boolean z = this.f9960e;
            if (z) {
                abstractC3588j = this.f9958c;
            } else {
                abstractC3588j = this.f9957b;
            }
            extendedFloatingActionButton.m29814y(z ? extendedFloatingActionButton.f9944Q : extendedFloatingActionButton.f9947T, abstractC3588j);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: g */
        public void mo28780g(CoordinatorLayout.C0876f c0876f) {
            if (c0876f.f3039h == 0) {
                c0876f.f3039h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15069W1);
            this.f9959d = obtainStyledAttributes.getBoolean(C5429l.f15077X1, false);
            this.f9960e = obtainStyledAttributes.getBoolean(C5429l.f15085Y1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m29813z();
    }
}
