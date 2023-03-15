package p164ii;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.ClubManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;

/* renamed from: ii.i */
/* loaded from: classes2.dex */
public final class C6165i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16907a;

    /* renamed from: b */
    private final InterfaceC12341a<ClubManager> f16908b;

    /* renamed from: c */
    private final InterfaceC12341a<AnalyticsManager> f16909c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f16910d;

    public C6165i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f16907a = interfaceC12341a;
        this.f16908b = interfaceC12341a2;
        this.f16909c = interfaceC12341a3;
        this.f16910d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6165i m22023a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ClubManager> interfaceC12341a2, InterfaceC12341a<AnalyticsManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6165i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static BabyClubHomeViewModel m22021c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        return new BabyClubHomeViewModel(c1459l0, resourcesProvider, clubManager, analyticsManager);
    }

    /* renamed from: b */
    public BabyClubHomeViewModel m22022b(C1459l0 c1459l0) {
        BabyClubHomeViewModel m22021c = m22021c(c1459l0, this.f16907a.mo42226get(), this.f16908b.mo42226get(), this.f16909c.mo42226get());
        C13886p.m94a(m22021c, this.f16910d.mo42226get());
        return m22021c;
    }
}
