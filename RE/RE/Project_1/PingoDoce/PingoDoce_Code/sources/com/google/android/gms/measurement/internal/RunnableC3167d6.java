package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d6 */
/* loaded from: classes.dex */
public final class RunnableC3167d6 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ Boolean f8389w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8390x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3167d6(C3233j6 c3233j6, Boolean bool) {
        this.f8390x = c3233j6;
        this.f8389w = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8390x.m31174Q(this.f8389w, true);
    }
}
