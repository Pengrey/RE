package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
/* loaded from: classes.dex */
class C0624f extends Drawable {

    /* renamed from: a */
    private float f1933a;

    /* renamed from: c */
    private final RectF f1935c;

    /* renamed from: d */
    private final Rect f1936d;

    /* renamed from: e */
    private float f1937e;

    /* renamed from: h */
    private ColorStateList f1940h;

    /* renamed from: i */
    private PorterDuffColorFilter f1941i;

    /* renamed from: j */
    private ColorStateList f1942j;

    /* renamed from: f */
    private boolean f1938f = false;

    /* renamed from: g */
    private boolean f1939g = true;

    /* renamed from: k */
    private PorterDuff.Mode f1943k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f1934b = new Paint(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0624f(ColorStateList colorStateList, float f) {
        this.f1933a = f;
        m40065e(colorStateList);
        this.f1935c = new RectF();
        this.f1936d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m40069a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m40065e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1940h = colorStateList;
        this.f1934b.setColor(colorStateList.getColorForState(getState(), this.f1940h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m40061i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1935c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1936d.set(rect);
        if (this.f1938f) {
            float m40057d = C0625g.m40057d(this.f1937e, this.f1933a, this.f1939g);
            this.f1936d.inset((int) Math.ceil(C0625g.m40058c(this.f1937e, this.f1933a, this.f1939g)), (int) Math.ceil(m40057d));
            this.f1935c.set(this.f1936d);
        }
    }

    /* renamed from: b */
    public ColorStateList m40068b() {
        return this.f1940h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m40067c() {
        return this.f1937e;
    }

    /* renamed from: d */
    public float m40066d() {
        return this.f1933a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1934b;
        if (this.f1941i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1941i);
            z = true;
        }
        RectF rectF = this.f1935c;
        float f = this.f1933a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m40064f(ColorStateList colorStateList) {
        m40065e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40063g(float f, boolean z, boolean z2) {
        if (f == this.f1937e && this.f1938f == z && this.f1939g == z2) {
            return;
        }
        this.f1937e = f;
        this.f1938f = z;
        this.f1939g = z2;
        m40061i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1936d, this.f1933a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40062h(float f) {
        if (f == this.f1933a) {
            return;
        }
        this.f1933a = f;
        m40061i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1942j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1940h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m40061i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1940h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1934b.getColor();
        if (z) {
            this.f1934b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1942j;
        if (colorStateList2 == null || (mode = this.f1943k) == null) {
            return z;
        }
        this.f1941i = m40069a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1934b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1934b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1942j = colorStateList;
        this.f1941i = m40069a(colorStateList, this.f1943k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1943k = mode;
        this.f1941i = m40069a(this.f1942j, mode);
        invalidateSelf();
    }
}
