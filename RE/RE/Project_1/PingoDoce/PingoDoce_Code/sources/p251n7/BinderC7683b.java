package p251n7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: n7.b */
/* loaded from: classes.dex */
public class BinderC7683b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public BinderC7683b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: S1 */
    protected boolean mo17722S1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw null;
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
        return mo17722S1(i, parcel, parcel2, i2);
    }
}
