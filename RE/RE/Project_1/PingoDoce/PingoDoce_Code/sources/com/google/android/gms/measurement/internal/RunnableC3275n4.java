package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* loaded from: classes.dex */
final class RunnableC3275n4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzab f8702w;

    /* renamed from: x */
    final /* synthetic */ BinderC3166d5 f8703x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3275n4(BinderC3166d5 binderC3166d5, zzab zzabVar) {
        this.f8703x = binderC3166d5;
        this.f8702w = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        C3137a9 c3137a93;
        c3137a9 = this.f8703x.f8386a;
        c3137a9.m31490a();
        if (this.f8702w.f9172y.m30815h() == null) {
            c3137a93 = this.f8703x.f8386a;
            c3137a93.m31467r(this.f8702w);
            return;
        }
        c3137a92 = this.f8703x.f8386a;
        c3137a92.m31461x(this.f8702w);
    }
}
