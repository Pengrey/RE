package p033bk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: bk.f */
/* loaded from: classes2.dex */
public final class C1933f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f5702a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f5703b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f5704c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f5705d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f5706e;

    public C1933f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f5702a = interfaceC12341a;
        this.f5703b = interfaceC12341a2;
        this.f5704c = interfaceC12341a3;
        this.f5705d = interfaceC12341a4;
        this.f5706e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C1933f m35106a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C1933f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static AvailableCardsResumeViewModel m35104c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1) {
        return new AvailableCardsResumeViewModel(c1459l0, resourcesProvider, analyticsManager, loyaltyCardManager, c7405s1);
    }

    /* renamed from: b */
    public AvailableCardsResumeViewModel m35105b(C1459l0 c1459l0) {
        AvailableCardsResumeViewModel m35104c = m35104c(c1459l0, this.f5702a.mo42226get(), this.f5703b.mo42226get(), this.f5704c.mo42226get(), this.f5705d.mo42226get());
        C13886p.m94a(m35104c, this.f5706e.mo42226get());
        return m35104c;
    }
}
