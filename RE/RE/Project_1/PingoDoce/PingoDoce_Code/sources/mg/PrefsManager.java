package mg;

import ai.AbstractC0151j;
import android.content.SharedPreferences;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.response.authenticationv2.PmCardsResponse;
import p163ih.PurchasesChartViewModel;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p398v5.SharedPrefsKtx;
import p489zc.C13769l0;
import p489zc.C13780s;
import p489zc._Collections;
import pg.OnboardingFlowDataSharedPreferences;
import pt.pingodoce.app.data.local.models.egoi.EgoiEvent;
import pt.pingodoce.app.data.local.models.purchases.ChartData;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;
import pt.pingodoce.app.data.remote.models.response.ShoppingList;

/* renamed from: mg.s0 */
/* loaded from: classes2.dex */
public final class PrefsManager {

    /* renamed from: a */
    private final SharedPreferences f19638a;

    /* renamed from: b */
    private final OnboardingFlowDataSharedPreferences f19639b;

    /* renamed from: c */
    private final ParameterizedType f19640c;

    /* renamed from: d */
    private final ParameterizedType f19641d;

    /* renamed from: e */
    private final ParameterizedType f19642e;

    /* renamed from: f */
    private final ParameterizedType f19643f;

    /* renamed from: g */
    private final ParameterizedType f19644g;

    /* renamed from: h */
    private final ParameterizedType f19645h;

    /* renamed from: i */
    private final ParameterizedType f19646i;

    /* compiled from: PrefsManager.kt */
    /* renamed from: mg.s0$a */
    /* loaded from: classes2.dex */
    public static final class C7403a {
        private C7403a() {
        }

