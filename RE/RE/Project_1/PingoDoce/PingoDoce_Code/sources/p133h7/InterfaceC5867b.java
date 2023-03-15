package p133h7;

import android.os.IBinder;
import android.os.IInterface;
import p292p7.BinderC8445b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: h7.b */
/* loaded from: classes.dex */
public interface InterfaceC5867b extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: h7.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC5868a extends BinderC8445b implements InterfaceC5867b {
        public AbstractBinderC5868a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: y */
        public static InterfaceC5867b m22841y(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC5867b ? (InterfaceC5867b) queryLocalInterface : new C5877k(iBinder);
        }
    }
}
