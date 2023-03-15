package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import p401v8.C11141g;
import p401v8.C11148k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
public class C3762c extends C11141g {

    /* renamed from: V */
    private final Paint f10701V;

    /* renamed from: W */
    private final RectF f10702W;

    C3762c() {
        this(null);
    }

    /* renamed from: r0 */
    private void m28988r0() {
        this.f10701V.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f10701V.setColor(-1);
        this.f10701V.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public boolean m28992n0() {
        return !this.f10702W.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m28991o0() {
        m28990p0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: p0 */
    void m28990p0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f10702W;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m28989q0(RectF rectF) {
        m28990p0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p401v8.C11141g
    /* renamed from: r */
    public void mo5974r(Canvas canvas) {
        if (this.f10702W.isEmpty()) {
            super.mo5974r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f10702W);
        } else {
            canvas.clipRect(this.f10702W, Region.Op.DIFFERENCE);
        }
        super.mo5974r(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3762c(C11148k c11148k) {
        super(c11148k == null ? new C11148k() : c11148k);
        this.f10701V = new Paint(1);
        m28988r0();
        this.f10702W = new RectF();
    }
}
