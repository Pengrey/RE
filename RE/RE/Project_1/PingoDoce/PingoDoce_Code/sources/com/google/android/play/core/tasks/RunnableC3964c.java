package com.google.android.play.core.tasks;

import p101f9.AbstractC5433d;
import p101f9.InterfaceC5430a;

/* renamed from: com.google.android.play.core.tasks.c */
/* loaded from: classes.dex */
final class RunnableC3964c implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC5433d f11251w;

    /* renamed from: x */
    final /* synthetic */ C3965d f11252x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3964c(C3965d c3965d, AbstractC5433d abstractC5433d) {
        this.f11252x = c3965d;
        this.f11251w = abstractC5433d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5430a interfaceC5430a;
        InterfaceC5430a interfaceC5430a2;
        obj = this.f11252x.f11254b;
        synchronized (obj) {
            interfaceC5430a = this.f11252x.f11255c;
            if (interfaceC5430a != null) {
                interfaceC5430a2 = this.f11252x.f11255c;
                interfaceC5430a2.mo24376a(this.f11251w);
            }
        }
    }
}
