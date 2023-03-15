package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C1112b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
public class C1686a extends ImageView {

    /* renamed from: w */
    private Animation.AnimationListener f5110w;

    /* renamed from: x */
    int f5111x;

    /* compiled from: CircleImageView.java */
    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes.dex */
    private class C1687a extends OvalShape {

        /* renamed from: w */
        private RadialGradient f5112w;

        /* renamed from: x */
        private Paint f5113x = new Paint();

        C1687a(int i) {
            C1686a.this.f5111x = i;
            m35736a((int) rect().width());
        }

        /* renamed from: a */
        private void m35736a(int i) {
            float f = i / 2;
            RadialGradient radialGradient = new RadialGradient(f, f, C1686a.this.f5111x, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f5112w = radialGradient;
            this.f5113x.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = C1686a.this.getWidth() / 2;
            float height = C1686a.this.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.f5113x);
            canvas.drawCircle(width2, height, width - C1686a.this.f5111x, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m35736a((int) f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1686a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f5111x = (int) (3.5f * f);
        if (m35738a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1112b0.m38391z0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1687a(this.f5111x));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f5111x, i3, i2, 503316480);
            int i4 = this.f5111x;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C1112b0.m38399v0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m35738a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void m35737b(Animation.AnimationListener animationListener) {
        this.f5110w = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f5110w;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f5110w;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m35738a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f5111x * 2), getMeasuredHeight() + (this.f5111x * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
