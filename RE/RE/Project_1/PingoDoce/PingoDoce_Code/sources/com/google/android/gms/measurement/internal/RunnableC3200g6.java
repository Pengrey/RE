package com.google.android.gms.measurement.internal;

import p009a8.C0068a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes.dex */
public final class RunnableC3200g6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3233j6 f8463A;

    /* renamed from: w */
    final /* synthetic */ C0068a f8464w;

    /* renamed from: x */
    final /* synthetic */ int f8465x;

    /* renamed from: y */
    final /* synthetic */ long f8466y;

    /* renamed from: z */
    final /* synthetic */ boolean f8467z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3200g6(C3233j6 c3233j6, C0068a c0068a, int i, long j, boolean z) {
        this.f8463A = c3233j6;
        this.f8464w = c0068a;
        this.f8465x = i;
        this.f8466y = j;
        this.f8467z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8463A.m31180K(this.f8464w);
        C3233j6.m31161d0(this.f8463A, this.f8464w, this.f8465x, this.f8466y, false, this.f8467z);
    }
}
