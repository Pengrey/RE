package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2789h1 extends BinderC2916p0 implements InterfaceC2805i1 {
    public AbstractBinderC2789h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2916p0
    /* renamed from: s */
    protected final boolean mo30936s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo32591A((Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
