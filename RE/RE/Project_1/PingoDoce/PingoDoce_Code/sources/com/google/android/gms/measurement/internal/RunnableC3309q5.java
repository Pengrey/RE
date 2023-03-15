package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q5 */
/* loaded from: classes.dex */
public final class RunnableC3309q5 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ boolean f8804A;

    /* renamed from: B */
    final /* synthetic */ boolean f8805B;

    /* renamed from: C */
    final /* synthetic */ boolean f8806C;

    /* renamed from: D */
    final /* synthetic */ String f8807D;

    /* renamed from: E */
    final /* synthetic */ C3233j6 f8808E;

    /* renamed from: w */
    final /* synthetic */ String f8809w;

    /* renamed from: x */
    final /* synthetic */ String f8810x;

    /* renamed from: y */
    final /* synthetic */ long f8811y;

    /* renamed from: z */
    final /* synthetic */ Bundle f8812z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3309q5(C3233j6 c3233j6, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f8808E = c3233j6;
        this.f8809w = str;
        this.f8810x = str2;
        this.f8811y = j;
        this.f8812z = bundle;
        this.f8804A = z;
        this.f8805B = z2;
        this.f8806C = z3;
        this.f8807D = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8808E.m31148w(this.f8809w, this.f8810x, this.f8811y, this.f8812z, this.f8804A, this.f8805B, this.f8806C, this.f8807D);
    }
}
