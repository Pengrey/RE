package pt.pingodoce.app.presentation.purchases.products;

import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p188jl.PurchaseProductsListAdapter;
import p188jl.PurchaseProductsViewModel;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12129z2;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity;
import td.InterfaceC10524i0;

/* compiled from: PurchaseProductsActivity.kt */
/* loaded from: classes2.dex */
public final class PurchaseProductsActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24629f0;

    /* compiled from: PurchaseProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity$a */
    /* loaded from: classes2.dex */
    static final class C9374a extends AbstractC6438m implements InterfaceC6097a {
        C9374a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PurchaseProductsActivity.this.m11408l1(), PurchaseProductsActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseProductsActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity$initViews$1$1", m20196f = "PurchaseProductsActivity.kt", m20195l = {33}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9375b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24631x;

        /* renamed from: y */
        final /* synthetic */ PurchaseProductsListAdapter f24632y;

        /* renamed from: z */
        final /* synthetic */ List f24633z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9375b(PurchaseProductsListAdapter purchaseProductsListAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24632y = purchaseProductsListAdapter;
            this.f24633z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9375b(this.f24632y, this.f24633z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9375b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24631x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PurchaseProductsListAdapter purchaseProductsListAdapter = this.f24632y;
                List list = this.f24633z;
                Intrinsics.checkIfNull(list, "it");
                this.f24631x = 1;
                if (purchaseProductsListAdapter.m22148H(list, this) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.purchases.products.PurchaseProductsActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9376c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ PurchaseProductsViewModel f24634w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9376c(PurchaseProductsViewModel purchaseProductsViewModel) {
            super(1);
            this.f24634w = purchaseProductsViewModel;
        }

        /* renamed from: a */
        public final void m11399a(int i) {
            this.f24634w.m20686i0(i);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11399a(((Number) obj).intValue());
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m11411i1(PurchaseProductsActivity purchaseProductsActivity, PurchaseProductsListAdapter purchaseProductsListAdapter, List list) {
        m11405n1(purchaseProductsActivity, purchaseProductsListAdapter, list);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m11410j1(PurchaseProductsViewModel purchaseProductsViewModel, PurchaseProductsListAdapter purchaseProductsListAdapter, C13195u c13195u) {
        m11404o1(purchaseProductsViewModel, purchaseProductsListAdapter, c13195u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m11405n1(PurchaseProductsActivity purchaseProductsActivity, PurchaseProductsListAdapter purchaseProductsListAdapter, List list) {
        Intrinsics.isThisObjectNull(purchaseProductsActivity, "this$0");
        Intrinsics.isThisObjectNull(purchaseProductsListAdapter, "$productsAdapter");
        LifecycleOwner.m36965a(purchaseProductsActivity).m36984i(new C9375b(purchaseProductsListAdapter, list, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m11404o1(PurchaseProductsViewModel purchaseProductsViewModel, PurchaseProductsListAdapter purchaseProductsListAdapter, C13195u c13195u) {
        Intrinsics.isThisObjectNull(purchaseProductsViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(purchaseProductsListAdapter, "$productsAdapter");
        purchaseProductsViewModel.m20690e0(purchaseProductsListAdapter.m20703K());
    }

    /* renamed from: G0 */
    protected int m11415G0() {
        return C2336R.string.lbl_purchase_detail_products_add;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11414J0() {
        return C6450z.m20906b(PurchaseProductsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11413K0() {
        return new C9374a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m11408l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24629f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public void m11412P0(AbstractC12129z2 abstractC12129z2, final PurchaseProductsViewModel purchaseProductsViewModel) {
        Intrinsics.isThisObjectNull(abstractC12129z2, "binding");
        Intrinsics.isThisObjectNull(purchaseProductsViewModel, "viewModel");
        final PurchaseProductsListAdapter purchaseProductsListAdapter = new PurchaseProductsListAdapter(new C9376c(purchaseProductsViewModel));
        abstractC12129z2.f32019y.setAdapter(purchaseProductsListAdapter);
        purchaseProductsViewModel.m20687h0().mo171i(this, new InterfaceC1440f0() { // from class: jl.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseProductsActivity.m11405n1(PurchaseProductsActivity.this, purchaseProductsListAdapter, (List) obj);
            }
        });
        purchaseProductsViewModel.m20689f0().mo171i(this, new InterfaceC1440f0() { // from class: jl.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PurchaseProductsActivity.m11404o1(PurchaseProductsViewModel.this, purchaseProductsListAdapter, (C13195u) obj);
            }
        });
    }

    /* renamed from: n */
    public boolean m11406n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_purchase_products;
    }
}
