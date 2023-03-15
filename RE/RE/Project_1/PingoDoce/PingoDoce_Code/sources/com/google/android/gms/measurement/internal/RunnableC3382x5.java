package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes.dex */
public final class RunnableC3382x5 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3233j6 f9098A;

    /* renamed from: w */
    final /* synthetic */ AtomicReference f9099w;

    /* renamed from: x */
    final /* synthetic */ String f9100x;

    /* renamed from: y */
    final /* synthetic */ String f9101y;

    /* renamed from: z */
    final /* synthetic */ boolean f9102z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3382x5(C3233j6 c3233j6, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f9098A = c3233j6;
        this.f9099w = atomicReference;
        this.f9100x = str2;
        this.f9101y = str3;
        this.f9102z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9098A.f8410a.m31126L().m30865W(this.f9099w, null, this.f9100x, this.f9101y, this.f9102z);
    }
}
