package p440x7;

import android.os.Parcel;
import android.os.RemoteException;
import p353s7.BinderC10075b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.d0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC12298d0 extends BinderC10075b implements InterfaceC12300e0 {
    public AbstractBinderC12298d0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // p353s7.BinderC10075b
    /* renamed from: s */
    protected final boolean mo3108s(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
