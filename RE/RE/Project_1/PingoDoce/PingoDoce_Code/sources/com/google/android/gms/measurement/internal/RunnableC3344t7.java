package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes.dex */
final class RunnableC3344t7 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ ServiceConnectionC3364v7 f9015w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3344t7(ServiceConnectionC3364v7 serviceConnectionC3364v7) {
        this.f9015w = serviceConnectionC3364v7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3374w7 c3374w7 = this.f9015w.f9046c;
        Context mo31117c = c3374w7.f8410a.mo31117c();
        this.f9015w.f9046c.f8410a.mo31114f();
        C3374w7.m30875M(c3374w7, new ComponentName(mo31117c, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
