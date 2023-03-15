package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* loaded from: classes.dex */
public final class C2790h2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ Long f7764A;

    /* renamed from: B */
    final /* synthetic */ String f7765B;

    /* renamed from: C */
    final /* synthetic */ String f7766C;

    /* renamed from: D */
    final /* synthetic */ Bundle f7767D;

    /* renamed from: E */
    final /* synthetic */ boolean f7768E;

    /* renamed from: F */
    final /* synthetic */ boolean f7769F;

    /* renamed from: G */
    final /* synthetic */ C2997u2 f7770G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2790h2(C2997u2 c2997u2, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(c2997u2, true);
        this.f7770G = c2997u2;
        this.f7764A = l;
        this.f7765B = str;
        this.f7766C = str2;
        this.f7767D = bundle;
        this.f7768E = z;
        this.f7769F = z2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        Long l = this.f7764A;
        long longValue = l == null ? this.f7796w : l.longValue();
        interfaceC2757f1 = this.f7770G.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).logEvent(this.f7765B, this.f7766C, this.f7767D, this.f7768E, this.f7769F, longValue);
    }
}
