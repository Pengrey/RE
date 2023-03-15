package okhttp3.internal.connection;

import gf.Util;
import id.InterfaceC6097a;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.Http2ExchangeCodec;
import nf.Settings;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.EnumC8112a;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import p107ff.Address;
import p107ff.CertificatePinner;
import p107ff.CipherSuite;
import p107ff.ConnectionSpec;
import p107ff.EventListener;
import p107ff.Handshake;
import p107ff.HttpUrl;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5482j;
import p107ff.OkHttpClient;
import p107ff.Protocol;
import p107ff.Request;
import p107ff.Response;
import p107ff.Route;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p182jf.TaskRunner;
import p204kf.RealConnectionPool;
import p222lf.InterfaceC7051d;
import p222lf.RealInterceptorChain;
import p240mf.Http1ExchangeCodec;
import p316qf.CertificateChainCleaner;
import p316qf.OkHostnameVerifier;
import p356sf.C10200t;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p489zc.Iterables;
import sd.Indent;
import sd.StringsJVM;

/* renamed from: okhttp3.internal.connection.f */
/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.AbstractC8118c implements InterfaceC5482j {

    /* renamed from: b */
    private final Route f21000b;

    /* renamed from: c */
    private Socket f21001c;

    /* renamed from: d */
    private Socket f21002d;

    /* renamed from: e */
    private Handshake f21003e;

    /* renamed from: f */
    private Protocol f21004f;

    /* renamed from: g */
    private Http2Connection f21005g;

    /* renamed from: h */
    private InterfaceC10187e f21006h;

    /* renamed from: i */
    private InterfaceC10186d f21007i;

    /* renamed from: j */
    private boolean f21008j;

    /* renamed from: k */
    private boolean f21009k;

    /* renamed from: l */
    private int f21010l;

    /* renamed from: m */
    private int f21011m;

    /* renamed from: n */
    private int f21012n;

    /* renamed from: o */
    private int f21013o;

    /* renamed from: p */
    private final List f21014p;

    /* renamed from: q */
    private long f21015q;

    /* compiled from: RealConnection.kt */
    /* renamed from: okhttp3.internal.connection.f$a */
    /* loaded from: classes2.dex */
    public static final class C8106a {
        private C8106a() {
        }

        public /* synthetic */ C8106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnection.kt */
    /* renamed from: okhttp3.internal.connection.f$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8107b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21016a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f21016a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealConnection.kt */
    /* renamed from: okhttp3.internal.connection.f$c */
    /* loaded from: classes2.dex */
    public static final class C8108c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ CertificatePinner f21017w;

        /* renamed from: x */
        final /* synthetic */ Handshake f21018x;

        /* renamed from: y */
        final /* synthetic */ Address f21019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8108c(CertificatePinner certificatePinner, Handshake handshake, Address address) {
            super(0);
            this.f21017w = certificatePinner;
            this.f21018x = handshake;
            this.f21019y = address;
        }

        /* renamed from: a */
        public final List mo42214q() {
            CertificateChainCleaner m24144d = this.f21017w.m24144d();
            Intrinsics.ifNullDoSomething(m24144d);
            return m24144d.m10111a(this.f21018x.m24020d(), this.f21019y.m24279l().m23983i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealConnection.kt */
    /* renamed from: okhttp3.internal.connection.f$d */
    /* loaded from: classes2.dex */
    public static final class C8109d extends AbstractC6438m implements InterfaceC6097a {
        C8109d() {
            super(0);
        }

        /* renamed from: a */
        public final List mo42214q() {
            int m186r;
            Handshake m16810d = RealConnection.m16810d(RealConnection.this);
            Intrinsics.ifNullDoSomething(m16810d);
            List<Certificate> m24020d = m16810d.m24020d();
            m186r = Iterables.m186r(m24020d, 10);
            ArrayList arrayList = new ArrayList(m186r);
            for (Certificate certificate : m24020d) {
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    static {
        new C8106a(null);
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route) {
        Intrinsics.isThisObjectNull(realConnectionPool, "connectionPool");
        Intrinsics.isThisObjectNull(route, "route");
        this.f21000b = route;
        this.f21013o = 1;
        this.f21014p = new ArrayList();
        this.f21015q = Long.MAX_VALUE;
    }

    /* renamed from: B */
    private final boolean m16820B(List list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Route route = (Route) it.next();
                if (route.m24150b().type() == Proxy.Type.DIRECT && this.f21000b.m24150b().type() == Proxy.Type.DIRECT && Intrinsics.equals(this.f21000b.m24148d(), route.m24148d())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    private final void m16816F(int i) throws IOException {
        Socket socket = this.f21002d;
        Intrinsics.ifNullDoSomething(socket);
        InterfaceC10187e interfaceC10187e = this.f21006h;
        Intrinsics.ifNullDoSomething(interfaceC10187e);
        InterfaceC10186d interfaceC10186d = this.f21007i;
        Intrinsics.ifNullDoSomething(interfaceC10186d);
        socket.setSoTimeout(0);
        Http2Connection m16688a = new Http2Connection.C8116a(true, TaskRunner.f17553i).m16670s(socket, this.f21000b.m24151a().m24279l().m23983i(), interfaceC10187e, interfaceC10186d).m16678k(this).m16677l(i).m16688a();
        this.f21005g = m16688a;
        this.f21013o = Http2Connection.f21054Y.m16669a().m17646d();
        Http2Connection.m16716W0(m16688a, false, null, 3, null);
    }

    /* renamed from: G */
    private final boolean m16815G(HttpUrl httpUrl) {
        Handshake handshake;
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        HttpUrl m24279l = this.f21000b.m24151a().m24279l();
        if (httpUrl.m23978n() != m24279l.m23978n()) {
            return false;
        }
        if (Intrinsics.equals(httpUrl.m23983i(), m24279l.m23983i())) {
            return true;
        }
        if (this.f21009k || (handshake = this.f21003e) == null) {
            return false;
        }
        Intrinsics.ifNullDoSomething(handshake);
        return m16808f(httpUrl, handshake);
    }

    /* renamed from: d */
    public static final /* synthetic */ Handshake m16810d(RealConnection realConnection) {
        return realConnection.f21003e;
    }

    /* renamed from: f */
    private final boolean m16808f(HttpUrl httpUrl, Handshake handshake) {
        List m24020d = handshake.m24020d();
        return (m24020d.isEmpty() ^ true) && OkHostnameVerifier.f25586a.m10105e(httpUrl.m23983i(), (X509Certificate) m24020d.get(0));
    }

    /* renamed from: i */
    private final void m16805i(int i, int i2, InterfaceC5469e interfaceC5469e, EventListener eventListener) throws IOException {
        Socket createSocket;
        Proxy m24150b = this.f21000b.m24150b();
        Address m24151a = this.f21000b.m24151a();
        Proxy.Type type = m24150b.type();
        int i3 = type == null ? -1 : C8107b.f21016a[type.ordinal()];
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(m24150b);
        } else {
            createSocket = m24151a.m24281j().createSocket();
            Intrinsics.ifNullDoSomething(createSocket);
        }
        this.f21001c = createSocket;
        eventListener.m24045i(interfaceC5469e, this.f21000b.m24148d(), m24150b);
        createSocket.setSoTimeout(i2);
        try {
            Platform.f21214a.m16457g().m16473f(createSocket, this.f21000b.m24148d(), i);
            try {
                this.f21006h = C10200t.m8565c(C10200t.m8557k(createSocket));
                this.f21007i = C10200t.m8566b(C10200t.m8561g(createSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.equals(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException(Intrinsics.addStrAndObj("Failed to connect to ", this.f21000b.m24148d()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: j */
    private final void m16804j(ConnectionSpecSelector connectionSpecSelector) throws IOException {
        String m8957h;
        Address m24151a = this.f21000b.m24151a();
        SSLSocketFactory m24280k = m24151a.m24280k();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.ifNullDoSomething(m24280k);
            Socket createSocket = m24280k.createSocket(this.f21001c, m24151a.m24279l().m23983i(), m24151a.m24279l().m23978n(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ConnectionSpec m16889a = connectionSpecSelector.m16889a(sSLSocket2);
                    if (m16889a.m24110h()) {
                        Platform.f21214a.m16457g().m16474e(sSLSocket2, m24151a.m24279l().m23983i(), m24151a.m24285f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    Handshake.C5495a c5495a = Handshake.f15533e;
                    Intrinsics.checkIfNull(session, "sslSocketSession");
                    Handshake m24018a = c5495a.m24018a(session);
                    HostnameVerifier m24286e = m24151a.m24286e();
                    Intrinsics.ifNullDoSomething(m24286e);
                    if (!m24286e.verify(m24151a.m24279l().m23983i(), session)) {
                        List m24020d = m24018a.m24020d();
                        if (!m24020d.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) m24020d.get(0);
                            m8957h = Indent.m8957h("\n              |Hostname " + m24151a.m24279l().m23983i() + " not verified:\n              |    certificate: " + CertificatePinner.f15455c.m24139a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + OkHostnameVerifier.f25586a.m10109a(x509Certificate) + "\n              ", null, 1, null);
                            throw new SSLPeerUnverifiedException(m8957h);
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + m24151a.m24279l().m23983i() + " not verified (no certificates)");
                    }
                    CertificatePinner m24290a = m24151a.m24290a();
                    Intrinsics.ifNullDoSomething(m24290a);
                    this.f21003e = new Handshake(m24018a.m24019e(), m24018a.m24023a(), m24018a.m24021c(), new C8108c(m24290a, m24018a, m24151a));
                    m24290a.m24146b(m24151a.m24279l().m23983i(), new C8109d());
                    String m16472g = m16889a.m24110h() ? Platform.f21214a.m16457g().m16472g(sSLSocket2) : null;
                    this.f21002d = sSLSocket2;
                    this.f21006h = C10200t.m8565c(C10200t.m8557k(sSLSocket2));
                    this.f21007i = C10200t.m8566b(C10200t.m8561g(sSLSocket2));
                    this.f21004f = m16472g != null ? Protocol.Companion.m24278a(m16472g) : Protocol.HTTP_1_1;
                    Platform.f21214a.m16457g().m16477b(sSLSocket2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.f21214a.m16457g().m16477b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        Util.m23403n(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: k */
    private final void m16803k(int i, int i2, int i3, InterfaceC5469e interfaceC5469e, EventListener eventListener) throws IOException {
        Request m16801m = m16801m();
        HttpUrl m24266j = m16801m.m24266j();
        int i4 = 0;
        while (i4 < 21) {
            i4++;
            m16805i(i, i2, interfaceC5469e, eventListener);
            m16801m = m16802l(i2, i3, m16801m, m24266j);
            if (m16801m == null) {
                return;
            }
            Socket socket = this.f21001c;
            if (socket != null) {
                Util.m23403n(socket);
            }
            this.f21001c = null;
            this.f21007i = null;
            this.f21006h = null;
            eventListener.m24047g(interfaceC5469e, this.f21000b.m24148d(), this.f21000b.m24150b(), null);
        }
    }

    /* renamed from: l */
    private final Request m16802l(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        boolean m8943q;
        String str = "CONNECT " + Util.m23426Q(httpUrl, true) + " HTTP/1.1";
        while (true) {
            InterfaceC10187e interfaceC10187e = this.f21006h;
            Intrinsics.ifNullDoSomething(interfaceC10187e);
            InterfaceC10186d interfaceC10186d = this.f21007i;
            Intrinsics.ifNullDoSomething(interfaceC10186d);
            Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, interfaceC10187e, interfaceC10186d);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC10187e.mo40537timeout().m8646g(i, timeUnit);
            interfaceC10186d.mo40536timeout().m8646g(i2, timeUnit);
            http1ExchangeCodec.m18988A(request.m24271e(), str);
            http1ExchangeCodec.mo19471a();
            Response.C5468a mo19466f = http1ExchangeCodec.mo19466f(false);
            Intrinsics.ifNullDoSomething(mo19466f);
            Response m24186c = mo19466f.m24170s(request).m24186c();
            http1ExchangeCodec.m18962z(m24186c);
            int m24197t = m24186c.m24197t();
            if (m24197t == 200) {
                if (interfaceC10187e.mo8759b().mo8762Q() && interfaceC10186d.mo8778b().mo8762Q()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (m24197t == 407) {
                Request m24277a = this.f21000b.m24151a().m24283h().m24277a(this.f21000b, m24186c);
                if (m24277a != null) {
                    m8943q = StringsJVM.m8943q("close", Response.m24212F(m24186c, "Connection", null, 2, null), true);
                    if (m8943q) {
                        return m24277a;
                    }
                    request = m24277a;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException(Intrinsics.addStrAndObj("Unexpected response code for CONNECT: ", Integer.valueOf(m24186c.m24197t())));
            }
        }
    }

    /* renamed from: m */
    private final Request m16801m() throws IOException {
        Request m24264b = new Request.C5460a().m24250p(this.f21000b.m24151a().m24279l()).m24258h("CONNECT", null).m24260f("Host", Util.m23426Q(this.f21000b.m24151a().m24279l(), true)).m24260f("Proxy-Connection", "Keep-Alive").m24260f("User-Agent", "okhttp/4.10.0").m24264b();
        Request m24277a = this.f21000b.m24151a().m24283h().m24277a(this.f21000b, new Response.C5468a().m24170s(m24264b).m24172q(Protocol.HTTP_1_1).m24182g(407).m24175n("Preemptive Authenticate").m24187b(Util.f15901c).m24169t(-1L).m24171r(-1L).m24178k("Proxy-Authenticate", "OkHttp-Preemptive").m24186c());
        return m24277a == null ? m24264b : m24277a;
    }

    /* renamed from: n */
    private final void m16800n(ConnectionSpecSelector connectionSpecSelector, int i, InterfaceC5469e interfaceC5469e, EventListener eventListener) throws IOException {
        if (this.f21000b.m24151a().m24280k() == null) {
            List m24285f = this.f21000b.m24151a().m24285f();
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (m24285f.contains(protocol)) {
                this.f21002d = this.f21001c;
                this.f21004f = protocol;
                m16816F(i);
                return;
            }
            this.f21002d = this.f21001c;
            this.f21004f = Protocol.HTTP_1_1;
            return;
        }
        eventListener.m24054B(interfaceC5469e);
        m16804j(connectionSpecSelector);
        eventListener.m24055A(interfaceC5469e, this.f21003e);
        if (this.f21004f == Protocol.HTTP_2) {
            m16816F(i);
        }
    }

    /* renamed from: A */
    public Route m16821A() {
        return this.f21000b;
    }

    /* renamed from: C */
    public final void m16819C(long j) {
        this.f21015q = j;
    }

    /* renamed from: D */
    public final void m16818D(boolean z) {
        this.f21008j = z;
    }

    /* renamed from: E */
    public Socket m16817E() {
        Socket socket = this.f21002d;
        Intrinsics.ifNullDoSomething(socket);
        return socket;
    }

    /* renamed from: H */
    public final synchronized void m16814H(RealCall realCall, IOException iOException) {
        Intrinsics.isThisObjectNull(realCall, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f21032w == EnumC8112a.REFUSED_STREAM) {
                int i = this.f21012n + 1;
                this.f21012n = i;
                if (i > 1) {
                    this.f21008j = true;
                    this.f21010l++;
                }
            } else if (((StreamResetException) iOException).f21032w != EnumC8112a.CANCEL || !realCall.isCanceled()) {
                this.f21008j = true;
                this.f21010l++;
            }
        } else if (!m16791w() || (iOException instanceof ConnectionShutdownException)) {
            this.f21008j = true;
            if (this.f21011m == 0) {
                if (iOException != null) {
                    m16806h(realCall.m16841k(), this.f21000b, iOException);
                }
                this.f21010l++;
            }
        }
    }

    /* renamed from: a */
    public Protocol mo24119a() {
        Protocol protocol = this.f21004f;
        Intrinsics.ifNullDoSomething(protocol);
        return protocol;
    }

    /* renamed from: b */
    public synchronized void m16812b(Http2Connection http2Connection, Settings settings) {
        Intrinsics.isThisObjectNull(http2Connection, "connection");
        Intrinsics.isThisObjectNull(settings, "settings");
        this.f21013o = settings.m17646d();
    }

    /* renamed from: c */
    public void m16811c(Http2Stream http2Stream) throws IOException {
        Intrinsics.isThisObjectNull(http2Stream, "stream");
        http2Stream.m16598d(EnumC8112a.REFUSED_STREAM, null);
    }

    /* renamed from: e */
    public final void m16809e() {
        Socket socket = this.f21001c;
        if (socket == null) {
            return;
        }
        Util.m23403n(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:21:0x009a, B:23:0x00a2), top: B:70:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[EDGE_INSN: B:74:0x014e->B:63:0x014e ?: BREAK  ] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16807g(int r17, int r18, int r19, int r20, boolean r21, p107ff.InterfaceC5469e r22, p107ff.EventListener r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.m16807g(int, int, int, int, boolean, ff.e, ff.r):void");
    }

    /* renamed from: h */
    public final void m16806h(OkHttpClient okHttpClient, Route route, IOException iOException) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(route, "failedRoute");
        Intrinsics.isThisObjectNull(iOException, "failure");
        if (route.m24150b().type() != Proxy.Type.DIRECT) {
            Address m24151a = route.m24151a();
            m24151a.m24282i().connectFailed(m24151a.m24279l().m23973s(), route.m24150b().address(), iOException);
        }
        okHttpClient.m23871r().m20367b(route);
    }

    /* renamed from: o */
    public final List m16799o() {
        return this.f21014p;
    }

    /* renamed from: p */
    public final long m16798p() {
        return this.f21015q;
    }

    /* renamed from: q */
    public final boolean m16797q() {
        return this.f21008j;
    }

    /* renamed from: r */
    public final int m16796r() {
        return this.f21010l;
    }

    /* renamed from: s */
    public Handshake m16795s() {
        return this.f21003e;
    }

    /* renamed from: t */
    public final synchronized void m16794t() {
        this.f21011m++;
    }

    public String toString() {
        CipherSuite m24023a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f21000b.m24151a().m24279l().m23983i());
        sb2.append(':');
        sb2.append(this.f21000b.m24151a().m24279l().m23978n());
        sb2.append(", proxy=");
        sb2.append(this.f21000b.m24150b());
        sb2.append(" hostAddress=");
        sb2.append(this.f21000b.m24148d());
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f21003e;
        Object obj = "none";
        if (handshake != null && (m24023a = handshake.m24023a()) != null) {
            obj = m24023a;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f21004f);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m16793u(Address address, List list) {
        Intrinsics.isThisObjectNull(address, "address");
        if (Util.f15905g && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        } else if (this.f21014p.size() >= this.f21013o || this.f21008j || !this.f21000b.m24151a().m24287d(address)) {
            return false;
        } else {
            if (Intrinsics.equals(address.m24279l().m23983i(), m16821A().m24151a().m24279l().m23983i())) {
                return true;
            }
            if (this.f21005g != null && list != null && m16820B(list) && address.m24286e() == OkHostnameVerifier.f25586a && m16815G(address.m24279l())) {
                try {
                    CertificatePinner m24290a = address.m24290a();
                    Intrinsics.ifNullDoSomething(m24290a);
                    String m23983i = address.m24279l().m23983i();
                    Handshake m16795s = m16795s();
                    Intrinsics.ifNullDoSomething(m16795s);
                    m24290a.m24147a(m23983i, m16795s.m24020d());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: v */
    public final boolean m16792v(boolean z) {
        long m16798p;
        if (Util.f15905g && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f21001c;
        Intrinsics.ifNullDoSomething(socket);
        Socket socket2 = this.f21002d;
        Intrinsics.ifNullDoSomething(socket2);
        InterfaceC10187e interfaceC10187e = this.f21006h;
        Intrinsics.ifNullDoSomething(interfaceC10187e);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f21005g;
        if (http2Connection != null) {
            return http2Connection.m16736H0(nanoTime);
        }
        synchronized (this) {
            m16798p = nanoTime - m16798p();
        }
        if (m16798p < 10000000000L || !z) {
            return true;
        }
        return Util.m23437F(socket2, interfaceC10187e);
    }

    /* renamed from: w */
    public final boolean m16791w() {
        return this.f21005g != null;
    }

    /* renamed from: x */
    public final InterfaceC7051d m16790x(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(realInterceptorChain, "chain");
        Socket socket = this.f21002d;
        Intrinsics.ifNullDoSomething(socket);
        InterfaceC10187e interfaceC10187e = this.f21006h;
        Intrinsics.ifNullDoSomething(interfaceC10187e);
        InterfaceC10186d interfaceC10186d = this.f21007i;
        Intrinsics.ifNullDoSomething(interfaceC10186d);
        Http2Connection http2Connection = this.f21005g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(realInterceptorChain.m19441k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        interfaceC10187e.mo40537timeout().m8646g(realInterceptorChain.m19444h(), timeUnit);
        interfaceC10186d.mo40536timeout().m8646g(realInterceptorChain.m19442j(), timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, interfaceC10187e, interfaceC10186d);
    }

    /* renamed from: y */
    public final synchronized void m16789y() {
        this.f21009k = true;
    }

    /* renamed from: z */
    public final synchronized void m16788z() {
        this.f21008j = true;
    }
}
