package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes.dex */
public final class RunnableC3223i7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8536w;

    /* renamed from: x */
    final /* synthetic */ C3374w7 f8537x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3223i7(C3374w7 c3374w7, zzp zzpVar) {
        this.f8537x = c3374w7;
        this.f8536w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8537x;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C2597i.m33076j(this.f8536w);
            interfaceC3369w2.mo30910x1(this.f8536w);
            this.f8537x.m30883E();
        } catch (RemoteException e) {
            this.f8537x.f8410a.mo31116d().m31332r().m31397b("Failed to send measurementEnabled to the service", e);
        }
    }
}
