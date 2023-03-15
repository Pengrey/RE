package com.google.android.play.core.tasks;

import p101f9.AbstractC5433d;
import p101f9.InterfaceC5431b;

/* renamed from: com.google.android.play.core.tasks.e */
/* loaded from: classes.dex */
final class RunnableC3966e implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC5433d f11256w;

    /* renamed from: x */
    final /* synthetic */ C3967f f11257x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3966e(C3967f c3967f, AbstractC5433d abstractC5433d) {
        this.f11257x = c3967f;
        this.f11256w = abstractC5433d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5431b interfaceC5431b;
        InterfaceC5431b interfaceC5431b2;
        obj = this.f11257x.f11259b;
        synchronized (obj) {
            interfaceC5431b = this.f11257x.f11260c;
            if (interfaceC5431b != null) {
                interfaceC5431b2 = this.f11257x.f11260c;
                interfaceC5431b2.mo24375c(this.f11256w.mo24370d());
            }
        }
    }
}
