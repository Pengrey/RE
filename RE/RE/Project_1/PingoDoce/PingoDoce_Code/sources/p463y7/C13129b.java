package p463y7;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p353s7.InterfaceC10079f;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.b */
/* loaded from: classes.dex */
public final class C13129b {

    /* renamed from: a */
    private static InterfaceC10079f f34090a;

    /* renamed from: a */
    public static C13128a m1564a(Bitmap bitmap) {
        C2597i.m33075k(bitmap, "image must not be null");
        try {
            return new C13128a(m1561d().mo9252J0(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public static C13128a m1563b(int i) {
        try {
            return new C13128a(m1561d().mo9251x0(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public static void m1562c(InterfaceC10079f interfaceC10079f) {
        if (f34090a != null) {
            return;
        }
        f34090a = (InterfaceC10079f) C2597i.m33075k(interfaceC10079f, "delegate must not be null");
    }

    /* renamed from: d */
    private static InterfaceC10079f m1561d() {
        return (InterfaceC10079f) C2597i.m33075k(f34090a, "IBitmapDescriptorFactory is not initialized");
    }
}
