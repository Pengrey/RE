package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes.dex */
final class RunnableC3225i9 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC2805i1 f8539w;

    /* renamed from: x */
    final /* synthetic */ AppMeasurementDynamiteService f8540x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3225i9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2805i1 interfaceC2805i1) {
        this.f8540x = appMeasurementDynamiteService;
        this.f8539w = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8540x.f8289a.m31124N().m31321C(this.f8539w, this.f8540x.f8289a.m31106n());
    }
}
