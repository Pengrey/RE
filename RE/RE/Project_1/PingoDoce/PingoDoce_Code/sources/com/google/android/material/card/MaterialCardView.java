package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p100f8.C5419b;
import p100f8.C5428k;
import p111g.C5586a;
import p401v8.C11145h;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC11164n {

    /* renamed from: K */
    private static final int[] f9670K = {16842911};

    /* renamed from: L */
    private static final int[] f9671L = {16842912};

    /* renamed from: M */
    private static final int[] f9672M = {C5419b.state_dragged};

    /* renamed from: N */
    private static final int f9673N = C5428k.Widget_MaterialComponents_CardView;

    /* renamed from: F */
    private final C3522a f9674F;

    /* renamed from: G */
    private boolean f9675G;

    /* renamed from: H */
    private boolean f9676H;

    /* renamed from: I */
    private boolean f9677I;

    /* renamed from: J */
    private InterfaceC3521a f9678J;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3521a {
        /* renamed from: a */
        void m30227a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f9674F.m30183j().getBounds());
        return rectF;
    }

    /* renamed from: h */
    private void m30231h() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f9674F.m30184i();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f9674F.m30182k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f9674F.m30181l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f9674F.m30180m();
    }

    public int getCheckedIconGravity() {
        return this.f9674F.m30179n();
    }

    public int getCheckedIconMargin() {
        return this.f9674F.m30178o();
    }

    public int getCheckedIconSize() {
        return this.f9674F.m30177p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f9674F.m30176q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f9674F.m30226A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f9674F.m30226A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f9674F.m30226A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f9674F.m30226A().top;
    }

    public float getProgress() {
        return this.f9674F.m30172u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f9674F.m30174s();
    }

    public ColorStateList getRippleColor() {
        return this.f9674F.m30171v();
    }

    public C11148k getShapeAppearanceModel() {
        return this.f9674F.m30170w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f9674F.m30169x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f9674F.m30168y();
    }

    public int getStrokeWidth() {
        return this.f9674F.m30167z();
    }

    /* renamed from: i */
    public boolean m30230i() {
        C3522a c3522a = this.f9674F;
        return c3522a != null && c3522a.m30223D();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f9676H;
    }

    /* renamed from: j */
    public boolean m30229j() {
        return this.f9677I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m30228k(int i, int i2, int i3, int i4) {
        super.m40095f(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5960f(this, this.f9674F.m30183j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m30230i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9670K);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9671L);
        }
        if (m30229j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f9672M);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m30230i());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9674F.m30219H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f9675G) {
            if (!this.f9674F.m30224C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f9674F.m30218I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f9674F.m30217J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f9674F.m30193d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f9674F.m30216K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f9674F.m30215L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f9676H != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f9674F.m30213N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f9674F.m30179n() != i) {
            this.f9674F.m30212O(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f9674F.m30211P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f9674F.m30211P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f9674F.m30213N(C5586a.m23699b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f9674F.m30210Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f9674F.m30210Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f9674F.m30209R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C3522a c3522a = this.f9674F;
        if (c3522a != null) {
            c3522a.m30197b0();
        }
    }

    public void setDragged(boolean z) {
        if (this.f9677I != z) {
            this.f9677I = z;
            refreshDrawableState();
            m30231h();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f9674F.m30189f0();
    }

    public void setOnCheckedChangeListener(InterfaceC3521a interfaceC3521a) {
        this.f9678J = interfaceC3521a;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f9674F.m30189f0();
        this.f9674F.m30195c0();
    }

    public void setProgress(float f) {
        this.f9674F.m30207T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f9674F.m30208S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f9674F.m30206U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f9674F.m30206U(C5586a.m23700a(getContext(), i));
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(c11148k.m5937u(getBoundsAsRectF()));
        }
        this.f9674F.m30205V(c11148k);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f9674F.m30203X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f9674F.m30189f0();
        this.f9674F.m30195c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m30230i() && isEnabled()) {
            this.f9676H = !this.f9676H;
            refreshDrawableState();
            m30231h();
            this.f9674F.m30214M(this.f9676H);
            InterfaceC3521a interfaceC3521a = this.f9678J;
            if (interfaceC3521a != null) {
                interfaceC3521a.m30227a(this, this.f9676H);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f9673N
            android.content.Context r8 = p419w8.C11602a.m4640c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f9676H = r8
            r7.f9677I = r8
            r0 = 1
            r7.f9675G = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p100f8.C5429l.f15297x3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f9674F = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.m30217J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.m30202Y(r9, r10, r1, r2)
            r0.m30220G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f9674F.m30217J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f9674F.m30204W(colorStateList);
        invalidate();
    }
}
