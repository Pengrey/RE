package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.AbstractC3675b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.e */
/* loaded from: classes.dex */
public abstract class AbstractC3682e<S extends AbstractC3675b> {

    /* renamed from: a */
    S f10371a;

    /* renamed from: b */
    protected AbstractC3678d f10372b;

    public AbstractC3682e(S s) {
        this.f10371a = s;
    }

    /* renamed from: a */
    abstract void mo29348a(Canvas canvas, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo29347b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo29346c(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo29345d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo29344e();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m29358f(AbstractC3678d abstractC3678d) {
        this.f10372b = abstractC3678d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m29357g(Canvas canvas, float f) {
        this.f10371a.mo29311e();
        mo29348a(canvas, f);
    }
}
