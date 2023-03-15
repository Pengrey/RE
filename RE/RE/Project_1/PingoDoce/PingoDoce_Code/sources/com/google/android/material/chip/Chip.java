package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.C0470f;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.chip.C3533a;
import com.google.android.material.internal.C3646n;
import com.google.android.material.internal.C3649p;
import com.google.android.material.internal.InterfaceC3633h;
import java.util.List;
import p100f8.C5419b;
import p100f8.C5427j;
import p100f8.C5428k;
import p100f8.C5429l;
import p120g8.C5623h;
import p231m2.AbstractC7100a;
import p354s8.AbstractC10091f;
import p354s8.C10087d;
import p366t8.C10399b;
import p401v8.C11145h;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* loaded from: classes.dex */
public class Chip extends C0470f implements C3533a.InterfaceC3534a, InterfaceC11164n, InterfaceC3633h<Chip> {

    /* renamed from: R */
    private static final int f9706R = C5428k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: S */
    private static final Rect f9707S = new Rect();

    /* renamed from: T */
    private static final int[] f9708T = {16842913};

    /* renamed from: U */
    private static final int[] f9709U = {16842911};

    /* renamed from: A */
    private InsetDrawable f9710A;

    /* renamed from: B */
    private RippleDrawable f9711B;

    /* renamed from: C */
    private View.OnClickListener f9712C;

    /* renamed from: D */
    private InterfaceC3633h.InterfaceC3634a<Chip> f9713D;

    /* renamed from: E */
    private boolean f9714E;

    /* renamed from: F */
    private boolean f9715F;

    /* renamed from: G */
    private boolean f9716G;

    /* renamed from: H */
    private boolean f9717H;

    /* renamed from: I */
    private boolean f9718I;

    /* renamed from: J */
    private int f9719J;

    /* renamed from: K */
    private int f9720K;

    /* renamed from: L */
    private CharSequence f9721L;

    /* renamed from: M */
    private final C3526c f9722M;

    /* renamed from: N */
    private boolean f9723N;

    /* renamed from: O */
    private final Rect f9724O;

    /* renamed from: P */
    private final RectF f9725P;

    /* renamed from: Q */
    private final AbstractC10091f f9726Q;

    /* renamed from: z */
    private C3533a f9727z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes.dex */
    class C3524a extends AbstractC10091f {
        C3524a() {
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: a */
        public void mo9200a(int i) {
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: b */
        public void mo9199b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f9727z.m30088O2() ? Chip.this.f9727z.m30039k1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes.dex */
    public class C3525b extends ViewOutlineProvider {
        C3525b() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f9727z != null) {
                Chip.this.f9727z.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: classes.dex */
    public class C3526c extends AbstractC7100a {
        C3526c(Chip chip) {
            super(chip);
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: B */
        protected int mo19303B(float f, float f2) {
            return (Chip.this.m30153m() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: C */
        protected void mo19302C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m30153m() && Chip.this.m30148r() && Chip.this.f9712C != null) {
                list.add(1);
            }
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: J */
        protected boolean mo19295J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m30147s();
                }
                return false;
            }
            return false;
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: M */
        protected void mo19292M(C1085c c1085c) {
            c1085c.m38565Y(Chip.this.m30149q());
            c1085c.m38560b0(Chip.this.isClickable());
            c1085c.m38562a0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                c1085c.m38588G0(text);
            } else {
                c1085c.m38554e0(text);
            }
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: N */
        protected void mo19291N(int i, C1085c c1085c) {
            String str = BuildConfig.VERSION_NAME;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c1085c.m38554e0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C5427j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    c1085c.m38554e0(context.getString(i2, objArr).trim());
                }
                c1085c.m38567W(Chip.this.getCloseIconTouchBoundsInt());
                c1085c.m38561b(C1085c.C1086a.f3425e);
                c1085c.m38546i0(Chip.this.isEnabled());
                return;
            }
            c1085c.m38554e0(BuildConfig.VERSION_NAME);
            c1085c.m38567W(Chip.f9707S);
        }

        @Override // p231m2.AbstractC7100a
        /* renamed from: O */
        protected void mo19290O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f9717H = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5419b.chipStyle);
    }

