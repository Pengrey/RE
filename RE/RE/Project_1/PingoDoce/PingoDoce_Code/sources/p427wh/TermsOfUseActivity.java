package p427wh;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import androidx.compose.foundation.lazy.InterfaceC0632c;
import androidx.compose.foundation.lazy.InterfaceC0635f;
import androidx.compose.foundation.lazy.LazyDsl;
import androidx.compose.p018ui.platform.CompositionLocals;
import androidx.compose.p018ui.platform.ViewConfiguration;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC6785c;
import p051d0.AppBar;
import p051d0.C4613o0;
import p051d0.C4627q;
import p051d0.IconButton;
import p051d0.Text;
import p070e.C4906j;
import p092f0.Applier;
import p092f0.C5175h;
import p092f0.C5209j1;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.InterfaceC5804s;
import p127h1.Layout;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p230m1.C7097c;
import p230m1.C7098d;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p357t.C10255b;
import p357t.Clickable;
import p357t.Image;
import p359t1.FontWeight;
import p393v0.Color;
import p410w.Arrangement;
import p410w.C11438e0;
import p410w.C11473l;
import p410w.Column;
import p410w.InterfaceC11428d0;
import p410w.InterfaceC11498x;
import p410w.Padding;
import p410w.Row;
import p410w.Size;
import p468yc.C13195u;
import p479z1.C13605g;
import p479z1.C13621q;
import p479z1.Density;
import p479z1.EnumC13618o;
import p489zc.C13780s;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* renamed from: wh.b */
/* loaded from: classes2.dex */
public final class TermsOfUseActivity {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.b$a */
    /* loaded from: classes2.dex */
    public static final class C12144a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ List f32072w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f32073x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TermsOfUseActivity.kt */
        /* renamed from: wh.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C12145a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6108l f32074w;

            /* renamed from: x */
            final /* synthetic */ Consent f32075x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12145a(InterfaceC6108l interfaceC6108l, Consent consent) {
                super(0);
                this.f32074w = interfaceC6108l;
                this.f32075x = consent;
            }

