package dj;

import androidx.constraintlayout.widget.C0868i;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7256f1;
import mg.C7310l;
import p145hj.CartViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p447xe.NoConnectionException;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Collections;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import td.InterfaceC10524i0;

/* renamed from: dj.g */
/* loaded from: classes2.dex */
public abstract class ProductListViewModel extends CartViewModel {

    /* renamed from: A */
    private final C1436e0 f13317A;

    /* renamed from: B */
    private final C1436e0 f13318B;

    /* renamed from: C */
    private C1436e0 f13319C;

    /* renamed from: D */
    private final C1436e0 f13320D;

    /* renamed from: E */
    private final C1436e0 f13321E;

    /* renamed from: F */
    private final C1436e0 f13322F;

    /* renamed from: G */
    private boolean f13323G;

    /* renamed from: H */
    private final InterfaceC6108l f13324H;

    /* renamed from: q */
    private final C7310l f13325q;

    /* renamed from: r */
    private final C1436e0 f13326r;

    /* renamed from: s */
    private final C1436e0 f13327s;

    /* renamed from: t */
    private final C1436e0 f13328t;

    /* renamed from: u */
    private final C1436e0 f13329u;

    /* renamed from: v */
    private final C1436e0 f13330v;

    /* renamed from: w */
    private final LiveData f13331w;

    /* renamed from: x */
    private final C1436e0 f13332x;

    /* renamed from: y */
    private final LiveData f13333y;

    /* renamed from: z */
    private final LiveData f13334z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListViewModel.kt */
    /* renamed from: dj.g$a */
    /* loaded from: classes2.dex */
    public static final class C4883a extends AbstractC6438m implements InterfaceC6108l {
        C4883a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26364a(C13195u c13195u) {
            SearchCatalogParameters searchCatalogParameters;
            String str;
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (!Intrinsics.equals(ProductListViewModel.this.m20387j().mo172f(), Boolean.FALSE) || (searchCatalogParameters = (SearchCatalogParameters) ProductListViewModel.this.m26372o0().mo172f()) == null) {
                return;
            }
            ProductListViewModel productListViewModel = ProductListViewModel.this;
            Integer num = (Integer) ProductListViewModel.m26384c0(productListViewModel).mo172f();
            if (num == null || (str = (String) ProductListViewModel.m26382e0(productListViewModel).mo172f()) == null) {
                return;
            }
            Intrinsics.checkIfNull(str, "totalHits");
            ProductListViewModel.m26380g0(productListViewModel, Integer.parseInt(str) == 0);
            if (ProductListViewModel.m26385b0(productListViewModel) || Integer.parseInt(str) <= num.intValue() * searchCatalogParameters.m13985n()) {
                return;
            }
            productListViewModel.m26369r0(SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, num.intValue() + 1, 0, false, 229375, null));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m26364a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.list.ProductListViewModel$searchCatalog$1", m20196f = "ProductListViewModel.kt", m20195l = {C0868i.f2993y0}, m20194m = "invokeSuspend")
    /* renamed from: dj.g$b */
    /* loaded from: classes2.dex */
    public static final class C4884b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13336x;

        /* renamed from: z */
        final /* synthetic */ SearchCatalogParameters f13338z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProductListViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.list.ProductListViewModel$searchCatalog$1$1", m20196f = "ProductListViewModel.kt", m20195l = {C0868i.f2998z0}, m20194m = "invokeSuspend")
        /* renamed from: dj.g$b$a */
        /* loaded from: classes2.dex */
        public static final class C4885a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f13339x;

            /* renamed from: y */
            final /* synthetic */ ProductListViewModel f13340y;

