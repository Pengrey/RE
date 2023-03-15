package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes.dex */
public final class RunnableC3393y6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f9126w;

    /* renamed from: x */
    final /* synthetic */ boolean f9127x;

    /* renamed from: y */
    final /* synthetic */ zzks f9128y;

    /* renamed from: z */
    final /* synthetic */ C3374w7 f9129z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3393y6(C3374w7 c3374w7, zzp zzpVar, boolean z, zzks zzksVar) {
        this.f9129z = c3374w7;
        this.f9126w = zzpVar;
        this.f9127x = z;
        this.f9128y = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3369w2 interfaceC3369w2;
        C3374w7 c3374w7 = this.f9129z;
        interfaceC3369w2 = c3374w7.f9071d;
        if (interfaceC3369w2 == null) {
            c3374w7.f8410a.mo31116d().m31332r().m31398a("Discarding data. Failed to set user property");
            return;
        }
        C2597i.m33076j(this.f9126w);
        this.f9129z.m30861r(interfaceC3369w2, this.f9127x ? null : this.f9128y, this.f9126w);
        this.f9129z.m30883E();
    }
}
