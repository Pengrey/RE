package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* loaded from: classes.dex */
public final class RunnableC3245k7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8635w;

    /* renamed from: x */
    final /* synthetic */ boolean f8636x;

    /* renamed from: y */
    final /* synthetic */ zzau f8637y;

    /* renamed from: z */
    final /* synthetic */ C3374w7 f8638z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3245k7(C3374w7 c3374w7, boolean z, zzp zzpVar, boolean z2, zzau zzauVar, String str) {
        this.f8638z = c3374w7;
        this.f8635w = zzpVar;
        this.f8636x = z2;
        this.f8637y = zzauVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8638z;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Discarding data. Failed to send event to service");
            return;
        }
        C2597i.m33076j(this.f8635w);
        this.f8638z.m30861r(interfaceC3369w2, this.f8636x ? null : this.f8637y, this.f8635w);
        this.f8638z.m30883E();
    }
}
