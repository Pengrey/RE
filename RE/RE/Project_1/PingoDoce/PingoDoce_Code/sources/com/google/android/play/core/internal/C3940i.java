package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.i */
/* loaded from: classes.dex */
public class C3940i implements IInterface {

    /* renamed from: a */
    private final IBinder f11234a;

    /* renamed from: b */
    private final String f11235b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3940i(IBinder iBinder, String str) {
        this.f11234a = iBinder;
        this.f11235b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11234a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m28559s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11235b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m28558y(int i, Parcel parcel) throws RemoteException {
        try {
            this.f11234a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
