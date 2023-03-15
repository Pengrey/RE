package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import p100f8.C5419b;
import p100f8.C5423f;
import p100f8.C5428k;
import p100f8.C5429l;
import p198k8.C6608a;
import p354s8.C10086c;
import p366t8.C10399b;
import p401v8.C11138d;
import p401v8.C11139e;
import p401v8.C11141g;
import p401v8.C11147j;
import p401v8.C11148k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.card.a */
/* loaded from: classes.dex */
public class C3522a {

    /* renamed from: u */
    private static final double f9679u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v */
    private static final Drawable f9680v;

    /* renamed from: a */
    private final MaterialCardView f9681a;

    /* renamed from: c */
    private final C11141g f9683c;

    /* renamed from: d */
    private final C11141g f9684d;

    /* renamed from: e */
    private int f9685e;

    /* renamed from: f */
    private int f9686f;

    /* renamed from: g */
    private int f9687g;

    /* renamed from: h */
    private int f9688h;

    /* renamed from: i */
    private Drawable f9689i;

    /* renamed from: j */
    private Drawable f9690j;

    /* renamed from: k */
    private ColorStateList f9691k;

    /* renamed from: l */
    private ColorStateList f9692l;

    /* renamed from: m */
    private C11148k f9693m;

    /* renamed from: n */
    private ColorStateList f9694n;

    /* renamed from: o */
    private Drawable f9695o;

    /* renamed from: p */
    private LayerDrawable f9696p;

    /* renamed from: q */
    private C11141g f9697q;

    /* renamed from: r */
    private C11141g f9698r;

    /* renamed from: t */
    private boolean f9700t;

    /* renamed from: b */
    private final Rect f9682b = new Rect();

