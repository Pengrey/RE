package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
import p101f9.AbstractC5433d;
import p101f9.InterfaceC5431b;

/* renamed from: com.google.android.play.core.tasks.f */
/* loaded from: classes.dex */
final class C3967f<ResultT> implements InterfaceC3970i<ResultT> {

    /* renamed from: a */
    private final Executor f11258a;

    /* renamed from: b */
    private final Object f11259b = new Object();

    /* renamed from: c */
    private final InterfaceC5431b f11260c;

    public C3967f(Executor executor, InterfaceC5431b interfaceC5431b) {
        this.f11258a = executor;
        this.f11260c = interfaceC5431b;
    }

    @Override // com.google.android.play.core.tasks.InterfaceC3970i
    /* renamed from: a */
    public final void mo28505a(AbstractC5433d<ResultT> abstractC5433d) {
        if (abstractC5433d.mo24367g()) {
            return;
        }
        synchronized (this.f11259b) {
            if (this.f11260c == null) {
                return;
            }
            this.f11258a.execute(new RunnableC3966e(this, abstractC5433d));
        }
    }
}
