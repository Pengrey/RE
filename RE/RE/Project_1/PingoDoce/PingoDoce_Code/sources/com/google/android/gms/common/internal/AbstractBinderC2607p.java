package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p292p7.BinderC8445b;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.p */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2607p extends BinderC8445b implements InterfaceC2593g {
    public AbstractBinderC2607p() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p292p7.BinderC8445b
    /* renamed from: s */
    protected final boolean mo15397s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo33018P1(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C8446c.m15396a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo33017X0(parcel.readInt(), (Bundle) C8446c.m15396a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo33019P(parcel.readInt(), parcel.readStrongBinder(), (zzj) C8446c.m15396a(parcel, zzj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
