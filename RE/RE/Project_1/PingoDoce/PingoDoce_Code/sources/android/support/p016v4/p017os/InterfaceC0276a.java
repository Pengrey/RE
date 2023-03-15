package android.support.p016v4.p017os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC0276a extends IInterface {

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0277a extends Binder implements InterfaceC0276a {

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a */
        /* loaded from: classes.dex */
        private static class C0278a implements InterfaceC0276a {

            /* renamed from: a */
            private IBinder f609a;

            C0278a(IBinder iBinder) {
                this.f609a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f609a;
            }
        }

        public AbstractBinderC0277a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: s */
        public static InterfaceC0276a m41375s(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0276a)) {
                return (InterfaceC0276a) queryLocalInterface;
            }
            return new C0278a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo41376O1(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: O1 */
    void mo41376O1(int i, Bundle bundle) throws RemoteException;
}
