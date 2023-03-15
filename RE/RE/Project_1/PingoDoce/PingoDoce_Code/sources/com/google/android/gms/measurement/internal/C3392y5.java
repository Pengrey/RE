package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes.dex */
public final class C3392y5 implements InterfaceC3192f9 {

    /* renamed from: a */
    final /* synthetic */ C3233j6 f9125a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3392y5(C3233j6 c3233j6) {
        this.f9125a = c3233j6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3192f9
    /* renamed from: a */
    public final void mo30835a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f9125a.m31151t("auto", "_err", bundle, str);
        } else {
            this.f9125a.m31153r("auto", "_err", bundle);
        }
    }
}
