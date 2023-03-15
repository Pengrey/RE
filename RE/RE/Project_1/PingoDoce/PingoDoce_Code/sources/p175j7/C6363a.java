package p175j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: j7.a */
/* loaded from: classes.dex */
public class C6363a implements IInterface {

    /* renamed from: a */
    private final IBinder f17406a;

    /* renamed from: b */
    private final String f17407b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    /* JADX INFO: Access modifiers changed from: protected */
    public C6363a(IBinder iBinder, String str) {
        this.f17406a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17406a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final Parcel m21132s() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17407b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final Parcel m21131y(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f17406a.transact(i, parcel, obtain, 0);
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
