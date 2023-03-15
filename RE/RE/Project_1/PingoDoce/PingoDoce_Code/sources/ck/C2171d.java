package ck;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ck.d */
/* loaded from: classes2.dex */
public final class C2171d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f6262a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f6263b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f6264c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f6265d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f6266e;

    public C2171d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f6262a = interfaceC12341a;
        this.f6263b = interfaceC12341a2;
        this.f6264c = interfaceC12341a3;
        this.f6265d = interfaceC12341a4;
        this.f6266e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C2171d m34522a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C2171d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static CardRegistrationStatusViewModel m34520c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        return new CardRegistrationStatusViewModel(c1459l0, resourcesProvider, loyaltyCardManager, analyticsManager, c7405s1);
    }

    /* renamed from: b */
    public CardRegistrationStatusViewModel m34521b(C1459l0 c1459l0) {
        CardRegistrationStatusViewModel m34520c = m34520c(c1459l0, this.f6262a.mo42226get(), this.f6263b.mo42226get(), this.f6264c.mo42226get(), this.f6265d.mo42226get());
        C13886p.m94a(m34520c, this.f6266e.mo42226get());
        return m34520c;
    }
}
