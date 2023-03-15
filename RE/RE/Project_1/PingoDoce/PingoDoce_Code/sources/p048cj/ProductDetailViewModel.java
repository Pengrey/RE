package p048cj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7256f1;
import mg.C7310l;
import mg.TransactionCacheManager;
import p070e.C4906j;
import p145hj.CartViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p447xe.NoConnectionException;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import p489zc._Collections;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import td.InterfaceC10524i0;

/* renamed from: cj.i */
/* loaded from: classes2.dex */
public final class ProductDetailViewModel extends CartViewModel {

    /* renamed from: A */
    private final LiveData f6202A;

    /* renamed from: B */
    private final LiveData f6203B;

    /* renamed from: C */
    private final LiveData f6204C;

    /* renamed from: D */
    private final LiveData f6205D;

    /* renamed from: E */
    private final LiveData f6206E;

    /* renamed from: F */
    private boolean f6207F;

    /* renamed from: G */
    private final InterfaceC6108l f6208G;

    /* renamed from: q */
    private final C7310l f6209q;

    /* renamed from: r */
    private final C1436e0 f6210r;

    /* renamed from: s */
    private final C1436e0 f6211s;

    /* renamed from: t */
    private final C1436e0 f6212t;

    /* renamed from: u */
    private final C1436e0 f6213u;

    /* renamed from: v */
    private final C1436e0 f6214v;

    /* renamed from: w */
    private C1436e0 f6215w;

    /* renamed from: x */
    private final C1436e0 f6216x;

    /* renamed from: y */
    private final C1436e0 f6217y;

    /* renamed from: z */
    private final LiveData f6218z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductDetailViewModel.kt */
    /* renamed from: cj.i$a */
    /* loaded from: classes2.dex */
    public static final class C2162a extends AbstractC6438m implements InterfaceC6108l {
        C2162a() {
            super(1);
        }

