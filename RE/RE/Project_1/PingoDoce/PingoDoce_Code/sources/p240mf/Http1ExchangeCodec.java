package p240mf;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RealConnection;
import p107ff.Headers;
import p107ff.HttpUrl;
import p107ff.OkHttpClient;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;
import p222lf.HttpHeaders;
import p222lf.InterfaceC7051d;
import p222lf.RequestLine;
import p222lf.StatusLine;
import p356sf.Buffer;
import p356sf.ForwardingTimeout;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;
import p356sf.Timeout;
import sd.StringsJVM;

/* renamed from: mf.b */
/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements InterfaceC7051d {

    /* renamed from: a */
    private final OkHttpClient f19016a;

    /* renamed from: b */
    private final RealConnection f19017b;

    /* renamed from: c */
    private final InterfaceC10187e f19018c;

    /* renamed from: d */
    private final InterfaceC10186d f19019d;

    /* renamed from: e */
    private int f19020e;

    /* renamed from: f */
    private final HeadersReader f19021f;

    /* renamed from: g */
    private Headers f19022g;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$a */
    /* loaded from: classes2.dex */
    public abstract class AbstractC7189a implements InterfaceC10191h0 {

        /* renamed from: w */
        private final ForwardingTimeout f19023w;

        /* renamed from: x */
        private boolean f19024x;

        /* renamed from: y */
        final /* synthetic */ Http1ExchangeCodec f19025y;

        public AbstractC7189a(Http1ExchangeCodec http1ExchangeCodec) {
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
            this.f19025y = http1ExchangeCodec;
            this.f19023w = new ForwardingTimeout(Http1ExchangeCodec.m18975m(http1ExchangeCodec).mo40537timeout());
        }

        /* renamed from: a */
        protected final boolean m18961a() {
            return this.f19024x;
        }

        /* renamed from: c */
        public final void m18960c() {
            if (Http1ExchangeCodec.m18974n(this.f19025y) == 6) {
                return;
            }
            if (Http1ExchangeCodec.m18974n(this.f19025y) == 5) {
                Http1ExchangeCodec.m18980h(this.f19025y, this.f19023w);
                Http1ExchangeCodec.m18972p(this.f19025y, 6);
                return;
            }
            throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(Http1ExchangeCodec.m18974n(this.f19025y))));
        }

        /* renamed from: e */
        protected final void m18959e(boolean z) {
            this.f19024x = z;
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            try {
                return Http1ExchangeCodec.m18975m(this.f19025y).read(buffer, j);
            } catch (IOException e) {
                this.f19025y.mo19464k().m16788z();
                m18960c();
                throw e;
            }
        }

        /* renamed from: timeout */
        public Timeout mo40537timeout() {
            return this.f19023w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$b */
    /* loaded from: classes2.dex */
    public final class C7190b implements InterfaceC10189f0 {

        /* renamed from: w */
        private final ForwardingTimeout f19026w;

        /* renamed from: x */
        private boolean f19027x;

        /* renamed from: y */
        final /* synthetic */ Http1ExchangeCodec f19028y;

        public C7190b(Http1ExchangeCodec http1ExchangeCodec) {
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
            this.f19028y = http1ExchangeCodec;
            this.f19026w = new ForwardingTimeout(Http1ExchangeCodec.m18976l(http1ExchangeCodec).mo40536timeout());
        }

        /* renamed from: B */
        public void mo8688B(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "source");
            if (!(!this.f19027x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            Http1ExchangeCodec.m18976l(this.f19028y).mo8775p(j);
            Http1ExchangeCodec.m18976l(this.f19028y).mo8774u0("\r\n");
            Http1ExchangeCodec.m18976l(this.f19028y).mo8688B(buffer, j);
            Http1ExchangeCodec.m18976l(this.f19028y).mo8774u0("\r\n");
        }

        public synchronized void close() {
            if (this.f19027x) {
                return;
            }
            this.f19027x = true;
            Http1ExchangeCodec.m18976l(this.f19028y).mo8774u0("0\r\n\r\n");
            Http1ExchangeCodec.m18980h(this.f19028y, this.f19026w);
            Http1ExchangeCodec.m18972p(this.f19028y, 3);
        }

        public synchronized void flush() {
            if (this.f19027x) {
                return;
            }
            Http1ExchangeCodec.m18976l(this.f19028y).flush();
        }

        /* renamed from: timeout */
        public Timeout mo40536timeout() {
            return this.f19026w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$c */
    /* loaded from: classes2.dex */
    public final class C7191c extends AbstractC7189a {

        /* renamed from: A */
        private long f19029A;

        /* renamed from: B */
        private boolean f19030B;

        /* renamed from: C */
        final /* synthetic */ Http1ExchangeCodec f19031C;

        /* renamed from: z */
        private final HttpUrl f19032z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7191c(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec);
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
            Intrinsics.isThisObjectNull(httpUrl, "url");
            this.f19031C = http1ExchangeCodec;
            this.f19032z = httpUrl;
            this.f19029A = -1L;
            this.f19030B = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r1 != false) goto L13;
         */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m18958h() {
            /*
                r7 = this;
                long r0 = r7.f19029A
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                mf.b r0 = r7.f19031C
                sf.e r0 = p240mf.Http1ExchangeCodec.m18975m(r0)
                r0.mo8765J()
            L11:
                mf.b r0 = r7.f19031C     // Catch: java.lang.NumberFormatException -> La2
                sf.e r0 = p240mf.Http1ExchangeCodec.m18975m(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.mo8745z0()     // Catch: java.lang.NumberFormatException -> La2
                r7.f19029A = r0     // Catch: java.lang.NumberFormatException -> La2
                mf.b r0 = r7.f19031C     // Catch: java.lang.NumberFormatException -> La2
                sf.e r0 = p240mf.Http1ExchangeCodec.m18975m(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.mo8765J()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = sd.C10163k.m8998K0(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.f19029A     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = r2
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = sd.C10163k.m9008C(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.f19029A
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L80
                r7.f19030B = r2
                mf.b r0 = r7.f19031C
                mf.a r1 = p240mf.Http1ExchangeCodec.m18978j(r0)
                ff.u r1 = r1.m18990a()
                p240mf.Http1ExchangeCodec.m18971q(r0, r1)
                mf.b r0 = r7.f19031C
                ff.z r0 = p240mf.Http1ExchangeCodec.m18979i(r0)
                p181jd.Intrinsics.ifNullDoSomething(r0)
                ff.n r0 = r0.m23877l()
                ff.v r1 = r7.f19032z
                mf.b r2 = r7.f19031C
                ff.u r2 = p240mf.Http1ExchangeCodec.m18973o(r2)
                p181jd.Intrinsics.ifNullDoSomething(r2)
                p222lf.HttpHeaders.m19458f(r0, r1, r2)
                r7.m18960c()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.f19029A     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p240mf.Http1ExchangeCodec.C7191c.m18958h():void");
        }

        public void close() {
            if (m18961a()) {
                return;
            }
            if (this.f19030B && !Util.m23398s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19031C.mo19464k().m16788z();
                m18960c();
            }
            m18959e(true);
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            if (j >= 0) {
                if (!m18961a()) {
                    if (this.f19030B) {
                        long j2 = this.f19029A;
                        if (j2 == 0 || j2 == -1) {
                            m18958h();
                            if (!this.f19030B) {
                                return -1L;
                            }
                        }
                        long read = super.read(buffer, Math.min(j, this.f19029A));
                        if (read != -1) {
                            this.f19029A -= read;
                            return read;
                        }
                        this.f19031C.mo19464k().m16788z();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        m18960c();
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$d */
    /* loaded from: classes2.dex */
    public static final class C7192d {
        private C7192d() {
        }

        public /* synthetic */ C7192d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$e */
    /* loaded from: classes2.dex */
    public final class C7193e extends AbstractC7189a {

        /* renamed from: A */
        final /* synthetic */ Http1ExchangeCodec f19033A;

        /* renamed from: z */
        private long f19034z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7193e(Http1ExchangeCodec http1ExchangeCodec, long j) {
            super(http1ExchangeCodec);
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
            this.f19033A = http1ExchangeCodec;
            this.f19034z = j;
            if (j == 0) {
                m18960c();
            }
        }

        public void close() {
            if (m18961a()) {
                return;
            }
            if (this.f19034z != 0 && !Util.m23398s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f19033A.mo19464k().m16788z();
                m18960c();
            }
            m18959e(true);
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            if (j >= 0) {
                if (!m18961a()) {
                    long j2 = this.f19034z;
                    if (j2 == 0) {
                        return -1L;
                    }
                    long read = super.read(buffer, Math.min(j2, j));
                    if (read != -1) {
                        long j3 = this.f19034z - read;
                        this.f19034z = j3;
                        if (j3 == 0) {
                            m18960c();
                        }
                        return read;
                    }
                    this.f19033A.mo19464k().m16788z();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    m18960c();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$f */
    /* loaded from: classes2.dex */
    public final class C7194f implements InterfaceC10189f0 {

        /* renamed from: w */
        private final ForwardingTimeout f19035w;

        /* renamed from: x */
        private boolean f19036x;

        /* renamed from: y */
        final /* synthetic */ Http1ExchangeCodec f19037y;

        public C7194f(Http1ExchangeCodec http1ExchangeCodec) {
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
            this.f19037y = http1ExchangeCodec;
            this.f19035w = new ForwardingTimeout(Http1ExchangeCodec.m18976l(http1ExchangeCodec).mo40536timeout());
        }

        /* renamed from: B */
        public void mo8688B(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "source");
            if (!this.f19036x) {
                Util.m23405l(buffer.size(), 0L, j);
                Http1ExchangeCodec.m18976l(this.f19037y).mo8688B(buffer, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() {
            if (this.f19036x) {
                return;
            }
            this.f19036x = true;
            Http1ExchangeCodec.m18980h(this.f19037y, this.f19035w);
            Http1ExchangeCodec.m18972p(this.f19037y, 3);
        }

        public void flush() {
            if (this.f19036x) {
                return;
            }
            Http1ExchangeCodec.m18976l(this.f19037y).flush();
        }

        /* renamed from: timeout */
        public Timeout mo40536timeout() {
            return this.f19035w;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http1ExchangeCodec.kt */
    /* renamed from: mf.b$g */
    /* loaded from: classes2.dex */
    public final class C7195g extends AbstractC7189a {

        /* renamed from: z */
        private boolean f19038z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7195g(Http1ExchangeCodec http1ExchangeCodec) {
            super(http1ExchangeCodec);
            Intrinsics.isThisObjectNull(http1ExchangeCodec, "this$0");
        }

        public void close() {
            if (m18961a()) {
                return;
            }
            if (!this.f19038z) {
                m18960c();
            }
            m18959e(true);
        }

        public long read(Buffer buffer, long j) {
            Intrinsics.isThisObjectNull(buffer, "sink");
            if (j >= 0) {
                if (!m18961a()) {
                    if (this.f19038z) {
                        return -1L;
                    }
                    long read = super.read(buffer, j);
                    if (read == -1) {
                        this.f19038z = true;
                        m18960c();
                        return -1L;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    static {
        new C7192d(null);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, InterfaceC10187e interfaceC10187e, InterfaceC10186d interfaceC10186d) {
        Intrinsics.isThisObjectNull(realConnection, "connection");
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        this.f19016a = okHttpClient;
        this.f19017b = realConnection;
        this.f19018c = interfaceC10187e;
        this.f19019d = interfaceC10186d;
        this.f19021f = new HeadersReader(interfaceC10187e);
    }

    /* renamed from: h */
    public static final /* synthetic */ void m18980h(Http1ExchangeCodec http1ExchangeCodec, ForwardingTimeout forwardingTimeout) {
        http1ExchangeCodec.m18970r(forwardingTimeout);
    }

    /* renamed from: i */
    public static final /* synthetic */ OkHttpClient m18979i(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19016a;
    }

    /* renamed from: j */
    public static final /* synthetic */ HeadersReader m18978j(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19021f;
    }

    /* renamed from: l */
    public static final /* synthetic */ InterfaceC10186d m18976l(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19019d;
    }

    /* renamed from: m */
    public static final /* synthetic */ InterfaceC10187e m18975m(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19018c;
    }

    /* renamed from: n */
    public static final /* synthetic */ int m18974n(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19020e;
    }

    /* renamed from: o */
    public static final /* synthetic */ Headers m18973o(Http1ExchangeCodec http1ExchangeCodec) {
        return http1ExchangeCodec.f19022g;
    }

    /* renamed from: p */
    public static final /* synthetic */ void m18972p(Http1ExchangeCodec http1ExchangeCodec, int i) {
        http1ExchangeCodec.f19020e = i;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m18971q(Http1ExchangeCodec http1ExchangeCodec, Headers headers) {
        http1ExchangeCodec.f19022g = headers;
    }

    /* renamed from: r */
    private final void m18970r(ForwardingTimeout forwardingTimeout) {
        Timeout m8606i = forwardingTimeout.m8606i();
        forwardingTimeout.m8605j(Timeout.f26564d);
        m8606i.m8652a();
        m8606i.m8651b();
    }

    /* renamed from: s */
    private final boolean m18969s(Request request) {
        boolean m8943q;
        m8943q = StringsJVM.m8943q("chunked", request.m24272d("Transfer-Encoding"), true);
        return m8943q;
    }

    /* renamed from: t */
    private final boolean m18968t(Response response) {
        boolean m8943q;
        m8943q = StringsJVM.m8943q("chunked", Response.m24212F(response, "Transfer-Encoding", null, 2, null), true);
        return m8943q;
    }

    /* renamed from: u */
    private final InterfaceC10189f0 m18967u() {
        int i = this.f19020e;
        if (i == 1) {
            this.f19020e = 2;
            return new C7190b(this);
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: v */
    private final InterfaceC10191h0 m18966v(HttpUrl httpUrl) {
        int i = this.f19020e;
        if (i == 4) {
            this.f19020e = 5;
            return new C7191c(this, httpUrl);
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: w */
    private final InterfaceC10191h0 m18965w(long j) {
        int i = this.f19020e;
        if (i == 4) {
            this.f19020e = 5;
            return new C7193e(this, j);
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: x */
    private final InterfaceC10189f0 m18964x() {
        int i = this.f19020e;
        if (i == 1) {
            this.f19020e = 2;
            return new C7194f(this);
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: y */
    private final InterfaceC10191h0 m18963y() {
        int i = this.f19020e;
        if (i == 4) {
            this.f19020e = 5;
            mo19464k().m16788z();
            return new C7195g(this);
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: A */
    public final void m18988A(Headers headers, String str) {
        Intrinsics.isThisObjectNull(headers, "headers");
        Intrinsics.isThisObjectNull(str, "requestLine");
        int i = this.f19020e;
        if (i == 0) {
            this.f19019d.mo8774u0(str).mo8774u0("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f19019d.mo8774u0(headers.m24012h(i2)).mo8774u0(": ").mo8774u0(headers.m24009p(i2)).mo8774u0("\r\n");
            }
            this.f19019d.mo8774u0("\r\n");
            this.f19020e = 1;
            return;
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: a */
    public void mo19471a() {
        this.f19019d.flush();
    }

    /* renamed from: b */
    public InterfaceC10191h0 mo19470b(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        if (HttpHeaders.m19462b(response)) {
            if (m18968t(response)) {
                return m18966v(response.m24202a0().m24266j());
            }
            long m23395v = Util.m23395v(response);
            if (m23395v != -1) {
                return m18965w(m23395v);
            }
            return m18963y();
        }
        return m18965w(0L);
    }

    /* renamed from: c */
    public void mo19469c() {
        this.f19019d.flush();
    }

    public void cancel() {
        mo19464k().m16809e();
    }

    /* renamed from: d */
    public long mo19468d(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        if (HttpHeaders.m19462b(response)) {
            if (m18968t(response)) {
                return -1L;
            }
            return Util.m23395v(response);
        }
        return 0L;
    }

    /* renamed from: e */
    public InterfaceC10189f0 mo19467e(Request request, long j) {
        Intrinsics.isThisObjectNull(request, "request");
        if (request.m24275a() == null || !request.m24275a().isDuplex()) {
            if (m18969s(request)) {
                return m18967u();
            }
            if (j != -1) {
                return m18964x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    /* renamed from: f */
    public Response.C5468a mo19466f(boolean z) {
        int i = this.f19020e;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine m19430a = StatusLine.f18731d.m19430a(this.f19021f.m18989b());
                Response.C5468a m24177l = new Response.C5468a().m24172q(m19430a.f18732a).m24182g(m19430a.f18733b).m24175n(m19430a.f18734c).m24177l(this.f19021f.m18990a());
                if (z && m19430a.f18733b == 100) {
                    return null;
                }
                if (m19430a.f18733b == 100) {
                    this.f19020e = 3;
                    return m24177l;
                }
                this.f19020e = 4;
                return m24177l;
            } catch (EOFException e) {
                throw new IOException(Intrinsics.addStrAndObj("unexpected end of stream on ", mo19464k().m16821A().m24151a().m24279l().m23976p()), e);
            }
        }
        throw new IllegalStateException(Intrinsics.addStrAndObj("state: ", Integer.valueOf(i)).toString());
    }

    /* renamed from: g */
    public void mo19465g(Request request) {
        Intrinsics.isThisObjectNull(request, "request");
        RequestLine requestLine = RequestLine.f18729a;
        Proxy.Type type = mo19464k().m16821A().m24150b().type();
        Intrinsics.checkIfNull(type, "connection.route().proxy.type()");
        m18988A(request.m24271e(), requestLine.m19440a(request, type));
    }

    /* renamed from: k */
    public RealConnection mo19464k() {
        return this.f19017b;
    }

    /* renamed from: z */
    public final void m18962z(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        long m23395v = Util.m23395v(response);
        if (m23395v == -1) {
            return;
        }
        InterfaceC10191h0 m18965w = m18965w(m23395v);
        Util.m23431L(m18965w, Reader.READ_DONE, TimeUnit.MILLISECONDS);
        m18965w.close();
    }
}
