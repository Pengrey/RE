package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes.dex */
public final class RunnableC3134a6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8303w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8304x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3134a6(C3233j6 c3233j6, AtomicReference atomicReference) {
        this.f8304x = c3233j6;
        this.f8303w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8303w) {
            this.f8303w.set(Long.valueOf(this.f8304x.f8410a.m31094z().m31356r(this.f8304x.f8410a.m31136B().m30848s(), C3339t2.f8896N)));
            this.f8303w.notify();
        }
    }
}
