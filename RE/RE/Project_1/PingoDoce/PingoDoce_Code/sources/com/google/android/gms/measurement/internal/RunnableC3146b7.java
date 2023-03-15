package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes.dex */
public final class RunnableC3146b7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8354w;

    /* renamed from: x */
    final /* synthetic */ InterfaceC2805i1 f8355x;

    /* renamed from: y */
    final /* synthetic */ C3374w7 f8356y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3146b7(C3374w7 c3374w7, zzp zzpVar, InterfaceC2805i1 interfaceC2805i1) {
        this.f8356y = c3374w7;
        this.f8354w = zzpVar;
        this.f8355x = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3242k4 c3242k4;
        InterfaceC3369w2 interfaceC3369w2;
        String str = null;
        try {
            try {
                if (this.f8356y.f8410a.m31132F().m31004q().m41984i(EnumC3193g.ANALYTICS_STORAGE)) {
                    C3374w7 c3374w7 = this.f8356y;
                    interfaceC3369w2 = c3374w7.f9071d;
                    if (interfaceC3369w2 == null) {
                        c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to get app instance id");
                        c3242k4 = this.f8356y.f8410a;
                    } else {
                        C2597i.m33076j(this.f8354w);
                        str = interfaceC3369w2.mo30911w0(this.f8354w);
                        if (str != null) {
                            this.f8356y.f8410a.m31129I().m31188C(str);
                            this.f8356y.f8410a.m31132F().f8963g.m31015b(str);
                        }
                        this.f8356y.m30883E();
                        c3242k4 = this.f8356y.f8410a;
                    }
                } else {
                    this.f8356y.f8410a.mo31116d().m31326x().m31398a("Analytics storage consent denied; will not get app instance id");
                    this.f8356y.f8410a.m31129I().m31188C(null);
                    this.f8356y.f8410a.m31132F().f8963g.m31015b(null);
                    c3242k4 = this.f8356y.f8410a;
                }
            } catch (RemoteException e) {
                this.f8356y.f8410a.mo31116d().m31332r().m31397b("Failed to get app instance id", e);
                c3242k4 = this.f8356y.f8410a;
            }
            c3242k4.m31124N().m31315I(this.f8355x, str);
        } catch (Throwable th2) {
            this.f8356y.f8410a.m31124N().m31315I(this.f8355x, null);
            throw th2;
        }
    }
}
