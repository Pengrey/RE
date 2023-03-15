package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes.dex */
public final class RunnableC3402z5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f9150w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f9151x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3402z5(C3233j6 c3233j6, AtomicReference atomicReference) {
        this.f9151x = c3233j6;
        this.f9150w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9150w) {
            this.f9150w.set(this.f9151x.f8410a.m31094z().m31350x(this.f9151x.f8410a.m31136B().m30848s(), C3339t2.f8895M));
            this.f9150w.notify();
        }
    }
}
