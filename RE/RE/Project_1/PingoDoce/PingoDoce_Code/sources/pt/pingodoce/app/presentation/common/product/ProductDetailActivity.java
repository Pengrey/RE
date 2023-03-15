package pt.pingodoce.app.presentation.common.product;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.keyboardevents.C2354b;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.bottomsheet.DialogC3502a;
import de.EndlessRecyclerOnScrollListener;
import ee.MarginItemDecoration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import mg.TransactionCacheManager;
import ne.EventObserver;
import p039c3.C2046o;
import p048cj.ProductDetailViewModel;
import p050d.C4519c;
import p070e.C4906j;
import p087ej.C5117h;
import p087ej.EnumC5125l;
import p087ej.ItemSmallPlaceHolderAdapter;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11943p2;
import p426wg.AbstractC12132z5;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import p494zh.C13833f2;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.presentation.common.product.ProductDetailActivity;
import td.InterfaceC10524i0;

/* compiled from: ProductDetailActivity.kt */
/* loaded from: classes2.dex */
public final class ProductDetailActivity extends BaseActivity {

    /* renamed from: f0 */
    public TransactionCacheManager f23942f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23943g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f23944h0;

    /* renamed from: i0 */
    private InterfaceC6108l f23945i0;

    /* renamed from: j0 */
    private InterfaceC6108l f23946j0;

    /* renamed from: k0 */
    private final AbstractC0304b f23947k0;

    /* renamed from: l0 */
    private final C5117h f23948l0;

