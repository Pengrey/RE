package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0969a;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.text.C1047a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.material.internal.C3640k;
import com.google.android.material.internal.C3646n;
import com.google.android.material.internal.C3649p;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p100f8.C5429l;
import p111g.C5586a;
import p120g8.C5623h;
import p134h8.C5878a;
import p198k8.C6608a;
import p237m8.C7145a;
import p354s8.C10086c;
import p354s8.C10087d;
import p366t8.C10399b;
import p401v8.C11141g;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: classes.dex */
public class C3533a extends C11141g implements Drawable.Callback, C3640k.InterfaceC3642b {

    /* renamed from: f1 */
    private static final int[] f9743f1 = {16842910};

    /* renamed from: g1 */
    private static final ShapeDrawable f9744g1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private float f9745A0;

    /* renamed from: B0 */
    private float f9746B0;

    /* renamed from: C0 */
    private final Context f9747C0;

    /* renamed from: D0 */
    private final Paint f9748D0;

    /* renamed from: E0 */
    private final Paint f9749E0;

    /* renamed from: F0 */
    private final Paint.FontMetrics f9750F0;

    /* renamed from: G0 */
    private final RectF f9751G0;

    /* renamed from: H0 */
    private final PointF f9752H0;

    /* renamed from: I0 */
    private final Path f9753I0;

    /* renamed from: J0 */
    private final C3640k f9754J0;

    /* renamed from: K0 */
    private int f9755K0;

    /* renamed from: L0 */
    private int f9756L0;

    /* renamed from: M0 */
    private int f9757M0;

    /* renamed from: N0 */
    private int f9758N0;

    /* renamed from: O0 */
    private int f9759O0;

    /* renamed from: P0 */
    private int f9760P0;

    /* renamed from: Q0 */
    private boolean f9761Q0;

    /* renamed from: R0 */
    private int f9762R0;

    /* renamed from: S0 */
    private int f9763S0;

    /* renamed from: T0 */
    private ColorFilter f9764T0;

    /* renamed from: U0 */
    private PorterDuffColorFilter f9765U0;

    /* renamed from: V */
    private ColorStateList f9766V;

    /* renamed from: V0 */
    private ColorStateList f9767V0;

    /* renamed from: W */
    private ColorStateList f9768W;

    /* renamed from: W0 */
    private PorterDuff.Mode f9769W0;

    /* renamed from: X */
    private float f9770X;

    /* renamed from: X0 */
    private int[] f9771X0;

    /* renamed from: Y */
    private float f9772Y;

    /* renamed from: Y0 */
    private boolean f9773Y0;

    /* renamed from: Z */
    private ColorStateList f9774Z;

    /* renamed from: Z0 */
    private ColorStateList f9775Z0;

    /* renamed from: a0 */
    private float f9776a0;

    /* renamed from: a1 */
    private WeakReference<InterfaceC3534a> f9777a1;

    /* renamed from: b0 */
    private ColorStateList f9778b0;

    /* renamed from: b1 */
    private TextUtils.TruncateAt f9779b1;

    /* renamed from: c0 */
    private CharSequence f9780c0;

    /* renamed from: c1 */
    private boolean f9781c1;

    /* renamed from: d0 */
    private boolean f9782d0;

    /* renamed from: d1 */
    private int f9783d1;

    /* renamed from: e0 */
    private Drawable f9784e0;

    /* renamed from: e1 */
    private boolean f9785e1;

    /* renamed from: f0 */
    private ColorStateList f9786f0;

    /* renamed from: g0 */
    private float f9787g0;

    /* renamed from: h0 */
    private boolean f9788h0;

    /* renamed from: i0 */
    private boolean f9789i0;

    /* renamed from: j0 */
    private Drawable f9790j0;

    /* renamed from: k0 */
    private Drawable f9791k0;

    /* renamed from: l0 */
    private ColorStateList f9792l0;

    /* renamed from: m0 */
    private float f9793m0;

    /* renamed from: n0 */
    private CharSequence f9794n0;

    /* renamed from: o0 */
    private boolean f9795o0;

    /* renamed from: p0 */
    private boolean f9796p0;

    /* renamed from: q0 */
    private Drawable f9797q0;

    /* renamed from: r0 */
    private ColorStateList f9798r0;

    /* renamed from: s0 */
    private C5623h f9799s0;

    /* renamed from: t0 */
    private C5623h f9800t0;

    /* renamed from: u0 */
    private float f9801u0;

    /* renamed from: v0 */
    private float f9802v0;

    /* renamed from: w0 */
    private float f9803w0;

    /* renamed from: x0 */
    private float f9804x0;

    /* renamed from: y0 */
    private float f9805y0;

    /* renamed from: z0 */
    private float f9806z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3534a {
        /* renamed from: a */
        void mo29994a();
    }

