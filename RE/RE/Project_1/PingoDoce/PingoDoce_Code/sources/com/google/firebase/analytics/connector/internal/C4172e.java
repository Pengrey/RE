package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p157i9.InterfaceC6056a;
import p485z7.C13730a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes.dex */
public final class C4172e implements C13730a.InterfaceC13731a {

    /* renamed from: a */
    final /* synthetic */ C4173f f11393a;

    public C4172e(C4173f c4173f) {
        this.f11393a = c4173f;
    }

    @Override // p009a8.InterfaceC0083p
    /* renamed from: a */
    public final void mo28450a(String str, String str2, Bundle bundle, long j) {
        InterfaceC6056a.InterfaceC6058b interfaceC6058b;
        if (str == null || str.equals("crash") || !C4169b.m28454e(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        interfaceC6058b = this.f11393a.f11394a;
        interfaceC6058b.mo20488a(3, bundle2);
    }
}
