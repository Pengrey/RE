package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes.dex */
final class RunnableC3144b5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8350w;

    /* renamed from: x */
    final /* synthetic */ BinderC3166d5 f8351x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3144b5(BinderC3166d5 binderC3166d5, zzp zzpVar) {
        this.f8351x = binderC3166d5;
        this.f8350w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8351x.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8351x.f8386a;
        c3137a92.m31469p(this.f8350w);
    }
}
