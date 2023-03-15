package mg;

import p066dg.BannersAgent;
import p066dg.CategoriesAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p370te.OAuthManager;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import se.OAuthSharedPrefs;
import vg.AuthService;
import vg.DeviceService;
import vg.OnboardingService;

/* renamed from: mg.g */
/* loaded from: classes2.dex */
public final class C7279g implements InterfaceC11614c<AuthManager> {

    /* renamed from: a */
    private final InterfaceC12341a<AuthService> f19259a;

    /* renamed from: b */
    private final InterfaceC12341a<OnboardingService> f19260b;

    /* renamed from: c */
    private final InterfaceC12341a<DeviceService> f19261c;

    /* renamed from: d */
    private final InterfaceC12341a<PrefsManager> f19262d;

    /* renamed from: e */
    private final InterfaceC12341a<EncryptedPrefsManager> f19263e;

    /* renamed from: f */
    private final InterfaceC12341a<OAuthSharedPrefs> f19264f;

    /* renamed from: g */
    private final InterfaceC12341a<OAuthManager> f19265g;

    /* renamed from: h */
    private final InterfaceC12341a<DefaultStoreAgent> f19266h;

    /* renamed from: i */
    private final InterfaceC12341a<CategoriesAgent> f19267i;

    /* renamed from: j */
    private final InterfaceC12341a<ClubsAgent> f19268j;

    /* renamed from: k */
    private final InterfaceC12341a<ClubsCodesAgent> f19269k;

    /* renamed from: l */
    private final InterfaceC12341a<FlyersAgent> f19270l;

    /* renamed from: m */
    private final InterfaceC12341a<LoyaltyCardAgent> f19271m;

    /* renamed from: n */
    private final InterfaceC12341a<RecommendationsCatalogResponsesAgent> f19272n;

    /* renamed from: o */
    private final InterfaceC12341a<SearchCatalogResponsesAgent> f19273o;

    /* renamed from: p */
    private final InterfaceC12341a<UserProfileAgent> f19274p;

    /* renamed from: q */
    private final InterfaceC12341a<ConsentsManager> f19275q;

    /* renamed from: r */
    private final InterfaceC12341a<BannersAgent> f19276r;

    public C7279g(InterfaceC12341a<AuthService> interfaceC12341a, InterfaceC12341a<OnboardingService> interfaceC12341a2, InterfaceC12341a<DeviceService> interfaceC12341a3, InterfaceC12341a<PrefsManager> interfaceC12341a4, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a5, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a6, InterfaceC12341a<OAuthManager> interfaceC12341a7, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a8, InterfaceC12341a<CategoriesAgent> interfaceC12341a9, InterfaceC12341a<ClubsAgent> interfaceC12341a10, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a11, InterfaceC12341a<FlyersAgent> interfaceC12341a12, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a13, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a14, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a15, InterfaceC12341a<UserProfileAgent> interfaceC12341a16, InterfaceC12341a<ConsentsManager> interfaceC12341a17, InterfaceC12341a<BannersAgent> interfaceC12341a18) {
        this.f19259a = interfaceC12341a;
        this.f19260b = interfaceC12341a2;
        this.f19261c = interfaceC12341a3;
        this.f19262d = interfaceC12341a4;
        this.f19263e = interfaceC12341a5;
        this.f19264f = interfaceC12341a6;
        this.f19265g = interfaceC12341a7;
        this.f19266h = interfaceC12341a8;
        this.f19267i = interfaceC12341a9;
        this.f19268j = interfaceC12341a10;
        this.f19269k = interfaceC12341a11;
        this.f19270l = interfaceC12341a12;
        this.f19271m = interfaceC12341a13;
        this.f19272n = interfaceC12341a14;
        this.f19273o = interfaceC12341a15;
        this.f19274p = interfaceC12341a16;
        this.f19275q = interfaceC12341a17;
        this.f19276r = interfaceC12341a18;
    }

    /* renamed from: a */
    public static C7279g m18809a(InterfaceC12341a<AuthService> interfaceC12341a, InterfaceC12341a<OnboardingService> interfaceC12341a2, InterfaceC12341a<DeviceService> interfaceC12341a3, InterfaceC12341a<PrefsManager> interfaceC12341a4, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a5, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a6, InterfaceC12341a<OAuthManager> interfaceC12341a7, InterfaceC12341a<DefaultStoreAgent> interfaceC12341a8, InterfaceC12341a<CategoriesAgent> interfaceC12341a9, InterfaceC12341a<ClubsAgent> interfaceC12341a10, InterfaceC12341a<ClubsCodesAgent> interfaceC12341a11, InterfaceC12341a<FlyersAgent> interfaceC12341a12, InterfaceC12341a<LoyaltyCardAgent> interfaceC12341a13, InterfaceC12341a<RecommendationsCatalogResponsesAgent> interfaceC12341a14, InterfaceC12341a<SearchCatalogResponsesAgent> interfaceC12341a15, InterfaceC12341a<UserProfileAgent> interfaceC12341a16, InterfaceC12341a<ConsentsManager> interfaceC12341a17, InterfaceC12341a<BannersAgent> interfaceC12341a18) {
        return new C7279g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10, interfaceC12341a11, interfaceC12341a12, interfaceC12341a13, interfaceC12341a14, interfaceC12341a15, interfaceC12341a16, interfaceC12341a17, interfaceC12341a18);
    }

    /* renamed from: c */
    public static AuthManager m18807c(AuthService authService, OnboardingService onboardingService, DeviceService deviceService, PrefsManager prefsManager, EncryptedPrefsManager encryptedPrefsManager, OAuthSharedPrefs oAuthSharedPrefs, OAuthManager oAuthManager, DefaultStoreAgent defaultStoreAgent, CategoriesAgent categoriesAgent, ClubsAgent clubsAgent, ClubsCodesAgent clubsCodesAgent, FlyersAgent flyersAgent, LoyaltyCardAgent loyaltyCardAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, UserProfileAgent userProfileAgent, ConsentsManager consentsManager, BannersAgent bannersAgent) {
        return new AuthManager(authService, onboardingService, deviceService, prefsManager, encryptedPrefsManager, oAuthSharedPrefs, oAuthManager, defaultStoreAgent, categoriesAgent, clubsAgent, clubsCodesAgent, flyersAgent, loyaltyCardAgent, recommendationsCatalogResponsesAgent, searchCatalogResponsesAgent, userProfileAgent, consentsManager, bannersAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AuthManager mo42226get() {
        return m18807c(this.f19259a.mo42226get(), this.f19260b.mo42226get(), this.f19261c.mo42226get(), this.f19262d.mo42226get(), this.f19263e.mo42226get(), this.f19264f.mo42226get(), this.f19265g.mo42226get(), this.f19266h.mo42226get(), this.f19267i.mo42226get(), this.f19268j.mo42226get(), this.f19269k.mo42226get(), this.f19270l.mo42226get(), this.f19271m.mo42226get(), this.f19272n.mo42226get(), this.f19273o.mo42226get(), this.f19274p.mo42226get(), this.f19275q.mo42226get(), this.f19276r.mo42226get());
    }
}
