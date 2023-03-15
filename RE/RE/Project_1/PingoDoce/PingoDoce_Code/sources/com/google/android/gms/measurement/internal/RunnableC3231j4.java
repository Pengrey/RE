package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j4 */
/* loaded from: classes.dex */
public final class RunnableC3231j4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ C3221i5 f8560w;

    /* renamed from: x */
    final /* synthetic */ C3242k4 f8561x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3231j4(C3242k4 c3242k4, C3221i5 c3221i5) {
        this.f8561x = c3242k4;
        this.f8560w = c3221i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3242k4.m31119a(this.f8561x, this.f8560w);
        this.f8561x.m31107m(this.f8560w.f8531g);
    }
}
