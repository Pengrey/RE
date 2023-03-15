package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* loaded from: classes.dex */
public final class RunnableC2492c1 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ BinderC2501f1 f7219w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2492c1(BinderC2501f1 binderC2501f1) {
        this.f7219w = binderC2501f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2498e1 interfaceC2498e1;
        interfaceC2498e1 = this.f7219w.f7254g;
        interfaceC2498e1.mo33331c(new ConnectionResult(4));
    }
}
