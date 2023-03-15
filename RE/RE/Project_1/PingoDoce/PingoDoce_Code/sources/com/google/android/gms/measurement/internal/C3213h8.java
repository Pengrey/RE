package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes.dex */
public final class C3213h8 {

    /* renamed from: a */
    private RunnableC3202g8 f8505a;

    /* renamed from: b */
    final /* synthetic */ C3268m8 f8506b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3213h8(C3268m8 c3268m8) {
        this.f8506b = c3268m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31257a(long j) {
        Handler handler;
        this.f8505a = new RunnableC3202g8(this, this.f8506b.f8410a.mo31115e().mo25914a(), j);
        handler = this.f8506b.f8686c;
        handler.postDelayed(this.f8505a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31256b() {
        Handler handler;
        this.f8506b.mo30825h();
        RunnableC3202g8 runnableC3202g8 = this.f8505a;
        if (runnableC3202g8 != null) {
            handler = this.f8506b.f8686c;
            handler.removeCallbacks(runnableC3202g8);
        }
        this.f8506b.f8410a.m31132F().f8973q.m31057a(false);
    }
}
