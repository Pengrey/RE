package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* loaded from: classes.dex */
final class RunnableC3311q7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ InterfaceC3369w2 f8818w;

    /* renamed from: x */
    final /* synthetic */ ServiceConnectionC3364v7 f8819x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3311q7(ServiceConnectionC3364v7 serviceConnectionC3364v7, InterfaceC3369w2 interfaceC3369w2) {
        this.f8819x = serviceConnectionC3364v7;
        this.f8818w = interfaceC3369w2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8819x) {
            this.f8819x.f9044a = false;
            if (!this.f8819x.f9046c.m30853z()) {
                this.f8819x.f9046c.f8410a.mo31116d().m31328v().m31398a("Connected to service");
                this.f8819x.f9046c.m30855x(this.f8818w);
            }
        }
    }
}
