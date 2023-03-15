package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import p079e8.InterfaceC5015b;
import p079e8.InterfaceC5016c;
import p079e8.InterfaceC5017d;
import p079e8.InterfaceC5018e;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.d */
/* loaded from: classes.dex */
public abstract class AbstractC3419d<TResult> {
    /* renamed from: a */
    public AbstractC3419d<TResult> mo30795a(Executor executor, InterfaceC5015b interfaceC5015b) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public AbstractC3419d<TResult> mo30794b(InterfaceC5016c<TResult> interfaceC5016c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public AbstractC3419d<TResult> mo30793c(Executor executor, InterfaceC5016c<TResult> interfaceC5016c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract AbstractC3419d<TResult> mo30792d(Executor executor, InterfaceC5017d interfaceC5017d);

    /* renamed from: e */
    public abstract AbstractC3419d<TResult> mo30791e(InterfaceC5018e<? super TResult> interfaceC5018e);

    /* renamed from: f */
    public abstract AbstractC3419d<TResult> mo30790f(Executor executor, InterfaceC5018e<? super TResult> interfaceC5018e);

    /* renamed from: g */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30789g(InterfaceC3415b<TResult, TContinuationResult> interfaceC3415b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: h */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30788h(Executor executor, InterfaceC3415b<TResult, TContinuationResult> interfaceC3415b) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30787i(InterfaceC3415b<TResult, AbstractC3419d<TContinuationResult>> interfaceC3415b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: j */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30786j(Executor executor, InterfaceC3415b<TResult, AbstractC3419d<TContinuationResult>> interfaceC3415b) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: k */
    public abstract Exception mo30785k();

    /* renamed from: l */
    public abstract TResult mo30784l();

    /* renamed from: m */
    public abstract <X extends Throwable> TResult mo30783m(Class<X> cls) throws Throwable;

    /* renamed from: n */
    public abstract boolean mo30782n();

    /* renamed from: o */
    public abstract boolean mo30781o();

    /* renamed from: p */
    public abstract boolean mo30780p();

    /* renamed from: q */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30779q(InterfaceC3417c<TResult, TContinuationResult> interfaceC3417c) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: r */
    public <TContinuationResult> AbstractC3419d<TContinuationResult> mo30778r(Executor executor, InterfaceC3417c<TResult, TContinuationResult> interfaceC3417c) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
