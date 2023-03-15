package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m4 */
/* loaded from: classes.dex */
final class RunnableC3264m4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzab f8673w;

    /* renamed from: x */
    final /* synthetic */ zzp f8674x;

    /* renamed from: y */
    final /* synthetic */ BinderC3166d5 f8675y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3264m4(BinderC3166d5 binderC3166d5, zzab zzabVar, zzp zzpVar) {
        this.f8675y = binderC3166d5;
        this.f8673w = zzabVar;
        this.f8674x = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        C3137a9 c3137a93;
        c3137a9 = this.f8675y.f8386a;
        c3137a9.m31490a();
        if (this.f8673w.f9172y.m30815h() == null) {
            c3137a93 = this.f8675y.f8386a;
            c3137a93.m31466s(this.f8673w, this.f8674x);
            return;
        }
        c3137a92 = this.f8675y.f8386a;
        c3137a92.m31460y(this.f8673w, this.f8674x);
    }
}
