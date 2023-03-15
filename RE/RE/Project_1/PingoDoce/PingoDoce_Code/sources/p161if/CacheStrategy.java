package p161if;

import gf.Util;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.CacheControl;
import p107ff.Headers;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;
import p222lf.dates;
import sd.StringsJVM;

/* renamed from: if.b */
/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: c */
    public static final C6125a f16813c = new C6125a(null);

    /* renamed from: a */
    private final Request f16814a;

    /* renamed from: b */
    private final Response f16815b;

    /* compiled from: CacheStrategy.kt */
    /* renamed from: if.b$a */
    /* loaded from: classes2.dex */
    public static final class C6125a {
        private C6125a() {
        }

        public /* synthetic */ C6125a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m22131a(Response response, Request request) {
            Intrinsics.isThisObjectNull(response, "response");
            Intrinsics.isThisObjectNull(request, "request");
            int m24197t = response.m24197t();
            if (m24197t != 200 && m24197t != 410 && m24197t != 414 && m24197t != 501 && m24197t != 203 && m24197t != 204) {
                if (m24197t != 307) {
                    if (m24197t != 308 && m24197t != 404 && m24197t != 405) {
                        switch (m24197t) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.m24212F(response, "Expires", null, 2, null) == null && response.m24200c().m24230d() == -1 && !response.m24200c().m24231c() && !response.m24200c().m24232b()) {
                    return false;
                }
            }
            return (response.m24200c().m24225i() || request.m24274b().m24225i()) ? false : true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    /* renamed from: if.b$b */
    /* loaded from: classes2.dex */
    public static final class C6126b {

        /* renamed from: a */
        private final long f16816a;

        /* renamed from: b */
        private final Request f16817b;

        /* renamed from: c */
        private final Response f16818c;

        /* renamed from: d */
        private Date f16819d;

        /* renamed from: e */
        private String f16820e;

        /* renamed from: f */
        private Date f16821f;

        /* renamed from: g */
        private String f16822g;

        /* renamed from: h */
        private Date f16823h;

        /* renamed from: i */
        private long f16824i;

        /* renamed from: j */
        private long f16825j;

        /* renamed from: k */
        private String f16826k;

        /* renamed from: l */
        private int f16827l;

        public C6126b(long j, Request request, Response response) {
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            boolean m8943q4;
            boolean m8943q5;
            Intrinsics.isThisObjectNull(request, "request");
            this.f16816a = j;
            this.f16817b = request;
            this.f16818c = response;
            this.f16827l = -1;
            if (response != null) {
                this.f16824i = response.m24201b0();
                this.f16825j = response.m24204X();
                Headers m24211H = response.m24211H();
                int i = 0;
                int size = m24211H.size();
                while (i < size) {
                    int i2 = i + 1;
                    String m24012h = m24211H.m24012h(i);
                    String m24009p = m24211H.m24009p(i);
                    m8943q = StringsJVM.m8943q(m24012h, "Date", true);
                    if (m8943q) {
                        this.f16819d = dates.m19474a(m24009p);
                        this.f16820e = m24009p;
                    } else {
                        m8943q2 = StringsJVM.m8943q(m24012h, "Expires", true);
                        if (m8943q2) {
                            this.f16823h = dates.m19474a(m24009p);
                        } else {
                            m8943q3 = StringsJVM.m8943q(m24012h, "Last-Modified", true);
                            if (m8943q3) {
                                this.f16821f = dates.m19474a(m24009p);
                                this.f16822g = m24009p;
                            } else {
                                m8943q4 = StringsJVM.m8943q(m24012h, "ETag", true);
                                if (m8943q4) {
                                    this.f16826k = m24009p;
                                } else {
                                    m8943q5 = StringsJVM.m8943q(m24012h, "Age", true);
                                    if (m8943q5) {
                                        this.f16827l = Util.m23421V(m24009p, -1);
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                }
            }
        }

        /* renamed from: a */
        private final long m22130a() {
            Date date = this.f16819d;
            long max = date != null ? Math.max(0L, this.f16825j - date.getTime()) : 0L;
            int i = this.f16827l;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f16825j;
            return max + (j - this.f16824i) + (this.f16816a - j);
        }

        /* renamed from: c */
        private final CacheStrategy m22128c() {
            if (this.f16818c == null) {
                return new CacheStrategy(this.f16817b, null);
            }
            if (this.f16817b.m24270f() && this.f16818c.m24195y() == null) {
                return new CacheStrategy(this.f16817b, null);
            }
            if (!CacheStrategy.f16813c.m22131a(this.f16818c, this.f16817b)) {
                return new CacheStrategy(this.f16817b, null);
            }
            CacheControl m24274b = this.f16817b.m24274b();
            if (!m24274b.m24226h() && !m22126e(this.f16817b)) {
                CacheControl m24200c = this.f16818c.m24200c();
                long m22130a = m22130a();
                long m22127d = m22127d();
                if (m24274b.m24230d() != -1) {
                    m22127d = Math.min(m22127d, TimeUnit.SECONDS.toMillis(m24274b.m24230d()));
                }
                long j = 0;
                long millis = m24274b.m24228f() != -1 ? TimeUnit.SECONDS.toMillis(m24274b.m24228f()) : 0L;
                if (!m24200c.m24227g() && m24274b.m24229e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(m24274b.m24229e());
                }
                if (!m24200c.m24226h()) {
                    long j2 = millis + m22130a;
                    if (j2 < j + m22127d) {
                        Response.C5468a m24208P = this.f16818c.m24208P();
                        if (j2 >= m22127d) {
                            m24208P.m24188a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m22130a > 86400000 && m22125f()) {
                            m24208P.m24188a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, m24208P.m24186c());
                    }
                }
                String str = this.f16826k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f16821f != null) {
                    str = this.f16822g;
                } else if (this.f16819d != null) {
                    str = this.f16820e;
                } else {
                    return new CacheStrategy(this.f16817b, null);
                }
                Headers.C5498a m24011l = this.f16817b.m24271e().m24011l();
                Intrinsics.ifNullDoSomething(str);
                m24011l.m24004d(str2, str);
                return new CacheStrategy(this.f16817b.m24268h().m24259g(m24011l.m24002f()).m24264b(), this.f16818c);
            }
            return new CacheStrategy(this.f16817b, null);
        }

        /* renamed from: d */
        private final long m22127d() {
            Long valueOf;
            Response response = this.f16818c;
            Intrinsics.ifNullDoSomething(response);
            CacheControl m24200c = response.m24200c();
            if (m24200c.m24230d() != -1) {
                return TimeUnit.SECONDS.toMillis(m24200c.m24230d());
            }
            Date date = this.f16823h;
            if (date != null) {
                Date date2 = this.f16819d;
                valueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (valueOf == null ? this.f16825j : valueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f16821f == null || this.f16818c.m24202a0().m24266j().m23977o() != null) {
                return 0L;
            } else {
                Date date3 = this.f16819d;
                valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
                long longValue = valueOf == null ? this.f16824i : valueOf.longValue();
                Date date4 = this.f16821f;
                Intrinsics.ifNullDoSomething(date4);
                long time2 = longValue - date4.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        /* renamed from: e */
        private final boolean m22126e(Request request) {
            return (request.m24272d("If-Modified-Since") == null && request.m24272d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private final boolean m22125f() {
            Response response = this.f16818c;
            Intrinsics.ifNullDoSomething(response);
            return response.m24200c().m24230d() == -1 && this.f16823h == null;
        }

        /* renamed from: b */
        public final CacheStrategy m22129b() {
            CacheStrategy m22128c = m22128c();
            return (m22128c.m22132b() == null || !this.f16817b.m24274b().m24223k()) ? m22128c : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f16814a = request;
        this.f16815b = response;
    }

    /* renamed from: a */
    public final Response m22133a() {
        return this.f16815b;
    }

    /* renamed from: b */
    public final Request m22132b() {
        return this.f16814a;
    }
}
