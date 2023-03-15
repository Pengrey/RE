package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b2 */
/* loaded from: classes.dex */
public final class C2694b2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7657A;

    /* renamed from: B */
    final /* synthetic */ String f7658B;

    /* renamed from: C */
    final /* synthetic */ boolean f7659C;

    /* renamed from: D */
    final /* synthetic */ BinderC2693b1 f7660D;

    /* renamed from: E */
    final /* synthetic */ C2997u2 f7661E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2694b2(C2997u2 c2997u2, String str, String str2, boolean z, BinderC2693b1 binderC2693b1) {
        super(c2997u2, true);
        this.f7661E = c2997u2;
        this.f7657A = str;
        this.f7658B = str2;
        this.f7659C = z;
        this.f7660D = binderC2693b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7661E.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).getUserProperties(this.f7657A, this.f7658B, this.f7659C, this.f7660D);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: b */
    protected final void mo31729b() {
        this.f7660D.mo32591A(null);
    }
}
