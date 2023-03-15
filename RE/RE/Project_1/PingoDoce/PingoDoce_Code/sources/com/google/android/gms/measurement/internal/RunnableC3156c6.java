package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes.dex */
public final class RunnableC3156c6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8369w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8370x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3156c6(C3233j6 c3233j6, AtomicReference atomicReference) {
        this.f8370x = c3233j6;
        this.f8369w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8369w) {
            this.f8369w.set(Double.valueOf(this.f8370x.f8410a.m31094z().m31363k(this.f8370x.f8410a.m31136B().m30848s(), C3339t2.f8898P)));
            this.f8369w.notify();
        }
    }
}
