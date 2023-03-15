package p163ih;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.LoyaltyCardManager;
import mg.PurchasesManager;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import td.InterfaceC10524i0;

/* renamed from: ih.d */
/* loaded from: classes2.dex */
public final class PurchasesChartViewModel extends BaseViewModel {

    /* renamed from: m */
    private final PurchasesManager f16852m;

    /* renamed from: n */
    private final C1436e0 f16853n;

    /* renamed from: o */
    private final C1436e0 f16854o;

    /* renamed from: p */
    private final C1436e0 f16855p;

    /* renamed from: q */
    private final C1436e0 f16856q;

    /* renamed from: r */
    private final LiveData f16857r;

    /* renamed from: s */
    private final LiveData f16858s;

    /* renamed from: t */
    private final LiveData f16859t;

    /* renamed from: u */
    private final LiveData f16860u;

    /* renamed from: v */
    private final LiveData f16861v;

    /* compiled from: PurchasesChartViewModel.kt */
    /* renamed from: ih.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC6140a {
        FILTER_BY_30_DAYS,
        FILTER_BY_3_MONTHS,
        FILTER_BY_12_MONTHS
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchasesChartViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.pager.PurchasesChartViewModel$getChartData$1", m20196f = "PurchasesChartViewModel.kt", m20195l = {45}, m20194m = "invokeSuspend")
    /* renamed from: ih.d$b */
    /* loaded from: classes2.dex */
    public static final class C6141b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f16862x;

        /* renamed from: z */
        final /* synthetic */ EnumC6140a f16864z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PurchasesChartViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.pager.PurchasesChartViewModel$getChartData$1$1", m20196f = "PurchasesChartViewModel.kt", m20195l = {49}, m20194m = "invokeSuspend")
        /* renamed from: ih.d$b$a */
        /* loaded from: classes2.dex */
        public static final class C6142a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f16865x;

            /* renamed from: y */
            final /* synthetic */ PurchasesChartViewModel f16866y;

