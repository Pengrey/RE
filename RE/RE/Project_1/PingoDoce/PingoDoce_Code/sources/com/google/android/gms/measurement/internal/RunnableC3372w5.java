package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes.dex */
public final class RunnableC3372w5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ AtomicReference f9055w;

    /* renamed from: x */
    final /* synthetic */ String f9056x;

    /* renamed from: y */
    final /* synthetic */ String f9057y;

    /* renamed from: z */
    final /* synthetic */ C3233j6 f9058z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3372w5(C3233j6 c3233j6, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f9058z = c3233j6;
        this.f9055w = atomicReference;
        this.f9056x = str2;
        this.f9057y = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9058z.f8410a.m31126L().m30867U(this.f9055w, null, this.f9056x, this.f9057y);
    }
}
