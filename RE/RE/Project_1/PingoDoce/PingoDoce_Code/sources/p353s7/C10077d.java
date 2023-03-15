package p353s7;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.d */
/* loaded from: classes.dex */
public final class C10077d extends C10074a implements InterfaceC10079f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10077d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // p353s7.InterfaceC10079f
    /* renamed from: J0 */
    public final InterfaceC5867b mo9252J0(Bitmap bitmap) throws RemoteException {
        Parcel m9259y = m9259y();
        C10076c.m9256c(m9259y, bitmap);
        Parcel m9260s = m9260s(6, m9259y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }

    @Override // p353s7.InterfaceC10079f
    /* renamed from: x0 */
    public final InterfaceC5867b mo9251x0(int i) throws RemoteException {
        Parcel m9259y = m9259y();
        m9259y.writeInt(i);
        Parcel m9260s = m9260s(1, m9259y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m9260s.readStrongBinder());
        m9260s.recycle();
        return m22841y;
    }
}
