package dm;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.CoachMarkManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: dm.i */
/* loaded from: classes2.dex */
public final class C4895i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f13359a;

    /* renamed from: b */
    private final InterfaceC12341a<CoachMarkManager> f13360b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f13361c;

    public C4895i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CoachMarkManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f13359a = interfaceC12341a;
        this.f13360b = interfaceC12341a2;
        this.f13361c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C4895i m26323a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CoachMarkManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C4895i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static TakeAwayWalkThroughViewModel m26321c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, CoachMarkManager coachMarkManager) {
        return new TakeAwayWalkThroughViewModel(c1459l0, resourcesProvider, coachMarkManager);
    }

    /* renamed from: b */
    public TakeAwayWalkThroughViewModel m26322b(C1459l0 c1459l0) {
        TakeAwayWalkThroughViewModel m26321c = m26321c(c1459l0, this.f13359a.mo42226get(), this.f13360b.mo42226get());
        C13886p.m94a(m26321c, this.f13361c.mo42226get());
        return m26321c;
    }
}
