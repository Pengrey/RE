package p222lf;

import com.google.crypto.tink.shaded.protobuf.Reader;
import gf.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import p107ff.HttpUrl;
import p107ff.InterfaceC5503w;
import p107ff.OkHttpClient;
import p107ff.Request;
import p107ff.RequestBody;
import p107ff.Response;
import p107ff.ResponseBody;
import p107ff.Route;
import p181jd.Intrinsics;
import p489zc.C13780s;
import p489zc._Collections;
import sd.C10156i;

/* renamed from: lf.j */
/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    private final OkHttpClient f18730a;

    /* compiled from: RetryAndFollowUpInterceptor.kt */
    /* renamed from: lf.j$a */
    /* loaded from: classes2.dex */
    public static final class C7052a {
        private C7052a() {
        }

        public /* synthetic */ C7052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7052a(null);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        Intrinsics.isThisObjectNull(okHttpClient, "client");
        this.f18730a = okHttpClient;
    }

    /* renamed from: b */
    private final Request m19436b(Response response, String str) {
        String m24212F;
        HttpUrl m23975q;
        if (!this.f18730a.m23873p() || (m24212F = Response.m24212F(response, "Location", null, 2, null)) == null || (m23975q = response.m24202a0().m24266j().m23975q(m24212F)) == null) {
            return null;
        }
        if (Intrinsics.equals(m23975q.m23974r(), response.m24202a0().m24266j().m23974r()) || this.f18730a.m23872q()) {
            Request.C5460a m24268h = response.m24202a0().m24268h();
            if (HttpMethod.m19455a(str)) {
                int m24197t = response.m24197t();
                HttpMethod httpMethod = HttpMethod.f18716a;
                boolean z = httpMethod.m19453c(str) || m24197t == 308 || m24197t == 307;
                if (httpMethod.m19454b(str) && m24197t != 308 && m24197t != 307) {
                    m24268h.m24258h("GET", null);
                } else {
                    m24268h.m24258h(str, z ? response.m24202a0().m24275a() : null);
                }
                if (!z) {
                    m24268h.m24257i("Transfer-Encoding");
                    m24268h.m24257i("Content-Length");
                    m24268h.m24257i("Content-Type");
                }
            }
            if (!Util.m23407j(response.m24202a0().m24266j(), m23975q)) {
                m24268h.m24257i("Authorization");
            }
            return m24268h.m24250p(m23975q).m24264b();
        }
        return null;
    }

    /* renamed from: c */
    private final Request m19435c(Response response, Exchange exchange) throws IOException {
        RealConnection m16879h;
        Route m16821A = (exchange == null || (m16879h = exchange.m16879h()) == null) ? null : m16879h.m16821A();
        int m24197t = response.m24197t();
        String m24269g = response.m24202a0().m24269g();
        if (m24197t != 307 && m24197t != 308) {
            if (m24197t != 401) {
                if (m24197t == 421) {
                    RequestBody m24275a = response.m24202a0().m24275a();
                    if ((m24275a == null || !m24275a.isOneShot()) && exchange != null && exchange.m16876k()) {
                        exchange.m16879h().m16789y();
                        return response.m24202a0();
                    }
                    return null;
                } else if (m24197t == 503) {
                    Response m24207R = response.m24207R();
                    if ((m24207R == null || m24207R.m24197t() != 503) && m19431g(response, Reader.READ_DONE) == 0) {
                        return response.m24202a0();
                    }
                    return null;
                } else if (m24197t == 407) {
                    Intrinsics.ifNullDoSomething(m16821A);
                    if (m16821A.m24150b().type() == Proxy.Type.HTTP) {
                        return this.f18730a.m23895B().m24277a(m16821A, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (m24197t == 408) {
                    if (this.f18730a.m23892F()) {
                        RequestBody m24275a2 = response.m24202a0().m24275a();
                        if (m24275a2 == null || !m24275a2.isOneShot()) {
                            Response m24207R2 = response.m24207R();
                            if ((m24207R2 == null || m24207R2.m24197t() != 408) && m19431g(response, 0) <= 0) {
                                return response.m24202a0();
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (m24197t) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f18730a.m23884d().m24277a(m16821A, response);
            }
        }
        return m19436b(response, m24269g);
    }

    /* renamed from: d */
    private final boolean m19434d(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: e */
    private final boolean m19433e(IOException iOException, RealCall realCall, Request request, boolean z) {
        if (this.f18730a.m23892F()) {
            return !(z && m19432f(iOException, request)) && m19434d(iOException, z) && realCall.m16829z();
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m19432f(IOException iOException, Request request) {
        RequestBody m24275a = request.m24275a();
        return (m24275a != null && m24275a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: g */
    private final int m19431g(Response response, int i) {
        String m24212F = Response.m24212F(response, "Retry-After", null, 2, null);
        if (m24212F == null) {
            return i;
        }
        if (new C10156i("\\d+").m9021d(m24212F)) {
            Integer valueOf = Integer.valueOf(m24212F);
            Intrinsics.checkIfNull(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Reader.READ_DONE;
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        List m197g;
        Exchange m16837o;
        Request m19435c;
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) interfaceC5504a;
        Request m19443i = realInterceptorChain.m19443i();
        RealCall m19447e = realInterceptorChain.m19447e();
        m197g = C13780s.m197g();
        Response response = null;
        boolean z = true;
        int i = 0;
        while (true) {
            m19447e.m16843i(m19443i, z);
            try {
                if (!m19447e.isCanceled()) {
                    try {
                        try {
                            Response mo23918a = realInterceptorChain.mo23918a(m19443i);
                            if (response != null) {
                                mo23918a = mo23918a.m24208P().m24173p(response.m24208P().m24187b(null).m24186c()).m24186c();
                            }
                            response = mo23918a;
                            m16837o = m19447e.m16837o();
                            m19435c = m19435c(response, m16837o);
                        } catch (IOException e) {
                            if (m19433e(e, m19447e, m19443i, !(e instanceof ConnectionShutdownException))) {
                                m197g = _Collections.m466c0(m197g, e);
                                m19447e.m16842j(true);
                                z = false;
                            } else {
                                throw Util.m23418Y(e, m197g);
                            }
                        }
                    } catch (RouteException e2) {
                        if (m19433e(e2.m16891c(), m19447e, m19443i, false)) {
                            m197g = _Collections.m466c0(m197g, e2.m16892b());
                            m19447e.m16842j(true);
                            z = false;
                        } else {
                            throw Util.m23418Y(e2.m16892b(), m197g);
                        }
                    }
                    if (m19435c == null) {
                        if (m16837o != null && m16837o.m16875l()) {
                            m19447e.m16854C();
                        }
                        m19447e.m16842j(false);
                        return response;
                    }
                    RequestBody m24275a = m19435c.m24275a();
                    if (m24275a != null && m24275a.isOneShot()) {
                        m19447e.m16842j(false);
                        return response;
                    }
                    ResponseBody m24203a = response.m24203a();
                    if (m24203a != null) {
                        Util.m23404m(m24203a);
                    }
                    i++;
                    if (i <= 20) {
                        m19447e.m16842j(true);
                        m19443i = m19435c;
                        z = true;
                    } else {
                        throw new ProtocolException(Intrinsics.addStrAndObj("Too many follow-up requests: ", Integer.valueOf(i)));
                    }
                } else {
                    throw new IOException("Canceled");
                }
            } catch (Throwable th2) {
                m19447e.m16842j(true);
                throw th2;
            }
        }
    }
}
