package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes.dex */
public class C2900o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f7905a;

    /* renamed from: b */
    private final String f7906b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2900o0(IBinder iBinder, String str) {
        this.f7905a = iBinder;
        this.f7906b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m32406H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7905a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7905a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m32405s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7906b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel m32404y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7905a.transact(i, parcel, obtain, 0);
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
