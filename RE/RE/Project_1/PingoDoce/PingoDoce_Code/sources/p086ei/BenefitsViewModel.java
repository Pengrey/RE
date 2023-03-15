package p086ei;

import android.view.View;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import gi.BenefitViewState;
import gi.C5691c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.BannerManager;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.C8082c;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.Iterables;
import p494zh.BaseViewModel;
import p494zh.C13811b;
import p494zh.C13869l0;
import p494zh.C13899s0;
import pt.pingodoce.app.data.remote.models.response.Banner;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import td.C10587w0;
import td.InterfaceC10524i0;

/* renamed from: ei.r */
/* loaded from: classes2.dex */
public final class BenefitsViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final BannerManager f14114p;

    /* renamed from: q */
    private final LoyaltyCardManager f14115q;

    /* renamed from: r */
    private final InterfaceC6108l f14116r;

    /* renamed from: s */
    private final InterfaceC6108l f14117s;

    /* renamed from: t */
    private final InterfaceC6108l f14118t;

    /* renamed from: u */
    private final LiveData f14119u;

    /* renamed from: v */
    private final LiveData f14120v;

    /* renamed from: w */
    private final LiveData f14121w;

    /* renamed from: x */
    private final LiveData f14122x;

    /* renamed from: y */
    private final LiveData f14123y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsViewModel.kt */
    /* renamed from: ei.r$a */
    /* loaded from: classes2.dex */
    public static final class C5098a extends AbstractC6438m implements InterfaceC6108l {
        C5098a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25685a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(BenefitsViewModel.this, C13811b.f34919a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25685a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsViewModel.kt */
    /* renamed from: ei.r$b */
    /* loaded from: classes2.dex */
    public static final class C5099b extends AbstractC6438m implements InterfaceC6108l {
        C5099b() {
            super(1);
        }

        /* renamed from: a */
        public final void m25684a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(BenefitsViewModel.this, C13899s0.f35020a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25684a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsViewModel$refreshBanners$1", m20196f = "BenefitsViewModel.kt", m20195l = {73}, m20194m = "invokeSuspend")
    /* renamed from: ei.r$c */
    /* loaded from: classes2.dex */
    public static final class C5100c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14126x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BenefitsViewModel.kt */
        /* renamed from: ei.r$c$a */
        /* loaded from: classes2.dex */
        public static final class C5101a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ BenefitsViewModel f14128w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5101a(BenefitsViewModel benefitsViewModel) {
                super(1);
                this.f14128w = benefitsViewModel;
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                invoke2((Throwable) obj);
                return C13195u.f34156a;
            }

            /* renamed from: invoke */
            public final void invoke2(Throwable th2) {
                Intrinsics.isThisObjectNull(th2, "it");
                BaseViewModel.m119C(this.f14128w, C13869l0.f34986a, null, 2, null);
            }
        }

        C5100c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5100c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5100c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14126x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerManager m25702U = BenefitsViewModel.m25702U(BenefitsViewModel.this);
                this.f14126x = 1;
                obj = m25702U.m18795f(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            C8082c.m16959a((Result) obj, new C5101a(BenefitsViewModel.this));
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsViewModel$refreshBenefits$1", m20196f = "BenefitsViewModel.kt", m20195l = {67}, m20194m = "invokeSuspend")
    /* renamed from: ei.r$d */
    /* loaded from: classes2.dex */
    public static final class C5102d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14129x;

        C5102d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5102d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5102d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14129x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardManager m25701V = BenefitsViewModel.m25701V(BenefitsViewModel.this);
                this.f14129x = 1;
                if (m25701V.m18931o(this) == m34636d) {
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

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: ei.r$e */
    /* loaded from: classes2.dex */
    public static final class C5103e implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f14131w;

        /* compiled from: Emitters.kt */
        /* renamed from: ei.r$e$a */
        /* loaded from: classes2.dex */
        public static final class C5104a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f14132w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.BenefitsViewModel$special$$inlined$map$1$2", m20196f = "BenefitsViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: ei.r$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C5105a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f14133w;

                /* renamed from: x */
                int f14134x;

                public C5105a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f14133w = obj;
                    this.f14134x |= Integer.MIN_VALUE;
                    return C5104a.this.mo4529a(null, this);
                }
            }

            public C5104a(InterfaceC6787d interfaceC6787d) {
                this.f14132w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p086ei.BenefitsViewModel.C5103e.C5104a.C5105a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ei.r$e$a$a r0 = (p086ei.BenefitsViewModel.C5103e.C5104a.C5105a) r0
                    int r1 = r0.f14134x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14134x = r1
                    goto L18
                L13:
                    ei.r$e$a$a r0 = new ei.r$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f14133w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f14134x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f14132w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.util.List r5 = r5.m13804f()
                    r0.f14134x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p086ei.BenefitsViewModel.C5103e.C5104a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C5103e(InterfaceC6785c interfaceC6785c) {
            this.f14131w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f14131w.mo20086d(new C5104a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ei.r$f */
    /* loaded from: classes2.dex */
    public static final class C5106f<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((List) obj).isEmpty());
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ei.r$g */
    /* loaded from: classes2.dex */
    public static final class C5107g<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return (Banner) C13777q.m254N((List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsViewModel.kt */
    /* renamed from: ei.r$h */
    /* loaded from: classes2.dex */
    public static final class C5108h extends AbstractC6438m implements InterfaceC6108l {
        C5108h() {
            super(1);
        }

        /* renamed from: a */
        public final void m25681a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BenefitsViewModel.this.m25691f0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25681a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, BannerManager bannerManager, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(bannerManager, "bannerManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(storeManager, "storeManager");
        this.f14114p = bannerManager;
        this.f14115q = loyaltyCardManager;
        this.f14116r = OperatorExtensions.m35176e(0L, null, new C5098a(), 3, null);
        this.f14117s = BaseViewModel.m113I(this, 0L, new C5099b(), 1, null);
        this.f14118t = OperatorExtensions.m35176e(0L, null, new C5108h(), 3, null);
        LiveData m106t = m106t(new C5103e(loyaltyCardManager.m18930p()));
        this.f14119u = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C5106f());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f14120v = m36993a;
        this.f14121w = m106t(loyaltyCardManager.m18927s());
        LiveData m106t2 = m106t(bannerManager.m18794g());
        this.f14122x = m106t2;
        LiveData m36993a2 = C1465n0.m36993a(m106t2, new C5107g());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f14123y = m36993a2;
    }

    /* renamed from: R */
    public static /* synthetic */ void m25705R(BenefitsViewModel benefitsViewModel, View view) {
        m25686k0(benefitsViewModel, view);
    }

    /* renamed from: S */
    public static /* synthetic */ void m25704S(BenefitsViewModel benefitsViewModel, View view) {
        m25692e0(benefitsViewModel, view);
    }

    /* renamed from: T */
    public static /* synthetic */ void m25703T(BenefitsViewModel benefitsViewModel, View view) {
        m25688i0(benefitsViewModel, view);
    }

    /* renamed from: U */
    public static final /* synthetic */ BannerManager m25702U(BenefitsViewModel benefitsViewModel) {
        return benefitsViewModel.f14114p;
    }

    /* renamed from: V */
    public static final /* synthetic */ LoyaltyCardManager m25701V(BenefitsViewModel benefitsViewModel) {
        return benefitsViewModel.f14115q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m25692e0(BenefitsViewModel benefitsViewModel, View view) {
        Intrinsics.isThisObjectNull(benefitsViewModel, "this$0");
        benefitsViewModel.f14116r.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m25688i0(BenefitsViewModel benefitsViewModel, View view) {
        Intrinsics.isThisObjectNull(benefitsViewModel, "this$0");
        benefitsViewModel.f14118t.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m25686k0(BenefitsViewModel benefitsViewModel, View view) {
        Intrinsics.isThisObjectNull(benefitsViewModel, "this$0");
        benefitsViewModel.f14117s.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    protected void m25706N() {
        m25690g0();
    }

    /* renamed from: W */
    public final List m25700W(List list) {
        boolean z;
        int m186r;
        boolean z2;
        int m186r2;
        Intrinsics.isThisObjectNull(list, "list");
        ArrayList arrayList = new ArrayList();
        boolean z3 = list instanceof Collection;
        if (!z3 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Benefit) it.next()).m13924v()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            arrayList.add(new C5691c(true));
        }
        ArrayList<Benefit> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((Benefit) obj).m13924v()) {
                arrayList2.add(obj);
            }
        }
        m186r = Iterables.m186r(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m186r);
        for (Benefit benefit : arrayList2) {
            arrayList3.add(new BenefitViewState(benefit));
        }
        arrayList.addAll(arrayList3);
        if (!z3 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!((Benefit) it2.next()).m13924v()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            arrayList.add(new C5691c(false));
        }
        ArrayList<Benefit> arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            if (!((Benefit) obj2).m13924v()) {
                arrayList4.add(obj2);
            }
        }
        m186r2 = Iterables.m186r(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(m186r2);
        for (Benefit benefit2 : arrayList4) {
            arrayList5.add(new BenefitViewState(benefit2));
        }
        arrayList.addAll(arrayList5);
        return arrayList;
    }

    /* renamed from: X */
    public final Object m25699X(int i, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m18796e = this.f14114p.m18796e(i, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m18796e == m34636d ? m18796e : C13195u.f34156a;
    }

    /* renamed from: Y */
    public final LiveData m25698Y() {
        return this.f14122x;
    }

    /* renamed from: Z */
    public final LiveData m25697Z() {
        return this.f14119u;
    }

    /* renamed from: a0 */
    public final LiveData m25696a0() {
        return this.f14123y;
    }

    /* renamed from: b0 */
    public final LiveData m25695b0() {
        return this.f14121w;
    }

    /* renamed from: c0 */
    public final LiveData m25694c0() {
        return this.f14120v;
    }

    /* renamed from: d0 */
    public final View.OnClickListener m25693d0() {
        return new View.OnClickListener() { // from class: ei.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsViewModel.m25692e0(BenefitsViewModel.this, view);
            }
        };
    }

    /* renamed from: f0 */
    public final void m25691f0() {
        C6772d.m20158d(C1473p0.m36987a(this), C10587w0.m7620b(), null, new C5100c(null), 2, null);
    }

    /* renamed from: g0 */
    public final void m25690g0() {
        C6772d.m20158d(C1473p0.m36987a(this), C10587w0.m7620b(), null, new C5102d(null), 2, null);
    }

    /* renamed from: h0 */
    public final View.OnClickListener m25689h0() {
        return new View.OnClickListener() { // from class: ei.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsViewModel.m25688i0(BenefitsViewModel.this, view);
            }
        };
    }

    /* renamed from: j0 */
    public final View.OnClickListener m25687j0() {
        return new View.OnClickListener() { // from class: ei.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsViewModel.m25686k0(BenefitsViewModel.this, view);
            }
        };
    }
}
