package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import p133h7.BinderC5870d;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes.dex */
final class C2854l2 extends AbstractRunnableC2822j2 {

    /* renamed from: A */
    final /* synthetic */ Bundle f7832A;

    /* renamed from: B */
    final /* synthetic */ Activity f7833B;

    /* renamed from: C */
    final /* synthetic */ C2982t2 f7834C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2854l2(C2982t2 c2982t2, Bundle bundle, Activity activity) {
        super(c2982t2.f8002w, true);
        this.f7834C = c2982t2;
        this.f7832A = bundle;
        this.f7833B = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2822j2
    /* renamed from: a */
    final void mo31730a() throws RemoteException {
        Bundle bundle;
        InterfaceC2757f1 interfaceC2757f1;
        if (this.f7832A != null) {
            bundle = new Bundle();
            if (this.f7832A.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f7832A.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC2757f1 = this.f7834C.f8002w.f8029h;
        ((InterfaceC2757f1) C2597i.m33076j(interfaceC2757f1)).onActivityCreated(BinderC5870d.m22835S1(this.f7833B), bundle, this.f7797x);
    }
}
