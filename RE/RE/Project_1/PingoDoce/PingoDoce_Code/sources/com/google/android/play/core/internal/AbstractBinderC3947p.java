package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.p */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3947p extends BinderC3941j implements InterfaceC3948q {
    public AbstractBinderC3947p() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // com.google.android.play.core.internal.BinderC3941j
    /* renamed from: s */
    protected final boolean mo28536s(int i, Parcel parcel) throws RemoteException {
        InterfaceC3950s interfaceC3950s = null;
        if (i == 2) {
            Bundle bundle = (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                interfaceC3950s = queryLocalInterface instanceof InterfaceC3950s ? (InterfaceC3950s) queryLocalInterface : new C3949r(readStrongBinder);
            }
            mo28534v0(bundle, interfaceC3950s);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) C1869z.m35242a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                interfaceC3950s = queryLocalInterface2 instanceof InterfaceC3950s ? (InterfaceC3950s) queryLocalInterface2 : new C3949r(readStrongBinder2);
            }
            mo28535f1(interfaceC3950s);
            return true;
        }
    }
}
