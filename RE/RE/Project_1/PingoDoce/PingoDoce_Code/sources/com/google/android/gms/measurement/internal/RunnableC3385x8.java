package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes.dex */
final class RunnableC3385x8 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ String f9112w;

    /* renamed from: x */
    final /* synthetic */ String f9113x = "_err";

    /* renamed from: y */
    final /* synthetic */ Bundle f9114y;

    /* renamed from: z */
    final /* synthetic */ C3395y8 f9115z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3385x8(C3395y8 c3395y8, String str, String str2, Bundle bundle) {
        this.f9115z = c3395y8;
        this.f9112w = str;
        this.f9114y = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9115z.f9139a.m31477j((zzau) C2597i.m33076j(this.f9115z.f9139a.m31482g0().m31266w0(this.f9112w, this.f9113x, this.f9114y, "auto", this.f9115z.f9139a.mo31115e().mo25914a(), false, true)), this.f9112w);
    }
}
