package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes.dex */
public final class RunnableC3289o7 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3374w7 f8740A;

    /* renamed from: w */
    final /* synthetic */ String f8741w;

    /* renamed from: x */
    final /* synthetic */ String f8742x;

    /* renamed from: y */
    final /* synthetic */ zzp f8743y;

    /* renamed from: z */
    final /* synthetic */ InterfaceC2805i1 f8744z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3289o7(C3374w7 c3374w7, String str, String str2, zzp zzpVar, InterfaceC2805i1 interfaceC2805i1) {
        this.f8740A = c3374w7;
        this.f8741w = str;
        this.f8742x = str2;
        this.f8743y = zzpVar;
        this.f8744z = interfaceC2805i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3242k4 c3242k4;
        InterfaceC3369w2 interfaceC3369w2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C3374w7 c3374w7 = this.f8740A;
                interfaceC3369w2 = c3374w7.f9071d;
                if (interfaceC3369w2 == null) {
                    c3374w7.f8410a.mo31116d().m31332r().m31396c("Failed to get conditional properties; not connected to service", this.f8741w, this.f8742x);
                    c3242k4 = this.f8740A.f8410a;
                } else {
                    C2597i.m33076j(this.f8743y);
                    arrayList = C3203g9.m31271u(interfaceC3369w2.mo30912q1(this.f8741w, this.f8742x, this.f8743y));
                    this.f8740A.m30883E();
                    c3242k4 = this.f8740A.f8410a;
                }
            } catch (RemoteException e) {
                this.f8740A.f8410a.mo31116d().m31332r().m31395d("Failed to get conditional properties; remote exception", this.f8741w, this.f8742x, e);
                c3242k4 = this.f8740A.f8410a;
            }
            c3242k4.m31124N().m31320D(this.f8744z, arrayList);
        } catch (Throwable th2) {
            this.f8740A.f8410a.m31124N().m31320D(this.f8744z, arrayList);
            throw th2;
        }
    }
}
