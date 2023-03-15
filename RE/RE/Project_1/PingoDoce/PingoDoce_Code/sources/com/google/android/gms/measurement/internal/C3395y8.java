package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.y8 */
/* loaded from: classes.dex */
public final class C3395y8 implements InterfaceC3192f9 {

    /* renamed from: a */
    final /* synthetic */ C3137a9 f9139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3395y8(C3137a9 c3137a9) {
        this.f9139a = c3137a9;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3192f9
    /* renamed from: a */
    public final void mo30835a(String str, String str2, Bundle bundle) {
        C3242k4 c3242k4;
        C3242k4 c3242k42;
        if (!TextUtils.isEmpty(str)) {
            this.f9139a.mo31118b().m31239z(new RunnableC3385x8(this, str, "_err", bundle));
            return;
        }
        C3137a9 c3137a9 = this.f9139a;
        c3242k4 = c3137a9.f8327l;
        if (c3242k4 != null) {
            c3242k42 = c3137a9.f8327l;
            c3242k42.mo31116d().m31332r().m31397b("AppId not known when logging event", "_err");
        }
    }
}