    /* renamed from: s */
    private boolean f9699s = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCardViewHelper.java */
    /* renamed from: com.google.android.material.card.a$a */
    /* loaded from: classes.dex */
    public class C3523a extends InsetDrawable {
        C3523a(C3522a c3522a, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f9680v = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C3522a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f9681a = materialCardView;
        C11141g c11141g = new C11141g(materialCardView.getContext(), attributeSet, i, i2);
        this.f9683c = c11141g;
        c11141g.m6015O(materialCardView.getContext());
        c11141g.m5995e0(-12303292);
        C11148k.C11150b m5936v = c11141g.m6025E().m5936v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C5429l.f15172i0, i, C5428k.f14890a);
        int i3 = C5429l.f15181j0;
        if (obtainStyledAttributes.hasValue(i3)) {
            m5936v.m5912o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f9684d = new C11141g();
        m30205V(m5936v.m5914m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m30225B(Drawable drawable) {
        int ceil;
        int i;
        if ((Build.VERSION.SDK_INT < 21) || this.f9681a.getUseCompatPadding()) {
            int ceil2 = (int) Math.ceil(m30194d());
            ceil = (int) Math.ceil(m30196c());
            i = ceil2;
        } else {
            ceil = 0;
            i = 0;
        }
        return new C3523a(this, drawable, ceil, i, ceil, i);
    }

    /* renamed from: E */
    private boolean m30222E() {
        return (this.f9687g & 80) == 80;
    }

    /* renamed from: F */
    private boolean m30221F() {
        return (this.f9687g & 8388613) == 8388613;
    }

    /* renamed from: Z */
    private boolean m30201Z() {
        return this.f9681a.getPreventCornerOverlap() && !m30192e();
    }

    /* renamed from: a */
    private float m30200a() {
        return Math.max(Math.max(m30198b(this.f9693m.m5941q(), this.f9683c.m6022H()), m30198b(this.f9693m.m5939s(), this.f9683c.m6021I())), Math.max(m30198b(this.f9693m.m5947k(), this.f9683c.m5972t()), m30198b(this.f9693m.m5949i(), this.f9683c.m5973s())));
    }

    /* renamed from: a0 */
    private boolean m30199a0() {
        return this.f9681a.getPreventCornerOverlap() && m30192e() && this.f9681a.getUseCompatPadding();
    }

    /* renamed from: b */
    private float m30198b(C11138d c11138d, float f) {
        if (c11138d instanceof C11147j) {
            return (float) ((1.0d - f9679u) * f);
        }
        if (c11138d instanceof C11139e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m30196c() {
        return this.f9681a.getMaxCardElevation() + (m30199a0() ? m30200a() : 0.0f);
    }

    /* renamed from: d */
    private float m30194d() {
        return (this.f9681a.getMaxCardElevation() * 1.5f) + (m30199a0() ? m30200a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m30192e() {
        return Build.VERSION.SDK_INT >= 21 && this.f9683c.m6012R();
    }

    /* renamed from: e0 */
    private void m30191e0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && (this.f9681a.getForeground() instanceof InsetDrawable)) {
            ((InsetDrawable) this.f9681a.getForeground()).setDrawable(drawable);
        } else {
            this.f9681a.setForeground(m30225B(drawable));
        }
    }

    /* renamed from: f */
    private Drawable m30190f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C11141g m30186h = m30186h();
        this.f9697q = m30186h;
        m30186h.m6004Z(this.f9691k);
        stateListDrawable.addState(new int[]{16842919}, this.f9697q);
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m30188g() {
        if (C10399b.f27024a) {
            this.f9698r = m30186h();
            return new RippleDrawable(this.f9691k, null, this.f9698r);
        }
        return m30190f();
    }

    /* renamed from: g0 */
    private void m30187g0() {
        Drawable drawable;
        if (C10399b.f27024a && (drawable = this.f9695o) != null) {
            ((RippleDrawable) drawable).setColor(this.f9691k);
            return;
        }
        C11141g c11141g = this.f9697q;
        if (c11141g != null) {
            c11141g.m6004Z(this.f9691k);
        }
    }

    /* renamed from: h */
    private C11141g m30186h() {
        return new C11141g(this.f9693m);
    }

    /* renamed from: r */
    private Drawable m30175r() {
        if (this.f9695o == null) {
            this.f9695o = m30188g();
        }
        if (this.f9696p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f9695o, this.f9684d, this.f9690j});
            this.f9696p = layerDrawable;
            layerDrawable.setId(2, C5423f.mtrl_card_checked_layer_id);
        }
        return this.f9696p;
    }

    /* renamed from: t */
    private float m30173t() {
        if (this.f9681a.getPreventCornerOverlap()) {
            if (Build.VERSION.SDK_INT < 21 || this.f9681a.getUseCompatPadding()) {
                return (float) ((1.0d - f9679u) * this.f9681a.getCardViewRadius());
            }
            return 0.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect m30226A() {
        return this.f9682b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m30224C() {
        return this.f9699s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean m30223D() {
        return this.f9700t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public void m30220G(TypedArray typedArray) {
        ColorStateList m9229a = C10086c.m9229a(this.f9681a.getContext(), typedArray, C5429l.f14943G3);
        this.f9694n = m9229a;
        if (m9229a == null) {
            this.f9694n = ColorStateList.valueOf(-1);
        }
        this.f9688h = typedArray.getDimensionPixelSize(C5429l.f14951H3, 0);
        boolean z = typedArray.getBoolean(C5429l.f15305y3, false);
        this.f9700t = z;
        this.f9681a.setLongClickable(z);
        this.f9692l = C10086c.m9229a(this.f9681a.getContext(), typedArray, C5429l.f14927E3);
        m30213N(C10086c.m9225e(this.f9681a.getContext(), typedArray, C5429l.f14895A3));
        m30210Q(typedArray.getDimensionPixelSize(C5429l.f14919D3, 0));
        m30211P(typedArray.getDimensionPixelSize(C5429l.f14911C3, 0));
        this.f9687g = typedArray.getInteger(C5429l.f14903B3, 8388661);
        ColorStateList m9229a2 = C10086c.m9229a(this.f9681a.getContext(), typedArray, C5429l.f14935F3);
        this.f9691k = m9229a2;
        if (m9229a2 == null) {
            this.f9691k = ColorStateList.valueOf(C6608a.m20504d(this.f9681a, C5419b.f14887l));
        }
        m30216K(C10086c.m9229a(this.f9681a.getContext(), typedArray, C5429l.f15313z3));
        m30187g0();
        m30193d0();
        m30185h0();
        this.f9681a.setBackgroundInternal(m30225B(this.f9683c));
        Drawable m30175r = this.f9681a.isClickable() ? m30175r() : this.f9684d;
        this.f9689i = m30175r;
        this.f9681a.setForeground(m30225B(m30175r));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m30219H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (this.f9696p != null) {
            int i10 = 0;
            if ((Build.VERSION.SDK_INT < 21) || this.f9681a.getUseCompatPadding()) {
                int ceil = (int) Math.ceil(m30194d() * 2.0f);
                i10 = (int) Math.ceil(m30196c() * 2.0f);
                i3 = ceil;
            } else {
                i3 = 0;
            }
            if (m30221F()) {
                i4 = ((i - this.f9685e) - this.f9686f) - i10;
            } else {
                i4 = this.f9685e;
            }
            if (m30222E()) {
                i5 = this.f9685e;
            } else {
                i5 = ((i2 - this.f9685e) - this.f9686f) - i3;
            }
            int i11 = i5;
            if (m30221F()) {
                i6 = this.f9685e;
            } else {
                i6 = ((i - this.f9685e) - this.f9686f) - i10;
            }
            if (m30222E()) {
                i7 = ((i2 - this.f9685e) - this.f9686f) - i3;
            } else {
                i7 = this.f9685e;
            }
            int i12 = i7;
            if (C1112b0.m38476E(this.f9681a) == 1) {
                i9 = i6;
                i8 = i4;
            } else {
                i8 = i6;
                i9 = i4;
            }
            this.f9696p.setLayerInset(2, i9, i12, i8, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m30218I(boolean z) {
        this.f9699s = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m30217J(ColorStateList colorStateList) {
        this.f9683c.m6004Z(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void m30216K(ColorStateList colorStateList) {
        C11141g c11141g = this.f9684d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c11141g.m6004Z(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m30215L(boolean z) {
        this.f9700t = z;
    }

    /* renamed from: M */
    public void m30214M(boolean z) {
        Drawable drawable = this.f9690j;
        if (drawable != null) {
            drawable.setAlpha(z ? 255 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m30213N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C0981a.m38859r(drawable).mutate();
            this.f9690j = mutate;
            C0981a.m38862o(mutate, this.f9692l);
            m30214M(this.f9681a.isChecked());
        } else {
            this.f9690j = f9680v;
        }
        LayerDrawable layerDrawable = this.f9696p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C5423f.mtrl_card_checked_layer_id, this.f9690j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m30212O(int i) {
        this.f9687g = i;
        m30219H(this.f9681a.getMeasuredWidth(), this.f9681a.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public void m30211P(int i) {
        this.f9685e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m30210Q(int i) {
        this.f9686f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m30209R(ColorStateList colorStateList) {
        this.f9692l = colorStateList;
        Drawable drawable = this.f9690j;
        if (drawable != null) {
            C0981a.m38862o(drawable, colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m30208S(float f) {
        m30205V(this.f9693m.m5935w(f));
        this.f9689i.invalidateSelf();
        if (m30199a0() || m30201Z()) {
            m30195c0();
        }
        if (m30199a0()) {
            m30189f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m30207T(float f) {
        this.f9683c.m6003a0(f);
        C11141g c11141g = this.f9684d;
        if (c11141g != null) {
            c11141g.m6003a0(f);
        }
        C11141g c11141g2 = this.f9698r;
        if (c11141g2 != null) {
            c11141g2.m6003a0(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public void m30206U(ColorStateList colorStateList) {
        this.f9691k = colorStateList;
        m30187g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public void m30205V(C11148k c11148k) {
        this.f9693m = c11148k;
        this.f9683c.setShapeAppearanceModel(c11148k);
        C11141g c11141g = this.f9683c;
        c11141g.m5997d0(!c11141g.m6012R());
        C11141g c11141g2 = this.f9684d;
        if (c11141g2 != null) {
            c11141g2.setShapeAppearanceModel(c11148k);
        }
        C11141g c11141g3 = this.f9698r;
        if (c11141g3 != null) {
            c11141g3.setShapeAppearanceModel(c11148k);
        }
        C11141g c11141g4 = this.f9697q;
        if (c11141g4 != null) {
            c11141g4.setShapeAppearanceModel(c11148k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m30204W(ColorStateList colorStateList) {
        if (this.f9694n == colorStateList) {
            return;
        }
        this.f9694n = colorStateList;
        m30185h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m30203X(int i) {
        if (i == this.f9688h) {
            return;
        }
        this.f9688h = i;
        m30185h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m30202Y(int i, int i2, int i3, int i4) {
        this.f9682b.set(i, i2, i3, i4);
        m30195c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m30197b0() {
        Drawable drawable = this.f9689i;
        Drawable m30175r = this.f9681a.isClickable() ? m30175r() : this.f9684d;
        this.f9689i = m30175r;
        if (drawable != m30175r) {
            m30191e0(m30175r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m30195c0() {
        int m30200a = (int) ((m30201Z() || m30199a0() ? m30200a() : 0.0f) - m30173t());
        MaterialCardView materialCardView = this.f9681a;
        Rect rect = this.f9682b;
        materialCardView.m30228k(rect.left + m30200a, rect.top + m30200a, rect.right + m30200a, rect.bottom + m30200a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m30193d0() {
        this.f9683c.m6005Y(this.f9681a.getCardElevation());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m30189f0() {
        if (!m30224C()) {
            this.f9681a.setBackgroundInternal(m30225B(this.f9683c));
        }
        this.f9681a.setForeground(m30225B(this.f9689i));
    }

    /* renamed from: h0 */
    void m30185h0() {
        this.f9684d.m5989h0(this.f9688h, this.f9694n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m30184i() {
        Drawable drawable = this.f9695o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f9695o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f9695o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C11141g m30183j() {
        return this.f9683c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList m30182k() {
        return this.f9683c.m5968x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m30181l() {
        return this.f9684d.m5968x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Drawable m30180m() {
        return this.f9690j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m30179n() {
        return this.f9687g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m30178o() {
        return this.f9685e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public int m30177p() {
        return this.f9686f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList m30176q() {
        return this.f9692l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public float m30174s() {
        return this.f9683c.m6022H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public float m30172u() {
        return this.f9683c.m5967y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList m30171v() {
        return this.f9691k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C11148k m30170w() {
        return this.f9693m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public int m30169x() {
        ColorStateList colorStateList = this.f9694n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList m30168y() {
        return this.f9694n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public int m30167z() {
        return this.f9688h;
    }
}
