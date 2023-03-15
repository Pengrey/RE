package nl;

import androidx.lifecycle.C1459l0;
import mg.C7256f1;
import mg.C7405s1;
import mg.CoachMarkManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: nl.j */
/* loaded from: classes2.dex */
public final class C7944j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20612a;

    /* renamed from: b */
    private final InterfaceC12341a<C7256f1> f20613b;

    /* renamed from: c */
    private final InterfaceC12341a<CoachMarkManager> f20614c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f20615d;

    public C7944j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<CoachMarkManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f20612a = interfaceC12341a;
        this.f20613b = interfaceC12341a2;
        this.f20614c = interfaceC12341a3;
        this.f20615d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7944j m17497a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7256f1> interfaceC12341a2, InterfaceC12341a<CoachMarkManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C7944j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static SharedWithViewModel m17495c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, CoachMarkManager coachMarkManager) {
        return new SharedWithViewModel(c1459l0, resourcesProvider, c7256f1, coachMarkManager);
    }

    /* renamed from: b */
    public SharedWithViewModel m17496b(C1459l0 c1459l0) {
        SharedWithViewModel m17495c = m17495c(c1459l0, this.f20612a.mo42226get(), this.f20613b.mo42226get(), this.f20614c.mo42226get());
        C13886p.m94a(m17495c, this.f20615d.mo42226get());
        return m17495c;
    }
}
