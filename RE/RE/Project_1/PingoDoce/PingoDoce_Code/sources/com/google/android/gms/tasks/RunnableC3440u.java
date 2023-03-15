package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C2597i;
import p079e8.InterfaceC5017d;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.u */
/* loaded from: classes.dex */
final class RunnableC3440u implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9270w;

    /* renamed from: x */
    final /* synthetic */ C3441v f9271x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3440u(C3441v c3441v, AbstractC3419d abstractC3419d) {
        this.f9271x = c3441v;
        this.f9270w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5017d interfaceC5017d;
        InterfaceC5017d interfaceC5017d2;
        obj = this.f9271x.f9273b;
        synchronized (obj) {
            C3441v c3441v = this.f9271x;
            interfaceC5017d = c3441v.f9274c;
            if (interfaceC5017d != null) {
                interfaceC5017d2 = c3441v.f9274c;
                interfaceC5017d2.mo25882c((Exception) C2597i.m33076j(this.f9270w.mo30785k()));
            }
        }
    }
}
