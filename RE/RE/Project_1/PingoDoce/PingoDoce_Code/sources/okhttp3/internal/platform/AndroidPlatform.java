package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p275of.AndroidCertificateChainCleaner;
import p275of.AndroidSocketAdapter;
import p275of.BouncyCastleSocketAdapter;
import p275of.CloseGuard;
import p275of.ConscryptSocketAdapter;
import p275of.DeferredSocketAdapter;
import p275of.InterfaceC8074k;
import p275of.StandardAndroidSocketAdapter;
import p316qf.CertificateChainCleaner;
import p316qf.InterfaceC9728e;
import p489zc.C13780s;

/* renamed from: okhttp3.internal.platform.b */
/* loaded from: classes2.dex */
public final class AndroidPlatform extends Platform {

    /* renamed from: f */
    public static final C8146a f21187f = new C8146a(null);

    /* renamed from: g */
    private static final boolean f21188g;

    /* renamed from: d */
    private final List f21189d;

    /* renamed from: e */
    private final CloseGuard f21190e;

    /* compiled from: AndroidPlatform.kt */
    /* renamed from: okhttp3.internal.platform.b$a */
    /* loaded from: classes2.dex */
    public static final class C8146a {
        private C8146a() {
        }

        public /* synthetic */ C8146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Platform m16514a() {
            if (m16513b()) {
                return new AndroidPlatform();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16513b() {
            return AndroidPlatform.m16515p();
        }
    }

    /* compiled from: AndroidPlatform.kt */
    /* renamed from: okhttp3.internal.platform.b$b */
    /* loaded from: classes2.dex */
    public static final class C8147b implements InterfaceC9728e {

        /* renamed from: a */
        private final X509TrustManager f21191a;

        /* renamed from: b */
        private final Method f21192b;

        public C8147b(X509TrustManager x509TrustManager, Method method) {
            Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
            Intrinsics.isThisObjectNull(method, "findByIssuerAndSignatureMethod");
            this.f21191a = x509TrustManager;
            this.f21192b = method;
        }

        /* renamed from: a */
        public X509Certificate mo10101a(X509Certificate x509Certificate) {
            Intrinsics.isThisObjectNull(x509Certificate, "cert");
            try {
                Object invoke = this.f21192b.invoke(this.f21191a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8147b) {
                C8147b c8147b = (C8147b) obj;
                return Intrinsics.equals(this.f21191a, c8147b.f21191a) && Intrinsics.equals(this.f21192b, c8147b.f21192b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f21191a.hashCode() * 31) + this.f21192b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f21191a + ", findByIssuerAndSignatureMethod=" + this.f21192b + ')';
        }
    }

    static {
        int i;
        boolean z = true;
        if (Platform.f21214a.m16456h() && (i = Build.VERSION.SDK_INT) < 30) {
            if (!(i >= 21)) {
                throw new IllegalStateException(Intrinsics.addStrAndObj("Expected Android API level 21+ but was ", Integer.valueOf(i)).toString());
            }
        } else {
            z = false;
        }
        f21188g = z;
    }

    public AndroidPlatform() {
        List m192l;
        m192l = C13780s.m192l(StandardAndroidSocketAdapter.C8075a.m16967b(StandardAndroidSocketAdapter.f20876h, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.f20858f.m16989d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f20872a.m16976a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f20866a.m16983a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m192l) {
            if (((InterfaceC8074k) obj).mo16970c()) {
                arrayList.add(obj);
            }
        }
        this.f21189d = arrayList;
        this.f21190e = CloseGuard.f20868d.m16980a();
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16515p() {
        return f21188g;
    }

    /* renamed from: c */
    public CertificateChainCleaner m16523c(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner m17000a = AndroidCertificateChainCleaner.f20851d.m17000a(x509TrustManager);
        return m17000a == null ? super.m16476c(x509TrustManager) : m17000a;
    }

    /* renamed from: d */
    public InterfaceC9728e m16522d(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.checkIfNull(declaredMethod, "method");
            return new C8147b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.m16475d(x509TrustManager);
        }
    }

    /* renamed from: e */
    public void m16521e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        Iterator it = this.f21189d.iterator();
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

    /* renamed from: f */
    public void m16520f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics.isThisObjectNull(socket, "socket");
        Intrinsics.isThisObjectNull(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: g */
    public String m16519g(SSLSocket sSLSocket) {
        Object obj;
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Iterator it = this.f21189d.iterator();
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

    /* renamed from: h */
    public Object m16518h(String str) {
        Intrinsics.isThisObjectNull(str, "closer");
        return this.f21190e.m16982a(str);
    }

    /* renamed from: i */
    public boolean m16517i(String str) {
        Intrinsics.isThisObjectNull(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* renamed from: l */
    public void m16516l(String str, Object obj) {
        Intrinsics.isThisObjectNull(str, "message");
        if (this.f21190e.m16981b(obj)) {
            return;
        }
        Platform.m16468k(this, str, 5, null, 4, null);
    }
}
