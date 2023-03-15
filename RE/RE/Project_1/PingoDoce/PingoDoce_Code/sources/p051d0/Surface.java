package p051d0;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5255u0;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p093f1.InterfaceC5276c0;
import p127h1.InterfaceC5804s;
import p127h1.Layout;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p245n1.C7591h;
import p245n1.InterfaceC7621v;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p346s0.Clip;
import p346s0.Shadow;
import p357t.C10255b;
import p357t.C10257c;
import p357t.InterfaceC10307k;
import p392v.InterfaceC10987m;
import p393v0.Color;
import p393v0.InterfaceC11001b1;
import p410w.C11430e;
import p410w.C11440f;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: d0.b1 */
/* loaded from: classes.dex */
public final class Surface {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* renamed from: d0.b1$a */
    /* loaded from: classes.dex */
    public static final class C4531a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C4531a f12213w = new C4531a();

        C4531a() {
            super(1);
        }

        /* renamed from: a */
        public final void m27277a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27277a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.SurfaceKt$Surface$2", m20196f = "Surface.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: d0.b1$b */
    /* loaded from: classes.dex */
    public static final class C4532b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f12214x;

        C4532b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4532b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C4532b) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f12214x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* renamed from: d0.b1$c */
    /* loaded from: classes.dex */
    public static final class C4533c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C10257c f12215A;

        /* renamed from: B */
        final /* synthetic */ float f12216B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6112p f12217C;

        /* renamed from: D */
        final /* synthetic */ int f12218D;

        /* renamed from: E */
        final /* synthetic */ int f12219E;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f12220w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11001b1 f12221x;

        /* renamed from: y */
        final /* synthetic */ long f12222y;

        /* renamed from: z */
        final /* synthetic */ long f12223z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4533c(InterfaceC9570f interfaceC9570f, InterfaceC11001b1 interfaceC11001b1, long j, long j2, C10257c c10257c, float f, InterfaceC6112p interfaceC6112p, int i, int i2) {
            super(2);
            this.f12220w = interfaceC9570f;
            this.f12221x = interfaceC11001b1;
            this.f12222y = j;
            this.f12223z = j2;
            this.f12216B = f;
            this.f12217C = interfaceC6112p;
            this.f12218D = i;
            this.f12219E = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27275a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27275a(InterfaceC5179i interfaceC5179i, int i) {
            Surface.m27280b(this.f12220w, this.f12221x, this.f12222y, this.f12223z, this.f12215A, this.f12216B, this.f12217C, interfaceC5179i, this.f12218D | 1, this.f12219E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* renamed from: d0.b1$d */
    /* loaded from: classes.dex */
    public static final class C4534d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ long f12224A;

        /* renamed from: B */
        final /* synthetic */ C10257c f12225B;

        /* renamed from: C */
        final /* synthetic */ float f12226C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC10987m f12227D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC10307k f12228E;

        /* renamed from: F */
        final /* synthetic */ boolean f12229F;

        /* renamed from: G */
        final /* synthetic */ String f12230G;

        /* renamed from: H */
        final /* synthetic */ C7591h f12231H;

        /* renamed from: I */
        final /* synthetic */ InterfaceC6112p f12232I;

        /* renamed from: J */
        final /* synthetic */ int f12233J;

        /* renamed from: K */
        final /* synthetic */ int f12234K;

        /* renamed from: L */
        final /* synthetic */ int f12235L;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f12236w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12237x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC11001b1 f12238y;

        /* renamed from: z */
        final /* synthetic */ long f12239z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4534d(InterfaceC6097a interfaceC6097a, InterfaceC9570f interfaceC9570f, InterfaceC11001b1 interfaceC11001b1, long j, long j2, C10257c c10257c, float f, InterfaceC10987m interfaceC10987m, InterfaceC10307k interfaceC10307k, boolean z, String str, C7591h c7591h, InterfaceC6112p interfaceC6112p, int i, int i2, int i3) {
            super(2);
            this.f12236w = interfaceC6097a;
            this.f12237x = interfaceC9570f;
            this.f12238y = interfaceC11001b1;
            this.f12239z = j;
            this.f12224A = j2;
            this.f12226C = f;
            this.f12227D = interfaceC10987m;
            this.f12228E = interfaceC10307k;
            this.f12229F = z;
            this.f12230G = str;
            this.f12231H = c7591h;
            this.f12232I = interfaceC6112p;
            this.f12233J = i;
            this.f12234K = i2;
            this.f12235L = i3;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27274a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27274a(InterfaceC5179i interfaceC5179i, int i) {
            Surface.m27281a(this.f12236w, this.f12237x, this.f12238y, this.f12239z, this.f12224A, this.f12225B, this.f12226C, this.f12227D, this.f12228E, this.f12229F, this.f12230G, this.f12231H, this.f12232I, interfaceC5179i, this.f12233J | 1, this.f12234K, this.f12235L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* renamed from: d0.b1$e */
    /* loaded from: classes.dex */
    public static final class C4535e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC9570f f12240A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6112p f12241B;

        /* renamed from: C */
        final /* synthetic */ int f12242C;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f12243w;

        /* renamed from: x */
        final /* synthetic */ float f12244x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC11001b1 f12245y;

        /* renamed from: z */
        final /* synthetic */ long f12246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4535e(InterfaceC9570f interfaceC9570f, float f, InterfaceC11001b1 interfaceC11001b1, C10257c c10257c, long j, InterfaceC9570f interfaceC9570f2, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12243w = interfaceC9570f;
            this.f12244x = f;
            this.f12245y = interfaceC11001b1;
            this.f12246z = j;
            this.f12240A = interfaceC9570f2;
            this.f12241B = interfaceC6112p;
            this.f12242C = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27273a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27273a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
                return;
            }
            InterfaceC9570f mo7205u = Clip.m9381a(C10255b.m8383a(Shadow.m9353a(this.f12243w, this.f12244x, this.f12245y, false).mo7205u(InterfaceC9570f.f25164r), this.f12246z, this.f12245y), this.f12245y).mo7205u(this.f12240A);
            InterfaceC6112p interfaceC6112p = this.f12241B;
            int i2 = this.f12242C;
            interfaceC5179i.mo25263g(-1990474327);
            InterfaceC5804s m5118i = C11430e.m5118i(InterfaceC9560a.f25145a.m10589g(), true, interfaceC5179i, 48);
            interfaceC5179i.mo25263g(1376089394);
            Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(mo7205u);
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
            C5262w1.m24854c(m24856a, m5118i, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            interfaceC5179i.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, 0);
            interfaceC5179i.mo25263g(2058660585);
            interfaceC5179i.mo25263g(-1253629305);
            C11440f c11440f = C11440f.f29335a;
            interfaceC5179i.mo25263g(1505976207);
            interfaceC6112p.mo39856d(interfaceC5179i, Integer.valueOf((i2 >> 21) & 14));
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25281D();
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25282C();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Surface.kt */
    /* renamed from: d0.b1$f */
    /* loaded from: classes.dex */
    public static final class C4536f extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C10257c f12247A;

        /* renamed from: B */
        final /* synthetic */ float f12248B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC9570f f12249C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6112p f12250D;

        /* renamed from: E */
        final /* synthetic */ int f12251E;

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f12252w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11001b1 f12253x;

        /* renamed from: y */
        final /* synthetic */ long f12254y;

        /* renamed from: z */
        final /* synthetic */ long f12255z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4536f(InterfaceC9570f interfaceC9570f, InterfaceC11001b1 interfaceC11001b1, long j, long j2, C10257c c10257c, float f, InterfaceC9570f interfaceC9570f2, InterfaceC6112p interfaceC6112p, int i) {
            super(2);
            this.f12252w = interfaceC9570f;
            this.f12253x = interfaceC11001b1;
            this.f12254y = j;
            this.f12255z = j2;
            this.f12248B = f;
            this.f12249C = interfaceC9570f2;
            this.f12250D = interfaceC6112p;
            this.f12251E = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27272a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27272a(InterfaceC5179i interfaceC5179i, int i) {
            Surface.m27278d(this.f12252w, this.f12253x, this.f12254y, this.f12255z, this.f12247A, this.f12248B, this.f12249C, this.f12250D, interfaceC5179i, this.f12251E | 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27281a(id.InterfaceC6097a r32, p302q0.InterfaceC9570f r33, p393v0.InterfaceC11001b1 r34, long r35, long r37, p357t.C10257c r39, float r40, p392v.InterfaceC10987m r41, p357t.InterfaceC10307k r42, boolean r43, java.lang.String r44, p245n1.C7591h r45, id.InterfaceC6112p r46, p092f0.InterfaceC5179i r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Surface.m27281a(id.a, q0.f, v0.b1, long, long, t.c, float, v.m, t.k, boolean, java.lang.String, n1.h, id.p, f0.i, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27280b(p302q0.InterfaceC9570f r25, p393v0.InterfaceC11001b1 r26, long r27, long r29, p357t.C10257c r31, float r32, id.InterfaceC6112p r33, p092f0.InterfaceC5179i r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Surface.m27280b(q0.f, v0.b1, long, long, t.c, float, id.p, f0.i, int, int):void");
    }

    /* renamed from: c */
    private static final void m27279c(InterfaceC9570f interfaceC9570f, InterfaceC11001b1 interfaceC11001b1, long j, long j2, C10257c c10257c, float f, InterfaceC9570f interfaceC9570f2, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        InterfaceC5179i interfaceC5179i2;
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-750961828);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC9570f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC11001b1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo25249u.mo25258l(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo25249u.mo25258l(j2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= mo25249u.mo25276I(c10257c) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= mo25249u.mo25261i(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC9570f2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6112p) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (((i3 & 23967451) ^ 4793490) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
            interfaceC5179i2 = mo25249u;
        } else {
            InterfaceC4675x interfaceC4675x = (InterfaceC4675x) mo25249u.mo25256n(C4677y.m26982d());
            float m875g = C13605g.m875g(((C13605g) mo25249u.mo25256n(C4677y.m26983c())).m870l() + f);
            mo25249u.mo25263g(-750961449);
            long mo26987a = (!Color.m6646n(j, C4591j0.f12477a.m27117a(mo25249u, 6).m27167n()) || interfaceC4675x == null) ? j : interfaceC4675x.mo26987a(j, m875g, mo25249u, (i3 >> 6) & 14);
            mo25249u.mo25282C();
            interfaceC5179i2 = mo25249u;
            CompositionLocal.m24954a(new C5255u0[]{C4602m.m27098a().m24909c(Color.m6652h(j2)), C4677y.m26983c().m24909c(C13605g.m878d(m875g))}, ComposableLambda.m19327b(interfaceC5179i2, -819902018, true, new C4535e(interfaceC9570f, f, interfaceC11001b1, c10257c, mo26987a, interfaceC9570f2, interfaceC6112p, i3)), interfaceC5179i2, 56);
        }
        InterfaceC5151a1 mo25274K = interfaceC5179i2.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4536f(interfaceC9570f, interfaceC11001b1, j, j2, c10257c, f, interfaceC9570f2, interfaceC6112p, i));
    }

    /* renamed from: d */
    public static final /* synthetic */ void m27278d(InterfaceC9570f interfaceC9570f, InterfaceC11001b1 interfaceC11001b1, long j, long j2, C10257c c10257c, float f, InterfaceC9570f interfaceC9570f2, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i) {
        m27279c(interfaceC9570f, interfaceC11001b1, j, j2, c10257c, f, interfaceC9570f2, interfaceC6112p, interfaceC5179i, i);
    }
}
