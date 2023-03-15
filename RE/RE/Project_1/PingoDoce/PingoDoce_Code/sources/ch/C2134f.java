package ch;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyViewModel;

/* renamed from: ch.f */
/* loaded from: classes2.dex */
public final class C2134f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f6166a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f6167b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f6168c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f6169d;

    public C2134f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f6166a = interfaceC12341a;
        this.f6167b = interfaceC12341a2;
        this.f6168c = interfaceC12341a3;
        this.f6169d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C2134f m34601a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C2134f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static LoyaltyViewModel m34599c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        return new LoyaltyViewModel(c1459l0, resourcesProvider, loyaltyCardManager, analyticsManager);
    }

    /* renamed from: b */
    public LoyaltyViewModel m34600b(C1459l0 c1459l0) {
        LoyaltyViewModel m34599c = m34599c(c1459l0, this.f6166a.mo42226get(), this.f6167b.mo42226get(), this.f6168c.mo42226get());
        C13886p.m94a(m34599c, this.f6169d.mo42226get());
        return m34599c;
    }
}
