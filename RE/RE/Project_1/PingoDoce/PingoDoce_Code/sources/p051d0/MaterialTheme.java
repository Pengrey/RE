package p051d0;

import id.InterfaceC6112p;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p468yc.C13195u;

/* renamed from: d0.k0 */
/* loaded from: classes.dex */
public final class MaterialTheme {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialTheme.kt */
    /* renamed from: d0.k0$a */
    /* loaded from: classes.dex */
    public static final class C4595a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ Typography f12481w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f12482x;

        /* renamed from: y */
        final /* synthetic */ int f12483y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MaterialTheme.kt */
        /* renamed from: d0.k0$a$a */
        /* loaded from: classes.dex */
        public static final class C4596a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6112p f12484w;

            /* renamed from: x */
            final /* synthetic */ int f12485x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4596a(InterfaceC6112p interfaceC6112p, int i) {
                super(2);
                this.f12484w = interfaceC6112p;
                this.f12485x = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m27104a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m27104a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    C4600l0.m27100a(this.f12484w, interfaceC5179i, (this.f12485x >> 9) & 14);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4595a(Typography typography, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12481w = typography;
            this.f12482x = interfaceC6112p;
            this.f12483y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27105a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27105a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                Text.m27188a(this.f12481w.m27122a(), ComposableLambda.m19327b(interfaceC5179i, -819893830, true, new C4596a(this.f12482x, this.f12483y)), interfaceC5179i, 48);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialTheme.kt */
    /* renamed from: d0.k0$b */
    /* loaded from: classes.dex */
    public static final class C4597b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f12486A;

        /* renamed from: B */
        final /* synthetic */ int f12487B;

        /* renamed from: w */
        final /* synthetic */ C4576g f12488w;

        /* renamed from: x */
        final /* synthetic */ Typography f12489x;

        /* renamed from: y */
        final /* synthetic */ Shapes f12490y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6112p f12491z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4597b(C4576g c4576g, Typography typography, Shapes shapes, InterfaceC6112p interfaceC6112p, int i, int i2) {
            super(2);
            this.f12488w = c4576g;
            this.f12489x = typography;
            this.f12490y = shapes;
            this.f12491z = interfaceC6112p;
            this.f12486A = i;
            this.f12487B = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27103a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27103a(InterfaceC5179i interfaceC5179i, int i) {
            MaterialTheme.m27106a(this.f12488w, this.f12489x, this.f12490y, this.f12491z, interfaceC5179i, this.f12486A | 1, this.f12487B);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
        if ((r49 & 4) != 0) goto L55;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27106a(p051d0.C4576g r43, p051d0.Typography r44, p051d0.Shapes r45, id.InterfaceC6112p r46, p092f0.InterfaceC5179i r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.MaterialTheme.m27106a(d0.g, d0.i1, d0.r0, id.p, f0.i, int, int):void");
    }
}
