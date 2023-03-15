package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p157i9.InterfaceC6056a;
import p485z7.C13730a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* loaded from: classes.dex */
public final class C4170c implements C13730a.InterfaceC13731a {

    /* renamed from: a */
    final /* synthetic */ C4171d f11388a;

    public C4170c(C4171d c4171d) {
        this.f11388a = c4171d;
    }

    @Override // p009a8.InterfaceC0083p
    /* renamed from: a */
    public final void mo28450a(String str, String str2, Bundle bundle, long j) {
        InterfaceC6056a.InterfaceC6058b interfaceC6058b;
        if (this.f11388a.f11389a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C4169b.m28458a(str2));
            interfaceC6058b = this.f11388a.f11390b;
            interfaceC6058b.mo20488a(2, bundle2);
        }
    }
}
