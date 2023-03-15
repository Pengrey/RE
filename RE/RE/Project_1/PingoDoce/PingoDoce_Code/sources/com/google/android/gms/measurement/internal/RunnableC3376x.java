package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x */
/* loaded from: classes.dex */
public final class RunnableC3376x implements Runnable {

    /* renamed from: w */
    final /* synthetic */ String f9079w;

    /* renamed from: x */
    final /* synthetic */ long f9080x;

    /* renamed from: y */
    final /* synthetic */ C3398z1 f9081y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3376x(C3398z1 c3398z1, String str, long j) {
        this.f9081y = c3398z1;
        this.f9079w = str;
        this.f9080x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3398z1.m30833j(this.f9081y, this.f9079w, this.f9080x);
    }
}
