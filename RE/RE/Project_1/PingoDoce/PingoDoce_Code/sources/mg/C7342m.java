package mg;

import p066dg.CategoriesAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p378u5.ResourcesProvider;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.CatalogService;

/* renamed from: mg.m */
/* loaded from: classes2.dex */
public final class C7342m implements InterfaceC11614c<C7310l> {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19479a;

    /* renamed from: b */
    private final InterfaceC12341a<CatalogService> f19480b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f19481c;

    /* renamed from: d */
    private final InterfaceC12341a<LoyaltyCardAgent> f19482d;

    /* renamed from: e */
    private final InterfaceC12341a<DefaultStoreAgent> f19483e;

    /* renamed from: f */
    private final InterfaceC12341a<CategoriesAgent> f19484f;

    /* renamed from: g */
    private final InterfaceC12341a<SearchCatalogResponsesAgent> f19485g;

    /* renamed from: h */
    private final InterfaceC12341a<RecommendationsCatalogResponsesAgent> f19486h;

    /* renamed from: i */
    private final InterfaceC12341a<FlyersAgent> f19487i;

    /* renamed from: j */
    private final InterfaceC12341a<UserProfileAgent> f19488j;

    /* renamed from: k */
    private final InterfaceC12341a<ClubsCodesAgent> f19489k;

    public C7342m(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CatalogService> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a5, InterfaceC12341a<CategoriesAgent> interfaceC12341a6, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a7, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a8, InterfaceC12341a<FlyersAgent> interfaceC12341a9, InterfaceC12341a<UserProfileAgent> interfaceC12341a10, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a11) {
        this.f19479a = interfaceC12341a;
        this.f19480b = interfaceC12341a2;
        this.f19481c = interfaceC12341a3;
        this.f19482d = interfaceC12341a4;
        this.f19483e = interfaceC12341a5;
        this.f19484f = interfaceC12341a6;
        this.f19485g = interfaceC12341a7;
        this.f19486h = interfaceC12341a8;
        this.f19487i = interfaceC12341a9;
        this.f19488j = interfaceC12341a10;
        this.f19489k = interfaceC12341a11;
    }

    /* renamed from: a */
    public static C7342m m18700a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CatalogService> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a5, InterfaceC12341a<CategoriesAgent> interfaceC12341a6, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a7, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a8, InterfaceC12341a<FlyersAgent> interfaceC12341a9, InterfaceC12341a<UserProfileAgent> interfaceC12341a10, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a11) {
        return new C7342m(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10, interfaceC12341a11);
    }

    /* renamed from: c */
    public static C7310l m18698c(ResourcesProvider resourcesProvider, CatalogService catalogService, C7405s1 c7405s1, LoyaltyCardAgent loyaltyCardAgent, DefaultStoreAgent defaultStoreAgent, CategoriesAgent categoriesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, FlyersAgent flyersAgent, UserProfileAgent userProfileAgent, ClubsCodesAgent clubsCodesAgent) {
        return new C7310l(resourcesProvider, catalogService, c7405s1, loyaltyCardAgent, defaultStoreAgent, categoriesAgent, searchCatalogResponsesAgent, recommendationsCatalogResponsesAgent, flyersAgent, userProfileAgent, clubsCodesAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C7310l mo42226get() {
        return m18698c(this.f19479a.mo42226get(), this.f19480b.mo42226get(), this.f19481c.mo42226get(), this.f19482d.mo42226get(), this.f19483e.mo42226get(), this.f19484f.mo42226get(), this.f19485g.mo42226get(), this.f19486h.mo42226get(), this.f19487i.mo42226get(), this.f19488j.mo42226get(), this.f19489k.mo42226get());
    }
}
