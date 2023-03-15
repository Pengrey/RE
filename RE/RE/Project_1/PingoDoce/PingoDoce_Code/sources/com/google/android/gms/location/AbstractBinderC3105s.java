package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.BinderC2668o;
import p331r7.C9824f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3105s extends BinderC2668o implements InterfaceC3106t {
    /* renamed from: y */
    public static InterfaceC3106t m31606y(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof InterfaceC3106t) {
            return (InterfaceC3106t) queryLocalInterface;
        }
        return new C3104r(iBinder);
    }

    @Override // com.google.android.gms.internal.location.BinderC2668o
    /* renamed from: s */
    protected final boolean mo31607s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31605Y((Location) C9824f.m9914b(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
