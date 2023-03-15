package p251n7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: n7.a */
/* loaded from: classes.dex */
public class C7682a implements IInterface {

    /* renamed from: a */
    private final IBinder f20270a;

    /* renamed from: b */
    private final String f20271b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C7682a(IBinder iBinder, String str) {
        this.f20270a = iBinder;
        this.f20271b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m17725H(int i, Parcel parcel) throws RemoteException {
        try {
            this.f20270a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f20270a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m17724s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20271b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m17723y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f20270a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