            /* renamed from: z */
            final /* synthetic */ EnumC6140a f16867z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6142a(PurchasesChartViewModel purchasesChartViewModel, EnumC6140a enumC6140a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f16866y = purchasesChartViewModel;
                this.f16867z = enumC6140a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C6142a(this.f16866y, this.f16867z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C6142a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m197g;
                m34636d = C2116d.m34636d();
                int i = this.f16865x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PurchasesChartViewModel.m22078S(this.f16866y, false);
                    PurchasesChartViewModel.m22081P(this.f16866y).mo166p(C6755b.m20201a(false));
                    C1436e0 m22084M = PurchasesChartViewModel.m22084M(this.f16866y);
                    m197g = C13780s.m197g();
                    m22084M.mo166p(m197g);
                    PurchasesManager m22085L = PurchasesChartViewModel.m22085L(this.f16866y);
                    EnumC6140a enumC6140a = this.f16867z;
                    this.f16865x = 1;
                    obj = m22085L.m18449d(enumC6140a, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                PurchasesManager.AbstractC7445a abstractC7445a = (PurchasesManager.AbstractC7445a) obj;
                if (abstractC7445a instanceof PurchasesManager.AbstractC7445a.C7448c) {
                    PurchasesManager.AbstractC7445a.C7448c c7448c = (PurchasesManager.AbstractC7445a.C7448c) abstractC7445a;
                    PurchasesChartViewModel.m22084M(this.f16866y).mo166p(c7448c.m18443a().m14449a());
                    PurchasesChartViewModel.m22082O(this.f16866y).mo166p(c7448c.m18443a().m14447c());
                    PurchasesChartViewModel.m22083N(this.f16866y).mo166p(c7448c.m18443a().m14448b());
                    PurchasesChartViewModel.m22081P(this.f16866y).mo166p(C6755b.m20201a(true));
                } else if (abstractC7445a instanceof PurchasesManager.AbstractC7445a.C7447b) {
                    PurchasesChartViewModel.m22078S(this.f16866y, true);
                } else if (abstractC7445a instanceof PurchasesManager.AbstractC7445a.C7446a) {
                    PurchasesChartViewModel.m22078S(this.f16866y, true);
                    PurchasesChartViewModel.m22080Q(this.f16866y, ((PurchasesManager.AbstractC7445a.C7446a) abstractC7445a).m18444a());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6141b(EnumC6140a enumC6140a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f16864z = enumC6140a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6141b(this.f16864z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6141b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f16862x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchasesChartViewModel purchasesChartViewModel = PurchasesChartViewModel.this;
                C6142a c6142a = new C6142a(purchasesChartViewModel, this.f16864z, null);
                this.f16862x = 1;
                if (PurchasesChartViewModel.m22079R(purchasesChartViewModel, true, c6142a, this) == m34636d) {
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
    /* renamed from: ih.d$c */
    /* loaded from: classes2.dex */
    public static final class C6143c implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f16868w;

        /* compiled from: Emitters.kt */
        /* renamed from: ih.d$c$a */
        /* loaded from: classes2.dex */
        public static final class C6144a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f16869w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.pager.PurchasesChartViewModel$special$$inlined$map$1$2", m20196f = "PurchasesChartViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: ih.d$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C6145a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f16870w;

                /* renamed from: x */
                int f16871x;

                public C6145a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f16870w = obj;
                    this.f16871x |= Integer.MIN_VALUE;
                    return C6144a.this.mo4529a(null, this);
                }
            }

            public C6144a(InterfaceC6787d interfaceC6787d) {
                this.f16869w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof p163ih.PurchasesChartViewModel.C6143c.C6144a.C6145a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ih.d$c$a$a r0 = (p163ih.PurchasesChartViewModel.C6143c.C6144a.C6145a) r0
                    int r1 = r0.f16871x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f16871x = r1
                    goto L18
                L13:
                    ih.d$c$a$a r0 = new ih.d$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f16870w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f16871x
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
                    kotlinx.coroutines.flow.d r6 = r4.f16869w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.lang.String r5 = r5.m13820J()
                    r0.f16871x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p163ih.PurchasesChartViewModel.C6143c.C6144a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C6143c(InterfaceC6785c interfaceC6785c) {
            this.f16868w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f16868w.mo20086d(new C6144a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesChartViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PurchasesManager purchasesManager) {
        super(c1459l0, resourcesProvider);
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(purchasesManager, "purchasesManager");
        this.f16852m = purchasesManager;
        m197g = C13780s.m197g();
        C1436e0 c1436e0 = new C1436e0(m197g);
        this.f16853n = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f16854o = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        this.f16855p = c1436e03;
        C1436e0 c1436e04 = new C1436e0();
        this.f16856q = c1436e04;
        this.f16857r = m106t(new C6143c(loyaltyCardManager.m18930p()));
        this.f16858s = c1436e0;
        this.f16859t = c1436e02;
        this.f16860u = c1436e03;
        this.f16861v = c1436e04;
        m22075V(this, null, 1, null);
    }

    /* renamed from: L */
    public static final /* synthetic */ PurchasesManager m22085L(PurchasesChartViewModel purchasesChartViewModel) {
        return purchasesChartViewModel.f16852m;
    }

    /* renamed from: M */
    public static final /* synthetic */ C1436e0 m22084M(PurchasesChartViewModel purchasesChartViewModel) {
        return purchasesChartViewModel.f16853n;
    }

    /* renamed from: N */
    public static final /* synthetic */ C1436e0 m22083N(PurchasesChartViewModel purchasesChartViewModel) {
        return purchasesChartViewModel.f16855p;
    }

    /* renamed from: O */
    public static final /* synthetic */ C1436e0 m22082O(PurchasesChartViewModel purchasesChartViewModel) {
        return purchasesChartViewModel.f16854o;
    }

    /* renamed from: P */
    public static final /* synthetic */ C1436e0 m22081P(PurchasesChartViewModel purchasesChartViewModel) {
        return purchasesChartViewModel.f16856q;
    }

    /* renamed from: Q */
    public static final /* synthetic */ void m22080Q(PurchasesChartViewModel purchasesChartViewModel, Throwable th2) {
        purchasesChartViewModel.m109l(th2);
    }

    /* renamed from: R */
    public static final /* synthetic */ Object m22079R(PurchasesChartViewModel purchasesChartViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return purchasesChartViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: S */
    public static final /* synthetic */ void m22078S(PurchasesChartViewModel purchasesChartViewModel, boolean z) {
        purchasesChartViewModel.m20381p(z);
    }

    /* renamed from: V */
    public static /* synthetic */ void m22075V(PurchasesChartViewModel purchasesChartViewModel, EnumC6140a enumC6140a, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC6140a = EnumC6140a.FILTER_BY_30_DAYS;
        }
        purchasesChartViewModel.m22076U(enumC6140a);
    }

    /* renamed from: T */
    public final LiveData m22077T() {
        return this.f16858s;
    }

    /* renamed from: U */
    public final void m22076U(EnumC6140a enumC6140a) {
        Intrinsics.isThisObjectNull(enumC6140a, "filter");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C6141b(enumC6140a, null), 3, null);
    }

    /* renamed from: W */
    public final LiveData m22074W() {
        return this.f16860u;
    }

    /* renamed from: X */
    public final LiveData m22073X() {
        return this.f16859t;
    }

    /* renamed from: Y */
    public final LiveData m22072Y() {
        return this.f16861v;
    }

    /* renamed from: Z */
    public final LiveData m22071Z() {
        return this.f16857r;
    }
}
