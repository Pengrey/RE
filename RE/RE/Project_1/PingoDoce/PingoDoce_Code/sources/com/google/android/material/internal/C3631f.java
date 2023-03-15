package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import p070e.C4906j;
import p100f8.C5429l;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public class C3631f extends LinearLayoutCompat {

    /* renamed from: L */
    private Drawable f10190L;

    /* renamed from: M */
    private final Rect f10191M;

    /* renamed from: N */
    private final Rect f10192N;

    /* renamed from: O */
    private int f10193O;

    /* renamed from: P */
    protected boolean f10194P;

    /* renamed from: Q */
    boolean f10195Q;

    public C3631f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f10190L;
        if (drawable != null) {
            if (this.f10195Q) {
                this.f10195Q = false;
                Rect rect = this.f10191M;
                Rect rect2 = this.f10192N;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f10194P) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f10193O, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f10190L;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10190L;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f10190L.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f10190L;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f10193O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10190L;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f10195Q = z | this.f10195Q;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f10195Q = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f10190L;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f10190L);
            }
            this.f10190L = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f10193O == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f10193O != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f10193O = i;
            if (i == 119 && this.f10190L != null) {
                this.f10190L.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10190L;
    }

    public C3631f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10191M = new Rect();
        this.f10192N = new Rect();
        this.f10193O = C4906j.f13385B0;
        this.f10194P = true;
        this.f10195Q = false;
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, C5429l.f15272u2, i, 0, new int[0]);
        this.f10193O = m29500h.getInt(C5429l.f15288w2, this.f10193O);
        Drawable drawable = m29500h.getDrawable(C5429l.f15280v2);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f10194P = m29500h.getBoolean(C5429l.f15296x2, true);
        m29500h.recycle();
    }
}
