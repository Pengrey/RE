package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* loaded from: classes.dex */
public final class RunnableC3383x6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ InterfaceC2805i1 f9103A;

    /* renamed from: B */
    final /* synthetic */ C3374w7 f9104B;

    /* renamed from: w */
    final /* synthetic */ String f9105w;

    /* renamed from: x */
    final /* synthetic */ String f9106x;

    /* renamed from: y */
    final /* synthetic */ zzp f9107y;

    /* renamed from: z */
    final /* synthetic */ boolean f9108z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3383x6(C3374w7 c3374w7, String str, String str2, zzp zzpVar, boolean z, InterfaceC2805i1 interfaceC2805i1) {
        this.f9104B = c3374w7;
        this.f9105w = str;
        this.f9106x = str2;
        this.f9107y = zzpVar;
        this.f9108z = z;
        this.f9103A = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e;
        InterfaceC3369w2 interfaceC3369w2;
        Bundle bundle2 = new Bundle();
        try {
            C3374w7 c3374w7 = this.f9104B;
            interfaceC3369w2 = c3374w7.f9071d;
            if (interfaceC3369w2 == null) {
                c3374w7.f8410a.mo31116d().m31332r().m31396c("Failed to get user properties; not connected to service", this.f9105w, this.f9106x);
                this.f9104B.f8410a.m31124N().m31319E(this.f9103A, bundle2);
                return;
            }
            C2597i.m33076j(this.f9107y);
            List<zzks> mo30920R = interfaceC3369w2.mo30920R(this.f9105w, this.f9106x, this.f9108z, this.f9107y);
            bundle = new Bundle();
            if (mo30920R != null) {
                for (zzks zzksVar : mo30920R) {
                    String str = zzksVar.f9179A;
                    if (str != null) {
                        bundle.putString(zzksVar.f9183x, str);
                    } else {
                        Long l = zzksVar.f9185z;
                        if (l != null) {
                            bundle.putLong(zzksVar.f9183x, l.longValue());
                        } else {
                            Double d = zzksVar.f9181C;
                            if (d != null) {
                                bundle.putDouble(zzksVar.f9183x, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f9104B.m30883E();
                    this.f9104B.f8410a.m31124N().m31319E(this.f9103A, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f9104B.f8410a.m31124N().m31319E(this.f9103A, bundle2);
                    throw th;
                }
            } catch (RemoteException e2) {
                e = e2;
                this.f9104B.f8410a.mo31116d().m31332r().m31396c("Failed to get user properties; remote exception", this.f9105w, e);
                this.f9104B.f8410a.m31124N().m31319E(this.f9103A, bundle);
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            this.f9104B.f8410a.m31124N().m31319E(this.f9103A, bundle2);
            throw th;
        }
    }
}
