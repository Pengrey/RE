package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes.dex */
final class C2902o2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ Activity f7907A;

    /* renamed from: B */
    final /* synthetic */ C2982t2 f7908B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2902o2(C2982t2 c2982t2, Activity activity) {
        super(c2982t2.f8002w, true);
        this.f7908B = c2982t2;
        this.f7907A = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        InterfaceC2757f1 interfaceC2757f1;
        interfaceC2757f1 = this.f7908B.f8002w.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).onActivityPaused(BinderC5870d.m22835S1(this.f7907A), this.f7797x);
    }
}
