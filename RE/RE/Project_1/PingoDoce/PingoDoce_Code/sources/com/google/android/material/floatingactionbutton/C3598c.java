package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.C0969a;
import p401v8.C11148k;
import p401v8.C11152l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes.dex */
public class C3598c extends Drawable {

    /* renamed from: b */
    private final Paint f10006b;

    /* renamed from: h */
    float f10012h;

    /* renamed from: i */
    private int f10013i;

    /* renamed from: j */
    private int f10014j;

    /* renamed from: k */
    private int f10015k;

    /* renamed from: l */
    private int f10016l;

    /* renamed from: m */
    private int f10017m;

    /* renamed from: o */
    private C11148k f10019o;

    /* renamed from: p */
    private ColorStateList f10020p;

    /* renamed from: a */
    private final C11152l f10005a = C11152l.m5889k();

    /* renamed from: c */
    private final Path f10007c = new Path();

    /* renamed from: d */
    private final Rect f10008d = new Rect();

    /* renamed from: e */
    private final RectF f10009e = new RectF();

    /* renamed from: f */
    private final RectF f10010f = new RectF();

    /* renamed from: g */
    private final C3600b f10011g = new C3600b();

    /* renamed from: n */
    private boolean f10018n = true;

    /* compiled from: BorderDrawable.java */
    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    /* loaded from: classes.dex */
    private class C3600b extends Drawable.ConstantState {
        private C3600b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return C3598c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3598c(C11148k c11148k) {
        this.f10019o = c11148k;
        Paint paint = new Paint(1);
        this.f10006b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m29752a() {
        Rect rect = this.f10008d;
        copyBounds(rect);
        float height = this.f10012h / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{C0969a.m38943f(this.f10013i, this.f10017m), C0969a.m38943f(this.f10014j, this.f10017m), C0969a.m38943f(C0969a.m38939j(this.f10014j, 0), this.f10017m), C0969a.m38943f(C0969a.m38939j(this.f10016l, 0), this.f10017m), C0969a.m38943f(this.f10016l, this.f10017m), C0969a.m38943f(this.f10015k, this.f10017m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    protected RectF m29751b() {
        this.f10010f.set(getBounds());
        return this.f10010f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m29750c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f10017m = colorStateList.getColorForState(getState(), this.f10017m);
        }
        this.f10020p = colorStateList;
        this.f10018n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void m29749d(float f) {
        if (this.f10012h != f) {
            this.f10012h = f;
            this.f10006b.setStrokeWidth(f * 1.3333f);
            this.f10018n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f10018n) {
            this.f10006b.setShader(m29752a());
            this.f10018n = false;
        }
        float strokeWidth = this.f10006b.getStrokeWidth() / 2.0f;
        copyBounds(this.f10008d);
        this.f10009e.set(this.f10008d);
        float min = Math.min(this.f10019o.m5940r().mo5959a(m29751b()), this.f10009e.width() / 2.0f);
        if (this.f10019o.m5937u(m29751b())) {
            this.f10009e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f10009e, min, min, this.f10006b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m29748e(int i, int i2, int i3, int i4) {
        this.f10013i = i;
        this.f10014j = i2;
        this.f10015k = i3;
        this.f10016l = i4;
    }

    /* renamed from: f */
    public void m29747f(C11148k c11148k) {
        this.f10019o = c11148k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f10011g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f10012h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f10019o.m5937u(m29751b())) {
            outline.setRoundRect(getBounds(), this.f10019o.m5940r().mo5959a(m29751b()));
            return;
        }
        copyBounds(this.f10008d);
        this.f10009e.set(this.f10008d);
        this.f10005a.m5896d(this.f10019o, 1.0f, this.f10009e, this.f10007c);
        if (this.f10007c.isConvex()) {
            outline.setConvexPath(this.f10007c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.f10019o.m5937u(m29751b())) {
            int round = Math.round(this.f10012h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f10020p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f10018n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f10020p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f10017m)) != this.f10017m) {
            this.f10018n = true;
            this.f10017m = colorForState;
        }
        if (this.f10018n) {
            invalidateSelf();
        }
        return this.f10018n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f10006b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10006b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
