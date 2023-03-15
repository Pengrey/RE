package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* loaded from: classes.dex */
public final class RunnableC3202g8 implements Runnable {

    /* renamed from: w */
    final long f8472w;

    /* renamed from: x */
    final long f8473x;

    /* renamed from: y */
    final /* synthetic */ C3213h8 f8474y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3202g8(C3213h8 c3213h8, long j, long j2) {
        this.f8474y = c3213h8;
        this.f8472w = j;
        this.f8473x = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8474y.f8506b.f8410a.mo31118b().m31239z(new Runnable() { // from class: com.google.android.gms.measurement.internal.f8
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC3202g8 runnableC3202g8 = RunnableC3202g8.this;
                C3213h8 c3213h8 = runnableC3202g8.f8474y;
                long j = runnableC3202g8.f8472w;
                long j2 = runnableC3202g8.f8473x;
                c3213h8.f8506b.mo30825h();
                c3213h8.f8506b.f8410a.mo31116d().m31333q().m31398a("Application going to the background");
                c3213h8.f8506b.f8410a.m31132F().f8973q.m31057a(true);
                Bundle bundle = new Bundle();
                if (!c3213h8.f8506b.f8410a.m31094z().m31371D()) {
                    c3213h8.f8506b.f8688e.m31143b(j2);
                    c3213h8.f8506b.f8688e.m31141d(false, false, j2);
                }
                c3213h8.f8506b.f8410a.m31129I().m31149v("auto", "_ab", j, bundle);
            }
        });
    }
}
