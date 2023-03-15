package p051d0;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5255u0;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p127h1.InterfaceC5804s;
import p127h1.Layout;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p357t.C10257c;
import p392v.InterfaceC10987m;
import p393v0.Color;
import p393v0.InterfaceC11001b1;
import p410w.Arrangement;
import p410w.C11438e0;
import p410w.InterfaceC11498x;
import p410w.Padding;
import p410w.Row;
import p410w.Size;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public final class Button {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* renamed from: d0.f$a */
    /* loaded from: classes.dex */
    public static final class C4566a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5242r1 f12358w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11498x f12359x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6113q f12360y;

        /* renamed from: z */
        final /* synthetic */ int f12361z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Button.kt */
        /* renamed from: d0.f$a$a */
        /* loaded from: classes.dex */
        public static final class C4567a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC11498x f12362w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6113q f12363x;

            /* renamed from: y */
            final /* synthetic */ int f12364y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Button.kt */
            /* renamed from: d0.f$a$a$a */
            /* loaded from: classes.dex */
            public static final class C4568a extends AbstractC6438m implements InterfaceC6112p {

                /* renamed from: w */
                final /* synthetic */ InterfaceC11498x f12365w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC6113q f12366x;

                /* renamed from: y */
                final /* synthetic */ int f12367y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4568a(InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i) {
                    super(2);
                    this.f12365w = interfaceC11498x;
                    this.f12366x = interfaceC6113q;
                    this.f12367y = i;
                }

                /* renamed from: F */
                public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                    m27193a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                    return C13195u.f34156a;
                }

                /* renamed from: a */
                public final void m27193a(InterfaceC5179i interfaceC5179i, int i) {
                    if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                        interfaceC5179i.mo25264f();
                        return;
                    }
                    InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
                    C4539d c4539d = C4539d.f12261a;
                    InterfaceC9570f m4981h = Padding.m4981h(Size.m5102g(c9571a, c4539d.m27257e(), c4539d.m27258d()), this.f12365w);
                    Arrangement.InterfaceC11418e m5177b = Arrangement.f29297a.m5177b();
                    InterfaceC9560a.InterfaceC9563c m10593c = InterfaceC9560a.f25145a.m10593c();
                    InterfaceC6113q interfaceC6113q = this.f12366x;
                    int i2 = ((this.f12367y >> 18) & 7168) | 432;
                    interfaceC5179i.mo25263g(-1989997165);
                    int i3 = i2 >> 3;
                    InterfaceC5804s m5141b = Row.m5141b(m5177b, m10593c, interfaceC5179i, (i3 & 112) | (i3 & 14));
                    interfaceC5179i.mo25263g(1376089394);
                    Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                    EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                    ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
                    InterfaceC6097a m21776a = c6227a.m21776a();
                    InterfaceC6113q m23014a = Layout.m23014a(m4981h);
                    int i4 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
                    if (!(interfaceC5179i.mo25278G() instanceof Applier)) {
                        C5175h.m25297c();
                    }
                    interfaceC5179i.mo25246x();
                    if (interfaceC5179i.mo25254p()) {
                        interfaceC5179i.mo25270O(m21776a);
                    } else {
                        interfaceC5179i.mo25251s();
                    }
                    interfaceC5179i.mo25280E();
                    InterfaceC5179i m24856a = C5262w1.m24856a(interfaceC5179i);
                    C5262w1.m24854c(m24856a, m5141b, c6227a.m21773d());
                    C5262w1.m24854c(m24856a, density, c6227a.m21775b());
                    C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
                    C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
                    interfaceC5179i.mo25260j();
                    m23014a.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, Integer.valueOf((i4 >> 3) & 112));
                    interfaceC5179i.mo25263g(2058660585);
                    interfaceC5179i.mo25263g(-326682362);
                    if (((((i4 >> 9) & 14) & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                        interfaceC5179i.mo25264f();
                    } else {
                        interfaceC6113q.mo4533i(C11438e0.f29332a, interfaceC5179i, Integer.valueOf(((i2 >> 6) & 112) | 6));
                    }
                    interfaceC5179i.mo25282C();
                    interfaceC5179i.mo25282C();
                    interfaceC5179i.mo25281D();
                    interfaceC5179i.mo25282C();
                    interfaceC5179i.mo25282C();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4567a(InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i) {
                super(2);
                this.f12362w = interfaceC11498x;
                this.f12363x = interfaceC6113q;
                this.f12364y = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m27194a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m27194a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    Text.m27188a(C4591j0.f12477a.m27115c(interfaceC5179i, 6).m27120c(), ComposableLambda.m19327b(interfaceC5179i, -819891337, true, new C4568a(this.f12362w, this.f12363x, this.f12364y)), interfaceC5179i, 48);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4566a(InterfaceC5242r1 interfaceC5242r1, InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i) {
            super(2);
            this.f12358w = interfaceC5242r1;
            this.f12359x = interfaceC11498x;
            this.f12360y = interfaceC6113q;
            this.f12361z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27195a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27195a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                CompositionLocal.m24954a(new C5255u0[]{C4598l.m27102a().m24909c(Float.valueOf(Color.m6645o(Button.m27196d(this.f12358w))))}, ComposableLambda.m19327b(interfaceC5179i, -819891427, true, new C4567a(this.f12359x, this.f12360y, this.f12361z)), interfaceC5179i, 56);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* renamed from: d0.f$b */
    /* loaded from: classes.dex */
    public static final class C4569b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC4549e f12368A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC11001b1 f12369B;

        /* renamed from: C */
        final /* synthetic */ C10257c f12370C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC4537c f12371D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC11498x f12372E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6113q f12373F;

        /* renamed from: G */
        final /* synthetic */ int f12374G;

        /* renamed from: H */
        final /* synthetic */ int f12375H;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f12376w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12377x;

        /* renamed from: y */
        final /* synthetic */ boolean f12378y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC10987m f12379z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4569b(InterfaceC6097a interfaceC6097a, InterfaceC9570f interfaceC9570f, boolean z, InterfaceC10987m interfaceC10987m, InterfaceC4549e interfaceC4549e, InterfaceC11001b1 interfaceC11001b1, C10257c c10257c, InterfaceC4537c interfaceC4537c, InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12376w = interfaceC6097a;
            this.f12377x = interfaceC9570f;
            this.f12378y = z;
            this.f12379z = interfaceC10987m;
            this.f12368A = interfaceC4549e;
            this.f12369B = interfaceC11001b1;
            this.f12371D = interfaceC4537c;
            this.f12372E = interfaceC11498x;
            this.f12373F = interfaceC6113q;
            this.f12374G = i;
            this.f12375H = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27192a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27192a(InterfaceC5179i interfaceC5179i, int i) {
            Button.m27199a(this.f12376w, this.f12377x, this.f12378y, this.f12379z, this.f12368A, this.f12369B, this.f12370C, this.f12371D, this.f12372E, this.f12373F, interfaceC5179i, this.f12374G | 1, this.f12375H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Button.kt */
    /* renamed from: d0.f$c */
    /* loaded from: classes.dex */
    public static final class C4570c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC4549e f12380A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC11001b1 f12381B;

        /* renamed from: C */
        final /* synthetic */ C10257c f12382C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC4537c f12383D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC11498x f12384E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6113q f12385F;

        /* renamed from: G */
        final /* synthetic */ int f12386G;

        /* renamed from: H */
        final /* synthetic */ int f12387H;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f12388w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12389x;

        /* renamed from: y */
        final /* synthetic */ boolean f12390y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC10987m f12391z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4570c(InterfaceC6097a interfaceC6097a, InterfaceC9570f interfaceC9570f, boolean z, InterfaceC10987m interfaceC10987m, InterfaceC4549e interfaceC4549e, InterfaceC11001b1 interfaceC11001b1, C10257c c10257c, InterfaceC4537c interfaceC4537c, InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12388w = interfaceC6097a;
            this.f12389x = interfaceC9570f;
            this.f12390y = z;
            this.f12391z = interfaceC10987m;
            this.f12380A = interfaceC4549e;
            this.f12381B = interfaceC11001b1;
            this.f12383D = interfaceC4537c;
            this.f12384E = interfaceC11498x;
            this.f12385F = interfaceC6113q;
            this.f12386G = i;
            this.f12387H = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27191a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27191a(InterfaceC5179i interfaceC5179i, int i) {
            Button.m27197c(this.f12388w, this.f12389x, this.f12390y, this.f12391z, this.f12380A, this.f12381B, this.f12382C, this.f12383D, this.f12384E, this.f12385F, interfaceC5179i, this.f12386G | 1, this.f12387H);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27199a(id.InterfaceC6097a r34, p302q0.InterfaceC9570f r35, boolean r36, p392v.InterfaceC10987m r37, p051d0.InterfaceC4549e r38, p393v0.InterfaceC11001b1 r39, p357t.C10257c r40, p051d0.InterfaceC4537c r41, p410w.InterfaceC11498x r42, id.InterfaceC6113q r43, p092f0.InterfaceC5179i r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Button.m27199a(id.a, q0.f, boolean, v.m, d0.e, v0.b1, t.c, d0.c, w.x, id.q, f0.i, int, int):void");
    }

    /* renamed from: b */
    private static final long m27198b(InterfaceC5242r1 interfaceC5242r1) {
        return ((Color) interfaceC5242r1.getValue()).m6638v();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27197c(id.InterfaceC6097a r31, p302q0.InterfaceC9570f r32, boolean r33, p392v.InterfaceC10987m r34, p051d0.InterfaceC4549e r35, p393v0.InterfaceC11001b1 r36, p357t.C10257c r37, p051d0.InterfaceC4537c r38, p410w.InterfaceC11498x r39, id.InterfaceC6113q r40, p092f0.InterfaceC5179i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Button.m27197c(id.a, q0.f, boolean, v.m, d0.e, v0.b1, t.c, d0.c, w.x, id.q, f0.i, int, int):void");
    }

    /* renamed from: d */
    public static final /* synthetic */ long m27196d(InterfaceC5242r1 interfaceC5242r1) {
        return m27198b(interfaceC5242r1);
    }
}
