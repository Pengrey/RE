package p236m7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.a */
/* loaded from: classes.dex */
public class C7134a implements IInterface {

    /* renamed from: a */
    private final IBinder f18946a;

    /* renamed from: b */
    private final String f18947b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C7134a(IBinder iBinder, String str) {
        this.f18946a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18946a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m19103s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18947b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m19102y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18946a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
