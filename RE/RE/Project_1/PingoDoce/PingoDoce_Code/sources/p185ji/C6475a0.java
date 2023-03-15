package p185ji;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel;

/* renamed from: ji.a0 */
/* loaded from: classes2.dex */
public final class C6475a0 {

    /* renamed from: a */
    private final InterfaceC12341a<ClubManager> f17585a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f17586b;

    /* renamed from: c */
    private final InterfaceC12341a<ResourcesProvider> f17587c;

    /* renamed from: d */
    private final InterfaceC12341a<AnalyticsManager> f17588d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f17589e;

    public C6475a0(InterfaceC12341a<ClubManager> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<ResourcesProvider> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f17585a = interfaceC12341a;
        this.f17586b = interfaceC12341a2;
        this.f17587c = interfaceC12341a3;
        this.f17588d = interfaceC12341a4;
        this.f17589e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C6475a0 m20840a(InterfaceC12341a<ClubManager> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<ResourcesProvider> interfaceC12341a3, InterfaceC12341a<AnalyticsManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C6475a0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static WineClubUpdateViewModel m20838c(C1459l0 c1459l0, ClubManager clubManager, ConsentsManager consentsManager, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new WineClubUpdateViewModel(c1459l0, clubManager, consentsManager, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public WineClubUpdateViewModel m20839b(C1459l0 c1459l0) {
        WineClubUpdateViewModel m20838c = m20838c(c1459l0, this.f17585a.mo42226get(), this.f17586b.mo42226get(), this.f17587c.mo42226get(), this.f17588d.mo42226get());
        C13886p.m94a(m20838c, this.f17589e.mo42226get());
        return m20838c;
    }
}
