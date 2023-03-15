package com.google.android.play.core.tasks;

import p101f9.AbstractC5433d;
import p101f9.InterfaceC5432c;

/* renamed from: com.google.android.play.core.tasks.g */
/* loaded from: classes.dex */
final class RunnableC3968g implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC5433d f11261w;

    /* renamed from: x */
    final /* synthetic */ C3969h f11262x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3968g(C3969h c3969h, AbstractC5433d abstractC5433d) {
        this.f11262x = c3969h;
        this.f11261w = abstractC5433d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5432c interfaceC5432c;
        InterfaceC5432c interfaceC5432c2;
        obj = this.f11262x.f11264b;
        synchronized (obj) {
            interfaceC5432c = this.f11262x.f11265c;
            if (interfaceC5432c != null) {
                interfaceC5432c2 = this.f11262x.f11265c;
                interfaceC5432c2.mo24374b(this.f11261w.mo24369e());
            }
        }
    }
}
