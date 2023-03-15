package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.BinderC2668o;
import p400v7.InterfaceC11132d;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.n */
/* loaded from: classes.dex */
public class BinderC3100n extends BinderC2668o implements InterfaceC11132d {
    /* renamed from: y */
    public static InterfaceC11132d m31611y(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof InterfaceC11132d) {
            return (InterfaceC11132d) queryLocalInterface;
        }
        return new C3099m(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC2668o
    /* renamed from: s */
    protected final boolean mo31607s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
