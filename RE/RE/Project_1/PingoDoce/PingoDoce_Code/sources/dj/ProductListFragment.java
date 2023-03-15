package dj;

import android.os.Bundle;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.fragment.app.ActivityC1354d;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import de.EndlessRecyclerOnScrollListener;
import ee.GridSpacingItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.TransactionCacheManager;
import p087ej.C5117h;
import p087ej.ItemBigPlaceHolderAdapter;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11947p6;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p470yf.SnackBarAction;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.presentation.flyer.FlyerActivity;
import pt.pingodoce.app.presentation.home.tailored.TailoredForYouActivity;
import pt.pingodoce.app.presentation.promotion.PromotionActivity;
import td.InterfaceC10524i0;

/* renamed from: dj.b */
/* loaded from: classes2.dex */
public final class ProductListFragment extends AbstractC13876n {

    /* renamed from: H0 */
    public static final C4866a f13290H0 = new C4866a(null);

    /* renamed from: A0 */
    public ViewModelFactoryByInjection f13291A0;

    /* renamed from: B0 */
    private final InterfaceC13178g f13292B0;

    /* renamed from: C0 */
    private final InterfaceC13178g f13293C0;

    /* renamed from: D0 */
    private final InterfaceC13178g f13294D0;

    /* renamed from: E0 */
    private final InterfaceC13178g f13295E0;

    /* renamed from: F0 */
    private final InterfaceC13178g f13296F0;

    /* renamed from: G0 */
    private final InterfaceC13178g f13297G0;

    /* renamed from: z0 */
    public TransactionCacheManager f13298z0;

    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$a */
    /* loaded from: classes2.dex */
    public static final class C4866a {
        private C4866a() {
        }

        public /* synthetic */ C4866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ProductListFragment m26409a(Integer num, boolean z, Integer num2, boolean z2) {
            ProductListFragment productListFragment = new ProductListFragment();
            Bundle bundle = new Bundle();
            if (num != null) {
                bundle.putInt("EXTRA_FOR_CATEGORY_ID", num.intValue());
            }
            if (num2 != null) {
                bundle.putInt("EXTRA_FOR_FLYER_ID", num2.intValue());
            }
            bundle.putBoolean("EXTRA_FOR_HAS_PROMO", z);
            bundle.putBoolean("EXTRA_FOR_FEEDBACK", z2);
            productListFragment.m37630P1(bundle);
            return productListFragment;
        }

