package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r4 */
/* loaded from: classes.dex */
final class CallableC3319r4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8835a;

    /* renamed from: b */
    final /* synthetic */ String f8836b;

    /* renamed from: c */
    final /* synthetic */ String f8837c;

    /* renamed from: d */
    final /* synthetic */ BinderC3166d5 f8838d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3319r4(BinderC3166d5 binderC3166d5, String str, String str2, String str3) {
        this.f8838d = binderC3166d5;
        this.f8835a = str;
        this.f8836b = str2;
        this.f8837c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8838d.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8838d.f8386a;
        return c3137a92.m31495V().m31212a0(this.f8835a, this.f8836b, this.f8837c);
    }
}
