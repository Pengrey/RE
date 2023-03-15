package p217l7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: l7.d */
/* loaded from: classes.dex */
public class BinderC6995d extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC6995d(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo19639s(i, parcel, parcel2, i2);
    }

    /* renamed from: s */
    protected boolean mo19639s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
    }
}
