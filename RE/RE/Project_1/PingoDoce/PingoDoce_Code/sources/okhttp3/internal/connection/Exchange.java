package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import p107ff.EventListener;
import p107ff.Request;
import p107ff.RequestBody;
import p107ff.Response;
import p107ff.ResponseBody;
import p181jd.Intrinsics;
import p222lf.InterfaceC7051d;
import p222lf.RealResponseBody;
import p356sf.Buffer;
import p356sf.C10200t;
import p356sf.ForwardingSink;
import p356sf.ForwardingSource;
import p356sf.InterfaceC10189f0;
import p356sf.InterfaceC10191h0;

/* renamed from: okhttp3.internal.connection.c */
/* loaded from: classes2.dex */
public final class Exchange {

    /* renamed from: a */
    private final RealCall f20950a;

    /* renamed from: b */
    private final EventListener f20951b;

    /* renamed from: c */
    private final ExchangeFinder f20952c;

    /* renamed from: d */
    private final InterfaceC7051d f20953d;

    /* renamed from: e */
    private boolean f20954e;

    /* renamed from: f */
    private final RealConnection f20955f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Exchange.kt */
    /* renamed from: okhttp3.internal.connection.c$a */
    /* loaded from: classes2.dex */
    public final class C8101a extends ForwardingSink {

        /* renamed from: A */
        private boolean f20956A;

        /* renamed from: B */
        final /* synthetic */ Exchange f20957B;

        /* renamed from: x */
        private final long f20958x;

        /* renamed from: y */
        private boolean f20959y;

        /* renamed from: z */
        private long f20960z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8101a(Exchange exchange, InterfaceC10189f0 interfaceC10189f0, long j) {
            super(interfaceC10189f0);
            Intrinsics.isThisObjectNull(exchange, "this$0");
            Intrinsics.isThisObjectNull(interfaceC10189f0, "delegate");
            this.f20957B = exchange;
            this.f20958x = j;
        }

        /* renamed from: a */
        private final IOException m16866a(IOException iOException) {
            if (this.f20959y) {
                return iOException;
            }
            this.f20959y = true;
            return this.f20957B.m16886a(this.f20960z, false, true, iOException);
        }

