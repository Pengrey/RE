package p161if;

import gf.Util;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.connection.RealCall;
import p107ff.C5461c;
import p107ff.EventListener;
import p107ff.Headers;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5503w;
import p107ff.Protocol;
import p107ff.Request;
import p107ff.Response;
import p107ff.ResponseBody;
import p161if.CacheStrategy;
import p181jd.Intrinsics;
import sd.StringsJVM;

/* renamed from: if.a */
/* loaded from: classes2.dex */
public final class CacheInterceptor implements InterfaceC5503w {

    /* renamed from: b */
    public static final C6124a f16811b = new C6124a(null);

    /* renamed from: a */
    private final C5461c f16812a;

    /* compiled from: CacheInterceptor.kt */
    /* renamed from: if.a$a */
    /* loaded from: classes2.dex */
    public static final class C6124a {
        private C6124a() {
        }

        public /* synthetic */ C6124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ Headers m22139a(C6124a c6124a, Headers headers, Headers headers2) {
            return c6124a.m22137c(headers, headers2);
        }

        /* renamed from: b */
        public static final /* synthetic */ Response m22138b(C6124a c6124a, Response response) {
            return c6124a.m22134f(response);
        }

        /* renamed from: c */
        private final Headers m22137c(Headers headers, Headers headers2) {
            boolean m8943q;
            boolean m8948C;
            Headers.C5498a c5498a = new Headers.C5498a();
            int size = headers.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String m24012h = headers.m24012h(i2);
                String m24009p = headers.m24009p(i2);
                m8943q = StringsJVM.m8943q("Warning", m24012h, true);
                if (m8943q) {
                    m8948C = StringsJVM.m8948C(m24009p, "1", false, 2, null);
                    if (m8948C) {
                        i2 = i3;
                    }
                }
                if (m22136d(m24012h) || !m22135e(m24012h) || headers2.m24014b(m24012h) == null) {
                    c5498a.m24004d(m24012h, m24009p);
                }
                i2 = i3;
            }
            int size2 = headers2.size();
            while (i < size2) {
                int i4 = i + 1;
                String m24012h2 = headers2.m24012h(i);
                if (!m22136d(m24012h2) && m22135e(m24012h2)) {
                    c5498a.m24004d(m24012h2, headers2.m24009p(i));
                }
                i = i4;
            }
            return c5498a.m24002f();
        }

        /* renamed from: d */
        private final boolean m22136d(String str) {
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
        private final boolean m22135e(String str) {
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

        /* renamed from: f */
        private final Response m22134f(Response response) {
            return (response == null ? null : response.m24203a()) != null ? response.m24208P().m24187b(null).m24186c() : response;
        }
    }

    public CacheInterceptor(C5461c c5461c) {
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) throws IOException {
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        InterfaceC5469e call = interfaceC5504a.call();
        CacheStrategy m22129b = new CacheStrategy.C6126b(System.currentTimeMillis(), interfaceC5504a.request(), null).m22129b();
        Request m22132b = m22129b.m22132b();
        Response m22133a = m22129b.m22133a();
        RealCall realCall = call instanceof RealCall ? (RealCall) call : null;
        EventListener m16839m = realCall == null ? null : realCall.m16839m();
        if (m16839m == null) {
            m16839m = EventListener.f15526a;
        }
        if (m22132b == null && m22133a == null) {
            Response m24186c = new Response.C5468a().m24170s(interfaceC5504a.request()).m24172q(Protocol.HTTP_1_1).m24182g(504).m24175n("Unsatisfiable Request (only-if-cached)").m24187b(Util.f15901c).m24169t(-1L).m24171r(System.currentTimeMillis()).m24186c();
            m16839m.m24028z(call, m24186c);
            return m24186c;
        } else if (m22132b == null) {
            Intrinsics.ifNullDoSomething(m22133a);
            Response m24186c2 = m22133a.m24208P().m24185d(C6124a.m22138b(f16811b, m22133a)).m24186c();
            m16839m.m24052b(call, m24186c2);
            return m24186c2;
        } else {
            if (m22133a != null) {
                m16839m.m24053a(call, m22133a);
            }
            Response mo23918a = interfaceC5504a.mo23918a(m22132b);
            if (m22133a != null) {
                boolean z = false;
                if (mo23918a != null && mo23918a.m24197t() == 304) {
                    z = true;
                }
                if (!z) {
                    ResponseBody m24203a = m22133a.m24203a();
                    if (m24203a != null) {
                        Util.m23404m(m24203a);
                    }
                } else {
                    Response.C5468a m24208P = m22133a.m24208P();
                    C6124a c6124a = f16811b;
                    m24208P.m24177l(C6124a.m22139a(c6124a, m22133a.m24211H(), mo23918a.m24211H())).m24169t(mo23918a.m24201b0()).m24171r(mo23918a.m24204X()).m24185d(C6124a.m22138b(c6124a, m22133a)).m24174o(C6124a.m22138b(c6124a, mo23918a)).m24186c();
                    ResponseBody m24203a2 = mo23918a.m24203a();
                    Intrinsics.ifNullDoSomething(m24203a2);
                    m24203a2.close();
                    Intrinsics.ifNullDoSomething(this.f16812a);
                    throw null;
                }
            }
            Intrinsics.ifNullDoSomething(mo23918a);
            Response.C5468a m24208P2 = mo23918a.m24208P();
            C6124a c6124a2 = f16811b;
            return m24208P2.m24185d(C6124a.m22138b(c6124a2, m22133a)).m24174o(C6124a.m22138b(c6124a2, mo23918a)).m24186c();
        }
    }
}
