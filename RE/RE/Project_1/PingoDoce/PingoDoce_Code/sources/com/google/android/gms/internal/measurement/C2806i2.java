package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes.dex */
public final class C2806i2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7778A;

    /* renamed from: B */
    final /* synthetic */ String f7779B;

    /* renamed from: C */
    final /* synthetic */ Object f7780C;

    /* renamed from: D */
    final /* synthetic */ boolean f7781D;

    /* renamed from: E */
    final /* synthetic */ C2997u2 f7782E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2806i2(C2997u2 c2997u2, String str, String str2, Object obj, boolean z) {
        super(c2997u2, true);
        this.f7782E = c2997u2;
        this.f7778A = str;
        this.f7779B = str2;
        this.f7780C = obj;
        this.f7781D = z;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7782E.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).setUserProperty(this.f7778A, this.f7779B, BinderC5870d.m22835S1(this.f7780C), this.f7781D, this.f7796w);
    }
}
