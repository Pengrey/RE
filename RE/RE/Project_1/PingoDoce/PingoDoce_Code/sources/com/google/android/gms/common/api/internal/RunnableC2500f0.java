package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2461a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes.dex */
final class RunnableC2500f0 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C2503g0 f7246w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2500f0(C2503g0 c2503g0) {
        this.f7246w = c2503g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2461a.InterfaceC2470f interfaceC2470f;
        C2461a.InterfaceC2470f interfaceC2470f2;
        C2506h0 c2506h0 = this.f7246w.f7256a;
        interfaceC2470f = c2506h0.f7259b;
        interfaceC2470f2 = c2506h0.f7259b;
        interfaceC2470f.mo33345e(interfaceC2470f2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
