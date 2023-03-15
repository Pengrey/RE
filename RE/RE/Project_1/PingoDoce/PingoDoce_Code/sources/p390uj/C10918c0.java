package p390uj;

import androidx.lifecycle.C1459l0;
import mg.BannerManager;
import mg.C7256f1;
import mg.C7310l;
import mg.C7405s1;
import mg.ClubManager;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.home.HomeViewModel;

/* renamed from: uj.c0 */
/* loaded from: classes2.dex */
public final class C10918c0 {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f28153a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f28154b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f28155c;

    /* renamed from: d */
    private final InterfaceC12341a<StoreManager> f28156d;

    /* renamed from: e */
    private final InterfaceC12341a<BannerManager> f28157e;

    /* renamed from: f */
    private final InterfaceC12341a<C7310l> f28158f;

    /* renamed from: g */
    private final InterfaceC12341a<ClubManager> f28159g;

    /* renamed from: h */
    private final InterfaceC12341a<CoachMarkManager> f28160h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f28161i;

    /* renamed from: j */
    private final InterfaceC12341a<C7405s1> f28162j;

    public C10918c0(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<StoreManager> interfaceC12341a4, InterfaceC12341a<BannerManager> interfaceC12341a5, InterfaceC12341a<C7310l> interfaceC12341a6, InterfaceC12341a<ClubManager> interfaceC12341a7, InterfaceC12341a<CoachMarkManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        this.f28153a = interfaceC12341a;
        this.f28154b = interfaceC12341a2;
        this.f28155c = interfaceC12341a3;
        this.f28156d = interfaceC12341a4;
        this.f28157e = interfaceC12341a5;
        this.f28158f = interfaceC12341a6;
        this.f28159g = interfaceC12341a7;
        this.f28160h = interfaceC12341a8;
        this.f28161i = interfaceC12341a9;
        this.f28162j = interfaceC12341a10;
    }

    /* renamed from: a */
    public static C10918c0 m6750a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<StoreManager> interfaceC12341a4, InterfaceC12341a<BannerManager> interfaceC12341a5, InterfaceC12341a<C7310l> interfaceC12341a6, InterfaceC12341a<ClubManager> interfaceC12341a7, InterfaceC12341a<CoachMarkManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        return new C10918c0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10);
    }

    /* renamed from: c */
    public static HomeViewModel m6748c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager, BannerManager bannerManager, C7310l c7310l, ClubManager clubManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        return new HomeViewModel(c1459l0, resourcesProvider, c7256f1, loyaltyCardManager, storeManager, bannerManager, c7310l, clubManager, coachMarkManager, c7405s1);
    }

    /* renamed from: b */
    public HomeViewModel m6749b(C1459l0 c1459l0) {
        HomeViewModel m6748c = m6748c(c1459l0, this.f28153a.mo42226get(), this.f28154b.mo42226get(), this.f28155c.mo42226get(), this.f28156d.mo42226get(), this.f28157e.mo42226get(), this.f28158f.mo42226get(), this.f28159g.mo42226get(), this.f28160h.mo42226get(), this.f28161i.mo42226get());
        C13886p.m94a(m6748c, this.f28162j.mo42226get());
        return m6748c;
    }
}
