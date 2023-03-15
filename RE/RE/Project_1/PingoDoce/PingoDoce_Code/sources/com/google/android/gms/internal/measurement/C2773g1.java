package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g1 */
/* loaded from: classes.dex */
public final class C2773g1 extends C2900o0 implements InterfaceC2805i1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2773g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2805i1
    /* renamed from: A */
    public final void mo32591A(Bundle bundle) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, bundle);
        m32406H(1, m32405s);
    }
}
