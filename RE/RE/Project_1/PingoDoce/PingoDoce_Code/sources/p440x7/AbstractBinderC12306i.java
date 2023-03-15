package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p353s7.AbstractBinderC10081h;
import p353s7.BinderC10075b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.i */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12306i extends BinderC10075b implements InterfaceC12307j {
    public AbstractBinderC12306i() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo3112e(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
