package p288p3;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.CacheControl;
import p107ff.Headers;
import p107ff.Request;
import p107ff.Response;
import p181jd.Intrinsics;
import p396v3.C11098i;
import p396v3.C11112t;
import sd.StringsJVM;

/* renamed from: p3.b */
/* loaded from: classes.dex */
public final class C8403b {

    /* renamed from: c */
    public static final C8404a f21755c = new C8404a(null);

    /* renamed from: a */
    private final Request f21756a;

    /* renamed from: b */
    private final C8400a f21757b;

    /* compiled from: CacheStrategy.kt */
    /* renamed from: p3.b$a */
    /* loaded from: classes.dex */
    public static final class C8404a {
        private C8404a() {
        }

        public /* synthetic */ C8404a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final boolean m15484d(String str) {
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            m8943q = StringsJVM.m8943q("Content-Length", str, true);
            if (m8943q) {
                return true;
            }
            m8943q2 = StringsJVM.m8943q("Content-Encoding", str, true);
            if (m8943q2) {
                return true;
            }
            m8943q3 = StringsJVM.m8943q("Content-Type", str, true);
            return m8943q3;
        }

        /* renamed from: e */
        private final boolean m15483e(String str) {
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            boolean m8943q4;
            boolean m8943q5;
            boolean m8943q6;
            boolean m8943q7;
            boolean m8943q8;
            m8943q = StringsJVM.m8943q("Connection", str, true);
            if (!m8943q) {
                m8943q2 = StringsJVM.m8943q("Keep-Alive", str, true);
                if (!m8943q2) {
                    m8943q3 = StringsJVM.m8943q("Proxy-Authenticate", str, true);
                    if (!m8943q3) {
                        m8943q4 = StringsJVM.m8943q("Proxy-Authorization", str, true);
                        if (!m8943q4) {
                            m8943q5 = StringsJVM.m8943q("TE", str, true);
                            if (!m8943q5) {
                                m8943q6 = StringsJVM.m8943q("Trailers", str, true);
                                if (!m8943q6) {
                                    m8943q7 = StringsJVM.m8943q("Transfer-Encoding", str, true);
                                    if (!m8943q7) {
                                        m8943q8 = StringsJVM.m8943q("Upgrade", str, true);
                                        if (!m8943q8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final Headers m15487a(Headers headers, Headers headers2) {
            int i;
            boolean m8943q;
            boolean m8948C;
            Headers.C5498a c5498a = new Headers.C5498a();
            int size = headers.size();
            for (i = 0; i < size; i = i + 1) {
                String m24012h = headers.m24012h(i);
                String m24009p = headers.m24009p(i);
                m8943q = StringsJVM.m8943q("Warning", m24012h, true);
                if (m8943q) {
                    m8948C = StringsJVM.m8948C(m24009p, "1", false, 2, null);
                    i = m8948C ? i + 1 : 0;
                }
                if (m15484d(m24012h) || !m15483e(m24012h) || headers2.m24014b(m24012h) == null) {
                    c5498a.m24007a(m24012h, m24009p);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String m24012h2 = headers2.m24012h(i2);
                if (!m15484d(m24012h2) && m15483e(m24012h2)) {
                    c5498a.m24007a(m24012h2, headers2.m24009p(i2));
                }
            }
            return c5498a.m24002f();
        }

        /* renamed from: b */
        public final boolean m15486b(Request request, Response response) {
            return (request.m24274b().m24225i() || response.m24200c().m24225i() || Intrinsics.equals(response.m24211H().m24014b("Vary"), "*")) ? false : true;
        }

        /* renamed from: c */
        public final boolean m15485c(Request request, C8400a c8400a) {
            return (request.m24274b().m24225i() || c8400a.m15498a().m24225i() || Intrinsics.equals(c8400a.m15495d().m24014b("Vary"), "*")) ? false : true;
        }
    }

    /* compiled from: CacheStrategy.kt */
    /* renamed from: p3.b$b */
    /* loaded from: classes.dex */
    public static final class C8405b {

        /* renamed from: a */
        private final Request f21758a;

        /* renamed from: b */
        private final C8400a f21759b;

        /* renamed from: c */
        private Date f21760c;

        /* renamed from: d */
        private String f21761d;

        /* renamed from: e */
        private Date f21762e;

        /* renamed from: f */
        private String f21763f;

        /* renamed from: g */
        private Date f21764g;

        /* renamed from: h */
        private long f21765h;

        /* renamed from: i */
        private long f21766i;

        /* renamed from: j */
        private String f21767j;

        /* renamed from: k */
        private int f21768k;

        public C8405b(Request request, C8400a c8400a) {
            boolean m8943q;
            boolean m8943q2;
            boolean m8943q3;
            boolean m8943q4;
            boolean m8943q5;
            this.f21758a = request;
            this.f21759b = c8400a;
            this.f21768k = -1;
            if (c8400a != null) {
                this.f21765h = c8400a.m15494e();
                this.f21766i = c8400a.m15496c();
                Headers m15495d = c8400a.m15495d();
                int size = m15495d.size();
                for (int i = 0; i < size; i++) {
                    String m24012h = m15495d.m24012h(i);
                    m8943q = StringsJVM.m8943q(m24012h, "Date", true);
                    if (m8943q) {
                        this.f21760c = m15495d.m24013f("Date");
                        this.f21761d = m15495d.m24009p(i);
                    } else {
                        m8943q2 = StringsJVM.m8943q(m24012h, "Expires", true);
                        if (m8943q2) {
                            this.f21764g = m15495d.m24013f("Expires");
                        } else {
                            m8943q3 = StringsJVM.m8943q(m24012h, "Last-Modified", true);
                            if (m8943q3) {
                                this.f21762e = m15495d.m24013f("Last-Modified");
                                this.f21763f = m15495d.m24009p(i);
                            } else {
                                m8943q4 = StringsJVM.m8943q(m24012h, "ETag", true);
                                if (m8943q4) {
                                    this.f21767j = m15495d.m24009p(i);
                                } else {
                                    m8943q5 = StringsJVM.m8943q(m24012h, "Age", true);
                                    if (m8943q5) {
                                        this.f21768k = C11098i.m6130z(m15495d.m24009p(i), -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private final long m15482a() {
            Date date = this.f21760c;
            long max = date != null ? Math.max(0L, this.f21766i - date.getTime()) : 0L;
            int i = this.f21768k;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            return max + (this.f21766i - this.f21765h) + (C11112t.f28513a.m6109a() - this.f21766i);
        }

        /* renamed from: c */
        private final long m15480c() {
            C8400a c8400a = this.f21759b;
            Intrinsics.ifNullDoSomething(c8400a);
            CacheControl m15498a = c8400a.m15498a();
            if (m15498a.m24230d() != -1) {
                return TimeUnit.SECONDS.toMillis(m15498a.m24230d());
            }
            Date date = this.f21764g;
            if (date != null) {
                Date date2 = this.f21760c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f21766i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f21762e == null || this.f21758a.m24266j().m23977o() != null) {
                return 0L;
            } else {
                Date date3 = this.f21760c;
                long time2 = date3 != null ? date3.getTime() : this.f21765h;
                Date date4 = this.f21762e;
                Intrinsics.ifNullDoSomething(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        /* renamed from: d */
        private final boolean m15479d(Request request) {
            return (request.m24272d("If-Modified-Since") == null && request.m24272d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: b */
        public final C8403b m15481b() {
            if (this.f21759b == null) {
                return new C8403b(this.f21758a, null, null);
            }
            if (this.f21758a.m24270f() && !this.f21759b.m15493f()) {
                return new C8403b(this.f21758a, null, null);
            }
            CacheControl m15498a = this.f21759b.m15498a();
            if (!C8403b.f21755c.m15485c(this.f21758a, this.f21759b)) {
                return new C8403b(this.f21758a, null, null);
            }
            CacheControl m24274b = this.f21758a.m24274b();
            if (!m24274b.m24226h() && !m15479d(this.f21758a)) {
                long m15482a = m15482a();
                long m15480c = m15480c();
                if (m24274b.m24230d() != -1) {
                    m15480c = Math.min(m15480c, TimeUnit.SECONDS.toMillis(m24274b.m24230d()));
                }
                long j = 0;
                long millis = m24274b.m24228f() != -1 ? TimeUnit.SECONDS.toMillis(m24274b.m24228f()) : 0L;
                if (!m15498a.m24227g() && m24274b.m24229e() != -1) {
                    j = TimeUnit.SECONDS.toMillis(m24274b.m24229e());
                }
                if (!m15498a.m24226h() && m15482a + millis < m15480c + j) {
                    return new C8403b(null, this.f21759b, null);
                }
                String str = this.f21767j;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    Intrinsics.ifNullDoSomething(str);
                    str2 = "If-None-Match";
                } else if (this.f21762e != null) {
                    str = this.f21763f;
                    Intrinsics.ifNullDoSomething(str);
                } else if (this.f21760c != null) {
                    str = this.f21761d;
                    Intrinsics.ifNullDoSomething(str);
                } else {
                    return new C8403b(this.f21758a, null, null);
                }
                return new C8403b(this.f21758a.m24268h().m24265a(str2, str).m24264b(), this.f21759b, null);
            }
            return new C8403b(this.f21758a, null, null);
        }
    }

    private C8403b(Request request, C8400a c8400a) {
        this.f21756a = request;
        this.f21757b = c8400a;
    }

    public /* synthetic */ C8403b(Request request, C8400a c8400a, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, c8400a);
    }

    /* renamed from: a */
    public final C8400a m15489a() {
        return this.f21757b;
    }

    /* renamed from: b */
    public final Request m15488b() {
        return this.f21756a;
    }
}
