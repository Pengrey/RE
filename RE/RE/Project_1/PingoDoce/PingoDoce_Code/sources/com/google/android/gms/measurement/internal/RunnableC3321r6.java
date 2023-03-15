package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes.dex */
public final class RunnableC3321r6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3373w6 f8844A;

    /* renamed from: w */
    final /* synthetic */ C3299p6 f8845w;

    /* renamed from: x */
    final /* synthetic */ C3299p6 f8846x;

    /* renamed from: y */
    final /* synthetic */ long f8847y;

    /* renamed from: z */
    final /* synthetic */ boolean f8848z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3321r6(C3373w6 c3373w6, C3299p6 c3299p6, C3299p6 c3299p62, long j, boolean z) {
        this.f8844A = c3373w6;
        this.f8845w = c3299p6;
        this.f8846x = c3299p62;
        this.f8847y = j;
        this.f8848z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8844A.m30898p(this.f8845w, this.f8846x, this.f8847y, this.f8848z, null);
    }
}
