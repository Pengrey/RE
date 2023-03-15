package p357t;

import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5753d;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.Layout;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7591h;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p346s0.C10031i;
import p346s0.Clip;
import p393v0.ColorFilter;
import p456y0.Painter;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: t.j */
/* loaded from: classes.dex */
public final class Image {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* renamed from: t.j$a */
    /* loaded from: classes.dex */
    public static final class C10303a implements InterfaceC5804s {

        /* renamed from: a */
        public static final C10303a f26859a = new C10303a();

        /* compiled from: Image.kt */
        /* renamed from: t.j$a$a */
        /* loaded from: classes.dex */
        static final class C10304a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            public static final C10304a f26860w = new C10304a();

            C10304a() {
                super(1);
            }

            /* renamed from: a */
            public final void m8307a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m8307a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C10303a() {
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            Intrinsics.isThisObjectNull(measureScope, "$this$Layout");
            Intrinsics.isThisObjectNull(list, "$noName_0");
            return MeasureScope.C5806a.m22999b(measureScope, C13599b.m914p(j), C13599b.m915o(j), null, C10304a.f26860w, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* renamed from: t.j$b */
    /* loaded from: classes.dex */
    public static final class C10305b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC5753d f26861A;

        /* renamed from: B */
        final /* synthetic */ float f26862B;

        /* renamed from: C */
        final /* synthetic */ ColorFilter f26863C;

        /* renamed from: D */
        final /* synthetic */ int f26864D;

        /* renamed from: E */
        final /* synthetic */ int f26865E;

        /* renamed from: w */
        final /* synthetic */ Painter f26866w;

        /* renamed from: x */
        final /* synthetic */ String f26867x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC9570f f26868y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC9560a f26869z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10305b(Painter painter, String str, InterfaceC9570f interfaceC9570f, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter, int i, int i2) {
            super(2);
            this.f26866w = painter;
            this.f26867x = str;
            this.f26868y = interfaceC9570f;
            this.f26869z = interfaceC9560a;
            this.f26861A = interfaceC5753d;
            this.f26862B = f;
            this.f26863C = colorFilter;
            this.f26864D = i;
            this.f26865E = i2;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m8306a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m8306a(InterfaceC5179i interfaceC5179i, int i) {
            Image.m8309a(this.f26866w, this.f26867x, this.f26868y, this.f26869z, this.f26861A, this.f26862B, this.f26863C, interfaceC5179i, this.f26864D | 1, this.f26865E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* renamed from: t.j$c */
    /* loaded from: classes.dex */
    public static final class C10306c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ String f26870w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10306c(String str) {
            super(1);
            this.f26870w = str;
        }

        /* renamed from: a */
        public final void m8305a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7617t.m17922p(interfaceC7621v, this.f26870w);
            C7617t.m17917u(interfaceC7621v, C7591h.f20087b.m18058c());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8305a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final void m8309a(Painter painter, String str, InterfaceC9570f interfaceC9570f, InterfaceC9560a interfaceC9560a, InterfaceC5753d interfaceC5753d, float f, ColorFilter colorFilter, InterfaceC5179i interfaceC5179i, int i, int i2) {
        InterfaceC9570f interfaceC9570f2;
        Intrinsics.isThisObjectNull(painter, "painter");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-816794549);
        InterfaceC9570f.C9571a c9571a = (i2 & 4) != 0 ? InterfaceC9570f.f25164r : interfaceC9570f;
        InterfaceC9560a m10595a = (i2 & 8) != 0 ? InterfaceC9560a.f25145a.m10595a() : interfaceC9560a;
        InterfaceC5753d m23144a = (i2 & 16) != 0 ? InterfaceC5753d.f16069a.m23144a() : interfaceC5753d;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        mo25249u.mo25263g(-816794258);
        if (str != null) {
            InterfaceC9570f.C9571a c9571a2 = InterfaceC9570f.f25164r;
            mo25249u.mo25263g(-3686930);
            boolean mo25276I = mo25249u.mo25276I(str);
            Object mo25262h = mo25249u.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C10306c(str);
                mo25249u.mo25247w(mo25262h);
            }
            mo25249u.mo25282C();
            interfaceC9570f2 = C7600o.m18015b(c9571a2, false, (InterfaceC6108l) mo25262h, 1, null);
        } else {
            interfaceC9570f2 = InterfaceC9570f.f25164r;
        }
        mo25249u.mo25282C();
        InterfaceC9570f m9355b = C10031i.m9355b(Clip.m9380b(c9571a.mo7205u(interfaceC9570f2)), painter, false, m10595a, m23144a, f2, colorFilter2, 2, null);
        C10303a c10303a = C10303a.f26859a;
        mo25249u.mo25263g(1376089394);
        Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
        EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
        ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
        ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
        InterfaceC6097a m21776a = c6227a.m21776a();
        InterfaceC6113q m23014a = Layout.m23014a(m9355b);
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
        C5262w1.m24854c(m24856a, c10303a, c6227a.m21773d());
        C5262w1.m24854c(m24856a, density, c6227a.m21775b());
        C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
        C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
        mo25249u.mo25260j();
        m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, 0);
        mo25249u.mo25263g(2058660585);
        mo25249u.mo25263g(-820198811);
        mo25249u.mo25282C();
        mo25249u.mo25282C();
        mo25249u.mo25281D();
        mo25249u.mo25282C();
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C10305b(painter, str, c9571a, m10595a, m23144a, f2, colorFilter2, i, i2));
    }
}
