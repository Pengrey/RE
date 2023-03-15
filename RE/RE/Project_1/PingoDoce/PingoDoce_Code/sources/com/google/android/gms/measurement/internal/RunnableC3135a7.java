package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.a7 */
/* loaded from: classes.dex */
public final class RunnableC3135a7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8305w;

    /* renamed from: x */
    final /* synthetic */ zzp f8306x;

    /* renamed from: y */
    final /* synthetic */ C3374w7 f8307y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3135a7(C3374w7 c3374w7, AtomicReference atomicReference, zzp zzpVar) {
        this.f8307y = c3374w7;
        this.f8305w = atomicReference;
        this.f8306x = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC3369w2 interfaceC3369w2;
        synchronized (this.f8305w) {
            try {
            } catch (RemoteException e) {
                this.f8307y.f8410a.mo31116d().m31332r().m31397b("Failed to get app instance id", e);
                atomicReference = this.f8305w;
            }
            if (!this.f8307y.f8410a.m31132F().m31004q().m41984i(EnumC3193g.ANALYTICS_STORAGE)) {
                this.f8307y.f8410a.mo31116d().m31326x().m31398a("Analytics storage consent denied; will not get app instance id");
                this.f8307y.f8410a.m31129I().m31188C(null);
                this.f8307y.f8410a.m31132F().f8963g.m31015b(null);
                this.f8305w.set(null);
                this.f8305w.notify();
                return;
            }
            C3374w7 c3374w7 = this.f8307y;
            interfaceC3369w2 = c3374w7.f9071d;
            if (interfaceC3369w2 == null) {
                c3374w7.f8410a.mo31116d().m31332r().m31398a("Failed to get app instance id");
                this.f8305w.notify();
                return;
            }
            C2597i.m33076j(this.f8306x);
            this.f8305w.set(interfaceC3369w2.mo30911w0(this.f8306x));
            String str = (String) this.f8305w.get();
            if (str != null) {
                this.f8307y.f8410a.m31129I().m31188C(str);
                this.f8307y.f8410a.m31132F().f8963g.m31015b(str);
            }
            this.f8307y.m30883E();
            atomicReference = this.f8305w;
            atomicReference.notify();
        }
    }
}
