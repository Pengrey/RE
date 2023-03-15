package p051d0;

import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* renamed from: d0.i */
/* loaded from: classes.dex */
public final class Scaffold {

    /* renamed from: a */
    public static final Scaffold f12452a = new Scaffold();

    /* renamed from: b */
    public static InterfaceC6112p f12453b = ComposableLambda.m19326c(-985535855, false, C4585a.f12457w);

    /* renamed from: c */
    public static InterfaceC6112p f12454c = ComposableLambda.m19326c(-985535811, false, C4586b.f12458w);

    /* renamed from: d */
    public static InterfaceC6113q f12455d = ComposableLambda.m19326c(-985535107, false, C4587c.f12459w);

    /* renamed from: e */
    public static InterfaceC6112p f12456e = ComposableLambda.m19326c(-985535036, false, C4588d.f12460w);

    /* compiled from: Scaffold.kt */
    /* renamed from: d0.i$a */
    /* loaded from: classes.dex */
    static final class C4585a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C4585a f12457w = new C4585a();

        C4585a() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27131a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27131a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* compiled from: Scaffold.kt */
    /* renamed from: d0.i$b */
    /* loaded from: classes.dex */
    static final class C4586b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C4586b f12458w = new C4586b();

        C4586b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27130a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27130a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* compiled from: Scaffold.kt */
    /* renamed from: d0.i$c */
    /* loaded from: classes.dex */
    static final class C4587c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C4587c f12459w = new C4587c();

        C4587c() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m27129a((C4676x0) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27129a(C4676x0 c4676x0, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(c4676x0, "it");
            if ((i & 14) == 0) {
                i |= interfaceC5179i.mo25276I(c4676x0) ? 4 : 2;
            }
            if (((i & 91) ^ 18) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                C4661w0.m27006b(c4676x0, null, null, interfaceC5179i, i & 14, 6);
            }
        }
    }

    /* compiled from: Scaffold.kt */
    /* renamed from: d0.i$d */
    /* loaded from: classes.dex */
    static final class C4588d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C4588d f12460w = new C4588d();

        C4588d() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27128a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27128a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6112p m27135a() {
        return f12453b;
    }

    /* renamed from: b */
    public final InterfaceC6112p m27134b() {
        return f12454c;
    }

    /* renamed from: c */
    public final InterfaceC6113q m27133c() {
        return f12455d;
    }

    /* renamed from: d */
    public final InterfaceC6112p m27132d() {
        return f12456e;
    }
}
