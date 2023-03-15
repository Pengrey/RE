package p353s7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.a */
/* loaded from: classes.dex */
public class C10074a implements IInterface {

    /* renamed from: a */
    private final IBinder f26338a;

    /* renamed from: b */
    private final String f26339b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C10074a(IBinder iBinder, String str) {
        this.f26338a = iBinder;
        this.f26339b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final void m9261H(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26338a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f26338a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m9260s(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f26338a.transact(i, parcel, obtain, 0);
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel m9259y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26339b);
        return obtain;
    }
}
