package p217l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: l7.a */
/* loaded from: classes.dex */
public class C6992a implements IInterface {

    /* renamed from: a */
    private final IBinder f18604a;

    /* renamed from: b */
    private final String f18605b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6992a(IBinder iBinder, String str) {
        this.f18604a = iBinder;
        this.f18605b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18604a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m19643s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18605b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m19642y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18604a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
