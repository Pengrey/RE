package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.C2330a;
import p173j5.C6304a;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: w */
    private final Paint f6744w;

    /* renamed from: x */
    private final C2334b f6745x;

    /* renamed from: y */
    private boolean f6746y;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6744w = new Paint();
        this.f6745x = new C2334b();
        this.f6746y = true;
        m33929a(context, attributeSet);
    }

    /* renamed from: a */
    private void m33929a(Context context, AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.f6745x.setCallback(this);
        if (attributeSet == null) {
            m33928b(new C2330a.C2331a().m33920a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6304a.f17292a, 0, 0);
        try {
            int i = C6304a.f17297f;
            m33928b(((obtainStyledAttributes.hasValue(i) && obtainStyledAttributes.getBoolean(i, false)) ? new C2330a.C2333c() : new C2330a.C2331a()).mo33901c(obtainStyledAttributes).m33920a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public ShimmerFrameLayout m33928b(C2330a c2330a) {
        this.f6745x.m33892d(c2330a);
        if (c2330a != null && c2330a.f6760n) {
            setLayerType(2, this.f6744w);
        } else {
            setLayerType(0, null);
        }
        return this;
    }

    /* renamed from: c */
    public void m33927c() {
        this.f6745x.m33891e();
    }

    /* renamed from: d */
    public void m33926d() {
        this.f6745x.m33890f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6746y) {
            this.f6745x.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6745x.m33894b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m33926d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f6745x.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6745x;
    }
}
