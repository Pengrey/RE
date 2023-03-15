package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.v5 */
/* loaded from: classes.dex */
public final class RunnableC3362v5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f9041w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f9042x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3362v5(C3233j6 c3233j6, AtomicReference atomicReference) {
        this.f9042x = c3233j6;
        this.f9041w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9041w) {
            this.f9041w.set(Boolean.valueOf(this.f9042x.f8410a.m31094z().m31373B(this.f9042x.f8410a.m31136B().m30848s(), C3339t2.f8894L)));
            this.f9041w.notify();
        }
    }
}
