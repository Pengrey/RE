package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2853l1;
import p009a8.InterfaceC0082o;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* loaded from: classes.dex */
final class C3236j9 implements InterfaceC0082o {

    /* renamed from: a */
    public final InterfaceC2853l1 f8583a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3236j9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2853l1 interfaceC2853l1) {
        this.f8584b = appMeasurementDynamiteService;
        this.f8583a = interfaceC2853l1;
    }

    @Override // p009a8.InterfaceC0082o
    /* renamed from: a */
    public final void mo31140a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f8583a.mo32501N(str, str2, bundle, j);
        } catch (RemoteException e) {
            C3242k4 c3242k4 = this.f8584b.f8289a;
            if (c3242k4 != null) {
                c3242k4.mo31116d().m31327w().m31397b("Event interceptor threw exception", e);
            }
        }
    }
}
