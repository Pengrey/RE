package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p009a8.InterfaceC0083p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* loaded from: classes.dex */
public final class BinderC2838k2 extends AbstractBinderC2837k1 {

    /* renamed from: a */
    private final InterfaceC0083p f7812a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2838k2(InterfaceC0083p interfaceC0083p) {
        this.f7812a = interfaceC0083p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853l1
    /* renamed from: N */
    public final void mo32501N(String str, String str2, Bundle bundle, long j) {
        this.f7812a.mo28450a(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853l1
    /* renamed from: b */
    public final int mo32500b() {
        return System.identityHashCode(this.f7812a);
    }
}
