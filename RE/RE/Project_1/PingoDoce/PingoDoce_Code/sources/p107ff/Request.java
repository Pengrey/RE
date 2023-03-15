package p107ff;

import gf.Util;
import java.util.LinkedHashMap;
import java.util.Map;
import p107ff.Headers;
import p181jd.Intrinsics;
import p222lf.HttpMethod;
import p468yc.C13182l;
import p489zc.C13769l0;
import p489zc.C13780s;
import sd.StringsJVM;

/* renamed from: ff.b0 */
/* loaded from: classes2.dex */
public final class Request {

    /* renamed from: a */
    private final HttpUrl f15375a;

    /* renamed from: b */
    private final String f15376b;

    /* renamed from: c */
    private final Headers f15377c;

    /* renamed from: d */
    private final RequestBody f15378d;

    /* renamed from: e */
    private final Map f15379e;

    /* renamed from: f */
    private CacheControl f15380f;

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map map) {
        Intrinsics.isThisObjectNull(httpUrl, "url");
        Intrinsics.isThisObjectNull(str, "method");
        Intrinsics.isThisObjectNull(headers, "headers");
        Intrinsics.isThisObjectNull(map, "tags");
        this.f15375a = httpUrl;
        this.f15376b = str;
        this.f15377c = headers;
        this.f15378d = requestBody;
        this.f15379e = map;
    }

    /* renamed from: a */
    public final RequestBody m24275a() {
        return this.f15378d;
    }

    /* renamed from: b */
    public final CacheControl m24274b() {
        CacheControl cacheControl = this.f15380f;
        if (cacheControl == null) {
            CacheControl m24214b = CacheControl.f15394n.m24214b(this.f15377c);
            this.f15380f = m24214b;
            return m24214b;
        }
        return cacheControl;
    }

    /* renamed from: c */
    public final Map m24273c() {
        return this.f15379e;
    }

    /* renamed from: d */
    public final String m24272d(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        return this.f15377c.m24014b(str);
    }

    /* renamed from: e */
    public final Headers m24271e() {
        return this.f15377c;
    }

    /* renamed from: f */
    public final boolean m24270f() {
        return this.f15375a.m23982j();
    }

    /* renamed from: g */
    public final String m24269g() {
        return this.f15376b;
    }

    /* renamed from: h */
    public final C5460a m24268h() {
        return new C5460a(this);
    }

    /* renamed from: i */
    public final Object m24267i(Class cls) {
        Intrinsics.isThisObjectNull(cls, "type");
        return cls.cast(this.f15379e.get(cls));
    }

    /* renamed from: j */
    public final HttpUrl m24266j() {
        return this.f15375a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(m24269g());
        sb2.append(", url=");
        sb2.append(m24266j());
        if (m24271e().size() != 0) {
            sb2.append(", headers=[");
            int i = 0;
            for (Object obj : m24271e()) {
                int i2 = i + 1;
                if (i < 0) {
                    C13780s.m187q();
                }
                C13182l c13182l = (C13182l) obj;
                String str = (String) c13182l.m1462a();
                String str2 = (String) c13182l.m1461b();
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i = i2;
            }
            sb2.append(']');
        }
        if (!m24273c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(m24273c());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* compiled from: Request.kt */
    /* renamed from: ff.b0$a */
    /* loaded from: classes2.dex */
    public static class C5460a {

        /* renamed from: a */
        private HttpUrl f15381a;

        /* renamed from: b */
        private String f15382b;

        /* renamed from: c */
        private Headers.C5498a f15383c;

        /* renamed from: d */
        private RequestBody f15384d;

        /* renamed from: e */
        private Map f15385e;

        public C5460a() {
            this.f15385e = new LinkedHashMap();
            this.f15382b = "GET";
            this.f15383c = new Headers.C5498a();
        }

        /* renamed from: a */
        public C5460a m24265a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            m24262d().m24007a(str, str2);
            return this;
        }

        /* renamed from: b */
        public Request m24264b() {
            HttpUrl httpUrl = this.f15381a;
            if (httpUrl != null) {
                return new Request(httpUrl, this.f15382b, this.f15383c.m24002f(), this.f15384d, Util.m23423T(this.f15385e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public C5460a m24263c(CacheControl cacheControl) {
            Intrinsics.isThisObjectNull(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.length() == 0 ? m24257i("Cache-Control") : m24260f("Cache-Control", cacheControl2);
        }

        /* renamed from: d */
        public final Headers.C5498a m24262d() {
            return this.f15383c;
        }

        /* renamed from: e */
        public final Map m24261e() {
            return this.f15385e;
        }

        /* renamed from: f */
        public C5460a m24260f(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            m24262d().m23999i(str, str2);
            return this;
        }

        /* renamed from: g */
        public C5460a m24259g(Headers headers) {
            Intrinsics.isThisObjectNull(headers, "headers");
            m24255k(headers.m24011l());
            return this;
        }

        /* renamed from: h */
        public C5460a m24258h(String str, RequestBody requestBody) {
            Intrinsics.isThisObjectNull(str, "method");
            if (str.length() > 0) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.m19452d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.m19455a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                m24254l(str);
                m24256j(requestBody);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: i */
        public C5460a m24257i(String str) {
            Intrinsics.isThisObjectNull(str, "name");
            m24262d().m24000h(str);
            return this;
        }

        /* renamed from: j */
        public final void m24256j(RequestBody requestBody) {
            this.f15384d = requestBody;
        }

        /* renamed from: k */
        public final void m24255k(Headers.C5498a c5498a) {
            Intrinsics.isThisObjectNull(c5498a, "<set-?>");
            this.f15383c = c5498a;
        }

        /* renamed from: l */
        public final void m24254l(String str) {
            Intrinsics.isThisObjectNull(str, "<set-?>");
            this.f15382b = str;
        }

        /* renamed from: m */
        public final void m24253m(Map map) {
            Intrinsics.isThisObjectNull(map, "<set-?>");
            this.f15385e = map;
        }

        /* renamed from: n */
        public final void m24252n(HttpUrl httpUrl) {
            this.f15381a = httpUrl;
        }

        /* renamed from: o */
        public C5460a m24251o(Class cls, Object obj) {
            Intrinsics.isThisObjectNull(cls, "type");
            if (obj == null) {
                m24261e().remove(cls);
            } else {
                if (m24261e().isEmpty()) {
                    m24253m(new LinkedHashMap());
                }
                Map m24261e = m24261e();
                Object cast = cls.cast(obj);
                Intrinsics.ifNullDoSomething(cast);
                m24261e.put(cls, cast);
            }
            return this;
        }

        /* renamed from: p */
        public C5460a m24250p(HttpUrl httpUrl) {
            Intrinsics.isThisObjectNull(httpUrl, "url");
            m24252n(httpUrl);
            return this;
        }

        /* renamed from: q */
        public C5460a m24249q(String str) {
            boolean m8950A;
            boolean m8950A2;
            Intrinsics.isThisObjectNull(str, "url");
            m8950A = StringsJVM.m8950A(str, "ws:", true);
            if (m8950A) {
                String substring = str.substring(3);
                Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                str = Intrinsics.addStrAndObj("http:", substring);
            } else {
                m8950A2 = StringsJVM.m8950A(str, "wss:", true);
                if (m8950A2) {
                    String substring2 = str.substring(4);
                    Intrinsics.checkIfNull(substring2, "this as java.lang.String).substring(startIndex)");
                    str = Intrinsics.addStrAndObj("https:", substring2);
                }
            }
            return m24250p(HttpUrl.f15543k.m23928d(str));
        }

        public C5460a(Request request) {
            Map m322q;
            Intrinsics.isThisObjectNull(request, "request");
            this.f15385e = new LinkedHashMap();
            this.f15381a = request.m24266j();
            this.f15382b = request.m24269g();
            this.f15384d = request.m24275a();
            if (request.m24273c().isEmpty()) {
                m322q = new LinkedHashMap();
            } else {
                m322q = C13769l0.m322q(request.m24273c());
            }
            this.f15385e = m322q;
            this.f15383c = request.m24271e().m24011l();
        }
    }
}
