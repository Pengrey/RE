package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes.dex */
public final class C2710c2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ String f7686A;

    /* renamed from: B */
    final /* synthetic */ Object f7687B;

    /* renamed from: C */
    final /* synthetic */ C2997u2 f7688C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2710c2(C2997u2 c2997u2, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(c2997u2, false);
        this.f7688C = c2997u2;
        this.f7686A = str;
        this.f7687B = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7688C.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).logHealthData(5, this.f7686A, BinderC5870d.m22835S1(this.f7687B), BinderC5870d.m22835S1(null), BinderC5870d.m22835S1(null));
    }
}
