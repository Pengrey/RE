package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* loaded from: classes.dex */
final class C2950r2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ Activity f7961A;

    /* renamed from: B */
    final /* synthetic */ BinderC2693b1 f7962B;

    /* renamed from: C */
    final /* synthetic */ C2982t2 f7963C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950r2(C2982t2 c2982t2, Activity activity, BinderC2693b1 binderC2693b1) {
        super(c2982t2.f8002w, true);
        this.f7963C = c2982t2;
        this.f7961A = activity;
        this.f7962B = binderC2693b1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7963C.f8002w.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).onActivitySaveInstanceState(BinderC5870d.m22835S1(this.f7961A), this.f7962B, this.f7797x);
    }
}
