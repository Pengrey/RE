package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.b8 */
/* loaded from: classes.dex */
public final class RunnableC3147b8 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3137a9 f8357w;

    /* renamed from: x */
    final /* synthetic */ Runnable f8358x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3147b8(C3158c8 c3158c8, C3137a9 c3137a9, Runnable runnable) {
        this.f8357w = c3137a9;
        this.f8358x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8357w.m31490a();
        this.f8357w.m31474k0(this.f8358x);
        this.f8357w.m31515B();
    }
}
