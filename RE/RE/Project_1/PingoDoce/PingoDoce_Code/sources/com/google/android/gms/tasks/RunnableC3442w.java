package com.google.android.gms.tasks;

import p079e8.InterfaceC5018e;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.w */
/* loaded from: classes.dex */
final class RunnableC3442w implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AbstractC3419d f9275w;

    /* renamed from: x */
    final /* synthetic */ C3443x f9276x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3442w(C3443x c3443x, AbstractC3419d abstractC3419d) {
        this.f9276x = c3443x;
        this.f9275w = abstractC3419d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5018e interfaceC5018e;
        InterfaceC5018e interfaceC5018e2;
        obj = this.f9276x.f9278b;
        synchronized (obj) {
            C3443x c3443x = this.f9276x;
            interfaceC5018e = c3443x.f9279c;
            if (interfaceC5018e != null) {
                interfaceC5018e2 = c3443x.f9279c;
                interfaceC5018e2.mo20210b(this.f9275w.mo30784l());
            }
        }
    }
}
