package com.google.android.gms.tasks;

import p079e8.InterfaceC5016c;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.s */
/* loaded from: classes.dex */
final class RunnableC3438s implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9265w;

    /* renamed from: x */
    final /* synthetic */ C3439t f9266x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3438s(C3439t c3439t, AbstractC3419d abstractC3419d) {
        this.f9266x = c3439t;
        this.f9265w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5016c interfaceC5016c;
        InterfaceC5016c interfaceC5016c2;
        obj = this.f9266x.f9268b;
        synchronized (obj) {
            C3439t c3439t = this.f9266x;
            interfaceC5016c = c3439t.f9269c;
            if (interfaceC5016c != null) {
                interfaceC5016c2 = c3439t.f9269c;
                interfaceC5016c2.mo4683a(this.f9265w);
            }
        }
    }
}
