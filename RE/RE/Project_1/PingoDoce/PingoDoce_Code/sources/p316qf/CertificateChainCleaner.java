package p316qf;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.Platform;
import p181jd.Intrinsics;

/* renamed from: qf.c */
/* loaded from: classes2.dex */
public abstract class CertificateChainCleaner {

    /* renamed from: a */
    public static final C9727a f25585a = new C9727a(null);

    /* compiled from: CertificateChainCleaner.kt */
    /* renamed from: qf.c$a */
    /* loaded from: classes2.dex */
    public static final class C9727a {
        private C9727a() {
        }

        public /* synthetic */ C9727a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CertificateChainCleaner m10110a(X509TrustManager x509TrustManager) {
            Intrinsics.isThisObjectNull(x509TrustManager, "trustManager");
            return Platform.f21214a.m16457g().m16476c(x509TrustManager);
        }
    }

    /* renamed from: a */
    public abstract List m10111a(List list, String str) throws SSLPeerUnverifiedException;
}
