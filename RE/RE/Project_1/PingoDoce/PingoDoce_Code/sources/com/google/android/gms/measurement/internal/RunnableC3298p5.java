package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* loaded from: classes.dex */
final class RunnableC3298p5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ long f8772w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8773x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3298p5(C3233j6 c3233j6, long j) {
        this.f8773x = c3233j6;
        this.f8772w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8773x.f8410a.m31132F().f8967k.m31038b(this.f8772w);
        this.f8773x.f8410a.mo31116d().m31333q().m31397b("Session timeout duration set", Long.valueOf(this.f8772w));
    }
}
