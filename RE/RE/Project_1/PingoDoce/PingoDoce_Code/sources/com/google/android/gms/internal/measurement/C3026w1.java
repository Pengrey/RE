package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.w1 */
/* loaded from: classes.dex */
public final class C3026w1 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ BinderC2693b1 f8066A;

    /* renamed from: B */
    final /* synthetic */ C2997u2 f8067B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3026w1(C2997u2 c2997u2, BinderC2693b1 binderC2693b1) {
        super(c2997u2, true);
        this.f8067B = c2997u2;
        this.f8066A = binderC2693b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f8067B.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).getGmpAppId(this.f8066A);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: b */
    protected final void mo31729b() {
        this.f8066A.mo32591A(null);
    }
}
