package tl;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: tl.d */
/* loaded from: classes2.dex */
public final class C10642d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f27415a;

    /* renamed from: b */
    private final InterfaceC12341a<AnalyticsManager> f27416b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f27417c;

    public C10642d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f27415a = interfaceC12341a;
        this.f27416b = interfaceC12341a2;
        this.f27417c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C10642d m7428a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AnalyticsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C10642d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TakeAwayEditEmailViewModel m7426c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        return new TakeAwayEditEmailViewModel(c1459l0, resourcesProvider, analyticsManager);
    }

    /* renamed from: b */
    public TakeAwayEditEmailViewModel m7427b(C1459l0 c1459l0) {
        TakeAwayEditEmailViewModel m7426c = m7426c(c1459l0, this.f27415a.mo42226get(), this.f27416b.mo42226get());
        C13886p.m94a(m7426c, this.f27417c.mo42226get());
        return m7426c;
    }
}
