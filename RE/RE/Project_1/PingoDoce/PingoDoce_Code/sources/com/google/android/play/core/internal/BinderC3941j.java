package com.google.android.play.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.j */
/* loaded from: classes.dex */
public class BinderC3941j extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC3941j(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo28536s(i, parcel);
    }

    /* renamed from: s */
    protected boolean mo28536s(int i, Parcel parcel) throws RemoteException {
        throw null;
    }
}
