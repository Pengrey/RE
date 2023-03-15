package p353s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: s7.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC10078e extends BinderC10075b implements InterfaceC10079f {
    /* renamed from: y */
    public static InterfaceC10079f m9253y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof InterfaceC10079f ? (InterfaceC10079f) queryLocalInterface : new C10077d(iBinder);
    }
}
