package il;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Calendar;
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
import p163ih.PurchasesChartViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p183jg.PurchaseDate;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import p494zh.C13920x1;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import sd.C10171u;
import td.InterfaceC10524i0;

/* renamed from: il.j */
/* loaded from: classes2.dex */
public final class PurchaseListViewModel extends FlowViewModel {

    /* renamed from: A */
    private final C1436e0 f16978A;

    /* renamed from: B */
    private final LiveData f16979B;

    /* renamed from: C */
    private final LiveData f16980C;

    /* renamed from: D */
    private final LiveData f16981D;

    /* renamed from: E */
    private final LiveData f16982E;

    /* renamed from: F */
    private final LiveData f16983F;

    /* renamed from: q */
    private final PurchasesManager f16984q;

    /* renamed from: r */
    private C1436e0 f16985r;

    /* renamed from: s */
    private final C1436e0 f16986s;

    /* renamed from: t */
    private final LiveData f16987t;

    /* renamed from: u */
    private final C1436e0 f16988u;

    /* renamed from: v */
    private final LiveData f16989v;

    /* renamed from: w */
    private final InterfaceC6108l f16990w;

    /* renamed from: x */
    private final C1436e0 f16991x;

    /* renamed from: y */
    private final C1436e0 f16992y;

    /* renamed from: z */
    private final C1436e0 f16993z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseListViewModel.kt */
    /* renamed from: il.j$a */
    /* loaded from: classes2.dex */
    public static final class C6194a extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PurchaseListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListViewModel$fetchPurchases$1$1$1", m20196f = "PurchaseListViewModel.kt", m20195l = {55}, m20194m = "invokeSuspend")
        /* renamed from: il.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C6195a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f16995x;

            /* renamed from: y */
            final /* synthetic */ PurchaseListViewModel f16996y;

            /* renamed from: z */
            final /* synthetic */ Integer f16997z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PurchaseListViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListViewModel$fetchPurchases$1$1$1$1", m20196f = "PurchaseListViewModel.kt", m20195l = {56}, m20194m = "invokeSuspend")
            /* renamed from: il.j$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C6196a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f16998x;

                /* renamed from: y */
                final /* synthetic */ PurchaseListViewModel f16999y;

