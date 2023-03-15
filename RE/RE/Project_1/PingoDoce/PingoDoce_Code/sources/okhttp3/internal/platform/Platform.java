package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.OkHttpClient;
import p107ff.Protocol;
import p181jd.Intrinsics;
import p275of.AndroidLog;
import p316qf.BasicCertificateChainCleaner;
import p316qf.BasicTrustRootIndex;
import p316qf.CertificateChainCleaner;
import p316qf.InterfaceC9728e;
import p356sf.Buffer;
import p489zc.Iterables;

/* renamed from: okhttp3.internal.platform.h */
/* loaded from: classes2.dex */
public class Platform {

    /* renamed from: a */
    public static final C8155a f21214a;

    /* renamed from: b */
    private static volatile Platform f21215b;

    /* renamed from: c */
    private static final Logger f21216c;

    /* compiled from: Platform.kt */
    /* renamed from: okhttp3.internal.platform.h$a */
    /* loaded from: classes2.dex */
    public static final class C8155a {
        private C8155a() {
        }

        public /* synthetic */ C8155a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ Platform m16463a(C8155a c8155a) {
            return c8155a.m16458f();
        }

        /* renamed from: d */
        private final Platform m16460d() {
            AndroidLog.f20854a.m16998b();
            Platform m16525a = Android10Platform.f21184e.m16525a();
            if (m16525a == null) {
                Platform m16514a = AndroidPlatform.f21187f.m16514a();
                Intrinsics.ifNullDoSomething(m16514a);
                return m16514a;
            }
            return m16525a;
        }

        /* renamed from: e */
        private final Platform m16459e() {
            OpenJSSEPlatform m16480a;
            BouncyCastlePlatform m16507a;
            ConscryptPlatform m16498b;
            if (!m16454j() || (m16498b = ConscryptPlatform.f21196e.m16498b()) == null) {
                if (!m16455i() || (m16507a = BouncyCastlePlatform.f21193e.m16507a()) == null) {
                    if (!m16453k() || (m16480a = OpenJSSEPlatform.f21211e.m16480a()) == null) {
                        Jdk9Platform m16487a = Jdk9Platform.f21209d.m16487a();
                        if (m16487a != null) {
                            return m16487a;
                        }
                        Platform m16491a = Jdk8WithJettyBootPlatform.f21200i.m16491a();
                        return m16491a != null ? m16491a : new Platform();
                    }
                    return m16480a;
                }
                return m16507a;
            }
            return m16498b;
        }

        /* renamed from: f */
        private final Platform m16458f() {
            if (m16456h()) {
                return m16460d();
            }
            return m16459e();
        }

        /* renamed from: i */
        private final boolean m16455i() {
            return Intrinsics.equals("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        private final boolean m16454j() {
            return Intrinsics.equals("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        private final boolean m16453k() {
            return Intrinsics.equals("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* renamed from: b */
        public final List m16462b(List list) {
            int m186r;
            Intrinsics.isThisObjectNull(list, "protocols");
            ArrayList<Protocol> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            m186r = Iterables.m186r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m186r);
            for (Protocol protocol : arrayList) {
                arrayList2.add(protocol.toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m16461c(List list) {
            Intrinsics.isThisObjectNull(list, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m16462b(list)) {
                buffer.m8791x0(str.length());
                buffer.m8814I0(str);
            }
            return buffer.mo8764K();
        }

        /* renamed from: g */
        public final Platform m16457g() {
            return Platform.m16478a();
        }

        /* renamed from: h */
        public final boolean m16456h() {
            return Intrinsics.equals("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        C8155a c8155a = new C8155a(null);
        f21214a = c8155a;
        f21215b = C8155a.m16463a(c8155a);
        f21216c = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* renamed from: a */
    public static final /* synthetic */ Platform m16478a() {
        return f21215b;
    }

    /* renamed from: k */
    public static /* synthetic */ void m16468k(Platform platform, String str, int i, Throwable th2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th2 = null;
        }
        platform.m16469j(str, i, th2);
    }

    /* renamed from: b */
    public void m16477b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
    }

    /* renamed from: c */
    public CertificateChainCleaner m16476c(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(m16475d(x509TrustManager));
    }

    /* renamed from: d */
    public InterfaceC9728e m16475d(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics.checkIfNull(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void m16474e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
    }

    /* renamed from: f */
    public void m16473f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics.isThisObjectNull(socket, "socket");
        Intrinsics.isThisObjectNull(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: g */
    public String m16472g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object m16471h(String str) {
        Intrinsics.isThisObjectNull(str, "closer");
        if (f21216c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: i */
    public boolean m16470i(String str) {
        Intrinsics.isThisObjectNull(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m16469j(String str, int i, Throwable th2) {
        Intrinsics.isThisObjectNull(str, "message");
        f21216c.log(i == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    /* renamed from: l */
    public void m16467l(String str, Object obj) {
        Intrinsics.isThisObjectNull(str, "message");
        if (obj == null) {
            str = Intrinsics.addStrAndObj(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m16469j(str, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext m16466m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkIfNull(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory m16465n(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        try {
            SSLContext m16466m = m16466m();
            m16466m.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = m16466m.getSocketFactory();
            Intrinsics.checkIfNull(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(Intrinsics.addStrAndObj("No System TLS: ", e), e);
        }
    }

    /* renamed from: o */
    public X509TrustManager m16464o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.ifNullDoSomething(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkIfNull(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.addStrAndObj("Unexpected default trust managers: ", arrays).toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkIfNull(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
