package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.n */
/* loaded from: classes.dex */
final class C3433n<TResult, TContinuationResult> implements InterfaceC3414a0<TResult> {

    /* renamed from: a */
    private final Executor f9253a;

    /* renamed from: b */
    private final InterfaceC3415b<TResult, TContinuationResult> f9254b;

    /* renamed from: c */
    private final C3424f0<TContinuationResult> f9255c;

    public C3433n(Executor executor, InterfaceC3415b<TResult, TContinuationResult> interfaceC3415b, C3424f0<TContinuationResult> c3424f0) {
        this.f9253a = executor;
        this.f9254b = interfaceC3415b;
        this.f9255c = c3424f0;
    }

    @Override // com.google.android.gms.tasks.InterfaceC3414a0
    /* renamed from: d */
    public final void mo30744d(AbstractC3419d<TResult> abstractC3419d) {
        this.f9253a.execute(new RunnableC3432m(this, abstractC3419d));
    }
}
