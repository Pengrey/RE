package p222lf;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5482j;
import p107ff.InterfaceC5503w;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;

/* renamed from: lf.g */
/* loaded from: classes2.dex */
public final class RealInterceptorChain implements InterfaceC5503w.InterfaceC5504a {

    /* renamed from: a */
    private final RealCall f18717a;

    /* renamed from: b */
    private final List f18718b;

    /* renamed from: c */
    private final int f18719c;

    /* renamed from: d */
    private final Exchange f18720d;

    /* renamed from: e */
    private final Request f18721e;

    /* renamed from: f */
    private final int f18722f;

    /* renamed from: g */
    private final int f18723g;

    /* renamed from: h */
    private final int f18724h;

    /* renamed from: i */
    private int f18725i;

    public RealInterceptorChain(RealCall realCall, List list, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(realCall, "call");
        Intrinsics.isThisObjectNull(list, "interceptors");
        Intrinsics.isThisObjectNull(request, "request");
        this.f18717a = realCall;
        this.f18718b = list;
        this.f18719c = i;
        this.f18720d = exchange;
        this.f18721e = request;
        this.f18722f = i2;
        this.f18723g = i3;
        this.f18724h = i4;
    }

    /* renamed from: d */
    public static /* synthetic */ RealInterceptorChain m19448d(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = realInterceptorChain.f18719c;
        }
        if ((i5 & 2) != 0) {
            exchange = realInterceptorChain.f18720d;
        }
        Exchange exchange2 = exchange;
        if ((i5 & 4) != 0) {
            request = realInterceptorChain.f18721e;
        }
        Request request2 = request;
        if ((i5 & 8) != 0) {
            i2 = realInterceptorChain.f18722f;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = realInterceptorChain.f18723g;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = realInterceptorChain.f18724h;
        }
        return realInterceptorChain.m19449c(i, exchange2, request2, i6, i7, i4);
    }

    /* renamed from: a */
    public Response mo23918a(Request request) throws IOException {
        Intrinsics.isThisObjectNull(request, "request");
        if (this.f18719c < this.f18718b.size()) {
            this.f18725i++;
            Exchange exchange = this.f18720d;
            if (exchange != null) {
                if (exchange.m16877j().m16858g(request.m24266j())) {
                    if (!(this.f18725i == 1)) {
                        throw new IllegalStateException(("network interceptor " + this.f18718b.get(this.f18719c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f18718b.get(this.f18719c - 1) + " must retain the same host and port").toString());
                }
            }
            RealInterceptorChain m19448d = m19448d(this, this.f18719c + 1, null, request, 0, 0, 0, 58, null);
            InterfaceC5503w interfaceC5503w = (InterfaceC5503w) this.f18718b.get(this.f18719c);
            Response mo23919a = interfaceC5503w.mo23919a(m19448d);
            if (mo23919a != null) {
                if (this.f18720d != null) {
                    if (!(this.f18719c + 1 >= this.f18718b.size() || m19448d.f18725i == 1)) {
                        throw new IllegalStateException(("network interceptor " + interfaceC5503w + " must call proceed() exactly once").toString());
                    }
                }
                if (mo23919a.m24203a() != null) {
                    return mo23919a;
                }
                throw new IllegalStateException(("interceptor " + interfaceC5503w + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interfaceC5503w + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public InterfaceC5482j mo23917b() {
        Exchange exchange = this.f18720d;
        if (exchange == null) {
            return null;
        }
        return exchange.m16879h();
    }

    /* renamed from: c */
    public final RealInterceptorChain m19449c(int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(request, "request");
        return new RealInterceptorChain(this.f18717a, this.f18718b, i, exchange, request, i2, i3, i4);
    }

    public InterfaceC5469e call() {
        return this.f18717a;
    }

    /* renamed from: e */
    public final RealCall m19447e() {
        return this.f18717a;
    }

    /* renamed from: f */
    public final int m19446f() {
        return this.f18722f;
    }

    /* renamed from: g */
    public final Exchange m19445g() {
        return this.f18720d;
    }

    /* renamed from: h */
    public final int m19444h() {
        return this.f18723g;
    }

    /* renamed from: i */
    public final Request m19443i() {
        return this.f18721e;
    }

    /* renamed from: j */
    public final int m19442j() {
        return this.f18724h;
    }

    /* renamed from: k */
    public int m19441k() {
        return this.f18723g;
    }

    public Request request() {
        return this.f18721e;
    }
}
