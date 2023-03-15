package p193k3;

import android.net.Uri;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import java.io.IOException;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p095f3.InterfaceC5359e;
import p107ff.CacheControl;
import p107ff.Request;
import p107ff.Response;
import p107ff.ResponseBody;
import p129h3.AbstractC5840n;
import p129h3.C5842o;
import p129h3.EnumC5826d;
import p151i3.InterfaceC5996a;
import p181jd.Intrinsics;
import p193k3.InterfaceC6580h;
import p288p3.C8400a;
import p288p3.C8403b;
import p305q3.C9635k;
import p356sf.C10200t;
import p356sf.FileSystem;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p396v3.C11098i;
import p468yc.C13195u;
import p468yc.Exceptions;
import p468yc.InterfaceC13178g;

/* renamed from: k3.j */
/* loaded from: classes.dex */
public final class C6584j implements InterfaceC6580h {

    /* renamed from: f */
    private static final CacheControl f17816f;

    /* renamed from: g */
    private static final CacheControl f17817g;

    /* renamed from: a */
    private final String f17818a;

    /* renamed from: b */
    private final C9635k f17819b;

    /* renamed from: c */
    private final InterfaceC13178g f17820c;

    /* renamed from: d */
    private final InterfaceC13178g f17821d;

    /* renamed from: e */
    private final boolean f17822e;

    /* compiled from: HttpUriFetcher.kt */
    /* renamed from: k3.j$a */
    /* loaded from: classes.dex */
    public static final class C6585a {
        private C6585a() {
        }

        public /* synthetic */ C6585a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: HttpUriFetcher.kt */
    /* renamed from: k3.j$b */
    /* loaded from: classes.dex */
    public static final class C6586b implements InterfaceC6580h.InterfaceC6581a {

        /* renamed from: a */
        private final InterfaceC13178g f17823a;

        /* renamed from: b */
        private final InterfaceC13178g f17824b;

        /* renamed from: c */
        private final boolean f17825c;

        public C6586b(InterfaceC13178g interfaceC13178g, InterfaceC13178g interfaceC13178g2, boolean z) {
            this.f17823a = interfaceC13178g;
            this.f17824b = interfaceC13178g2;
            this.f17825c = z;
        }

        /* renamed from: c */
        private final boolean m20529c(Uri uri) {
            return Intrinsics.equals(uri.getScheme(), "http") || Intrinsics.equals(uri.getScheme(), "https");
        }

