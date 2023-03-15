package pt.pingodoce.app.presentation.common.search;

import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7235d1;
import mg.C7256f1;
import mg.C7310l;
import mg.RecentProductManager;
import p145hj.CartViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p447xe.NoConnectionException;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13190q;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13777q;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import p494zh.C13809a2;
import p494zh.C13827e0;
import p494zh.C13904t1;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;
import pt.pingodoce.app.data.remote.models.response.Tag;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;
import pt.pingodoce.app.presentation.common.search.models.Criteria;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.common.search.a */
/* loaded from: classes2.dex */
public final class SearchViewModel extends CartViewModel {

    /* renamed from: A */
    private LiteralProduct f24027A;

    /* renamed from: B */
    private final InterfaceC6108l f24028B;

    /* renamed from: C */
    private boolean f24029C;

    /* renamed from: D */
    private final InterfaceC6108l f24030D;

    /* renamed from: E */
    private final C1436e0 f24031E;

    /* renamed from: F */
    private final C1436e0 f24032F;

    /* renamed from: G */
    private final C1436e0 f24033G;

    /* renamed from: H */
    private final C1436e0 f24034H;

    /* renamed from: I */
    private final C1436e0 f24035I;

    /* renamed from: J */
    private final C1436e0 f24036J;

    /* renamed from: K */
    private final C1436e0 f24037K;

    /* renamed from: L */
    private final C1436e0 f24038L;

    /* renamed from: M */
    private final C1436e0 f24039M;

    /* renamed from: N */
    private final C1436e0 f24040N;

    /* renamed from: O */
    private final C1436e0 f24041O;

    /* renamed from: P */
    private final C1436e0 f24042P;

    /* renamed from: Q */
    private final C1436e0 f24043Q;

    /* renamed from: R */
    private final C1436e0 f24044R;

    /* renamed from: S */
    private final C1436e0 f24045S;

    /* renamed from: T */
    private final C1436e0 f24046T;

    /* renamed from: U */
    private final LiveData f24047U;

    /* renamed from: V */
    private final LiveData f24048V;

    /* renamed from: W */
    private final LiveData f24049W;

    /* renamed from: X */
    private final LiveData f24050X;

    /* renamed from: Y */
    private final LiveData f24051Y;

    /* renamed from: Z */
    private final LiveData f24052Z;

    /* renamed from: a0 */
    private final LiveData f24053a0;

    /* renamed from: b0 */
    private final LiveData f24054b0;

    /* renamed from: c0 */
    private final LiveData f24055c0;

    /* renamed from: d0 */
    private final LiveData f24056d0;

    /* renamed from: e0 */
    private final LiveData f24057e0;

    /* renamed from: q */
    private final C7310l f24058q;

    /* renamed from: r */
    private final RecentProductManager f24059r;

    /* renamed from: s */
    private SearchCatalogParameters f24060s;

    /* renamed from: t */
    private final InterfaceC13178g f24061t;

    /* renamed from: u */
    private final InterfaceC13178g f24062u;

    /* renamed from: v */
    private C1436e0 f24063v;

    /* renamed from: w */
    private String f24064w;

    /* renamed from: x */
    private List f24065x;

    /* renamed from: y */
    private Boolean f24066y;

    /* renamed from: z */
    private Integer f24067z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9128a {
        SCAN_EAN,
        FILTER
    }

    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$b */
    /* loaded from: classes2.dex */
    public static final class C9129b {
        private C9129b() {
        }

        public /* synthetic */ C9129b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$c */
    /* loaded from: classes2.dex */
    public static final class C9130c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f24068w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9130c(ResourcesProvider resourcesProvider) {
            super(0);
            this.f24068w = resourcesProvider;
        }

