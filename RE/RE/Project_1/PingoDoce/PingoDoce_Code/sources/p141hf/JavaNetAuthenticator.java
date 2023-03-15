package p141hf;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Address;
import p107ff.Authenticator;
import p107ff.Challenge;
import p107ff.Credentials;
import p107ff.Dns;
import p107ff.HttpUrl;
import p107ff.Request;
import p107ff.Response;
import p107ff.Route;
import p181jd.Intrinsics;
import p489zc.C13777q;
import sd.StringsJVM;

/* renamed from: hf.a */
/* loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: b */
    private final Dns f16385b;

    /* compiled from: JavaNetAuthenticator.kt */
    /* renamed from: hf.a$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5925a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16386a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f16386a = iArr;
        }
    }

    public JavaNetAuthenticator(Dns dns) {
        Intrinsics.isThisObjectNull(dns, "defaultDns");
        this.f16385b = dns;
    }

    /* renamed from: b */
    private final InetAddress m22709b(Proxy proxy, HttpUrl httpUrl, Dns dns) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C5925a.f16386a[type.ordinal()]) == 1) {
            return (InetAddress) C13777q.m256L(dns.m24057a(httpUrl.m23983i()));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.checkIfNull(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    /* renamed from: a */
    public Request m22710a(Route route, Response response) throws IOException {
        boolean m8943q;
        Address m24151a;
        PasswordAuthentication requestPasswordAuthentication;
        Intrinsics.isThisObjectNull(response, "response");
        List<Challenge> m24198h = response.m24198h();
        Request m24202a0 = response.m24202a0();
        HttpUrl m24266j = m24202a0.m24266j();
        boolean z = response.m24197t() == 407;
        Proxy m24150b = route == null ? null : route.m24150b();
        if (m24150b == null) {
            m24150b = Proxy.NO_PROXY;
        }
        for (Challenge challenge : m24198h) {
            m8943q = StringsJVM.m8943q("Basic", challenge.m24129c(), true);
            if (m8943q) {
                Dns m24288c = (route == null || (m24151a = route.m24151a()) == null) ? null : m24151a.m24288c();
                if (m24288c == null) {
                    m24288c = this.f16385b;
                }
                if (z) {
                    SocketAddress address = m24150b.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkIfNull(m24150b, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, m22709b(m24150b, m24266j, m24288c), inetSocketAddress.getPort(), m24266j.m23974r(), challenge.m24130b(), challenge.m24129c(), m24266j.m23972t(), Authenticator.RequestorType.PROXY);
                } else {
                    String m23983i = m24266j.m23983i();
                    Intrinsics.checkIfNull(m24150b, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(m23983i, m22709b(m24150b, m24266j, m24288c), m24266j.m23978n(), m24266j.m23974r(), challenge.m24130b(), challenge.m24129c(), m24266j.m23972t(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.checkIfNull(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.checkIfNull(password, "auth.password");
                    return m24202a0.m24268h().m24260f(str, Credentials.m24072a(userName, new String(password), challenge.m24131a())).m24264b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.f15524a : dns);
    }
}
