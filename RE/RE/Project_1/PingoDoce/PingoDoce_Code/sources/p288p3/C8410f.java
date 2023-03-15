package p288p3;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import p181jd.Intrinsics;
import p288p3.InterfaceC8407d;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"MissingPermission"})
/* renamed from: p3.f */
/* loaded from: classes.dex */
public final class C8410f implements InterfaceC8407d {

    /* renamed from: a */
    private final ConnectivityManager f21769a;

    /* renamed from: b */
    private final InterfaceC8407d.InterfaceC8408a f21770b;

    /* renamed from: c */
    private final C8411a f21771c;

    /* compiled from: NetworkObserver.kt */
    /* renamed from: p3.f$a */
    /* loaded from: classes.dex */
    public static final class C8411a extends ConnectivityManager.NetworkCallback {
        C8411a() {
        }

        public void onAvailable(Network network) {
            C8410f.m15473c(C8410f.this, network, true);
        }

        public void onLost(Network network) {
            C8410f.m15473c(C8410f.this, network, false);
        }
    }

    public C8410f(ConnectivityManager connectivityManager, InterfaceC8407d.InterfaceC8408a interfaceC8408a) {
        this.f21769a = connectivityManager;
        this.f21770b = interfaceC8408a;
        C8411a c8411a = new C8411a();
        this.f21771c = c8411a;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c8411a);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m15473c(C8410f c8410f, Network network, boolean z) {
        c8410f.m15471e(network, z);
    }

    /* renamed from: d */
    private final boolean m15472d(Network network) {
        NetworkCapabilities networkCapabilities = this.f21769a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* renamed from: e */
    private final void m15471e(Network network, boolean z) {
        Network[] allNetworks = this.f21769a.getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (Intrinsics.equals(network2, network) ? z : m15472d(network2)) {
                z2 = true;
                break;
            }
            i++;
        }
        this.f21770b.mo6113a(z2);
    }

    /* renamed from: a */
    public void mo15478a() {
        this.f21769a.unregisterNetworkCallback(this.f21771c);
    }

    /* renamed from: b */
    public boolean mo15477b() {
        for (Network network : this.f21769a.getAllNetworks()) {
            if (m15472d(network)) {
                return true;
            }
        }
        return false;
    }
}