            /* renamed from: a */
            public final void m3548a() {
                this.f32074w.mo9587d(this.f32075x);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m3548a();
                return C13195u.f34156a;
            }
        }

        /* compiled from: LazyDsl.kt */
        /* renamed from: wh.b$a$b */
        /* loaded from: classes2.dex */
        public static final class C12146b extends AbstractC6438m implements InterfaceC6114r {

            /* renamed from: w */
            final /* synthetic */ List f32076w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6108l f32077x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12146b(List list, InterfaceC6108l interfaceC6108l) {
                super(4);
                this.f32076w = list;
                this.f32077x = interfaceC6108l;
            }

            /* renamed from: a */
            public final void m3547a(InterfaceC0632c interfaceC0632c, int i, InterfaceC5179i interfaceC5179i, int i2) {
                int i3;
                Intrinsics.isThisObjectNull(interfaceC0632c, "$this$items");
                if ((i2 & 14) == 0) {
                    i3 = i2 | (interfaceC5179i.mo25276I(interfaceC0632c) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= interfaceC5179i.mo25259k(i) ? 32 : 16;
                }
                if (((i3 & 731) ^ 146) == 0 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                int i4 = i3 & 14;
                Consent consent = (Consent) this.f32076w.get(i);
                if ((i4 & 112) == 0) {
                    i4 |= interfaceC5179i.mo25276I(consent) ? 32 : 16;
                }
                if ((i4 & 721) == 144 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
                InterfaceC9570f m4976m = Padding.m4976m(Clickable.m8374e(c9571a, false, null, null, new C12145a(this.f32077x, consent), 7, null), C13605g.m875g(15), 0.0f, 0.0f, 0.0f, 14, null);
                interfaceC5179i.mo25263g(-1113030915);
                Arrangement arrangement = Arrangement.f29297a;
                Arrangement.InterfaceC11424k m5175d = arrangement.m5175d();
                InterfaceC9560a.C9561a c9561a = InterfaceC9560a.f25145a;
                InterfaceC5804s m5060a = Column.m5060a(m5175d, c9561a.m10591e(), interfaceC5179i, 0);
                interfaceC5179i.mo25263g(1376089394);
                Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                ComposeUiNode.C6227a c6227a = ComposeUiNode.f17063o;
                InterfaceC6097a m21776a = c6227a.m21776a();
                InterfaceC6113q m23014a = Layout.m23014a(m4976m);
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
                m23014a.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, 0);
                interfaceC5179i.mo25263g(2058660585);
                interfaceC5179i.mo25263g(276693625);
                C11473l c11473l = C11473l.f29399a;
                InterfaceC9570f m4976m2 = Padding.m4976m(Size.m5095n(Size.m5096m(c9571a, 0.0f, 1, null), C13605g.m875g(50)), 0.0f, 0.0f, C13605g.m875g(10), 0.0f, 11, null);
                InterfaceC9560a.InterfaceC9563c m10593c = c9561a.m10593c();
                interfaceC5179i.mo25263g(-1989997165);
                InterfaceC5804s m5141b = Row.m5141b(arrangement.m5176c(), m10593c, interfaceC5179i, 48);
                interfaceC5179i.mo25263g(1376089394);
                Density density2 = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
                EnumC13618o enumC13618o2 = (EnumC13618o) interfaceC5179i.mo25256n(CompositionLocals.m39705g());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) interfaceC5179i.mo25256n(CompositionLocals.m39703i());
                InterfaceC6097a m21776a2 = c6227a.m21776a();
                InterfaceC6113q m23014a2 = Layout.m23014a(m4976m2);
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
                C5262w1.m24854c(m24856a2, m5141b, c6227a.m21773d());
                C5262w1.m24854c(m24856a2, density2, c6227a.m21775b());
                C5262w1.m24854c(m24856a2, enumC13618o2, c6227a.m21774c());
                C5262w1.m24854c(m24856a2, viewConfiguration2, c6227a.m21771f());
                interfaceC5179i.mo25260j();
                m23014a2.mo4533i(Composer.m25517a(Composer.m25516b(interfaceC5179i)), interfaceC5179i, 0);
                interfaceC5179i.mo25263g(2058660585);
                interfaceC5179i.mo25263g(-326682362);
                Text.m27187b(consent.m13865c(), InterfaceC11428d0.C11429a.m5127a(C11438e0.f29332a, c9571a, 0.9f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5179i, 0, 0, 65532);
                Image.m8309a(C7097c.m19308c(C2336R.C2337drawable.ic_arrow_right, interfaceC5179i, 0), null, null, null, null, 0.0f, null, interfaceC5179i, 56, C4906j.f13410G0);
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25281D();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                C4627q.m27066a(Size.m5096m(c9571a, 0.0f, 1, null), Color.f28297b.m6635c(), 0.0f, 0.0f, interfaceC5179i, 54, 12);
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25281D();
                interfaceC5179i.mo25282C();
                interfaceC5179i.mo25282C();
            }

            /* renamed from: a0 */
            public /* bridge */ /* synthetic */ Object mo22157a0(Object obj, Object obj2, Object obj3, Object obj4) {
                m3547a((InterfaceC0632c) obj, ((Number) obj2).intValue(), (InterfaceC5179i) obj3, ((Number) obj4).intValue());
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12144a(List list, InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f32072w = list;
            this.f32073x = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m3549a(InterfaceC0635f interfaceC0635f) {
            Intrinsics.isThisObjectNull(interfaceC0635f, "$this$LazyColumn");
            List list = this.f32072w;
            interfaceC0635f.mo40033a(list.size(), null, ComposableLambda.m19326c(-985537722, true, new C12146b(list, this.f32073x)));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3549a((InterfaceC0635f) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.b$b */
    /* loaded from: classes2.dex */
    public static final class C12147b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ List f32078w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f32079x;

        /* renamed from: y */
        final /* synthetic */ int f32080y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12147b(List list, InterfaceC6108l interfaceC6108l, int i) {
            super(2);
            this.f32078w = list;
            this.f32079x = interfaceC6108l;
            this.f32080y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m3544a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3544a(InterfaceC5179i interfaceC5179i, int i) {
            TermsOfUseActivity.m3552c(this.f32078w, this.f32079x, interfaceC5179i, this.f32080y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.b$c */
    /* loaded from: classes2.dex */
    public static final class C12148c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f32081w;

        /* renamed from: x */
        final /* synthetic */ int f32082x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TermsOfUseActivity.kt */
        /* renamed from: wh.b$c$a */
        /* loaded from: classes2.dex */
        public static final class C12149a extends AbstractC6438m implements InterfaceC6113q {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6097a f32083w;

            /* renamed from: x */
            final /* synthetic */ int f32084x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12149a(InterfaceC6097a interfaceC6097a, int i) {
                super(3);
                this.f32083w = interfaceC6097a;
                this.f32084x = i;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                m3540a((InterfaceC11428d0) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m3540a(InterfaceC11428d0 interfaceC11428d0, InterfaceC5179i interfaceC5179i, int i) {
                Intrinsics.isThisObjectNull(interfaceC11428d0, "$this$TopAppBar");
                if ((i & 81) == 16 && interfaceC5179i.mo25245y()) {
                    interfaceC5179i.mo25264f();
                    return;
                }
                IconButton.m27190a(this.f32083w, null, false, null, C12142a.f32069a.m3557a(), interfaceC5179i, ((this.f32084x >> 6) & 14) | 24576, 14);
                Text.m27187b(C7098d.m19306b(C2336R.string.lbl_settings_terms, interfaceC5179i, 0), null, Color.f28297b.m6637a(), C13621q.m803c(16), null, FontWeight.f26976x.m8105a(), null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5179i, 200064, 0, 65490);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12148c(InterfaceC6097a interfaceC6097a, int i) {
            super(2);
            this.f32081w = interfaceC6097a;
            this.f32082x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m3542a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3542a(InterfaceC5179i interfaceC5179i, int i) {
            if ((i & 11) == 2 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                AppBar.m27292b(null, Color.f28297b.m6631g(), 0L, 0.0f, null, ComposableLambda.m19327b(interfaceC5179i, 2108904846, true, new C12149a(this.f32081w, this.f32082x)), interfaceC5179i, 196656, 29);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.b$d */
    /* loaded from: classes2.dex */
    public static final class C12150d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ TermsOfUseViewModel f32085w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f32086x;

        /* renamed from: y */
        final /* synthetic */ int f32087y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12150d(TermsOfUseViewModel termsOfUseViewModel, InterfaceC6108l interfaceC6108l, int i) {
            super(3);
            this.f32085w = termsOfUseViewModel;
            this.f32086x = interfaceC6108l;
            this.f32087y = i;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m3538a((InterfaceC11498x) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3538a(InterfaceC11498x interfaceC11498x, InterfaceC5179i interfaceC5179i, int i) {
            List m197g;
            Intrinsics.isThisObjectNull(interfaceC11498x, "it");
            if ((i & 81) == 16 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
                return;
            }
            InterfaceC6785c m3534L = this.f32085w.m3534L();
            m197g = C13780s.m197g();
            TermsOfUseActivity.m3552c((List) C5209j1.m25077a(m3534L, m197g, null, interfaceC5179i, 8, 2).getValue(), this.f32086x, interfaceC5179i, (this.f32087y & 112) | 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TermsOfUseActivity.kt */
    /* renamed from: wh.b$e */
    /* loaded from: classes2.dex */
    public static final class C12151e extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ TermsOfUseViewModel f32088w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f32089x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6097a f32090y;

        /* renamed from: z */
        final /* synthetic */ int f32091z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12151e(TermsOfUseViewModel termsOfUseViewModel, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a, int i) {
            super(2);
            this.f32088w = termsOfUseViewModel;
            this.f32089x = interfaceC6108l;
            this.f32090y = interfaceC6097a;
            this.f32091z = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m3536a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3536a(InterfaceC5179i interfaceC5179i, int i) {
            TermsOfUseActivity.m3551d(this.f32088w, this.f32089x, this.f32090y, interfaceC5179i, this.f32091z | 1);
        }
    }

    /* renamed from: a */
    private static final void m3554a(List list, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-1043491003);
        LazyDsl.m40037a(C10255b.m8382b(Size.m5098k(InterfaceC9570f.f25164r, 0.0f, 1, null), Color.f28297b.m6631g(), null, 2, null), null, null, false, null, null, null, new C12144a(list, interfaceC6108l), mo25249u, 0, C4906j.f13420I0);
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C12147b(list, interfaceC6108l, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m3553b(TermsOfUseViewModel termsOfUseViewModel, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-839938598);
        C4613o0.m27083a(null, null, ComposableLambda.m19327b(mo25249u, 1193656159, true, new C12148c(interfaceC6097a, i)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambda.m19327b(mo25249u, 658010904, true, new C12150d(termsOfUseViewModel, interfaceC6108l, i)), mo25249u, 384, 12582912, 131067);
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C12151e(termsOfUseViewModel, interfaceC6108l, interfaceC6097a, i));
    }

    /* renamed from: c */
    public static final /* synthetic */ void m3552c(List list, InterfaceC6108l interfaceC6108l, InterfaceC5179i interfaceC5179i, int i) {
        m3554a(list, interfaceC6108l, interfaceC5179i, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ void m3551d(TermsOfUseViewModel termsOfUseViewModel, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a, InterfaceC5179i interfaceC5179i, int i) {
        m3553b(termsOfUseViewModel, interfaceC6108l, interfaceC6097a, interfaceC5179i, i);
    }

    /* renamed from: e */
    public static final void m3550e(ActivityC0325c activityC0325c) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.settings.termsOfUse.TermsOfUseActivity.class));
    }
}
