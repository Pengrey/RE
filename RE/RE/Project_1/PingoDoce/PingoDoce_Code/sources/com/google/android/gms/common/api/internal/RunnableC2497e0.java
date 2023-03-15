package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.e0 */
/* loaded from: classes.dex */
public final class RunnableC2497e0 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ int f7223w;

    /* renamed from: x */
    final /* synthetic */ C2506h0 f7224x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2497e0(C2506h0 c2506h0, int i) {
        this.f7224x = c2506h0;
        this.f7223w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7224x.m33374h(this.f7223w);
    }
}
