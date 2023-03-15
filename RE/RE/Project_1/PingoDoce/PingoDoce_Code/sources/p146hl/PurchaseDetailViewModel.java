package p146hl;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.FlowViewModel;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.PurchasesManager;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* renamed from: hl.g */
/* loaded from: classes2.dex */
public final class PurchaseDetailViewModel extends FlowViewModel {

    /* renamed from: A */
    private final LiveData f16479A;

    /* renamed from: q */
    private final PurchasesManager f16480q;

    /* renamed from: r */
    private final C1436e0 f16481r;

    /* renamed from: s */
    private final LiveData f16482s;

    /* renamed from: t */
    private final C1436e0 f16483t;

    /* renamed from: u */
    private final LiveData f16484u;

    /* renamed from: v */
    private final C1436e0 f16485v;

    /* renamed from: w */
    private final LiveData f16486w;

    /* renamed from: x */
    private final C1436e0 f16487x;

    /* renamed from: y */
    private final LiveData f16488y;

    /* renamed from: z */
    private final C1436e0 f16489z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailViewModel$1$1", m20196f = "PurchaseDetailViewModel.kt", m20195l = {46}, m20194m = "invokeSuspend")
    /* renamed from: hl.g$a */
    /* loaded from: classes2.dex */
    public static final class C5970a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f16490x;

        /* renamed from: z */
        final /* synthetic */ String f16492z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PurchaseDetailViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.detail.PurchaseDetailViewModel$1$1$1", m20196f = "PurchaseDetailViewModel.kt", m20195l = {47}, m20194m = "invokeSuspend")
        /* renamed from: hl.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C5971a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f16493x;

            /* renamed from: y */
            final /* synthetic */ PurchaseDetailViewModel f16494y;

            /* renamed from: z */
            final /* synthetic */ String f16495z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5971a(PurchaseDetailViewModel purchaseDetailViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f16494y = purchaseDetailViewModel;
                this.f16495z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5971a(this.f16494y, this.f16495z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5971a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f16493x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PurchasesManager m22568V = PurchaseDetailViewModel.m22568V(this.f16494y);
                    String str = this.f16495z;
                    Intrinsics.checkIfNull(str, "it");
                    this.f16493x = 1;
                    obj = m22568V.m18447f(str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                PurchasesManager.AbstractC7453c abstractC7453c = (PurchasesManager.AbstractC7453c) obj;
                if (abstractC7453c instanceof PurchasesManager.AbstractC7453c.C7455b) {
                    PurchasesManager.AbstractC7453c.C7455b c7455b = (PurchasesManager.AbstractC7453c.C7455b) abstractC7453c;
                    PurchaseDetailViewModel.m22563a0(this.f16494y).mo166p(c7455b.m18439a().m14434i());
                    PurchaseDetailViewModel.m22567W(this.f16494y).mo166p(c7455b.m18439a().m14433j());
                    PurchaseDetailViewModel.m22566X(this.f16494y).mo166p(c7455b.m18439a().m14432k());
                    PurchaseDetailViewModel.m22564Z(this.f16494y).mo166p(c7455b.m18439a().m14425w());
                    C1436e0 m22565Y = PurchaseDetailViewModel.m22565Y(this.f16494y);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c7455b.m18439a());
                    arrayList.addAll(c7455b.m18439a().m14427t());
                    m22565Y.mo166p(arrayList);
                } else {
                    PurchaseDetailViewModel.m22561c0(this.f16494y, true);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5970a(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f16492z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5970a(this.f16492z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5970a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f16490x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseDetailViewModel purchaseDetailViewModel = PurchaseDetailViewModel.this;
                C5971a c5971a = new C5971a(purchaseDetailViewModel, this.f16492z, null);
                this.f16490x = 1;
                if (PurchaseDetailViewModel.m22562b0(purchaseDetailViewModel, true, c5971a, this) == m34636d) {
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
    public PurchaseDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PurchasesManager purchasesManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(purchasesManager, "purchasesManager");
        this.f16480q = purchasesManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f16481r = c1436e0;
        this.f16482s = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f16483t = c1436e02;
        this.f16484u = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        this.f16485v = c1436e03;
        this.f16486w = c1436e03;
        C1436e0 c1436e04 = new C1436e0();
        this.f16487x = c1436e04;
        this.f16488y = c1436e04;
        C1436e0 c1436e05 = new C1436e0();
        this.f16489z = c1436e05;
        this.f16479A = c1436e05;
        String str = (String) c1459l0.m37005b("EXTRA_FOR_PURCHASE_ID");
        if (str != null) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C5970a(str, null), 3, null);
        }
    }

    /* renamed from: V */
    public static final /* synthetic */ PurchasesManager m22568V(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16480q;
    }

    /* renamed from: W */
    public static final /* synthetic */ C1436e0 m22567W(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16483t;
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m22566X(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16485v;
    }

    /* renamed from: Y */
    public static final /* synthetic */ C1436e0 m22565Y(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16489z;
    }

    /* renamed from: Z */
    public static final /* synthetic */ C1436e0 m22564Z(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16487x;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C1436e0 m22563a0(PurchaseDetailViewModel purchaseDetailViewModel) {
        return purchaseDetailViewModel.f16481r;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ Object m22562b0(PurchaseDetailViewModel purchaseDetailViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return purchaseDetailViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: c0 */
    public static final /* synthetic */ void m22561c0(PurchaseDetailViewModel purchaseDetailViewModel, boolean z) {
        purchaseDetailViewModel.m20381p(z);
    }

    /* renamed from: d0 */
    public final boolean m22560d0(List list) {
        Intrinsics.isThisObjectNull(list, "products");
        return this.f16480q.m18452a(list);
    }

    /* renamed from: e0 */
    public final LiveData m22559e0() {
        return this.f16484u;
    }

    /* renamed from: f0 */
    public final LiveData m22558f0() {
        return this.f16486w;
    }

    /* renamed from: g0 */
    public final LiveData m22557g0() {
        return this.f16479A;
    }

    /* renamed from: h0 */
    public final LiveData m22556h0() {
        return this.f16488y;
    }

    /* renamed from: i0 */
    public final LiveData m22555i0() {
        return this.f16482s;
    }
}
