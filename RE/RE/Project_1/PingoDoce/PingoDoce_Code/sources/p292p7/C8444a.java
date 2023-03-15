package p292p7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: p7.a */
/* loaded from: classes.dex */
public class C8444a implements IInterface {

    /* renamed from: a */
    private final IBinder f21848a;

    /* renamed from: b */
    private final String f21849b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C8444a(IBinder iBinder, String str) {
        this.f21848a = iBinder;
        this.f21849b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21848a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m15399s(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f21848a.transact(i, parcel, obtain, 0);
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
    public final Parcel m15398y() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21849b);
        return obtain;
    }
}
