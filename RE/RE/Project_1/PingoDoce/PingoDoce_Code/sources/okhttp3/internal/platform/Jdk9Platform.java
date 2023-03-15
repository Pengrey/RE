package okhttp3.internal.platform;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.platform.f */
/* loaded from: classes2.dex */
public class Jdk9Platform extends Platform {

    /* renamed from: d */
    public static final C8153a f21209d = new C8153a(null);

    /* renamed from: e */
    private static final boolean f21210e;

    /* compiled from: Jdk9Platform.kt */
    /* renamed from: okhttp3.internal.platform.f$a */
    /* loaded from: classes2.dex */
    public static final class C8153a {
        private C8153a() {
        }

        public /* synthetic */ C8153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Jdk9Platform m16487a() {
            if (m16486b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16486b() {
            return Jdk9Platform.m16488p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            okhttp3.internal.platform.f$a r0 = new okhttp3.internal.platform.f$a
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.f21209d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L11
            goto L15
        L11:
            java.lang.Integer r1 = sd.C10163k.m8983i(r0)
        L15:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L24
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L22
            goto L2d
        L22:
            r0 = r2
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            okhttp3.internal.platform.Jdk9Platform.f21210e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    /* renamed from: p */
    public static final /* synthetic */ boolean m16488p() {
        return f21210e;
    }

    /* renamed from: e */
    public void m16490e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = Platform.f21214a.m16462b(list).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    /* renamed from: g */
    public String m16489g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.equals(applicationProtocol, BuildConfig.VERSION_NAME)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
