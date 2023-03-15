package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes.dex */
public final class C2742e2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7716A;

    /* renamed from: B */
    final /* synthetic */ BinderC2693b1 f7717B;

    /* renamed from: C */
    final /* synthetic */ C2997u2 f7718C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2742e2(C2997u2 c2997u2, String str, BinderC2693b1 binderC2693b1) {
        super(c2997u2, true);
        this.f7718C = c2997u2;
        this.f7716A = str;
        this.f7717B = binderC2693b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7718C.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).getMaxUserProperties(this.f7716A, this.f7717B);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: b */
    protected final void mo31729b() {
        this.f7717B.mo32591A(null);
    }
}
