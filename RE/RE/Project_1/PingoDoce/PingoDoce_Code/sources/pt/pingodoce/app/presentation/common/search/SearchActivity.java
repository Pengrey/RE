package pt.pingodoce.app.presentation.common.search;

import ai.AbstractC0151j;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1636p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import bi.C1924a;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.keyboardevents.C2354b;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import de.EndlessRecyclerOnScrollListener;
import ee.MarginItemDecoration;
import fm.C5578b;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import mg.TransactionCacheManager;
import ne.EventObserver;
import p039c3.C2046o;
import p048cj.ProductDetailActivity;
import p050d.C4519c;
import p087ej.C5117h;
import p087ej.EnumC5125l;
import p087ej.ItemSmallPlaceHolderAdapter;
import p123gj.CategoryFilterAdapter;
import p123gj.RecentProductsAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11723d3;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.CollectionsJVM;
import p489zc._Collections;
import p494zh.BaseActivity;
import p494zh.C13809a2;
import p494zh.C13827e0;
import p494zh.C13833f2;
import p494zh.C13904t1;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.Tag;
import pt.pingodoce.app.presentation.common.search.SearchActivity;
import sb.C10143a;
import sb.C10144b;
import td.InterfaceC10524i0;

/* compiled from: SearchActivity.kt */
/* loaded from: classes2.dex */
public final class SearchActivity extends BaseActivity {

    /* renamed from: f0 */
    public TransactionCacheManager f23984f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23985g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f23986h0;

    /* renamed from: i0 */
    private final AbstractC0304b f23987i0;

    /* renamed from: j0 */
    private final AbstractC0304b f23988j0;

    /* renamed from: k0 */
    private final InterfaceC13178g f23989k0;

    /* renamed from: l0 */
    private final FiltersBottomSheetFragment f23990l0;

    /* renamed from: m0 */
    private final C5117h f23991m0;

    /* renamed from: n0 */
    private final InterfaceC6108l f23992n0;

    /* renamed from: o0 */
    private final InterfaceC6108l f23993o0;

