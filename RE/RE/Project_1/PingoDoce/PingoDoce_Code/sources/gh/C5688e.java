package gh;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.intro.LoyaltyIntroViewModel;

/* renamed from: gh.e */
/* loaded from: classes2.dex */
public final class C5688e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f15936a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f15937b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f15938c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f15939d;

    public C5688e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f15936a = interfaceC12341a;
        this.f15937b = interfaceC12341a2;
        this.f15938c = interfaceC12341a3;
        this.f15939d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C5688e m23343a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C5688e(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static LoyaltyIntroViewModel m23341c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        return new LoyaltyIntroViewModel(c1459l0, resourcesProvider, loyaltyCardManager, analyticsManager);
    }

    /* renamed from: b */
    public LoyaltyIntroViewModel m23342b(C1459l0 c1459l0) {
        LoyaltyIntroViewModel m23341c = m23341c(c1459l0, this.f15936a.mo42226get(), this.f15937b.mo42226get(), this.f15938c.mo42226get());
        C13886p.m94a(m23341c, this.f15939d.mo42226get());
        return m23341c;
    }
}