        /* renamed from: b */
        public final ProductListFragment m26408b(boolean z) {
            ProductListFragment productListFragment = new ProductListFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_FOR_FEEDBACK", z);
            bundle.putBoolean("EXTRA_FOR_TAILORED_FOR_YOUR", true);
            productListFragment.m37630P1(bundle);
            return productListFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$b */
    /* loaded from: classes2.dex */
    public static final class C4867b extends AbstractC6438m implements InterfaceC6097a {
        C4867b() {
            super(0);
        }

        /* renamed from: a */
        public final Integer mo42214q() {
            Bundle m37660E = ProductListFragment.this.m37660E();
            return Integer.valueOf(m37660E != null ? m37660E.getInt("EXTRA_FOR_CATEGORY_ID", -200) : -200);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$c */
    /* loaded from: classes2.dex */
    public static final class C4868c extends AbstractC6438m implements InterfaceC6097a {
        C4868c() {
            super(0);
        }

        /* renamed from: a */
        public final Integer mo42214q() {
            Bundle m37660E = ProductListFragment.this.m37660E();
            return Integer.valueOf(m37660E != null ? m37660E.getInt("EXTRA_FOR_FLYER_ID", -200) : -200);
        }
    }

    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$d */
    /* loaded from: classes2.dex */
    static final class C4869d extends AbstractC6438m implements InterfaceC6097a {
        C4869d() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ProductListFragment.this.m26411y2(), ProductListFragment.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$e */
    /* loaded from: classes2.dex */
    public static final class C4870e extends AbstractC6438m implements InterfaceC6097a {
        C4870e() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            Bundle m37660E = ProductListFragment.this.m37660E();
            return Boolean.valueOf(m37660E != null ? m37660E.getBoolean("EXTRA_FOR_HAS_PROMO", false) : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.list.ProductListFragment$initViews$1", m20196f = "ProductListFragment.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: dj.b$f */
    /* loaded from: classes2.dex */
    public static final class C4871f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13303x;

        C4871f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4871f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4871f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f13303x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$g */
    /* loaded from: classes2.dex */
    public static final class C4872g extends AbstractC6438m implements InterfaceC6097a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProductListFragment.kt */
        /* renamed from: dj.b$g$a */
        /* loaded from: classes2.dex */
        public static final class C4873a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ ProductListFragment f13305w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4873a(ProductListFragment productListFragment) {
                super(0);
                this.f13305w = productListFragment;
            }

            /* renamed from: a */
            public final void m26401a() {
                ActivityC1354d m37652G1 = this.f13305w.m37652G1();
                Intrinsics.checkIfNull(m37652G1, "requireActivity()");
                ShoppingListActivity.m20275a(m37652G1);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m26401a();
                return C13195u.f34156a;
            }
        }

        C4872g() {
            super(0);
        }

        /* renamed from: a */
        public final void m26402a() {
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String m37589f0 = ProductListFragment.this.m37589f0(C2336R.string.lbl_product_added);
            Intrinsics.checkIfNull(m37589f0, "getString(R.string.lbl_product_added)");
            String m37589f02 = ProductListFragment.this.m37589f0(C2336R.string.btn_shopping_list_alt2);
            Intrinsics.checkIfNull(m37589f02, "getString(R.string.btn_shopping_list_alt2)");
            SnackBarLiveData.m21968c(snackBarLiveData, m37589f0, new SnackBarAction(m37589f02, new C4873a(ProductListFragment.this)), 0, 0, 4, null);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m26402a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$h */
    /* loaded from: classes2.dex */
    public static final class C4874h extends EndlessRecyclerOnScrollListener {

        /* renamed from: c */
        final /* synthetic */ ProductListFragmentViewModel f13306c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4874h(ProductListFragmentViewModel productListFragmentViewModel, RecyclerView.AbstractC1546o abstractC1546o) {
            super((LinearLayoutManager) abstractC1546o, 0, 2, null);
            this.f13306c = productListFragmentViewModel;
            Objects.requireNonNull(abstractC1546o, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        /* renamed from: c */
        public void m26400c(int i) {
            this.f13306c.m26371p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$i */
    /* loaded from: classes2.dex */
    public static final class C4875i extends AbstractC6438m implements InterfaceC6097a {
        C4875i() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            Bundle m37660E = ProductListFragment.this.m37660E();
            return Boolean.valueOf(m37660E != null ? m37660E.getBoolean("EXTRA_FOR_TAILORED_FOR_YOUR", false) : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$j */
    /* loaded from: classes2.dex */
    public static final class C4876j extends AbstractC6438m implements InterfaceC6097a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProductListFragment.kt */
        /* renamed from: dj.b$j$a */
        /* loaded from: classes2.dex */
        public static final class C4877a extends AbstractC6438m implements InterfaceC6113q {

            /* renamed from: w */
            final /* synthetic */ ProductListFragment f13309w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4877a(ProductListFragment productListFragment) {
                super(3);
                this.f13309w = productListFragment;
            }

            /* renamed from: C */
            public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                m26397a(((Number) obj).intValue(), (CatalogProduct) obj2, (View) obj3);
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m26397a(int i, CatalogProduct catalogProduct, View view) {
                Intrinsics.isThisObjectNull(catalogProduct, "product");
                Intrinsics.isThisObjectNull(view, "view");
                if (ProductListFragment.m26415u2(this.f13309w)) {
                    ProductListFragment.m26414v2(this.f13309w, ((TailoredForYouActivity) this.f13309w.m37652G1()).m12029l1(), i, catalogProduct, view);
                } else if (this.f13309w.m37652G1() instanceof PromotionActivity) {
                    ProductListFragment.m26414v2(this.f13309w, ((PromotionActivity) this.f13309w.m37652G1()).m11498x1(), i, catalogProduct, view);
                } else if (this.f13309w.m37652G1() instanceof FlyerActivity) {
                    ProductListFragment.m26414v2(this.f13309w, ((FlyerActivity) this.f13309w.m37652G1()).m12281r1(), i, catalogProduct, view);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProductListFragment.kt */
        /* renamed from: dj.b$j$b */
        /* loaded from: classes2.dex */
        public static final class C4878b extends AbstractC6438m implements InterfaceC6112p {

            /* renamed from: w */
            final /* synthetic */ ProductListFragment f13310w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4878b(ProductListFragment productListFragment) {
                super(2);
                this.f13310w = productListFragment;
            }

            /* renamed from: F */
            public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
                m26396a((CatalogProduct) obj, ((Number) obj2).intValue());
                return C13195u.f34156a;
            }

            /* renamed from: a */
            public final void m26396a(CatalogProduct catalogProduct, int i) {
                Intrinsics.isThisObjectNull(catalogProduct, "product");
                ProductListFragment.m26416t2(this.f13310w).m22610S(catalogProduct, i);
            }
        }

        C4876j() {
            super(0);
        }

        /* renamed from: a */
        public final C5117h mo42214q() {
            InterfaceC1491v m37582i0 = ProductListFragment.this.m37582i0();
            Intrinsics.checkIfNull(m37582i0, "viewLifecycleOwner");
            return new C5117h(LifecycleOwner.m36965a(m37582i0), null, new C4877a(ProductListFragment.this), new C4878b(ProductListFragment.this), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListFragment.kt */
    /* renamed from: dj.b$k */
    /* loaded from: classes2.dex */
    public static final class C4879k extends AbstractC6438m implements InterfaceC6097a {
        C4879k() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            Bundle m37660E = ProductListFragment.this.m37660E();
            return Boolean.valueOf(m37660E != null ? m37660E.getBoolean("EXTRA_FOR_FEEDBACK", false) : false);
        }
    }

    public ProductListFragment() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        InterfaceC13178g m1464a5;
        InterfaceC13178g m1464a6;
        m1464a = LazyJVM.m1464a(new C4876j());
        this.f13292B0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C4867b());
        this.f13293C0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C4868c());
        this.f13294D0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C4870e());
        this.f13295E0 = m1464a4;
        m1464a5 = LazyJVM.m1464a(new C4879k());
        this.f13296F0 = m1464a5;
        m1464a6 = LazyJVM.m1464a(new C4875i());
        this.f13297G0 = m1464a6;
    }

    /* renamed from: A2 */
    private final boolean m26430A2() {
        return ((Boolean) this.f13295E0.getValue()).booleanValue();
    }

    /* renamed from: B2 */
    private final C5117h m26429B2() {
        return (C5117h) this.f13292B0.getValue();
    }

    /* renamed from: C2 */
    private final boolean m26428C2() {
        return ((Boolean) this.f13296F0.getValue()).booleanValue();
    }

    /* renamed from: E2 */
    private final boolean m26426E2() {
        return ((Boolean) this.f13297G0.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r10 <= ((androidx.recyclerview.widget.LinearLayoutManager) r0).m36770c2()) goto L5;
     */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m26425F2(androidx.activity.result.AbstractC0304b r9, int r10, pt.pingodoce.app.data.local.models.products.CatalogProduct r11, android.view.View r12) {
        /*
            r8 = this;
            androidx.fragment.app.d r1 = r8.m37652G1()
            java.lang.String r0 = "requireActivity()"
            p181jd.Intrinsics.checkIfNull(r1, r0)
            androidx.databinding.ViewDataBinding r0 = r8.m22723h2()
            wg.p6 r0 = (p426wg.AbstractC11947p6) r0
            com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f31208x
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            java.util.Objects.requireNonNull(r0, r2)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.m36776W1()
            if (r10 < r0) goto L3a
            androidx.databinding.ViewDataBinding r0 = r8.m22723h2()
            wg.p6 r0 = (p426wg.AbstractC11947p6) r0
            com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f31208x
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            java.util.Objects.requireNonNull(r0, r2)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.m36770c2()
            if (r10 > r0) goto L3a
            goto L3b
        L3a:
            r12 = 0
        L3b:
            r3 = r12
            r4 = 0
            mg.q1 r5 = r8.m26413w2()
            r6 = 8
            r7 = 0
            r0 = r9
            r2 = r11
            p048cj.ProductDetailActivity.m34573c(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.ProductListFragment.m26425F2(androidx.activity.result.b, int, pt.pingodoce.app.data.local.models.products.CatalogProduct, android.view.View):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m26424G2(ProductListFragment productListFragment, List list) {
        Intrinsics.isThisObjectNull(productListFragment, "this$0");
        C5117h m26429B2 = productListFragment.m26429B2();
        Intrinsics.checkIfNull(list, "it");
        m26429B2.m22153F(list);
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m26417s2(ProductListFragment productListFragment, List list) {
        m26424G2(productListFragment, list);
    }

    /* renamed from: t2 */
    public static final /* synthetic */ ProductListFragmentViewModel m26416t2(ProductListFragment productListFragment) {
        return (ProductListFragmentViewModel) productListFragment.m22721j2();
    }

    /* renamed from: u2 */
    public static final /* synthetic */ boolean m26415u2(ProductListFragment productListFragment) {
        return productListFragment.m26426E2();
    }

    /* renamed from: v2 */
    public static final /* synthetic */ void m26414v2(ProductListFragment productListFragment, AbstractC0304b abstractC0304b, int i, CatalogProduct catalogProduct, View view) {
        productListFragment.m26425F2(abstractC0304b, i, catalogProduct, view);
    }

    /* renamed from: x2 */
    private final int m26412x2() {
        return ((Number) this.f13293C0.getValue()).intValue();
    }

    /* renamed from: z2 */
    private final int m26410z2() {
        return ((Number) this.f13294D0.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D2 */
    public void m26418p2(AbstractC11947p6 abstractC11947p6, ProductListFragmentViewModel productListFragmentViewModel) {
        Intrinsics.isThisObjectNull(abstractC11947p6, "binding");
        Intrinsics.isThisObjectNull(productListFragmentViewModel, "viewModel");
        LifecycleOwner.m36965a(this).m36985h(new C4871f(null));
        if (m26428C2()) {
            m26429B2().m25637U(new C4872g());
        }
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11947p6.f31208x;
        placeHolderRecyclerView.m36657h(new GridSpacingItemDecoration(2, 16, true, 0));
        placeHolderRecyclerView.m36645l(new C4874h(productListFragmentViewModel, placeHolderRecyclerView.getLayoutManager()));
        placeHolderRecyclerView.setAdapter(m26429B2());
        placeHolderRecyclerView.setHoldersAdapter(new ItemBigPlaceHolderAdapter());
        int m26412x2 = m26412x2();
        if (m26412x2 != -200) {
            productListFragmentViewModel.m26368s0(m26412x2);
            productListFragmentViewModel.m26366u0(m26430A2());
        }
        int m26410z2 = m26410z2();
        if (m26410z2 != -200) {
            productListFragmentViewModel.m26367t0(m26410z2);
        }
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        ((ProductListFragmentViewModel) m22721j2()).m26370q0();
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        ((ProductListFragmentViewModel) m22721j2()).m26376k0().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: dj.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ProductListFragment.m26424G2(ProductListFragment.this, (List) obj);
            }
        });
        if (m26412x2() != -200 && m26410z2() == -200) {
            ((ProductListFragmentViewModel) m22721j2()).m26369r0(new SearchCatalogParameters(0, null, null, null, null, Boolean.valueOf(m26430A2()), Integer.valueOf(m26412x2()), false, null, null, null, null, null, null, null, 0, 0, false, 262047, null));
        } else if (m26412x2() != -200 && m26410z2() != -200) {
            ((ProductListFragmentViewModel) m22721j2()).m26369r0(new SearchCatalogParameters(0, null, null, null, null, null, Integer.valueOf(m26412x2()), false, Integer.valueOf(m26410z2()), null, null, null, null, null, null, 0, 0, false, 261823, null));
        } else if (m26412x2() == -200 && m26426E2()) {
            ((ProductListFragmentViewModel) m22721j2()).m26369r0(new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 12, false, 196607, null));
        }
    }

    /* renamed from: i2 */
    protected int m26421i2() {
        return C2336R.layout.fragment_product_list;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m26420k2() {
        return C6450z.m20906b(ProductListFragmentViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m26419l2() {
        return new C4869d();
    }

    /* renamed from: w2 */
    public final TransactionCacheManager m26413w2() {
        TransactionCacheManager transactionCacheManager = this.f13298z0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: y2 */
    public final ViewModelFactoryByInjection m26411y2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f13291A0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
