package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.BinderC2668o;
import p331r7.C9824f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.p */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3102p extends BinderC2668o implements InterfaceC3103q {
    public AbstractBinderC3102p() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: y */
    public static InterfaceC3103q m31610y(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof InterfaceC3103q) {
            return (InterfaceC3103q) queryLocalInterface;
        }
        return new C3101o(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC2668o
    /* renamed from: s */
    protected final boolean mo31607s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31608k0((LocationResult) C9824f.m9914b(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo31609Y0((LocationAvailability) C9824f.m9914b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
