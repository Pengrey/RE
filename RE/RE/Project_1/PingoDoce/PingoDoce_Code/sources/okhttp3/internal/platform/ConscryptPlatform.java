package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.platform.d */
/* loaded from: classes2.dex */
public final class ConscryptPlatform extends Platform {

    /* renamed from: e */
    public static final C8149a f21196e;

    /* renamed from: f */
    private static final boolean f21197f;

    /* renamed from: d */
    private final Provider f21198d;

    /* compiled from: ConscryptPlatform.kt */
    /* renamed from: okhttp3.internal.platform.d$a */
    /* loaded from: classes2.dex */
    public static final class C8149a {
        private C8149a() {
        }

        public /* synthetic */ C8149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m16499a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        /* renamed from: b */
        public final ConscryptPlatform m16498b() {
            if (m16497c()) {
                return new ConscryptPlatform(null);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m16497c() {
            return ConscryptPlatform.m16500p();
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    /* renamed from: okhttp3.internal.platform.d$b */
    /* loaded from: classes2.dex */
    public static final class C8150b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final C8150b f21199a = new C8150b();

        private C8150b() {
        }
    }

    static {
        C8149a c8149a = new C8149a(null);
        f21196e = c8149a;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c8149a.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (c8149a.m16499a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f21197f = z;
    }

    private ConscryptPlatform() {
        Provider newProvider = Conscrypt.newProvider();
        Intrinsics.checkIfNull(newProvider, "newProvider()");
        this.f21198d = newProvider;
    }

    public /* synthetic */ ConscryptPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16500p() {
        return f21197f;
    }

    /* renamed from: e */
    public void m16505e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.m16474e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String m16504g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.m16472g(sSLSocket);
    }

    /* renamed from: m */
    public SSLContext m16503m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f21198d);
        Intrinsics.checkIfNull(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory m16502n(X509TrustManager x509TrustManager) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        SSLContext m16503m = m16503m();
        m16503m.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = m16503m.getSocketFactory();
        Intrinsics.checkIfNull(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    /* renamed from: o */
    public X509TrustManager m16501o() {
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
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, C8150b.f21199a);
            return x509TrustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkIfNull(arrays, "toString(this)");
        throw new IllegalStateException(Intrinsics.addStrAndObj("Unexpected default trust managers: ", arrays).toString());
    }
}
