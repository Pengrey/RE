package p127h1;

import p373u0.C10781l;

/* renamed from: h1.d */
/* loaded from: classes.dex */
public interface InterfaceC5753d {

    /* renamed from: a */
    public static final C5754a f16069a = C5754a.f16070a;

    /* compiled from: ContentScale.kt */
    /* renamed from: h1.d$a */
    /* loaded from: classes.dex */
    public static final class C5754a {

        /* renamed from: a */
        static final /* synthetic */ C5754a f16070a = new C5754a();

        /* renamed from: b */
        private static final InterfaceC5753d f16071b;

        /* renamed from: c */
        private static final InterfaceC5753d f16072c;

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$a */
        /* loaded from: classes.dex */
        public static final class C5755a implements InterfaceC5753d {
            C5755a() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                float m23137b = C5763e.m23137b(j, j2);
                return C5775i0.m23111a(m23137b, m23137b);
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$b */
        /* loaded from: classes.dex */
        public static final class C5756b implements InterfaceC5753d {
            C5756b() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                return C5775i0.m23111a(C5763e.m23135d(j, j2), C5763e.m23138a(j, j2));
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$c */
        /* loaded from: classes.dex */
        public static final class C5757c implements InterfaceC5753d {
            C5757c() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                float m23138a = C5763e.m23138a(j, j2);
                return C5775i0.m23111a(m23138a, m23138a);
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$d */
        /* loaded from: classes.dex */
        public static final class C5758d implements InterfaceC5753d {
            C5758d() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                float m23135d = C5763e.m23135d(j, j2);
                return C5775i0.m23111a(m23135d, m23135d);
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$e */
        /* loaded from: classes.dex */
        public static final class C5759e implements InterfaceC5753d {
            C5759e() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                float m23136c = C5763e.m23136c(j, j2);
                return C5775i0.m23111a(m23136c, m23136c);
            }
        }

        /* compiled from: ContentScale.kt */
        /* renamed from: h1.d$a$f */
        /* loaded from: classes.dex */
        public static final class C5760f implements InterfaceC5753d {
            C5760f() {
            }

            @Override // p127h1.InterfaceC5753d
            /* renamed from: a */
            public long mo23142a(long j, long j2) {
                if (C10781l.m7091i(j) <= C10781l.m7091i(j2) && C10781l.m7093g(j) <= C10781l.m7093g(j2)) {
                    return C5775i0.m23111a(1.0f, 1.0f);
                }
                float m23136c = C5763e.m23136c(j, j2);
                return C5775i0.m23111a(m23136c, m23136c);
            }
        }

        static {
            new C5755a();
            f16071b = new C5759e();
            new C5757c();
            new C5758d();
            f16072c = new C5760f();
            new C5765f(1.0f);
            new C5756b();
        }

        private C5754a() {
        }

        /* renamed from: a */
        public final InterfaceC5753d m23144a() {
            return f16071b;
        }

        /* renamed from: b */
        public final InterfaceC5753d m23143b() {
            return f16072c;
        }
    }

    /* renamed from: a */
    long mo23142a(long j, long j2);
}
