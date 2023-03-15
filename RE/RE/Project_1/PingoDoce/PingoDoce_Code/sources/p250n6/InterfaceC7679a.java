package p250n6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: n6.a */
/* loaded from: classes.dex */
public interface InterfaceC7679a extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* renamed from: n6.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC7680a extends Binder implements InterfaceC7679a {

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: n6.a$a$a */
        /* loaded from: classes.dex */
        private static class C7681a implements InterfaceC7679a {

            /* renamed from: a */
            private IBinder f20269a;

            C7681a(IBinder iBinder) {
                this.f20269a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f20269a;
            }

            @Override // p250n6.InterfaceC7679a
            /* renamed from: r1 */
            public Bundle mo17726r1(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20269a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: s */
        public static InterfaceC7679a m17727s(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC7679a)) {
                return (InterfaceC7679a) queryLocalInterface;
            }
            return new C7681a(iBinder);
        }
    }

    /* renamed from: r1 */
    Bundle mo17726r1(Bundle bundle) throws RemoteException;
}
