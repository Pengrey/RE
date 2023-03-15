package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* loaded from: classes.dex */
public final class RunnableC3179e7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8417w;

    /* renamed from: x */
    final /* synthetic */ Bundle f8418x;

    /* renamed from: y */
    final /* synthetic */ C3374w7 f8419y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3179e7(C3374w7 c3374w7, zzp zzpVar, Bundle bundle) {
        this.f8419y = c3374w7;
        this.f8417w = zzpVar;
        this.f8418x = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8419y;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to send default event parameters to service");
            return;
        }
        try {
            C2597i.m33076j(this.f8417w);
            interfaceC3369w2.mo30921Q(this.f8418x, this.f8417w);
        } catch (RemoteException e) {
            this.f8419y.f8410a.mo31116d().m31332r().m31397b("Failed to send default event parameters to service", e);
        }
    }
}
