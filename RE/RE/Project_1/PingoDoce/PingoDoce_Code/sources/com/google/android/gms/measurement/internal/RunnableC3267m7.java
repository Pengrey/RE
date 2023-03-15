package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* loaded from: classes.dex */
public final class RunnableC3267m7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8682w;

    /* renamed from: x */
    final /* synthetic */ boolean f8683x;

    /* renamed from: y */
    final /* synthetic */ zzab f8684y;

    /* renamed from: z */
    final /* synthetic */ C3374w7 f8685z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3267m7(C3374w7 c3374w7, boolean z, zzp zzpVar, boolean z2, zzab zzabVar, zzab zzabVar2) {
        this.f8685z = c3374w7;
        this.f8682w = zzpVar;
        this.f8683x = z2;
        this.f8684y = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f8685z;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C2597i.m33076j(this.f8682w);
        this.f8685z.m30861r(interfaceC3369w2, this.f8683x ? null : this.f8684y, this.f8682w);
        this.f8685z.m30883E();
    }
}
