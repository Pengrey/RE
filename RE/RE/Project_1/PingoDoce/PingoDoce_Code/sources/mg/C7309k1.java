package mg;

import p066dg.BannersAgent;
import p066dg.CategoriesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.StoresAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.StoreService;

/* renamed from: mg.k1 */
/* loaded from: classes2.dex */
public final class C7309k1 implements InterfaceC11614c<StoreManager> {

    /* renamed from: a */
    private final InterfaceC12341a<StoreService> f19379a;

    /* renamed from: b */
    private final InterfaceC12341a<DefaultStoreAgent> f19380b;

    /* renamed from: c */
    private final InterfaceC12341a<UserProfileAgent> f19381c;

    /* renamed from: d */
    private final InterfaceC12341a<StoresAgent> f19382d;

    /* renamed from: e */
    private final InterfaceC12341a<AuthManager> f19383e;

    /* renamed from: f */
    private final InterfaceC12341a<FlyersAgent> f19384f;

    /* renamed from: g */
    private final InterfaceC12341a<CategoriesAgent> f19385g;

    /* renamed from: h */
    private final InterfaceC12341a<BannersAgent> f19386h;

    /* renamed from: i */
    private final InterfaceC12341a<RecommendationsCatalogResponsesAgent> f19387i;

    /* renamed from: j */
    private final InterfaceC12341a<SearchCatalogResponsesAgent> f19388j;

    public C7309k1(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<StoresAgent> interfaceC12341a4, InterfaceC12341a<AuthManager> interfaceC12341a5, InterfaceC12341a<FlyersAgent> interfaceC12341a6, InterfaceC12341a<CategoriesAgent> interfaceC12341a7, InterfaceC12341a<BannersAgent> interfaceC12341a8, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a9, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a10) {
        this.f19379a = interfaceC12341a;
        this.f19380b = interfaceC12341a2;
        this.f19381c = interfaceC12341a3;
        this.f19382d = interfaceC12341a4;
        this.f19383e = interfaceC12341a5;
        this.f19384f = interfaceC12341a6;
        this.f19385g = interfaceC12341a7;
        this.f19386h = interfaceC12341a8;
        this.f19387i = interfaceC12341a9;
        this.f19388j = interfaceC12341a10;
    }

    /* renamed from: a */
    public static C7309k1 m18745a(InterfaceC12341a<StoreService> interfaceC12341a, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<StoresAgent> interfaceC12341a4, InterfaceC12341a<AuthManager> interfaceC12341a5, InterfaceC12341a<FlyersAgent> interfaceC12341a6, InterfaceC12341a<CategoriesAgent> interfaceC12341a7, InterfaceC12341a<BannersAgent> interfaceC12341a8, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a9, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a10) {
        return new C7309k1(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10);
    }

    /* renamed from: c */
    public static StoreManager m18743c(StoreService storeService, DefaultStoreAgent defaultStoreAgent, UserProfileAgent userProfileAgent, StoresAgent storesAgent, AuthManager authManager, FlyersAgent flyersAgent, CategoriesAgent categoriesAgent, BannersAgent bannersAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent) {
        return new StoreManager(storeService, defaultStoreAgent, userProfileAgent, storesAgent, authManager, flyersAgent, categoriesAgent, bannersAgent, recommendationsCatalogResponsesAgent, searchCatalogResponsesAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public StoreManager mo42226get() {
        return m18743c(this.f19379a.mo42226get(), this.f19380b.mo42226get(), this.f19381c.mo42226get(), this.f19382d.mo42226get(), this.f19383e.mo42226get(), this.f19384f.mo42226get(), this.f19385g.mo42226get(), this.f19386h.mo42226get(), this.f19387i.mo42226get(), this.f19388j.mo42226get());
    }
}