        /* renamed from: a */
        public final ShoppingListCategory mo42214q() {
            String string = this.f24068w.m6899a().getString(C2336R.string.lbl_default_product_category);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            ResourcesProvider resourcesProvider = this.f24068w;
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(resourcesProvider.m6899a(), 2131951714).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            String hexString = Integer.toHexString(C0928a.m39113d(resourcesProvider.m6899a(), typedValue.resourceId));
            Intrinsics.checkIfNull(hexString, "toHexString(\n           …          )\n            )");
            Locale locale = Locale.getDefault();
            Intrinsics.checkIfNull(locale, "getDefault()");
            String lowerCase = hexString.toLowerCase(locale);
            Intrinsics.checkIfNull(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return new ShoppingListCategory(string, "#" + lowerCase, 0, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$d */
    /* loaded from: classes2.dex */
    public static final class C9131d extends AbstractC6438m implements InterfaceC6108l {
        C9131d() {
            super(1);
        }

        /* renamed from: a */
        public final void m12350a(C13195u c13195u) {
            SearchCatalogParameters searchCatalogParameters;
            String str;
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (!Intrinsics.equals(SearchViewModel.this.m20387j().mo172f(), Boolean.FALSE) || (searchCatalogParameters = (SearchCatalogParameters) SearchViewModel.m12375m0(SearchViewModel.this).mo172f()) == null) {
                return;
            }
            SearchViewModel searchViewModel = SearchViewModel.this;
            Integer num = (Integer) SearchViewModel.m12383i0(searchViewModel).mo172f();
            if (num == null || (str = (String) SearchViewModel.m12379k0(searchViewModel).mo172f()) == null) {
                return;
            }
            Intrinsics.checkIfNull(str, "totalHits");
            SearchViewModel.m12355w0(searchViewModel, Integer.parseInt(str) == 0);
            if (SearchViewModel.m12391e0(searchViewModel) || Integer.parseInt(str) <= num.intValue() * searchCatalogParameters.m13985n()) {
                return;
            }
            SearchViewModel.m12390e1(searchViewModel, SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, num.intValue() + 1, 0, false, 229375, null), false, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12350a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$e */
    /* loaded from: classes2.dex */
    public static final class C9132e extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: SearchViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.common.search.a$e$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9133a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24071a;

            static {
                int[] iArr = new int[EnumC9128a.values().length];
                iArr[EnumC9128a.SCAN_EAN.ordinal()] = 1;
                iArr[EnumC9128a.FILTER.ordinal()] = 2;
                f24071a = iArr;
            }
        }

        C9132e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12349a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "type");
            int i = C9133a.f24071a[((EnumC9128a) c13182l.m1460c()).ordinal()];
            if (i == 1) {
                BaseViewModel.m119C(SearchViewModel.this, C13827e0.f34934a, null, 2, null);
            } else if (i != 2) {
            } else {
                BaseViewModel.m119C(SearchViewModel.this, C13809a2.f34917a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12349a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$f */
    /* loaded from: classes2.dex */
    public static final class C9134f extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ResourcesProvider f24072w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9134f(ResourcesProvider resourcesProvider) {
            super(0);
            this.f24072w = resourcesProvider;
        }

        /* renamed from: a */
        public final String mo42214q() {
            String quantityString = this.f24072w.m6899a().getResources().getQuantityString(C2336R.plurals.lbl_products_total_plurals, 0, Arrays.copyOf(new Object[]{0}, 1));
            Intrinsics.checkIfNull(quantityString, "ctx.resources.getQuantit…d, quantity, *formatArgs)");
            return quantityString;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchViewModel$searchCatalog$1", m20196f = "SearchViewModel.kt", m20195l = {237}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$g */
    /* loaded from: classes2.dex */
    public static final class C9135g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ SearchCatalogParameters f24073A;

        /* renamed from: x */
        int f24074x;

        /* renamed from: z */
        final /* synthetic */ boolean f24076z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SearchViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchViewModel$searchCatalog$1$1", m20196f = "SearchViewModel.kt", m20195l = {238}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.common.search.a$g$a */
        /* loaded from: classes2.dex */
        public static final class C9136a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24077x;

            /* renamed from: y */
            final /* synthetic */ SearchViewModel f24078y;

            /* renamed from: z */
            final /* synthetic */ SearchCatalogParameters f24079z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9136a(SearchViewModel searchViewModel, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24078y = searchViewModel;
                this.f24079z = searchCatalogParameters;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9136a(this.f24078y, this.f24079z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9136a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24077x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m12395c0 = SearchViewModel.m12395c0(this.f24078y);
                    SearchCatalogParameters m12393d0 = SearchViewModel.m12393d0(this.f24078y);
                    if (m12393d0 == null) {
                        Intrinsics.throwUninitPropException("lastParameters");
                        m12393d0 = null;
                    }
                    this.f24077x = 1;
                    obj = m12395c0.m18720w(m12393d0, false, this);
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
                    SearchViewModel.m12354x0(this.f24078y, false);
                    Result.C8078c c8078c = (Result.C8078c) result;
                    this.f24078y.m22604Y(((CatalogResponse) c8078c.m16962b()).m13885a());
                    SearchViewModel.m12379k0(this.f24078y).mo166p(String.valueOf(((CatalogResponse) c8078c.m16962b()).m13883c()));
                    List<CatalogProduct> m13884b = ((CatalogResponse) c8078c.m16962b()).m13884b();
                    SearchViewModel searchViewModel = this.f24078y;
                    for (CatalogProduct catalogProduct : m13884b) {
                        catalogProduct.m14521X(0);
                        ShoppingListProduct m22607V = searchViewModel.m22607V(catalogProduct.m14499y());
                        if (m22607V != null) {
                            catalogProduct.m14521X(m22607V.m14332j() ? catalogProduct.m14538G() : m22607V.m14327s());
                        }
                    }
                    SearchViewModel.m12359u0(this.f24078y, this.f24079z, m13884b);
                    SearchViewModel.m12361t0(this.f24078y, m13884b, this.f24079z);
                    this.f24078y.m12374m1(!m13884b.isEmpty());
                    SearchViewModel searchViewModel2 = this.f24078y;
                    searchViewModel2.m12376l1(((SearchViewModel.m12369p0(searchViewModel2) || SearchViewModel.m12385h0(this.f24078y) == null) && SearchViewModel.m12387g0(this.f24078y) == null) ? false : true);
                    this.f24078y.m12364r1(!m13884b.isEmpty());
                    SearchViewModel.m12375m0(this.f24078y).mo166p(this.f24079z);
                    C1436e0 m12377l0 = SearchViewModel.m12377l0(this.f24078y);
                    String quantityString = SearchViewModel.m12389f0(this.f24078y).m6899a().getResources().getQuantityString(C2336R.plurals.lbl_products_total_plurals, ((CatalogResponse) c8078c.m16962b()).m13883c(), Arrays.copyOf(new Object[]{C6755b.m20199c(((CatalogResponse) c8078c.m16962b()).m13883c())}, 1));
                    Intrinsics.checkIfNull(quantityString, "ctx.resources.getQuantit…d, quantity, *formatArgs)");
                    m12377l0.mo166p(quantityString);
                    if (this.f24079z.m13994c() != null) {
                        SearchViewModel.m12363s0(this.f24078y, m13884b);
                    }
                } else if (result instanceof Result.C8077b) {
                    SearchViewModel.m12381j0(this.f24078y).mo166p(new ArrayList());
                    SearchViewModel.m12361t0(this.f24078y, new ArrayList(), this.f24079z);
                    if (((Result.C8077b) result).m16964b() instanceof NoConnectionException) {
                        SearchViewModel.m12354x0(this.f24078y, true);
                    }
                }
                SearchViewModel.m12373n0(this.f24078y).mo166p(C6755b.m20201a(false));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9135g(boolean z, SearchCatalogParameters searchCatalogParameters, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24076z = z;
            this.f24073A = searchCatalogParameters;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9135g(this.f24076z, this.f24073A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9135g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24074x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SearchViewModel.m12373n0(SearchViewModel.this).mo166p(C6755b.m20201a(this.f24076z));
                SearchViewModel searchViewModel = SearchViewModel.this;
                C9136a c9136a = new C9136a(searchViewModel, this.f24073A, null);
                this.f24074x = 1;
                if (SearchViewModel.m12357v0(searchViewModel, !this.f24076z, c9136a, this) == m34636d) {
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
    /* compiled from: SearchViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchViewModel$searchTags$1", m20196f = "SearchViewModel.kt", m20195l = {214}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$h */
    /* loaded from: classes2.dex */
    public static final class C9137h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24080x;

        /* renamed from: z */
        final /* synthetic */ String f24082z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SearchViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.search.SearchViewModel$searchTags$1$1", m20196f = "SearchViewModel.kt", m20195l = {215}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.common.search.a$h$a */
        /* loaded from: classes2.dex */
        public static final class C9138a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24083x;

            /* renamed from: y */
            final /* synthetic */ SearchViewModel f24084y;

            /* renamed from: z */
            final /* synthetic */ String f24085z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9138a(SearchViewModel searchViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24084y = searchViewModel;
                this.f24085z = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9138a(this.f24084y, this.f24085z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9138a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24083x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7310l m12395c0 = SearchViewModel.m12395c0(this.f24084y);
                    String str = this.f24085z;
                    this.f24083x = 1;
                    obj = m12395c0.m18717z(str, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7235d1 abstractC7235d1 = (AbstractC7235d1) obj;
                if (abstractC7235d1 instanceof AbstractC7235d1.C7238b) {
                    SearchViewModel.m12354x0(this.f24084y, false);
                    SearchViewModel.m12371o0(this.f24084y).mo166p(((AbstractC7235d1.C7238b) abstractC7235d1).m18900a());
                } else if (abstractC7235d1 instanceof AbstractC7235d1.AbstractC7236a) {
                    SearchViewModel.m12354x0(this.f24084y, true);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9137h(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24082z = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9137h(this.f24082z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9137h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24080x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SearchViewModel searchViewModel = SearchViewModel.this;
                C9138a c9138a = new C9138a(searchViewModel, this.f24082z, null);
                this.f24080x = 1;
                if (CoreBaseViewModel.m20383n(searchViewModel, false, c9138a, this, 1, null) == m34636d) {
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

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$i */
    /* loaded from: classes2.dex */
    public static final class C9139i<I, O> implements InterfaceC7946a {
        public C9139i() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            Boolean bool = (Boolean) obj;
            return Boolean.valueOf(SearchViewModel.m12365r0(SearchViewModel.this));
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.a$j */
    /* loaded from: classes2.dex */
    public static final class C9140j<I, O> implements InterfaceC7946a {
        public C9140j() {
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            Boolean bool = (Boolean) obj;
            return Boolean.valueOf(SearchViewModel.m12367q0(SearchViewModel.this));
        }
    }

    static {
        new C9129b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, C7310l c7310l, RecentProductManager recentProductManager) {
        super(c1459l0, resourcesProvider, c7256f1);
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(c7310l, "catalogManager");
        Intrinsics.isThisObjectNull(recentProductManager, "recentProductManager");
        this.f24058q = c7310l;
        this.f24059r = recentProductManager;
        m1464a = LazyJVM.m1464a(new C9130c(resourcesProvider));
        this.f24061t = m1464a;
        m1464a2 = LazyJVM.m1464a(new C9134f(resourcesProvider));
        this.f24062u = m1464a2;
        C1436e0 m37003d = c1459l0.m37003d("_lastPage", 1);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_lastPage\", 1)");
        this.f24063v = m37003d;
        this.f24028B = OperatorExtensions.m35177d(700L, C1473p0.m36987a(this), new C9132e());
        this.f24030D = OperatorExtensions.m35176e(0L, null, new C9131d(), 3, null);
        C1436e0 m37003d2 = c1459l0.m37003d("_scanShouldBeVisible", Boolean.TRUE);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…anShouldBeVisible\", true)");
        this.f24031E = m37003d2;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d3 = c1459l0.m37003d("_filtersShouldBeVisible", bool);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(…sShouldBeVisible\", false)");
        this.f24032F = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("_tagsShouldBeVisible", bool);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData(…sShouldBeVisible\", false)");
        this.f24033G = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_productsShouldBeVisible", bool);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData(…sShouldBeVisible\", false)");
        this.f24034H = m37003d5;
        C1436e0 m37003d6 = c1459l0.m37003d("_filterBadgeShouldBeVisible", bool);
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData(…eShouldBeVisible\", false)");
        this.f24035I = m37003d6;
        C1436e0 m37003d7 = c1459l0.m37003d("_productsTotal", "0");
        Intrinsics.checkIfNull(m37003d7, "stateHandle.getLiveData(\"_productsTotal\", \"0\")");
        this.f24036J = m37003d7;
        C1436e0 m37003d8 = c1459l0.m37003d("_manualProductShouldBeVisible", bool);
        Intrinsics.checkIfNull(m37003d8, "stateHandle.getLiveData(…tShouldBeVisible\", false)");
        this.f24037K = m37003d8;
        C1436e0 m37003d9 = c1459l0.m37003d("_manualProductName", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d9, "stateHandle.getLiveData(\"_manualProductName\", \"\")");
        this.f24038L = m37003d9;
        C1436e0 m37003d10 = c1459l0.m37003d("_manualProductQuantiy", 0);
        Intrinsics.checkIfNull(m37003d10, "stateHandle.getLiveData(…manualProductQuantiy\", 0)");
        this.f24039M = m37003d10;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f24040N = c1436e0;
        m197g = C13780s.m197g();
        C1436e0 c1436e02 = new C1436e0(m197g);
        this.f24041O = c1436e02;
        this.f24042P = new C1436e0(new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 0, 0, false, 262143, null));
        C1436e0 c1436e03 = new C1436e0(recentProductManager.m18405b());
        this.f24043Q = c1436e03;
        C1436e0 m37003d11 = c1459l0.m37003d("_resultsCountLbl", m12417J0());
        Intrinsics.checkIfNull(m37003d11, "stateHandle.getLiveData<…tsCountLbl\", pluralsInit)");
        this.f24044R = m37003d11;
        C1436e0 m37003d12 = c1459l0.m37003d("_ownBrand", bool);
        Intrinsics.checkIfNull(m37003d12, "stateHandle.getLiveData(\"_ownBrand\", false)");
        this.f24045S = m37003d12;
        C1436e0 c1436e04 = new C1436e0(bool);
        this.f24046T = c1436e04;
        this.f24047U = m37003d2;
        this.f24048V = m37003d4;
        this.f24049W = m37003d5;
        this.f24050X = m37003d8;
        this.f24051Y = m37003d9;
        this.f24052Z = m37003d10;
        this.f24053a0 = c1436e0;
        this.f24054b0 = c1436e02;
        this.f24055c0 = c1436e03;
        this.f24056d0 = m37003d11;
        this.f24057e0 = c1436e04;
    }

    /* renamed from: C0 */
    private final ShoppingListCategory m12424C0() {
        return (ShoppingListCategory) this.f24061t.getValue();
    }

    /* renamed from: J0 */
    private final String m12417J0() {
        return (String) this.f24062u.getValue();
    }

    /* renamed from: P0 */
    private final String m12410P0(List list) {
        Object obj;
        String m13690c;
        boolean z;
        Integer num = (Integer) C13777q.m254N(list);
        if (num != null) {
            num.intValue();
            List list2 = (List) this.f24041O.mo172f();
            if (list2 != null) {
                Intrinsics.checkIfNull(list2, "value");
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Tag) obj).m13691b() == num.intValue()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                Tag tag = (Tag) obj;
                return (tag == null || (m13690c = tag.m13690c()) == null) ? BuildConfig.VERSION_NAME : m13690c;
            }
            return BuildConfig.VERSION_NAME;
        }
        return BuildConfig.VERSION_NAME;
    }

    /* renamed from: T0 */
    private final boolean m12406T0() {
        C13190q m18730m = this.f24058q.m18730m();
        return (((Collection) m18730m.m1450a()).isEmpty() ^ true) && Intrinsics.equals(this.f24064w, ((Criteria) ((List) m18730m.m1450a()).get(0)).m12334c().m13855b()) && !((Boolean) m18730m.m1448c()).booleanValue();
    }

    /* renamed from: U0 */
    private final boolean m12405U0() {
        if (Intrinsics.equals(m20352M().mo172f(), Boolean.FALSE)) {
            T mo172f = this.f24035I.mo172f();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.equals(mo172f, bool) && (Intrinsics.equals(this.f24034H.mo172f(), bool) || Intrinsics.equals(this.f24037K.mo172f(), bool))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: V0 */
    private final boolean m12404V0() {
        T mo172f = this.f24032F.mo172f();
        Boolean bool = Boolean.TRUE;
        return (Intrinsics.equals(mo172f, bool) || (Intrinsics.equals(this.f24037K.mo172f(), bool) && m12405U0())) && Intrinsics.equals(m20352M().mo172f(), Boolean.FALSE);
    }

    /* renamed from: W0 */
    private final boolean m12403W0(String str, List list) {
        return (Intrinsics.equals(this.f24064w, str) && Intrinsics.equals(this.f24065x, list)) ? false : true;
    }

    /* renamed from: X0 */
    private final void m12402X0(List list) {
        if (list.isEmpty()) {
            String string = m20390g().m6899a().getString(C2336R.string.lbl_product_not_found);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            m110k(string);
            return;
        }
        m120B(C13904t1.f35025a, C13777q.m254N(list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
        if (r5 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r5 == null) goto L13;
     */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m12401Y0(java.util.List r5, pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters r6) {
        /*
            r4 = this;
            java.util.List r0 = r6.m13979y()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r1
            goto L12
        L11:
            r0 = r2
        L12:
            java.lang.String r3 = ""
            if (r0 == 0) goto L25
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3c
            java.lang.String r5 = r6.m13978z()
            if (r5 != 0) goto L23
            goto L3c
        L23:
            r3 = r5
            goto L3c
        L25:
            java.util.List r5 = r6.m13979y()
            java.lang.String r5 = r4.m12410P0(r5)
            int r0 = r5.length()
            if (r0 != 0) goto L34
            r1 = r2
        L34:
            if (r1 == 0) goto L23
            java.lang.String r5 = r6.m13978z()
            if (r5 != 0) goto L23
        L3c:
            r4.m12368p1(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.common.search.SearchViewModel.m12401Y0(java.util.List, pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters):void");
    }

    /* renamed from: Z0 */
    private final void m12400Z0(SearchCatalogParameters searchCatalogParameters, List list) {
        List m453p0;
        if (searchCatalogParameters.m13986m() == 1) {
            C1436e0 c1436e0 = this.f24040N;
            m453p0 = _Collections.m453p0(list);
            c1436e0.mo166p(m453p0);
            this.f24063v.mo166p(1);
        } else if (!list.isEmpty()) {
            UtilsExtensions.m35166f(this.f24040N, list);
            this.f24063v.mo166p(Integer.valueOf(searchCatalogParameters.m13986m()));
        }
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m12399a0(SearchViewModel searchViewModel, View view) {
        m12386g1(searchViewModel, view);
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m12397b0(SearchViewModel searchViewModel, View view) {
        m12382i1(searchViewModel, view);
    }

    /* renamed from: c0 */
    public static final /* synthetic */ C7310l m12395c0(SearchViewModel searchViewModel) {
        return searchViewModel.f24058q;
    }

    /* renamed from: d0 */
    public static final /* synthetic */ SearchCatalogParameters m12393d0(SearchViewModel searchViewModel) {
        return searchViewModel.f24060s;
    }

    /* renamed from: e0 */
    public static final /* synthetic */ boolean m12391e0(SearchViewModel searchViewModel) {
        return searchViewModel.f24029C;
    }

    /* renamed from: e1 */
    public static /* synthetic */ void m12390e1(SearchViewModel searchViewModel, SearchCatalogParameters searchCatalogParameters, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        searchViewModel.m12392d1(searchCatalogParameters, z);
    }

    /* renamed from: f0 */
    public static final /* synthetic */ ResourcesProvider m12389f0(SearchViewModel searchViewModel) {
        return searchViewModel.m20390g();
    }

    /* renamed from: g0 */
    public static final /* synthetic */ List m12387g0(SearchViewModel searchViewModel) {
        return searchViewModel.f24065x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public static final void m12386g1(SearchViewModel searchViewModel, View view) {
        Intrinsics.isThisObjectNull(searchViewModel, "this$0");
        searchViewModel.f24028B.mo9587d(new C13182l(EnumC9128a.SCAN_EAN, C13195u.f34156a));
    }

    /* renamed from: h0 */
    public static final /* synthetic */ String m12385h0(SearchViewModel searchViewModel) {
        return searchViewModel.f24064w;
    }

    /* renamed from: i0 */
    public static final /* synthetic */ C1436e0 m12383i0(SearchViewModel searchViewModel) {
        return searchViewModel.f24063v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m12382i1(SearchViewModel searchViewModel, View view) {
        Intrinsics.isThisObjectNull(searchViewModel, "this$0");
        searchViewModel.f24028B.mo9587d(new C13182l(EnumC9128a.FILTER, C13195u.f34156a));
    }

    /* renamed from: j0 */
    public static final /* synthetic */ C1436e0 m12381j0(SearchViewModel searchViewModel) {
        return searchViewModel.f24040N;
    }

    /* renamed from: j1 */
    private final void m12380j1(String str) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9137h(str, null), 3, null);
    }

    /* renamed from: k0 */
    public static final /* synthetic */ C1436e0 m12379k0(SearchViewModel searchViewModel) {
        return searchViewModel.f24036J;
    }

    /* renamed from: k1 */
    private final void m12378k1(String str) {
        m12380j1(str);
        T mo172f = this.f24042P.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        m12392d1(SearchCatalogParameters.m13995b((SearchCatalogParameters) mo172f, 0, null, null, null, null, null, null, false, null, str, null, null, null, null, null, 0, 0, false, 261631, null), true);
    }

    /* renamed from: l0 */
    public static final /* synthetic */ C1436e0 m12377l0(SearchViewModel searchViewModel) {
        return searchViewModel.f24044R;
    }

    /* renamed from: m0 */
    public static final /* synthetic */ C1436e0 m12375m0(SearchViewModel searchViewModel) {
        return searchViewModel.f24042P;
    }

    /* renamed from: n0 */
    public static final /* synthetic */ C1436e0 m12373n0(SearchViewModel searchViewModel) {
        return searchViewModel.f24046T;
    }

    /* renamed from: o0 */
    public static final /* synthetic */ C1436e0 m12371o0(SearchViewModel searchViewModel) {
        return searchViewModel.f24041O;
    }

    /* renamed from: p0 */
    public static final /* synthetic */ boolean m12369p0(SearchViewModel searchViewModel) {
        return searchViewModel.m12406T0();
    }

    /* renamed from: q0 */
    public static final /* synthetic */ boolean m12367q0(SearchViewModel searchViewModel) {
        return searchViewModel.m12405U0();
    }

    /* renamed from: r0 */
    public static final /* synthetic */ boolean m12365r0(SearchViewModel searchViewModel) {
        return searchViewModel.m12404V0();
    }

    /* renamed from: s0 */
    public static final /* synthetic */ void m12363s0(SearchViewModel searchViewModel, List list) {
        searchViewModel.m12402X0(list);
    }

    /* renamed from: t0 */
    public static final /* synthetic */ void m12361t0(SearchViewModel searchViewModel, List list, SearchCatalogParameters searchCatalogParameters) {
        searchViewModel.m12401Y0(list, searchCatalogParameters);
    }

    /* renamed from: u0 */
    public static final /* synthetic */ void m12359u0(SearchViewModel searchViewModel, SearchCatalogParameters searchCatalogParameters, List list) {
        searchViewModel.m12400Z0(searchCatalogParameters, list);
    }

    /* renamed from: v0 */
    public static final /* synthetic */ Object m12357v0(SearchViewModel searchViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return searchViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: v1 */
    private final SearchCatalogParameters m12356v1(SearchCatalogParameters searchCatalogParameters) {
        if (Intrinsics.equals(m12423D0().mo172f(), Boolean.TRUE)) {
            Boolean bool = this.f24066y;
            List list = this.f24065x;
            String str = this.f24064w;
            Boolean bool2 = (Boolean) this.f24045S.mo172f();
            if (bool2 == null) {
                bool2 = Boolean.FALSE;
            }
            return SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, bool2, null, null, bool, null, false, null, null, null, list, str, null, null, 0, 0, false, 255963, null);
        }
        Integer num = this.f24067z;
        if (num != null) {
            return SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, this.f24066y, null, false, num, null, null, null, null, null, null, 0, 0, false, 261855, null);
        }
        return SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, this.f24066y, null, false, null, null, null, null, null, null, null, 0, 0, false, 262111, null);
    }

    /* renamed from: w0 */
    public static final /* synthetic */ void m12355w0(SearchViewModel searchViewModel, boolean z) {
        searchViewModel.f24029C = z;
    }

    /* renamed from: x0 */
    public static final /* synthetic */ void m12354x0(SearchViewModel searchViewModel, boolean z) {
        searchViewModel.m20350O(z);
    }

    /* renamed from: A0 */
    public final void m12426A0() {
        List m197g;
        C1436e0 c1436e0 = this.f24041O;
        m197g = C13780s.m197g();
        c1436e0.mo166p(m197g);
    }

    /* renamed from: B0 */
    public final void m12425B0() {
        this.f24042P.mo166p(new SearchCatalogParameters(0, null, null, null, null, null, null, false, null, null, null, this.f24065x, this.f24064w, null, null, 0, 0, false, 255999, null));
    }

    /* renamed from: D0 */
    public final LiveData m12423D0() {
        LiveData m36993a = C1465n0.m36993a(this.f24035I, new C9140j());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        return m36993a;
    }

    /* renamed from: E0 */
    public final LiveData m12422E0() {
        LiveData m36993a = C1465n0.m36993a(this.f24032F, new C9139i());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        return m36993a;
    }

    /* renamed from: F0 */
    public final LiteralProduct m12421F0() {
        return this.f24027A;
    }

    /* renamed from: G0 */
    public final LiveData m12420G0() {
        return this.f24051Y;
    }

    /* renamed from: H0 */
    public final LiveData m12419H0() {
        return this.f24052Z;
    }

    /* renamed from: I0 */
    public final LiveData m12418I0() {
        return this.f24050X;
    }

    /* renamed from: K0 */
    public final LiveData m12416K0() {
        return this.f24053a0;
    }

    /* renamed from: L0 */
    public final LiveData m12415L0() {
        return this.f24049W;
    }

    /* renamed from: M0 */
    public final LiveData m12414M0() {
        return this.f24055c0;
    }

    /* renamed from: N */
    protected void m12413N() {
        SearchCatalogParameters searchCatalogParameters = this.f24060s;
        if (searchCatalogParameters != null) {
            SearchCatalogParameters searchCatalogParameters2 = null;
            if (searchCatalogParameters == null) {
                Intrinsics.throwUninitPropException("lastParameters");
                searchCatalogParameters = null;
            }
            if (searchCatalogParameters.m13979y() == null) {
                SearchCatalogParameters searchCatalogParameters3 = this.f24060s;
                if (searchCatalogParameters3 == null) {
                    Intrinsics.throwUninitPropException("lastParameters");
                    searchCatalogParameters3 = null;
                }
                String m13978z = searchCatalogParameters3.m13978z();
                if (m13978z == null) {
                    m13978z = BuildConfig.VERSION_NAME;
                }
                m12380j1(m13978z);
            }
            SearchCatalogParameters searchCatalogParameters4 = this.f24060s;
            if (searchCatalogParameters4 == null) {
                Intrinsics.throwUninitPropException("lastParameters");
            } else {
                searchCatalogParameters2 = searchCatalogParameters4;
            }
            m12392d1(searchCatalogParameters2, true);
        }
    }

    /* renamed from: N0 */
    public final LiveData m12412N0() {
        return this.f24056d0;
    }

    /* renamed from: O0 */
    public final LiveData m12411O0() {
        return this.f24047U;
    }

    /* renamed from: Q0 */
    public final LiveData m12409Q0() {
        return this.f24057e0;
    }

    /* renamed from: R0 */
    public final LiveData m12408R0() {
        return this.f24054b0;
    }

    /* renamed from: S0 */
    public final LiveData m12407S0() {
        return this.f24048V;
    }

    /* renamed from: a1 */
    public final void m12398a1() {
        this.f24030D.mo9587d(C13195u.f34156a);
    }

    /* renamed from: b1 */
    public final void m12396b1() {
        C1436e0 c1436e0 = this.f24040N;
        T mo172f = c1436e0.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        c1436e0.mo166p(m22603Z((List) mo172f));
    }

    /* renamed from: c1 */
    public final void m12394c1(String str) {
        Intrinsics.isThisObjectNull(str, "query");
        if (str.length() >= 1) {
            m12378k1(str);
        }
    }

    /* renamed from: d1 */
    public final void m12392d1(SearchCatalogParameters searchCatalogParameters, boolean z) {
        Intrinsics.isThisObjectNull(searchCatalogParameters, "queryParameters");
        this.f24060s = m12356v1(searchCatalogParameters);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9135g(z, searchCatalogParameters, null), 3, null);
    }

    /* renamed from: f1 */
    public final View.OnClickListener m12388f1() {
        return new View.OnClickListener() { // from class: fj.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchViewModel.m12386g1(SearchViewModel.this, view);
            }
        };
    }

    /* renamed from: h1 */
    public final View.OnClickListener m12384h1() {
        return new View.OnClickListener() { // from class: fj.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchViewModel.m12382i1(SearchViewModel.this, view);
            }
        };
    }

    /* renamed from: l1 */
    public final void m12376l1(boolean z) {
        this.f24035I.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: m1 */
    public final void m12374m1(boolean z) {
        this.f24032F.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: n1 */
    public final void m12372n1(int i) {
        this.f24067z = Integer.valueOf(i);
    }

    /* renamed from: o1 */
    public final void m12370o1(boolean z) {
        this.f24066y = Boolean.valueOf(z);
    }

    /* renamed from: p1 */
    public final void m12368p1(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        this.f24038L.mo166p(str);
        this.f24039M.mo166p(0);
        this.f24037K.mo166p(Boolean.valueOf(str.length() > 0));
        this.f24027A = new LiteralProduct(null, 0L, m12424C0(), str, 0, false, null, 0, 0, false, 1011, null);
    }

    /* renamed from: q1 */
    public final void m12366q1(boolean z) {
        this.f24045S.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: r1 */
    public final void m12364r1(boolean z) {
        this.f24034H.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: s1 */
    public final void m12362s1(boolean z) {
        this.f24031E.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: t1 */
    public final void m12360t1(boolean z) {
        m20350O(z);
    }

    /* renamed from: u1 */
    public final void m12358u1(boolean z) {
        this.f24033G.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: y0 */
    public final void m12353y0(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        if (str.length() >= 1) {
            this.f24059r.m18406a(str);
            this.f24043Q.mo166p(this.f24059r.m18405b());
        }
    }

    /* renamed from: z0 */
    public final void m12352z0(String str, List list) {
        if (m12403W0(str, list)) {
            this.f24064w = str;
            this.f24065x = list;
            SearchCatalogParameters searchCatalogParameters = (SearchCatalogParameters) this.f24042P.mo172f();
            if (searchCatalogParameters != null) {
                m12392d1(SearchCatalogParameters.m13995b(searchCatalogParameters, 0, null, null, null, null, null, null, false, null, null, null, this.f24065x, str, null, null, 1, 0, false, 223231, null), true);
            }
        }
    }
}
