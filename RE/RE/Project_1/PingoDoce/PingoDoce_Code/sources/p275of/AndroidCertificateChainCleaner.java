package p275of;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p316qf.CertificateChainCleaner;

/* renamed from: of.b */
/* loaded from: classes2.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: d */
    public static final C8063a f20851d = new C8063a(null);

    /* renamed from: b */
    private final X509TrustManager f20852b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f20853c;

    /* compiled from: AndroidCertificateChainCleaner.kt */
    /* renamed from: of.b$a */
    /* loaded from: classes2.dex */
    public static final class C8063a {
        private C8063a() {
        }

        public /* synthetic */ C8063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AndroidCertificateChainCleaner m17000a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
        Intrinsics.isThisObjectNull(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f20852b = x509TrustManager;
        this.f20853c = x509TrustManagerExtensions;
    }

    /* renamed from: a */
    public List m17001a(List list, String str) throws SSLPeerUnverifiedException {
        Intrinsics.isThisObjectNull(list, "chain");
        Intrinsics.isThisObjectNull(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        try {
            List<X509Certificate> checkServerTrusted = this.f20853c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            Intrinsics.checkIfNull(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f20852b == this.f20852b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f20852b);
    }
}