    /* renamed from: p0 */
    private final C9120n f23994p0;

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9106a {
        private C9106a() {
        }

        public /* synthetic */ C9106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$b */
    /* loaded from: classes2.dex */
    static final class C9107b extends AbstractC6438m implements InterfaceC6112p {
        C9107b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12451a((String) obj, (List) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12451a(String str, List list) {
            SearchActivity.m12505B1(SearchActivity.this).m12366q1(list != null ? !list.isEmpty() : false);
            SearchActivity.m12505B1(SearchActivity.this).m12352z0(str, list);
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$c */
    /* loaded from: classes2.dex */
    static final class C9108c extends AbstractC6438m implements InterfaceC6108l {
        C9108c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12450a(boolean z) {
            SearchActivity.m12505B1(SearchActivity.this).m12376l1(z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12450a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$d */
    /* loaded from: classes2.dex */
    static final class C9109d extends AbstractC6438m implements InterfaceC6097a {
        C9109d() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12498I1 = SearchActivity.this.m12498I1();
            SearchActivity searchActivity = SearchActivity.this;
            return m12498I1.m20377b(searchActivity, searchActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchActivity$initViews$1", m20196f = "SearchActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9110e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23998x;

        /* renamed from: z */
        final /* synthetic */ SearchViewModel f24000z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SearchActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$e$a */
        /* loaded from: classes2.dex */
        public static final class C9111a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ SearchViewModel f24001w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9111a(SearchViewModel searchViewModel) {
                super(0);
                this.f24001w = searchViewModel;
            }

            /* renamed from: a */
            public final void m12447a() {
                this.f24001w.m22605X();
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m12447a();
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9110e(SearchViewModel searchViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24000z = searchViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9110e(this.f24000z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9110e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23998x == 0) {
                C13186n.m1453b(obj);
                SearchActivity.m12453y1(SearchActivity.this).m25637U(new C9111a(this.f24000z));
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9112f extends RecyclerView.AbstractC1555t {

        /* renamed from: a */
        private final float f24002a = UtilsExtensions.m35167e(1);

        /* renamed from: b */
        private final float f24003b = UtilsExtensions.m35167e(7);

        /* renamed from: c */
        final /* synthetic */ AbstractC11723d3 f24004c;

        C9112f(AbstractC11723d3 abstractC11723d3) {
            this.f24004c = abstractC11723d3;
        }

        /* renamed from: b */
        public void mo29913b(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            super.mo29913b(recyclerView, i, i2);
            float rint = (float) Math.rint(Math.abs((recyclerView.computeVerticalScrollOffset() * 100.0f) / (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent())));
            if (Float.isNaN(rint) || rint <= this.f24002a || rint >= this.f24003b) {
                return;
            }
            this.f24004c.f30070D.f30330x.setElevation(rint);
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9113g implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ SearchViewModel f24005a;

        /* renamed from: b */
        final /* synthetic */ SearchActivity f24006b;

        /* renamed from: c */
        final /* synthetic */ SearchViewModel f24007c;

        public C9113g(SearchViewModel searchViewModel, SearchActivity searchActivity, SearchActivity searchActivity2, SearchViewModel searchViewModel2) {
            this.f24005a = searchViewModel;
            this.f24006b = searchActivity;
            this.f24007c = searchViewModel2;
        }

        /* renamed from: a */
        public void m12445a(boolean z) {
            if (z) {
                SearchActivity.m12454x1(this.f24006b).mo9587d(C13195u.f34156a);
                this.f24007c.m22605X();
            }
            this.f24006b.setResult(-1);
        }

        /* renamed from: b */
        public void m12444b(boolean z) {
        }

        /* renamed from: c */
        public void m12443c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            LiteralProduct m12421F0 = this.f24005a.m12421F0();
            if (m12421F0 != null) {
                C2354b.m33844b(this.f24006b);
                SearchViewModel searchViewModel = this.f24005a;
                m12421F0.m14377M(i);
                searchViewModel.m22609T(m12421F0);
            }
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$h */
    /* loaded from: classes2.dex */
    static final class C9114h extends AbstractC6438m implements InterfaceC6097a {
        C9114h() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.valueOf(SearchActivity.this.getIntent().getBooleanExtra("EXTRA_FOR_TRADE", false));
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$i */
    /* loaded from: classes2.dex */
    static final class C9115i extends AbstractC6438m implements InterfaceC6108l {
        C9115i() {
            super(1);
        }

        /* renamed from: a */
        public final void m12441a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView quantityPickerView = SearchActivity.m12460s1(SearchActivity.this).f30070D.f30331y;
            Intrinsics.checkIfNull(quantityPickerView, "binding.manualProductInc….manualQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12441a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$j */
    /* loaded from: classes2.dex */
    static final class C9116j extends AbstractC6438m implements InterfaceC6113q {
        C9116j() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m12440a(((Number) obj).intValue(), (CatalogProduct) obj2, (View) obj3);
            return C13195u.f34156a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
            if (r8 <= ((androidx.recyclerview.widget.LinearLayoutManager) r0).m36770c2()) goto L5;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m12440a(int r8, pt.pingodoce.app.data.local.models.products.CatalogProduct r9, android.view.View r10) {
            /*
                r7 = this;
                java.lang.String r0 = "product"
                p181jd.Intrinsics.isThisObjectNull(r9, r0)
                java.lang.String r0 = "view"
                p181jd.Intrinsics.isThisObjectNull(r10, r0)
                pt.pingodoce.app.presentation.common.search.SearchActivity r0 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                com.github.guilhe.keyboardevents.C2354b.m33844b(r0)
                pt.pingodoce.app.presentation.common.search.SearchActivity r0 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                androidx.activity.result.b r1 = pt.pingodoce.app.presentation.common.search.SearchActivity.m12458u1(r0)
                pt.pingodoce.app.presentation.common.search.SearchActivity r2 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                wg.d3 r0 = pt.pingodoce.app.presentation.common.search.SearchActivity.m12460s1(r2)
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f30075I
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.lang.String r3 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36776W1()
                if (r8 < r0) goto L46
                pt.pingodoce.app.presentation.common.search.SearchActivity r0 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                wg.d3 r0 = pt.pingodoce.app.presentation.common.search.SearchActivity.m12460s1(r0)
                com.github.guilhe.views.PlaceHolderRecyclerView r0 = r0.f30075I
                androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
                java.util.Objects.requireNonNull(r0, r3)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r0 = r0.m36770c2()
                if (r8 > r0) goto L46
                goto L47
            L46:
                r10 = 0
            L47:
                r4 = r10
                pt.pingodoce.app.presentation.common.search.SearchActivity r8 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                boolean r5 = pt.pingodoce.app.presentation.common.search.SearchActivity.m12456w1(r8)
                pt.pingodoce.app.presentation.common.search.SearchActivity r8 = pt.pingodoce.app.presentation.common.search.SearchActivity.this
                mg.q1 r6 = r8.m12499H1()
                r3 = r9
                p048cj.ProductDetailActivity.m34575a(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.search.SearchActivity.C9116j.m12440a(int, pt.pingodoce.app.data.local.models.products.CatalogProduct, android.view.View):void");
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$k */
    /* loaded from: classes2.dex */
    static final class C9117k extends AbstractC6438m implements InterfaceC6112p {
        C9117k() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12439a((CatalogProduct) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12439a(CatalogProduct catalogProduct, int i) {
            Intrinsics.isThisObjectNull(catalogProduct, "product");
            C2354b.m33844b(SearchActivity.this);
            SearchActivity.m12505B1(SearchActivity.this).m22610S(catalogProduct, i);
            if (SearchActivity.m12456w1(SearchActivity.this)) {
                SearchActivity.this.setResult(-1);
            }
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$l */
    /* loaded from: classes2.dex */
    static final class C9118l extends AbstractC6438m implements InterfaceC6108l {
        C9118l() {
            super(1);
        }

        /* renamed from: a */
        public final void m12438a(String str) {
            Intrinsics.isThisObjectNull(str, "query");
            SearchActivity.m12505B1(SearchActivity.this).m12394c1(str);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12438a((String) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$m */
    /* loaded from: classes2.dex */
    static final class C9119m extends AbstractC6438m implements InterfaceC6097a {
        C9119m() {
            super(0);
        }

        /* renamed from: a */
        public final SearchView mo42214q() {
            SearchView searchView = SearchActivity.m12460s1(SearchActivity.this).f30069C;
            Intrinsics.checkIfNull(searchView, "binding.inputSearchView");
            return searchView;
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$n */
    /* loaded from: classes2.dex */
    public static final class C9120n implements SearchView.InterfaceC0439l {
        C9120n() {
        }

        /* renamed from: a */
        public boolean mo40760a(String str) {
            Intrinsics.isThisObjectNull(str, "newText");
            SearchActivity.m12505B1(SearchActivity.this).m12362s1(str.length() == 0);
            if (str.length() == 0) {
                SearchActivity.m12505B1(SearchActivity.this).m12364r1(false);
                SearchActivity.m12505B1(SearchActivity.this).m12374m1(false);
                SearchActivity.m12505B1(SearchActivity.this).m12376l1(false);
                SearchActivity.m12505B1(SearchActivity.this).m12360t1(false);
                SearchActivity.m12505B1(SearchActivity.this).m12358u1(false);
                SearchActivity.m12505B1(SearchActivity.this).m12425B0();
                SearchActivity.m12505B1(SearchActivity.this).m12368p1(BuildConfig.VERSION_NAME);
            }
            SearchActivity.m12452z1(SearchActivity.this).mo9587d(str);
            return true;
        }

        /* renamed from: b */
        public boolean mo40759b(String str) {
            Intrinsics.isThisObjectNull(str, "query");
            SearchActivity.m12452z1(SearchActivity.this).mo9587d(str);
            SearchActivity.m12505B1(SearchActivity.this).m12353y0(str);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$o */
    /* loaded from: classes2.dex */
    public static final class C9121o extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SearchActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchActivity$setupNavigationObserver$1$1", m20196f = "SearchActivity.kt", m20195l = {311}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$o$a */
        /* loaded from: classes2.dex */
        public static final class C9122a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24016x;

            /* renamed from: y */
            final /* synthetic */ SearchActivity f24017y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9122a(SearchActivity searchActivity, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24017y = searchActivity;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9122a(this.f24017y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9122a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24016x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    SearchActivity searchActivity = this.f24017y;
                    AbstractC0304b m12457v1 = SearchActivity.m12457v1(searchActivity);
                    this.f24016x = 1;
                    if (C1924a.m35138a(searchActivity, m12457v1, this) == m34636d) {
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

        C9121o() {
            super(1);
        }

        /* renamed from: a */
        public final void m12434a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            C2354b.m33844b(SearchActivity.this);
            SearchActivity.m12460s1(SearchActivity.this).f30069C.clearFocus();
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (Intrinsics.equals(interfaceC7186c, C13833f2.f34941a)) {
                SearchActivity.m12461r1(SearchActivity.this);
            } else if (Intrinsics.equals(interfaceC7186c, C13904t1.f35025a)) {
                ProductDetailActivity.m34575a(SearchActivity.m12458u1(SearchActivity.this), SearchActivity.this, (CatalogProduct) c13182l.m1459d(), null, SearchActivity.m12456w1(SearchActivity.this), SearchActivity.this.m12499H1());
            } else if (Intrinsics.equals(interfaceC7186c, C13809a2.f34917a)) {
                if (SearchActivity.m12459t1(SearchActivity.this).m37573n0()) {
                    return;
                }
                SearchActivity.m12459t1(SearchActivity.this).mo3126x2(SearchActivity.this.m37323P(), "filters_bottom_sheet");
            } else if (Intrinsics.equals(interfaceC7186c, C13827e0.f34934a)) {
                LifecycleOwner.m36965a(SearchActivity.this).m36984i(new C9122a(SearchActivity.this, null));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12434a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$p */
    /* loaded from: classes2.dex */
    public static final class C9123p extends AbstractC6438m implements InterfaceC6108l {
        C9123p() {
            super(1);
        }

        /* renamed from: a */
        public final void m12432a(String str) {
            Intrinsics.isThisObjectNull(str, "it");
            SearchActivity.m12506A1(SearchActivity.this).m40776d0(str, true);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12432a((String) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchActivity$setupRecentProductsObserver$1$2$1", m20196f = "SearchActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$q */
    /* loaded from: classes2.dex */
    public static final class C9124q extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24019x;

        /* renamed from: y */
        final /* synthetic */ RecentProductsAdapter f24020y;

        /* renamed from: z */
        final /* synthetic */ Set f24021z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9124q(RecentProductsAdapter recentProductsAdapter, Set set, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24020y = recentProductsAdapter;
            this.f24021z = set;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9124q(this.f24020y, this.f24021z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9124q) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            List m455n0;
            List m465d0;
            C2116d.m34636d();
            if (this.f24019x == 0) {
                C13186n.m1453b(obj);
                RecentProductsAdapter recentProductsAdapter = this.f24020y;
                Set set = this.f24021z;
                Intrinsics.checkIfNull(set, "recentProducts");
                m455n0 = _Collections.m455n0(set);
                m465d0 = _Collections.m465d0(m455n0);
                recentProductsAdapter.m22153F(m465d0);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$r */
    /* loaded from: classes2.dex */
    public static final class C9125r extends EndlessRecyclerOnScrollListener {

        /* renamed from: c */
        final /* synthetic */ SearchActivity f24022c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9125r(RecyclerView.AbstractC1546o abstractC1546o, SearchActivity searchActivity) {
            super((LinearLayoutManager) abstractC1546o, 0, 2, null);
            this.f24022c = searchActivity;
        }

        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
            Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
            super.mo29914a(recyclerView, i);
            if (i == 1) {
                C2354b.m33844b(this.f24022c);
                SearchActivity.m12505B1(this.f24022c).m12353y0(SearchActivity.m12506A1(this.f24022c).getQuery().toString());
            }
        }

        /* renamed from: c */
        public void m12429c(int i) {
            SearchActivity.m12505B1(this.f24022c).m12398a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$s */
    /* loaded from: classes2.dex */
    public static final class C9126s extends AbstractC6438m implements InterfaceC6108l {
        C9126s() {
            super(1);
        }

        /* renamed from: a */
        public final void m12428a(Tag tag) {
            List m202b;
            Intrinsics.isThisObjectNull(tag, "it");
            SearchActivity.m12506A1(SearchActivity.this).setOnQueryTextListener(null);
            SearchActivity.m12506A1(SearchActivity.this).m40776d0(tag.m13690c(), false);
            SearchActivity.m12505B1(SearchActivity.this).m12368p1(tag.m13690c());
            SearchViewModel m12505B1 = SearchActivity.m12505B1(SearchActivity.this);
            m202b = CollectionsJVM.m202b(Integer.valueOf(tag.m13691b()));
            SearchViewModel.m12390e1(m12505B1, new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, m202b, null, null, null, null, 0, 0, false, 261119, null), false, 2, null);
            SearchActivity searchActivity = SearchActivity.this;
            SearchActivity.m12504C1(searchActivity, SearchActivity.m12506A1(searchActivity));
            SearchActivity.m12505B1(SearchActivity.this).m12353y0(tag.m13690c());
            SearchActivity.m12505B1(SearchActivity.this).m12358u1(false);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12428a((Tag) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchActivity$setupTagsObserver$1$1$2$1", m20196f = "SearchActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.search.SearchActivity$t */
    /* loaded from: classes2.dex */
    public static final class C9127t extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24024x;

        /* renamed from: y */
        final /* synthetic */ CategoryFilterAdapter f24025y;

        /* renamed from: z */
        final /* synthetic */ List f24026z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9127t(CategoryFilterAdapter categoryFilterAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24025y = categoryFilterAdapter;
            this.f24026z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9127t(this.f24025y, this.f24026z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9127t) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24024x == 0) {
                C13186n.m1453b(obj);
                CategoryFilterAdapter categoryFilterAdapter = this.f24025y;
                List list = this.f24026z;
                Intrinsics.checkIfNull(list, "tags");
                categoryFilterAdapter.m22153F(list);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new C9106a(null);
    }

    public SearchActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        m1464a = LazyJVM.m1464a(new C9114h());
        this.f23986h0 = m1464a;
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fj.p
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                SearchActivity.m12503D1(SearchActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…        }\n        }\n    }");
        this.f23987i0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fj.o
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                SearchActivity.m12502E1(SearchActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…        }\n        }\n    }");
        this.f23988j0 = m41364M2;
        m1464a2 = LazyJVM.m1464a(new C9119m());
        this.f23989k0 = m1464a2;
        FiltersBottomSheetFragment m12511a = FiltersBottomSheetFragment.f23968V0.m12511a(new C9107b(), new C9108c());
        m12511a.m12518X2(this);
        this.f23990l0 = m12511a;
        this.f23991m0 = new C5117h(LifecycleOwner.m36965a(this), EnumC5125l.SMALL, new C9116j(), new C9117k());
        this.f23992n0 = OperatorExtensions.m35180a(2000L, LifecycleOwner.m36965a(this), new C9115i());
        this.f23993o0 = OperatorExtensions.m35180a(500L, LifecycleOwner.m36965a(this), new C9118l());
        this.f23994p0 = new C9120n();
    }

    /* renamed from: A1 */
    public static final /* synthetic */ SearchView m12506A1(SearchActivity searchActivity) {
        return searchActivity.m12494K1();
    }

    /* renamed from: B1 */
    public static final /* synthetic */ SearchViewModel m12505B1(SearchActivity searchActivity) {
        return (SearchViewModel) searchActivity.m22758I0();
    }

    /* renamed from: C1 */
    public static final /* synthetic */ void m12504C1(SearchActivity searchActivity, SearchView searchView) {
        searchActivity.m12476a2(searchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m12503D1(SearchActivity searchActivity, ActivityResult activityResult) {
        Bundle extras;
        Bundle extras2;
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            Intent m41352a = activityResult.m41352a();
            boolean z = true;
            if ((m41352a == null || (extras2 = m41352a.getExtras()) == null || !extras2.getBoolean("EXTRA_FOR_TRADE_COMPLETED")) ? false : true) {
                searchActivity.setResult(-1);
                return;
            }
            Intent m41352a2 = activityResult.m41352a();
            if (m41352a2 == null || (extras = m41352a2.getExtras()) == null || !extras.getBoolean("EXTRA_FOR_PRODUCT_CASCADE_FINISH")) {
                z = false;
            }
            if (z) {
                searchActivity.m12501F1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m12502E1(SearchActivity searchActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        C10144b m9065g = C10143a.m9065g(activityResult.m41351b(), activityResult.m41352a());
        if (m9065g != null) {
            String m9059a = m9065g.m9059a();
            if (m9059a == null) {
                m9059a = BuildConfig.VERSION_NAME;
            } else {
                Intrinsics.checkIfNull(m9059a, "result.contents ?: \"\"");
            }
            ((SearchViewModel) searchActivity.m22758I0()).m12426A0();
            if (m9059a.length() > 0) {
                ((SearchViewModel) searchActivity.m22758I0()).m12392d1(new SearchCatalogParameters(0, Long.valueOf(Long.parseLong(m9059a)), null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262141, null), true);
            }
        }
    }

    /* renamed from: F1 */
    private final void m12501F1() {
        setResult(-1);
        finish();
    }

    /* renamed from: J1 */
    private final boolean m12496J1() {
        return ((Boolean) this.f23986h0.getValue()).booleanValue();
    }

    /* renamed from: K1 */
    private final SearchView m12494K1() {
        return (SearchView) this.f23989k0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static final boolean m12491M1(SearchActivity searchActivity, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        searchActivity.f23992n0.mo9587d(C13195u.f34156a);
        return view.onTouchEvent(motionEvent);
    }

    /* renamed from: N1 */
    private final void m12490N1() {
        m12476a2(m12494K1());
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11723d3) m22738w0()).f30075I;
        Intrinsics.checkIfNull(placeHolderRecyclerView, "binding.searchRecyclerView");
        m12475b2(placeHolderRecyclerView);
        ConstraintLayout constraintLayout = ((AbstractC11723d3) m22738w0()).f30071E.f30501x;
        Intrinsics.checkIfNull(constraintLayout, "binding.noProductInclude.noProductConstraintLayout");
        m12485R1(constraintLayout);
        MaterialCardView materialCardView = ((AbstractC11723d3) m22738w0()).f30070D.f30330x;
        Intrinsics.checkIfNull(materialCardView, "binding.manualProductInc…alProductMaterialCardView");
        m12489O1(materialCardView);
    }

    /* renamed from: O1 */
    private final void m12489O1(MaterialCardView materialCardView) {
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: fj.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m12487P1(SearchActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m12487P1(SearchActivity searchActivity, View view) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        C2354b.m33844b(searchActivity);
        ((SearchViewModel) searchActivity.m22758I0()).m12353y0(searchActivity.m12494K1().getQuery().toString());
    }

    /* renamed from: Q1 */
    private final void m12486Q1() {
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9121o()));
    }

    /* renamed from: R1 */
    private final void m12485R1(ConstraintLayout constraintLayout) {
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: fj.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.m12484S1(SearchActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m12484S1(SearchActivity searchActivity, View view) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        C2354b.m33844b(searchActivity);
        ((SearchViewModel) searchActivity.m22758I0()).m12353y0(searchActivity.m12494K1().getQuery().toString());
    }

    /* renamed from: T1 */
    private final void m12483T1() {
        m12486Q1();
        m12474c2();
        m12481V1();
        m12478Y1();
    }

    /* renamed from: U1 */
    private final void m12482U1() {
        ((SearchViewModel) m22758I0()).m12370o1(getIntent().getBooleanExtra("EXTRA_FOR_HAS_PROMO", false));
        int intExtra = getIntent().getIntExtra("EXTRA_FOR_FLYER_ID", -1);
        if (intExtra != -1) {
            ((SearchViewModel) m22758I0()).m12372n1(intExtra);
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_FOR_QUERY");
        if (stringExtra != null) {
            m12494K1().m40776d0(stringExtra, true);
        }
    }

    /* renamed from: V1 */
    private final void m12481V1() {
        ((SearchViewModel) m22758I0()).m12416K0().mo171i(this, new InterfaceC1440f0() { // from class: fj.r
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SearchActivity.m12480W1(SearchActivity.this, (List) obj);
            }
        });
        ((SearchViewModel) m22758I0()).m12409Q0().mo171i(this, new InterfaceC1440f0() { // from class: fj.q
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SearchActivity.m12479X1(SearchActivity.this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m12480W1(SearchActivity searchActivity, List list) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        if (list != null) {
            if (!list.isEmpty()) {
                searchActivity.m145b1().mo41749a(AbstractC0151j.C0157f.f337a);
            }
            searchActivity.m12472e2(!list.isEmpty());
        }
        C5117h c5117h = searchActivity.f23991m0;
        Intrinsics.checkIfNull(list, "list");
        c5117h.m22153F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m12479X1(SearchActivity searchActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        C2046o.m34853a(((AbstractC11723d3) searchActivity.m22738w0()).f30075I);
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11723d3) searchActivity.m22738w0()).f30075I;
        Intrinsics.checkIfNull(bool, "isLoading");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: Y1 */
    private final void m12478Y1() {
        ((SearchViewModel) m22758I0()).m12414M0().mo171i(this, new InterfaceC1440f0() { // from class: fj.t
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SearchActivity.m12477Z1(SearchActivity.this, (Set) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m12477Z1(SearchActivity searchActivity, Set set) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        RecyclerView recyclerView = ((AbstractC11723d3) searchActivity.m22738w0()).f30078y;
        RecentProductsAdapter recentProductsAdapter = new RecentProductsAdapter(new C9123p());
        C6772d.m20158d(LifecycleOwner.m36965a(searchActivity), null, null, new C9124q(recentProductsAdapter, set, null), 3, null);
        recyclerView.setAdapter(recentProductsAdapter);
    }

    /* renamed from: a2 */
    private final void m12476a2(SearchView searchView) {
        searchView.setOnQueryTextListener(this.f23994p0);
    }

    /* renamed from: b2 */
    private final void m12475b2(RecyclerView recyclerView) {
        RecyclerView.AbstractC1546o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            recyclerView.m36645l(new C9125r(layoutManager, this));
        }
    }

    /* renamed from: c2 */
    private final void m12474c2() {
        ((SearchViewModel) m22758I0()).m12408R0().mo171i(this, new InterfaceC1440f0() { // from class: fj.s
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SearchActivity.m12473d2(SearchActivity.this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m12473d2(SearchActivity searchActivity, List list) {
        Intrinsics.isThisObjectNull(searchActivity, "this$0");
        Intrinsics.checkIfNull(list, "tags");
        ((SearchViewModel) searchActivity.m22758I0()).m12358u1(!list.isEmpty());
        RecyclerView recyclerView = ((AbstractC11723d3) searchActivity.m22738w0()).f30077x;
        CategoryFilterAdapter categoryFilterAdapter = new CategoryFilterAdapter(new C9126s());
        C6772d.m20158d(LifecycleOwner.m36965a(searchActivity), null, null, new C9127t(categoryFilterAdapter, list, null), 3, null);
        recyclerView.setAdapter(categoryFilterAdapter);
        if (recyclerView.getOnFlingListener() == null) {
            new C1636p().m35821b(recyclerView);
        }
    }

    /* renamed from: e2 */
    private final void m12472e2(boolean z) {
        if (!z) {
            ViewGroup.LayoutParams layoutParams = ((AbstractC11723d3) m22738w0()).f30067A.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            ((AppBarLayout.C3455f) layoutParams).m30664g(0);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = ((AbstractC11723d3) m22738w0()).f30067A.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        ((AppBarLayout.C3455f) layoutParams2).m30664g(7);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12471i1(SearchActivity searchActivity, List list) {
        m12480W1(searchActivity, list);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12470j1(SearchActivity searchActivity, ActivityResult activityResult) {
        m12502E1(searchActivity, activityResult);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m12469k1(SearchActivity searchActivity, Set set) {
        m12477Z1(searchActivity, set);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m12468l1(SearchActivity searchActivity, View view) {
        m12487P1(searchActivity, view);
    }

    /* renamed from: m1 */
    public static /* synthetic */ boolean m12467m1(SearchActivity searchActivity, View view, MotionEvent motionEvent) {
        return m12491M1(searchActivity, view, motionEvent);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m12465n1(SearchActivity searchActivity, Boolean bool) {
        m12479X1(searchActivity, bool);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m12464o1(SearchActivity searchActivity, View view) {
        m12484S1(searchActivity, view);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m12463p1(SearchActivity searchActivity, List list) {
        m12473d2(searchActivity, list);
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m12462q1(SearchActivity searchActivity, ActivityResult activityResult) {
        m12503D1(searchActivity, activityResult);
    }

    /* renamed from: r1 */
    public static final /* synthetic */ void m12461r1(SearchActivity searchActivity) {
        searchActivity.m12501F1();
    }

    /* renamed from: s1 */
    public static final /* synthetic */ AbstractC11723d3 m12460s1(SearchActivity searchActivity) {
        return (AbstractC11723d3) searchActivity.m22738w0();
    }

    /* renamed from: t1 */
    public static final /* synthetic */ FiltersBottomSheetFragment m12459t1(SearchActivity searchActivity) {
        return searchActivity.f23990l0;
    }

    /* renamed from: u1 */
    public static final /* synthetic */ AbstractC0304b m12458u1(SearchActivity searchActivity) {
        return searchActivity.f23987i0;
    }

    /* renamed from: v1 */
    public static final /* synthetic */ AbstractC0304b m12457v1(SearchActivity searchActivity) {
        return searchActivity.f23988j0;
    }

    /* renamed from: w1 */
    public static final /* synthetic */ boolean m12456w1(SearchActivity searchActivity) {
        return searchActivity.m12496J1();
    }

    /* renamed from: x1 */
    public static final /* synthetic */ InterfaceC6108l m12454x1(SearchActivity searchActivity) {
        return searchActivity.f23992n0;
    }

    /* renamed from: y1 */
    public static final /* synthetic */ C5117h m12453y1(SearchActivity searchActivity) {
        return searchActivity.f23991m0;
    }

    /* renamed from: z1 */
    public static final /* synthetic */ InterfaceC6108l m12452z1(SearchActivity searchActivity) {
        return searchActivity.f23993o0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G1 */
    public C5578b mo42216v0() {
        return new C5578b();
    }

    /* renamed from: H1 */
    public final TransactionCacheManager m12499H1() {
        TransactionCacheManager transactionCacheManager = this.f23984f0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: I1 */
    public final ViewModelFactoryByInjection m12498I1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23985g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12497J0() {
        return C6450z.m20906b(SearchViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12495K0() {
        return new C9109d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: L1 */
    public void m12488P0(AbstractC11723d3 abstractC11723d3, SearchViewModel searchViewModel) {
        Intrinsics.isThisObjectNull(abstractC11723d3, "binding");
        Intrinsics.isThisObjectNull(searchViewModel, "viewModel");
        LifecycleOwner.m36965a(this).m36985h(new C9110e(searchViewModel, null));
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11723d3.f30075I;
        placeHolderRecyclerView.setAdapter(this.f23991m0);
        placeHolderRecyclerView.setHoldersAdapter(new ItemSmallPlaceHolderAdapter());
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(16), 0, 0, false, false, 0, 76, null));
        placeHolderRecyclerView.m36645l(new C9112f(abstractC11723d3));
        QuantityPickerView quantityPickerView = abstractC11723d3.f30070D.f30331y;
        quantityPickerView.setOnTouchListener(new View.OnTouchListener() { // from class: fj.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m11348M1;
                m11348M1 = SearchActivity.m12491M1(SearchActivity.this, view, motionEvent);
                return m11348M1;
            }
        });
        Intrinsics.checkIfNull(quantityPickerView, BuildConfig.VERSION_NAME);
        quantityPickerView.setActionListener(new C9113g(searchViewModel, this, this, searchViewModel));
        m12483T1();
        m12490N1();
        m12482U1();
    }

    /* renamed from: M0 */
    protected boolean m12492M0() {
        return true;
    }

    /* renamed from: n */
    public boolean m12466n() {
        return true;
    }

    protected void onResume() {
        super.onResume();
        ((SearchViewModel) m22758I0()).m12396b1();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_search;
    }
}