    /* renamed from: A */
    private void m30166A() {
        TextPaint paint = getPaint();
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            paint.drawableState = c3533a.getState();
        }
        C10087d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m9206n(getContext(), paint, this.f9726Q);
        }
    }

    /* renamed from: B */
    private void m30165B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f9725P.setEmpty();
        if (m30153m() && this.f9712C != null) {
            this.f9727z.m30057b1(this.f9725P);
        }
        return this.f9725P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f9724O.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f9724O;
    }

    private C10087d getTextAppearance() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30037l1();
        }
        return null;
    }

    /* renamed from: i */
    private void m30157i(C3533a c3533a) {
        c3533a.m30016s2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: j */
    private int[] m30156j() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.f9717H) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.f9716G) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f9715F) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f9717H) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f9716G) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f9715F) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m30154l() {
        if (getBackgroundDrawable() == this.f9710A && this.f9727z.getCallback() == null) {
            this.f9727z.setCallback(this.f9710A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m30153m() {
        C3533a c3533a = this.f9727z;
        return (c3533a == null || c3533a.m30072U0() == null) ? false : true;
    }

    /* renamed from: n */
    private void m30152n(Context context, AttributeSet attributeSet, int i) {
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, C5429l.f15190k0, i, f9706R, new int[0]);
        this.f9718I = m29500h.getBoolean(C5429l.f15028R0, false);
        this.f9720K = (int) Math.ceil(m29500h.getDimension(C5429l.f14932F0, (float) Math.ceil(C3649p.m29491b(getContext(), 48))));
        m29500h.recycle();
    }

    /* renamed from: o */
    private void m30151o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C3525b());
        }
    }

    /* renamed from: p */
    private void m30150p(int i, int i2, int i3, int i4) {
        this.f9710A = new InsetDrawable((Drawable) this.f9727z, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f9716G != z) {
            this.f9716G = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f9715F != z) {
            this.f9715F = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m30146t() {
        if (this.f9710A != null) {
            this.f9710A = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m30142x();
        }
    }

    /* renamed from: v */
    private void m30144v(C3533a c3533a) {
        if (c3533a != null) {
            c3533a.m30016s2(null);
        }
    }

    /* renamed from: w */
    private void m30143w() {
        if (m30153m() && m30148r() && this.f9712C != null) {
            C1112b0.m38405s0(this, this.f9722M);
            this.f9723N = true;
            return;
        }
        C1112b0.m38405s0(this, null);
        this.f9723N = false;
    }

    /* renamed from: x */
    private void m30142x() {
        if (C10399b.f27024a) {
            m30141y();
            return;
        }
        this.f9727z.m30091N2(true);
        C1112b0.m38399v0(this, getBackgroundDrawable());
        m30140z();
        m30154l();
    }

    /* renamed from: y */
    private void m30141y() {
        this.f9711B = new RippleDrawable(C10399b.m8071d(this.f9727z.m30043i1()), getBackgroundDrawable(), null);
        this.f9727z.m30091N2(false);
        C1112b0.m38399v0(this, this.f9711B);
        m30140z();
    }

    /* renamed from: z */
    private void m30140z() {
        C3533a c3533a;
        if (TextUtils.isEmpty(getText()) || (c3533a = this.f9727z) == null) {
            return;
        }
        int m30096M0 = (int) (c3533a.m30096M0() + this.f9727z.m30035m1() + this.f9727z.m30015t0());
        int m30081R0 = (int) (this.f9727z.m30081R0() + this.f9727z.m30032n1() + this.f9727z.m30027p0());
        if (this.f9710A != null) {
            Rect rect = new Rect();
            this.f9710A.getPadding(rect);
            m30081R0 += rect.left;
            m30096M0 += rect.right;
        }
        C1112b0.m38473F0(this, m30081R0, getPaddingTop(), m30096M0, getPaddingBottom());
    }

    @Override // com.google.android.material.chip.C3533a.InterfaceC3534a
    /* renamed from: a */
    public void mo29994a() {
        m30155k(this.f9720K);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f9723N) {
            return this.f9722M.m19271v(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f9723N) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f9722M.m19270w(keyEvent) || this.f9722M.m19304A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0470f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3533a c3533a = this.f9727z;
        if ((c3533a == null || !c3533a.m30017s1()) ? false : this.f9727z.m30028o2(m30156j())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9721L)) {
            return this.f9721L;
        }
        if (!m30149q()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).m30136h()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9710A;
        return insetDrawable == null ? this.f9727z : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30108I0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30105J0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30102K0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return Math.max(0.0f, c3533a.m30099L0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9727z;
    }

    public float getChipEndPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30096M0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30093N0();
        }
        return null;
    }

    public float getChipIconSize() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30090O0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30087P0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30084Q0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30081R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30078S0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30075T0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30072U0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30069V0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30067W0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30065X0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30063Y0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30059a1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30051e1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f9723N && (this.f9722M.m19304A() == 1 || this.f9722M.m19269x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C5623h getHideMotionSpec() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30049f1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30047g1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30045h1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30043i1();
        }
        return null;
    }

    public C11148k getShapeAppearanceModel() {
        return this.f9727z.m6025E();
    }

    public C5623h getShowMotionSpec() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30041j1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30035m1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            return c3533a.m30032n1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean m30155k(int i) {
        this.f9720K = i;
        if (!m30145u()) {
            if (this.f9710A != null) {
                m30146t();
            } else {
                m30142x();
            }
            return false;
        }
        int max = Math.max(0, i - this.f9727z.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f9727z.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f9710A != null) {
                m30146t();
            } else {
                m30142x();
            }
            return false;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f9710A != null) {
            Rect rect = new Rect();
            this.f9710A.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m30142x();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
        } else {
            setMinHeight(i);
            setMinWidth(i);
        }
        m30150p(i2, i3, i2, i3);
        m30142x();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11145h.m5960f(this, this.f9727z);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f9708T);
        }
        if (m30149q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f9709U);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f9723N) {
            this.f9722M.m19296I(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m30149q());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1085c.m38578L0(accessibilityNodeInfo).m38556d0(C1085c.C1088c.m38506a(chipGroup.m29542b(this), 1, chipGroup.mo29541c() ? chipGroup.m30137g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f9719J != i) {
            this.f9719J = i;
            m30140z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f9715F
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f9715F
            if (r0 == 0) goto L34
            r5.m30147s()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean m30149q() {
        C3533a c3533a = this.f9727z;
        return c3533a != null && c3533a.m30020r1();
    }

    /* renamed from: r */
    public boolean m30148r() {
        C3533a c3533a = this.f9727z;
        return c3533a != null && c3533a.m30014t1();
    }

    /* renamed from: s */
    public boolean m30147s() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f9712C;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f9723N) {
            this.f9722M.m19284U(1, 1);
        }
        return z;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9721L = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9711B) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0470f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f9711B) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0470f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30131A1(z);
        }
    }

    public void setCheckableResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30128B1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        InterfaceC3633h.InterfaceC3634a<Chip> interfaceC3634a;
        C3533a c3533a = this.f9727z;
        if (c3533a == null) {
            this.f9714E = z;
        } else if (c3533a.m30020r1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (interfaceC3634a = this.f9713D) == null) {
                return;
            }
            interfaceC3634a.mo29538a(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30125C1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30122D1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30119E1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30116F1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30113G1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30107I1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30104J1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30101K1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30098L1(i);
        }
    }

    public void setChipDrawable(C3533a c3533a) {
        C3533a c3533a2 = this.f9727z;
        if (c3533a2 != c3533a) {
            m30144v(c3533a2);
            this.f9727z = c3533a;
            c3533a.m30121D2(false);
            m30157i(this.f9727z);
            m30155k(this.f9720K);
        }
    }

    public void setChipEndPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30095M1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30092N1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30089O1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30086P1(i);
        }
    }

    public void setChipIconSize(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30083Q1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30080R1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30077S1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30074T1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30071U1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30066W1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30064X1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30062Y1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30060Z1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30058a2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30056b2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30054c2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30052d2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30048f2(drawable);
        }
        m30143w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30046g2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30044h2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30042i2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30040j2(i);
        }
        m30143w();
    }

    public void setCloseIconSize(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30038k2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30036l2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30034m2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30031n2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30025p2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30022q2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m6005Y(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9727z == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C3533a c3533a = this.f9727z;
            if (c3533a != null) {
                c3533a.m30013t2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f9718I = z;
        m30155k(this.f9720K);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C5623h c5623h) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30010u2(c5623h);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30007v2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30004w2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30001x2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m29998y2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m29995z2(i);
        }
    }

    @Override // com.google.android.material.internal.InterfaceC3633h
    public void setInternalOnCheckedChangeListener(InterfaceC3633h.InterfaceC3634a<Chip> interfaceC3634a) {
        this.f9713D = interfaceC3634a;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f9727z != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30130A2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9712C = onClickListener;
        m30143w();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30127B2(colorStateList);
        }
        if (this.f9727z.m30026p1()) {
            return;
        }
        m30141y();
    }

    public void setRippleColorResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30124C2(i);
            if (this.f9727z.m30026p1()) {
                return;
            }
            m30141y();
        }
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        this.f9727z.setShapeAppearanceModel(c11148k);
    }

    public void setShowMotionSpec(C5623h c5623h) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30118E2(c5623h);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30115F2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C3533a c3533a = this.f9727z;
        if (c3533a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        super.setText(c3533a.m30088O2() ? null : charSequence, bufferType);
        C3533a c3533a2 = this.f9727z;
        if (c3533a2 != null) {
            c3533a2.m30112G2(charSequence);
        }
    }

    public void setTextAppearance(C10087d c10087d) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30109H2(c10087d);
        }
        m30166A();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30103J2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30100K2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30097L2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30094M2(i);
        }
    }

    /* renamed from: u */
    public boolean m30145u() {
        return this.f9718I;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.f9706R
            android.content.Context r8 = p419w8.C11602a.m4640c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f9724O = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f9725P = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f9726Q = r8
            android.content.Context r8 = r7.getContext()
            r7.m30165B(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.C3533a.m30000y0(r8, r9, r10, r4)
            r7.m30152n(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.C1112b0.m38394y(r7)
            r6.m6005Y(r0)
            int[] r2 = p100f8.C5429l.f15190k0
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C3646n.m29500h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = p100f8.C5429l.f15214n0
            android.content.res.ColorStateList r8 = p354s8.C10086c.m9229a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = p100f8.C5429l.f15068W0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f9722M = r9
            r7.m30143w()
            if (r8 != 0) goto L69
            r7.m30151o()
        L69:
            boolean r8 = r7.f9714E
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.m30039k1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.m30051e1()
            r7.setEllipsize(r8)
            r7.m30166A()
            com.google.android.material.chip.a r8 = r7.f9727z
            boolean r8 = r8.m30088O2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.m30140z()
            boolean r8 = r7.m30145u()
            if (r8 == 0) goto La2
            int r8 = r7.f9720K
            r7.setMinHeight(r8)
        La2:
            int r8 = androidx.core.view.C1112b0.m38476E(r7)
            r7.f9719J = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30019r2(z);
        }
        m30143w();
    }

    public void setCheckedIconVisible(boolean z) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30110H1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30068V1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30106I2(i);
        }
        m30166A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C3533a c3533a = this.f9727z;
        if (c3533a != null) {
            c3533a.m30106I2(i);
        }
        m30166A();
    }
}
