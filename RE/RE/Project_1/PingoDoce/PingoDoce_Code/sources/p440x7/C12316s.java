package p440x7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p133h7.InterfaceC5867b;
import p353s7.C10074a;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.s */
/* loaded from: classes.dex */
public final class C12316s extends C10074a implements InterfaceC12291a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12316s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p440x7.InterfaceC12291a
    /* renamed from: K */
    public final InterfaceC5867b mo3104K(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, latLngBounds);
        m9259y.writeInt(i);
        Parcel m9260s = m9260s(10, m9259y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }

    @Override // p440x7.InterfaceC12291a
    /* renamed from: O0 */
    public final InterfaceC5867b mo3103O0(LatLng latLng) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, latLng);
        Parcel m9260s = m9260s(8, m9259y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }

    @Override // p440x7.InterfaceC12291a
    /* renamed from: s1 */
    public final InterfaceC5867b mo3102s1(LatLng latLng, float f) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, latLng);
        m9259y.writeFloat(f);
        Parcel m9260s = m9260s(9, m9259y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }
}
