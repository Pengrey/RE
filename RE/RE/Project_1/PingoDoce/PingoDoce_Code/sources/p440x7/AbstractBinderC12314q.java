package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p353s7.AbstractBinderC10081h;
import p353s7.BinderC10075b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.q */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12314q extends BinderC10075b implements InterfaceC12315r {
    public AbstractBinderC12314q() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo3106o1(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo3107e(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            mo3105v(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
