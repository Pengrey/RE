package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* loaded from: classes.dex */
public final class C2949r1 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7957A;

    /* renamed from: B */
    final /* synthetic */ String f7958B;

    /* renamed from: C */
    final /* synthetic */ BinderC2693b1 f7959C;

    /* renamed from: D */
    final /* synthetic */ C2997u2 f7960D;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2949r1(C2997u2 c2997u2, String str, String str2, BinderC2693b1 binderC2693b1) {
        super(c2997u2, true);
        this.f7960D = c2997u2;
        this.f7957A = str;
        this.f7958B = str2;
        this.f7959C = binderC2693b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7960D.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).getConditionalUserProperties(this.f7957A, this.f7958B, this.f7959C);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: b */
    protected final void mo31729b() {
        this.f7959C.mo32591A(null);
    }
}
