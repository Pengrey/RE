package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p353s7.AbstractBinderC10081h;
import p353s7.BinderC10075b;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.a0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12292a0 extends BinderC10075b implements InterfaceC12294b0 {
    public AbstractBinderC12292a0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC5867b mo3123v = mo3123v(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C10076c.m9255d(parcel2, mo3123v);
        } else if (i != 2) {
            return false;
        } else {
            InterfaceC5867b mo3124e = mo3124e(AbstractBinderC10081h.m9250y(parcel.readStrongBinder()));
            parcel2.writeNoException();
            C10076c.m9255d(parcel2, mo3124e);
        }
        return true;
    }
}
