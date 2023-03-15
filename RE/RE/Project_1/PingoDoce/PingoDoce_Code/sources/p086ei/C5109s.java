package p086ei;

import androidx.lifecycle.C1459l0;
import mg.BannerManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ei.s */
/* loaded from: classes2.dex */
public final class C5109s {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f14137a;

    /* renamed from: b */
    private final InterfaceC12341a<BannerManager> f14138b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f14139c;

    /* renamed from: d */
    private final InterfaceC12341a<StoreManager> f14140d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f14141e;

    public C5109s(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<BannerManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<StoreManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f14137a = interfaceC12341a;
        this.f14138b = interfaceC12341a2;
        this.f14139c = interfaceC12341a3;
        this.f14140d = interfaceC12341a4;
        this.f14141e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C5109s m25680a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<BannerManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<StoreManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C5109s(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static BenefitsViewModel m25678c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, BannerManager bannerManager, LoyaltyCardManager loyaltyCardManager, StoreManager storeManager) {
        return new BenefitsViewModel(c1459l0, resourcesProvider, bannerManager, loyaltyCardManager, storeManager);
    }

    /* renamed from: b */
    public BenefitsViewModel m25679b(C1459l0 c1459l0) {
        BenefitsViewModel m25678c = m25678c(c1459l0, this.f14137a.mo42226get(), this.f14138b.mo42226get(), this.f14139c.mo42226get(), this.f14140d.mo42226get());
        C13886p.m94a(m25678c, this.f14141e.mo42226get());
        return m25678c;
    }
}