        /* renamed from: b */
        public InterfaceC6580h mo20560b(Uri uri, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            if (m20529c(uri)) {
                return new C6584j(uri.toString(), c9635k, this.f17823a, this.f17824b, this.f17825c);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUriFetcher.kt */
    @InterfaceC6759f(m20197c = "coil.fetch.HttpUriFetcher", m20196f = "HttpUriFetcher.kt", m20195l = {223}, m20194m = "executeNetworkRequest")
    /* renamed from: k3.j$c */
    /* loaded from: classes.dex */
    public static final class C6587c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f17826w;

        /* renamed from: y */
        int f17828y;

        C6587c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17826w = obj;
            this.f17828y |= Integer.MIN_VALUE;
            return C6584j.m20545b(C6584j.this, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUriFetcher.kt */
    @InterfaceC6759f(m20197c = "coil.fetch.HttpUriFetcher", m20196f = "HttpUriFetcher.kt", m20195l = {76, C0868i.f2763F0}, m20194m = "fetch")
    /* renamed from: k3.j$d */
    /* loaded from: classes.dex */
    public static final class C6588d extends AbstractC6757d {

        /* renamed from: B */
        int f17830B;

        /* renamed from: w */
        Object f17831w;

        /* renamed from: x */
        Object f17832x;

        /* renamed from: y */
        Object f17833y;

        /* renamed from: z */
        /* synthetic */ Object f17834z;

        C6588d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17834z = obj;
            this.f17830B |= Integer.MIN_VALUE;
            return C6584j.this.mo20548a(this);
        }
    }

    static {
        new C6585a(null);
        f17816f = new CacheControl.C5466a().m24218d().m24217e().m24221a();
        f17817g = new CacheControl.C5466a().m24218d().m24216f().m24221a();
    }

    public C6584j(String str, C9635k c9635k, InterfaceC13178g interfaceC13178g, InterfaceC13178g interfaceC13178g2, boolean z) {
        this.f17818a = str;
        this.f17819b = c9635k;
        this.f17820c = interfaceC13178g;
        this.f17821d = interfaceC13178g2;
        this.f17822e = z;
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m20545b(C6584j c6584j, Request request, InterfaceC1886d interfaceC1886d) {
        return c6584j.m20544c(request, interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m20544c(p107ff.Request r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p193k3.C6584j.C6587c
            if (r0 == 0) goto L13
            r0 = r6
            k3.j$c r0 = (p193k3.C6584j.C6587c) r0
            int r1 = r0.f17828y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17828y = r1
            goto L18
        L13:
            k3.j$c r0 = new k3.j$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17826w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f17828y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            boolean r6 = p396v3.C11098i.m6137s()
            if (r6 == 0) goto L5d
            q3.k r6 = r4.f17819b
            coil.request.a r6 = r6.m10320k()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            yc.g r6 = r4.f17820c
            java.lang.Object r6 = r6.getValue()
            ff.e$a r6 = (p107ff.InterfaceC5469e.InterfaceC5470a) r6
            ff.e r5 = r6.mo24161a(r5)
            ff.d0 r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            yc.g r6 = r4.f17820c
            java.lang.Object r6 = r6.getValue()
            ff.e$a r6 = (p107ff.InterfaceC5469e.InterfaceC5470a) r6
            ff.e r5 = r6.mo24161a(r5)
            r0.f17828y = r3
            java.lang.Object r6 = p396v3.C11090b.m6171a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            ff.d0 r5 = (p107ff.Response) r5
        L75:
            boolean r6 = r5.m24206V()
            if (r6 != 0) goto L92
            int r6 = r5.m24197t()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            ff.e0 r6 = r5.m24203a()
            if (r6 == 0) goto L8c
            p396v3.C11098i.m6152d(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k3.C6584j.m20544c(ff.b0, bd.d):java.lang.Object");
    }

    /* renamed from: d */
    private final String m20543d() {
        String m10323h = this.f17819b.m10323h();
        return m10323h == null ? this.f17818a : m10323h;
    }

    /* renamed from: e */
    private final FileSystem m20542e() {
        Object value = this.f17821d.getValue();
        Intrinsics.ifNullDoSomething(value);
        return ((InterfaceC5996a) value).mo22379b();
    }

    /* renamed from: g */
    private final boolean m20540g(Request request, Response response) {
        return this.f17819b.m10322i().getWriteEnabled() && (!this.f17822e || C8403b.f21755c.m15486b(request, response));
    }

    /* renamed from: h */
    private final Request m20539h() {
        Request.C5460a m24259g = new Request.C5460a().m24249q(this.f17818a).m24259g(this.f17819b.m10321j());
        for (Map.Entry entry : this.f17819b.m10316o().m10299a().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.m20929f(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            m24259g.m24251o((Class) key, entry.getValue());
        }
        boolean readEnabled = this.f17819b.m10322i().getReadEnabled();
        boolean readEnabled2 = this.f17819b.m10320k().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            m24259g.m24263c(CacheControl.f15396p);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                m24259g.m24263c(f17817g);
            }
        } else if (this.f17819b.m10322i().getWriteEnabled()) {
            m24259g.m24263c(CacheControl.f15395o);
        } else {
            m24259g.m24263c(f17816f);
        }
        return m24259g.m24264b();
    }

    /* renamed from: i */
    private final InterfaceC5996a.InterfaceC5999c m20538i() {
        InterfaceC5996a interfaceC5996a;
        if (!this.f17819b.m10322i().getReadEnabled() || (interfaceC5996a = (InterfaceC5996a) this.f17821d.getValue()) == null) {
            return null;
        }
        return interfaceC5996a.mo22380a(m20543d());
    }

    /* renamed from: j */
    private final ResponseBody m20537j(Response response) {
        ResponseBody m24203a = response.m24203a();
        if (m24203a != null) {
            return m24203a;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    /* renamed from: k */
    private final C8400a m20536k(InterfaceC5996a.InterfaceC5999c interfaceC5999c) {
        C8400a c8400a;
        try {
            InterfaceC10187e m8565c = C10200t.m8565c(m20542e().m8653q(interfaceC5999c.mo22368d()));
            try {
                c8400a = new C8400a(m8565c);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                c8400a = null;
            }
            if (m8565c != null) {
                m8565c.close();
            }
            if (th == null) {
                Intrinsics.ifNullDoSomething(c8400a);
                return c8400a;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private final EnumC5826d m20535l(Response response) {
        return response.m24209M() != null ? EnumC5826d.NETWORK : EnumC5826d.DISK;
    }

    /* renamed from: m */
    private final AbstractC5840n m20534m(ResponseBody responseBody) {
        return C5842o.m22953a(responseBody.source(), this.f17819b.m10324g());
    }

    /* renamed from: n */
    private final AbstractC5840n m20533n(InterfaceC5996a.InterfaceC5999c interfaceC5999c) {
        return C5842o.m22951c(interfaceC5999c.mo22367f(), m20542e(), m20543d(), interfaceC5999c);
    }

    /* renamed from: o */
    private final InterfaceC5996a.InterfaceC5999c m20532o(InterfaceC5996a.InterfaceC5999c interfaceC5999c, Request request, Response response, C8400a c8400a) {
        InterfaceC5996a.InterfaceC5998b mo22378c;
        C13195u c13195u;
        Long l;
        C13195u c13195u2;
        Throwable th2 = null;
        if (!m20540g(request, response)) {
            if (interfaceC5999c != null) {
                C11098i.m6152d(interfaceC5999c);
            }
            return null;
        }
        if (interfaceC5999c != null) {
            mo22378c = interfaceC5999c.mo22366k();
        } else {
            InterfaceC5996a interfaceC5996a = (InterfaceC5996a) this.f17821d.getValue();
            mo22378c = interfaceC5996a != null ? interfaceC5996a.mo22378c(m20543d()) : null;
        }
        try {
            if (mo22378c == null) {
                return null;
            }
            try {
                if (response.m24197t() == 304 && c8400a != null) {
                    Response m24186c = response.m24208P().m24177l(C8403b.f21755c.m15487a(c8400a.m15495d(), response.m24211H())).m24186c();
                    InterfaceC10186d m8566b = C10200t.m8566b(m20542e().m8654p(mo22378c.mo22373d(), false));
                    try {
                        new C8400a(m24186c).m15492g(m8566b);
                        c13195u2 = C13195u.f34156a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c13195u2 = null;
                    }
                    if (m8566b != null) {
                        try {
                            m8566b.close();
                        } catch (Throwable th4) {
                            if (th2 == null) {
                                th2 = th4;
                            } else {
                                Exceptions.m1470a(th2, th4);
                            }
                        }
                    }
                    if (th2 == null) {
                        Intrinsics.ifNullDoSomething(c13195u2);
                    } else {
                        throw th2;
                    }
                } else {
                    InterfaceC10186d m8566b2 = C10200t.m8566b(m20542e().m8654p(mo22378c.mo22373d(), false));
                    try {
                        new C8400a(response).m15492g(m8566b2);
                        c13195u = C13195u.f34156a;
                        th = null;
                    } catch (Throwable th5) {
                        th = th5;
                        c13195u = null;
                    }
                    if (m8566b2 != null) {
                        try {
                            m8566b2.close();
                        } catch (Throwable th6) {
                            if (th == null) {
                                th = th6;
                            } else {
                                Exceptions.m1470a(th, th6);
                            }
                        }
                    }
                    if (th == null) {
                        Intrinsics.ifNullDoSomething(c13195u);
                        InterfaceC10186d m8566b3 = C10200t.m8566b(m20542e().m8654p(mo22378c.mo22372f(), false));
                        try {
                            ResponseBody m24203a = response.m24203a();
                            Intrinsics.ifNullDoSomething(m24203a);
                            l = Long.valueOf(m24203a.source().mo8747w(m8566b3));
                        } catch (Throwable th7) {
                            th2 = th7;
                            l = null;
                        }
                        if (m8566b3 != null) {
                            try {
                                m8566b3.close();
                            } catch (Throwable th8) {
                                if (th2 == null) {
                                    th2 = th8;
                                } else {
                                    Exceptions.m1470a(th2, th8);
                                }
                            }
                        }
                        if (th2 == null) {
                            Intrinsics.ifNullDoSomething(l);
                        } else {
                            throw th2;
                        }
                    } else {
                        throw th;
                    }
                }
                return mo22378c.mo22371g();
            } catch (Exception e) {
                C11098i.m6155a(mo22378c);
                throw e;
            }
        } finally {
            C11098i.m6152d(response);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo20548a(bd.InterfaceC1886d r13) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k3.C6584j.mo20548a(bd.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != false) goto L13;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m20541f(java.lang.String r5, p107ff.MediaType r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.lang.String r6 = r6.toString()
            goto L9
        L8:
            r6 = r0
        L9:
            r1 = 2
            if (r6 == 0) goto L15
            r2 = 0
            java.lang.String r3 = "text/plain"
            boolean r2 = sd.C10163k.m9008C(r6, r3, r2, r1, r0)
            if (r2 == 0) goto L20
        L15:
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r5 = p396v3.C11098i.m6145k(r2, r5)
            if (r5 == 0) goto L20
            return r5
        L20:
            if (r6 == 0) goto L28
            r5 = 59
            java.lang.String r0 = sd.C10163k.m9003G0(r6, r5, r0, r1, r0)
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k3.C6584j.m20541f(java.lang.String, ff.x):java.lang.String");
    }
}
