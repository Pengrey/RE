package p033bk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: bk.l */
/* loaded from: classes2.dex */
public final class C1939l {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f5724a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f5725b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f5726c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f5727d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f5728e;

    public C1939l(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f5724a = interfaceC12341a;
        this.f5725b = interfaceC12341a2;
        this.f5726c = interfaceC12341a3;
        this.f5727d = interfaceC12341a4;
        this.f5728e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C1939l m35090a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C1939l(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static CardRegistrationResumeViewModel m35088c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1, AnalyticsManager analyticsManager) {
        return new CardRegistrationResumeViewModel(c1459l0, resourcesProvider, loyaltyCardManager, c7405s1, analyticsManager);
    }

    /* renamed from: b */
    public CardRegistrationResumeViewModel m35089b(C1459l0 c1459l0) {
        CardRegistrationResumeViewModel m35088c = m35088c(c1459l0, this.f5724a.mo42226get(), this.f5725b.mo42226get(), this.f5726c.mo42226get(), this.f5727d.mo42226get());
        C13886p.m94a(m35088c, this.f5728e.mo42226get());
        return m35088c;
    }
}
