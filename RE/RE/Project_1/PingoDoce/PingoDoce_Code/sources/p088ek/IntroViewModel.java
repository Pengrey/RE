package p088ek;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import lk.EnumC7070a;
import me.C7185b;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ConsentsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13878n1;
import p494zh.C13888p1;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* renamed from: ek.d */
/* loaded from: classes2.dex */
public final class IntroViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f14171C;

    /* renamed from: D */
    private final ConsentsManager f14172D;

    /* renamed from: E */
    private final InterfaceC6108l f14173E;

    /* renamed from: F */
    private C2381h f14174F;

    /* renamed from: G */
    private final Void f14175G;

    /* renamed from: H */
    private final C1436e0 f14176H;

    /* renamed from: I */
    private final C1436e0 f14177I;

    /* renamed from: J */
    private final LiveData f14178J;

    /* renamed from: K */
    private final LiveData f14179K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntroViewModel.kt */
    /* renamed from: ek.d$a */
    /* loaded from: classes2.dex */
    public static final class C5128a extends AbstractC6438m implements InterfaceC6108l {
        C5128a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25595a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (IntroViewModel.m25600v0(IntroViewModel.this)) {
                return;
            }
            BaseViewModel.m119C(IntroViewModel.this, C13888p1.f35009a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25595a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IntroViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.intro.IntroViewModel", m20196f = "IntroViewModel.kt", m20195l = {72}, m20194m = "onSubmit")
    /* renamed from: ek.d$b */
    /* loaded from: classes2.dex */
    public static final class C5129b extends AbstractC6757d {

        /* renamed from: w */
        Object f14181w;

        /* renamed from: x */
        /* synthetic */ Object f14182x;

        /* renamed from: z */
        int f14184z;

        C5129b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14182x = obj;
            this.f14184z |= Integer.MIN_VALUE;
            return IntroViewModel.this.m25603n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, ConsentsManager consentsManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f14171C = analyticsManager;
        this.f14172D = consentsManager;
        this.f14173E = BaseViewModel.m113I(this, 0L, new C5128a(), 1, null);
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_without_session));
        this.f14174F = c2381h;
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f14176H = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f14177I = c1436e02;
        this.f14178J = c1436e0;
        this.f14179K = c1436e02;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7835s.f20459b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: C0 */
    private final void m25608C0() {
        m120B(C13878n1.f34993a, null);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m25601u0(IntroViewModel introViewModel, View view) {
        m25598x0(introViewModel, view);
    }

    /* renamed from: v0 */
    public static final /* synthetic */ boolean m25600v0(IntroViewModel introViewModel) {
        return introViewModel.m20324k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m25598x0(IntroViewModel introViewModel, View view) {
        Intrinsics.isThisObjectNull(introViewModel, "this$0");
        introViewModel.f14173E.mo9587d(C13195u.f34156a);
    }

    /* renamed from: A0 */
    protected Void m25610A0() {
        return this.f14175G;
    }

    /* renamed from: B0 */
    public final LiveData m25609B0() {
        return this.f14179K;
    }

    /* renamed from: D0 */
    public final void m25607D0() {
        m25608C0();
    }

    /* renamed from: E0 */
    public final void m25606E0() {
        this.f14172D.m18563h(new Consent(null, null, null, null, null, 31, null));
        m20319p0();
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m25605f0() {
        return (Drawable) m25610A0();
    }

    /* renamed from: g0 */
    protected C2381h m25604g0() {
        return this.f14174F;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m25603n0(bd.InterfaceC1886d r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof p088ek.IntroViewModel.C5129b
            if (r2 == 0) goto L17
            r2 = r1
            ek.d$b r2 = (p088ek.IntroViewModel.C5129b) r2
            int r3 = r2.f14184z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14184z = r3
            goto L1c
        L17:
            ek.d$b r2 = new ek.d$b
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f14182x
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f14184z
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f14181w
            ek.d r2 = (p088ek.IntroViewModel) r2
            p468yc.C13186n.m1453b(r1)
            goto L4a
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            p468yc.C13186n.m1453b(r1)
            mg.s r1 = r0.f14172D
            r2.f14181w = r0
            r2.f14184z = r5
            java.lang.Object r1 = r1.m18565f(r2)
            if (r1 != r3) goto L49
            return r3
        L49:
            r2 = r0
        L4a:
            og.a r1 = (p276og.Result) r1
            boolean r3 = r1 instanceof p276og.Result.C8078c
            if (r3 == 0) goto L90
            og.a$c r1 = (p276og.Result.C8078c) r1
            java.lang.Object r1 = r1.m16962b()
            pt.pingodoce.app.data.remote.models.response.Consent r1 = (pt.pingodoce.app.data.remote.models.response.Consent) r1
            mg.s r3 = r2.f14172D
            pt.pingodoce.app.data.remote.models.response.Consent r3 = r3.m18566e()
            boolean r3 = p181jd.Intrinsics.equals(r1, r3)
            if (r3 == 0) goto L77
            r2.m25607D0()
            mg.a r4 = r2.f14171C
            ng.a$f$u r5 = ng.AnalyticEvents.AbstractC7780f.C7841u.f20465b
            ng.c r6 = ng.EnumC7885c.Button
            ng.b r7 = ng.EnumC7884b.Click
            r8 = 0
            r9 = 8
            r10 = 0
            ng.InterfaceC7886d.C7887a.m17629a(r4, r5, r6, r7, r8, r9, r10)
            goto La0
        L77:
            mg.a r11 = r2.f14171C
            ng.a$f$v r12 = ng.AnalyticEvents.AbstractC7780f.C7844v.f20468b
            ng.c r13 = ng.EnumC7885c.Input
            ng.b r14 = ng.EnumC7884b.Click
            r15 = 0
            r16 = 8
            r17 = 0
            ng.InterfaceC7886d.C7887a.m17629a(r11, r12, r13, r14, r15, r16, r17)
            mg.s r3 = r2.f14172D
            r3.m18563h(r1)
            r2.m25608C0()
            goto La0
        L90:
            boolean r3 = r1 instanceof p276og.Result.C8077b
            if (r3 == 0) goto La0
            r2.m20319p0()
            og.a$b r1 = (p276og.Result.C8077b) r1
            java.lang.Throwable r1 = r1.m16964b()
            r2.m109l(r1)
        La0:
            yc.u r1 = p468yc.C13195u.f34156a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p088ek.IntroViewModel.m25603n0(bd.d):java.lang.Object");
    }

    /* renamed from: o0 */
    protected int m25602o0() {
        return 2131951648;
    }

    /* renamed from: w0 */
    public final View.OnClickListener m25599w0() {
        return new View.OnClickListener() { // from class: ek.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntroViewModel.m25598x0(IntroViewModel.this, view);
            }
        };
    }

    /* renamed from: y0 */
    public final void m25597y0(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        Consent m18566e = this.f14172D.m18566e();
        this.f14177I.mo166p(new C7185b(new Term(str, enumC7070a == EnumC7070a.TERM_OF_USE ? m18566e.m13866b() : m18566e.m13867a())));
    }

    /* renamed from: z0 */
    public final LiveData m25596z0() {
        return this.f14178J;
    }
}
