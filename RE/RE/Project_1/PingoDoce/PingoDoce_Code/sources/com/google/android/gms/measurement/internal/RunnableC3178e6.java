package com.google.android.gms.measurement.internal;

import p009a8.C0068a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes.dex */
public final class RunnableC3178e6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ boolean f8411A;

    /* renamed from: B */
    final /* synthetic */ C3233j6 f8412B;

    /* renamed from: w */
    final /* synthetic */ C0068a f8413w;

    /* renamed from: x */
    final /* synthetic */ long f8414x;

    /* renamed from: y */
    final /* synthetic */ int f8415y;

    /* renamed from: z */
    final /* synthetic */ long f8416z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3178e6(C3233j6 c3233j6, C0068a c0068a, long j, int i, long j2, boolean z) {
        this.f8412B = c3233j6;
        this.f8413w = c0068a;
        this.f8414x = j;
        this.f8415y = i;
        this.f8416z = j2;
        this.f8411A = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8412B.m31180K(this.f8413w);
        this.f8412B.m31145z(this.f8414x, false);
        C3233j6.m31161d0(this.f8412B, this.f8413w, this.f8415y, this.f8416z, true, this.f8411A);
    }
}
