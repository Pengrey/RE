package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p292p7.BinderC8445b;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.j0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2600j0 extends BinderC8445b implements InterfaceC2602k0 {
    public AbstractBinderC2600j0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: y */
    public static InterfaceC2602k0 m33062y(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof InterfaceC2602k0 ? (InterfaceC2602k0) queryLocalInterface : new C2598i0(iBinder);
    }

    @Override // p292p7.BinderC8445b
    /* renamed from: s */
    protected final boolean mo15397s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC5867b mo33010b = mo33010b();
            parcel2.writeNoException();
            C8446c.m15393d(parcel2, mo33010b);
        } else if (i != 2) {
            return false;
        } else {
            int mo33011a = mo33011a();
            parcel2.writeNoException();
            parcel2.writeInt(mo33011a);
        }
        return true;
    }
}
