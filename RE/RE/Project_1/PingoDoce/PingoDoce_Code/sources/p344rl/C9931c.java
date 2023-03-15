package p344rl;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.CoachMarkManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.takeaway.landing.anonymousSession.AnonymousSessionTakeAwayLandingViewModel;

/* renamed from: rl.c */
/* loaded from: classes2.dex */
public final class C9931c {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25999a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f26000b;

    /* renamed from: c */
    private final InterfaceC12341a<CoachMarkManager> f26001c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f26002d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f26003e;

    public C9931c(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<CoachMarkManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f25999a = interfaceC12341a;
        this.f26000b = interfaceC12341a2;
        this.f26001c = interfaceC12341a3;
        this.f26002d = interfaceC12341a4;
        this.f26003e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C9931c m9663a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<CoachMarkManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C9931c(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static AnonymousSessionTakeAwayLandingViewModel m9661c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        return new AnonymousSessionTakeAwayLandingViewModel(c1459l0, resourcesProvider, analyticsManager, coachMarkManager, c7405s1);
    }

    /* renamed from: b */
    public AnonymousSessionTakeAwayLandingViewModel m9662b(C1459l0 c1459l0) {
        AnonymousSessionTakeAwayLandingViewModel m9661c = m9661c(c1459l0, this.f25999a.mo42226get(), this.f26000b.mo42226get(), this.f26001c.mo42226get(), this.f26002d.mo42226get());
        C13886p.m94a(m9661c, this.f26003e.mo42226get());
        return m9661c;
    }
}