        /* renamed from: a */
        public final void m34547a(C13195u c13195u) {
            SearchCatalogParameters searchCatalogParameters;
            String str;
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (!Intrinsics.equals(ProductDetailViewModel.this.m20387j().mo172f(), Boolean.FALSE) || (searchCatalogParameters = (SearchCatalogParameters) ProductDetailViewModel.m34562g0(ProductDetailViewModel.this).mo172f()) == null) {
                return;
            }
            ProductDetailViewModel productDetailViewModel = ProductDetailViewModel.this;
            Integer num = (Integer) ProductDetailViewModel.m34565d0(productDetailViewModel).mo172f();
            if (num == null || (str = (String) ProductDetailViewModel.m34563f0(productDetailViewModel).mo172f()) == null) {
                return;
            }
            Intrinsics.checkIfNull(str, "totalHits");
            ProductDetailViewModel.m34558k0(productDetailViewModel, Integer.parseInt(str) == 0);
            if (ProductDetailViewModel.m34567b0(productDetailViewModel) || Integer.parseInt(str) <= num.intValue() * searchCatalogParameters.m13985n()) {
                return;
            }
            ProductDetailViewModel.m34549t0(productDetailViewModel, SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, num.intValue() + 1, 0, false, 229375, null), false, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m34547a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.ProductDetailViewModel$searchCatalog$1", m20196f = "ProductDetailViewModel.kt", m20195l = {C4906j.f13385B0}, m20194m = "invokeSuspend")
    /* renamed from: cj.i$b */
    /* loaded from: classes2.dex */
    public static final class C2163b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ SearchCatalogParameters f6220A;

        /* renamed from: x */
        int f6221x;

        /* renamed from: z */
        final /* synthetic */ boolean f6223z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProductDetailViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.ProductDetailViewModel$searchCatalog$1$1", m20196f = "ProductDetailViewModel.kt", m20195l = {C4906j.f13390C0}, m20194m = "invokeSuspend")
        /* renamed from: cj.i$b$a */
        /* loaded from: classes2.dex */
        public static final class C2164a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f6224x;

            /* renamed from: y */
            final /* synthetic */ ProductDetailViewModel f6225y;

            /* renamed from: z */
            final /* synthetic */ SearchCatalogParameters f6226z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2164a(ProductDetailViewModel productDetailViewModel, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f6225y = productDetailViewModel;
                this.f6226z = searchCatalogParameters;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C2164a(this.f6225y, this.f6226z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C2164a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                List m453p0;
                m34636d = C2116d.m34636d();
                int i = this.f6224x;
                boolean z = false;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m34568a0 = ProductDetailViewModel.m34568a0(this.f6225y);
                    SearchCatalogParameters searchCatalogParameters = this.f6226z;
                    this.f6224x = 1;
                    obj = m34568a0.m18720w(searchCatalogParameters, false, this);
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
                    ProductDetailViewModel.m34561h0(this.f6225y).mo166p(C6755b.m20201a(false));
                    Result.C8078c c8078c = (Result.C8078c) result;
                    ProductDetailViewModel.m34563f0(this.f6225y).mo166p(String.valueOf(((CatalogResponse) c8078c.m16962b()).m13883c()));
                    this.f6225y.m22604Y(((CatalogResponse) c8078c.m16962b()).m13885a());
                    List<CatalogProduct> m13884b = ((CatalogResponse) c8078c.m16962b()).m13884b();
                    ProductDetailViewModel productDetailViewModel = this.f6225y;
                    for (CatalogProduct catalogProduct : m13884b) {
                        catalogProduct.m14521X(0);
                        ShoppingListProduct m22607V = productDetailViewModel.m22607V(catalogProduct.m14499y());
                        if (m22607V != null) {
                            catalogProduct.m14521X(m22607V.m14332j() ? catalogProduct.m14538G() : m22607V.m14327s());
                        }
                    }
                    if (this.f6226z.m13986m() == 1) {
                        C1436e0 m34564e0 = ProductDetailViewModel.m34564e0(this.f6225y);
                        m453p0 = _Collections.m453p0(m13884b);
                        m34564e0.mo166p(m453p0);
                    } else if (!m13884b.isEmpty()) {
                        UtilsExtensions.m35166f(ProductDetailViewModel.m34564e0(this.f6225y), m13884b);
                        ProductDetailViewModel.m34565d0(this.f6225y).mo166p(C6755b.m20199c(this.f6226z.m13986m()));
                    }
                    ProductDetailViewModel.m34562g0(this.f6225y).mo166p(this.f6226z);
                } else if ((result instanceof Result.C8077b) && (((Result.C8077b) result).m16964b() instanceof NoConnectionException)) {
                    List list = (List) ProductDetailViewModel.m34564e0(this.f6225y).mo172f();
                    if (list != null && list.isEmpty()) {
                        z = true;
                    }
                    if (z) {
                        ProductDetailViewModel.m34561h0(this.f6225y).mo166p(C6755b.m20201a(true));
                    } else {
                        ProductDetailViewModel productDetailViewModel2 = this.f6225y;
                        String string = ProductDetailViewModel.m34566c0(productDetailViewModel2).m6899a().getString(C2336R.string.err_no_internet);
                        Intrinsics.checkIfNull(string, "ctx.getString(id)");
                        ProductDetailViewModel.m34560i0(productDetailViewModel2, string);
                    }
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2163b(boolean z, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f6223z = z;
            this.f6220A = searchCatalogParameters;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C2163b(this.f6223z, this.f6220A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C2163b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f6221x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BaseViewModel.m111K(ProductDetailViewModel.this, this.f6223z, false, 2, null);
                ProductDetailViewModel productDetailViewModel = ProductDetailViewModel.this;
                C2164a c2164a = new C2164a(productDetailViewModel, this.f6220A, null);
                this.f6221x = 1;
                if (ProductDetailViewModel.m34559j0(productDetailViewModel, !this.f6223z, c2164a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m111K(ProductDetailViewModel.this, false, false, 2, null);
            return C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: cj.i$c */
    /* loaded from: classes2.dex */
    public static final class C2165c<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((CatalogProduct) obj).m14504r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, TransactionCacheManager transactionCacheManager, C7310l c7310l) {
        super(c1459l0, resourcesProvider, c7256f1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        this.f6209q = c7310l;
        C1436e0 m37003d = c1459l0.m37003d("_shouldShowInfo", Boolean.TRUE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_shouldShowInfo\", true)");
        this.f6210r = m37003d;
        C1436e0 c1436e0 = new C1436e0();
        this.f6211s = c1436e0;
        C1436e0 m37003d2 = c1459l0.m37003d("_shouldNoConnectionBeVisible", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…nectionBeVisible\", false)");
        this.f6212t = m37003d2;
        C1436e0 c1436e02 = new C1436e0(transactionCacheManager.m18585e());
        this.f6213u = c1436e02;
        C1436e0 m37003d3 = c1459l0.m37003d("_productsTotal", "0");
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(\"_productsTotal\", \"0\")");
        this.f6214v = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("_lastPage", 1);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData(\"_lastPage\", 1)");
        this.f6215w = m37003d4;
        C1436e0 c1436e03 = new C1436e0(new ArrayList());
        this.f6216x = c1436e03;
        this.f6217y = new C1436e0(new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262143, null));
        this.f6218z = m37003d;
        this.f6202A = m37003d2;
        this.f6203B = c1436e03;
        this.f6204C = c1436e02;
        this.f6205D = c1436e0;
        LiveData m36993a = C1465n0.m36993a(c1436e02, new C2165c());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f6206E = m36993a;
        this.f6208G = OperatorExtensions.m35176e(0L, null, new C2162a(), 3, null);
        CatalogProduct catalogProduct = (CatalogProduct) c1436e02.mo172f();
        if (catalogProduct != null) {
            ShoppingListProduct m22607V = m22607V(catalogProduct.m14499y());
            catalogProduct.m14521X(m22607V != null ? m22607V.m14327s() : catalogProduct.m14538G());
            c1436e02.mo166p(catalogProduct);
            String m14541D = catalogProduct.m14541D();
            c1436e0.mo166p("%s " + m14541D);
        }
    }

    /* renamed from: a0 */
    public static final /* synthetic */ C7310l m34568a0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6209q;
    }

    /* renamed from: b0 */
    public static final /* synthetic */ boolean m34567b0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6207F;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ ResourcesProvider m34566c0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.m20390g();
    }

    /* renamed from: d0 */
    public static final /* synthetic */ C1436e0 m34565d0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6215w;
    }

    /* renamed from: e0 */
    public static final /* synthetic */ C1436e0 m34564e0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6216x;
    }

    /* renamed from: f0 */
    public static final /* synthetic */ C1436e0 m34563f0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6214v;
    }

    /* renamed from: g0 */
    public static final /* synthetic */ C1436e0 m34562g0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6217y;
    }

