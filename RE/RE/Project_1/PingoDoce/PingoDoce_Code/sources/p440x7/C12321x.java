package p440x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import p133h7.InterfaceC5867b;
import p353s7.AbstractBinderC10078e;
import p353s7.C10074a;
import p353s7.C10076c;
import p353s7.InterfaceC10079f;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.x */
/* loaded from: classes.dex */
public final class C12321x extends C10074a implements InterfaceC12322y {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12321x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: A1 */
    public final void mo3084A1(InterfaceC5867b interfaceC5867b, int i) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        m9259y.writeInt(i);
        m9261H(10, m9259y);
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: Z0 */
    public final void mo3083Z0(InterfaceC5867b interfaceC5867b, int i) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        m9259y.writeInt(i);
        m9261H(6, m9259y);
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: b */
    public final int mo3082b() throws RemoteException {
        Parcel m9260s = m9260s(9, m9259y());
        int readInt = m9260s.readInt();
        m9260s.recycle();
        return readInt;
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: d */
    public final InterfaceC12291a mo3081d() throws RemoteException {
        InterfaceC12291a c12316s;
        Parcel m9260s = m9260s(4, m9259y());
        IBinder readStrongBinder = m9260s.readStrongBinder();
        if (readStrongBinder == null) {
            c12316s = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            c12316s = queryLocalInterface instanceof InterfaceC12291a ? (InterfaceC12291a) queryLocalInterface : new C12316s(readStrongBinder);
        }
        m9260s.recycle();
        return c12316s;
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: g1 */
    public final InterfaceC12295c mo3080g1(InterfaceC5867b interfaceC5867b, GoogleMapOptions googleMapOptions) throws RemoteException {
        InterfaceC12295c c12296c0;
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC5867b);
        C10076c.m9256c(m9259y, googleMapOptions);
        Parcel m9260s = m9260s(3, m9259y);
        IBinder readStrongBinder = m9260s.readStrongBinder();
        if (readStrongBinder == null) {
            c12296c0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c12296c0 = queryLocalInterface instanceof InterfaceC12295c ? (InterfaceC12295c) queryLocalInterface : new C12296c0(readStrongBinder);
        }
        m9260s.recycle();
        return c12296c0;
    }

    @Override // p440x7.InterfaceC12322y
    /* renamed from: l */
    public final InterfaceC10079f mo3079l() throws RemoteException {
        Parcel m9260s = m9260s(5, m9259y());
        InterfaceC10079f m9253y = AbstractBinderC10078e.m9253y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m9253y;
    }
}
