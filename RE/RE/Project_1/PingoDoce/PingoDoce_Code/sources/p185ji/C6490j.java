package p185ji;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.clubs.wine.WineClubHomeViewModel;

/* renamed from: ji.j */
/* loaded from: classes2.dex */
public final class C6490j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17603a;

    /* renamed from: b */
    private final InterfaceC12341a<ClubManager> f17604b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f17605c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f17606d;

    public C6490j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f17603a = interfaceC12341a;
        this.f17604b = interfaceC12341a2;
        this.f17605c = interfaceC12341a3;
        this.f17606d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6490j m20830a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6490j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static WineClubHomeViewModel m20828c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        return new WineClubHomeViewModel(c1459l0, resourcesProvider, clubManager, analyticsManager);
    }

    /* renamed from: b */
    public WineClubHomeViewModel m20829b(C1459l0 c1459l0) {
        WineClubHomeViewModel m20828c = m20828c(c1459l0, this.f17603a.mo42226get(), this.f17604b.mo42226get(), this.f17605c.mo42226get());
        C13886p.m94a(m20828c, this.f17606d.mo42226get());
        return m20828c;
    }
}
