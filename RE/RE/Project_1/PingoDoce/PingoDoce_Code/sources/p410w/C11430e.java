package p410w;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.Layout;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.C6447w;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;

/* compiled from: Box.kt */
/* renamed from: w.e */
/* loaded from: classes.dex */
public final class C11430e {

    /* renamed from: a */
    private static final InterfaceC5804s f29311a = m5123d(InterfaceC9560a.f25145a.m10589g(), false);

    /* renamed from: b */
    private static final InterfaceC5804s f29312b = C11432b.f29315a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    /* renamed from: w.e$a */
    /* loaded from: classes.dex */
    public static final class C11431a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f29313w;

        /* renamed from: x */
        final /* synthetic */ int f29314x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11431a(InterfaceC9570f interfaceC9570f, int i) {
            super(2);
            this.f29313w = interfaceC9570f;
            this.f29314x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m5117a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5117a(InterfaceC5179i interfaceC5179i, int i) {
            C11430e.m5126a(this.f29313w, interfaceC5179i, this.f29314x | 1);
        }
    }

    /* compiled from: Box.kt */
    /* renamed from: w.e$b */
    /* loaded from: classes.dex */
    static final class C11432b implements InterfaceC5804s {

        /* renamed from: a */
        public static final C11432b f29315a = new C11432b();

        /* compiled from: Box.kt */
        /* renamed from: w.e$b$a */
        /* loaded from: classes.dex */
        static final class C11433a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            public static final C11433a f29316w = new C11433a();

            C11433a() {
                super(1);
            }

