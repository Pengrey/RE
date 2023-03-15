package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* loaded from: classes.dex */
final class RunnableC3351u4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f9024w;

    /* renamed from: x */
    final /* synthetic */ BinderC3166d5 f9025x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3351u4(BinderC3166d5 binderC3166d5, zzp zzpVar) {
        this.f9025x = binderC3166d5;
        this.f9024w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f9025x.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f9025x.f8386a;
        zzp zzpVar = this.f9024w;
        c3137a92.mo31118b().mo30825h();
        c3137a92.m31483g();
        C2597i.m33080f(zzpVar.f9204w);
        c3137a92.m31499R(zzpVar);
    }
}
