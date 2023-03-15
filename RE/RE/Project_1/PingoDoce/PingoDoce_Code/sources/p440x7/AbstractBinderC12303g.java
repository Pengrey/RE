package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p353s7.AbstractBinderC10081h;
import p353s7.BinderC10075b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.g */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12303g extends BinderC10075b implements InterfaceC12305h {
    public AbstractBinderC12303g() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo3113e(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
