package p440x7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p353s7.C10074a;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.c0 */
/* loaded from: classes.dex */
public final class C12296c0 extends C10074a implements InterfaceC12295c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12296c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: B */
    public final void mo3122B() throws RemoteException {
        m9261H(4, m9259y());
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: F */
    public final void mo3121F() throws RemoteException {
        m9261H(5, m9259y());
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: G */
    public final void mo3120G(Bundle bundle) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, bundle);
        m9261H(2, m9259y);
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: L0 */
    public final void mo3119L0(InterfaceC12311n interfaceC12311n) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9255d(m9259y, interfaceC12311n);
        m9261H(9, m9259y);
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: j */
    public final InterfaceC5867b mo3118j() throws RemoteException {
        Parcel m9260s = m9260s(8, m9259y());
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }

    @Override // p440x7.InterfaceC12295c
    /* renamed from: k */
    public final void mo3117k() throws RemoteException {
        m9261H(3, m9259y());
    }

    @Override // p440x7.InterfaceC12295c
    public final void onLowMemory() throws RemoteException {
        m9261H(6, m9259y());
    }
}
