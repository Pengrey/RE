package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes.dex */
final class RunnableC3169d8 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ long f8393w;

    /* renamed from: x */
    final /* synthetic */ C3268m8 f8394x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3169d8(C3268m8 c3268m8, long j) {
        this.f8394x = c3268m8;
        this.f8393w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3268m8.m31079r(this.f8394x, this.f8393w);
    }
}
