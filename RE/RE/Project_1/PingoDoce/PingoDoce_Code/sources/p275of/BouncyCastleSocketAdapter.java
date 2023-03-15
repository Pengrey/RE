package p275of;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p181jd.Intrinsics;
import p275of.DeferredSocketAdapter;

/* renamed from: of.g */
/* loaded from: classes2.dex */
public final class BouncyCastleSocketAdapter implements InterfaceC8074k {

    /* renamed from: a */
    public static final C8069b f20866a = new C8069b(null);

    /* renamed from: b */
    private static final DeferredSocketAdapter.InterfaceC8073a f20867b = new C8068a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* renamed from: of.g$a */
    /* loaded from: classes2.dex */
    public static final class C8068a implements DeferredSocketAdapter.InterfaceC8073a {
        C8068a() {
        }

        /* renamed from: a */
        public boolean m16985a(SSLSocket sSLSocket) {
            Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
            return BouncyCastlePlatform.f21193e.m16506b() && (sSLSocket instanceof BCSSLSocket);
        }

        /* renamed from: b */
        public InterfaceC8074k m16984b(SSLSocket sSLSocket) {
            Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }
    }

    /* compiled from: BouncyCastleSocketAdapter.kt */
    /* renamed from: of.g$b */
    /* loaded from: classes2.dex */
    public static final class C8069b {
        private C8069b() {
        }

        public /* synthetic */ C8069b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DeferredSocketAdapter.InterfaceC8073a m16983a() {
            return BouncyCastleSocketAdapter.m16986e();
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ DeferredSocketAdapter.InterfaceC8073a m16986e() {
        return f20867b;
    }

    /* renamed from: a */
    public boolean mo16972a(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    /* renamed from: b */
    public String mo16971b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.equals(applicationProtocol, BuildConfig.VERSION_NAME)) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: c */
    public boolean mo16970c() {
        return BouncyCastlePlatform.f21193e.m16506b();
    }

    /* renamed from: d */
    public void mo16969d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (mo16972a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
