package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r5 */
/* loaded from: classes.dex */
public final class RunnableC3320r5 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3233j6 f8839A;

    /* renamed from: w */
    final /* synthetic */ String f8840w;

    /* renamed from: x */
    final /* synthetic */ String f8841x;

    /* renamed from: y */
    final /* synthetic */ Object f8842y;

    /* renamed from: z */
    final /* synthetic */ long f8843z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3320r5(C3233j6 c3233j6, String str, String str2, Object obj, long j) {
        this.f8839A = c3233j6;
        this.f8840w = str;
        this.f8841x = str2;
        this.f8842y = obj;
        this.f8843z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8839A.m31177N(this.f8840w, this.f8841x, this.f8842y, this.f8843z);
    }
}
