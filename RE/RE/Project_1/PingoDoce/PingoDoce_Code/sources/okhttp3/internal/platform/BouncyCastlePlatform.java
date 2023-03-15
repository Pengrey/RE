package okhttp3.internal.platform;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.platform.c */
/* loaded from: classes2.dex */
public final class BouncyCastlePlatform extends Platform {

    /* renamed from: e */
    public static final C8148a f21193e;

    /* renamed from: f */
    private static final boolean f21194f;

    /* renamed from: d */
    private final Provider f21195d;

    /* compiled from: BouncyCastlePlatform.kt */
    /* renamed from: okhttp3.internal.platform.c$a */
    /* loaded from: classes2.dex */
    public static final class C8148a {
        private C8148a() {
        }

        public /* synthetic */ C8148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BouncyCastlePlatform m16507a() {
            if (m16506b()) {
                return new BouncyCastlePlatform(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16506b() {
            return BouncyCastlePlatform.m16508p();
        }
    }

    static {
        C8148a c8148a = new C8148a(null);
        f21193e = c8148a;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c8148a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f21194f = z;
    }

    private BouncyCastlePlatform() {
        this.f21195d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ BouncyCastlePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16508p() {
        return f21194f;
    }

    /* renamed from: e */
    public void m16512e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.m16474e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String m16511g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.equals(applicationProtocol, BuildConfig.VERSION_NAME)) {
                return null;
            }
            return applicationProtocol;
        }
        return super.m16472g(sSLSocket);
    }

    /* renamed from: m */
    public SSLContext m16510m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f21195d);
        Intrinsics.checkIfNull(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    /* renamed from: o */
    public X509TrustManager m16509o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
