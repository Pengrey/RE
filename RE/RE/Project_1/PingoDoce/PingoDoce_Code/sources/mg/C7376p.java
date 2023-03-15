package mg;

import p066dg.BannersAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: mg.p */
/* loaded from: classes2.dex */
public final class C7376p implements InterfaceC11614c<ClubManager> {

    /* renamed from: a */
    private final InterfaceC12341a<ClubsAgent> f19581a;

    /* renamed from: b */
    private final InterfaceC12341a<ClubsCodesAgent> f19582b;

    /* renamed from: c */
    private final InterfaceC12341a<UserProfileAgent> f19583c;

    /* renamed from: d */
    private final InterfaceC12341a<LoyaltyCardAgent> f19584d;

    /* renamed from: e */
    private final InterfaceC12341a<FlyersAgent> f19585e;

    /* renamed from: f */
    private final InterfaceC12341a<SearchCatalogResponsesAgent> f19586f;

    /* renamed from: g */
    private final InterfaceC12341a<RecommendationsCatalogResponsesAgent> f19587g;

    /* renamed from: h */
    private final InterfaceC12341a<BannersAgent> f19588h;

    public C7376p(InterfaceC12341a<ClubsAgent> interfaceC12341a, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<FlyersAgent> interfaceC12341a5, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a6, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a7, InterfaceC12341a<BannersAgent> interfaceC12341a8) {
        this.f19581a = interfaceC12341a;
        this.f19582b = interfaceC12341a2;
        this.f19583c = interfaceC12341a3;
        this.f19584d = interfaceC12341a4;
        this.f19585e = interfaceC12341a5;
        this.f19586f = interfaceC12341a6;
        this.f19587g = interfaceC12341a7;
        this.f19588h = interfaceC12341a8;
    }

    /* renamed from: a */
    public static C7376p m18629a(InterfaceC12341a<ClubsAgent> interfaceC12341a, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a2, InterfaceC12341a<UserProfileAgent> interfaceC12341a3, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a4, InterfaceC12341a<FlyersAgent> interfaceC12341a5, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a6, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a7, InterfaceC12341a<BannersAgent> interfaceC12341a8) {
        return new C7376p(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8);
    }

    /* renamed from: c */
    public static ClubManager m18627c(ClubsAgent clubsAgent, ClubsCodesAgent clubsCodesAgent, UserProfileAgent userProfileAgent, LoyaltyCardAgent loyaltyCardAgent, FlyersAgent flyersAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, BannersAgent bannersAgent) {
        return new ClubManager(clubsAgent, clubsCodesAgent, userProfileAgent, loyaltyCardAgent, flyersAgent, searchCatalogResponsesAgent, recommendationsCatalogResponsesAgent, bannersAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public ClubManager mo42226get() {
        return m18627c(this.f19581a.mo42226get(), this.f19582b.mo42226get(), this.f19583c.mo42226get(), this.f19584d.mo42226get(), this.f19585e.mo42226get(), this.f19586f.mo42226get(), this.f19587g.mo42226get(), this.f19588h.mo42226get());
    }
}
