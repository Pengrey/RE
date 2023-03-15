package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o5 */
/* loaded from: classes.dex */
final class RunnableC3287o5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC2805i1 f8738w;

    /* renamed from: x */
    final /* synthetic */ AppMeasurementDynamiteService f8739x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3287o5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2805i1 interfaceC2805i1) {
        this.f8739x = appMeasurementDynamiteService;
        this.f8738w = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8739x.f8289a.m31126L().m30870R(this.f8738w);
    }
}
