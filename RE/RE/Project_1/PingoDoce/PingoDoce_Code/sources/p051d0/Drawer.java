package p051d0;

import androidx.compose.foundation.gestures.EnumC0627a;
import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p070e.C4906j;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p093f1.C5293i0;
import p093f1.InterfaceC5276c0;
import p127h1.InterfaceC5804s;
import p127h1.Layout;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p229m0.ComposableLambda;
import p244n0.RememberSaveable;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p297pd._Ranges;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p345s.C9978p0;
import p357t.Canvas;
import p372u.C10695i0;
import p373u0.C10774f;
import p393v0.Color;
import p393v0.InterfaceC11001b1;
import p410w.Arrangement;
import p410w.C11430e;
import p410w.C11440f;
import p410w.C11473l;
import p410w.Column;
import p410w.InterfaceC11459h;
import p410w.Offset;
import p410w.Padding;
import p410w.Size;
import p433x0.DrawScope;
import p468yc.C13186n;
import p468yc.C13191r;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13605g;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.Density;
import p479z1.EnumC13618o;
import p489zc.C13769l0;
import td.InterfaceC10524i0;

/* renamed from: d0.s */
/* loaded from: classes.dex */
public final class Drawer {

    /* renamed from: a */
    private static final float f12625a = C13605g.m875g(56);

    /* renamed from: b */
    private static final float f12626b = C13605g.m875g(400);

