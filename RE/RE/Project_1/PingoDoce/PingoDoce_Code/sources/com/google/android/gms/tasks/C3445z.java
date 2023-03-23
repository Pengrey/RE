package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p079e8.InterfaceC5015b;
import p079e8.InterfaceC5017d;
import p079e8.InterfaceC5018e;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.z */
/* loaded from: classes.dex */
final class C3445z<TResult, TContinuationResult> implements InterfaceC5018e<TContinuationResult>, InterfaceC5017d, InterfaceC5015b, InterfaceC3414a0 {

    /* renamed from: a */
    private final Executor f9282a;

    /* renamed from: b */
    private final InterfaceC3417c<TResult, TContinuationResult> f9283b;

    /* renamed from: c */
    private final C3424f0<TContinuationResult> f9284c;

    public C3445z(Executor executor, InterfaceC3417c<TResult, TContinuationResult> interfaceC3417c, C3424f0<TContinuationResult> c3424f0) {
        this.f9282a = executor;
        this.f9283b = interfaceC3417c;
        this.f9284c = c3424f0;
    }

    @Override // p079e8.InterfaceC5015b
    /* renamed from: a */
    public final void mo25883a() {
        this.f9284c.m30775u();
    }

    @Override // p079e8.InterfaceC5018e
    /* renamed from: b */
    public final void mo20210b(TContinuationResult tcontinuationresult) {
        this.f9284c.m30776t(tcontinuationresult);
    }

    @Override // p079e8.InterfaceC5017d
    /* renamed from: c */
    public final void mo25882c(Exception exc) {
        this.f9284c.m30777s(exc);
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        this.f9282a.execute(new RunnableC3444y(this, abstractC3419d));
    }
}