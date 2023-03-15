package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* loaded from: classes.dex */
final class RunnableC3214h9 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC2805i1 f8507w;

    /* renamed from: x */
    final /* synthetic */ String f8508x;

    /* renamed from: y */
    final /* synthetic */ String f8509y;

    /* renamed from: z */
    final /* synthetic */ AppMeasurementDynamiteService f8510z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3214h9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2805i1 interfaceC2805i1, String str, String str2) {
        this.f8510z = appMeasurementDynamiteService;
        this.f8507w = interfaceC2805i1;
        this.f8508x = str;
        this.f8509y = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8510z.f8289a.m31126L().m30868T(this.f8507w, this.f8508x, this.f8509y);
    }
}
