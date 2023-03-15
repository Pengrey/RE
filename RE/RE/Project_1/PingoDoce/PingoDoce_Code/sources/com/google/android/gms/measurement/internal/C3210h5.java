package com.google.android.gms.measurement.internal;

import android.util.Log;
import p009a8.InterfaceC0070c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes.dex */
public final class C3210h5 implements InterfaceC0070c {

    /* renamed from: a */
    final /* synthetic */ C3242k4 f8498a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3210h5(C3221i5 c3221i5, C3242k4 c3242k4) {
        this.f8498a = c3242k4;
    }

    @Override // p009a8.InterfaceC0070c
    public final boolean zza() {
        return this.f8498a.m31103q() && Log.isLoggable(this.f8498a.mo31116d().m31340C(), 3);
    }
}
