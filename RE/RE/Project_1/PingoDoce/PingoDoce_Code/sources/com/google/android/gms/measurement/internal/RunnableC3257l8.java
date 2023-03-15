package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* loaded from: classes.dex */
final class RunnableC3257l8 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3236j9 f8662w;

    /* renamed from: x */
    final /* synthetic */ AppMeasurementDynamiteService f8663x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3257l8(AppMeasurementDynamiteService appMeasurementDynamiteService, C3236j9 c3236j9) {
        this.f8663x = appMeasurementDynamiteService;
        this.f8662w = c3236j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8663x.f8289a.m31129I().m31182I(this.f8662w);
    }
}
