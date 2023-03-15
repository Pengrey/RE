package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes.dex */
public final class RunnableC3248l implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC3199g5 f8642w;

    /* renamed from: x */
    final /* synthetic */ AbstractC3259m f8643x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3248l(AbstractC3259m abstractC3259m, InterfaceC3199g5 interfaceC3199g5) {
        this.f8643x = abstractC3259m;
        this.f8642w = interfaceC3199g5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8642w.mo31114f();
        if (C3138b.m31458a()) {
            this.f8642w.mo31118b().m31239z(this);
            return;
        }
        boolean m31084e = this.f8643x.m31084e();
        this.f8643x.f8667c = 0L;
        if (m31084e) {
            this.f8643x.mo31054c();
        }
    }
}
