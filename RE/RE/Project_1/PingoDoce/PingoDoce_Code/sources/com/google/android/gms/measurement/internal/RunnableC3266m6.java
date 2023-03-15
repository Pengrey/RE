package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes.dex */
final class RunnableC3266m6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC2805i1 f8678w;

    /* renamed from: x */
    final /* synthetic */ zzau f8679x;

    /* renamed from: y */
    final /* synthetic */ String f8680y;

    /* renamed from: z */
    final /* synthetic */ AppMeasurementDynamiteService f8681z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3266m6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2805i1 interfaceC2805i1, zzau zzauVar, String str) {
        this.f8681z = appMeasurementDynamiteService;
        this.f8678w = interfaceC2805i1;
        this.f8679x = zzauVar;
        this.f8680y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8681z.f8289a.m31126L().m30863p(this.f8678w, this.f8679x, this.f8680y);
    }
}
