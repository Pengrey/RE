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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.platform.g */
/* loaded from: classes2.dex */
public final class OpenJSSEPlatform extends Platform {

    /* renamed from: e */
    public static final C8154a f21211e;

    /* renamed from: f */
    private static final boolean f21212f;

    /* renamed from: d */
    private final Provider f21213d;

    /* compiled from: OpenJSSEPlatform.kt */
    /* renamed from: okhttp3.internal.platform.g$a */
    /* loaded from: classes2.dex */
    public static final class C8154a {
        private C8154a() {
        }

        public /* synthetic */ C8154a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OpenJSSEPlatform m16480a() {
            if (m16479b()) {
                return new OpenJSSEPlatform(null);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16479b() {
            return OpenJSSEPlatform.m16481p();
        }
    }

    static {
        C8154a c8154a = new C8154a(null);
        f21211e = c8154a;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c8154a.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f21212f = z;
    }

    private OpenJSSEPlatform() {
        this.f21213d = new OpenJSSE();
    }

    public /* synthetic */ OpenJSSEPlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16481p() {
        return f21212f;
    }

    /* renamed from: e */
    public void m16485e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.m16474e(sSLSocket, str, list);
    }

    /* renamed from: g */
    public String m16484g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.equals(applicationProtocol, BuildConfig.VERSION_NAME)) {
                return null;
            }
            return applicationProtocol;
        }
        return super.m16472g(sSLSocket);
    }

    /* renamed from: m */
    public SSLContext m16483m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f21213d);
        Intrinsics.checkIfNull(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    /* renamed from: o */
    public X509TrustManager m16482o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f21213d);
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
