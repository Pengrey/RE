package p410w;

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
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.Layout;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: w.i0 */
/* loaded from: classes.dex */
public final class Spacer {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Spacer.kt */
    /* renamed from: w.i0$a */
    /* loaded from: classes.dex */
    public static final class C11463a implements InterfaceC5804s {

        /* renamed from: a */
        public static final C11463a f29380a = new C11463a();

        /* compiled from: Spacer.kt */
        /* renamed from: w.i0$a$a */
        /* loaded from: classes.dex */
        static final class C11464a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            public static final C11464a f29381w = new C11464a();

            C11464a() {
                super(1);
            }

            /* renamed from: a */
            public final void m5062a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m5062a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C11463a() {
        }

        /* renamed from: a */
        public final InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            Intrinsics.isThisObjectNull(measureScope, "$this$Layout");
            Intrinsics.isThisObjectNull(list, "$noName_0");
            return MeasureScope.C5806a.m22999b(measureScope, C13599b.m918l(j) ? C13599b.m916n(j) : 0, C13599b.m919k(j) ? C13599b.m917m(j) : 0, null, C11464a.f29381w, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Spacer.kt */
    /* renamed from: w.i0$b */
    /* loaded from: classes.dex */
    public static final class C11465b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f29382w;

        /* renamed from: x */
        final /* synthetic */ int f29383x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11465b(InterfaceC9570f interfaceC9570f, int i) {
            super(2);
            this.f29382w = interfaceC9570f;
            this.f29383x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m5061a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m5061a(InterfaceC5179i interfaceC5179i, int i) {
            Spacer.m5064a(this.f29382w, interfaceC5179i, this.f29383x | 1);
        }
    }

    /* renamed from: a */
    public static final void m5064a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC9570f, "modifier");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(220050211);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC9570f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 & 11) ^ 2) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            C11463a c11463a = C11463a.f29380a;
            mo25249u.mo25263g(1376089394);
            Density density = (Density) mo25249u.mo25256n(CompositionLocals.m39708d());
            EnumC13618o enumC13618o = (EnumC13618o) mo25249u.mo25256n(CompositionLocals.m39705g());
            ViewConfiguration viewConfiguration = (ViewConfiguration) mo25249u.mo25256n(CompositionLocals.m39703i());
            ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
            InterfaceC6097a m21776a = c6227a.m21776a();
            InterfaceC6113q m23014a = Layout.m23014a(interfaceC9570f);
            int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
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
            C5262w1.m24854c(m24856a, c11463a, c6227a.m21773d());
            C5262w1.m24854c(m24856a, density, c6227a.m21775b());
            C5262w1.m24854c(m24856a, enumC13618o, c6227a.m21774c());
            C5262w1.m24854c(m24856a, viewConfiguration, c6227a.m21771f());
            mo25249u.mo25260j();
            m23014a.mo4533i(Composer.m25517a(Composer.m25516b(mo25249u)), mo25249u, Integer.valueOf((i3 >> 3) & 112));
            mo25249u.mo25263g(2058660585);
            mo25249u.mo25263g(348366449);
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
        mo25274K.mo25532a(new C11465b(interfaceC9570f, i));
    }
}
