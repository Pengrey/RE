package p418w7;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p440x7.InterfaceC12291a;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: w7.b */
/* loaded from: classes.dex */
public final class C11580b {

    /* renamed from: a */
    private static InterfaceC12291a f29632a;

    /* renamed from: a */
    public static C11579a m4681a(LatLng latLng) {
        C2597i.m33075k(latLng, "latLng must not be null");
        try {
            return new C11579a(m4677e().mo3103O0(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C11579a m4680b(LatLngBounds latLngBounds, int i) {
        C2597i.m33075k(latLngBounds, "bounds must not be null");
        try {
            return new C11579a(m4677e().mo3104K(latLngBounds, i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static C11579a m4679c(LatLng latLng, float f) {
        C2597i.m33075k(latLng, "latLng must not be null");
        try {
            return new C11579a(m4677e().mo3102s1(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public static void m4678d(InterfaceC12291a interfaceC12291a) {
        f29632a = (InterfaceC12291a) C2597i.m33076j(interfaceC12291a);
    }

    /* renamed from: e */
    private static InterfaceC12291a m4677e() {
        return (InterfaceC12291a) C2597i.m33075k(f29632a, "CameraUpdateFactory is not initialized");
    }
}