    private C3533a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f9772Y = -1.0f;
        this.f9748D0 = new Paint(1);
        this.f9750F0 = new Paint.FontMetrics();
        this.f9751G0 = new RectF();
        this.f9752H0 = new PointF();
        this.f9753I0 = new Path();
        this.f9763S0 = 255;
        this.f9769W0 = PorterDuff.Mode.SRC_IN;
        this.f9777a1 = new WeakReference<>(null);
        m6015O(context);
        this.f9747C0 = context;
        C3640k c3640k = new C3640k(this);
        this.f9754J0 = c3640k;
        this.f9780c0 = BuildConfig.VERSION_NAME;
        c3640k.m29518e().density = context.getResources().getDisplayMetrics().density;
        this.f9749E0 = null;
        int[] iArr = f9743f1;
        setState(iArr);
        m30028o2(iArr);
        this.f9781c1 = true;
        if (C10399b.f27024a) {
            f9744g1.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m30132A0(Canvas canvas, Rect rect) {
        if (this.f9785e1) {
            return;
        }
        this.f9748D0.setColor(this.f9756L0);
        this.f9748D0.setStyle(Paint.Style.FILL);
        this.f9748D0.setColorFilter(m30029o1());
        this.f9751G0.set(rect);
        canvas.drawRoundRect(this.f9751G0, m30099L0(), m30099L0(), this.f9748D0);
    }

    /* renamed from: B0 */
    private void m30129B0(Canvas canvas, Rect rect) {
        if (m30082Q2()) {
            m30030o0(rect, this.f9751G0);
            RectF rectF = this.f9751G0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f9784e0.setBounds(0, 0, (int) this.f9751G0.width(), (int) this.f9751G0.height());
            this.f9784e0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: C0 */
    private void m30126C0(Canvas canvas, Rect rect) {
        if (this.f9776a0 <= 0.0f || this.f9785e1) {
            return;
        }
        this.f9748D0.setColor(this.f9758N0);
        this.f9748D0.setStyle(Paint.Style.STROKE);
        if (!this.f9785e1) {
            this.f9748D0.setColorFilter(m30029o1());
        }
        RectF rectF = this.f9751G0;
        float f = this.f9776a0;
        rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
        float f2 = this.f9772Y - (this.f9776a0 / 2.0f);
        canvas.drawRoundRect(this.f9751G0, f2, f2, this.f9748D0);
    }

    /* renamed from: D0 */
    private void m30123D0(Canvas canvas, Rect rect) {
        if (this.f9785e1) {
            return;
        }
        this.f9748D0.setColor(this.f9755K0);
        this.f9748D0.setStyle(Paint.Style.FILL);
        this.f9751G0.set(rect);
        canvas.drawRoundRect(this.f9751G0, m30099L0(), m30099L0(), this.f9748D0);
    }

    /* renamed from: E0 */
    private void m30120E0(Canvas canvas, Rect rect) {
        if (m30079R2()) {
            m30021r0(rect, this.f9751G0);
            RectF rectF = this.f9751G0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f9790j0.setBounds(0, 0, (int) this.f9751G0.width(), (int) this.f9751G0.height());
            if (C10399b.f27024a) {
                this.f9791k0.setBounds(this.f9790j0.getBounds());
                this.f9791k0.jumpToCurrentState();
                this.f9791k0.draw(canvas);
            } else {
                this.f9790j0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: F0 */
    private void m30117F0(Canvas canvas, Rect rect) {
        this.f9748D0.setColor(this.f9759O0);
        this.f9748D0.setStyle(Paint.Style.FILL);
        this.f9751G0.set(rect);
        if (!this.f9785e1) {
            canvas.drawRoundRect(this.f9751G0, m30099L0(), m30099L0(), this.f9748D0);
            return;
        }
        m5990h(new RectF(rect), this.f9753I0);
        super.m5976p(canvas, this.f9748D0, this.f9753I0, m5971u());
    }

    /* renamed from: G0 */
    private void m30114G0(Canvas canvas, Rect rect) {
        Paint paint = this.f9749E0;
        if (paint != null) {
            paint.setColor(C0969a.m38939j(-16777216, 127));
            canvas.drawRect(rect, this.f9749E0);
            if (m30082Q2() || m30085P2()) {
                m30030o0(rect, this.f9751G0);
                canvas.drawRect(this.f9751G0, this.f9749E0);
            }
            if (this.f9780c0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f9749E0);
            }
            if (m30079R2()) {
                m30021r0(rect, this.f9751G0);
                canvas.drawRect(this.f9751G0, this.f9749E0);
            }
            this.f9749E0.setColor(C0969a.m38939j(-65536, 127));
            m30024q0(rect, this.f9751G0);
            canvas.drawRect(this.f9751G0, this.f9749E0);
            this.f9749E0.setColor(C0969a.m38939j(-16711936, 127));
            m30018s0(rect, this.f9751G0);
            canvas.drawRect(this.f9751G0, this.f9749E0);
        }
    }

    /* renamed from: H0 */
    private void m30111H0(Canvas canvas, Rect rect) {
        if (this.f9780c0 != null) {
            Paint.Align m30006w0 = m30006w0(rect, this.f9752H0);
            m30012u0(rect, this.f9751G0);
            if (this.f9754J0.m29519d() != null) {
                this.f9754J0.m29518e().drawableState = getState();
                this.f9754J0.m29513j(this.f9747C0);
            }
            this.f9754J0.m29518e().setTextAlign(m30006w0);
            int i = 0;
            boolean z = Math.round(this.f9754J0.m29517f(m30039k1().toString())) > Math.round(this.f9751G0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f9751G0);
            }
            CharSequence charSequence = this.f9780c0;
            if (z && this.f9779b1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f9754J0.m29518e(), this.f9751G0.width(), this.f9779b1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f9752H0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f9754J0.m29518e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: P2 */
    private boolean m30085P2() {
        return this.f9796p0 && this.f9797q0 != null && this.f9761Q0;
    }

    /* renamed from: Q2 */
    private boolean m30082Q2() {
        return this.f9782d0 && this.f9784e0 != null;
    }

    /* renamed from: R2 */
    private boolean m30079R2() {
        return this.f9789i0 && this.f9790j0 != null;
    }

    /* renamed from: S2 */
    private void m30076S2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: T2 */
    private void m30073T2() {
        this.f9775Z0 = this.f9773Y0 ? C10399b.m8071d(this.f9778b0) : null;
    }

    @TargetApi(21)
    /* renamed from: U2 */
    private void m30070U2() {
        this.f9791k0 = new RippleDrawable(C10399b.m8071d(m30043i1()), this.f9790j0, f9744g1);
    }

    /* renamed from: c1 */
    private float m30055c1() {
        Drawable drawable = this.f9761Q0 ? this.f9797q0 : this.f9784e0;
        float f = this.f9787g0;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(C3649p.m29491b(this.f9747C0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: d1 */
    private float m30053d1() {
        Drawable drawable = this.f9761Q0 ? this.f9797q0 : this.f9784e0;
        float f = this.f9787g0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    /* renamed from: e2 */
    private void m30050e2(ColorStateList colorStateList) {
        if (this.f9766V != colorStateList) {
            this.f9766V = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: n0 */
    private void m30033n0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C0981a.m38864m(drawable, C0981a.m38871f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f9790j0) {
            if (drawable.isStateful()) {
                drawable.setState(m30061Z0());
            }
            C0981a.m38862o(drawable, this.f9792l0);
            return;
        }
        Drawable drawable2 = this.f9784e0;
        if (drawable == drawable2 && this.f9788h0) {
            C0981a.m38862o(drawable2, this.f9786f0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: o0 */
    private void m30030o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m30082Q2() || m30085P2()) {
            float f = this.f9801u0 + this.f9802v0;
            float m30053d1 = m30053d1();
            if (C0981a.m38871f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m30053d1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m30053d1;
            }
            float m30055c1 = m30055c1();
            float exactCenterY = rect.exactCenterY() - (m30055c1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m30055c1;
        }
    }

    /* renamed from: o1 */
    private ColorFilter m30029o1() {
        ColorFilter colorFilter = this.f9764T0;
        return colorFilter != null ? colorFilter : this.f9765U0;
    }

    /* renamed from: q0 */
    private void m30024q0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m30079R2()) {
            float f = this.f9746B0 + this.f9745A0 + this.f9793m0 + this.f9806z0 + this.f9805y0;
            if (C0981a.m38871f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: q1 */
    private static boolean m30023q1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r0 */
    private void m30021r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m30079R2()) {
            float f = this.f9746B0 + this.f9745A0;
            if (C0981a.m38871f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f9793m0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f9793m0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f9793m0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: s0 */
    private void m30018s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m30079R2()) {
            float f = this.f9746B0 + this.f9745A0 + this.f9793m0 + this.f9806z0 + this.f9805y0;
            if (C0981a.m38871f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: u0 */
    private void m30012u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f9780c0 != null) {
            float m30027p0 = this.f9801u0 + m30027p0() + this.f9804x0;
            float m30015t0 = this.f9746B0 + m30015t0() + this.f9805y0;
            if (C0981a.m38871f(this) == 0) {
                rectF.left = rect.left + m30027p0;
                rectF.right = rect.right - m30015t0;
            } else {
                rectF.left = rect.left + m30015t0;
                rectF.right = rect.right - m30027p0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: u1 */
    private static boolean m30011u1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: v0 */
    private float m30009v0() {
        this.f9754J0.m29518e().getFontMetrics(this.f9750F0);
        Paint.FontMetrics fontMetrics = this.f9750F0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: v1 */
    private static boolean m30008v1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: w1 */
    private static boolean m30005w1(C10087d c10087d) {
        return (c10087d == null || c10087d.m9211i() == null || !c10087d.m9211i().isStateful()) ? false : true;
    }

    /* renamed from: x0 */
    private boolean m30003x0() {
        return this.f9796p0 && this.f9797q0 != null && this.f9795o0;
    }

    /* renamed from: x1 */
    private void m30002x1(AttributeSet attributeSet, int i, int i2) {
        TypedArray m29500h = C3646n.m29500h(this.f9747C0, attributeSet, C5429l.f15190k0, i, i2, new int[0]);
        this.f9785e1 = m29500h.hasValue(C5429l.f15068W0);
        m30050e2(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f14964J0));
        m30107I1(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f15286w0));
        m30066W1(m29500h.getDimension(C5429l.f14924E0, 0.0f));
        int i3 = C5429l.f15294x0;
        if (m29500h.hasValue(i3)) {
            m30101K1(m29500h.getDimension(i3, 0.0f));
        }
        m30058a2(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f14948H0));
        m30054c2(m29500h.getDimension(C5429l.f14956I0, 0.0f));
        m30127B2(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f15060V0));
        m30112G2(m29500h.getText(C5429l.f15238q0));
        C10087d m9223g = C10086c.m9223g(this.f9747C0, m29500h, C5429l.f15198l0);
        m9223g.m9208l(m29500h.getDimension(C5429l.f15206m0, m9223g.m9210j()));
        if (Build.VERSION.SDK_INT < 23) {
            m9223g.m9209k(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f15214n0));
        }
        m30109H2(m9223g);
        int i4 = m29500h.getInt(C5429l.f15222o0, 0);
        if (i4 == 1) {
            m30013t2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            m30013t2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            m30013t2(TextUtils.TruncateAt.END);
        }
        m30068V1(m29500h.getBoolean(C5429l.f14916D0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m30068V1(m29500h.getBoolean(C5429l.f14892A0, false));
        }
        m30089O1(C10086c.m9225e(this.f9747C0, m29500h, C5429l.f15310z0));
        int i5 = C5429l.f14908C0;
        if (m29500h.hasValue(i5)) {
            m30077S1(C10086c.m9229a(this.f9747C0, m29500h, i5));
        }
        m30083Q1(m29500h.getDimension(C5429l.f14900B0, -1.0f));
        m30019r2(m29500h.getBoolean(C5429l.f15020Q0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m30019r2(m29500h.getBoolean(C5429l.f14980L0, false));
        }
        m30048f2(C10086c.m9225e(this.f9747C0, m29500h, C5429l.f14972K0));
        m30025p2(C10086c.m9229a(this.f9747C0, m29500h, C5429l.f15012P0));
        m30038k2(m29500h.getDimension(C5429l.f14996N0, 0.0f));
        m30131A1(m29500h.getBoolean(C5429l.f15246r0, false));
        m30110H1(m29500h.getBoolean(C5429l.f15278v0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m30110H1(m29500h.getBoolean(C5429l.f15262t0, false));
        }
        m30125C1(C10086c.m9225e(this.f9747C0, m29500h, C5429l.f15254s0));
        int i6 = C5429l.f15270u0;
        if (m29500h.hasValue(i6)) {
            m30119E1(C10086c.m9229a(this.f9747C0, m29500h, i6));
        }
        m30118E2(C5623h.m23550c(this.f9747C0, m29500h, C5429l.f15076X0));
        m30010u2(C5623h.m23550c(this.f9747C0, m29500h, C5429l.f15036S0));
        m30062Y1(m29500h.getDimension(C5429l.f14940G0, 0.0f));
        m29998y2(m29500h.getDimension(C5429l.f15052U0, 0.0f));
        m30004w2(m29500h.getDimension(C5429l.f15044T0, 0.0f));
        m30097L2(m29500h.getDimension(C5429l.f15092Z0, 0.0f));
        m30103J2(m29500h.getDimension(C5429l.f15084Y0, 0.0f));
        m30034m2(m29500h.getDimension(C5429l.f15004O0, 0.0f));
        m30044h2(m29500h.getDimension(C5429l.f14988M0, 0.0f));
        m30095M1(m29500h.getDimension(C5429l.f15302y0, 0.0f));
        m30130A2(m29500h.getDimensionPixelSize(C5429l.f15230p0, Reader.READ_DONE));
        m29500h.recycle();
    }

    /* renamed from: y0 */
    public static C3533a m30000y0(Context context, AttributeSet attributeSet, int i, int i2) {
        C3533a c3533a = new C3533a(context, attributeSet, i, i2);
        c3533a.m30002x1(attributeSet, i, i2);
        return c3533a;
    }

    /* renamed from: z0 */
    private void m29997z0(Canvas canvas, Rect rect) {
        if (m30085P2()) {
            m30030o0(rect, this.f9751G0);
            RectF rectF = this.f9751G0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f9797q0.setBounds(0, 0, (int) this.f9751G0.width(), (int) this.f9751G0.height());
            this.f9797q0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: z1 */
    private boolean m29996z1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f9766V;
        int m5982l = m5982l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f9755K0) : 0);
        boolean z2 = true;
        if (this.f9755K0 != m5982l) {
            this.f9755K0 = m5982l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f9768W;
        int m5982l2 = m5982l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f9756L0) : 0);
        if (this.f9756L0 != m5982l2) {
            this.f9756L0 = m5982l2;
            onStateChange = true;
        }
        int m20501g = C6608a.m20501g(m5982l, m5982l2);
        if ((this.f9757M0 != m20501g) | (m5968x() == null)) {
            this.f9757M0 = m20501g;
            m6004Z(ColorStateList.valueOf(m20501g));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f9774Z;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f9758N0) : 0;
        if (this.f9758N0 != colorForState) {
            this.f9758N0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f9775Z0 == null || !C10399b.m8070e(iArr)) ? 0 : this.f9775Z0.getColorForState(iArr, this.f9759O0);
        if (this.f9759O0 != colorForState2) {
            this.f9759O0 = colorForState2;
            if (this.f9773Y0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f9754J0.m29519d() == null || this.f9754J0.m29519d().m9211i() == null) ? 0 : this.f9754J0.m29519d().m9211i().getColorForState(iArr, this.f9760P0);
        if (this.f9760P0 != colorForState3) {
            this.f9760P0 = colorForState3;
            onStateChange = true;
        }
        boolean z3 = m30023q1(getState(), 16842912) && this.f9795o0;
        if (this.f9761Q0 == z3 || this.f9797q0 == null) {
            z = false;
        } else {
            float m30027p0 = m30027p0();
            this.f9761Q0 = z3;
            if (m30027p0 != m30027p0()) {
                onStateChange = true;
                z = true;
            } else {
                z = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f9767V0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f9762R0) : 0;
        if (this.f9762R0 != colorForState4) {
            this.f9762R0 = colorForState4;
            this.f9765U0 = C7145a.m19088b(this, this.f9767V0, this.f9769W0);
        } else {
            z2 = onStateChange;
        }
        if (m30008v1(this.f9784e0)) {
            z2 |= this.f9784e0.setState(iArr);
        }
        if (m30008v1(this.f9797q0)) {
            z2 |= this.f9797q0.setState(iArr);
        }
        if (m30008v1(this.f9790j0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z2 |= this.f9790j0.setState(iArr3);
        }
        if (C10399b.f27024a && m30008v1(this.f9791k0)) {
            z2 |= this.f9791k0.setState(iArr2);
        }
        if (z2) {
            invalidateSelf();
        }
        if (z) {
            m29999y1();
        }
        return z2;
    }

    /* renamed from: A1 */
    public void m30131A1(boolean z) {
        if (this.f9795o0 != z) {
            this.f9795o0 = z;
            float m30027p0 = m30027p0();
            if (!z && this.f9761Q0) {
                this.f9761Q0 = false;
            }
            float m30027p02 = m30027p0();
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* renamed from: A2 */
    public void m30130A2(int i) {
        this.f9783d1 = i;
    }

    /* renamed from: B1 */
    public void m30128B1(int i) {
        m30131A1(this.f9747C0.getResources().getBoolean(i));
    }

    /* renamed from: B2 */
    public void m30127B2(ColorStateList colorStateList) {
        if (this.f9778b0 != colorStateList) {
            this.f9778b0 = colorStateList;
            m30073T2();
            onStateChange(getState());
        }
    }

    /* renamed from: C1 */
    public void m30125C1(Drawable drawable) {
        if (this.f9797q0 != drawable) {
            float m30027p0 = m30027p0();
            this.f9797q0 = drawable;
            float m30027p02 = m30027p0();
            m30076S2(this.f9797q0);
            m30033n0(this.f9797q0);
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* renamed from: C2 */
    public void m30124C2(int i) {
        m30127B2(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: D1 */
    public void m30122D1(int i) {
        m30125C1(C5586a.m23699b(this.f9747C0, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D2 */
    public void m30121D2(boolean z) {
        this.f9781c1 = z;
    }

    /* renamed from: E1 */
    public void m30119E1(ColorStateList colorStateList) {
        if (this.f9798r0 != colorStateList) {
            this.f9798r0 = colorStateList;
            if (m30003x0()) {
                C0981a.m38862o(this.f9797q0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: E2 */
    public void m30118E2(C5623h c5623h) {
        this.f9799s0 = c5623h;
    }

    /* renamed from: F1 */
    public void m30116F1(int i) {
        m30119E1(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: F2 */
    public void m30115F2(int i) {
        m30118E2(C5623h.m23549d(this.f9747C0, i));
    }

    /* renamed from: G1 */
    public void m30113G1(int i) {
        m30110H1(this.f9747C0.getResources().getBoolean(i));
    }

    /* renamed from: G2 */
    public void m30112G2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        if (TextUtils.equals(this.f9780c0, charSequence)) {
            return;
        }
        this.f9780c0 = charSequence;
        this.f9754J0.m29514i(true);
        invalidateSelf();
        m29999y1();
    }

    /* renamed from: H1 */
    public void m30110H1(boolean z) {
        if (this.f9796p0 != z) {
            boolean m30085P2 = m30085P2();
            this.f9796p0 = z;
            boolean m30085P22 = m30085P2();
            if (m30085P2 != m30085P22) {
                if (m30085P22) {
                    m30033n0(this.f9797q0);
                } else {
                    m30076S2(this.f9797q0);
                }
                invalidateSelf();
                m29999y1();
            }
        }
    }

    /* renamed from: H2 */
    public void m30109H2(C10087d c10087d) {
        this.f9754J0.m29515h(c10087d, this.f9747C0);
    }

    /* renamed from: I0 */
    public Drawable m30108I0() {
        return this.f9797q0;
    }

    /* renamed from: I1 */
    public void m30107I1(ColorStateList colorStateList) {
        if (this.f9768W != colorStateList) {
            this.f9768W = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: I2 */
    public void m30106I2(int i) {
        m30109H2(new C10087d(this.f9747C0, i));
    }

    /* renamed from: J0 */
    public ColorStateList m30105J0() {
        return this.f9798r0;
    }

    /* renamed from: J1 */
    public void m30104J1(int i) {
        m30107I1(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: J2 */
    public void m30103J2(float f) {
        if (this.f9805y0 != f) {
            this.f9805y0 = f;
            invalidateSelf();
            m29999y1();
        }
    }

    /* renamed from: K0 */
    public ColorStateList m30102K0() {
        return this.f9768W;
    }

    @Deprecated
    /* renamed from: K1 */
    public void m30101K1(float f) {
        if (this.f9772Y != f) {
            this.f9772Y = f;
            setShapeAppearanceModel(m6025E().m5935w(f));
        }
    }

    /* renamed from: K2 */
    public void m30100K2(int i) {
        m30103J2(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public float m30099L0() {
        return this.f9785e1 ? m6022H() : this.f9772Y;
    }

    @Deprecated
    /* renamed from: L1 */
    public void m30098L1(int i) {
        m30101K1(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: L2 */
    public void m30097L2(float f) {
        if (this.f9804x0 != f) {
            this.f9804x0 = f;
            invalidateSelf();
            m29999y1();
        }
    }

    /* renamed from: M0 */
    public float m30096M0() {
        return this.f9746B0;
    }

    /* renamed from: M1 */
    public void m30095M1(float f) {
        if (this.f9746B0 != f) {
            this.f9746B0 = f;
            invalidateSelf();
            m29999y1();
        }
    }

    /* renamed from: M2 */
    public void m30094M2(int i) {
        m30097L2(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: N0 */
    public Drawable m30093N0() {
        Drawable drawable = this.f9784e0;
        if (drawable != null) {
            return C0981a.m38860q(drawable);
        }
        return null;
    }

    /* renamed from: N1 */
    public void m30092N1(int i) {
        m30095M1(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: N2 */
    public void m30091N2(boolean z) {
        if (this.f9773Y0 != z) {
            this.f9773Y0 = z;
            m30073T2();
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float m30090O0() {
        return this.f9787g0;
    }

    /* renamed from: O1 */
    public void m30089O1(Drawable drawable) {
        Drawable m30093N0 = m30093N0();
        if (m30093N0 != drawable) {
            float m30027p0 = m30027p0();
            this.f9784e0 = drawable != null ? C0981a.m38859r(drawable).mutate() : null;
            float m30027p02 = m30027p0();
            m30076S2(m30093N0);
            if (m30082Q2()) {
                m30033n0(this.f9784e0);
            }
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O2 */
    public boolean m30088O2() {
        return this.f9781c1;
    }

    /* renamed from: P0 */
    public ColorStateList m30087P0() {
        return this.f9786f0;
    }

    /* renamed from: P1 */
    public void m30086P1(int i) {
        m30089O1(C5586a.m23699b(this.f9747C0, i));
    }

    /* renamed from: Q0 */
    public float m30084Q0() {
        return this.f9770X;
    }

    /* renamed from: Q1 */
    public void m30083Q1(float f) {
        if (this.f9787g0 != f) {
            float m30027p0 = m30027p0();
            this.f9787g0 = f;
            float m30027p02 = m30027p0();
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* renamed from: R0 */
    public float m30081R0() {
        return this.f9801u0;
    }

    /* renamed from: R1 */
    public void m30080R1(int i) {
        m30083Q1(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: S0 */
    public ColorStateList m30078S0() {
        return this.f9774Z;
    }

    /* renamed from: S1 */
    public void m30077S1(ColorStateList colorStateList) {
        this.f9788h0 = true;
        if (this.f9786f0 != colorStateList) {
            this.f9786f0 = colorStateList;
            if (m30082Q2()) {
                C0981a.m38862o(this.f9784e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: T0 */
    public float m30075T0() {
        return this.f9776a0;
    }

    /* renamed from: T1 */
    public void m30074T1(int i) {
        m30077S1(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: U0 */
    public Drawable m30072U0() {
        Drawable drawable = this.f9790j0;
        if (drawable != null) {
            return C0981a.m38860q(drawable);
        }
        return null;
    }

    /* renamed from: U1 */
    public void m30071U1(int i) {
        m30068V1(this.f9747C0.getResources().getBoolean(i));
    }

    /* renamed from: V0 */
    public CharSequence m30069V0() {
        return this.f9794n0;
    }

    /* renamed from: V1 */
    public void m30068V1(boolean z) {
        if (this.f9782d0 != z) {
            boolean m30082Q2 = m30082Q2();
            this.f9782d0 = z;
            boolean m30082Q22 = m30082Q2();
            if (m30082Q2 != m30082Q22) {
                if (m30082Q22) {
                    m30033n0(this.f9784e0);
                } else {
                    m30076S2(this.f9784e0);
                }
                invalidateSelf();
                m29999y1();
            }
        }
    }

    /* renamed from: W0 */
    public float m30067W0() {
        return this.f9745A0;
    }

    /* renamed from: W1 */
    public void m30066W1(float f) {
        if (this.f9770X != f) {
            this.f9770X = f;
            invalidateSelf();
            m29999y1();
        }
    }

    /* renamed from: X0 */
    public float m30065X0() {
        return this.f9793m0;
    }

    /* renamed from: X1 */
    public void m30064X1(int i) {
        m30066W1(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: Y0 */
    public float m30063Y0() {
        return this.f9806z0;
    }

    /* renamed from: Y1 */
    public void m30062Y1(float f) {
        if (this.f9801u0 != f) {
            this.f9801u0 = f;
            invalidateSelf();
            m29999y1();
        }
    }

    /* renamed from: Z0 */
    public int[] m30061Z0() {
        return this.f9771X0;
    }

    /* renamed from: Z1 */
    public void m30060Z1(int i) {
        m30062Y1(this.f9747C0.getResources().getDimension(i));
    }

    @Override // com.google.android.material.internal.C3640k.InterfaceC3642b
    /* renamed from: a */
    public void mo29512a() {
        m29999y1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public ColorStateList m30059a1() {
        return this.f9792l0;
    }

    /* renamed from: a2 */
    public void m30058a2(ColorStateList colorStateList) {
        if (this.f9774Z != colorStateList) {
            this.f9774Z = colorStateList;
            if (this.f9785e1) {
                m5987i0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b1 */
    public void m30057b1(RectF rectF) {
        m30018s0(getBounds(), rectF);
    }

    /* renamed from: b2 */
    public void m30056b2(int i) {
        m30058a2(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: c2 */
    public void m30054c2(float f) {
        if (this.f9776a0 != f) {
            this.f9776a0 = f;
            this.f9748D0.setStrokeWidth(f);
            if (this.f9785e1) {
                super.m5985j0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: d2 */
    public void m30052d2(int i) {
        m30054c2(this.f9747C0.getResources().getDimension(i));
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.f9763S0;
        int m22831a = i < 255 ? C5878a.m22831a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        m30123D0(canvas, bounds);
        m30132A0(canvas, bounds);
        if (this.f9785e1) {
            super.draw(canvas);
        }
        m30126C0(canvas, bounds);
        m30117F0(canvas, bounds);
        m30129B0(canvas, bounds);
        m29997z0(canvas, bounds);
        if (this.f9781c1) {
            m30111H0(canvas, bounds);
        }
        m30120E0(canvas, bounds);
        m30114G0(canvas, bounds);
        if (this.f9763S0 < 255) {
            canvas.restoreToCount(m22831a);
        }
    }

    /* renamed from: e1 */
    public TextUtils.TruncateAt m30051e1() {
        return this.f9779b1;
    }

    /* renamed from: f1 */
    public C5623h m30049f1() {
        return this.f9800t0;
    }

    /* renamed from: f2 */
    public void m30048f2(Drawable drawable) {
        Drawable m30072U0 = m30072U0();
        if (m30072U0 != drawable) {
            float m30015t0 = m30015t0();
            this.f9790j0 = drawable != null ? C0981a.m38859r(drawable).mutate() : null;
            if (C10399b.f27024a) {
                m30070U2();
            }
            float m30015t02 = m30015t0();
            m30076S2(m30072U0);
            if (m30079R2()) {
                m30033n0(this.f9790j0);
            }
            invalidateSelf();
            if (m30015t0 != m30015t02) {
                m29999y1();
            }
        }
    }

    /* renamed from: g1 */
    public float m30047g1() {
        return this.f9803w0;
    }

    /* renamed from: g2 */
    public void m30046g2(CharSequence charSequence) {
        if (this.f9794n0 != charSequence) {
            this.f9794n0 = C1047a.m38687c().m38682h(charSequence);
            invalidateSelf();
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9763S0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f9764T0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f9770X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f9801u0 + m30027p0() + this.f9804x0 + this.f9754J0.m29517f(m30039k1().toString()) + this.f9805y0 + m30015t0() + this.f9746B0), this.f9783d1);
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f9785e1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f9772Y);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f9772Y);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public float m30045h1() {
        return this.f9802v0;
    }

    /* renamed from: h2 */
    public void m30044h2(float f) {
        if (this.f9745A0 != f) {
            this.f9745A0 = f;
            invalidateSelf();
            if (m30079R2()) {
                m29999y1();
            }
        }
    }

    /* renamed from: i1 */
    public ColorStateList m30043i1() {
        return this.f9778b0;
    }

    /* renamed from: i2 */
    public void m30042i2(int i) {
        m30044h2(this.f9747C0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return m30011u1(this.f9766V) || m30011u1(this.f9768W) || m30011u1(this.f9774Z) || (this.f9773Y0 && m30011u1(this.f9775Z0)) || m30005w1(this.f9754J0.m29519d()) || m30003x0() || m30008v1(this.f9784e0) || m30008v1(this.f9797q0) || m30011u1(this.f9767V0);
    }

    /* renamed from: j1 */
    public C5623h m30041j1() {
        return this.f9799s0;
    }

    /* renamed from: j2 */
    public void m30040j2(int i) {
        m30048f2(C5586a.m23699b(this.f9747C0, i));
    }

    /* renamed from: k1 */
    public CharSequence m30039k1() {
        return this.f9780c0;
    }

    /* renamed from: k2 */
    public void m30038k2(float f) {
        if (this.f9793m0 != f) {
            this.f9793m0 = f;
            invalidateSelf();
            if (m30079R2()) {
                m29999y1();
            }
        }
    }

    /* renamed from: l1 */
    public C10087d m30037l1() {
        return this.f9754J0.m29519d();
    }

    /* renamed from: l2 */
    public void m30036l2(int i) {
        m30038k2(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: m1 */
    public float m30035m1() {
        return this.f9805y0;
    }

    /* renamed from: m2 */
    public void m30034m2(float f) {
        if (this.f9806z0 != f) {
            this.f9806z0 = f;
            invalidateSelf();
            if (m30079R2()) {
                m29999y1();
            }
        }
    }

    /* renamed from: n1 */
    public float m30032n1() {
        return this.f9804x0;
    }

    /* renamed from: n2 */
    public void m30031n2(int i) {
        m30034m2(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: o2 */
    public boolean m30028o2(int[] iArr) {
        if (Arrays.equals(this.f9771X0, iArr)) {
            return false;
        }
        this.f9771X0 = iArr;
        if (m30079R2()) {
            return m29996z1(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m30082Q2()) {
            onLayoutDirectionChanged |= C0981a.m38864m(this.f9784e0, i);
        }
        if (m30085P2()) {
            onLayoutDirectionChanged |= C0981a.m38864m(this.f9797q0, i);
        }
        if (m30079R2()) {
            onLayoutDirectionChanged |= C0981a.m38864m(this.f9790j0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m30082Q2()) {
            onLevelChange |= this.f9784e0.setLevel(i);
        }
        if (m30085P2()) {
            onLevelChange |= this.f9797q0.setLevel(i);
        }
        if (m30079R2()) {
            onLevelChange |= this.f9790j0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable, com.google.android.material.internal.C3640k.InterfaceC3642b
    public boolean onStateChange(int[] iArr) {
        if (this.f9785e1) {
            super.onStateChange(iArr);
        }
        return m29996z1(iArr, m30061Z0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public float m30027p0() {
        if (m30082Q2() || m30085P2()) {
            return this.f9802v0 + m30053d1() + this.f9803w0;
        }
        return 0.0f;
    }

    /* renamed from: p1 */
    public boolean m30026p1() {
        return this.f9773Y0;
    }

    /* renamed from: p2 */
    public void m30025p2(ColorStateList colorStateList) {
        if (this.f9792l0 != colorStateList) {
            this.f9792l0 = colorStateList;
            if (m30079R2()) {
                C0981a.m38862o(this.f9790j0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: q2 */
    public void m30022q2(int i) {
        m30025p2(C5586a.m23700a(this.f9747C0, i));
    }

    /* renamed from: r1 */
    public boolean m30020r1() {
        return this.f9795o0;
    }

    /* renamed from: r2 */
    public void m30019r2(boolean z) {
        if (this.f9789i0 != z) {
            boolean m30079R2 = m30079R2();
            this.f9789i0 = z;
            boolean m30079R22 = m30079R2();
            if (m30079R2 != m30079R22) {
                if (m30079R22) {
                    m30033n0(this.f9790j0);
                } else {
                    m30076S2(this.f9790j0);
                }
                invalidateSelf();
                m29999y1();
            }
        }
    }

    /* renamed from: s1 */
    public boolean m30017s1() {
        return m30008v1(this.f9790j0);
    }

    /* renamed from: s2 */
    public void m30016s2(InterfaceC3534a interfaceC3534a) {
        this.f9777a1 = new WeakReference<>(interfaceC3534a);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f9763S0 != i) {
            this.f9763S0 = i;
            invalidateSelf();
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f9764T0 != colorFilter) {
            this.f9764T0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        if (this.f9767V0 != colorStateList) {
            this.f9767V0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p401v8.C11141g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f9769W0 != mode) {
            this.f9769W0 = mode;
            this.f9765U0 = C7145a.m19088b(this, this.f9767V0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m30082Q2()) {
            visible |= this.f9784e0.setVisible(z, z2);
        }
        if (m30085P2()) {
            visible |= this.f9797q0.setVisible(z, z2);
        }
        if (m30079R2()) {
            visible |= this.f9790j0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public float m30015t0() {
        if (m30079R2()) {
            return this.f9806z0 + this.f9793m0 + this.f9745A0;
        }
        return 0.0f;
    }

    /* renamed from: t1 */
    public boolean m30014t1() {
        return this.f9789i0;
    }

    /* renamed from: t2 */
    public void m30013t2(TextUtils.TruncateAt truncateAt) {
        this.f9779b1 = truncateAt;
    }

    /* renamed from: u2 */
    public void m30010u2(C5623h c5623h) {
        this.f9800t0 = c5623h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void m30007v2(int i) {
        m30010u2(C5623h.m23549d(this.f9747C0, i));
    }

    /* renamed from: w0 */
    Paint.Align m30006w0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f9780c0 != null) {
            float m30027p0 = this.f9801u0 + m30027p0() + this.f9804x0;
            if (C0981a.m38871f(this) == 0) {
                pointF.x = rect.left + m30027p0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m30027p0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m30009v0();
        }
        return align;
    }

    /* renamed from: w2 */
    public void m30004w2(float f) {
        if (this.f9803w0 != f) {
            float m30027p0 = m30027p0();
            this.f9803w0 = f;
            float m30027p02 = m30027p0();
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* renamed from: x2 */
    public void m30001x2(int i) {
        m30004w2(this.f9747C0.getResources().getDimension(i));
    }

    /* renamed from: y1 */
    protected void m29999y1() {
        InterfaceC3534a interfaceC3534a = this.f9777a1.get();
        if (interfaceC3534a != null) {
            interfaceC3534a.mo29994a();
        }
    }

    /* renamed from: y2 */
    public void m29998y2(float f) {
        if (this.f9802v0 != f) {
            float m30027p0 = m30027p0();
            this.f9802v0 = f;
            float m30027p02 = m30027p0();
            invalidateSelf();
            if (m30027p0 != m30027p02) {
                m29999y1();
            }
        }
    }

    /* renamed from: z2 */
    public void m29995z2(int i) {
        m29998y2(this.f9747C0.getResources().getDimension(i));
    }
}
