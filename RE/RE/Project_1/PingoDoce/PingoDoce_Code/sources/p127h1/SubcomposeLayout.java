package p127h1;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5262w1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5264x;
import p169j1.ComposeUiNode;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: h1.j0 */
/* loaded from: classes.dex */
public final class SubcomposeLayout {

    /* compiled from: Composables.kt */
    /* renamed from: h1.j0$a */
    /* loaded from: classes.dex */
    public static final class C5778a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f16082w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5778a(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f16082w = interfaceC6097a;
        }

        /* renamed from: q */
        public final Object mo42214q() {
            return this.f16082w.mo42214q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.j0$b */
    /* loaded from: classes.dex */
    public static final class C5779b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f16083w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f16084x;

        /* renamed from: y */
        final /* synthetic */ int f16085y;

        /* renamed from: z */
        final /* synthetic */ int f16086z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5779b(InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, int i, int i2) {
            super(2);
            this.f16083w = interfaceC9570f;
            this.f16084x = interfaceC6112p;
            this.f16085y = i;
            this.f16086z = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m23099a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m23099a(InterfaceC5179i interfaceC5179i, int i) {
            SubcomposeLayout.m23100b(this.f16083w, this.f16084x, interfaceC5179i, this.f16085y | 1, this.f16086z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.j0$c */
    /* loaded from: classes.dex */
    public static final class C5780c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C5784k0 f16087w;

        /* compiled from: Effects.kt */
        /* renamed from: h1.j0$c$a */
        /* loaded from: classes.dex */
        public static final class C5781a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ C5784k0 f16088a;

            public C5781a(C5784k0 c5784k0) {
                this.f16088a = c5784k0;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f16088a.m23060t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5780c(C5784k0 c5784k0) {
            super(1);
            this.f16087w = c5784k0;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            return new C5781a(this.f16087w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.j0$d */
    /* loaded from: classes.dex */
    public static final class C5782d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ C5784k0 f16089w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5782d(C5784k0 c5784k0) {
            super(0);
            this.f16089w = c5784k0;
        }

        /* renamed from: a */
        public final void m23096a() {
            this.f16089w.m23058v();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m23096a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* renamed from: h1.j0$e */
    /* loaded from: classes.dex */
    public static final class C5783e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f16090A;

        /* renamed from: w */
        final /* synthetic */ C5784k0 f16091w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC9570f f16092x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6112p f16093y;

        /* renamed from: z */
        final /* synthetic */ int f16094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5783e(C5784k0 c5784k0, InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, int i, int i2) {
            super(2);
            this.f16091w = c5784k0;
            this.f16092x = interfaceC9570f;
            this.f16093y = interfaceC6112p;
            this.f16094z = i;
            this.f16090A = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m23095a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m23095a(InterfaceC5179i interfaceC5179i, int i) {
            SubcomposeLayout.m23101a(this.f16091w, this.f16092x, this.f16093y, interfaceC5179i, this.f16094z | 1, this.f16090A);
        }
    }

    /* renamed from: a */
    public static final void m23101a(C5784k0 c5784k0, InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i, int i2) {
        Intrinsics.isThisObjectNull(c5784k0, "state");
        Intrinsics.isThisObjectNull(interfaceC6112p, "measurePolicy");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-607850265);
        if ((i2 & 2) != 0) {
            interfaceC9570f = InterfaceC9570f.f25164r;
        }
        InterfaceC9570f interfaceC9570f2 = interfaceC9570f;
        c5784k0.m23085E(C5175h.m25296d(mo25249u, 0));
        Effects.m25541a(c5784k0, new C5780c(c5784k0), mo25249u, 8);
        InterfaceC9570f m10580b = C9567e.m10580b(mo25249u, interfaceC9570f2);
        Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
        EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
        ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
        InterfaceC6097a m21488a = LayoutNode.f17161i0.m21488a();
        mo25249u.mo25263g(-2103250935);
        if (!(mo25249u.mo25278G() instanceof Applier)) {
            C5175h.m25297c();
        }
        mo25249u.mo25273L();
        if (mo25249u.mo25254p()) {
            mo25249u.mo25270O(new C5778a(m21488a));
        } else {
            mo25249u.mo25251s();
        }
        InterfaceC5179i m24856a = C5262w1.m24856a(mo25249u);
        C5262w1.m24855b(m24856a, c5784k0.m23054z());
        ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
        C5262w1.m24854c(m24856a, m10580b, c6227a.m21772e());
        C5262w1.m24854c(m24856a, interfaceC6112p, c5784k0.m23055y());
        C5262w1.m24854c(m24856a, density, c6227a.m21775b());
        C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
        C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
        mo25249u.mo25281D();
        mo25249u.mo25282C();
        if (!mo25249u.mo25245y()) {
            Effects.m25535g(new C5782d(c5784k0), mo25249u, 0);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C5783e(c5784k0, interfaceC9570f2, interfaceC6112p, i, i2));
    }

    /* renamed from: b */
    public static final void m23100b(InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, InterfaceC5179i interfaceC5179i, int i, int i2) {
        int i3;
        Intrinsics.isThisObjectNull(interfaceC6112p, "measurePolicy");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-607851684);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (mo25249u.mo25276I(interfaceC9570f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= mo25249u.mo25276I(interfaceC6112p) ? 32 : 16;
        }
        if (((i3 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            if (i4 != 0) {
                interfaceC9570f = InterfaceC9570f.f25164r;
            }
            mo25249u.mo25263g(-3687241);
            Object mo25262h = mo25249u.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C5784k0();
                mo25249u.mo25247w(mo25262h);
            }
            mo25249u.mo25282C();
            int i5 = i3 << 3;
            m23101a((C5784k0) mo25262h, interfaceC9570f, interfaceC6112p, mo25249u, (i5 & 112) | 8 | (i5 & 896), 0);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C5779b(interfaceC9570f, interfaceC6112p, i, i2));
    }
}