                /* renamed from: z */
                final /* synthetic */ Integer f17000z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C6196a(PurchaseListViewModel purchaseListViewModel, Integer num, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f16999y = purchaseListViewModel;
                    this.f17000z = num;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C6196a(this.f16999y, this.f17000z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C6196a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f16998x;
                    boolean z = true;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        PurchasesManager m21944W = PurchaseListViewModel.m21944W(this.f16999y);
                        Integer num = this.f17000z;
                        Intrinsics.checkIfNull(num, "lastPage");
                        int intValue = num.intValue();
                        this.f16998x = 1;
                        obj = PurchasesManager.m18445h(m21944W, intValue, 0, this, 2, null);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    PurchasesManager.AbstractC7449b abstractC7449b = (PurchasesManager.AbstractC7449b) obj;
                    boolean z2 = false;
                    if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7452c) {
                        List m18440a = ((PurchasesManager.AbstractC7449b.C7452c) abstractC7449b).m18440a();
                        PurchaseListViewModel purchaseListViewModel = this.f16999y;
                        Integer num2 = this.f17000z;
                        PurchaseListViewModel.m21938c0(purchaseListViewModel).mo166p(m18440a.isEmpty() ? num2 : C6755b.m20199c(num2.intValue() + 1));
                        PurchaseListViewModel.m21939b0(purchaseListViewModel).mo166p(PurchaseListViewModel.m21935f0(purchaseListViewModel, m18440a));
                        if (num2 == null || num2.intValue() != 1 || !m18440a.isEmpty()) {
                            z = false;
                        }
                        PurchaseListViewModel.m21934g0(purchaseListViewModel, z);
                    } else if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7451b) {
                        Integer num3 = this.f17000z;
                        if (num3 != null && num3.intValue() == 1) {
                            List list = (List) this.f16999y.m21927n0().mo172f();
                            if (list != null && !list.isEmpty()) {
                                z2 = true;
                            }
                            if (!z2) {
                                PurchaseListViewModel.m21934g0(this.f16999y, true);
                            }
                        }
                        PurchaseListViewModel.m21937d0(this.f16999y, ((PurchasesManager.AbstractC7449b.C7451b) abstractC7449b).m18441a());
                    } else if (abstractC7449b instanceof PurchasesManager.AbstractC7449b.C7450a) {
                        PurchaseListViewModel.m21937d0(this.f16999y, ((PurchasesManager.AbstractC7449b.C7450a) abstractC7449b).m18442a());
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6195a(PurchaseListViewModel purchaseListViewModel, Integer num, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f16996y = purchaseListViewModel;
                this.f16997z = num;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C6195a(this.f16996y, this.f16997z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C6195a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f16995x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PurchaseListViewModel purchaseListViewModel = this.f16996y;
                    Integer num = this.f16997z;
                    Intrinsics.checkIfNull(num, "lastPage");
                    boolean z = num.intValue() > 1;
                    C6196a c6196a = new C6196a(this.f16996y, this.f16997z, null);
                    this.f16995x = 1;
                    if (PurchaseListViewModel.m21936e0(purchaseListViewModel, z, c6196a, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                BaseViewModel.m111K(this.f16996y, false, false, 2, null);
                return C13195u.f34156a;
            }
        }

        C6194a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21918a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            Integer num = (Integer) PurchaseListViewModel.m21938c0(PurchaseListViewModel.this).mo172f();
            if (num != null) {
                PurchaseListViewModel purchaseListViewModel = PurchaseListViewModel.this;
                BaseViewModel.m111K(purchaseListViewModel, num.intValue() == 1, false, 2, null);
                C6772d.m20158d(C1473p0.m36987a(purchaseListViewModel), null, null, new C6195a(purchaseListViewModel, num, null), 3, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21918a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListViewModel$getChartData$1", m20196f = "PurchaseListViewModel.kt", m20195l = {128}, m20194m = "invokeSuspend")
    /* renamed from: il.j$b */
    /* loaded from: classes2.dex */
    public static final class C6197b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f17001x;

        /* renamed from: z */
        final /* synthetic */ PurchasesChartViewModel.EnumC6140a f17003z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PurchaseListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListViewModel$getChartData$1$1", m20196f = "PurchaseListViewModel.kt", m20195l = {132}, m20194m = "invokeSuspend")
        /* renamed from: il.j$b$a */
        /* loaded from: classes2.dex */
        public static final class C6198a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f17004x;

            /* renamed from: y */
            final /* synthetic */ PurchaseListViewModel f17005y;

            /* renamed from: z */
            final /* synthetic */ PurchasesChartViewModel.EnumC6140a f17006z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6198a(PurchaseListViewModel purchaseListViewModel, PurchasesChartViewModel.EnumC6140a enumC6140a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f17005y = purchaseListViewModel;
                this.f17006z = enumC6140a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C6198a(this.f17005y, this.f17006z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C6198a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m197g;
                m34636d = C2116d.m34636d();
                int i = this.f17004x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PurchaseListViewModel.m21934g0(this.f17005y, false);
                    PurchaseListViewModel.m21940a0(this.f17005y).mo166p(C6755b.m20201a(false));
                    C1436e0 m21943X = PurchaseListViewModel.m21943X(this.f17005y);
                    m197g = C13780s.m197g();
                    m21943X.mo166p(m197g);
                    PurchasesManager m21944W = PurchaseListViewModel.m21944W(this.f17005y);
                    PurchasesChartViewModel.EnumC6140a enumC6140a = this.f17006z;
                    this.f17004x = 1;
                    obj = m21944W.m18449d(enumC6140a, this);
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
                    PurchaseListViewModel.m21943X(this.f17005y).mo166p(c7448c.m18443a().m14449a());
                    PurchaseListViewModel.m21941Z(this.f17005y).mo166p(c7448c.m18443a().m14447c());
                    PurchaseListViewModel.m21942Y(this.f17005y).mo166p(c7448c.m18443a().m14448b());
                    PurchaseListViewModel.m21940a0(this.f17005y).mo166p(C6755b.m20201a(true));
                } else if (abstractC7445a instanceof PurchasesManager.AbstractC7445a.C7447b) {
                    PurchaseListViewModel.m21934g0(this.f17005y, true);
                } else if (abstractC7445a instanceof PurchasesManager.AbstractC7445a.C7446a) {
                    PurchaseListViewModel.m21934g0(this.f17005y, true);
                    PurchaseListViewModel.m21937d0(this.f17005y, ((PurchasesManager.AbstractC7445a.C7446a) abstractC7445a).m18444a());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6197b(PurchasesChartViewModel.EnumC6140a enumC6140a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f17003z = enumC6140a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6197b(this.f17003z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6197b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f17001x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseListViewModel purchaseListViewModel = PurchaseListViewModel.this;
                C6198a c6198a = new C6198a(purchaseListViewModel, this.f17003z, null);
                this.f17001x = 1;
                if (PurchaseListViewModel.m21936e0(purchaseListViewModel, true, c6198a, this) == m34636d) {
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
    /* renamed from: il.j$c */
    /* loaded from: classes2.dex */
    public static final class C6199c implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f17007w;

        /* compiled from: Emitters.kt */
        /* renamed from: il.j$c$a */
        /* loaded from: classes2.dex */
        public static final class C6200a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f17008w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.list.PurchaseListViewModel$special$$inlined$map$1$2", m20196f = "PurchaseListViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: il.j$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C6201a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f17009w;

                /* renamed from: x */
                int f17010x;

                public C6201a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f17009w = obj;
                    this.f17010x |= Integer.MIN_VALUE;
                    return C6200a.this.mo4529a(null, this);
                }
            }

            public C6200a(InterfaceC6787d interfaceC6787d) {
                this.f17008w = interfaceC6787d;
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
                    boolean r0 = r6 instanceof il.PurchaseListViewModel.C6199c.C6200a.C6201a
                    if (r0 == 0) goto L13
                    r0 = r6
                    il.j$c$a$a r0 = (il.PurchaseListViewModel.C6199c.C6200a.C6201a) r0
                    int r1 = r0.f17010x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f17010x = r1
                    goto L18
                L13:
                    il.j$c$a$a r0 = new il.j$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f17009w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f17010x
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
                    kotlinx.coroutines.flow.d r6 = r4.f17008w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.lang.String r5 = r5.m13820J()
                    r0.f17010x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: il.PurchaseListViewModel.C6199c.C6200a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C6199c(InterfaceC6785c interfaceC6785c) {
            this.f17007w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f17007w.mo20086d(new C6200a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseListViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PurchasesManager purchasesManager) {
        super(c1459l0, resourcesProvider);
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(purchasesManager, "purchasesManager");
        this.f16984q = purchasesManager;
        C1436e0 m37003d = c1459l0.m37003d("_lastPage", 1);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_lastPage\", 1)");
        this.f16985r = m37003d;
        C1436e0 c1436e0 = new C1436e0();
        this.f16986s = c1436e0;
        this.f16987t = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        c1436e02.mo166p(Boolean.FALSE);
        this.f16988u = c1436e02;
        this.f16989v = c1436e02;
        this.f16990w = OperatorExtensions.m35176e(0L, null, new C6194a(), 3, null);
        m197g = C13780s.m197g();
        C1436e0 c1436e03 = new C1436e0(m197g);
        this.f16991x = c1436e03;
        C1436e0 c1436e04 = new C1436e0();
        this.f16992y = c1436e04;
        C1436e0 c1436e05 = new C1436e0();
        this.f16993z = c1436e05;
        C1436e0 c1436e06 = new C1436e0();
        this.f16978A = c1436e06;
        this.f16979B = m106t(new C6199c(loyaltyCardManager.m18930p()));
        this.f16980C = c1436e03;
        this.f16981D = c1436e04;
        this.f16982E = c1436e05;
        this.f16983F = c1436e06;
        m21931j0(this, null, 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m21945V(PurchaseListViewModel purchaseListViewModel, View view) {
        m21923r0(purchaseListViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ PurchasesManager m21944W(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16984q;
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m21943X(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16991x;
    }

    /* renamed from: Y */
    public static final /* synthetic */ C1436e0 m21942Y(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16993z;
    }

    /* renamed from: Z */
    public static final /* synthetic */ C1436e0 m21941Z(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16992y;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C1436e0 m21940a0(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16978A;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ C1436e0 m21939b0(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16986s;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ C1436e0 m21938c0(PurchaseListViewModel purchaseListViewModel) {
        return purchaseListViewModel.f16985r;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ void m21937d0(PurchaseListViewModel purchaseListViewModel, Throwable th2) {
        purchaseListViewModel.m109l(th2);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ Object m21936e0(PurchaseListViewModel purchaseListViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return purchaseListViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ List m21935f0(PurchaseListViewModel purchaseListViewModel, List list) {
        return purchaseListViewModel.m21920u0(list);
    }

    /* renamed from: g0 */
    public static final /* synthetic */ void m21934g0(PurchaseListViewModel purchaseListViewModel, boolean z) {
        purchaseListViewModel.m20381p(z);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m21931j0(PurchaseListViewModel purchaseListViewModel, PurchasesChartViewModel.EnumC6140a enumC6140a, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC6140a = PurchasesChartViewModel.EnumC6140a.FILTER_BY_30_DAYS;
        }
        purchaseListViewModel.m21932i0(enumC6140a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m21923r0(PurchaseListViewModel purchaseListViewModel, View view) {
        Intrinsics.isThisObjectNull(purchaseListViewModel, "this$0");
        BaseViewModel.m119C(purchaseListViewModel, C13920x1.f35041a, null, 2, null);
    }

    /* renamed from: u0 */
    private final List m21920u0(List list) {
        boolean m8922H;
        String valueOf = String.valueOf(Calendar.getInstance().get(1));
        ArrayList arrayList = new ArrayList();
        List list2 = (List) this.f16987t.mo172f();
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof PurchaseDate) {
                arrayList2.add(obj);
            }
        }
        String m20848a = arrayList2.isEmpty() ? BuildConfig.VERSION_NAME : ((PurchaseDate) C13777q.m249W(arrayList2)).m20848a();
        if (!m21919v0()) {
            list = _Collections.m460i0(list, 6);
        }
        for (Purchase purchase : list) {
            m8922H = C10171u.m8922H(purchase.m14429r(), valueOf, false, 2, null);
            boolean z = !m8922H;
            if ((!z && !Intrinsics.equals(m20848a, purchase.m14430n())) || (z && !Intrinsics.equals(m20848a, purchase.m14429r()))) {
                m20848a = z ? purchase.m14429r() : purchase.m14430n();
                arrayList.add(new PurchaseDate(m20848a));
            }
            arrayList.add(purchase);
        }
        return arrayList;
    }

    /* renamed from: D */
    protected long m21946D() {
        return 200L;
    }

    /* renamed from: h0 */
    public final LiveData m21933h0() {
        return this.f16980C;
    }

    /* renamed from: i0 */
    public final void m21932i0(PurchasesChartViewModel.EnumC6140a enumC6140a) {
        Intrinsics.isThisObjectNull(enumC6140a, "filter");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C6197b(enumC6140a, null), 3, null);
    }

    /* renamed from: k0 */
    public final LiveData m21930k0() {
        return this.f16982E;
    }

    /* renamed from: l0 */
    public final LiveData m21929l0() {
        return this.f16981D;
    }

    /* renamed from: m0 */
    public final LiveData m21928m0() {
        return this.f16983F;
    }

    /* renamed from: n0 */
    public final LiveData m21927n0() {
        return this.f16987t;
    }

    /* renamed from: o0 */
    public final LiveData m21926o0() {
        return this.f16989v;
    }

    /* renamed from: p0 */
    public final LiveData m21925p0() {
        return this.f16979B;
    }

    /* renamed from: q0 */
    public final View.OnClickListener m21924q0() {
        return new View.OnClickListener() { // from class: il.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseListViewModel.m21923r0(PurchaseListViewModel.this, view);
            }
        };
    }

    /* renamed from: s0 */
    public final void m21922s0() {
        this.f16990w.mo9587d(C13195u.f34156a);
    }

    /* renamed from: t0 */
    public final void m21921t0(boolean z) {
        this.f16988u.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: v0 */
    public final boolean m21919v0() {
        return Intrinsics.equals(this.f16988u.mo172f(), Boolean.FALSE);
    }
}
