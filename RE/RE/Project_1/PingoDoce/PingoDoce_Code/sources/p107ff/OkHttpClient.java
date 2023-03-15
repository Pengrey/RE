package p107ff;

import gf.Util;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import p107ff.EventListener;
import p107ff.InterfaceC5469e;
import p181jd.Intrinsics;
import p204kf.RouteDatabase;
import p316qf.CertificateChainCleaner;
import p316qf.OkHostnameVerifier;
import pf.C8620a;

/* renamed from: ff.z */
/* loaded from: classes2.dex */
public class OkHttpClient implements Cloneable, InterfaceC5469e.InterfaceC5470a {

    /* renamed from: Z */
    public static final C5511b f15587Z = new C5511b(null);

    /* renamed from: a0 */
    private static final List f15588a0 = Util.m23394w(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: b0 */
    private static final List f15589b0 = Util.m23394w(ConnectionSpec.f15491g, ConnectionSpec.f15492h);

    /* renamed from: A */
    private final EventListener.InterfaceC5492c f15590A;

    /* renamed from: B */
    private final boolean f15591B;

    /* renamed from: C */
    private final Authenticator f15592C;

    /* renamed from: D */
    private final boolean f15593D;

    /* renamed from: E */
    private final boolean f15594E;

    /* renamed from: F */
    private final CookieJar f15595F;

    /* renamed from: G */
    private final C5461c f15596G;

    /* renamed from: H */
    private final Dns f15597H;

    /* renamed from: I */
    private final Proxy f15598I;

    /* renamed from: J */
    private final ProxySelector f15599J;

    /* renamed from: K */
    private final Authenticator f15600K;

    /* renamed from: L */
    private final SocketFactory f15601L;

    /* renamed from: M */
    private final SSLSocketFactory f15602M;

    /* renamed from: N */
    private final X509TrustManager f15603N;

    /* renamed from: O */
    private final List f15604O;

    /* renamed from: P */
    private final List f15605P;

    /* renamed from: Q */
    private final HostnameVerifier f15606Q;

    /* renamed from: R */
    private final CertificatePinner f15607R;

    /* renamed from: S */
    private final CertificateChainCleaner f15608S;

    /* renamed from: T */
    private final int f15609T;

    /* renamed from: U */
    private final int f15610U;

    /* renamed from: V */
    private final int f15611V;

    /* renamed from: W */
    private final int f15612W;

    /* renamed from: X */
    private final int f15613X;

    /* renamed from: Y */
    private final RouteDatabase f15614Y;

    /* renamed from: w */
    private final Dispatcher f15615w;

    /* renamed from: x */
    private final ConnectionPool f15616x;

    /* renamed from: y */
    private final List f15617y;

    /* renamed from: z */
    private final List f15618z;

    /* compiled from: OkHttpClient.kt */
    /* renamed from: ff.z$a */
    /* loaded from: classes2.dex */
    public static final class C5510a {

        /* renamed from: A */
        private int f15619A;

        /* renamed from: B */
        private int f15620B;

        /* renamed from: C */
        private long f15621C;

        /* renamed from: D */
        private RouteDatabase f15622D;

        /* renamed from: a */
        private Dispatcher f15623a = new Dispatcher();

        /* renamed from: b */
        private ConnectionPool f15624b = new ConnectionPool();

        /* renamed from: c */
        private final List f15625c = new ArrayList();

        /* renamed from: d */
        private final List f15626d = new ArrayList();

        /* renamed from: e */
        private EventListener.InterfaceC5492c f15627e = Util.m23410g(EventListener.f15526a);

        /* renamed from: f */
        private boolean f15628f = true;

        /* renamed from: g */
        private Authenticator f15629g;

        /* renamed from: h */
        private boolean f15630h;

        /* renamed from: i */
        private boolean f15631i;

        /* renamed from: j */
        private CookieJar f15632j;

        /* renamed from: k */
        private C5461c f15633k;

        /* renamed from: l */
        private Dns f15634l;

        /* renamed from: m */
        private Proxy f15635m;

        /* renamed from: n */
        private ProxySelector f15636n;

        /* renamed from: o */
        private Authenticator f15637o;

        /* renamed from: p */
        private SocketFactory f15638p;

        /* renamed from: q */
        private SSLSocketFactory f15639q;

        /* renamed from: r */
        private X509TrustManager f15640r;

        /* renamed from: s */
        private List f15641s;

        /* renamed from: t */
        private List f15642t;

        /* renamed from: u */
        private HostnameVerifier f15643u;

        /* renamed from: v */
        private CertificatePinner f15644v;

        /* renamed from: w */
        private CertificateChainCleaner f15645w;

        /* renamed from: x */
        private int f15646x;

        /* renamed from: y */
        private int f15647y;

        /* renamed from: z */
        private int f15648z;

        public C5510a() {
            Authenticator authenticator = Authenticator.f15373a;
            this.f15629g = authenticator;
            this.f15630h = true;
            this.f15631i = true;
            this.f15632j = CookieJar.f15515a;
            this.f15634l = Dns.f15524a;
            this.f15637o = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkIfNull(socketFactory, "getDefault()");
            this.f15638p = socketFactory;
            C5511b c5511b = OkHttpClient.f15587Z;
            this.f15641s = c5511b.m23818a();
            this.f15642t = c5511b.m23817b();
            this.f15643u = OkHostnameVerifier.f25586a;
            this.f15644v = CertificatePinner.f15456d;
            this.f15647y = 10000;
            this.f15648z = 10000;
            this.f15619A = 10000;
            this.f15621C = 1024L;
        }

        /* renamed from: A */
        public final List m23865A() {
            return this.f15642t;
        }

        /* renamed from: B */
        public final Proxy m23864B() {
            return this.f15635m;
        }

        /* renamed from: C */
        public final Authenticator m23863C() {
            return this.f15637o;
        }

        /* renamed from: D */
        public final ProxySelector m23862D() {
            return this.f15636n;
        }

        /* renamed from: E */
        public final int m23861E() {
            return this.f15648z;
        }

        /* renamed from: F */
        public final boolean m23860F() {
            return this.f15628f;
        }

        /* renamed from: G */
        public final RouteDatabase m23859G() {
            return this.f15622D;
        }

        /* renamed from: H */
        public final SocketFactory m23858H() {
            return this.f15638p;
        }

        /* renamed from: I */
        public final SSLSocketFactory m23857I() {
            return this.f15639q;
        }

        /* renamed from: J */
        public final int m23856J() {
            return this.f15619A;
        }

        /* renamed from: K */
        public final X509TrustManager m23855K() {
            return this.f15640r;
        }

        /* renamed from: L */
        public final C5510a m23854L(long j, TimeUnit timeUnit) {
            Intrinsics.isThisObjectNull(timeUnit, "unit");
            m23848R(Util.m23406k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: M */
        public final void m23853M(Authenticator authenticator) {
            Intrinsics.isThisObjectNull(authenticator, "<set-?>");
            this.f15629g = authenticator;
        }

        /* renamed from: N */
        public final void m23852N(CertificatePinner certificatePinner) {
            Intrinsics.isThisObjectNull(certificatePinner, "<set-?>");
            this.f15644v = certificatePinner;
        }

        /* renamed from: O */
        public final void m23851O(int i) {
            this.f15647y = i;
        }

        /* renamed from: P */
        public final void m23850P(ConnectionPool connectionPool) {
            Intrinsics.isThisObjectNull(connectionPool, "<set-?>");
            this.f15624b = connectionPool;
        }

        /* renamed from: Q */
        public final void m23849Q(Dispatcher dispatcher) {
            Intrinsics.isThisObjectNull(dispatcher, "<set-?>");
            this.f15623a = dispatcher;
        }

        /* renamed from: R */
        public final void m23848R(int i) {
            this.f15648z = i;
        }

        /* renamed from: S */
        public final void m23847S(RouteDatabase routeDatabase) {
            this.f15622D = routeDatabase;
        }

        /* renamed from: T */
        public final void m23846T(int i) {
            this.f15619A = i;
        }

        /* renamed from: U */
        public final C5510a m23845U(long j, TimeUnit timeUnit) {
            Intrinsics.isThisObjectNull(timeUnit, "unit");
            m23846T(Util.m23406k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: a */
        public final C5510a m23844a(InterfaceC5503w interfaceC5503w) {
            Intrinsics.isThisObjectNull(interfaceC5503w, "interceptor");
            m23822w().add(interfaceC5503w);
            return this;
        }

        /* renamed from: b */
        public final C5510a m23843b(Authenticator authenticator) {
            Intrinsics.isThisObjectNull(authenticator, "authenticator");
            m23853M(authenticator);
            return this;
        }

        /* renamed from: c */
        public final OkHttpClient m23842c() {
            return new OkHttpClient(this);
        }

        /* renamed from: d */
        public final C5510a m23841d(CertificatePinner certificatePinner) {
            Intrinsics.isThisObjectNull(certificatePinner, "certificatePinner");
            if (!Intrinsics.equals(certificatePinner, m23833l())) {
                m23847S(null);
            }
            m23852N(certificatePinner);
            return this;
        }

        /* renamed from: e */
        public final C5510a m23840e(long j, TimeUnit timeUnit) {
            Intrinsics.isThisObjectNull(timeUnit, "unit");
            m23851O(Util.m23406k("timeout", j, timeUnit));
            return this;
        }

        /* renamed from: f */
        public final C5510a m23839f(ConnectionPool connectionPool) {
            Intrinsics.isThisObjectNull(connectionPool, "connectionPool");
            m23850P(connectionPool);
            return this;
        }

        /* renamed from: g */
        public final C5510a m23838g(Dispatcher dispatcher) {
            Intrinsics.isThisObjectNull(dispatcher, "dispatcher");
            m23849Q(dispatcher);
            return this;
        }

        /* renamed from: h */
        public final Authenticator m23837h() {
            return this.f15629g;
        }

        /* renamed from: i */
        public final C5461c m23836i() {
            return this.f15633k;
        }

        /* renamed from: j */
        public final int m23835j() {
            return this.f15646x;
        }

        /* renamed from: k */
        public final CertificateChainCleaner m23834k() {
            return this.f15645w;
        }

        /* renamed from: l */
        public final CertificatePinner m23833l() {
            return this.f15644v;
        }

        /* renamed from: m */
        public final int m23832m() {
            return this.f15647y;
        }

        /* renamed from: n */
        public final ConnectionPool m23831n() {
            return this.f15624b;
        }

        /* renamed from: o */
        public final List m23830o() {
            return this.f15641s;
        }

        /* renamed from: p */
        public final CookieJar m23829p() {
            return this.f15632j;
        }

        /* renamed from: q */
        public final Dispatcher m23828q() {
            return this.f15623a;
        }

        /* renamed from: r */
        public final Dns m23827r() {
            return this.f15634l;
        }

        /* renamed from: s */
        public final EventListener.InterfaceC5492c m23826s() {
            return this.f15627e;
        }

        /* renamed from: t */
        public final boolean m23825t() {
            return this.f15630h;
        }

        /* renamed from: u */
        public final boolean m23824u() {
            return this.f15631i;
        }

        /* renamed from: v */
        public final HostnameVerifier m23823v() {
            return this.f15643u;
        }

        /* renamed from: w */
        public final List m23822w() {
            return this.f15625c;
        }

        /* renamed from: x */
        public final long m23821x() {
            return this.f15621C;
        }

        /* renamed from: y */
        public final List m23820y() {
            return this.f15626d;
        }

        /* renamed from: z */
        public final int m23819z() {
            return this.f15620B;
        }
    }

    /* compiled from: OkHttpClient.kt */
    /* renamed from: ff.z$b */
    /* loaded from: classes2.dex */
    public static final class C5511b {
        private C5511b() {
        }

        public /* synthetic */ C5511b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m23818a() {
            return OkHttpClient.m23886b();
        }

        /* renamed from: b */
        public final List m23817b() {
            return OkHttpClient.m23885c();
        }
    }

    public OkHttpClient(C5510a c5510a) {
        ProxySelector m23862D;
        Intrinsics.isThisObjectNull(c5510a, "builder");
        this.f15615w = c5510a.m23828q();
        this.f15616x = c5510a.m23831n();
        this.f15617y = Util.m23424S(c5510a.m23822w());
        this.f15618z = Util.m23424S(c5510a.m23820y());
        this.f15590A = c5510a.m23826s();
        this.f15591B = c5510a.m23860F();
        this.f15592C = c5510a.m23837h();
        this.f15593D = c5510a.m23825t();
        this.f15594E = c5510a.m23824u();
        this.f15595F = c5510a.m23829p();
        c5510a.m23836i();
        this.f15597H = c5510a.m23827r();
        this.f15598I = c5510a.m23864B();
        if (c5510a.m23864B() != null) {
            m23862D = C8620a.f22231a;
        } else {
            m23862D = c5510a.m23862D();
            m23862D = m23862D == null ? ProxySelector.getDefault() : m23862D;
            if (m23862D == null) {
                m23862D = C8620a.f22231a;
            }
        }
        this.f15599J = m23862D;
        this.f15600K = c5510a.m23863C();
        this.f15601L = c5510a.m23858H();
        List m23830o = c5510a.m23830o();
        this.f15604O = m23830o;
        this.f15605P = c5510a.m23865A();
        this.f15606Q = c5510a.m23823v();
        this.f15609T = c5510a.m23835j();
        this.f15610U = c5510a.m23832m();
        this.f15611V = c5510a.m23861E();
        this.f15612W = c5510a.m23856J();
        this.f15613X = c5510a.m23819z();
        c5510a.m23821x();
        RouteDatabase m23859G = c5510a.m23859G();
        this.f15614Y = m23859G == null ? new RouteDatabase() : m23859G;
        boolean z = true;
        if (!(m23830o instanceof Collection) || !m23830o.isEmpty()) {
            Iterator it = m23830o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ConnectionSpec) it.next()).m24112f()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            this.f15602M = null;
            this.f15608S = null;
            this.f15603N = null;
            this.f15607R = CertificatePinner.f15456d;
        } else if (c5510a.m23857I() != null) {
            this.f15602M = c5510a.m23857I();
            CertificateChainCleaner m23834k = c5510a.m23834k();
            Intrinsics.ifNullDoSomething(m23834k);
            this.f15608S = m23834k;
            X509TrustManager m23855K = c5510a.m23855K();
            Intrinsics.ifNullDoSomething(m23855K);
            this.f15603N = m23855K;
            CertificatePinner m23833l = c5510a.m23833l();
            Intrinsics.ifNullDoSomething(m23834k);
            this.f15607R = m23833l.m24143e(m23834k);
        } else {
            Platform.C8155a c8155a = Platform.f21214a;
            X509TrustManager m16464o = c8155a.m16457g().m16464o();
            this.f15603N = m16464o;
            Platform m16457g = c8155a.m16457g();
            Intrinsics.ifNullDoSomething(m16464o);
            this.f15602M = m16457g.m16465n(m16464o);
            CertificateChainCleaner.C9727a c9727a = CertificateChainCleaner.f25585a;
            Intrinsics.ifNullDoSomething(m16464o);
            CertificateChainCleaner m10110a = c9727a.m10110a(m16464o);
            this.f15608S = m10110a;
            CertificatePinner m23833l2 = c5510a.m23833l();
            Intrinsics.ifNullDoSomething(m10110a);
            this.f15607R = m23833l2.m24143e(m10110a);
        }
        m23889I();
    }

    /* renamed from: I */
    private final void m23889I() {
        boolean z;
        if (!this.f15617y.contains(null)) {
            if (!this.f15618z.contains(null)) {
                List<ConnectionSpec> list = this.f15604O;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ConnectionSpec connectionSpec : list) {
                        if (connectionSpec.m24112f()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (this.f15602M == null) {
                        if (this.f15608S == null) {
                            if (this.f15603N == null) {
                                if (!Intrinsics.equals(this.f15607R, CertificatePinner.f15456d)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.f15602M != null) {
                    if (this.f15608S != null) {
                        if (this.f15603N == null) {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
            }
            throw new IllegalStateException(Intrinsics.addStrAndObj("Null network interceptor: ", m23868w()).toString());
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("Null interceptor: ", m23869u()).toString());
    }

    /* renamed from: b */
    public static final /* synthetic */ List m23886b() {
        return f15589b0;
    }

    /* renamed from: c */
    public static final /* synthetic */ List m23885c() {
        return f15588a0;
    }

    /* renamed from: A */
    public final Proxy m23896A() {
        return this.f15598I;
    }

    /* renamed from: B */
    public final Authenticator m23895B() {
        return this.f15600K;
    }

    /* renamed from: C */
    public final ProxySelector m23894C() {
        return this.f15599J;
    }

    /* renamed from: D */
    public final int m23893D() {
        return this.f15611V;
    }

    /* renamed from: F */
    public final boolean m23892F() {
        return this.f15591B;
    }

    /* renamed from: G */
    public final SocketFactory m23891G() {
        return this.f15601L;
    }

    /* renamed from: H */
    public final SSLSocketFactory m23890H() {
        SSLSocketFactory sSLSocketFactory = this.f15602M;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: J */
    public final int m23888J() {
        return this.f15612W;
    }

    /* renamed from: a */
    public InterfaceC5469e mo24161a(Request request) {
        Intrinsics.isThisObjectNull(request, "request");
        return new RealCall(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final Authenticator m23884d() {
        return this.f15592C;
    }

    /* renamed from: e */
    public final C5461c m23883e() {
        return this.f15596G;
    }

    /* renamed from: f */
    public final int m23882f() {
        return this.f15609T;
    }

    /* renamed from: g */
    public final CertificatePinner m23881g() {
        return this.f15607R;
    }

    /* renamed from: i */
    public final int m23880i() {
        return this.f15610U;
    }

    /* renamed from: j */
    public final ConnectionPool m23879j() {
        return this.f15616x;
    }

    /* renamed from: k */
    public final List m23878k() {
        return this.f15604O;
    }

    /* renamed from: l */
    public final CookieJar m23877l() {
        return this.f15595F;
    }

    /* renamed from: m */
    public final Dispatcher m23876m() {
        return this.f15615w;
    }

    /* renamed from: n */
    public final Dns m23875n() {
        return this.f15597H;
    }

    /* renamed from: o */
    public final EventListener.InterfaceC5492c m23874o() {
        return this.f15590A;
    }

    /* renamed from: p */
    public final boolean m23873p() {
        return this.f15593D;
    }

    /* renamed from: q */
    public final boolean m23872q() {
        return this.f15594E;
    }

    /* renamed from: r */
    public final RouteDatabase m23871r() {
        return this.f15614Y;
    }

    /* renamed from: s */
    public final HostnameVerifier m23870s() {
        return this.f15606Q;
    }

    /* renamed from: u */
    public final List m23869u() {
        return this.f15617y;
    }

    /* renamed from: w */
    public final List m23868w() {
        return this.f15618z;
    }

    /* renamed from: x */
    public final int m23867x() {
        return this.f15613X;
    }

    /* renamed from: z */
    public final List m23866z() {
        return this.f15605P;
    }

    public OkHttpClient() {
        this(new C5510a());
    }
}
