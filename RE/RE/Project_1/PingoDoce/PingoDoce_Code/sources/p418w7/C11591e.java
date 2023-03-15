package p418w7;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import p440x7.InterfaceC12297d;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: w7.e */
/* loaded from: classes.dex */
public final class C11591e {

    /* renamed from: a */
    private final InterfaceC12297d f29635a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11591e(InterfaceC12297d interfaceC12297d) {
        this.f29635a = interfaceC12297d;
    }

    /* renamed from: a */
    public VisibleRegion m4651a() {
        try {
            return this.f29635a.mo3101n1();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
