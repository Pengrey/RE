package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes.dex */
public final class C3355u8 implements InterfaceC3219i3 {

    /* renamed from: a */
    final /* synthetic */ String f9032a;

    /* renamed from: b */
    final /* synthetic */ C3137a9 f9033b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3355u8(C3137a9 c3137a9, String str) {
        this.f9033b = c3137a9;
        this.f9032a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3219i3
    /* renamed from: a */
    public final void mo30927a(String str, int i, Throwable th2, byte[] bArr, Map map) {
        this.f9033b.m31470o(i, th2, bArr, this.f9032a);
    }
}