        public /* synthetic */ C7403a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PrefsManager.kt */
    /* renamed from: mg.s0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7404b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19647a;

        static {
            int[] iArr = new int[PurchasesChartViewModel.EnumC6140a.values().length];
            iArr[PurchasesChartViewModel.EnumC6140a.FILTER_BY_30_DAYS.ordinal()] = 1;
            iArr[PurchasesChartViewModel.EnumC6140a.FILTER_BY_3_MONTHS.ordinal()] = 2;
            iArr[PurchasesChartViewModel.EnumC6140a.FILTER_BY_12_MONTHS.ordinal()] = 3;
            f19647a = iArr;
        }
    }

    static {
        new C7403a(null);
    }

    public PrefsManager(SharedPreferences sharedPreferences, OnboardingFlowDataSharedPreferences onboardingFlowDataSharedPreferences) {
        Intrinsics.isThisObjectNull(sharedPreferences, "prefs");
        Intrinsics.isThisObjectNull(onboardingFlowDataSharedPreferences, "onboardingFlowDataSharedPreferences");
        this.f19638a = sharedPreferences;
        this.f19639b = onboardingFlowDataSharedPreferences;
        this.f19640c = C4516s.m27327j(List.class, EgoiEvent.class);
        this.f19641d = C4516s.m27327j(Set.class, String.class);
        this.f19642e = C4516s.m27327j(Map.class, Integer.class, ShoppingListCategory.class);
        this.f19643f = C4516s.m27327j(List.class, Purchase.class);
        this.f19644g = C4516s.m27327j(List.class, PurchaseProduct.class);
        this.f19645h = C4516s.m27327j(List.class, TakeAwayOrder.class);
        this.f19646i = C4516s.m27327j(List.class, LoyaltyCardAssociation.class);
        if (m18523n() < 374) {
            m18537W();
            m18532e();
        }
        sharedPreferences.edit().remove("KEY_FOR_SECURITY_DIALOG_SHOWN").apply();
    }

    /* renamed from: D */
    private final boolean m18556D() {
        return m18514w(this, ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_PURCHASES_CACHE_TIMESTAMP", C6450z.m20906b(Long.TYPE), Long.valueOf(System.currentTimeMillis()), null, 8, null)).longValue(), 0, 2, null);
    }

    /* renamed from: E */
    private final boolean m18555E() {
        return m18514w(this, ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_12_MONTH_CACHE_TIMESTAMP", C6450z.m20906b(Long.TYPE), Long.valueOf(System.currentTimeMillis()), null, 8, null)).longValue(), 0, 2, null);
    }

    /* renamed from: F */
    private final boolean m18554F() {
        return m18514w(this, ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_30_DAY_CACHE_TIMESTAMP", C6450z.m20906b(Long.TYPE), Long.valueOf(System.currentTimeMillis()), null, 8, null)).longValue(), 0, 2, null);
    }

    /* renamed from: G */
    private final boolean m18553G() {
        return m18514w(this, ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_3_MONTH_CACHE_TIMESTAMP", C6450z.m20906b(Long.TYPE), Long.valueOf(System.currentTimeMillis()), null, 8, null)).longValue(), 0, 2, null);
    }

    /* renamed from: W */
    private final boolean m18537W() {
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_APP_VERSION", 374, null, 4, null);
    }

    /* renamed from: n */
    private final int m18523n() {
        return ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_APP_VERSION", C6450z.m20906b(Integer.TYPE), -1, null, 8, null)).intValue();
    }

    /* renamed from: v */
    private final boolean m18515v(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(11, i);
        return calendar.getTime().before(Calendar.getInstance().getTime());
    }

    /* renamed from: w */
    static /* synthetic */ boolean m18514w(PrefsManager prefsManager, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return prefsManager.m18515v(j, i);
    }

    /* renamed from: A */
    public final void m18559A() {
        m18557C();
        m18558B();
    }

    /* renamed from: B */
    public final void m18558B() {
        this.f19638a.edit().remove("KEY_FOR_LAST_PURCHASES_CACHE").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_PURCHASES_CACHE_TIMESTAMP").apply();
    }

    /* renamed from: C */
    public final void m18557C() {
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_30_DAY_CACHE").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_30_DAY_CACHE_TIMESTAMP").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_3_MONTH_CACHE").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_3_MONTH_CACHE_TIMESTAMP").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_12_MONTH_CACHE").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_CHART_12_MONTH_CACHE_TIMESTAMP").apply();
    }

    /* renamed from: H */
    public final void m18552H(EgoiEvent egoiEvent) {
        List m453p0;
        Intrinsics.isThisObjectNull(egoiEvent, "event");
        m453p0 = _Collections.m453p0(m18525l());
        m453p0.add(egoiEvent);
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19640c;
        Intrinsics.checkIfNull(parameterizedType, "egoiEventListParameterizedType");
        SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_EGOI_EVENT_LIST", m453p0, parameterizedType, null, 8, null);
    }

    /* renamed from: I */
    public final boolean m18551I(Map map) {
        Intrinsics.isThisObjectNull(map, "categoryMap");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19642e;
        Intrinsics.checkIfNull(parameterizedType, "categoryMapParameterizedType");
        return SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_CATEGORY_MAP", map, parameterizedType, null, 8, null);
    }

    /* renamed from: J */
    public final boolean m18550J(Set set) {
        Intrinsics.isThisObjectNull(set, "recentProducts");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19641d;
        Intrinsics.checkIfNull(parameterizedType, "productListParameterizedType");
        return SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_RECENT_PRODUCTS", set, parameterizedType, null, 8, null);
    }

    /* renamed from: K */
    public final boolean m18549K(ShoppingList shoppingList) {
        Intrinsics.isThisObjectNull(shoppingList, "shoppingList");
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_SHOPPING_LIST", shoppingList, null, 4, null);
    }

    /* renamed from: L */
    public final void m18548L(ChartData chartData, PurchasesChartViewModel.EnumC6140a enumC6140a) {
        Intrinsics.isThisObjectNull(chartData, "data");
        Intrinsics.isThisObjectNull(enumC6140a, "filter");
        int i = C7404b.f19647a[enumC6140a.ordinal()];
        if (i == 1) {
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_30_DAY_CACHE", chartData, null, 4, null);
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_30_DAY_CACHE_TIMESTAMP", Long.valueOf(System.currentTimeMillis()), null, 4, null);
        } else if (i == 2) {
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_3_MONTH_CACHE", chartData, null, 4, null);
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_3_MONTH_CACHE_TIMESTAMP", Long.valueOf(System.currentTimeMillis()), null, 4, null);
        } else if (i != 3) {
        } else {
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_12_MONTH_CACHE", chartData, null, 4, null);
            SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_CHART_12_MONTH_CACHE_TIMESTAMP", Long.valueOf(System.currentTimeMillis()), null, 4, null);
        }
    }

    /* renamed from: M */
    public final boolean m18547M(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_DEVICE_TOKEN", str, null, 4, null);
    }

    /* renamed from: N */
    public final void m18546N(boolean z) {
        SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_UPGRADE_FROM_V2_TO_V3", Boolean.valueOf(z), null, 4, null);
    }

    /* renamed from: O */
    public final void m18545O(List list) {
        Intrinsics.isThisObjectNull(list, "data");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19643f;
        Intrinsics.checkIfNull(parameterizedType, "purchaseListParameterizedType");
        SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_LAST_PURCHASES_CACHE", list, parameterizedType, null, 8, null);
        SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_PURCHASES_CACHE_TIMESTAMP", Long.valueOf(System.currentTimeMillis()), null, 4, null);
    }

    /* renamed from: P */
    public final boolean m18544P(List list) {
        Intrinsics.isThisObjectNull(list, "response");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19646i;
        Intrinsics.checkIfNull(parameterizedType, "loyaltyCardAssociationsParameterizedType");
        return SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_LOYALTY_CARD_ASSOCIATION_RESPONSE", list, parameterizedType, null, 8, null);
    }

    /* renamed from: Q */
    public final boolean m18543Q(PmCardsResponse pmCardsResponse) {
        Intrinsics.isThisObjectNull(pmCardsResponse, "list");
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LOYALTY_CARD_PROVISORY", pmCardsResponse, null, 4, null);
    }

    /* renamed from: R */
    public final boolean m18542R(boolean z) {
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_STORE_FIRST_SYNC", Boolean.valueOf(z), null, 4, null);
    }

    /* renamed from: S */
    public final boolean m18541S(long j) {
        return SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_LAST_SHOPPING_LIST_SYNC_SUCCESSFUL_CALL", Long.valueOf(j), null, 4, null);
    }

    /* renamed from: T */
    public final boolean m18540T(List list) {
        Intrinsics.isThisObjectNull(list, "list");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19645h;
        Intrinsics.checkIfNull(parameterizedType, "takeAwayOrderListParameterizedType");
        return SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_TAKE_AWAY_STORE_LIST", list, parameterizedType, null, 8, null);
    }

    /* renamed from: U */
    public final void m18539U() {
        SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_SECURITY_DIALOG_SHOWN", Boolean.TRUE, null, 4, null);
    }

    /* renamed from: V */
    public final void m18538V() {
        SharedPrefsKtx.m6039h(this.f19638a, "KEY_FOR_RATING_DIALOG_SHOWN", Boolean.TRUE, null, 4, null);
    }

    /* renamed from: a */
    public final boolean m18536a(List list) {
        Intrinsics.isThisObjectNull(list, "products");
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19644g;
        Intrinsics.checkIfNull(parameterizedType, "purchaseProductsListParameterizedType");
        return SharedPrefsKtx.m6038i(sharedPreferences, "KEY_FOR_LAST_PURCHASE_PRODUCTS_CACHED", list, parameterizedType, null, 8, null);
    }

    /* renamed from: b */
    public final void m18535b() {
        this.f19638a.edit().remove("KEY_FOR_SHOPPING_LIST").apply();
        this.f19638a.edit().remove("KEY_FOR_STORE_FIRST_SYNC").apply();
        this.f19638a.edit().remove("KEY_FOR_RECENT_PRODUCTS").apply();
        this.f19638a.edit().remove("KEY_FOR_CATEGORY_MAP").apply();
        this.f19638a.edit().remove("KEY_FOR_TAKE_AWAY_STORE_LIST").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_PURCHASE_PRODUCTS_CACHED").apply();
        this.f19638a.edit().remove("KEY_FOR_LAST_SHOPPING_LIST_SYNC_SUCCESSFUL_CALL").apply();
        this.f19638a.edit().remove("KEY_FOR_LOYALTY_CARD_ASSOCIATION_RESPONSE").apply();
        m18559A();
        m18533d();
        this.f19639b.m14991a();
    }

    /* renamed from: c */
    public final void m18534c() {
        this.f19638a.edit().remove("KEY_FOR_LAST_PURCHASE_PRODUCTS_CACHED").apply();
    }

    /* renamed from: d */
    public final void m18533d() {
        this.f19638a.edit().remove("KEY_FOR_EGOI_EVENT_LIST").apply();
    }

    /* renamed from: e */
    public final void m18532e() {
        this.f19638a.edit().remove("KEY_FOR_RATING_DIALOG_SHOWN").apply();
        this.f19638a.edit().remove(AbstractC0151j.C0154c.f334a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0155d.f335a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0156e.f336a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0157f.f337a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0152a.f332a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0153b.f333a.toString()).apply();
        this.f19638a.edit().remove(AbstractC0151j.C0158g.f338a.toString()).apply();
    }

    /* renamed from: f */
    public final Map m18531f() {
        Map m334e;
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19642e;
        Intrinsics.checkIfNull(parameterizedType, "categoryMapParameterizedType");
        m334e = C13769l0.m334e();
        return (Map) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_CATEGORY_MAP", parameterizedType, m334e, null, 8, null);
    }

    /* renamed from: g */
    public final List m18530g() {
        List m197g;
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19644g;
        Intrinsics.checkIfNull(parameterizedType, "purchaseProductsListParameterizedType");
        m197g = C13780s.m197g();
        return (List) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_LAST_PURCHASE_PRODUCTS_CACHED", parameterizedType, m197g, null, 8, null);
    }

    /* renamed from: h */
    public final Set m18529h() {
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19641d;
        Intrinsics.checkIfNull(parameterizedType, "productListParameterizedType");
        return (Set) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_RECENT_PRODUCTS", parameterizedType, new LinkedHashSet(), null, 8, null);
    }

    /* renamed from: i */
    public final ShoppingList m18528i() {
        return (ShoppingList) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_SHOPPING_LIST", C6450z.m20906b(ShoppingList.class), new ShoppingList(null, null, null, null, null, false, null, null, null, null, 1023, null), null, 8, null);
    }

    /* renamed from: j */
    public final ChartData m18527j(PurchasesChartViewModel.EnumC6140a enumC6140a) {
        Intrinsics.isThisObjectNull(enumC6140a, "filter");
        int i = C7404b.f19647a[enumC6140a.ordinal()];
        if (i == 1) {
            return m18554F() ? new ChartData(null, null, null, 7, null) : (ChartData) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_30_DAY_CACHE", C6450z.m20906b(ChartData.class), new ChartData(null, null, null, 7, null), null, 8, null);
        } else if (i == 2) {
            return m18553G() ? new ChartData(null, null, null, 7, null) : (ChartData) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_3_MONTH_CACHE", C6450z.m20906b(ChartData.class), new ChartData(null, null, null, 7, null), null, 8, null);
        } else if (i == 3) {
            return m18555E() ? new ChartData(null, null, null, 7, null) : (ChartData) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_CHART_12_MONTH_CACHE", C6450z.m20906b(ChartData.class), new ChartData(null, null, null, 7, null), null, 8, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public final String m18526k() {
        return (String) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_DEVICE_TOKEN", C6450z.m20906b(String.class), BuildConfig.VERSION_NAME, null, 8, null);
    }

    /* renamed from: l */
    public final List m18525l() {
        List m197g;
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19640c;
        Intrinsics.checkIfNull(parameterizedType, "egoiEventListParameterizedType");
        m197g = C13780s.m197g();
        return (List) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_EGOI_EVENT_LIST", parameterizedType, m197g, null, 8, null);
    }

    /* renamed from: m */
    public final boolean m18524m() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_UPGRADE_FROM_V2_TO_V3", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: o */
    public final List m18522o() {
        List m197g;
        List m197g2;
        if (m18556D()) {
            m197g2 = C13780s.m197g();
            return m197g2;
        }
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19643f;
        Intrinsics.checkIfNull(parameterizedType, "purchaseListParameterizedType");
        m197g = C13780s.m197g();
        return (List) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_LAST_PURCHASES_CACHE", parameterizedType, m197g, null, 8, null);
    }

    /* renamed from: p */
    public final List m18521p() {
        List m197g;
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19646i;
        Intrinsics.checkIfNull(parameterizedType, "loyaltyCardAssociationsParameterizedType");
        m197g = C13780s.m197g();
        return (List) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_LOYALTY_CARD_ASSOCIATION_RESPONSE", parameterizedType, m197g, null, 8, null);
    }

    /* renamed from: q */
    public final PmCardsResponse m18520q() {
        return (PmCardsResponse) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LOYALTY_CARD_PROVISORY", C6450z.m20906b(PmCardsResponse.class), new PmCardsResponse(null, null, null, 7, null), null, 8, null);
    }

    /* renamed from: r */
    public final int m18519r(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        return ((Number) SharedPrefsKtx.m6043d(this.f19638a, str, C6450z.m20906b(Integer.TYPE), 0, null, 8, null)).intValue();
    }

    /* renamed from: s */
    public final boolean m18518s() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_STORE_FIRST_SYNC", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: t */
    public final long m18517t() {
        return ((Number) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_LAST_SHOPPING_LIST_SYNC_SUCCESSFUL_CALL", C6450z.m20906b(Long.TYPE), 0L, null, 8, null)).longValue();
    }

    /* renamed from: u */
    public final List m18516u() {
        List m197g;
        SharedPreferences sharedPreferences = this.f19638a;
        ParameterizedType parameterizedType = this.f19645h;
        Intrinsics.checkIfNull(parameterizedType, "takeAwayOrderListParameterizedType");
        m197g = C13780s.m197g();
        return (List) SharedPrefsKtx.m6044c(sharedPreferences, "KEY_FOR_TAKE_AWAY_STORE_LIST", parameterizedType, m197g, null, 8, null);
    }

    /* renamed from: x */
    public final boolean m18513x() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_SECURITY_DIALOG_SHOWN", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: y */
    public final boolean m18512y() {
        return ((Boolean) SharedPrefsKtx.m6043d(this.f19638a, "KEY_FOR_RATING_DIALOG_SHOWN", C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue();
    }

    /* renamed from: z */
    public final void m18511z(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        SharedPrefsKtx.m6039h(this.f19638a, str, Integer.valueOf(m18519r(str) + 1), null, 4, null);
    }
}
