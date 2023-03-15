package p288p3;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.C0928a;
import p288p3.InterfaceC8407d;
import p396v3.C11092d;
import p396v3.C11095g;
import p396v3.InterfaceC11108q;

/* renamed from: p3.e */
/* loaded from: classes.dex */
public final class C8409e {
    /* renamed from: a */
    public static final InterfaceC8407d m15476a(Context context, InterfaceC8407d.InterfaceC8408a interfaceC8408a, InterfaceC11108q interfaceC11108q) {
        ConnectivityManager connectivityManager = (ConnectivityManager) C0928a.m39107j(context, ConnectivityManager.class);
        if (connectivityManager != null && C11092d.m6164e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new C8410f(connectivityManager, interfaceC8408a);
            } catch (Exception e) {
                if (interfaceC11108q != null) {
                    C11095g.m6160a(interfaceC11108q, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
                }
                return new C8406c();
            }
        }
        if (interfaceC11108q != null && interfaceC11108q.m6116a() <= 5) {
            interfaceC11108q.m6115b("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new C8406c();
    }
}
