package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import p009a8.C0068a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* loaded from: classes.dex */
final class RunnableC3361v4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f9039w;

    /* renamed from: x */
    final /* synthetic */ BinderC3166d5 f9040x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3361v4(BinderC3166d5 binderC3166d5, zzp zzpVar) {
        this.f9040x = binderC3166d5;
        this.f9039w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f9040x.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f9040x.f8386a;
        zzp zzpVar = this.f9039w;
        c3137a92.mo31118b().mo30825h();
        c3137a92.m31483g();
        C2597i.m33080f(zzpVar.f9204w);
        C0068a m41991b = C0068a.m41991b(zzpVar.f9203R);
        C0068a m31496U = c3137a92.m31496U(zzpVar.f9204w);
        c3137a92.mo31116d().m31328v().m31396c("Setting consent, package, consent", zzpVar.f9204w, m41991b);
        c3137a92.m31459z(zzpVar.f9204w, m41991b);
        if (m41991b.m41982k(m31496U)) {
            c3137a92.m31464u(zzpVar);
        }
    }
}
