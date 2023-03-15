package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p198k8.C6608a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.h */
/* loaded from: classes.dex */
public final class C3685h extends AbstractC3682e<C3693k> {

    /* renamed from: c */
    private float f10378c;

    /* renamed from: d */
    private float f10379d;

    /* renamed from: e */
    private float f10380e;

    public C3685h(C3693k c3693k) {
        super(c3693k);
        this.f10378c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3682e
    /* renamed from: a */
    public void mo29348a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f10378c = clipBounds.width();
        float f2 = ((C3693k) this.f10371a).f10342a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max(0.0f, (clipBounds.height() - ((C3693k) this.f10371a).f10342a) / 2.0f));
        if (((C3693k) this.f10371a).f10404i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f10372b.m29368j() && ((C3693k) this.f10371a).f10346e == 1) || (this.f10372b.m29369i() && ((C3693k) this.f10371a).f10347f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f10372b.m29368j() || this.f10372b.m29369i()) {
            canvas.translate(0.0f, (((C3693k) this.f10371a).f10342a * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f10378c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f10371a;
        this.f10379d = ((C3693k) s).f10342a * f;
        this.f10380e = ((C3693k) s).f10343b * f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3682e
    /* renamed from: b */
    public void mo29347b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f10378c;
        float f4 = this.f10380e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.f10379d;
        RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.f10380e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC3682e
    /* renamed from: c */
    public void mo29346c(Canvas canvas, Paint paint) {
        int m20507a = C6608a.m20507a(((C3693k) this.f10371a).f10345d, this.f10372b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(m20507a);
        float f = this.f10378c;
        float f2 = this.f10379d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f10380e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // com.google.android.material.progressindicator.AbstractC3682e
    /* renamed from: d */
    public int mo29345d() {
        return ((C3693k) this.f10371a).f10342a;
    }

    @Override // com.google.android.material.progressindicator.AbstractC3682e
    /* renamed from: e */
    public int mo29344e() {
        return -1;
    }
}
