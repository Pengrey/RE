package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.a */
/* loaded from: classes.dex */
interface InterfaceC2440a extends IInterface {

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    /* renamed from: com.google.android.gms.cloudmessaging.a$a */
    /* loaded from: classes.dex */
    public static class C2441a implements InterfaceC2440a {

        /* renamed from: a */
        private final IBinder f7095a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2441a(IBinder iBinder) {
            this.f7095a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f7095a;
        }

        @Override // com.google.android.gms.cloudmessaging.InterfaceC2440a
        /* renamed from: q0 */
        public void mo33558q0(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f7095a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    /* renamed from: q0 */
    void mo33558q0(Message message) throws RemoteException;
}
