package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p284p.C8329b;
import p284p.C8330c;

/* renamed from: androidx.cardview.widget.g */
/* loaded from: classes.dex */
class C0625g extends Drawable {

    /* renamed from: q */
    private static final double f1944q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static InterfaceC0626a f1945r;

    /* renamed from: a */
    private final int f1946a;

    /* renamed from: c */
    private Paint f1948c;

    /* renamed from: d */
    private Paint f1949d;

    /* renamed from: e */
    private final RectF f1950e;

    /* renamed from: f */
    private float f1951f;

    /* renamed from: g */
    private Path f1952g;

    /* renamed from: h */
    private float f1953h;

    /* renamed from: i */
    private float f1954i;

    /* renamed from: j */
    private float f1955j;

    /* renamed from: k */
    private ColorStateList f1956k;

    /* renamed from: m */
    private final int f1958m;

    /* renamed from: n */
    private final int f1959n;

    /* renamed from: l */
    private boolean f1957l = true;

    /* renamed from: o */
    private boolean f1960o = true;

    /* renamed from: p */
    private boolean f1961p = false;

    /* renamed from: b */
    private Paint f1947b = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* renamed from: androidx.cardview.widget.g$a */
    /* loaded from: classes.dex */
    interface InterfaceC0626a {
        /* renamed from: a */
        void mo40040a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0625g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1958m = resources.getColor(C8329b.cardview_shadow_start_color);
        this.f1959n = resources.getColor(C8329b.cardview_shadow_end_color);
        this.f1946a = resources.getDimensionPixelSize(C8330c.cardview_compat_inset_shadow);
        m40047n(colorStateList);
        Paint paint = new Paint(5);
        this.f1948c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1951f = (int) (f + 0.5f);
        this.f1950e = new RectF();
        Paint paint2 = new Paint(this.f1948c);
        this.f1949d = paint2;
        paint2.setAntiAlias(false);
        m40042s(f2, f3);
    }

    /* renamed from: a */
    private void m40060a(Rect rect) {
        float f = this.f1953h;
        float f2 = 1.5f * f;
        this.f1950e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        m40059b();
    }

    /* renamed from: b */
    private void m40059b() {
        float f = this.f1951f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1954i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1952g;
        if (path == null) {
            this.f1952g = new Path();
        } else {
            path.reset();
        }
        this.f1952g.setFillType(Path.FillType.EVEN_ODD);
        this.f1952g.moveTo(-this.f1951f, 0.0f);
        this.f1952g.rLineTo(-this.f1954i, 0.0f);
        this.f1952g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1952g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1952g.close();
        float f3 = this.f1951f;
        float f4 = f3 / (this.f1954i + f3);
        Paint paint = this.f1948c;
        float f5 = this.f1951f + this.f1954i;
        int i = this.f1958m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f1959n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1949d;
        float f6 = this.f1951f;
        float f7 = this.f1954i;
        int i2 = this.f1958m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f1959n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1949d.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m40058c(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f1944q) * f2)) : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m40057d(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f1944q) * f2)) : f * 1.5f;
    }

    /* renamed from: e */
    private void m40056e(Canvas canvas) {
        float f = this.f1951f;
        float f2 = (-f) - this.f1954i;
        float f3 = f + this.f1946a + (this.f1955j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1950e.width() - f4 > 0.0f;
        boolean z2 = this.f1950e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1950e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1952g, this.f1948c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1950e.width() - f4, -this.f1951f, this.f1949d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1950e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1952g, this.f1948c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1950e.width() - f4, (-this.f1951f) + this.f1954i, this.f1949d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1950e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1952g, this.f1948c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1950e.height() - f4, -this.f1951f, this.f1949d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1950e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1952g, this.f1948c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1950e.height() - f4, -this.f1951f, this.f1949d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m40047n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1956k = colorStateList;
        this.f1947b.setColor(colorStateList.getColorForState(getState(), this.f1956k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m40042s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float m40041t = m40041t(f);
            float m40041t2 = m40041t(f2);
            if (m40041t > m40041t2) {
                if (!this.f1961p) {
                    this.f1961p = true;
                }
                m40041t = m40041t2;
            }
            if (this.f1955j == m40041t && this.f1953h == m40041t2) {
                return;
            }
            this.f1955j = m40041t;
            this.f1953h = m40041t2;
            this.f1954i = (int) ((m40041t * 1.5f) + this.f1946a + 0.5f);
            this.f1957l = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m40041t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1957l) {
            m40060a(getBounds());
            this.f1957l = false;
        }
        canvas.translate(0.0f, this.f1955j / 2.0f);
        m40056e(canvas);
        canvas.translate(0.0f, (-this.f1955j) / 2.0f);
        f1945r.mo40040a(canvas, this.f1950e, this.f1951f, this.f1947b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList m40055f() {
        return this.f1956k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m40054g() {
        return this.f1951f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m40057d(this.f1953h, this.f1951f, this.f1960o));
        int ceil2 = (int) Math.ceil(m40058c(this.f1953h, this.f1951f, this.f1960o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40053h(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m40052i() {
        return this.f1953h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1956k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m40051j() {
        float f = this.f1953h;
        return (Math.max(f, this.f1951f + this.f1946a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1953h * 1.5f) + this.f1946a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public float m40050k() {
        float f = this.f1953h;
        return (Math.max(f, this.f1951f + this.f1946a + (f / 2.0f)) * 2.0f) + ((this.f1953h + this.f1946a) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public float m40049l() {
        return this.f1955j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m40048m(boolean z) {
        this.f1960o = z;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m40046o(ColorStateList colorStateList) {
        m40047n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1957l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1956k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1947b.getColor() == colorForState) {
            return false;
        }
        this.f1947b.setColor(colorForState);
        this.f1957l = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m40045p(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (this.f1951f == f2) {
                return;
            }
            this.f1951f = f2;
            this.f1957l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m40044q(float f) {
        m40042s(this.f1955j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m40043r(float f) {
        m40042s(f, this.f1953h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1947b.setAlpha(i);
        this.f1948c.setAlpha(i);
        this.f1949d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1947b.setColorFilter(colorFilter);
    }
}
