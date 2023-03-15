package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m3 */
/* loaded from: classes.dex */
final class RunnableC3263m3 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ boolean f8671w;

    /* renamed from: x */
    final /* synthetic */ C3274n3 f8672x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3263m3(C3274n3 c3274n3, boolean z) {
        this.f8672x = c3274n3;
        this.f8671w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        c3137a9 = this.f8672x.f8699a;
        c3137a9.m31471n(this.f8671w);
    }
}
