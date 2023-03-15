package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
import p101f9.AbstractC5433d;
import p101f9.InterfaceC5430a;

/* renamed from: com.google.android.play.core.tasks.d */
/* loaded from: classes.dex */
final class C3965d<ResultT> implements InterfaceC3970i<ResultT> {

    /* renamed from: a */
    private final Executor f11253a;

    /* renamed from: b */
    private final Object f11254b = new Object();

    /* renamed from: c */
    private final InterfaceC5430a<ResultT> f11255c;

    public C3965d(Executor executor, InterfaceC5430a<ResultT> interfaceC5430a) {
        this.f11253a = executor;
        this.f11255c = interfaceC5430a;
    }

    @Override // com.google.android.play.core.tasks.InterfaceC3970i
    /* renamed from: a */
    public final void mo28505a(AbstractC5433d<ResultT> abstractC5433d) {
        synchronized (this.f11254b) {
            if (this.f11255c == null) {
                return;
            }
            this.f11253a.execute(new RunnableC3964c(this, abstractC5433d));
        }
    }
}
