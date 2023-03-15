package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0484i;
import androidx.appcompat.widget.C0504m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import androidx.core.view.InterfaceC1217z;
import androidx.core.widget.InterfaceC1252m;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C3601d;
import com.google.android.material.internal.C3628c;
import com.google.android.material.internal.C3655q;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5428k;
import p100f8.C5429l;
import p120g8.C5623h;
import p120g8.InterfaceC5626k;
import p268o8.C8034b;
import p268o8.InterfaceC8033a;
import p381u8.InterfaceC10851b;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* loaded from: classes.dex */
public class FloatingActionButton extends C3655q implements InterfaceC1217z, InterfaceC1252m, InterfaceC8033a, InterfaceC11164n, CoordinatorLayout.InterfaceC0872b {

    /* renamed from: N */
    private static final int f9972N = C5428k.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    private PorterDuff.Mode f9973A;

    /* renamed from: B */
    private ColorStateList f9974B;

    /* renamed from: C */
    private int f9975C;

    /* renamed from: D */
    private int f9976D;

    /* renamed from: E */
    private int f9977E;

    /* renamed from: F */
    private int f9978F;

    /* renamed from: G */
    private int f9979G;

    /* renamed from: H */
    boolean f9980H;

    /* renamed from: I */
    final Rect f9981I;

    /* renamed from: J */
    private final Rect f9982J;

    /* renamed from: K */
    private final C0504m f9983K;

    /* renamed from: L */
    private final C8034b f9984L;

    /* renamed from: M */
    private C3601d f9985M;

    /* renamed from: x */
    private ColorStateList f9986x;

    /* renamed from: y */
    private PorterDuff.Mode f9987y;

    /* renamed from: z */
    private ColorStateList f9988z;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: classes.dex */
    public class C3591a implements C3601d.InterfaceC3612k {

        /* renamed from: a */
        final /* synthetic */ AbstractC3592b f9992a;

