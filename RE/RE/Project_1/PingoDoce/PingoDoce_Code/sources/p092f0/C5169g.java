package p092f0;

import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* renamed from: f0.g */
/* loaded from: classes.dex */
public final class C5169g {

    /* renamed from: a */
    public static final C5169g f14286a = new C5169g();

    /* renamed from: b */
    public static InterfaceC6112p<InterfaceC5179i, Integer, C13195u> f14287b = ComposableLambda.m19326c(-985543095, false, C5170a.f14289w);

    /* renamed from: c */
    public static InterfaceC6112p<InterfaceC5179i, Integer, C13195u> f14288c = ComposableLambda.m19326c(-985548681, false, C5171b.f14290w);

    /* compiled from: Composition.kt */
    /* renamed from: f0.g$a */
    /* loaded from: classes.dex */
    static final class C5170a extends AbstractC6438m implements InterfaceC6112p<InterfaceC5179i, Integer, C13195u> {

        /* renamed from: w */
        public static final C5170a f14289w = new C5170a();

        C5170a() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ C13195u mo39856d(InterfaceC5179i interfaceC5179i, Integer num) {
            m25373a(interfaceC5179i, num.intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25373a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* compiled from: Composition.kt */
    /* renamed from: f0.g$b */
    /* loaded from: classes.dex */
    static final class C5171b extends AbstractC6438m implements InterfaceC6112p<InterfaceC5179i, Integer, C13195u> {

        /* renamed from: w */
        public static final C5171b f14290w = new C5171b();

        C5171b() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ C13195u mo39856d(InterfaceC5179i interfaceC5179i, Integer num) {
            m25372a(interfaceC5179i, num.intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25372a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6112p<InterfaceC5179i, Integer, C13195u> m25375a() {
        return f14287b;
    }

    /* renamed from: b */
    public final InterfaceC6112p<InterfaceC5179i, Integer, C13195u> m25374b() {
        return f14288c;
    }
}
