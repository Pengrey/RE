package p153i5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: i5.a */
/* loaded from: classes.dex */
public interface InterfaceC6017a extends IInterface {

    /* compiled from: IReceiverService.java */
    /* renamed from: i5.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC6018a extends Binder implements InterfaceC6017a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IReceiverService.java */
        /* renamed from: i5.a$a$a */
        /* loaded from: classes.dex */
        public static class C6019a implements InterfaceC6017a {

            /* renamed from: b */
            public static InterfaceC6017a f16624b;

            /* renamed from: a */
            private IBinder f16625a;

            C6019a(IBinder iBinder) {
                this.f16625a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f16625a;
            }

            @Override // p153i5.InterfaceC6017a
            /* renamed from: h0 */
            public int mo22347h0(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f16625a.transact(1, obtain, obtain2, 0) && AbstractBinderC6018a.m22348y() != null) {
                        return AbstractBinderC6018a.m22348y().mo22347h0(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: s */
        public static InterfaceC6017a m22349s(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC6017a)) {
                return (InterfaceC6017a) queryLocalInterface;
            }
            return new C6019a(iBinder);
        }

        /* renamed from: y */
        public static InterfaceC6017a m22348y() {
            return C6019a.f16624b;
        }
    }

    /* renamed from: h0 */
    int mo22347h0(Bundle bundle) throws RemoteException;
}
