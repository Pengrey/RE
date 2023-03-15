package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.shimmer.b */
/* loaded from: classes.dex */
public final class C2334b extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f6768a = new C2335a();

    /* renamed from: b */
    private final Paint f6769b;

    /* renamed from: c */
    private final Rect f6770c;

    /* renamed from: d */
    private final Matrix f6771d;

    /* renamed from: e */
    private ValueAnimator f6772e;

    /* renamed from: f */
    private C2330a f6773f;

    /* compiled from: ShimmerDrawable.java */
    /* renamed from: com.facebook.shimmer.b$a */
    /* loaded from: classes.dex */
    class C2335a implements ValueAnimator.AnimatorUpdateListener {
        C2335a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2334b.this.invalidateSelf();
        }
    }

    public C2334b() {
        Paint paint = new Paint();
        this.f6769b = paint;
        this.f6770c = new Rect();
        this.f6771d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: c */
    private float m33893c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: g */
    private void m33889g() {
        C2330a c2330a;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (c2330a = this.f6773f) == null) {
            return;
        }
        int m33922d = c2330a.m33922d(width);
        int m33925a = this.f6773f.m33925a(height);
        C2330a c2330a2 = this.f6773f;
        boolean z = true;
        if (c2330a2.f6752f != 1) {
            int i = c2330a2.f6749c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                m33922d = 0;
            }
            if (!z) {
                m33925a = 0;
            }
            float f = m33925a;
            C2330a c2330a3 = this.f6773f;
            radialGradient = new LinearGradient(0.0f, 0.0f, m33922d, f, c2330a3.f6748b, c2330a3.f6747a, Shader.TileMode.CLAMP);
        } else {
            float f2 = m33925a / 2.0f;
            float max = (float) (Math.max(m33922d, m33925a) / Math.sqrt(2.0d));
            C2330a c2330a4 = this.f6773f;
            radialGradient = new RadialGradient(m33922d / 2.0f, f2, max, c2330a4.f6748b, c2330a4.f6747a, Shader.TileMode.CLAMP);
        }
        this.f6769b.setShader(radialGradient);
    }

    /* renamed from: h */
    private void m33888h() {
        boolean z;
        if (this.f6773f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f6772e;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.f6772e.cancel();
            this.f6772e.removeAllUpdateListeners();
        } else {
            z = false;
        }
        C2330a c2330a = this.f6773f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (c2330a.f6766t / c2330a.f6765s)) + 1.0f);
        this.f6772e = ofFloat;
        ofFloat.setRepeatMode(this.f6773f.f6764r);
        this.f6772e.setRepeatCount(this.f6773f.f6763q);
        ValueAnimator valueAnimator2 = this.f6772e;
        C2330a c2330a2 = this.f6773f;
        valueAnimator2.setDuration(c2330a2.f6765s + c2330a2.f6766t);
        this.f6772e.addUpdateListener(this.f6768a);
        if (z) {
            this.f6772e.start();
        }
    }

    /* renamed from: a */
    public boolean m33895a() {
        ValueAnimator valueAnimator = this.f6772e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m33894b() {
        C2330a c2330a;
        ValueAnimator valueAnimator = this.f6772e;
        if (valueAnimator == null || valueAnimator.isStarted() || (c2330a = this.f6773f) == null || !c2330a.f6761o || getCallback() == null) {
            return;
        }
        this.f6772e.start();
    }

    /* renamed from: d */
    public void m33892d(C2330a c2330a) {
        this.f6773f = c2330a;
        if (c2330a != null) {
            this.f6769b.setXfermode(new PorterDuffXfermode(this.f6773f.f6762p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        m33889g();
        m33888h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float m33893c;
        float m33893c2;
        if (this.f6773f == null || this.f6769b.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.f6773f.f6759m));
        float height = this.f6770c.height() + (this.f6770c.width() * tan);
        float width = this.f6770c.width() + (tan * this.f6770c.height());
        ValueAnimator valueAnimator = this.f6772e;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.f6773f.f6749c;
        if (i != 1) {
            if (i == 2) {
                m33893c2 = m33893c(width, -width, animatedFraction);
            } else if (i != 3) {
                m33893c2 = m33893c(-width, width, animatedFraction);
            } else {
                m33893c = m33893c(height, -height, animatedFraction);
            }
            f = m33893c2;
            m33893c = 0.0f;
        } else {
            m33893c = m33893c(-height, height, animatedFraction);
        }
        this.f6771d.reset();
        this.f6771d.setRotate(this.f6773f.f6759m, this.f6770c.width() / 2.0f, this.f6770c.height() / 2.0f);
        this.f6771d.postTranslate(f, m33893c);
        this.f6769b.getShader().setLocalMatrix(this.f6771d);
        canvas.drawRect(this.f6770c, this.f6769b);
    }

    /* renamed from: e */
    public void m33891e() {
        if (this.f6772e == null || m33895a() || getCallback() == null) {
            return;
        }
        this.f6772e.start();
    }

    /* renamed from: f */
    public void m33890f() {
        if (this.f6772e == null || !m33895a()) {
            return;
        }
        this.f6772e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C2330a c2330a = this.f6773f;
        return (c2330a == null || !(c2330a.f6760n || c2330a.f6762p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6770c.set(0, 0, rect.width(), rect.height());
        m33889g();
        m33894b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
