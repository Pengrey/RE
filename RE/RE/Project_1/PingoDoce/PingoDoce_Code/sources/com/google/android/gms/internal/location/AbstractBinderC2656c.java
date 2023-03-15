package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import p331r7.C9824f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.c */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2656c extends BinderC2668o implements InterfaceC2657d {
    public AbstractBinderC2656c() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.BinderC2668o
    /* renamed from: s */
    protected final boolean mo31607s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo31614u1((zzaa) C9824f.m9914b(parcel, zzaa.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo31615a();
        }
        return true;
    }
}
