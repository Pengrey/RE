package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* loaded from: classes.dex */
public final class RunnableC3168d7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3299p6 f8391w;

    /* renamed from: x */
    final /* synthetic */ C3374w7 f8392x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3168d7(C3374w7 c3374w7, C3299p6 c3299p6) {
        this.f8392x = c3374w7;
        this.f8391w = c3299p6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8392x;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to send current screen to service");
            return;
        }
        try {
            C3299p6 c3299p6 = this.f8391w;
            if (c3299p6 == null) {
                interfaceC3369w2.mo30924M(0L, null, null, c3374w7.f8410a.mo31117c().getPackageName());
            } else {
                interfaceC3369w2.mo30924M(c3299p6.f8776c, c3299p6.f8774a, c3299p6.f8775b, c3374w7.f8410a.mo31117c().getPackageName());
            }
            this.f8392x.m30883E();
        } catch (RemoteException e) {
            this.f8392x.f8410a.mo31116d().m31332r().m31397b("Failed to send current screen to the service", e);
        }
    }
}
