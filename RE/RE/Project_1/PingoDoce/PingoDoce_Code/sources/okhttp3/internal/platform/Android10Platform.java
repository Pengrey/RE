package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p275of.Android10SocketAdapter;
import p275of.AndroidCertificateChainCleaner;
import p275of.AndroidSocketAdapter;
import p275of.BouncyCastleSocketAdapter;
import p275of.ConscryptSocketAdapter;
import p275of.DeferredSocketAdapter;
import p275of.InterfaceC8074k;
import p316qf.CertificateChainCleaner;
import p489zc.C13780s;

/* renamed from: okhttp3.internal.platform.a */
/* loaded from: classes2.dex */
public final class Android10Platform extends Platform {

    /* renamed from: e */
    public static final C8145a f21184e = new C8145a(null);

    /* renamed from: f */
    private static final boolean f21185f;

    /* renamed from: d */
    private final List f21186d;

    /* compiled from: Android10Platform.kt */
    /* renamed from: okhttp3.internal.platform.a$a */
    /* loaded from: classes2.dex */
    public static final class C8145a {
        private C8145a() {
        }

        public /* synthetic */ C8145a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Platform m16525a() {
            if (m16524b()) {
                return new Android10Platform();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16524b() {
            return Android10Platform.m16526p();
        }
    }

    static {
        f21185f = Platform.f21214a.m16456h() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        List m192l;
        m192l = C13780s.m192l(Android10SocketAdapter.f20850a.m17003a(), new DeferredSocketAdapter(AndroidSocketAdapter.f20858f.m16989d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f20872a.m16976a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f20866a.m16983a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m192l) {
            if (((InterfaceC8074k) obj).mo16970c()) {
                arrayList.add(obj);
            }
        }
        this.f21186d = arrayList;
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16526p() {
        return f21185f;
    }

    /* renamed from: c */
    public CertificateChainCleaner m16530c(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner m17000a = AndroidCertificateChainCleaner.f20851d.m17000a(x509TrustManager);
        return m17000a == null ? super.m16476c(x509TrustManager) : m17000a;
    }

    /* renamed from: e */
    public void m16529e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        Iterator it = this.f21186d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC8074k) obj).mo16972a(sSLSocket)) {
                break;
            }
        }
        InterfaceC8074k interfaceC8074k = (InterfaceC8074k) obj;
        if (interfaceC8074k == null) {
            return;
        }
        interfaceC8074k.mo16969d(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String m16528g(SSLSocket sSLSocket) {
        Object obj;
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Iterator it = this.f21186d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC8074k) obj).mo16972a(sSLSocket)) {
                break;
            }
        }
        InterfaceC8074k interfaceC8074k = (InterfaceC8074k) obj;
        if (interfaceC8074k == null) {
            return null;
        }
        return interfaceC8074k.mo16971b(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public boolean m16527i(String str) {
        Intrinsics.isThisObjectNull(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
