package com.google.android.gms.measurement.internal;

import p009a8.C0068a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes.dex */
public final class RunnableC3189f6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3233j6 f8437A;

    /* renamed from: w */
    final /* synthetic */ C0068a f8438w;

    /* renamed from: x */
    final /* synthetic */ int f8439x;

    /* renamed from: y */
    final /* synthetic */ long f8440y;

    /* renamed from: z */
    final /* synthetic */ boolean f8441z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3189f6(C3233j6 c3233j6, C0068a c0068a, int i, long j, boolean z) {
        this.f8437A = c3233j6;
        this.f8438w = c0068a;
        this.f8439x = i;
        this.f8440y = j;
        this.f8441z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8437A.m31180K(this.f8438w);
        C3233j6.m31161d0(this.f8437A, this.f8438w, this.f8439x, this.f8440y, false, this.f8441z);
    }
}