    /* renamed from: m0 */
    private final InterfaceC13178g f23949m0;

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9088a extends AbstractC6438m implements InterfaceC6097a {
        C9088a() {
            super(0);
        }

        /* renamed from: a */
        public final DialogC3502a mo42214q() {
            DialogC3502a dialogC3502a = new DialogC3502a(ProductDetailActivity.this);
            ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
            AbstractC12132z5 m3574Q = AbstractC12132z5.m3574Q(LayoutInflater.from(productDetailActivity));
            Intrinsics.checkIfNull(m3574Q, "inflate(\n               …ilActivity)\n            )");
            m3574Q.mo3572S(ProductDetailActivity.m12560v1(productDetailActivity));
            dialogC3502a.setContentView(m3574Q.m37802s());
            return dialogC3502a;
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$b */
    /* loaded from: classes2.dex */
    static final class C9089b extends AbstractC6438m implements InterfaceC6108l {
        C9089b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12553a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView quantityPickerView = ProductDetailActivity.m12566p1(ProductDetailActivity.this).f31194z.f32051C;
            Intrinsics.checkIfNull(quantityPickerView, "binding.productDetailInc…productQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12553a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$c */
    /* loaded from: classes2.dex */
    static final class C9090c extends AbstractC6438m implements InterfaceC6097a {
        C9090c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12586B1 = ProductDetailActivity.this.m12586B1();
            ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
            return m12586B1.m20377b(productDetailActivity, productDetailActivity.getIntent().getExtras());
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9091d extends EndlessRecyclerOnScrollListener {

        /* renamed from: d */
        final /* synthetic */ ProductDetailViewModel f23954d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9091d(ProductDetailViewModel productDetailViewModel, RecyclerView.AbstractC1546o abstractC1546o) {
            super((LinearLayoutManager) abstractC1546o, 0, 2, null);
            this.f23954d = productDetailViewModel;
            Objects.requireNonNull(abstractC1546o, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }

        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            super.mo29914a(recyclerView, i);
            if (i == 1) {
                C2354b.m33844b(ProductDetailActivity.this);
            }
        }

        /* renamed from: c */
        public void m12550c(int i) {
            this.f23954d.m34551r0();
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$e */
    /* loaded from: classes2.dex */
    static final class C9092e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC11943p2 f23955a;

        C9092e(AbstractC11943p2 abstractC11943p2) {
            this.f23955a = abstractC11943p2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.isThisObjectNull(valueAnimator, "animation");
            LinearLayout linearLayout = this.f23955a.f31194z.f32050B;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            linearLayout.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9093f implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ ProductDetailViewModel f23956a;

        /* renamed from: b */
        final /* synthetic */ ProductDetailActivity f23957b;

        /* renamed from: c */
        final /* synthetic */ AbstractC11943p2 f23958c;

        /* renamed from: d */
        final /* synthetic */ ProductDetailViewModel f23959d;

        public C9093f(ProductDetailViewModel productDetailViewModel, ProductDetailActivity productDetailActivity, AbstractC11943p2 abstractC11943p2, ProductDetailActivity productDetailActivity2, ProductDetailViewModel productDetailViewModel2) {
            this.f23956a = productDetailViewModel;
            this.f23957b = productDetailActivity;
            this.f23958c = abstractC11943p2;
            this.f23959d = productDetailViewModel2;
        }

        /* renamed from: a */
        public void m12549a(boolean z) {
            if (z) {
                ProductDetailActivity.m12565q1(this.f23957b).mo9587d(C13195u.f34156a);
                this.f23959d.m22605X();
            }
        }

        /* renamed from: b */
        public void m12548b(boolean z) {
            ValueAnimator m24301a = CommonUtils.f15361a.m24301a(z ? 1.0f : 0.5f, z ? 0.2f : 1.0f, 500L);
            m24301a.addUpdateListener(new C9092e(this.f23958c));
            m24301a.start();
        }

        /* renamed from: c */
        public void m12547c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            CatalogProduct catalogProduct = (CatalogProduct) this.f23956a.m34554o0().mo172f();
            if (catalogProduct != null) {
                ProductDetailViewModel productDetailViewModel = this.f23956a;
                Intrinsics.checkIfNull(catalogProduct, "it");
                productDetailViewModel.m22610S(catalogProduct, i);
                if (ProductDetailActivity.m12563s1(this.f23957b)) {
                    ProductDetailActivity productDetailActivity = this.f23957b;
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_FOR_TRADE_COMPLETED", true);
                    C13195u c13195u = C13195u.f34156a;
                    productDetailActivity.setResult(-1, intent);
                }
            }
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$g */
    /* loaded from: classes2.dex */
    static final class C9094g extends AbstractC6438m implements InterfaceC6097a {
        C9094g() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.valueOf(ProductDetailActivity.this.getIntent().getBooleanExtra("EXTRA_FOR_TRADE", false));
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$h */
    /* loaded from: classes2.dex */
    static final class C9095h extends AbstractC6438m implements InterfaceC6113q {
        C9095h() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m12545a(((Number) obj).intValue(), (CatalogProduct) obj2, (View) obj3);
            return C13195u.f34156a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
            if (r8 <= ((androidx.recyclerview.widget.LinearLayoutManager) r0).m36770c2()) goto L5;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12545a(int r8, pt.pingodoce.app.data.local.models.products.CatalogProduct r9, android.view.View r10) {
            /*
                r7 = this;
                java.lang.String r0 = "product"
                p181jd.Intrinsics.isThisObjectNull(r9, r0)
                java.lang.String r0 = "view"
                p181jd.Intrinsics.isThisObjectNull(r10, r0)
                pt.pingodoce.app.presentation.common.product.ProductDetailActivity r0 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.this
                androidx.activity.result.b r1 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.m12564r1(r0)
                pt.pingodoce.app.presentation.common.product.ProductDetailActivity r2 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.this
                wg.p2 r0 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.m12566p1(r2)
                wg.b9 r0 = r0.f31193y
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f29951y
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36776W1()
                if (r8 < r0) goto L45
                pt.pingodoce.app.presentation.common.product.ProductDetailActivity r0 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.this
                wg.p2 r0 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.m12566p1(r0)
                wg.b9 r0 = r0.f31193y
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f29951y
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36770c2()
                if (r8 > r0) goto L45
                goto L46
            L45:
                r10 = 0
            L46:
                r4 = r10
                pt.pingodoce.app.presentation.common.product.ProductDetailActivity r8 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.this
                android.content.Intent r8 = r8.getIntent()
                r10 = 0
                java.lang.String r0 = "EXTRA_FOR_TRADE"
                boolean r5 = r8.getBooleanExtra(r0, r10)
                pt.pingodoce.app.presentation.common.product.ProductDetailActivity r8 = pt.pingodoce.app.presentation.common.product.ProductDetailActivity.this
                mg.q1 r6 = r8.m12587A1()
                r3 = r9
                p048cj.ProductDetailActivity.m34575a(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.product.ProductDetailActivity.C9095h.m12545a(int, pt.pingodoce.app.data.local.models.products.CatalogProduct, android.view.View):void");
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$i */
    /* loaded from: classes2.dex */
    static final class C9096i extends AbstractC6438m implements InterfaceC6112p {
        C9096i() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12544a((CatalogProduct) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12544a(CatalogProduct catalogProduct, int i) {
            Intrinsics.isThisObjectNull(catalogProduct, "product");
            ProductDetailActivity.m12560v1(ProductDetailActivity.this).m22610S(catalogProduct, i);
            ProductDetailActivity.m12561u1(ProductDetailActivity.this).mo9587d(C13195u.f34156a);
            if (ProductDetailActivity.m12563s1(ProductDetailActivity.this)) {
                ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
                Intent intent = new Intent();
                intent.putExtra("EXTRA_FOR_TRADE_COMPLETED", true);
                productDetailActivity.setResult(-1, intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductDetailActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.product.ProductDetailActivity$setupObservers$1$1", m20196f = "ProductDetailActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$j */
    /* loaded from: classes2.dex */
    public static final class C9097j extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23963x;

        /* renamed from: z */
        final /* synthetic */ List f23965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9097j(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23965z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9097j(this.f23965z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9097j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23963x == 0) {
                C13186n.m1453b(obj);
                C5117h m12562t1 = ProductDetailActivity.m12562t1(ProductDetailActivity.this);
                List list = this.f23965z;
                Intrinsics.checkIfNull(list, "it");
                m12562t1.m22153F(list);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$k */
    /* loaded from: classes2.dex */
    public static final class C9098k extends AbstractC6438m implements InterfaceC6108l {
        C9098k() {
            super(1);
        }

        /* renamed from: a */
        public final void m12542a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            if (Intrinsics.equals((InterfaceC7186c) c13182l.m1460c(), C13833f2.f34941a)) {
                ProductDetailActivity.m12567o1(ProductDetailActivity.this);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12542a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: ProductDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.product.ProductDetailActivity$l */
    /* loaded from: classes2.dex */
    static final class C9099l extends AbstractC6438m implements InterfaceC6108l {
        C9099l() {
            super(1);
        }

        /* renamed from: a */
        public final void m12541a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            ProductDetailActivity.m12560v1(ProductDetailActivity.this).m22605X();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12541a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    public ProductDetailActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        m1464a = LazyJVM.m1464a(new C9094g());
        this.f23944h0 = m1464a;
        this.f23945i0 = OperatorExtensions.m35180a(2000L, LifecycleOwner.m36965a(this), new C9089b());
        this.f23946j0 = OperatorExtensions.m35177d(2000L, LifecycleOwner.m36965a(this), new C9099l());
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: cj.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ProductDetailActivity.m12559w1(ProductDetailActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…        }\n        }\n    }");
        this.f23947k0 = m41364M;
        C5117h c5117h = new C5117h(LifecycleOwner.m36965a(this), EnumC5125l.SMALL, new C9095h(), new C9096i());
        c5117h.m25638T(true);
        this.f23948l0 = c5117h;
        m1464a2 = LazyJVM.m1464a(new C9088a());
        this.f23949m0 = m1464a2;
    }

    /* renamed from: C1 */
    private final boolean m12585C1() {
        return ((Boolean) this.f23944h0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final boolean m12583E1(ProductDetailActivity productDetailActivity, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        productDetailActivity.f23945i0.mo9587d(C13195u.f34156a);
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m12582F1(ProductDetailActivity productDetailActivity, View view) {
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        productDetailActivity.m12555z1().show();
    }

    /* renamed from: G1 */
    private final void m12581G1() {
        ((ProductDetailViewModel) m22758I0()).m34555n0().mo171i(this, new InterfaceC1440f0() { // from class: cj.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ProductDetailActivity.m12580H1(ProductDetailActivity.this, (List) obj);
            }
        });
        ((ProductDetailViewModel) m22758I0()).m102x().mo171i(this, new InterfaceC1440f0() { // from class: cj.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ProductDetailActivity.m12579I1(ProductDetailActivity.this, (Boolean) obj);
            }
        });
        ((ProductDetailViewModel) m22758I0()).m34554o0().mo171i(this, new InterfaceC1440f0() { // from class: cj.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ProductDetailActivity.m12577J1(ProductDetailActivity.this, (CatalogProduct) obj);
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9098k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m12580H1(ProductDetailActivity productDetailActivity, List list) {
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(productDetailActivity), null, null, new C9097j(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m12579I1(ProductDetailActivity productDetailActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        C2046o.m34853a(((AbstractC11943p2) productDetailActivity.m22738w0()).f31193y.f29951y);
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11943p2) productDetailActivity.m22738w0()).f31193y.f29951y;
        Intrinsics.checkIfNull(bool, "isLoading");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m12577J1(ProductDetailActivity productDetailActivity, CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        if (catalogProduct != null) {
            ((ProductDetailViewModel) productDetailActivity.m22758I0()).m34548u0(catalogProduct);
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12574i1(ProductDetailActivity productDetailActivity, View view) {
        m12582F1(productDetailActivity, view);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12573j1(ProductDetailActivity productDetailActivity, ActivityResult activityResult) {
        m12559w1(productDetailActivity, activityResult);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m12572k1(ProductDetailActivity productDetailActivity, List list) {
        m12580H1(productDetailActivity, list);
    }

    /* renamed from: l1 */
    public static /* synthetic */ boolean m12571l1(ProductDetailActivity productDetailActivity, View view, MotionEvent motionEvent) {
        return m12583E1(productDetailActivity, view, motionEvent);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m12570m1(ProductDetailActivity productDetailActivity, CatalogProduct catalogProduct) {
        m12577J1(productDetailActivity, catalogProduct);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m12568n1(ProductDetailActivity productDetailActivity, Boolean bool) {
        m12579I1(productDetailActivity, bool);
    }

    /* renamed from: o1 */
    public static final /* synthetic */ void m12567o1(ProductDetailActivity productDetailActivity) {
        productDetailActivity.m12557x1();
    }

    /* renamed from: p1 */
    public static final /* synthetic */ AbstractC11943p2 m12566p1(ProductDetailActivity productDetailActivity) {
        return (AbstractC11943p2) productDetailActivity.m22738w0();
    }

    /* renamed from: q1 */
    public static final /* synthetic */ InterfaceC6108l m12565q1(ProductDetailActivity productDetailActivity) {
        return productDetailActivity.f23945i0;
    }

    /* renamed from: r1 */
    public static final /* synthetic */ AbstractC0304b m12564r1(ProductDetailActivity productDetailActivity) {
        return productDetailActivity.f23947k0;
    }

    /* renamed from: s1 */
    public static final /* synthetic */ boolean m12563s1(ProductDetailActivity productDetailActivity) {
        return productDetailActivity.m12585C1();
    }

    /* renamed from: t1 */
    public static final /* synthetic */ C5117h m12562t1(ProductDetailActivity productDetailActivity) {
        return productDetailActivity.f23948l0;
    }

    /* renamed from: u1 */
    public static final /* synthetic */ InterfaceC6108l m12561u1(ProductDetailActivity productDetailActivity) {
        return productDetailActivity.f23946j0;
    }

    /* renamed from: v1 */
    public static final /* synthetic */ ProductDetailViewModel m12560v1(ProductDetailActivity productDetailActivity) {
        return (ProductDetailViewModel) productDetailActivity.m22758I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m12559w1(ProductDetailActivity productDetailActivity, ActivityResult activityResult) {
        Bundle extras;
        Bundle extras2;
        Intrinsics.isThisObjectNull(productDetailActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            boolean z = false;
            if (productDetailActivity.m12585C1()) {
                Intent m41352a = activityResult.m41352a();
                if ((m41352a == null || (extras2 = m41352a.getExtras()) == null || !extras2.getBoolean("EXTRA_FOR_TRADE_COMPLETED")) ? false : true) {
                    Intent intent = new Intent();
                    intent.putExtra("EXTRA_FOR_TRADE_COMPLETED", true);
                    C13195u c13195u = C13195u.f34156a;
                    productDetailActivity.setResult(-1, intent);
                    return;
                }
            }
            Intent m41352a2 = activityResult.m41352a();
            if (m41352a2 != null && (extras = m41352a2.getExtras()) != null && extras.getBoolean("EXTRA_FOR_PRODUCT_CASCADE_FINISH")) {
                z = true;
            }
            if (z) {
                productDetailActivity.m12557x1();
            }
        }
    }

    /* renamed from: x1 */
    private final void m12557x1() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FOR_PRODUCT_CASCADE_FINISH", true);
        C13195u c13195u = C13195u.f34156a;
        setResult(-1, intent);
        finish();
    }

    /* renamed from: z1 */
    private final DialogC3502a m12555z1() {
        return (DialogC3502a) this.f23949m0.getValue();
    }

    /* renamed from: A1 */
    public final TransactionCacheManager m12587A1() {
        TransactionCacheManager transactionCacheManager = this.f23942f0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: B1 */
    public final ViewModelFactoryByInjection m12586B1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23943g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D1 */
    public void m12575P0(AbstractC11943p2 abstractC11943p2, ProductDetailViewModel productDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC11943p2, "binding");
        Intrinsics.isThisObjectNull(productDetailViewModel, "viewModel");
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11943p2.f31193y.f29951y;
        placeHolderRecyclerView.setAdapter(this.f23948l0);
        placeHolderRecyclerView.setHoldersAdapter(new ItemSmallPlaceHolderAdapter());
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(10), 0, 0, false, false, 0, C4906j.f13410G0, null));
        placeHolderRecyclerView.m36645l(new C9091d(productDetailViewModel, placeHolderRecyclerView.getLayoutManager()));
        QuantityPickerView quantityPickerView = abstractC11943p2.f31194z.f32051C;
        quantityPickerView.setOnTouchListener(new View.OnTouchListener() { // from class: cj.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m11425E1;
                m11425E1 = ProductDetailActivity.m12583E1(ProductDetailActivity.this, view, motionEvent);
                return m11425E1;
            }
        });
        Intrinsics.checkIfNull(quantityPickerView, BuildConfig.VERSION_NAME);
        quantityPickerView.setActionListener(new C9093f(productDetailViewModel, this, abstractC11943p2, this, productDetailViewModel));
        abstractC11943p2.f31194z.f32053x.setOnClickListener(new View.OnClickListener() { // from class: cj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductDetailActivity.m12582F1(ProductDetailActivity.this, view);
            }
        });
        m12581G1();
        C1112b0.m38465J0(abstractC11943p2.f31194z.f32055z, "TRANSITION_IMAGE");
        m12587A1().m18582h();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12578J0() {
        return C6450z.m20906b(ProductDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12576K0() {
        return new C9090c();
    }

    /* renamed from: n */
    public boolean m12569n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_product_detail;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }
}