    /* renamed from: h0 */
    public static final /* synthetic */ C1436e0 m34561h0(ProductDetailViewModel productDetailViewModel) {
        return productDetailViewModel.f6212t;
    }

    /* renamed from: i0 */
    public static final /* synthetic */ void m34560i0(ProductDetailViewModel productDetailViewModel, String str) {
        productDetailViewModel.m110k(str);
    }

    /* renamed from: j0 */
    public static final /* synthetic */ Object m34559j0(ProductDetailViewModel productDetailViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return productDetailViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: k0 */
    public static final /* synthetic */ void m34558k0(ProductDetailViewModel productDetailViewModel, boolean z) {
        productDetailViewModel.f6207F = z;
    }

    /* renamed from: s0 */
    private final void m34550s0(SearchCatalogParameters searchCatalogParameters, boolean z) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C2163b(z, searchCatalogParameters, null), 3, null);
    }

    /* renamed from: t0 */
    static /* synthetic */ void m34549t0(ProductDetailViewModel productDetailViewModel, SearchCatalogParameters searchCatalogParameters, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        productDetailViewModel.m34550s0(searchCatalogParameters, z);
    }

    /* renamed from: N */
    protected void m34569N() {
        SearchCatalogParameters searchCatalogParameters = (SearchCatalogParameters) this.f6217y.mo172f();
        if (searchCatalogParameters != null) {
            m34549t0(this, searchCatalogParameters, false, 2, null);
        }
    }

    /* renamed from: l0 */
    public final LiveData m34557l0() {
        return this.f6206E;
    }

    /* renamed from: m0 */
    public final LiveData m34556m0() {
        return this.f6205D;
    }

    /* renamed from: n0 */
    public final LiveData m34555n0() {
        return this.f6203B;
    }

    /* renamed from: o0 */
    public final LiveData m34554o0() {
        return this.f6204C;
    }

    /* renamed from: p0 */
    public final LiveData m34553p0() {
        return this.f6202A;
    }

    /* renamed from: q0 */
    public final LiveData m34552q0() {
        return this.f6218z;
    }

    /* renamed from: r0 */
    public final void m34551r0() {
        this.f6208G.mo9587d(C13195u.f34156a);
    }

    /* renamed from: u0 */
    public final void m34548u0(CatalogProduct catalogProduct) {
        List m202b;
        List m202b2;
        Intrinsics.isThisObjectNull(catalogProduct, "product");
        Promotion m14512e = catalogProduct.m14512e();
        if (m14512e != null) {
            String m14460h = m14512e.m14460h();
            String str = m14460h.length() > 0 ? m14460h : null;
            if (str != null) {
                this.f6210r.mo166p(Boolean.FALSE);
                SearchCatalogParameters searchCatalogParameters = (SearchCatalogParameters) this.f6217y.mo172f();
                if (searchCatalogParameters != null) {
                    Intrinsics.checkIfNull(searchCatalogParameters, "queryParameters");
                    m202b2 = CollectionsJVM.m202b(catalogProduct.m14499y());
                    m34550s0(SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, str, null, null, null, false, null, null, null, null, null, m202b2, null, 0, 0, false, 253943, null), true);
                }
            }
            String m14459i = m14512e.m14459i();
            String str2 = m14459i.length() > 0 ? m14459i : null;
            if (str2 != null) {
                this.f6210r.mo166p(Boolean.FALSE);
                SearchCatalogParameters searchCatalogParameters2 = (SearchCatalogParameters) this.f6217y.mo172f();
                if (searchCatalogParameters2 != null) {
                    Intrinsics.checkIfNull(searchCatalogParameters2, "queryParameters");
                    m202b = CollectionsJVM.m202b(catalogProduct.m14499y());
                    m34550s0(SearchCatalogParameters.m13995b(searchCatalogParameters2, 0, null, null, null, str2, null, null, false, null, null, null, null, null, m202b, null, 0, 0, false, 253935, null), true);
                }
            }
        }
    }
}
