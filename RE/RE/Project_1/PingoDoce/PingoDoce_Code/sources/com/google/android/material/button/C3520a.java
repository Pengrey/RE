package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.view.C1112b0;
import com.google.android.material.internal.C3649p;
import p100f8.C5419b;
import p100f8.C5429l;
import p198k8.C6608a;
import p354s8.C10086c;
import p366t8.C10396a;
import p366t8.C10399b;
import p401v8.C11141g;
import p401v8.C11148k;
import p401v8.InterfaceC11164n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes.dex */
public class C3520a {

    /* renamed from: t */
    private static final boolean f9649t;

    /* renamed from: u */
    private static final boolean f9650u;

    /* renamed from: a */
    private final MaterialButton f9651a;

    /* renamed from: b */
    private C11148k f9652b;

    /* renamed from: c */
    private int f9653c;

    /* renamed from: d */
    private int f9654d;

    /* renamed from: e */
    private int f9655e;

    /* renamed from: f */
    private int f9656f;

    /* renamed from: g */
    private int f9657g;

    /* renamed from: h */
    private int f9658h;

    /* renamed from: i */
    private PorterDuff.Mode f9659i;

    /* renamed from: j */
    private ColorStateList f9660j;

    /* renamed from: k */
    private ColorStateList f9661k;

    /* renamed from: l */
    private ColorStateList f9662l;

    /* renamed from: m */
    private Drawable f9663m;

    /* renamed from: n */
    private boolean f9664n = false;

    /* renamed from: o */
    private boolean f9665o = false;

    /* renamed from: p */
    private boolean f9666p = false;

    /* renamed from: q */
    private boolean f9667q;

    /* renamed from: r */
    private LayerDrawable f9668r;

    /* renamed from: s */
    private int f9669s;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        f9649t = i >= 21;
        if (i < 21 || i > 22) {
            z = false;
        }
        f9650u = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3520a(MaterialButton materialButton, C11148k c11148k) {
        this.f9651a = materialButton;
        this.f9652b = c11148k;
    }

