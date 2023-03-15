package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes.dex */
public final class RunnableC3157c7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8371w;

    /* renamed from: x */
    final /* synthetic */ C3374w7 f8372x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3157c7(C3374w7 c3374w7, zzp zzpVar) {
        this.f8372x = c3374w7;
        this.f8371w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8372x;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C2597i.m33076j(this.f8371w);
            interfaceC3369w2.mo30915h1(this.f8371w);
            this.f8372x.f8410a.m31135C().m31521t();
            this.f8372x.m30861r(interfaceC3369w2, null, this.f8371w);
            this.f8372x.m30883E();
        } catch (RemoteException e) {
            this.f8372x.f8410a.mo31116d().m31332r().m31397b("Failed to send app launch to the service", e);
        }
    }
}
