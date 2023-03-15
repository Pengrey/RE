package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* loaded from: classes.dex */
final class RunnableC3354u7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ ServiceConnectionC3364v7 f9031w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3354u7(ServiceConnectionC3364v7 serviceConnectionC3364v7) {
        this.f9031w = serviceConnectionC3364v7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9031w.f9046c.f9071d = null;
        this.f9031w.f9046c.m30884D();
    }
}
