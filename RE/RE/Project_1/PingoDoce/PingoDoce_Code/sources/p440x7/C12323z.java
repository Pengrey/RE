package p440x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import p133h7.InterfaceC5867b;
import p353s7.AbstractBinderC10081h;
import p353s7.C10074a;
import p353s7.C10076c;
import p353s7.InterfaceC10082i;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.z */
/* loaded from: classes.dex */
public final class C12323z extends C10074a implements InterfaceC12293b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12323z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: B0 */
    public final void mo3078B0(InterfaceC12304g0 interfaceC12304g0) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12304g0);
        m9261H(96, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: G0 */
    public final InterfaceC12297d mo3077G0() throws RemoteException {
        InterfaceC12297d c12317t;
        Parcel m9260s = m9260s(26, m9259y());
        IBinder readStrongBinder = m9260s.readStrongBinder();
        if (readStrongBinder == null) {
            c12317t = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            c12317t = queryLocalInterface instanceof InterfaceC12297d ? (InterfaceC12297d) queryLocalInterface : new C12317t(readStrongBinder);
        }
        m9260s.recycle();
        return c12317t;
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: H1 */
    public final InterfaceC10082i mo3076H1(MarkerOptions markerOptions) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, markerOptions);
        Parcel m9260s = m9260s(11, m9259y);
        InterfaceC10082i m9250y = AbstractBinderC10081h.m9250y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m9250y;
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: Q0 */
    public final void mo3075Q0(InterfaceC12294b0 interfaceC12294b0) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12294b0);
        m9261H(33, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: R0 */
    public final void mo3074R0(InterfaceC5867b interfaceC5867b) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        m9261H(5, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: T0 */
    public final void mo3073T0(InterfaceC12300e0 interfaceC12300e0) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12300e0);
        m9261H(99, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: V0 */
    public final CameraPosition mo3072V0() throws RemoteException {
        Parcel m9260s = m9260s(1, m9259y());
        CameraPosition cameraPosition = (CameraPosition) C10076c.m9258a(m9260s, CameraPosition.CREATOR);
        m9260s.recycle();
        return cameraPosition;
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: a1 */
    public final boolean mo3071a1(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, mapStyleOptions);
        Parcel m9260s = m9260s(91, m9259y);
        boolean m9254e = C10076c.m9254e(m9260s);
        m9260s.recycle();
        return m9254e;
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: c1 */
    public final void mo3070c1(InterfaceC12309l interfaceC12309l) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12309l);
        m9261H(28, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: f0 */
    public final InterfaceC12299e mo3069f0() throws RemoteException {
        InterfaceC12299e c12318u;
        Parcel m9260s = m9260s(25, m9259y());
        IBinder readStrongBinder = m9260s.readStrongBinder();
        if (readStrongBinder == null) {
            c12318u = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c12318u = queryLocalInterface instanceof InterfaceC12299e ? (InterfaceC12299e) queryLocalInterface : new C12318u(readStrongBinder);
        }
        m9260s.recycle();
        return c12318u;
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: l1 */
    public final void mo3068l1(boolean z) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9257b(m9259y, z);
        m9261H(22, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: m0 */
    public final void mo3067m0(InterfaceC12313p interfaceC12313p) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12313p);
        m9261H(30, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: r0 */
    public final void mo3066r0(InterfaceC12315r interfaceC12315r) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12315r);
        m9261H(31, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: t0 */
    public final void mo3065t0(InterfaceC12307j interfaceC12307j) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12307j);
        m9261H(84, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: v1 */
    public final void mo3064v1(InterfaceC12305h interfaceC12305h) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12305h);
        m9261H(32, m9259y);
    }

    @Override // p440x7.InterfaceC12293b
    /* renamed from: y1 */
    public final void mo3063y1(InterfaceC5867b interfaceC5867b) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        m9261H(4, m9259y);
    }
}
