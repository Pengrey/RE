package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes.dex */
public final class RunnableC3201g7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzau f8468w;

    /* renamed from: x */
    final /* synthetic */ String f8469x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC2805i1 f8470y;

    /* renamed from: z */
    final /* synthetic */ C3374w7 f8471z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3201g7(C3374w7 c3374w7, zzau zzauVar, String str, InterfaceC2805i1 interfaceC2805i1) {
        this.f8471z = c3374w7;
        this.f8468w = zzauVar;
        this.f8469x = str;
        this.f8470y = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3242k4 c3242k4;
        InterfaceC3369w2 interfaceC3369w2;
        byte[] bArr = null;
        try {
            try {
                C3374w7 c3374w7 = this.f8471z;
                interfaceC3369w2 = c3374w7.f9071d;
                if (interfaceC3369w2 == null) {
                    c3374w7.f8410a.mo31116d().m31332r().m31398a("Discarding data. Failed to send event to service to bundle");
                    c3242k4 = this.f8471z.f8410a;
                } else {
                    bArr = interfaceC3369w2.mo30909z1(this.f8468w, this.f8469x);
                    this.f8471z.m30883E();
                    c3242k4 = this.f8471z.f8410a;
                }
            } catch (RemoteException e) {
                this.f8471z.f8410a.mo31116d().m31332r().m31397b("Failed to send event to the service to bundle", e);
                c3242k4 = this.f8471z.f8410a;
            }
            c3242k4.m31124N().m31318F(this.f8470y, bArr);
        } catch (Throwable th2) {
            this.f8471z.f8410a.m31124N().m31318F(this.f8470y, bArr);
            throw th2;
        }
    }
}