            /* renamed from: a */
            public final void m5115a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5115a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C11432b() {
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            Intrinsics.isThisObjectNull(measureScope, "$this$MeasurePolicy");
            Intrinsics.isThisObjectNull(list, "$noName_0");
            return MeasureScope.C5806a.m22999b(measureScope, C13599b.m914p(j), C13599b.m915o(j), null, C11433a.f29316w, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    /* renamed from: w.e$c */
    /* loaded from: classes.dex */
    public static final class C11434c implements InterfaceC5804s {

        /* renamed from: a */
        final /* synthetic */ boolean f29317a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9560a f29318b;

        /* compiled from: Box.kt */
        /* renamed from: w.e$c$a */
        /* loaded from: classes.dex */
        static final class C11435a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            public static final C11435a f29319w = new C11435a();

            C11435a() {
                super(1);
            }

            /* renamed from: a */
            public final void m5113a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5113a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        /* compiled from: Box.kt */
        /* renamed from: w.e$c$b */
        /* loaded from: classes.dex */
        static final class C11436b extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ int f29320A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC9560a f29321B;

            /* renamed from: w */
            final /* synthetic */ Placeable f29322w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC5803r f29323x;

            /* renamed from: y */
            final /* synthetic */ MeasureScope f29324y;

            /* renamed from: z */
            final /* synthetic */ int f29325z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11436b(Placeable placeable, InterfaceC5803r interfaceC5803r, MeasureScope measureScope, int i, int i2, InterfaceC9560a interfaceC9560a) {
                super(1);
                this.f29322w = placeable;
                this.f29323x = interfaceC5803r;
                this.f29324y = measureScope;
                this.f29325z = i;
                this.f29320A = i2;
                this.f29321B = interfaceC9560a;
            }

            /* renamed from: a */
            public final void m5112a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                C11430e.m5124c(abstractC5751a, this.f29322w, this.f29323x, this.f29324y.getLayoutDirection(), this.f29325z, this.f29320A, this.f29321B);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5112a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        /* compiled from: Box.kt */
        /* renamed from: w.e$c$c */
        /* loaded from: classes.dex */
        static final class C11437c extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ C6447w f29326A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC9560a f29327B;

            /* renamed from: w */
            final /* synthetic */ Placeable[] f29328w;

            /* renamed from: x */
            final /* synthetic */ List f29329x;

            /* renamed from: y */
            final /* synthetic */ MeasureScope f29330y;

            /* renamed from: z */
            final /* synthetic */ C6447w f29331z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11437c(Placeable[] placeableArr, List list, MeasureScope measureScope, C6447w c6447w, C6447w c6447w2, InterfaceC9560a interfaceC9560a) {
                super(1);
                this.f29328w = placeableArr;
                this.f29329x = list;
                this.f29330y = measureScope;
                this.f29331z = c6447w;
                this.f29326A = c6447w2;
                this.f29327B = interfaceC9560a;
            }

            /* renamed from: a */
            public final void m5111a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                Placeable[] placeableArr = this.f29328w;
                List list = this.f29329x;
                MeasureScope measureScope = this.f29330y;
                C6447w c6447w = this.f29331z;
                C6447w c6447w2 = this.f29326A;
                InterfaceC9560a interfaceC9560a = this.f29327B;
                int length = placeableArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    Placeable placeable = placeableArr[i];
                    Objects.requireNonNull(placeable, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    C11430e.m5124c(abstractC5751a, placeable, (InterfaceC5803r) list.get(i2), measureScope.getLayoutDirection(), c6447w.f17531w, c6447w2.f17531w, interfaceC9560a);
                    i++;
                    i2++;
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5111a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C11434c(boolean z, InterfaceC9560a interfaceC9560a) {
            this.f29317a = z;
            this.f29318b = interfaceC9560a;
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            int m914p;
            Placeable mo23007n;
            int i;
            Intrinsics.isThisObjectNull(measureScope, "$this$MeasurePolicy");
            Intrinsics.isThisObjectNull(list, "measurables");
            if (list.isEmpty()) {
                return MeasureScope.C5806a.m22999b(measureScope, C13599b.m914p(j), C13599b.m915o(j), null, C11435a.f29319w, 4, null);
            }
            long m925e = this.f29317a ? j : C13599b.m925e(j, 0, 0, 0, 0, 10, null);
            int i2 = 0;
            if (list.size() == 1) {
                InterfaceC5803r interfaceC5803r = (InterfaceC5803r) list.get(0);
                if (!C11430e.m5125b(interfaceC5803r)) {
                    Placeable mo23007n2 = interfaceC5803r.mo23007n(m925e);
                    int max = Math.max(C13599b.m914p(j), mo23007n2.m23177q0());
                    i = Math.max(C13599b.m915o(j), mo23007n2.m23182l0());
                    mo23007n = mo23007n2;
                    m914p = max;
                } else {
                    m914p = C13599b.m914p(j);
                    int m915o = C13599b.m915o(j);
                    mo23007n = interfaceC5803r.mo23007n(C13599b.f34590b.m908c(C13599b.m914p(j), C13599b.m915o(j)));
                    i = m915o;
                }
                return MeasureScope.C5806a.m22999b(measureScope, m914p, i, null, new C11436b(mo23007n, interfaceC5803r, measureScope, m914p, i, this.f29318b), 4, null);
            }
            Placeable[] placeableArr = new Placeable[list.size()];
            C6447w c6447w = new C6447w();
            c6447w.f17531w = C13599b.m914p(j);
            C6447w c6447w2 = new C6447w();
            c6447w2.f17531w = C13599b.m915o(j);
            int size = list.size();
            int i3 = 0;
            boolean z = false;
            while (i3 < size) {
                int i4 = i3 + 1;
                InterfaceC5803r interfaceC5803r2 = (InterfaceC5803r) list.get(i3);
                if (C11430e.m5125b(interfaceC5803r2)) {
                    z = true;
                } else {
                    Placeable mo23007n3 = interfaceC5803r2.mo23007n(m925e);
                    placeableArr[i3] = mo23007n3;
                    c6447w.f17531w = Math.max(c6447w.f17531w, mo23007n3.m23177q0());
                    c6447w2.f17531w = Math.max(c6447w2.f17531w, mo23007n3.m23182l0());
                }
                i3 = i4;
            }
            if (z) {
                int i5 = c6447w.f17531w;
                int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
                int i7 = c6447w2.f17531w;
                long m907a = C13601c.m907a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
                int size2 = list.size();
                while (i2 < size2) {
                    int i8 = i2 + 1;
                    InterfaceC5803r interfaceC5803r3 = (InterfaceC5803r) list.get(i2);
                    if (C11430e.m5125b(interfaceC5803r3)) {
                        placeableArr[i2] = interfaceC5803r3.mo23007n(m907a);
                    }
                    i2 = i8;
                }
            }
            return MeasureScope.C5806a.m22999b(measureScope, c6447w.f17531w, c6447w2.f17531w, null, new C11437c(placeableArr, list, measureScope, c6447w, c6447w2, this.f29318b), 4, null);
        }
    }

    /* renamed from: a */
    public static final void m5126a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC9570f, "modifier");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-1990469439);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC9570f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 & 11) ^ 2) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            InterfaceC5804s interfaceC5804s = f29312b;
            mo25249u.mo25263g(1376089394);
            Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(interfaceC9570f);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(mo25249u.mo25278G() instanceof Applier)) {
                C5175h.m25297c();
            }
            mo25249u.mo25246x();
            if (mo25249u.mo25254p()) {
                mo25249u.mo25270O(m21776a);
            } else {
                mo25249u.mo25251s();
            }
            mo25249u.mo25280E();
            InterfaceC5179i m24856a = C5262w1.m24856a(mo25249u);
            C5262w1.m24854c(m24856a, interfaceC5804s, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, Integer.valueOf((i3 >> 3) & 112));
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(-1253624692);
            if (((((i3 >> 9) & 14) & 11) ^ 2) == 0 && mo25249u.mo25245y()) {
                mo25249u.mo25264f();
            }
            mo25249u.mo25282C();
            mo25249u.mo25282C();
            mo25249u.mo25281D();
            mo25249u.mo25282C();
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C11431a(interfaceC9570f, i));
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m5125b(InterfaceC5803r interfaceC5803r) {
        return m5120g(interfaceC5803r);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m5124c(Placeable.AbstractC5751a abstractC5751a, Placeable placeable, InterfaceC5803r interfaceC5803r, EnumC13618o enumC13618o, int i, int i2, InterfaceC9560a interfaceC9560a) {
        m5119h(abstractC5751a, placeable, interfaceC5803r, enumC13618o, i, i2, interfaceC9560a);
    }

    /* renamed from: d */
    public static final InterfaceC5804s m5123d(InterfaceC9560a interfaceC9560a, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9560a, "alignment");
        return new C11434c(z, interfaceC9560a);
    }

    /* renamed from: e */
    private static final Box m5122e(InterfaceC5803r interfaceC5803r) {
        Object mo23120x = interfaceC5803r.mo23120x();
        if (mo23120x instanceof Box) {
            return (Box) mo23120x;
        }
        return null;
    }

    /* renamed from: f */
    public static final InterfaceC5804s m5121f() {
        return f29311a;
    }

    /* renamed from: g */
    private static final boolean m5120g(InterfaceC5803r interfaceC5803r) {
        Box m5122e = m5122e(interfaceC5803r);
        if (m5122e == null) {
            return false;
        }
        return m5122e.m5133c();
    }

    /* renamed from: h */
    private static final void m5119h(Placeable.AbstractC5751a abstractC5751a, Placeable placeable, InterfaceC5803r interfaceC5803r, EnumC13618o enumC13618o, int i, int i2, InterfaceC9560a interfaceC9560a) {
        InterfaceC9560a m5134b;
        Box m5122e = m5122e(interfaceC5803r);
        Placeable.AbstractC5751a.m23161l(abstractC5751a, placeable, ((m5122e == null || (m5134b = m5122e.m5134b()) == null) ? interfaceC9560a : m5134b).mo10596a(C13617n.m819a(placeable.m23177q0(), placeable.m23182l0()), C13617n.m819a(i, i2), enumC13618o), 0.0f, 2, null);
    }

    /* renamed from: i */
    public static final InterfaceC5804s m5118i(InterfaceC9560a interfaceC9560a, boolean z, InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5804s m5123d;
        Intrinsics.isThisObjectNull(interfaceC9560a, "alignment");
        interfaceC5179i.mo25263g(2076429144);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(interfaceC9560a);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            if (Intrinsics.equals(interfaceC9560a, InterfaceC9560a.f25145a.m10589g()) && !z) {
                m5123d = m5121f();
            } else {
                m5123d = m5123d(interfaceC9560a, z);
            }
            mo25262h = m5123d;
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5804s interfaceC5804s = (InterfaceC5804s) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC5804s;
    }
}
