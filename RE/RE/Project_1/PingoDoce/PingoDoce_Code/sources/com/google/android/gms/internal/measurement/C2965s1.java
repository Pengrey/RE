package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes.dex */
public final class C2965s1 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ Activity f7976A;

    /* renamed from: B */
    final /* synthetic */ String f7977B;

    /* renamed from: C */
    final /* synthetic */ String f7978C;

    /* renamed from: D */
    final /* synthetic */ C2997u2 f7979D;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2965s1(C2997u2 c2997u2, Activity activity, String str, String str2) {
        super(c2997u2, true);
        this.f7979D = c2997u2;
        this.f7976A = activity;
        this.f7977B = str;
        this.f7978C = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7979D.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).setCurrentScreen(BinderC5870d.m22835S1(this.f7976A), this.f7977B, this.f7978C, this.f7796w);
    }
}
