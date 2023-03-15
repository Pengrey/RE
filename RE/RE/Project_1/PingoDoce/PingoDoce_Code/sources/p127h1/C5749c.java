package p127h1;

import id.InterfaceC6112p;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* renamed from: h1.c */
/* loaded from: classes.dex */
public final class C5749c {

    /* renamed from: a */
    public static final C5749c f16059a = new C5749c();

    /* renamed from: b */
    public static InterfaceC6112p<InterfaceC5179i, Integer, C13195u> f16060b = ComposableLambda.m19326c(-985540856, false, C5750a.f16061w);

    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.c$a */
    /* loaded from: classes.dex */
    static final class C5750a extends AbstractC6438m implements InterfaceC6112p<InterfaceC5179i, Integer, C13195u> {

        /* renamed from: w */
        public static final C5750a f16061w = new C5750a();

        C5750a() {
            super(2);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ C13195u mo39856d(InterfaceC5179i interfaceC5179i, Integer num) {
            m23187a(interfaceC5179i, num.intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m23187a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            }
        }
    }

    /* renamed from: a */
    public final InterfaceC6112p<InterfaceC5179i, Integer, C13195u> m23188a() {
        return f16060b;
    }
}
