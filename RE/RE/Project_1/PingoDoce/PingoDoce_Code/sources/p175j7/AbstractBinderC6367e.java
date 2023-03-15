package p175j7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: j7.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6367e extends BinderC6364b implements InterfaceC6368f {
    /* renamed from: s */
    public static InterfaceC6368f m21128s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC6368f) {
            return (InterfaceC6368f) queryLocalInterface;
        }
        return new C6366d(iBinder);
    }
}
