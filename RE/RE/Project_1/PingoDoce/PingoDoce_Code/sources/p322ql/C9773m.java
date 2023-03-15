package p322ql;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7347m1;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.StoreManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingViewModel;

/* renamed from: ql.m */
/* loaded from: classes2.dex */
public final class C9773m {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25696a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f25697b;

    /* renamed from: c */
    private final InterfaceC12341a<C7347m1> f25698c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f25699d;

    /* renamed from: e */
    private final InterfaceC12341a<StoreManager> f25700e;

    /* renamed from: f */
    private final InterfaceC12341a<CoachMarkManager> f25701f;

    /* renamed from: g */
    private final InterfaceC12341a<C7405s1> f25702g;

    public C9773m(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<StoreManager> interfaceC12341a5, InterfaceC12341a<CoachMarkManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        this.f25696a = interfaceC12341a;
        this.f25697b = interfaceC12341a2;
        this.f25698c = interfaceC12341a3;
        this.f25699d = interfaceC12341a4;
        this.f25700e = interfaceC12341a5;
        this.f25701f = interfaceC12341a6;
        this.f25702g = interfaceC12341a7;
    }

    /* renamed from: a */
    public static C9773m m9997a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7347m1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<StoreManager> interfaceC12341a5, InterfaceC12341a<CoachMarkManager> interfaceC12341a6, InterfaceC12341a<C7405s1> interfaceC12341a7) {
        return new C9773m(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7);
    }

    /* renamed from: c */
    public static TakeAwayLandingViewModel m9995c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1, C7405s1 c7405s1, StoreManager storeManager, CoachMarkManager coachMarkManager) {
        return new TakeAwayLandingViewModel(c1459l0, resourcesProvider, analyticsManager, c7347m1, c7405s1, storeManager, coachMarkManager);
    }

    /* renamed from: b */
    public TakeAwayLandingViewModel m9996b(C1459l0 c1459l0) {
        TakeAwayLandingViewModel m9995c = m9995c(c1459l0, this.f25696a.mo42226get(), this.f25697b.mo42226get(), this.f25698c.mo42226get(), this.f25699d.mo42226get(), this.f25700e.mo42226get(), this.f25701f.mo42226get());
        C13886p.m94a(m9995c, this.f25702g.mo42226get());
        return m9995c;
    }
}
