package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* loaded from: classes.dex */
final class CallableC3133a5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8301a;

    /* renamed from: b */
    final /* synthetic */ BinderC3166d5 f8302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3133a5(BinderC3166d5 binderC3166d5, String str) {
        this.f8302b = binderC3166d5;
        this.f8301a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8302b.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8302b.f8386a;
        return c3137a92.m31495V().m31210c0(this.f8301a);
    }
}
