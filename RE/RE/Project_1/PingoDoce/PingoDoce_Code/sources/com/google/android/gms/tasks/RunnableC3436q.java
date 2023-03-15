package com.google.android.gms.tasks;

import p079e8.InterfaceC5015b;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.q */
/* loaded from: classes.dex */
final class RunnableC3436q implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3437r f9261w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3436q(C3437r c3437r) {
        this.f9261w = c3437r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5015b interfaceC5015b;
        InterfaceC5015b interfaceC5015b2;
        obj = this.f9261w.f9263b;
        synchronized (obj) {
            C3437r c3437r = this.f9261w;
            interfaceC5015b = c3437r.f9264c;
            if (interfaceC5015b != null) {
                interfaceC5015b2 = c3437r.f9264c;
                interfaceC5015b2.mo25883a();
            }
        }
    }
}
