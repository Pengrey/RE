package p164ii;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ii.x */
/* loaded from: classes2.dex */
public final class C6181x {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16952a;

    /* renamed from: b */
    private final InterfaceC12341a<ClubManager> f16953b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f16954c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f16955d;

    public C6181x(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f16952a = interfaceC12341a;
        this.f16953b = interfaceC12341a2;
        this.f16954c = interfaceC12341a3;
        this.f16955d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6181x m21975a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6181x(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static BabyClubWelcomeViewModel m21973c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        return new BabyClubWelcomeViewModel(c1459l0, resourcesProvider, clubManager, analyticsManager);
    }

    /* renamed from: b */
    public BabyClubWelcomeViewModel m21974b(C1459l0 c1459l0) {
        BabyClubWelcomeViewModel m21973c = m21973c(c1459l0, this.f16952a.mo42226get(), this.f16953b.mo42226get(), this.f16954c.mo42226get());
        C13886p.m94a(m21973c, this.f16955d.mo42226get());
        return m21973c;
    }
}
