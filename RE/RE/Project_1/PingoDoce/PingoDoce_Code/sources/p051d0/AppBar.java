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
import p127h1.InterfaceC5804s;
import p127h1.Layout;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p229m0.ComposableLambda;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p393v0.InterfaceC11001b1;
import p410w.Arrangement;
import p410w.C11438e0;
import p410w.InterfaceC11498x;
import p410w.Padding;
import p410w.Row;
import p410w.Size;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class AppBar {

    /* renamed from: a */
    private static final float f12184a = C13605g.m875g(56);

    /* renamed from: b */
    private static final float f12185b;

    /* renamed from: c */
    private static final InterfaceC9570f f12186c;

    /* renamed from: d */
    private static final InterfaceC9570f f12187d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBar.kt */
    /* renamed from: d0.b$a */
    /* loaded from: classes.dex */
    public static final class C4527a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC11498x f12188w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6113q f12189x;

        /* renamed from: y */
        final /* synthetic */ int f12190y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppBar.kt */
        /* renamed from: d0.b$a$a */
        /* loaded from: classes.dex */
        public static final class C4528a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC11498x f12191w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6113q f12192x;

            /* renamed from: y */
            final /* synthetic */ int f12193y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4528a(InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i) {
                super(2);
                this.f12191w = interfaceC11498x;
                this.f12192x = interfaceC6113q;
                this.f12193y = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m27287a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m27287a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                InterfaceC9570f m5095n = Size.m5095n(Padding.m4981h(Size.m5096m(InterfaceC9570f.f25164r, 0.0f, 1, null), this.f12191w), AppBar.m27290d());
                Arrangement.InterfaceC11416d m5176c = Arrangement.f29297a.m5176c();
                InterfaceC9560a.InterfaceC9563c m10593c = InterfaceC9560a.f25145a.m10593c();
                InterfaceC6113q interfaceC6113q = this.f12192x;
                int i2 = ((this.f12193y >> 9) & 7168) | 432;
                interfaceC5179i.mo25263g(-1989997165);
                int i3 = i2 >> 3;
                InterfaceC5804s m5141b = Row.m5141b(m5176c, m10593c, interfaceC5179i, (i3 & 112) | (i3 & 14));
                interfaceC5179i.mo25263g(1376089394);
                Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
                InterfaceC6097a m21776a = c6227a.m21776a();
                InterfaceC6113q m23014a = Layout.m23014a(m5095n);
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
        C4527a(InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i) {
            super(2);
            this.f12188w = interfaceC11498x;
            this.f12189x = interfaceC6113q;
            this.f12190y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27288a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27288a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                CompositionLocal.m24954a(new C5255u0[]{C4598l.m27102a().m24909c(Float.valueOf(C4594k.f12480a.m27107d(interfaceC5179i, 6)))}, ComposableLambda.m19327b(interfaceC5179i, -819904820, true, new C4528a(this.f12188w, this.f12189x, this.f12190y)), interfaceC5179i, 56);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBar.kt */
    /* renamed from: d0.b$b */
    /* loaded from: classes.dex */
    public static final class C4529b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC11001b1 f12194A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC9570f f12195B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6113q f12196C;

        /* renamed from: D */
        final /* synthetic */ int f12197D;

        /* renamed from: E */
        final /* synthetic */ int f12198E;

        /* renamed from: w */
        final /* synthetic */ long f12199w;

        /* renamed from: x */
        final /* synthetic */ long f12200x;

        /* renamed from: y */
        final /* synthetic */ float f12201y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC11498x f12202z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4529b(long j, long j2, float f, InterfaceC11498x interfaceC11498x, InterfaceC11001b1 interfaceC11001b1, InterfaceC9570f interfaceC9570f, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12199w = j;
            this.f12200x = j2;
            this.f12201y = f;
            this.f12202z = interfaceC11498x;
            this.f12194A = interfaceC11001b1;
            this.f12195B = interfaceC9570f;
            this.f12196C = interfaceC6113q;
            this.f12197D = i;
            this.f12198E = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27286a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27286a(InterfaceC5179i interfaceC5179i, int i) {
            AppBar.m27291c(this.f12199w, this.f12200x, this.f12201y, this.f12202z, this.f12194A, this.f12195B, this.f12196C, interfaceC5179i, this.f12197D | 1, this.f12198E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppBar.kt */
    /* renamed from: d0.b$c */
    /* loaded from: classes.dex */
    public static final class C4530c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC11498x f12203A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6113q f12204B;

        /* renamed from: C */
        final /* synthetic */ int f12205C;

        /* renamed from: D */
        final /* synthetic */ int f12206D;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f12207w;

        /* renamed from: x */
        final /* synthetic */ long f12208x;

        /* renamed from: y */
        final /* synthetic */ long f12209y;

        /* renamed from: z */
        final /* synthetic */ float f12210z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4530c(InterfaceC9570f interfaceC9570f, long j, long j2, float f, InterfaceC11498x interfaceC11498x, InterfaceC6113q interfaceC6113q, int i, int i2) {
            super(2);
            this.f12207w = interfaceC9570f;
            this.f12208x = j;
            this.f12209y = j2;
            this.f12210z = f;
            this.f12203A = interfaceC11498x;
            this.f12204B = interfaceC6113q;
            this.f12205C = i;
            this.f12206D = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27285a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27285a(InterfaceC5179i interfaceC5179i, int i) {
            AppBar.m27292b(this.f12207w, this.f12208x, this.f12209y, this.f12210z, this.f12203A, this.f12204B, interfaceC5179i, this.f12205C | 1, this.f12206D);
        }
    }

    static {
        float f = 4;
        float m875g = C13605g.m875g(f);
        f12185b = m875g;
        InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
        f12186c = Size.m5092q(c9571a, C13605g.m875g(C13605g.m875g(16) - m875g));
        f12187d = Size.m5092q(Size.m5100i(c9571a, 0.0f, 1, null), C13605g.m875g(C13605g.m875g(72) - m875g));
        C13605g.m875g(8);
        C13605g.m875g(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m27293a(long r24, long r26, float r28, p410w.InterfaceC11498x r29, p393v0.InterfaceC11001b1 r30, p302q0.InterfaceC9570f r31, id.InterfaceC6113q r32, p092f0.InterfaceC5179i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.AppBar.m27293a(long, long, float, w.x, v0.b1, q0.f, id.q, f0.i, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27292b(p302q0.InterfaceC9570f r23, long r24, long r26, float r28, p410w.InterfaceC11498x r29, id.InterfaceC6113q r30, p092f0.InterfaceC5179i r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.AppBar.m27292b(q0.f, long, long, float, w.x, id.q, f0.i, int, int):void");
    }

    /* renamed from: c */
    public static final /* synthetic */ void m27291c(long j, long j2, float f, InterfaceC11498x interfaceC11498x, InterfaceC11001b1 interfaceC11001b1, InterfaceC9570f interfaceC9570f, InterfaceC6113q interfaceC6113q, InterfaceC5179i interfaceC5179i, int i, int i2) {
        m27293a(j, j2, f, interfaceC11498x, interfaceC11001b1, interfaceC9570f, interfaceC6113q, interfaceC5179i, i, i2);
    }

    /* renamed from: d */
    public static final /* synthetic */ float m27290d() {
        return f12184a;
    }

    /* renamed from: e */
    public static final /* synthetic */ float m27289e() {
        return f12185b;
    }
}
