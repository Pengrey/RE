package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes.dex */
public final class C2948r0 extends C2900o0 implements InterfaceC2980t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2948r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2980t0
    /* renamed from: A */
    public final Bundle mo32090A(Bundle bundle) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, bundle);
        Parcel m32404y = m32404y(1, m32405s);
        Bundle bundle2 = (Bundle) C2932q0.m32199a(m32404y, Bundle.CREATOR);
        m32404y.recycle();
        return bundle2;
    }
}
