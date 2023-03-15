package p222lf;

import gf.Util;
import java.io.IOException;
import java.util.List;
import p107ff.Cookie;
import p107ff.CookieJar;
import p107ff.InterfaceC5503w;
import p107ff.MediaType;
import p107ff.Request;
import p107ff.RequestBody;
import p107ff.Response;
import p107ff.ResponseBody;
import p181jd.Intrinsics;
import p356sf.C10200t;
import p356sf.GzipSource;
import p489zc.C13780s;
import sd.StringsJVM;

/* renamed from: lf.a */
/* loaded from: classes2.dex */
public final class BridgeInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    private final CookieJar f18709a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.isThisObjectNull(cookieJar, "cookieJar");
        this.f18709a = cookieJar;
    }

    /* renamed from: b */
    private final String m19476b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            Cookie cookie = (Cookie) obj;
            if (i > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.m24090i());
            sb2.append('=');
            sb2.append(cookie.m24085n());
            i = i2;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        boolean m8943q;
        ResponseBody m24203a;
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        Request request = interfaceC5504a.request();
        Request.C5460a m24268h = request.m24268h();
        RequestBody m24275a = request.m24275a();
        if (m24275a != null) {
            MediaType contentType = m24275a.contentType();
            if (contentType != null) {
                m24268h.m24260f("Content-Type", contentType.toString());
            }
            long contentLength = m24275a.contentLength();
            if (contentLength != -1) {
                m24268h.m24260f("Content-Length", String.valueOf(contentLength));
                m24268h.m24257i("Transfer-Encoding");
            } else {
                m24268h.m24260f("Transfer-Encoding", "chunked");
                m24268h.m24257i("Content-Length");
            }
        }
        boolean z = false;
        if (request.m24272d("Host") == null) {
            m24268h.m24260f("Host", Util.m23425R(request.m24266j(), false, 1, null));
        }
        if (request.m24272d("Connection") == null) {
            m24268h.m24260f("Connection", "Keep-Alive");
        }
        if (request.m24272d("Accept-Encoding") == null && request.m24272d("Range") == null) {
            m24268h.m24260f("Accept-Encoding", "gzip");
            z = true;
        }
        List m24075b = this.f18709a.m24075b(request.m24266j());
        if (!m24075b.isEmpty()) {
            m24268h.m24260f("Cookie", m19476b(m24075b));
        }
        if (request.m24272d("User-Agent") == null) {
            m24268h.m24260f("User-Agent", "okhttp/4.10.0");
        }
        Response mo23918a = interfaceC5504a.mo23918a(m24268h.m24264b());
        HttpHeaders.m19458f(this.f18709a, request.m24266j(), mo23918a.m24211H());
        Response.C5468a m24170s = mo23918a.m24208P().m24170s(request);
        if (z) {
            m8943q = StringsJVM.m8943q("gzip", Response.m24212F(mo23918a, "Content-Encoding", null, 2, null), true);
            if (m8943q && HttpHeaders.m19462b(mo23918a) && (m24203a = mo23918a.m24203a()) != null) {
                GzipSource gzipSource = new GzipSource(m24203a.source());
                m24170s.m24177l(mo23918a.m24211H().m24011l().m24000h("Content-Encoding").m24000h("Content-Length").m24002f());
                m24170s.m24187b(new RealResponseBody(Response.m24212F(mo23918a, "Content-Type", null, 2, null), -1L, C10200t.m8565c(gzipSource)));
            }
        }
        return m24170s.m24186c();
    }
}
