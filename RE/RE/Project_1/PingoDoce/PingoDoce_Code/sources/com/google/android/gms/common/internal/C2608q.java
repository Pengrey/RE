package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.q */
/* loaded from: classes.dex */
final class C2608q implements InterfaceC2595h {

    /* renamed from: a */
    private final IBinder f7515a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2608q(IBinder iBinder) {
        this.f7515a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7515a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2595h
    /* renamed from: y0 */
    public final void mo33061y0(InterfaceC2593g interfaceC2593g, GetServiceRequest getServiceRequest) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC2593g != null ? interfaceC2593g.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                C2585c0.m33119a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f7515a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
