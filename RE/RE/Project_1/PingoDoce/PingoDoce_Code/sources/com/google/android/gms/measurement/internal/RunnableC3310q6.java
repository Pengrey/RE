package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes.dex */
public final class RunnableC3310q6 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3373w6 f8813A;

    /* renamed from: w */
    final /* synthetic */ Bundle f8814w;

    /* renamed from: x */
    final /* synthetic */ C3299p6 f8815x;

    /* renamed from: y */
    final /* synthetic */ C3299p6 f8816y;

    /* renamed from: z */
    final /* synthetic */ long f8817z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3310q6(C3373w6 c3373w6, Bundle bundle, C3299p6 c3299p6, C3299p6 c3299p62, long j) {
        this.f8813A = c3373w6;
        this.f8814w = bundle;
        this.f8815x = c3299p6;
        this.f8816y = c3299p62;
        this.f8817z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3373w6.m30890x(this.f8813A, this.f8814w, this.f8815x, this.f8816y, this.f8817z);
    }
}
