package p353s7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.g */
/* loaded from: classes.dex */
public final class C10080g extends C10074a implements InterfaceC10082i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10080g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: Q1 */
    public final boolean mo9249Q1(InterfaceC10082i interfaceC10082i) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC10082i);
        Parcel m9260s = m9260s(16, m9259y);
        boolean m9254e = C10076c.m9254e(m9260s);
        m9260s.recycle();
        return m9254e;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: c0 */
    public final void mo9248c0(InterfaceC5867b interfaceC5867b) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        m9261H(18, m9259y);
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: d0 */
    public final void mo9247d0(String str) throws RemoteException {
        Parcel m9259y = m9259y();
        m9259y.writeString(str);
        m9261H(5, m9259y);
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: d1 */
    public final void mo9246d1(String str) throws RemoteException {
        Parcel m9259y = m9259y();
        m9259y.writeString(str);
        m9261H(7, m9259y);
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: f */
    public final int mo9245f() throws RemoteException {
        Parcel m9260s = m9260s(17, m9259y());
        int readInt = m9260s.readInt();
        m9260s.recycle();
        return readInt;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: g */
    public final LatLng mo9244g() throws RemoteException {
        Parcel m9260s = m9260s(4, m9259y());
        LatLng latLng = (LatLng) C10076c.m9258a(m9260s, LatLng.CREATOR);
        m9260s.recycle();
        return latLng;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: h */
    public final String mo9243h() throws RemoteException {
        Parcel m9260s = m9260s(6, m9259y());
        String readString = m9260s.readString();
        m9260s.recycle();
        return readString;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: m */
    public final String mo9242m() throws RemoteException {
        Parcel m9260s = m9260s(8, m9259y());
        String readString = m9260s.readString();
        m9260s.recycle();
        return readString;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: p */
    public final boolean mo9241p() throws RemoteException {
        Parcel m9260s = m9260s(13, m9259y());
        boolean m9254e = C10076c.m9254e(m9260s);
        m9260s.recycle();
        return m9254e;
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: q */
    public final void mo9240q() throws RemoteException {
        m9261H(11, m9259y());
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: w1 */
    public final void mo9239w1(LatLng latLng) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, latLng);
        m9261H(3, m9259y);
    }

    @Override // p353s7.InterfaceC10082i
    /* renamed from: x */
    public final void mo9238x() throws RemoteException {
        m9261H(1, m9259y());
    }
}