    /* renamed from: E */
    private void m30264E(int i, int i2) {
        int m38466J = C1112b0.m38466J(this.f9651a);
        int paddingTop = this.f9651a.getPaddingTop();
        int m38468I = C1112b0.m38468I(this.f9651a);
        int paddingBottom = this.f9651a.getPaddingBottom();
        int i3 = this.f9655e;
        int i4 = this.f9656f;
        this.f9656f = i2;
        this.f9655e = i;
        if (!this.f9665o) {
            m30263F();
        }
        C1112b0.m38473F0(this.f9651a, m38466J, (paddingTop + i) - i3, m38468I, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m30263F() {
        this.f9651a.setInternalBackground(m30258a());
        C11141g m30253f = m30253f();
        if (m30253f != null) {
            m30253f.m6005Y(this.f9669s);
        }
    }

    /* renamed from: G */
    private void m30262G(C11148k c11148k) {
        if (f9650u && !this.f9665o) {
            int m38466J = C1112b0.m38466J(this.f9651a);
            int paddingTop = this.f9651a.getPaddingTop();
            int m38468I = C1112b0.m38468I(this.f9651a);
            int paddingBottom = this.f9651a.getPaddingBottom();
            m30263F();
            C1112b0.m38473F0(this.f9651a, m38466J, paddingTop, m38468I, paddingBottom);
            return;
        }
        if (m30253f() != null) {
            m30253f().setShapeAppearanceModel(c11148k);
        }
        if (m30245n() != null) {
            m30245n().setShapeAppearanceModel(c11148k);
        }
        if (m30254e() != null) {
            m30254e().setShapeAppearanceModel(c11148k);
        }
    }

    /* renamed from: I */
    private void m30260I() {
        C11141g m30253f = m30253f();
        C11141g m30245n = m30245n();
        if (m30253f != null) {
            m30253f.m5989h0(this.f9658h, this.f9661k);
            if (m30245n != null) {
                m30245n.m5991g0(this.f9658h, this.f9664n ? C6608a.m20504d(this.f9651a, C5419b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m30259J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f9653c, this.f9655e, this.f9654d, this.f9656f);
    }

    /* renamed from: a */
    private Drawable m30258a() {
        C11141g c11141g = new C11141g(this.f9652b);
        c11141g.m6015O(this.f9651a.getContext());
        C0981a.m38862o(c11141g, this.f9660j);
        PorterDuff.Mode mode = this.f9659i;
        if (mode != null) {
            C0981a.m38861p(c11141g, mode);
        }
        c11141g.m5989h0(this.f9658h, this.f9661k);
        C11141g c11141g2 = new C11141g(this.f9652b);
        c11141g2.setTint(0);
        c11141g2.m5991g0(this.f9658h, this.f9664n ? C6608a.m20504d(this.f9651a, C5419b.colorSurface) : 0);
        if (f9649t) {
            C11141g c11141g3 = new C11141g(this.f9652b);
            this.f9663m = c11141g3;
            C0981a.m38863n(c11141g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C10399b.m8071d(this.f9662l), m30259J(new LayerDrawable(new Drawable[]{c11141g2, c11141g})), this.f9663m);
            this.f9668r = rippleDrawable;
            return rippleDrawable;
        }
        C10396a c10396a = new C10396a(this.f9652b);
        this.f9663m = c10396a;
        C0981a.m38862o(c10396a, C10399b.m8071d(this.f9662l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c11141g2, c11141g, this.f9663m});
        this.f9668r = layerDrawable;
        return m30259J(layerDrawable);
    }

    /* renamed from: g */
    private C11141g m30252g(boolean z) {
        LayerDrawable layerDrawable = this.f9668r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f9649t) {
            return (C11141g) ((LayerDrawable) ((InsetDrawable) this.f9668r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (C11141g) this.f9668r.getDrawable(!z ? 1 : 0);
    }

    /* renamed from: n */
    private C11141g m30245n() {
        return m30252g(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public void m30268A(ColorStateList colorStateList) {
        if (this.f9661k != colorStateList) {
            this.f9661k = colorStateList;
            m30260I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public void m30267B(int i) {
        if (this.f9658h != i) {
            this.f9658h = i;
            m30260I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m30266C(ColorStateList colorStateList) {
        if (this.f9660j != colorStateList) {
            this.f9660j = colorStateList;
            if (m30253f() != null) {
                C0981a.m38862o(m30253f(), this.f9660j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public void m30265D(PorterDuff.Mode mode) {
        if (this.f9659i != mode) {
            this.f9659i = mode;
            if (m30253f() == null || this.f9659i == null) {
                return;
            }
            C0981a.m38861p(m30253f(), this.f9659i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public void m30261H(int i, int i2) {
        Drawable drawable = this.f9663m;
        if (drawable != null) {
            drawable.setBounds(this.f9653c, this.f9655e, i2 - this.f9654d, i - this.f9656f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m30257b() {
        return this.f9657g;
    }

    /* renamed from: c */
    public int m30256c() {
        return this.f9656f;
    }

    /* renamed from: d */
    public int m30255d() {
        return this.f9655e;
    }

    /* renamed from: e */
    public InterfaceC11164n m30254e() {
        LayerDrawable layerDrawable = this.f9668r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f9668r.getNumberOfLayers() > 2) {
            return (InterfaceC11164n) this.f9668r.getDrawable(2);
        }
        return (InterfaceC11164n) this.f9668r.getDrawable(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C11141g m30253f() {
        return m30252g(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList m30251h() {
        return this.f9662l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C11148k m30250i() {
        return this.f9652b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList m30249j() {
        return this.f9661k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m30248k() {
        return this.f9658h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList m30247l() {
        return this.f9660j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode m30246m() {
        return this.f9659i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m30244o() {
        return this.f9665o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m30243p() {
        return this.f9667q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m30242q(TypedArray typedArray) {
        this.f9653c = typedArray.getDimensionPixelOffset(C5429l.f14950H2, 0);
        this.f9654d = typedArray.getDimensionPixelOffset(C5429l.f14958I2, 0);
        this.f9655e = typedArray.getDimensionPixelOffset(C5429l.f14966J2, 0);
        this.f9656f = typedArray.getDimensionPixelOffset(C5429l.f14974K2, 0);
        int i = C5429l.f15006O2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f9657g = dimensionPixelSize;
            m30234y(this.f9652b.m5935w(dimensionPixelSize));
            this.f9666p = true;
        }
        this.f9658h = typedArray.getDimensionPixelSize(C5429l.f15086Y2, 0);
        this.f9659i = C3649p.m29487f(typedArray.getInt(C5429l.f14998N2, -1), PorterDuff.Mode.SRC_IN);
        this.f9660j = C10086c.m9229a(this.f9651a.getContext(), typedArray, C5429l.f14990M2);
        this.f9661k = C10086c.m9229a(this.f9651a.getContext(), typedArray, C5429l.f15078X2);
        this.f9662l = C10086c.m9229a(this.f9651a.getContext(), typedArray, C5429l.f15070W2);
        this.f9667q = typedArray.getBoolean(C5429l.f14982L2, false);
        this.f9669s = typedArray.getDimensionPixelSize(C5429l.f15014P2, 0);
        int m38466J = C1112b0.m38466J(this.f9651a);
        int paddingTop = this.f9651a.getPaddingTop();
        int m38468I = C1112b0.m38468I(this.f9651a);
        int paddingBottom = this.f9651a.getPaddingBottom();
        if (typedArray.hasValue(C5429l.f14942G2)) {
            m30240s();
        } else {
            m30263F();
        }
        C1112b0.m38473F0(this.f9651a, m38466J + this.f9653c, paddingTop + this.f9655e, m38468I + this.f9654d, paddingBottom + this.f9656f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m30241r(int i) {
        if (m30253f() != null) {
            m30253f().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m30240s() {
        this.f9665o = true;
        this.f9651a.setSupportBackgroundTintList(this.f9660j);
        this.f9651a.setSupportBackgroundTintMode(this.f9659i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m30239t(boolean z) {
        this.f9667q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m30238u(int i) {
        if (this.f9666p && this.f9657g == i) {
            return;
        }
        this.f9657g = i;
        this.f9666p = true;
        m30234y(this.f9652b.m5935w(i));
    }

    /* renamed from: v */
    public void m30237v(int i) {
        m30264E(this.f9655e, i);
    }

    /* renamed from: w */
    public void m30236w(int i) {
        m30264E(i, this.f9656f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m30235x(ColorStateList colorStateList) {
        if (this.f9662l != colorStateList) {
            this.f9662l = colorStateList;
            boolean z = f9649t;
            if (z && (this.f9651a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f9651a.getBackground()).setColor(C10399b.m8071d(colorStateList));
            } else if (z || !(this.f9651a.getBackground() instanceof C10396a)) {
            } else {
                ((C10396a) this.f9651a.getBackground()).setTintList(C10399b.m8071d(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m30234y(C11148k c11148k) {
        this.f9652b = c11148k;
        m30262G(c11148k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public void m30233z(boolean z) {
        this.f9664n = z;
        m30260I();
    }
}
