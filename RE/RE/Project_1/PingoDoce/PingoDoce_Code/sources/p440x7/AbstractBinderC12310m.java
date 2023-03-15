package p440x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p353s7.BinderC10075b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.m */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12310m extends BinderC10075b implements InterfaceC12311n {
    public AbstractBinderC12310m() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC12293b c12323z;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c12323z = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                c12323z = queryLocalInterface instanceof InterfaceC12293b ? (InterfaceC12293b) queryLocalInterface : new C12323z(readStrongBinder);
            }
            mo3110U(c12323z);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
