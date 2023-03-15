package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p353s7.AbstractBinderC10081h;
import p353s7.BinderC10075b;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.o */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12312o extends BinderC10075b implements InterfaceC12313p {
    public AbstractBinderC12312o() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean mo3109e = mo3109e(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C10076c.m9257b(parcel2, mo3109e);
            return true;
        }
        return false;
    }
}
