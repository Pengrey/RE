package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2837k1 extends BinderC2916p0 implements InterfaceC2853l1 {
    public AbstractBinderC2837k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2916p0
    /* renamed from: s */
    protected final boolean mo30936s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo32501N(parcel.readString(), parcel.readString(), (Bundle) C2932q0.m32199a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int mo32500b = mo32500b();
            parcel2.writeNoException();
            parcel2.writeInt(mo32500b);
        }
        return true;
    }
}
