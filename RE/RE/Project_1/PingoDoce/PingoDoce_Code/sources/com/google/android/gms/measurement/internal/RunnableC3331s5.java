package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes.dex */
public final class RunnableC3331s5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ long f8870w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8871x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3331s5(C3233j6 c3233j6, long j) {
        this.f8871x = c3233j6;
        this.f8870w = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8871x.m31145z(this.f8870w, true);
        this.f8871x.f8410a.m31126L().m30869S(new AtomicReference());
    }
}
