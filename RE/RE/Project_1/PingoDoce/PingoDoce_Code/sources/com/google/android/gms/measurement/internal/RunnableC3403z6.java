package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes.dex */
public final class RunnableC3403z6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f9152w;

    /* renamed from: x */
    final /* synthetic */ C3374w7 f9153x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3403z6(C3374w7 c3374w7, zzp zzpVar) {
        this.f9153x = c3374w7;
        this.f9152w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f9153x;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C2597i.m33076j(this.f9152w);
            interfaceC3369w2.mo30913o0(this.f9152w);
        } catch (RemoteException e) {
            this.f9153x.f8410a.mo31116d().m31332r().m31397b("Failed to reset data on the service: remote exception", e);
        }
        this.f9153x.m30883E();
    }
}
