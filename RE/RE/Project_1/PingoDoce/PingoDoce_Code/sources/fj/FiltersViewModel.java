package fj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7256f1;
import mg.C7310l;
import mg.CatalogManager;
import p145hj.CartViewModel;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13190q;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc._Collections;
import pt.pingodoce.app.data.remote.models.response.CriteriaResponse;
import pt.pingodoce.app.presentation.common.search.models.Brand;
import pt.pingodoce.app.presentation.common.search.models.Criteria;
import td.InterfaceC10524i0;

/* renamed from: fj.j */
/* loaded from: classes2.dex */
public final class FiltersViewModel extends CartViewModel {

    /* renamed from: q */
    private final C7310l f15694q;

    /* renamed from: r */
    private final C1436e0 f15695r;

    /* renamed from: s */
    private final LiveData f15696s;

    /* renamed from: t */
    private final C1436e0 f15697t;

    /* renamed from: u */
    private final LiveData f15698u;

    /* renamed from: v */
    private final C1436e0 f15699v;

    /* renamed from: w */
    private final LiveData f15700w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiltersViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.FiltersViewModel$getFilterData$1", m20196f = "FiltersViewModel.kt", m20195l = {42}, m20194m = "invokeSuspend")
    /* renamed from: fj.j$a */
    /* loaded from: classes2.dex */
    public static final class C5538a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15701x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FiltersViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.FiltersViewModel$getFilterData$1$1", m20196f = "FiltersViewModel.kt", m20195l = {43}, m20194m = "invokeSuspend")
        /* renamed from: fj.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C5539a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f15703x;

            /* renamed from: y */
            final /* synthetic */ FiltersViewModel f15704y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5539a(FiltersViewModel filtersViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f15704y = filtersViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C5539a(this.f15704y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C5539a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m453p0;
                List m453p02;
                m34636d = C2116d.m34636d();
                int i = this.f15703x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m23775a0 = FiltersViewModel.m23775a0(this.f15704y);
                    this.f15703x = 1;
                    obj = m23775a0.m18732k(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                CatalogManager catalogManager = (CatalogManager) obj;
                if (catalogManager instanceof CatalogManager.C7198b) {
                    FiltersViewModel.m23770f0(this.f15704y, false);
                    C1436e0 m23773c0 = FiltersViewModel.m23773c0(this.f15704y);
                    CatalogManager.C7198b c7198b = (CatalogManager.C7198b) catalogManager;
                    m453p0 = _Collections.m453p0(c7198b.m18957a().m12329b());
                    m23773c0.mo166p(m453p0);
                    C1436e0 m23774b0 = FiltersViewModel.m23774b0(this.f15704y);
                    m453p02 = _Collections.m453p0(c7198b.m18957a().m12330a());
                    m23774b0.mo166p(m453p02);
                    FiltersViewModel filtersViewModel = this.f15704y;
                    FiltersViewModel.m23771e0(filtersViewModel, filtersViewModel.m23768h0());
                } else if (catalogManager instanceof CatalogManager.AbstractC7196a) {
                    FiltersViewModel.m23770f0(this.f15704y, true);
                }
                return C13195u.f34156a;
            }
        }

        C5538a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5538a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5538a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f15701x;
            if (i == 0) {
                C13186n.m1453b(obj);
                FiltersViewModel filtersViewModel = FiltersViewModel.this;
                C5539a c5539a = new C5539a(filtersViewModel, null);
                this.f15701x = 1;
                if (FiltersViewModel.m23772d0(filtersViewModel, true, c5539a, this) == m34636d) {
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
    public FiltersViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        super(c1459l0, resourcesProvider, c7256f1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        this.f15694q = c7310l;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f15695r = c1436e0;
        this.f15696s = c1436e0;
        C1436e0 c1436e02 = new C1436e0(new ArrayList());
        this.f15697t = c1436e02;
        this.f15698u = c1436e02;
        C1436e0 m37003d = c1459l0.m37003d("_allBrands", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_allBrands\", false)");
        this.f15699v = m37003d;
        this.f15700w = m37003d;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C7310l m23775a0(FiltersViewModel filtersViewModel) {
        return filtersViewModel.f15694q;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ C1436e0 m23774b0(FiltersViewModel filtersViewModel) {
        return filtersViewModel.f15695r;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ C1436e0 m23773c0(FiltersViewModel filtersViewModel) {
        return filtersViewModel.f15697t;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ Object m23772d0(FiltersViewModel filtersViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return filtersViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: e0 */
    public static final /* synthetic */ void m23771e0(FiltersViewModel filtersViewModel, C13190q c13190q) {
        filtersViewModel.m23756t0(c13190q);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ void m23770f0(FiltersViewModel filtersViewModel, boolean z) {
        filtersViewModel.m20350O(z);
    }

    /* renamed from: g0 */
    private final boolean m23769g0() {
        boolean z;
        List list;
        List list2 = (List) this.f15695r.mo172f();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C13780s.m187q();
                }
                Brand brand = (Brand) obj;
                if (i != 0) {
                    arrayList.add(obj);
                }
                i = i2;
            }
            z = !arrayList.isEmpty();
        } else {
            z = false;
        }
        if (z) {
            if (((List) this.f15697t.mo172f()) != null ? !list.isEmpty() : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    private final void m23764l0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C5538a(null), 3, null);
    }

    /* renamed from: t0 */
    private final void m23756t0(C13190q c13190q) {
        m23759q0(0);
        m23757s0((List) c13190q.m1449b());
        m23758r0(((Boolean) c13190q.m1448c()).booleanValue());
    }

    /* renamed from: N */
    protected void m23776N() {
        m23764l0();
    }

    /* renamed from: h0 */
    public final C13190q m23768h0() {
        return this.f15694q.m18730m();
    }

    /* renamed from: i0 */
    public final LiveData m23767i0() {
        return this.f15700w;
    }

    /* renamed from: j0 */
    public final LiveData m23766j0() {
        return this.f15696s;
    }

    /* renamed from: k0 */
    public final List m23765k0(boolean z) {
        int m186r;
        List m453p0;
        List<Brand> list = (List) this.f15695r.mo172f();
        if (list != null) {
            m186r = Iterables.m186r(list, 10);
            ArrayList arrayList = new ArrayList(m186r);
            for (Brand brand : list) {
                arrayList.add(Brand.m12342b(brand, 0, null, z, 3, null));
            }
            m453p0 = _Collections.m453p0(arrayList);
            if (m453p0 != null) {
                return m453p0;
            }
        }
        return new ArrayList();
    }

    /* renamed from: m0 */
    public final List m23763m0() {
        ArrayList arrayList;
        int m186r;
        List list = (List) this.f15695r.mo172f();
        boolean z = true;
        if (list != null) {
            ArrayList<Brand> arrayList2 = new ArrayList();
            for (Object obj : list) {
                Brand brand = (Brand) obj;
                if (brand.m12340d() != 0 && brand.m12339e()) {
                    arrayList2.add(obj);
                }
            }
            m186r = Iterables.m186r(arrayList2, 10);
            arrayList = new ArrayList(m186r);
            for (Brand brand2 : arrayList2) {
                arrayList.add(Integer.valueOf(Integer.parseInt(brand2.m12341c().m13912a())));
            }
        } else {
            arrayList = null;
        }
        if ((arrayList == null || !arrayList.isEmpty()) ? false : false) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: n0 */
    public final String m23762n0() {
        Object obj;
        CriteriaResponse m12334c;
        List list = (List) this.f15697t.mo172f();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Criteria) obj).m12333d()) {
                    break;
                }
            }
            Criteria criteria = (Criteria) obj;
            if (criteria == null || (m12334c = criteria.m12334c()) == null) {
                return null;
            }
            return m12334c.m13855b();
        }
        return null;
    }

    /* renamed from: o0 */
    public final LiveData m23761o0() {
        return this.f15698u;
    }

    /* renamed from: p0 */
    public final boolean m23760p0() {
        C13190q m23768h0 = m23768h0();
        return Intrinsics.equals(this.f15698u.mo172f(), m23768h0.m1450a()) && Intrinsics.equals(this.f15696s.mo172f(), m23768h0.m1449b()) && Intrinsics.equals(this.f15700w.mo172f(), m23768h0.m1448c());
    }

    /* renamed from: q0 */
    public final void m23759q0(int i) {
        int m186r;
        C1436e0 c1436e0 = this.f15697t;
        List list = (List) c1436e0.mo172f();
        List list2 = null;
        if (list != null) {
            m186r = Iterables.m186r(list, 10);
            ArrayList arrayList = new ArrayList(m186r);
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C13780s.m187q();
                }
                arrayList.add(Criteria.m12335b((Criteria) obj, null, i2 == i, 1, null));
                i2 = i3;
            }
            list2 = _Collections.m453p0(arrayList);
        }
        c1436e0.mo166p(list2);
    }

    /* renamed from: r0 */
    public final void m23758r0(boolean z) {
        this.f15699v.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: s0 */
    public final void m23757s0(List list) {
        List m453p0;
        Intrinsics.isThisObjectNull(list, "brands");
        C1436e0 c1436e0 = this.f15695r;
        m453p0 = _Collections.m453p0(list);
        c1436e0.mo166p(m453p0);
    }

    /* renamed from: u0 */
    public final void m23755u0() {
        if (m23769g0()) {
            return;
        }
        m23764l0();
    }
}
