package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes.dex */
final class RunnableC3256l7 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ AppMeasurementDynamiteService f8657A;

    /* renamed from: w */
    final /* synthetic */ InterfaceC2805i1 f8658w;

    /* renamed from: x */
    final /* synthetic */ String f8659x;

    /* renamed from: y */
    final /* synthetic */ String f8660y;

    /* renamed from: z */
    final /* synthetic */ boolean f8661z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3256l7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2805i1 interfaceC2805i1, String str, String str2, boolean z) {
        this.f8657A = appMeasurementDynamiteService;
        this.f8658w = interfaceC2805i1;
        this.f8659x = str;
        this.f8660y = str2;
        this.f8661z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8657A.f8289a.m31126L().m30866V(this.f8658w, this.f8659x, this.f8660y, this.f8661z);
    }
}
