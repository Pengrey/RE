package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* loaded from: classes.dex */
final class RunnableC3180e8 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ long f8420w;

    /* renamed from: x */
    final /* synthetic */ C3268m8 f8421x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3180e8(C3268m8 c3268m8, long j) {
        this.f8421x = c3268m8;
        this.f8420w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3268m8.m31080q(this.f8421x, this.f8420w);
    }
}
