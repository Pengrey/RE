package p319qi;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.LoyaltyCardManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.C8082c;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;
import td.InterfaceC10524i0;

/* renamed from: qi.d */
/* loaded from: classes2.dex */
public abstract class ManageAssociationsViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final LoyaltyCardManager f25620p;

    /* renamed from: q */
    private final C1436e0 f25621q;

    /* renamed from: r */
    private final C1436e0 f25622r;

    /* renamed from: s */
    private final LiveData f25623s;

    /* renamed from: t */
    private LiveData f25624t;

    /* renamed from: u */
    private final C1436e0 f25625u;

    /* renamed from: v */
    private final LiveData f25626v;

    /* renamed from: w */
    private LiveData f25627w;

    /* compiled from: Transformations.kt */
    /* renamed from: qi.d$a */
    /* loaded from: classes2.dex */
    public static final class C9740a<I, O> implements InterfaceC7946a {
        public C9740a() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List list = (List) obj;
            Collection collection = (Collection) ManageAssociationsViewModel.m10059S(ManageAssociationsViewModel.this).mo172f();
            return Boolean.valueOf(!(collection == null || collection.isEmpty()));
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: qi.d$b */
    /* loaded from: classes2.dex */
    public static final class C9741b<I, O> implements InterfaceC7946a {
        public C9741b() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List list = (List) obj;
            Collection collection = (Collection) ManageAssociationsViewModel.m10058T(ManageAssociationsViewModel.this).mo172f();
            return Boolean.valueOf(!(collection == null || collection.isEmpty()));
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: qi.d$c */
    /* loaded from: classes2.dex */
    public static final class C9742c<I, O> implements InterfaceC7946a {
        public C9742c() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List list = (List) obj;
            Collection collection = (Collection) ManageAssociationsViewModel.m10059S(ManageAssociationsViewModel.this).mo172f();
            return Boolean.valueOf(!(collection == null || collection.isEmpty()));
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: qi.d$d */
    /* loaded from: classes2.dex */
    public static final class C9743d<I, O> implements InterfaceC7946a {
        public C9743d() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List list = (List) obj;
            Collection collection = (Collection) ManageAssociationsViewModel.m10058T(ManageAssociationsViewModel.this).mo172f();
            return Boolean.valueOf(!(collection == null || collection.isEmpty()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ManageAssociationsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyalty.ManageAssociationsViewModel$submitRequest$1", m20196f = "ManageAssociationsViewModel.kt", m20195l = {37}, m20194m = "invokeSuspend")
    /* renamed from: qi.d$e */
    /* loaded from: classes2.dex */
    public static final class C9744e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ boolean f25632A;

        /* renamed from: x */
        int f25633x;

        /* renamed from: z */
        final /* synthetic */ LoyaltyCardAssociation f25635z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ManageAssociationsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyalty.ManageAssociationsViewModel$submitRequest$1$1", m20196f = "ManageAssociationsViewModel.kt", m20195l = {38}, m20194m = "invokeSuspend")
        /* renamed from: qi.d$e$a */
        /* loaded from: classes2.dex */
        public static final class C9745a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ boolean f25636A;

            /* renamed from: x */
            int f25637x;

            /* renamed from: y */
            final /* synthetic */ ManageAssociationsViewModel f25638y;

            /* renamed from: z */
            final /* synthetic */ LoyaltyCardAssociation f25639z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ManageAssociationsViewModel.kt */
            /* renamed from: qi.d$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C9746a extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ ManageAssociationsViewModel f25640w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C9746a(ManageAssociationsViewModel manageAssociationsViewModel) {
                    super(1);
                    this.f25640w = manageAssociationsViewModel;
                }

                /* renamed from: a */
                public final void m10043a(List list) {
                    Intrinsics.isThisObjectNull(list, "it");
                    ManageAssociationsViewModel.m10060R(this.f25640w).m18937i(list);
                    this.f25640w.m10051a0();
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m10043a((List) obj);
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9745a(ManageAssociationsViewModel manageAssociationsViewModel, LoyaltyCardAssociation loyaltyCardAssociation, boolean z, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f25638y = manageAssociationsViewModel;
                this.f25639z = loyaltyCardAssociation;
                this.f25636A = z;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9745a(this.f25638y, this.f25639z, this.f25636A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9745a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f25637x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    LoyaltyCardManager m10060R = ManageAssociationsViewModel.m10060R(this.f25638y);
                    String m13784a = this.f25639z.m13784a();
                    boolean z = this.f25636A;
                    this.f25637x = 1;
                    obj = m10060R.m18920z(m13784a, z, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                C8082c.m16958b((Result) obj, new C9746a(this.f25638y));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9744e(LoyaltyCardAssociation loyaltyCardAssociation, boolean z, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f25635z = loyaltyCardAssociation;
            this.f25632A = z;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9744e(this.f25635z, this.f25632A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9744e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25633x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ManageAssociationsViewModel manageAssociationsViewModel = ManageAssociationsViewModel.this;
                C9745a c9745a = new C9745a(manageAssociationsViewModel, this.f25635z, this.f25632A, null);
                this.f25633x = 1;
                if (ManageAssociationsViewModel.m10057U(manageAssociationsViewModel, true, c9745a, this) == m34636d) {
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
    public ManageAssociationsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Collection m197g;
        Collection m197g2;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f25620p = loyaltyCardManager;
        C1436e0 m37003d = c1459l0.m37003d("_list", loyaltyCardManager.m18926t());
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…dAssociationsFromCache())");
        this.f25621q = m37003d;
        List list = (List) m37003d.mo172f();
        if (list != null) {
            m197g = new ArrayList();
            for (Object obj : list) {
                if (!((LoyaltyCardAssociation) obj).m13783b()) {
                    m197g.add(obj);
                }
            }
        } else {
            m197g = C13780s.m197g();
        }
        C1436e0 m37003d2 = c1459l0.m37003d("_approvedList", m197g);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…pending } ?: emptyList())");
        this.f25622r = m37003d2;
        this.f25623s = m37003d2;
        LiveData m36993a = C1465n0.m36993a(m37003d2, new C9742c());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f25624t = m36993a;
        List list2 = (List) this.f25621q.mo172f();
        if (list2 != null) {
            m197g2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((LoyaltyCardAssociation) obj2).m13783b()) {
                    m197g2.add(obj2);
                }
            }
        } else {
            m197g2 = C13780s.m197g();
        }
        C1436e0 m37003d3 = c1459l0.m37003d("_pendingList", m197g2);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(…pending } ?: emptyList())");
        this.f25625u = m37003d3;
        this.f25626v = m37003d3;
        LiveData m36993a2 = C1465n0.m36993a(m37003d3, new C9743d());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f25627w = m36993a2;
    }

    /* renamed from: R */
    public static final /* synthetic */ LoyaltyCardManager m10060R(ManageAssociationsViewModel manageAssociationsViewModel) {
        return manageAssociationsViewModel.f25620p;
    }

    /* renamed from: S */
    public static final /* synthetic */ C1436e0 m10059S(ManageAssociationsViewModel manageAssociationsViewModel) {
        return manageAssociationsViewModel.f25622r;
    }

    /* renamed from: T */
    public static final /* synthetic */ C1436e0 m10058T(ManageAssociationsViewModel manageAssociationsViewModel) {
        return manageAssociationsViewModel.f25625u;
    }

    /* renamed from: U */
    public static final /* synthetic */ Object m10057U(ManageAssociationsViewModel manageAssociationsViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return manageAssociationsViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: V */
    public final LiveData m10056V() {
        return this.f25623s;
    }

    /* renamed from: W */
    public final LiveData m10055W() {
        return this.f25626v;
    }

    /* renamed from: X */
    public final LiveData m10054X() {
        return this.f25624t;
    }

    /* renamed from: Y */
    public final LiveData m10053Y() {
        return this.f25627w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public final C1436e0 m10052Z() {
        return this.f25621q;
    }

    /* renamed from: a0 */
    public final void m10051a0() {
        ArrayList arrayList;
        this.f25621q.mo166p(this.f25620p.m18926t());
        C1436e0 c1436e0 = this.f25622r;
        List list = (List) this.f25621q.mo172f();
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((LoyaltyCardAssociation) obj).m13783b()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        c1436e0.mo166p(arrayList);
        LiveData m36993a = C1465n0.m36993a(this.f25623s, new C9740a());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f25624t = m36993a;
        C1436e0 c1436e02 = this.f25625u;
        List list2 = (List) this.f25621q.mo172f();
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((LoyaltyCardAssociation) obj2).m13783b()) {
                    arrayList2.add(obj2);
                }
            }
        }
        c1436e02.mo166p(arrayList2);
        LiveData m36993a2 = C1465n0.m36993a(this.f25626v, new C9741b());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f25627w = m36993a2;
    }

    /* renamed from: b0 */
    public final void m10050b0(LoyaltyCardAssociation loyaltyCardAssociation, boolean z) {
        Intrinsics.isThisObjectNull(loyaltyCardAssociation, "listItem");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9744e(loyaltyCardAssociation, z, null), 3, null);
    }
}
