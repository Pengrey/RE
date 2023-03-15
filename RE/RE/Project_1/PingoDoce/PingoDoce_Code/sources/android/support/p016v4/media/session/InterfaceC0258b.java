package android.support.p016v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0258b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0259a extends Binder implements InterfaceC0258b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        private static class C0260a implements InterfaceC0258b {

            /* renamed from: a */
            private IBinder f597a;

            C0260a(IBinder iBinder) {
                this.f597a = iBinder;
            }

            @Override // android.support.p016v4.media.session.InterfaceC0258b
            /* renamed from: O */
            public void mo41430O(InterfaceC0256a interfaceC0256a) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0256a != null ? interfaceC0256a.asBinder() : null);
                    this.f597a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f597a;
            }
        }

        /* renamed from: s */
        public static InterfaceC0258b m41431s(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0258b)) {
                return (InterfaceC0258b) queryLocalInterface;
            }
            return new C0260a(iBinder);
        }
    }

    /* renamed from: O */
    void mo41430O(InterfaceC0256a interfaceC0256a) throws RemoteException;
}
