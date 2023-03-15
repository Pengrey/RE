package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes.dex */
final class RunnableC3371w4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzau f9052w;

    /* renamed from: x */
    final /* synthetic */ zzp f9053x;

    /* renamed from: y */
    final /* synthetic */ BinderC3166d5 f9054y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3371w4(BinderC3166d5 binderC3166d5, zzau zzauVar, zzp zzpVar) {
        this.f9054y = binderC3166d5;
        this.f9052w = zzauVar;
        this.f9053x = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9054y.m31405T1(this.f9054y.m31407H(this.f9052w, this.f9053x), this.f9053x);
    }
}
