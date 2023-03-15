package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes.dex */
final class CallableC3286o4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8734a;

    /* renamed from: b */
    final /* synthetic */ String f8735b;

    /* renamed from: c */
    final /* synthetic */ String f8736c;

    /* renamed from: d */
    final /* synthetic */ BinderC3166d5 f8737d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3286o4(BinderC3166d5 binderC3166d5, String str, String str2, String str3) {
        this.f8737d = binderC3166d5;
        this.f8734a = str;
        this.f8735b = str2;
        this.f8736c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8737d.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8737d.f8386a;
        return c3137a92.m31495V().m31209d0(this.f8734a, this.f8735b, this.f8736c);
    }
}
