package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* loaded from: classes.dex */
public final class RunnableC3234j7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8577w;

    /* renamed from: x */
    final /* synthetic */ C3374w7 f8578x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3234j7(C3374w7 c3374w7, zzp zzpVar) {
        this.f8578x = c3374w7;
        this.f8577w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8578x;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to send consent settings to service");
            return;
        }
        try {
            C2597i.m33076j(this.f8577w);
            interfaceC3369w2.mo30925L(this.f8577w);
            this.f8578x.m30883E();
        } catch (RemoteException e) {
            this.f8578x.f8410a.mo31116d().m31332r().m31397b("Failed to send consent settings to the service", e);
        }
    }
}
