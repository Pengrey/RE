package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p353s7.BinderC10075b;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.k */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12308k extends BinderC10075b implements InterfaceC12309l {
    public AbstractBinderC12308k() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo3111p0((LatLng) C10076c.m9258a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
