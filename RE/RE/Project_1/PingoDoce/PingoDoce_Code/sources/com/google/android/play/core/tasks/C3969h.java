package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;
import p101f9.AbstractC5433d;
import p101f9.InterfaceC5432c;

/* renamed from: com.google.android.play.core.tasks.h */
/* loaded from: classes.dex */
final class C3969h<ResultT> implements InterfaceC3970i<ResultT> {

    /* renamed from: a */
    private final Executor f11263a;

    /* renamed from: b */
    private final Object f11264b = new Object();

    /* renamed from: c */
    private final InterfaceC5432c<? super ResultT> f11265c;

    public C3969h(Executor executor, InterfaceC5432c<? super ResultT> interfaceC5432c) {
        this.f11263a = executor;
        this.f11265c = interfaceC5432c;
    }

    @Override // com.google.android.play.core.tasks.InterfaceC3970i
    /* renamed from: a */
    public final void mo28505a(AbstractC5433d<ResultT> abstractC5433d) {
        if (abstractC5433d.mo24367g()) {
            synchronized (this.f11264b) {
                if (this.f11265c == null) {
                    return;
                }
                this.f11263a.execute(new RunnableC3968g(this, abstractC5433d));
            }
        }
    }
}
