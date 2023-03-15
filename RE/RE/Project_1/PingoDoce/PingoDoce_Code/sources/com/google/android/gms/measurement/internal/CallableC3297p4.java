package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p4 */
/* loaded from: classes.dex */
final class CallableC3297p4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8768a;

    /* renamed from: b */
    final /* synthetic */ String f8769b;

    /* renamed from: c */
    final /* synthetic */ String f8770c;

    /* renamed from: d */
    final /* synthetic */ BinderC3166d5 f8771d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3297p4(BinderC3166d5 binderC3166d5, String str, String str2, String str3) {
        this.f8771d = binderC3166d5;
        this.f8768a = str;
        this.f8769b = str2;
        this.f8770c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8771d.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8771d.f8386a;
        return c3137a92.m31495V().m31209d0(this.f8768a, this.f8769b, this.f8770c);
    }
}
