package p292p7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: p7.b */
/* loaded from: classes.dex */
public class BinderC8445b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC8445b(String str) {
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
        return mo15397s(i, parcel, parcel2, i2);
    }

    /* renamed from: s */
    protected boolean mo15397s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }
}
