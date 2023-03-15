package nf;

import gf.Util;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.EnumC8112a;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import p107ff.Headers;
import p107ff.OkHttpClient;
import p107ff.Protocol;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;
import p222lf.HttpHeaders;
import p222lf.InterfaceC7051d;
import p222lf.RealInterceptorChain;
import p222lf.RequestLine;
import p222lf.StatusLine;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;

/* renamed from: nf.c */
/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements InterfaceC7051d {

    /* renamed from: g */
    public static final C7706a f20322g = new C7706a(null);

    /* renamed from: h */
    private static final List f20323h = Util.m23394w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i */
    private static final List f20324i = Util.m23394w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    private final RealConnection f20325a;

    /* renamed from: b */
    private final RealInterceptorChain f20326b;

    /* renamed from: c */
    private final Http2Connection f20327c;

    /* renamed from: d */
    private volatile Http2Stream f20328d;

    /* renamed from: e */
    private final Protocol f20329e;

    /* renamed from: f */
    private volatile boolean f20330f;

    /* compiled from: Http2ExchangeCodec.kt */
    /* renamed from: nf.c$a */
    /* loaded from: classes2.dex */
    public static final class C7706a {
        private C7706a() {
        }

        public /* synthetic */ C7706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List m17651a(Request request) {
            Intrinsics.isThisObjectNull(request, "request");
            Headers m24271e = request.m24271e();
            ArrayList arrayList = new ArrayList(m24271e.size() + 4);
            arrayList.add(new Header(Header.f20310f, request.m24269g()));
            arrayList.add(new Header(Header.f20311g, RequestLine.f18729a.m19438c(request.m24266j())));
            String m24272d = request.m24272d("Host");
            if (m24272d != null) {
                arrayList.add(new Header(Header.f20313i, m24272d));
            }
            arrayList.add(new Header(Header.f20312h, request.m24266j().m23974r()));
            int i = 0;
            int size = m24271e.size();
            while (i < size) {
                int i2 = i + 1;
                String m24012h = m24271e.m24012h(i);
                Locale locale = Locale.US;
                Intrinsics.checkIfNull(locale, "US");
                String lowerCase = m24012h.toLowerCase(locale);
                Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.m17654h().contains(lowerCase) || (Intrinsics.equals(lowerCase, "te") && Intrinsics.equals(m24271e.m24009p(i), "trailers"))) {
                    arrayList.add(new Header(lowerCase, m24271e.m24009p(i)));
                }
                i = i2;
            }
            return arrayList;
        }

        /* renamed from: b */
        public final Response.C5468a m17650b(Headers headers, Protocol protocol) {
            Intrinsics.isThisObjectNull(headers, "headerBlock");
            Intrinsics.isThisObjectNull(protocol, "protocol");
            Headers.C5498a c5498a = new Headers.C5498a();
            int size = headers.size();
            StatusLine statusLine = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String m24012h = headers.m24012h(i);
                String m24009p = headers.m24009p(i);
                if (Intrinsics.equals(m24012h, ":status")) {
                    statusLine = StatusLine.f18731d.m19430a(Intrinsics.addStrAndObj("HTTP/1.1 ", m24009p));
                } else if (!Http2ExchangeCodec.m17653i().contains(m24012h)) {
                    c5498a.m24004d(m24012h, m24009p);
                }
                i = i2;
            }
            if (statusLine != null) {
                return new Response.C5468a().m24172q(protocol).m24182g(statusLine.f18733b).m24175n(statusLine.f18734c).m24177l(c5498a.m24002f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        Intrinsics.isThisObjectNull(realConnection, "connection");
        Intrinsics.isThisObjectNull(realInterceptorChain, "chain");
        Intrinsics.isThisObjectNull(http2Connection, "http2Connection");
        this.f20325a = realConnection;
        this.f20326b = realInterceptorChain;
        this.f20327c = http2Connection;
        List m23866z = okHttpClient.m23866z();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f20329e = m23866z.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    /* renamed from: h */
    public static final /* synthetic */ List m17654h() {
        return f20323h;
    }

    /* renamed from: i */
    public static final /* synthetic */ List m17653i() {
        return f20324i;
    }

    /* renamed from: a */
    public void mo19471a() {
        Http2Stream http2Stream = this.f20328d;
        Intrinsics.ifNullDoSomething(http2Stream);
        http2Stream.m16588n().close();
    }

    /* renamed from: b */
    public InterfaceC10191h0 mo19470b(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        Http2Stream http2Stream = this.f20328d;
        Intrinsics.ifNullDoSomething(http2Stream);
        return http2Stream.m16586p();
    }

    /* renamed from: c */
    public void mo19469c() {
        this.f20327c.flush();
    }

    public void cancel() {
        this.f20330f = true;
        Http2Stream http2Stream = this.f20328d;
        if (http2Stream == null) {
            return;
        }
        http2Stream.m16596f(EnumC8112a.CANCEL);
    }

    /* renamed from: d */
    public long mo19468d(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        if (HttpHeaders.m19462b(response)) {
            return Util.m23395v(response);
        }
        return 0L;
    }

    /* renamed from: e */
    public InterfaceC10189f0 mo19467e(Request request, long j) {
        Intrinsics.isThisObjectNull(request, "request");
        Http2Stream http2Stream = this.f20328d;
        Intrinsics.ifNullDoSomething(http2Stream);
        return http2Stream.m16588n();
    }

    /* renamed from: f */
    public Response.C5468a mo19466f(boolean z) {
        Http2Stream http2Stream = this.f20328d;
        Intrinsics.ifNullDoSomething(http2Stream);
        Response.C5468a m17650b = f20322g.m17650b(http2Stream.m16604E(), this.f20329e);
        if (z && m17650b.m24181h() == 100) {
            return null;
        }
        return m17650b;
    }

    /* renamed from: g */
    public void mo19465g(Request request) {
        Intrinsics.isThisObjectNull(request, "request");
        if (this.f20328d != null) {
            return;
        }
        this.f20328d = this.f20327c.m16734J0(f20322g.m17651a(request), request.m24275a() != null);
        if (!this.f20330f) {
            Http2Stream http2Stream = this.f20328d;
            Intrinsics.ifNullDoSomething(http2Stream);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            http2Stream.m16580v().m8646g(this.f20326b.m19444h(), timeUnit);
            Http2Stream http2Stream2 = this.f20328d;
            Intrinsics.ifNullDoSomething(http2Stream2);
            http2Stream2.m16602G().m8646g(this.f20326b.m19442j(), timeUnit);
            return;
        }
        Http2Stream http2Stream3 = this.f20328d;
        Intrinsics.ifNullDoSomething(http2Stream3);
        http2Stream3.m16596f(EnumC8112a.CANCEL);
        throw new IOException("Canceled");
    }

    /* renamed from: k */
    public RealConnection mo19464k() {
        return this.f20325a;
    }
}
