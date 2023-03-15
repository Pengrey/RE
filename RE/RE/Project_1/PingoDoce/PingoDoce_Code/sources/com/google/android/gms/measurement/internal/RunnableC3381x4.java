package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x4 */
/* loaded from: classes.dex */
final class RunnableC3381x4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzau f9095w;

    /* renamed from: x */
    final /* synthetic */ String f9096x;

    /* renamed from: y */
    final /* synthetic */ BinderC3166d5 f9097y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3381x4(BinderC3166d5 binderC3166d5, zzau zzauVar, String str) {
        this.f9097y = binderC3166d5;
        this.f9095w = zzauVar;
        this.f9096x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f9097y.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f9097y.f8386a;
        c3137a92.m31477j(this.f9095w, this.f9096x);
    }
}
