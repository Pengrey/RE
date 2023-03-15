package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* loaded from: classes.dex */
public final class RunnableC3343t6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ long f9013w;

    /* renamed from: x */
    final /* synthetic */ C3373w6 f9014x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3343t6(C3373w6 c3373w6, long j) {
        this.f9014x = c3373w6;
        this.f9013w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9014x.f8410a.m31095y().m30829n(this.f9013w);
        this.f9014x.f9061e = null;
    }
}