        C3591a(AbstractC3592b abstractC3592b) {
            this.f9992a = abstractC3592b;
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.InterfaceC3612k
        /* renamed from: a */
        public void mo29695a() {
            this.f9992a.mo29761b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C3601d.InterfaceC3612k
        /* renamed from: b */
        public void mo29694b() {
            this.f9992a.mo29762a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3592b {
        /* renamed from: a */
        public void mo29762a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo29761b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: classes.dex */
    public class C3593c implements InterfaceC10851b {
        C3593c() {
        }

        @Override // p381u8.InterfaceC10851b
        /* renamed from: a */
        public void mo6880a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f9981I.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f9978F, i2 + FloatingActionButton.this.f9978F, i3 + FloatingActionButton.this.f9978F, i4 + FloatingActionButton.this.f9978F);
        }

        @Override // p381u8.InterfaceC10851b
        /* renamed from: b */
        public void mo6879b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p381u8.InterfaceC10851b
        /* renamed from: c */
        public boolean mo6878c() {
            return FloatingActionButton.this.f9980H;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: classes.dex */
    class C3594d<T extends FloatingActionButton> implements C3601d.InterfaceC3611j {

        /* renamed from: a */
        private final InterfaceC5626k<T> f9995a;

        C3594d(InterfaceC5626k<T> interfaceC5626k) {
            this.f9995a = interfaceC5626k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C3601d.InterfaceC3611j
        /* renamed from: a */
        public void mo29697a() {
            this.f9995a.m23531a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.C3601d.InterfaceC3611j
        /* renamed from: b */
        public void mo29696b() {
            this.f9995a.m23530b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3594d) && ((C3594d) obj).f9995a.equals(this.f9995a);
        }

        public int hashCode() {
            return this.f9995a.hashCode();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.floatingActionButtonStyle);
    }

    private C3601d getImpl() {
        if (this.f9985M == null) {
            this.f9985M = m29785h();
        }
        return this.f9985M;
    }

    /* renamed from: h */
    private C3601d m29785h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C3615e(this, new C3593c());
        }
        return new C3601d(this, new C3593c());
    }

    /* renamed from: k */
    private int m29782k(int i) {
        int i2 = this.f9977E;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C5421d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C5421d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m29782k(1);
        } else {
            return m29782k(0);
        }
    }

    /* renamed from: p */
    private void m29777p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f9981I;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m29776q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f9988z;
        if (colorStateList == null) {
            C0981a.m38874c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9973A;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0484i.m40587e(colorForState, mode));
    }

    /* renamed from: r */
    private static int m29775r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    /* renamed from: u */
    private C3601d.InterfaceC3612k m29772u(AbstractC3592b abstractC3592b) {
        if (abstractC3592b == null) {
            return null;
        }
        return new C3591a(abstractC3592b);
    }

    @Override // p268o8.InterfaceC8033a
    /* renamed from: a */
    public boolean mo17125a() {
        return this.f9984L.m17122c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo29690E(getDrawableState());
    }

    /* renamed from: e */
    public void m29788e(Animator.AnimatorListener animatorListener) {
        getImpl().m29720e(animatorListener);
    }

    /* renamed from: f */
    public void m29787f(Animator.AnimatorListener animatorListener) {
        getImpl().m29718f(animatorListener);
    }

    /* renamed from: g */
    public void m29786g(InterfaceC5626k<? extends FloatingActionButton> interfaceC5626k) {
        getImpl().m29716g(new C3594d(interfaceC5626k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9986x;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9987y;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0872b
    public CoordinatorLayout.AbstractC0873c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo29681n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m29706q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m29704t();
    }

    public Drawable getContentBackground() {
        return getImpl().m29709m();
    }

    public int getCustomSize() {
        return this.f9977E;
    }

    public int getExpandedComponentIdHint() {
        return this.f9984L.m17123b();
    }

    public C5623h getHideMotionSpec() {
        return getImpl().m29707p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9974B;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9974B;
    }

    public C11148k getShapeAppearanceModel() {
        return (C11148k) C1076h.m38619f(getImpl().m29703u());
    }

    public C5623h getShowMotionSpec() {
        return getImpl().m29702v();
    }

    public int getSize() {
        return this.f9976D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m29782k(this.f9976D);
    }

    @Override // androidx.core.view.InterfaceC1217z
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.InterfaceC1217z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public ColorStateList getSupportImageTintList() {
        return this.f9988z;
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9973A;
    }

    public boolean getUseCompatPadding() {
        return this.f9980H;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m29784i(Rect rect) {
        if (C1112b0.m38446W(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            m29777p(rect);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m29783j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m29777p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo29692A();
    }

    /* renamed from: l */
    public void m29781l(AbstractC3592b abstractC3592b) {
        m29780m(abstractC3592b, true);
    }

    /* renamed from: m */
    void m29780m(AbstractC3592b abstractC3592b, boolean z) {
        getImpl().m29701w(m29772u(abstractC3592b), z);
    }

    /* renamed from: n */
    public boolean m29779n() {
        return getImpl().m29700y();
    }

    /* renamed from: o */
    public boolean m29778o() {
        return getImpl().m29699z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m29746B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m29745D();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f9978F = (sizeDimension - this.f9979G) / 2;
        getImpl().m29717f0();
        int min = Math.min(m29775r(sizeDimension, i), m29775r(sizeDimension, i2));
        Rect rect = this.f9981I;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m37835a());
        this.f9984L.m17121d((Bundle) C1076h.m38619f(extendableSavedState.f10480y.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f10480y.put("expandableWidgetHelper", this.f9984L.m17120e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m29784i(this.f9982J) && !this.f9982J.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public void m29774s(AbstractC3592b abstractC3592b) {
        m29773t(abstractC3592b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9986x != colorStateList) {
            this.f9986x = colorStateList;
            getImpl().m29740L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9987y != mode) {
            this.f9987y = mode;
            getImpl().m29739M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m29738N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m29735Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m29731U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.f9977E) {
                this.f9977E = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m29715g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m29708o()) {
            getImpl().m29737O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f9984L.m17119f(i);
    }

    public void setHideMotionSpec(C5623h c5623h) {
        getImpl().m29736P(c5623h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C5623h.m23549d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m29719e0();
            if (this.f9988z != null) {
                m29776q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f9983K.m40517g(i);
        m29776q();
    }

    public void setMaxImageSize(int i) {
        this.f9979G = i;
        getImpl().m29733S(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m29742I();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m29742I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m29730W(z);
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        getImpl().m29729X(c11148k);
    }

    public void setShowMotionSpec(C5623h c5623h) {
        getImpl().m29728Y(c5623h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C5623h.m23549d(getContext(), i));
    }

    public void setSize(int i) {
        this.f9977E = 0;
        if (i != this.f9976D) {
            this.f9976D = i;
            requestLayout();
        }
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.InterfaceC1217z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9988z != colorStateList) {
            this.f9988z = colorStateList;
            m29776q();
        }
    }

    @Override // androidx.core.widget.InterfaceC1252m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9973A != mode) {
            this.f9973A = mode;
            m29776q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m29741J();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m29741J();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m29741J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f9980H != z) {
            this.f9980H = z;
            getImpl().mo29691C();
        }
    }

    @Override // com.google.android.material.internal.C3655q, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    void m29773t(AbstractC3592b abstractC3592b, boolean z) {
        getImpl().m29722c0(m29772u(abstractC3592b), z);
    }

    /* loaded from: classes.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0873c<T> {

        /* renamed from: a */
        private Rect f9989a;

        /* renamed from: b */
        private AbstractC3592b f9990b;

        /* renamed from: c */
        private boolean f9991c;

        public BaseBehavior() {
            this.f9991c = true;
        }

        /* renamed from: F */
        private static boolean m29770F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0876f) {
                return ((CoordinatorLayout.C0876f) layoutParams).m39298f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m29769G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f9981I;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C0876f c0876f = (CoordinatorLayout.C0876f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0876f).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0876f).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0876f).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0876f).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                C1112b0.m38435d0(floatingActionButton, i2);
            }
            if (i != 0) {
                C1112b0.m38437c0(floatingActionButton, i);
            }
        }

        /* renamed from: J */
        private boolean m29766J(View view, FloatingActionButton floatingActionButton) {
            return this.f9991c && ((CoordinatorLayout.C0876f) floatingActionButton.getLayoutParams()).m39299e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: K */
        private boolean m29765K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m29766J(appBarLayout, floatingActionButton)) {
                if (this.f9989a == null) {
                    this.f9989a = new Rect();
                }
                Rect rect = this.f9989a;
                C3628c.m29550a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m29780m(this.f9990b, false);
                    return true;
                }
                floatingActionButton.m29773t(this.f9990b, false);
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m29764L(View view, FloatingActionButton floatingActionButton) {
            if (m29766J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0876f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m29780m(this.f9990b, false);
                    return true;
                }
                floatingActionButton.m29773t(this.f9990b, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: E */
        public boolean mo29771E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f9981I;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: H */
        public boolean mo29768H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m29765K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m29770F(view)) {
                m29764L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: I */
        public boolean mo30696h0(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m39327r = coordinatorLayout.m39327r(floatingActionButton);
            int size = m39327r.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m39327r.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m29765K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m29770F(view) && m29764L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m39354I(floatingActionButton, i);
            m29769G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
        /* renamed from: g */
        public void mo28780g(CoordinatorLayout.C0876f c0876f) {
            if (c0876f.f3039h == 0) {
                c0876f.f3039h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5429l.f15232p2);
            this.f9991c = obtainStyledAttributes.getBoolean(C5429l.f15240q2, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9974B != colorStateList) {
            this.f9974B = colorStateList;
            getImpl().mo29687V(this.f9974B);
        }
    }
}
