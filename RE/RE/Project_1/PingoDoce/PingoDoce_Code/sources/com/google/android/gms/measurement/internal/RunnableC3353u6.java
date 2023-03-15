package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u6 */
/* loaded from: classes.dex */
public final class RunnableC3353u6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3299p6 f9028w;

    /* renamed from: x */
    final /* synthetic */ long f9029x;

    /* renamed from: y */
    final /* synthetic */ C3373w6 f9030y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3353u6(C3373w6 c3373w6, C3299p6 c3299p6, long j) {
        this.f9030y = c3373w6;
        this.f9028w = c3299p6;
        this.f9029x = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9030y.m30897q(this.f9028w, false, this.f9029x);
        C3373w6 c3373w6 = this.f9030y;
        c3373w6.f9061e = null;
        c3373w6.f8410a.m31126L().m30858u(null);
    }
}