            /* renamed from: z */
            final /* synthetic */ SearchCatalogParameters f13341z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4885a(ProductListViewModel productListViewModel, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f13340y = productListViewModel;
                this.f13341z = searchCatalogParameters;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C4885a(this.f13340y, this.f13341z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C4885a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m453p0;
                m34636d = C2116d.m34636d();
                int i = this.f13339x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m26386a0 = ProductListViewModel.m26386a0(this.f13340y);
                    SearchCatalogParameters searchCatalogParameters = this.f13341z;
                    this.f13339x = 1;
                    obj = C7310l.m18719x(m26386a0, searchCatalogParameters, false, this, 2, null);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    ProductListViewModel.m26379h0(this.f13340y, false);
                    Result.C8078c c8078c = (Result.C8078c) result;
                    this.f13340y.m22604Y(((CatalogResponse) c8078c.m16962b()).m13885a());
                    ProductListViewModel.m26382e0(this.f13340y).mo166p(String.valueOf(((CatalogResponse) c8078c.m16962b()).m13883c()));
                    List<CatalogProduct> m13884b = ((CatalogResponse) c8078c.m16962b()).m13884b();
                    ProductListViewModel productListViewModel = this.f13340y;
                    for (CatalogProduct catalogProduct : m13884b) {
                        catalogProduct.m14521X(0);
                        ShoppingListProduct m22607V = productListViewModel.m22607V(catalogProduct.m14499y());
                        if (m22607V != null) {
                            catalogProduct.m14521X(m22607V.m14332j() ? catalogProduct.m14538G() : m22607V.m14327s());
                        }
                    }
                    if (this.f13341z.m13986m() == 1) {
                        C1436e0 m26383d0 = ProductListViewModel.m26383d0(this.f13340y);
                        m453p0 = _Collections.m453p0(m13884b);
                        m26383d0.mo166p(m453p0);
                    } else if (!m13884b.isEmpty()) {
                        UtilsExtensions.m35166f(ProductListViewModel.m26383d0(this.f13340y), m13884b);
                        ProductListViewModel.m26384c0(this.f13340y).mo166p(C6755b.m20199c(this.f13341z.m13986m()));
                    }
                    this.f13340y.m26372o0().mo166p(this.f13341z);
                } else if ((result instanceof Result.C8077b) && (((Result.C8077b) result).m16964b() instanceof NoConnectionException)) {
                    List list = (List) ProductListViewModel.m26383d0(this.f13340y).mo172f();
                    if (list != null && list.isEmpty()) {
                        ProductListViewModel.m26379h0(this.f13340y, true);
                    }
                }
                ProductListViewModel.m26381f0(this.f13340y).mo166p(C6755b.m20201a(false));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4884b(SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13338z = searchCatalogParameters;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4884b(this.f13338z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4884b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13336x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ProductListViewModel productListViewModel = ProductListViewModel.this;
                C4885a c4885a = new C4885a(productListViewModel, this.f13338z, null);
                this.f13336x = 1;
                if (CoreBaseViewModel.m20383n(productListViewModel, false, c4885a, this, 1, null) == m34636d) {
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
    public ProductListViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l) {
        super(c1459l0, resourcesProvider, c7256f1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        this.f13325q = c7310l;
        Boolean bool = Boolean.TRUE;
        C1436e0 c1436e0 = new C1436e0(bool);
        this.f13326r = c1436e0;
        this.f13327s = c1436e0;
        Boolean bool2 = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_shouldBottomMenuBeVisible", bool2);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…tomMenuBeVisible\", false)");
        this.f13328t = m37003d;
        C1436e0 c1436e02 = new C1436e0(new ArrayList());
        this.f13329u = c1436e02;
        C1436e0 c1436e03 = new C1436e0(bool);
        this.f13330v = c1436e03;
        this.f13331w = c1436e03;
        this.f13332x = m37003d;
        this.f13333y = m106t(C7310l.m18726q(c7310l, false, 1, null));
        this.f13334z = c1436e02;
        this.f13317A = new C1436e0(new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262143, null));
        C1436e0 m37003d2 = c1459l0.m37003d("_productsTotal", "0");
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(\"_productsTotal\", \"0\")");
        this.f13318B = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_lastPage", 1);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(\"_lastPage\", 1)");
        this.f13319C = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("_categoryId", null);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<Int>(\"_categoryId\", null)");
        this.f13320D = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_flyerId", null);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData<Int>(\"_flyerId\", null)");
        this.f13321E = m37003d5;
        C1436e0 m37003d6 = c1459l0.m37003d("_hasPromo", bool2);
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData(\"_hasPromo\", false)");
        this.f13322F = m37003d6;
        this.f13324H = OperatorExtensions.m35176e(0L, null, new C4883a(), 3, null);
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C7310l m26386a0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13325q;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ boolean m26385b0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13323G;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ C1436e0 m26384c0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13319C;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ C1436e0 m26383d0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13329u;
    }

    /* renamed from: e0 */
    public static final /* synthetic */ C1436e0 m26382e0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13318B;
    }

    /* renamed from: f0 */
    public static final /* synthetic */ C1436e0 m26381f0(ProductListViewModel productListViewModel) {
        return productListViewModel.f13330v;
    }

    /* renamed from: g0 */
    public static final /* synthetic */ void m26380g0(ProductListViewModel productListViewModel, boolean z) {
        productListViewModel.f13323G = z;
    }

    /* renamed from: h0 */
    public static final /* synthetic */ void m26379h0(ProductListViewModel productListViewModel, boolean z) {
        productListViewModel.m20350O(z);
    }

    /* renamed from: i0 */
    public final void m26378i0() {
        this.f13326r.mo166p(Boolean.FALSE);
    }

    /* renamed from: j0 */
    public LiveData m26377j0() {
        return this.f13333y;
    }

    /* renamed from: k0 */
    public LiveData m26376k0() {
        return this.f13334z;
    }

    /* renamed from: l0 */
    public final C1436e0 m26375l0() {
        return this.f13332x;
    }

    /* renamed from: m0 */
    public final C1436e0 m26374m0() {
        return this.f13327s;
    }

    /* renamed from: n0 */
    public final LiveData m26373n0() {
        return this.f13331w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public final C1436e0 m26372o0() {
        return this.f13317A;
    }

    /* renamed from: p0 */
    public final void m26371p0() {
        this.f13324H.mo9587d(C13195u.f34156a);
    }

    /* renamed from: q0 */
    public final void m26370q0() {
        C1436e0 c1436e0 = this.f13329u;
        T mo172f = c1436e0.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        c1436e0.mo166p(m22603Z((List) mo172f));
    }

    /* renamed from: r0 */
    public final void m26369r0(SearchCatalogParameters searchCatalogParameters) {
        Intrinsics.isThisObjectNull(searchCatalogParameters, "searchCatalogParameters");
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C4884b(SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, (Boolean) this.f13322F.mo172f(), (Integer) this.f13320D.mo172f(), false, (Integer) this.f13321E.mo172f(), null, null, null, null, null, null, 0, 0, false, 261791, null), null), 3, null);
    }

    /* renamed from: s0 */
    public final void m26368s0(int i) {
        this.f13320D.mo166p(Integer.valueOf(i));
    }

    /* renamed from: t0 */
    public final void m26367t0(int i) {
        this.f13321E.mo166p(Integer.valueOf(i));
    }

    /* renamed from: u0 */
    public final void m26366u0(boolean z) {
        this.f13322F.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: v0 */
    public final void m26365v0(boolean z) {
        this.f13328t.mo166p(Boolean.valueOf(z));
    }
}
