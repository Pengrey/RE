package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes.dex */
public final class RunnableC3145b6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8352w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8353x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3145b6(C3233j6 c3233j6, AtomicReference atomicReference) {
        this.f8353x = c3233j6;
        this.f8352w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8352w) {
            this.f8352w.set(Integer.valueOf(this.f8353x.f8410a.m31094z().m31359o(this.f8353x.f8410a.m31136B().m30848s(), C3339t2.f8897O)));
            this.f8352w.notify();
        }
    }
}