        /* renamed from: B */
        public void mo8688B(Buffer buffer, long j) throws IOException {
            Intrinsics.isThisObjectNull(buffer, "source");
            if (!this.f20956A) {
                long j2 = this.f20958x;
                if (j2 != -1 && this.f20960z + j > j2) {
                    throw new ProtocolException("expected " + this.f20958x + " bytes but received " + (this.f20960z + j));
                }
                try {
                    super.mo8688B(buffer, j);
                    this.f20960z += j;
                    return;
                } catch (IOException e) {
                    throw m16866a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        public void close() throws IOException {
            if (this.f20956A) {
                return;
            }
            this.f20956A = true;
            long j = this.f20958x;
            if (j != -1 && this.f20960z != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m16866a(null);
            } catch (IOException e) {
                throw m16866a(e);
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m16866a(e);
            }
        }
    }

    /* compiled from: Exchange.kt */
    /* renamed from: okhttp3.internal.connection.c$b */
    /* loaded from: classes2.dex */
    public final class C8102b extends ForwardingSource {

        /* renamed from: A */
        private boolean f20961A;

        /* renamed from: B */
        final /* synthetic */ Exchange f20962B;

        /* renamed from: w */
        private final long f20963w;

        /* renamed from: x */
        private long f20964x;

        /* renamed from: y */
        private boolean f20965y;

        /* renamed from: z */
        private boolean f20966z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8102b(Exchange exchange, InterfaceC10191h0 interfaceC10191h0, long j) {
            super(interfaceC10191h0);
            Intrinsics.isThisObjectNull(exchange, "this$0");
            Intrinsics.isThisObjectNull(interfaceC10191h0, "delegate");
            this.f20962B = exchange;
            this.f20963w = j;
            this.f20965y = true;
            if (j == 0) {
                m16865a(null);
            }
        }

        /* renamed from: a */
        public final IOException m16865a(IOException iOException) {
            if (this.f20966z) {
                return iOException;
            }
            this.f20966z = true;
            if (iOException == null && this.f20965y) {
                this.f20965y = false;
                this.f20962B.m16878i().m24032v(this.f20962B.m16880g());
            }
            return this.f20962B.m16886a(this.f20964x, true, false, iOException);
        }

        public void close() throws IOException {
            if (this.f20961A) {
                return;
            }
            this.f20961A = true;
            try {
                super.close();
                m16865a(null);
            } catch (IOException e) {
                throw m16865a(e);
            }
        }

        public long read(Buffer buffer, long j) throws IOException {
            Intrinsics.isThisObjectNull(buffer, "sink");
            if (!this.f20961A) {
                try {
                    long read = delegate().read(buffer, j);
                    if (this.f20965y) {
                        this.f20965y = false;
                        this.f20962B.m16878i().m24032v(this.f20962B.m16880g());
                    }
                    if (read == -1) {
                        m16865a(null);
                        return -1L;
                    }
                    long j2 = this.f20964x + read;
                    long j3 = this.f20963w;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f20963w + " bytes but received " + j2);
                    }
                    this.f20964x = j2;
                    if (j2 == j3) {
                        m16865a(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw m16865a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, InterfaceC7051d interfaceC7051d) {
        Intrinsics.isThisObjectNull(realCall, "call");
        Intrinsics.isThisObjectNull(eventListener, "eventListener");
        Intrinsics.isThisObjectNull(exchangeFinder, "finder");
        Intrinsics.isThisObjectNull(interfaceC7051d, "codec");
        this.f20950a = realCall;
        this.f20951b = eventListener;
        this.f20952c = exchangeFinder;
        this.f20953d = interfaceC7051d;
        this.f20955f = interfaceC7051d.mo19464k();
    }

    /* renamed from: s */
    private final void m16868s(IOException iOException) {
        this.f20952c.m16857h(iOException);
        this.f20953d.mo19464k().m16814H(this.f20950a, iOException);
    }

    /* renamed from: a */
    public final IOException m16886a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m16868s(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f20951b.m24036r(this.f20950a, iOException);
            } else {
                this.f20951b.m24038p(this.f20950a, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f20951b.m24031w(this.f20950a, iOException);
            } else {
                this.f20951b.m24033u(this.f20950a, j);
            }
        }
        return this.f20950a.m16833s(this, z2, z, iOException);
    }

    /* renamed from: b */
    public final void m16885b() {
        this.f20953d.cancel();
    }

    /* renamed from: c */
    public final InterfaceC10189f0 m16884c(Request request, boolean z) throws IOException {
        Intrinsics.isThisObjectNull(request, "request");
        this.f20954e = z;
        RequestBody m24275a = request.m24275a();
        Intrinsics.ifNullDoSomething(m24275a);
        long contentLength = m24275a.contentLength();
        this.f20951b.m24037q(this.f20950a);
        return new C8101a(this, this.f20953d.mo19467e(request, contentLength), contentLength);
    }

    /* renamed from: d */
    public final void m16883d() {
        this.f20953d.cancel();
        this.f20950a.m16833s(this, true, true, null);
    }

    /* renamed from: e */
    public final void m16882e() throws IOException {
        try {
            this.f20953d.mo19471a();
        } catch (IOException e) {
            this.f20951b.m24036r(this.f20950a, e);
            m16868s(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void m16881f() throws IOException {
        try {
            this.f20953d.mo19469c();
        } catch (IOException e) {
            this.f20951b.m24036r(this.f20950a, e);
            m16868s(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final RealCall m16880g() {
        return this.f20950a;
    }

    /* renamed from: h */
    public final RealConnection m16879h() {
        return this.f20955f;
    }

    /* renamed from: i */
    public final EventListener m16878i() {
        return this.f20951b;
    }

    /* renamed from: j */
    public final ExchangeFinder m16877j() {
        return this.f20952c;
    }

    /* renamed from: k */
    public final boolean m16876k() {
        return !Intrinsics.equals(this.f20952c.m16861d().m24279l().m23983i(), this.f20955f.m16821A().m24151a().m24279l().m23983i());
    }

    /* renamed from: l */
    public final boolean m16875l() {
        return this.f20954e;
    }

    /* renamed from: m */
    public final void m16874m() {
        this.f20953d.mo19464k().m16788z();
    }

    /* renamed from: n */
    public final void m16873n() {
        this.f20950a.m16833s(this, true, false, null);
    }

    /* renamed from: o */
    public final ResponseBody m16872o(Response response) throws IOException {
        Intrinsics.isThisObjectNull(response, "response");
        try {
            String m24212F = Response.m24212F(response, "Content-Type", null, 2, null);
            long mo19468d = this.f20953d.mo19468d(response);
            return new RealResponseBody(m24212F, mo19468d, C10200t.m8565c(new C8102b(this, this.f20953d.mo19470b(response), mo19468d)));
        } catch (IOException e) {
            this.f20951b.m24031w(this.f20950a, e);
            m16868s(e);
            throw e;
        }
    }

    /* renamed from: p */
    public final Response.C5468a m16871p(boolean z) throws IOException {
        try {
            Response.C5468a mo19466f = this.f20953d.mo19466f(z);
            if (mo19466f != null) {
                mo19466f.m24176m(this);
            }
            return mo19466f;
        } catch (IOException e) {
            this.f20951b.m24031w(this.f20950a, e);
            m16868s(e);
            throw e;
        }
    }

    /* renamed from: q */
    public final void m16870q(Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        this.f20951b.m24030x(this.f20950a, response);
    }

    /* renamed from: r */
    public final void m16869r() {
        this.f20951b.m24029y(this.f20950a);
    }

    /* renamed from: t */
    public final void m16867t(Request request) throws IOException {
        Intrinsics.isThisObjectNull(request, "request");
        try {
            this.f20951b.m24034t(this.f20950a);
            this.f20953d.mo19465g(request);
            this.f20951b.m24035s(this.f20950a, request);
        } catch (IOException e) {
            this.f20951b.m24036r(this.f20950a, e);
            m16868s(e);
            throw e;
        }
    }
}