    /* renamed from: c */
    private static final C9978p0 f12627c = new C9978p0(256, 0, null, 6, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$a */
    /* loaded from: classes.dex */
    public static final class C4631a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ InterfaceC11001b1 f12628A;

        /* renamed from: B */
        final /* synthetic */ long f12629B;

        /* renamed from: C */
        final /* synthetic */ long f12630C;

        /* renamed from: D */
        final /* synthetic */ float f12631D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6112p f12632E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC10524i0 f12633F;

        /* renamed from: G */
        final /* synthetic */ InterfaceC6113q f12634G;

        /* renamed from: w */
        final /* synthetic */ C4652t f12635w;

        /* renamed from: x */
        final /* synthetic */ boolean f12636x;

        /* renamed from: y */
        final /* synthetic */ int f12637y;

        /* renamed from: z */
        final /* synthetic */ long f12638z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$a */
        /* loaded from: classes.dex */
        public static final class C4632a extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            public static final C4632a f12639w = new C4632a();

            C4632a() {
                super(2);
            }

            /* renamed from: a */
            public final InterfaceC4579g1 mo39856d(EnumC4657u enumC4657u, EnumC4657u enumC4657u2) {
                Intrinsics.isThisObjectNull(enumC4657u, "$noName_0");
                Intrinsics.isThisObjectNull(enumC4657u2, "$noName_1");
                return new C4550e0(0.5f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$b */
        /* loaded from: classes.dex */
        public static final class C4633b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ boolean f12640w;

            /* renamed from: x */
            final /* synthetic */ C4652t f12641x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC10524i0 f12642y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Drawer.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", m20196f = "Drawer.kt", m20195l = {421}, m20194m = "invokeSuspend")
            /* renamed from: d0.s$a$b$a */
            /* loaded from: classes.dex */
            public static final class C4634a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: x */
                int f12643x;

                /* renamed from: y */
                final /* synthetic */ C4652t f12644y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4634a(C4652t c4652t, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f12644y = c4652t;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    return new C4634a(this.f12644y, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C4634a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f12643x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        C4652t c4652t = this.f12644y;
                        this.f12643x = 1;
                        if (c4652t.m27027b(this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4633b(boolean z, C4652t c4652t, InterfaceC10524i0 interfaceC10524i0) {
                super(0);
                this.f12640w = z;
                this.f12641x = c4652t;
                this.f12642y = interfaceC10524i0;
            }

            /* renamed from: a */
            public final void m27047a() {
                if (this.f12640w && ((Boolean) this.f12641x.m27024e().m27218n().mo9587d(EnumC4657u.Closed)).booleanValue()) {
                    C6772d.m20158d(this.f12642y, null, null, new C4634a(this.f12641x, null), 3, null);
                }
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m27047a();
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$c */
        /* loaded from: classes.dex */
        public static final class C4635c extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ float f12645w;

            /* renamed from: x */
            final /* synthetic */ float f12646x;

            /* renamed from: y */
            final /* synthetic */ C4652t f12647y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4635c(float f, float f2, C4652t c4652t) {
                super(0);
                this.f12645w = f;
                this.f12646x = f2;
                this.f12647y = c4652t;
            }

            /* renamed from: a */
            public final Float mo42214q() {
                return Float.valueOf(Drawer.m27055d(this.f12645w, this.f12646x, ((Number) this.f12647y.m27025d().getValue()).floatValue()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$d */
        /* loaded from: classes.dex */
        public static final class C4636d extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ C4652t f12648w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4636d(C4652t c4652t) {
                super(1);
                this.f12648w = c4652t;
            }

            /* renamed from: a */
            public final long m27044a(Density density) {
                int m19530c;
                Intrinsics.isThisObjectNull(density, "$this$offset");
                m19530c = C7037c.m19530c(((Number) this.f12648w.m27025d().getValue()).floatValue());
                return C13614l.m833a(m19530c, 0);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                return C13612k.m845b(m27044a((Density) obj));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$e */
        /* loaded from: classes.dex */
        public static final class C4637e extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ String f12649w;

            /* renamed from: x */
            final /* synthetic */ C4652t f12650x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC10524i0 f12651y;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Drawer.kt */
            /* renamed from: d0.s$a$e$a */
            /* loaded from: classes.dex */
            public static final class C4638a extends AbstractC6438m implements InterfaceC6097a {

                /* renamed from: w */
                final /* synthetic */ C4652t f12652w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC10524i0 f12653x;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Drawer.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", m20196f = "Drawer.kt", m20195l = {450}, m20194m = "invokeSuspend")
                /* renamed from: d0.s$a$e$a$a */
                /* loaded from: classes.dex */
                public static final class C4639a extends AbstractC6764l implements InterfaceC6112p {

                    /* renamed from: x */
                    int f12654x;

                    /* renamed from: y */
                    final /* synthetic */ C4652t f12655y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C4639a(C4652t c4652t, InterfaceC1886d interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f12655y = c4652t;
                    }

                    public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                        return new C4639a(this.f12655y, interfaceC1886d);
                    }

                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                        return ((C4639a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f12654x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            C4652t c4652t = this.f12655y;
                            this.f12654x = 1;
                            if (c4652t.m27027b(this) == m34636d) {
                                return m34636d;
                            }
                        } else if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            C13186n.m1453b(obj);
                        }
                        return C13195u.f34156a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C4638a(C4652t c4652t, InterfaceC10524i0 interfaceC10524i0) {
                    super(0);
                    this.f12652w = c4652t;
                    this.f12653x = interfaceC10524i0;
                }

                /* renamed from: a */
                public final Boolean mo42214q() {
                    if (((Boolean) this.f12652w.m27024e().m27218n().mo9587d(EnumC4657u.Closed)).booleanValue()) {
                        C6772d.m20158d(this.f12653x, null, null, new C4639a(this.f12652w, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4637e(String str, C4652t c4652t, InterfaceC10524i0 interfaceC10524i0) {
                super(1);
                this.f12649w = str;
                this.f12650x = c4652t;
                this.f12651y = interfaceC10524i0;
            }

            /* renamed from: a */
            public final void m27043a(InterfaceC7621v interfaceC7621v) {
                Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
                C7617t.m17918t(interfaceC7621v, this.f12649w);
                if (this.f12650x.m27023f()) {
                    C7617t.m17934d(interfaceC7621v, null, new C4638a(this.f12650x, this.f12651y), 1, null);
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m27043a((InterfaceC7621v) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$a$f */
        /* loaded from: classes.dex */
        public static final class C4640f extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6113q f12656w;

            /* renamed from: x */
            final /* synthetic */ int f12657x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4640f(InterfaceC6113q interfaceC6113q, int i) {
                super(2);
                this.f12656w = interfaceC6113q;
                this.f12657x = i;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m27040a((InterfaceC5179i) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m27040a(InterfaceC5179i interfaceC5179i, int i) {
                if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                InterfaceC9570f m5098k = Size.m5098k(InterfaceC9570f.f25164r, 0.0f, 1, null);
                InterfaceC6113q interfaceC6113q = this.f12656w;
                int i2 = ((this.f12657x << 9) & 7168) | 6;
                interfaceC5179i.mo25263g(-1113030915);
                int i3 = i2 >> 3;
                InterfaceC5804s m5060a = Column.m5060a(Arrangement.f29297a.m5175d(), InterfaceC9560a.f25145a.m10591e(), interfaceC5179i, (i3 & 112) | (i3 & 14));
                interfaceC5179i.mo25263g(1376089394);
                Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
                InterfaceC6097a m21776a = c6227a.m21776a();
                InterfaceC6113q m23014a = Layout.m23014a(m5098k);
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
                C5262w1.m24854c(m24856a, m5060a, c6227a.m21773d());
                C5262w1.m24854c(m24856a, density, c6227a.m21775b());
                C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
                C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
                interfaceC5179i.mo25260j();
                m23014a.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, Integer.valueOf((i4 >> 3) & 112));
                interfaceC5179i.mo25263g(2058660585);
                interfaceC5179i.mo25263g(276693625);
                if (((((i4 >> 9) & 14) & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                } else {
                    interfaceC6113q.mo4533i(C11473l.f29399a, interfaceC5179i, Integer.valueOf(((i2 >> 6) & 112) | 6));
                }
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25281D();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4631a(C4652t c4652t, boolean z, int i, long j, InterfaceC11001b1 interfaceC11001b1, long j2, long j3, float f, InterfaceC6112p interfaceC6112p, InterfaceC10524i0 interfaceC10524i0, InterfaceC6113q interfaceC6113q) {
            super(3);
            this.f12635w = c4652t;
            this.f12636x = z;
            this.f12637y = i;
            this.f12638z = j;
            this.f12628A = interfaceC11001b1;
            this.f12629B = j2;
            this.f12630C = j3;
            this.f12631D = f;
            this.f12632E = interfaceC6112p;
            this.f12633F = interfaceC10524i0;
            this.f12634G = interfaceC6113q;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m27049a((InterfaceC11459h) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r39v0, types: [f0.i, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* renamed from: a */
        public final void m27049a(InterfaceC11459h interfaceC11459h, InterfaceC5179i interfaceC5179i, int i) {
            int i2;
            Map m331h;
            Intrinsics.isThisObjectNull(interfaceC11459h, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC5179i.mo25276I(interfaceC11459h) ? 4 : 2);
            } else {
                i2 = i;
            }
            if (((i2 & 91) ^ 18) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
                return;
            }
            long mo5073a = interfaceC11459h.mo5073a();
            if (C13599b.m920j(mo5073a)) {
                float f = -C13599b.m916n(mo5073a);
                m331h = C13769l0.m331h(C13191r.m1447a(Float.valueOf(f), EnumC4657u.Closed), C13191r.m1447a(Float.valueOf(0.0f), EnumC4657u.Open));
                boolean z = interfaceC5179i.mo25256n(CompositionLocals.m39705g()) == EnumC13618o.Rtl;
                InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
                InterfaceC9570f m27248g = C4541d1.m27248g(c9571a, this.f12635w.m27024e(), m331h, EnumC0627a.Horizontal, this.f12636x, z, null, C4632a.f12639w, null, Drawer.m27053f(), 32, null);
                C4652t c4652t = this.f12635w;
                int i3 = this.f12637y;
                long j = this.f12638z;
                InterfaceC11001b1 interfaceC11001b1 = this.f12628A;
                long j2 = this.f12629B;
                long j3 = this.f12630C;
                float f2 = this.f12631D;
                InterfaceC6112p interfaceC6112p = this.f12632E;
                boolean z2 = this.f12636x;
                InterfaceC10524i0 interfaceC10524i0 = this.f12633F;
                InterfaceC6113q interfaceC6113q = this.f12634G;
                interfaceC5179i.mo25263g(-1990474327);
                InterfaceC9560a.C9561a c9561a = InterfaceC9560a.f25145a;
                InterfaceC5804s m5118i = C11430e.m5118i(c9561a.m10589g(), false, interfaceC5179i, 0);
                interfaceC5179i.mo25263g(1376089394);
                Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
                InterfaceC6097a m21776a = c6227a.m21776a();
                InterfaceC6113q m23014a = Layout.m23014a(m27248g);
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
                interfaceC5179i.mo25263g(413823892);
                interfaceC5179i.mo25263g(-1990474327);
                InterfaceC5804s m5118i2 = C11430e.m5118i(c9561a.m10589g(), false, interfaceC5179i, 0);
                interfaceC5179i.mo25263g(1376089394);
                Density density2 = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o2 = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                InterfaceC6097a m21776a2 = c6227a.m21776a();
                InterfaceC6113q m23014a2 = Layout.m23014a(c9571a);
                if (!(interfaceC5179i.mo25278G() instanceof Applier)) {
                    C5175h.m25297c();
                }
                interfaceC5179i.mo25246x();
                if (interfaceC5179i.mo25254p()) {
                    interfaceC5179i.mo25270O(m21776a2);
                } else {
                    interfaceC5179i.mo25251s();
                }
                interfaceC5179i.mo25280E();
                InterfaceC5179i m24856a2 = C5262w1.m24856a(interfaceC5179i);
                C5262w1.m24854c(m24856a2, m5118i2, c6227a.m21773d());
                C5262w1.m24854c(m24856a2, density2, c6227a.m21775b());
                C5262w1.m24854c(m24856a2, enumC13618o2, c6227a.m21774c());
                C5262w1.m24854c(m24856a2, viewConfiguration2, c6227a.m21771f());
                interfaceC5179i.mo25260j();
                m23014a2.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, 0);
                interfaceC5179i.mo25263g(2058660585);
                interfaceC5179i.mo25263g(-1253629305);
                interfaceC5179i.mo25263g(392275659);
                interfaceC6112p.mo39856d(interfaceC5179i, Integer.valueOf((i3 >> 27) & 14));
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25281D();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                boolean m27023f = c4652t.m27023f();
                C4633b c4633b = new C4633b(z2, c4652t, interfaceC10524i0);
                Float valueOf = Float.valueOf(f);
                Float valueOf2 = Float.valueOf(0.0f);
                interfaceC5179i.mo25263g(-3686095);
                boolean mo25276I = interfaceC5179i.mo25276I(valueOf) | interfaceC5179i.mo25276I(valueOf2) | interfaceC5179i.mo25276I(c4652t);
                Object mo25262h = interfaceC5179i.mo25262h();
                if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                    mo25262h = new C4635c(f, 0.0f, c4652t);
                    interfaceC5179i.mo25247w(mo25262h);
                }
                interfaceC5179i.mo25282C();
                Drawer.m27056c(m27023f, c4633b, mo25262h, j, interfaceC5179i, (i3 >> 15) & 7168);
                String m27294a = C4526a1.m27294a(C4697z0.f12808a.m26940e(), interfaceC5179i, 6);
                Density density3 = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                InterfaceC9570f m5093p = Size.m5093p(c9571a, density3.m895i0(C13599b.m914p(mo5073a)), density3.m895i0(C13599b.m915o(mo5073a)), density3.m895i0(C13599b.m916n(mo5073a)), density3.m895i0(C13599b.m917m(mo5073a)));
                interfaceC5179i.mo25263g(-3686930);
                boolean mo25276I2 = interfaceC5179i.mo25276I(c4652t);
                Object mo25262h2 = interfaceC5179i.mo25262h();
                if (mo25276I2 || mo25262h2 == InterfaceC5179i.f14328a.m25243a()) {
                    mo25262h2 = new C4636d(c4652t);
                    interfaceC5179i.mo25247w(mo25262h2);
                }
                interfaceC5179i.mo25282C();
                int i4 = i3 >> 12;
                Surface.m27280b(C7600o.m18015b(Padding.m4976m(Offset.m5005a(m5093p, (InterfaceC6108l) mo25262h2), 0.0f, 0.0f, Drawer.m27052g(), 0.0f, 11, null), false, new C4637e(m27294a, c4652t, interfaceC10524i0), 1, null), interfaceC11001b1, j2, j3, null, f2, ComposableLambda.m19327b(interfaceC5179i, -819910972, true, new C4640f(interfaceC6113q, i3)), interfaceC5179i, 1572864 | ((i3 >> 9) & 112) | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25281D();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                return;
            }
            throw new IllegalStateException("Drawer shouldn't have infinite width");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$b */
    /* loaded from: classes.dex */
    public static final class C4641b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC11001b1 f12658A;

        /* renamed from: B */
        final /* synthetic */ float f12659B;

        /* renamed from: C */
        final /* synthetic */ long f12660C;

        /* renamed from: D */
        final /* synthetic */ long f12661D;

        /* renamed from: E */
        final /* synthetic */ long f12662E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6112p f12663F;

        /* renamed from: G */
        final /* synthetic */ int f12664G;

        /* renamed from: H */
        final /* synthetic */ int f12665H;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6113q f12666w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f12667x;

        /* renamed from: y */
        final /* synthetic */ C4652t f12668y;

        /* renamed from: z */
        final /* synthetic */ boolean f12669z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4641b(InterfaceC6113q interfaceC6113q, InterfaceC9570f interfaceC9570f, C4652t c4652t, boolean z, InterfaceC11001b1 interfaceC11001b1, float f, long j, long j2, long j3, InterfaceC6112p interfaceC6112p, int i, int i2) {
            super(2);
            this.f12666w = interfaceC6113q;
            this.f12667x = interfaceC9570f;
            this.f12668y = c4652t;
            this.f12669z = z;
            this.f12658A = interfaceC11001b1;
            this.f12659B = f;
            this.f12660C = j;
            this.f12661D = j2;
            this.f12662E = j3;
            this.f12663F = interfaceC6112p;
            this.f12664G = i;
            this.f12665H = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27039a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27039a(InterfaceC5179i interfaceC5179i, int i) {
            Drawer.m27058a(this.f12666w, this.f12667x, this.f12668y, this.f12669z, this.f12658A, this.f12659B, this.f12660C, this.f12661D, this.f12662E, this.f12663F, interfaceC5179i, this.f12664G | 1, this.f12665H);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$c */
    /* loaded from: classes.dex */
    public static final class C4642c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ long f12670w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6097a f12671x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4642c(long j, InterfaceC6097a interfaceC6097a) {
            super(1);
            this.f12670w = j;
            this.f12671x = interfaceC6097a;
        }

        /* renamed from: a */
        public final void m27038a(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "$this$Canvas");
            DrawScope.C12241b.m3255e(drawScope, this.f12670w, 0L, 0L, ((Number) this.f12671x.mo42214q()).floatValue(), null, null, 0, C4906j.f13380A0, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27038a((DrawScope) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$d */
    /* loaded from: classes.dex */
    public static final class C4643d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f12672A;

        /* renamed from: w */
        final /* synthetic */ boolean f12673w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6097a f12674x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6097a f12675y;

        /* renamed from: z */
        final /* synthetic */ long f12676z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4643d(boolean z, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, long j, int i) {
            super(2);
            this.f12673w = z;
            this.f12674x = interfaceC6097a;
            this.f12675y = interfaceC6097a2;
            this.f12676z = j;
            this.f12672A = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m27037a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m27037a(InterfaceC5179i interfaceC5179i, int i) {
            Drawer.m27056c(this.f12673w, this.f12674x, this.f12675y, this.f12676z, interfaceC5179i, this.f12672A | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", m20196f = "Drawer.kt", m20195l = {664}, m20194m = "invokeSuspend")
    /* renamed from: d0.s$e */
    /* loaded from: classes.dex */
    public static final class C4644e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f12677x;

        /* renamed from: y */
        private /* synthetic */ Object f12678y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6097a f12679z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$e$a */
        /* loaded from: classes.dex */
        public static final class C4645a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6097a f12680w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4645a(InterfaceC6097a interfaceC6097a) {
                super(1);
                this.f12680w = interfaceC6097a;
            }

            /* renamed from: a */
            public final void m27035a(long j) {
                this.f12680w.mo42214q();
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m27035a(((C10774f) obj).m7137s());
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4644e(InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f12679z = interfaceC6097a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C4644e c4644e = new C4644e(this.f12679z, interfaceC1886d);
            c4644e.f12678y = obj;
            return c4644e;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C4644e) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f12677x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC5276c0 interfaceC5276c0 = (InterfaceC5276c0) this.f12678y;
                C4645a c4645a = new C4645a(this.f12679z);
                this.f12677x = 1;
                if (C10695i0.m7300k(interfaceC5276c0, null, null, null, c4645a, this, 7, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$f */
    /* loaded from: classes.dex */
    public static final class C4646f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f12681w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6097a f12682x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Drawer.kt */
        /* renamed from: d0.s$f$a */
        /* loaded from: classes.dex */
        public static final class C4647a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6097a f12683w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4647a(InterfaceC6097a interfaceC6097a) {
                super(0);
                this.f12683w = interfaceC6097a;
            }

            /* renamed from: a */
            public final Boolean mo42214q() {
                this.f12683w.mo42214q();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4646f(String str, InterfaceC6097a interfaceC6097a) {
            super(1);
            this.f12681w = str;
            this.f12682x = interfaceC6097a;
        }

        /* renamed from: a */
        public final void m27034a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7617t.m17922p(interfaceC7621v, this.f12681w);
            C7617t.m17929i(interfaceC7621v, null, new C4647a(this.f12682x), 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m27034a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$g */
    /* loaded from: classes.dex */
    public static final class C4648g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C4648g f12684w = new C4648g();

        C4648g() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(EnumC4657u enumC4657u) {
            Intrinsics.isThisObjectNull(enumC4657u, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Drawer.kt */
    /* renamed from: d0.s$h */
    /* loaded from: classes.dex */
    public static final class C4649h extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ EnumC4657u f12685w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f12686x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4649h(EnumC4657u enumC4657u, InterfaceC6108l interfaceC6108l) {
            super(0);
            this.f12685w = enumC4657u;
            this.f12686x = interfaceC6108l;
        }

        /* renamed from: a */
        public final C4652t mo42214q() {
            return new C4652t(this.f12685w, this.f12686x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m27058a(id.InterfaceC6113q r33, p302q0.InterfaceC9570f r34, p051d0.C4652t r35, boolean r36, p393v0.InterfaceC11001b1 r37, float r38, long r39, long r41, long r43, id.InterfaceC6112p r45, p092f0.InterfaceC5179i r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p051d0.Drawer.m27058a(id.q, q0.f, d0.t, boolean, v0.b1, float, long, long, long, id.p, f0.i, int, int):void");
    }

    /* renamed from: b */
    private static final void m27057b(boolean z, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, long j, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        InterfaceC9570f interfaceC9570f;
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(1010553887);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25266d(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6097a) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC6097a2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= mo25249u.mo25258l(j) ? 2048 : 1024;
        }
        if (((i2 & 5851) ^ 1170) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            String m27294a = C4526a1.m27294a(C4697z0.f12808a.m26944a(), mo25249u, 6);
            mo25249u.mo25263g(1010554067);
            if (z) {
                InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
                mo25249u.mo25263g(-3686930);
                boolean mo25276I = mo25249u.mo25276I(interfaceC6097a);
                Object mo25262h = mo25249u.mo25262h();
                if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                    mo25262h = new C4644e(interfaceC6097a, null);
                    mo25249u.mo25247w(mo25262h);
                }
                mo25249u.mo25282C();
                InterfaceC9570f m24739b = C5293i0.m24739b(c9571a, interfaceC6097a, (InterfaceC6112p) mo25262h);
                mo25249u.mo25263g(-3686552);
                boolean mo25276I2 = mo25249u.mo25276I(m27294a) | mo25249u.mo25276I(interfaceC6097a);
                Object mo25262h2 = mo25249u.mo25262h();
                if (mo25276I2 || mo25262h2 == InterfaceC5179i.f14328a.m25243a()) {
                    mo25262h2 = new C4646f(m27294a, interfaceC6097a);
                    mo25249u.mo25247w(mo25262h2);
                }
                mo25249u.mo25282C();
                interfaceC9570f = C7600o.m18016a(m24739b, true, (InterfaceC6108l) mo25262h2);
            } else {
                interfaceC9570f = InterfaceC9570f.f25164r;
            }
            mo25249u.mo25282C();
            InterfaceC9570f mo7205u = Size.m5098k(InterfaceC9570f.f25164r, 0.0f, 1, null).mo7205u(interfaceC9570f);
            Color m6652h = Color.m6652h(j);
            mo25249u.mo25263g(-3686552);
            boolean mo25276I3 = mo25249u.mo25276I(m6652h) | mo25249u.mo25276I(interfaceC6097a2);
            Object mo25262h3 = mo25249u.mo25262h();
            if (mo25276I3 || mo25262h3 == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h3 = new C4642c(j, interfaceC6097a2);
                mo25249u.mo25247w(mo25262h3);
            }
            mo25249u.mo25282C();
            Canvas.m8380a(mo7205u, (InterfaceC6108l) mo25262h3, mo25249u, 0);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C4643d(z, interfaceC6097a, interfaceC6097a2, j, i));
    }

    /* renamed from: c */
    public static final /* synthetic */ void m27056c(boolean z, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, long j, InterfaceC5179i interfaceC5179i, int i) {
        m27057b(z, interfaceC6097a, interfaceC6097a2, j, interfaceC5179i, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ float m27055d(float f, float f2, float f3) {
        return m27051h(f, f2, f3);
    }

    /* renamed from: e */
    public static final /* synthetic */ C9978p0 m27054e() {
        return f12627c;
    }

    /* renamed from: f */
    public static final /* synthetic */ float m27053f() {
        return f12626b;
    }

    /* renamed from: g */
    public static final /* synthetic */ float m27052g() {
        return f12625a;
    }

    /* renamed from: h */
    private static final float m27051h(float f, float f2, float f3) {
        float m14997l;
        m14997l = _Ranges.m14997l((f3 - f) / (f2 - f), 0.0f, 1.0f);
        return m14997l;
    }

    /* renamed from: i */
    public static final C4652t m27050i(EnumC4657u enumC4657u, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i, int i2) {
        Intrinsics.isThisObjectNull(enumC4657u, "initialValue");
        interfaceC5179i.mo25263g(-1540949526);
        if ((i2 & 2) != 0) {
            interfaceC6108l = C4648g.f12684w;
        }
        C4652t c4652t = (C4652t) RememberSaveable.m18151b(new Object[0], C4652t.f12689b.m27022a(interfaceC6108l), null, new C4649h(enumC4657u, interfaceC6108l), interfaceC5179i, 72, 4);
        interfaceC5179i.mo25282C();
        return c4652t;
    }
}
