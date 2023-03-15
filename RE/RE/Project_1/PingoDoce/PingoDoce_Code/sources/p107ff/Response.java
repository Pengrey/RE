package p107ff;

import java.io.Closeable;
import java.util.List;
import okhttp3.internal.connection.Exchange;
import p107ff.Headers;
import p181jd.Intrinsics;
import p222lf.HttpHeaders;
import p489zc.C13780s;

/* renamed from: ff.d0 */
/* loaded from: classes2.dex */
public final class Response implements Closeable {

    /* renamed from: A */
    private final Handshake f15418A;

    /* renamed from: B */
    private final Headers f15419B;

    /* renamed from: C */
    private final ResponseBody f15420C;

    /* renamed from: D */
    private final Response f15421D;

    /* renamed from: E */
    private final Response f15422E;

    /* renamed from: F */
    private final Response f15423F;

    /* renamed from: G */
    private final long f15424G;

    /* renamed from: H */
    private final long f15425H;

    /* renamed from: I */
    private final Exchange f15426I;

    /* renamed from: J */
    private CacheControl f15427J;

    /* renamed from: w */
    private final Request f15428w;

    /* renamed from: x */
    private final Protocol f15429x;

    /* renamed from: y */
    private final String f15430y;

    /* renamed from: z */
    private final int f15431z;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        Intrinsics.isThisObjectNull(request, "request");
        Intrinsics.isThisObjectNull(protocol, "protocol");
        Intrinsics.isThisObjectNull(str, "message");
        Intrinsics.isThisObjectNull(headers, "headers");
        this.f15428w = request;
        this.f15429x = protocol;
        this.f15430y = str;
        this.f15431z = i;
        this.f15418A = handshake;
        this.f15419B = headers;
        this.f15420C = responseBody;
        this.f15421D = response;
        this.f15422E = response2;
        this.f15423F = response3;
        this.f15424G = j;
        this.f15425H = j2;
        this.f15426I = exchange;
    }

    /* renamed from: F */
    public static /* synthetic */ String m24212F(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.m24213E(str, str2);
    }

    /* renamed from: E */
    public final String m24213E(String str, String str2) {
        Intrinsics.isThisObjectNull(str, "name");
        String m24014b = this.f15419B.m24014b(str);
        return m24014b == null ? str2 : m24014b;
    }

    /* renamed from: H */
    public final Headers m24211H() {
        return this.f15419B;
    }

    /* renamed from: L */
    public final String m24210L() {
        return this.f15430y;
    }

    /* renamed from: M */
    public final Response m24209M() {
        return this.f15421D;
    }

    /* renamed from: P */
    public final C5468a m24208P() {
        return new C5468a(this);
    }

    /* renamed from: R */
    public final Response m24207R() {
        return this.f15423F;
    }

    /* renamed from: V */
    public final boolean m24206V() {
        int i = this.f15431z;
        return 200 <= i && i < 300;
    }

    /* renamed from: W */
    public final Protocol m24205W() {
        return this.f15429x;
    }

    /* renamed from: X */
    public final long m24204X() {
        return this.f15425H;
    }

    /* renamed from: a */
    public final ResponseBody m24203a() {
        return this.f15420C;
    }

    /* renamed from: a0 */
    public final Request m24202a0() {
        return this.f15428w;
    }

    /* renamed from: b0 */
    public final long m24201b0() {
        return this.f15424G;
    }

    /* renamed from: c */
    public final CacheControl m24200c() {
        CacheControl cacheControl = this.f15427J;
        if (cacheControl == null) {
            CacheControl m24214b = CacheControl.f15394n.m24214b(this.f15419B);
            this.f15427J = m24214b;
            return m24214b;
        }
        return cacheControl;
    }

    public void close() {
        ResponseBody responseBody = this.f15420C;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        responseBody.close();
    }

    /* renamed from: e */
    public final Response m24199e() {
        return this.f15422E;
    }

    /* renamed from: h */
    public final List m24198h() {
        String str;
        List m197g;
        Headers headers = this.f15419B;
        int i = this.f15431z;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            m197g = C13780s.m197g();
            return m197g;
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.m19463a(headers, str);
    }

    /* renamed from: t */
    public final int m24197t() {
        return this.f15431z;
    }

    public String toString() {
        return "Response{protocol=" + this.f15429x + ", code=" + this.f15431z + ", message=" + this.f15430y + ", url=" + this.f15428w.m24266j() + '}';
    }

    /* renamed from: v */
    public final Exchange m24196v() {
        return this.f15426I;
    }

    /* renamed from: y */
    public final Handshake m24195y() {
        return this.f15418A;
    }

    /* compiled from: Response.kt */
    /* renamed from: ff.d0$a */
    /* loaded from: classes2.dex */
    public static class C5468a {

        /* renamed from: a */
        private Request f15432a;

        /* renamed from: b */
        private Protocol f15433b;

        /* renamed from: c */
        private int f15434c;

        /* renamed from: d */
        private String f15435d;

        /* renamed from: e */
        private Handshake f15436e;

        /* renamed from: f */
        private Headers.C5498a f15437f;

        /* renamed from: g */
        private ResponseBody f15438g;

        /* renamed from: h */
        private Response f15439h;

        /* renamed from: i */
        private Response f15440i;

        /* renamed from: j */
        private Response f15441j;

        /* renamed from: k */
        private long f15442k;

        /* renamed from: l */
        private long f15443l;

        /* renamed from: m */
        private Exchange f15444m;

        public C5468a() {
            this.f15434c = -1;
            this.f15437f = new Headers.C5498a();
        }

        /* renamed from: e */
        private final void m24184e(Response response) {
            if (response == null) {
                return;
            }
            if (!(response.m24203a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        /* renamed from: f */
        private final void m24183f(String str, Response response) {
            if (response == null) {
                return;
            }
            if (response.m24203a() == null) {
                if (response.m24209M() == null) {
                    if (response.m24199e() == null) {
                        if (!(response.m24207R() == null)) {
                            throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, ".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, ".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, ".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(Intrinsics.addStrAndObj(str, ".body != null").toString());
        }

        /* renamed from: A */
        public final void m24194A(Response response) {
            this.f15439h = response;
        }

        /* renamed from: B */
        public final void m24193B(Response response) {
            this.f15441j = response;
        }

        /* renamed from: C */
        public final void m24192C(Protocol protocol) {
            this.f15433b = protocol;
        }

        /* renamed from: D */
        public final void m24191D(long j) {
            this.f15443l = j;
        }

        /* renamed from: E */
        public final void m24190E(Request request) {
            this.f15432a = request;
        }

        /* renamed from: F */
        public final void m24189F(long j) {
            this.f15442k = j;
        }

        /* renamed from: a */
        public C5468a m24188a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            m24180i().m24007a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C5468a m24187b(ResponseBody responseBody) {
            m24168u(responseBody);
            return this;
        }

        /* renamed from: c */
        public Response m24186c() {
            int i = this.f15434c;
            if (i >= 0) {
                Request request = this.f15432a;
                if (request != null) {
                    Protocol protocol = this.f15433b;
                    if (protocol != null) {
                        String str = this.f15435d;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.f15436e, this.f15437f.m24002f(), this.f15438g, this.f15439h, this.f15440i, this.f15441j, this.f15442k, this.f15443l, this.f15444m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(Intrinsics.addStrAndObj("code < 0: ", Integer.valueOf(m24181h())).toString());
        }

        /* renamed from: d */
        public C5468a m24185d(Response response) {
            m24183f("cacheResponse", response);
            m24167v(response);
            return this;
        }

        /* renamed from: g */
        public C5468a m24182g(int i) {
            m24166w(i);
            return this;
        }

        /* renamed from: h */
        public final int m24181h() {
            return this.f15434c;
        }

        /* renamed from: i */
        public final Headers.C5498a m24180i() {
            return this.f15437f;
        }

        /* renamed from: j */
        public C5468a m24179j(Handshake handshake) {
            m24165x(handshake);
            return this;
        }

        /* renamed from: k */
        public C5468a m24178k(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            m24180i().m23999i(str, str2);
            return this;
        }

        /* renamed from: l */
        public C5468a m24177l(Headers headers) {
            Intrinsics.isThisObjectNull(headers, "headers");
            m24164y(headers.m24011l());
            return this;
        }

        /* renamed from: m */
        public final void m24176m(Exchange exchange) {
            Intrinsics.isThisObjectNull(exchange, "deferredTrailers");
            this.f15444m = exchange;
        }

        /* renamed from: n */
        public C5468a m24175n(String str) {
            Intrinsics.isThisObjectNull(str, "message");
            m24163z(str);
            return this;
        }

        /* renamed from: o */
        public C5468a m24174o(Response response) {
            m24183f("networkResponse", response);
            m24194A(response);
            return this;
        }

        /* renamed from: p */
        public C5468a m24173p(Response response) {
            m24184e(response);
            m24193B(response);
            return this;
        }

        /* renamed from: q */
        public C5468a m24172q(Protocol protocol) {
            Intrinsics.isThisObjectNull(protocol, "protocol");
            m24192C(protocol);
            return this;
        }

        /* renamed from: r */
        public C5468a m24171r(long j) {
            m24191D(j);
            return this;
        }

        /* renamed from: s */
        public C5468a m24170s(Request request) {
            Intrinsics.isThisObjectNull(request, "request");
            m24190E(request);
            return this;
        }

        /* renamed from: t */
        public C5468a m24169t(long j) {
            m24189F(j);
            return this;
        }

        /* renamed from: u */
        public final void m24168u(ResponseBody responseBody) {
            this.f15438g = responseBody;
        }

        /* renamed from: v */
        public final void m24167v(Response response) {
            this.f15440i = response;
        }

        /* renamed from: w */
        public final void m24166w(int i) {
            this.f15434c = i;
        }

        /* renamed from: x */
        public final void m24165x(Handshake handshake) {
            this.f15436e = handshake;
        }

        /* renamed from: y */
        public final void m24164y(Headers.C5498a c5498a) {
            Intrinsics.isThisObjectNull(c5498a, "<set-?>");
            this.f15437f = c5498a;
        }

        /* renamed from: z */
        public final void m24163z(String str) {
            this.f15435d = str;
        }

        public C5468a(Response response) {
            Intrinsics.isThisObjectNull(response, "response");
            this.f15434c = -1;
            this.f15432a = response.m24202a0();
            this.f15433b = response.m24205W();
            this.f15434c = response.m24197t();
            this.f15435d = response.m24210L();
            this.f15436e = response.m24195y();
            this.f15437f = response.m24211H().m24011l();
            this.f15438g = response.m24203a();
            this.f15439h = response.m24209M();
            this.f15440i = response.m24199e();
            this.f15441j = response.m24207R();
            this.f15442k = response.m24201b0();
            this.f15443l = response.m24204X();
            this.f15444m = response.m24196v();
        }
    }
}
