package p353s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.h */
/* loaded from: classes.dex */
public abstract class AbstractBinderC10081h extends BinderC10075b implements InterfaceC10082i {
    /* renamed from: y */
    public static InterfaceC10082i m9250y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof InterfaceC10082i ? (InterfaceC10082i) queryLocalInterface : new C10080g(iBinder);
    }
}
