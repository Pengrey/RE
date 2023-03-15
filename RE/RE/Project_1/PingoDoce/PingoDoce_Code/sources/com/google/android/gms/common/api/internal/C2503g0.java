package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC2576b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: classes.dex */
public final class C2503g0 implements AbstractC2576b.InterfaceC2581e {

    /* renamed from: a */
    final /* synthetic */ C2506h0 f7256a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2503g0(C2506h0 c2506h0) {
        this.f7256a = c2506h0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2576b.InterfaceC2581e
    /* renamed from: a */
    public final void mo33136a() {
        Handler handler;
        handler = this.f7256a.f7270m.f7244p;
        handler.post(new RunnableC2500f0(this));
    }
}
