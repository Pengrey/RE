package p440x7;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import p353s7.C10074a;
import p353s7.C10076c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: x7.t */
/* loaded from: classes.dex */
public final class C12317t extends C10074a implements InterfaceC12297d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12317t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p440x7.InterfaceC12297d
    /* renamed from: n1 */
    public final VisibleRegion mo3101n1() throws RemoteException {
        Parcel m9260s = m9260s(3, m9259y());
        VisibleRegion visibleRegion = (VisibleRegion) C10076c.m9258a(m9260s, VisibleRegion.CREATOR);
        m9260s.recycle();
        return visibleRegion;
    }
}
