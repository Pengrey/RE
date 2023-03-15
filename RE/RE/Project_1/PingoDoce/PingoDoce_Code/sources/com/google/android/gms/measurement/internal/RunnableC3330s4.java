package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* loaded from: classes.dex */
final class RunnableC3330s4 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ zzp f8868w;

    /* renamed from: x */
    final /* synthetic */ BinderC3166d5 f8869x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3330s4(BinderC3166d5 binderC3166d5, zzp zzpVar) {
        this.f8869x = binderC3166d5;
        this.f8868w = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        c3137a9 = this.f8869x.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f8869x.f8386a;
        c3137a92.m31464u(this.f8868w);
    }
}
