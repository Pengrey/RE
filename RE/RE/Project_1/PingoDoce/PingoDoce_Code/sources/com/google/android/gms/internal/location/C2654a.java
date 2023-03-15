package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.a */
/* loaded from: classes.dex */
public class C2654a implements IInterface {

    /* renamed from: a */
    private final IBinder f7589a;

    /* renamed from: b */
    private final String f7590b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2654a(IBinder iBinder, String str) {
        this.f7589a = iBinder;
        this.f7590b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m32960H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7589a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7589a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m32959s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7590b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel m32958y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7589a.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
