package hk;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.CoachMarkManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: hk.j */
/* loaded from: classes2.dex */
public final class C5961j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16469a;

    /* renamed from: b */
    private final InterfaceC12341a<CoachMarkManager> f16470b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f16471c;

    public C5961j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CoachMarkManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f16469a = interfaceC12341a;
        this.f16470b = interfaceC12341a2;
        this.f16471c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5961j m22585a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<CoachMarkManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C5961j(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static AppWalkThroughViewModel m22583c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, CoachMarkManager coachMarkManager) {
        return new AppWalkThroughViewModel(c1459l0, resourcesProvider, coachMarkManager);
    }

    /* renamed from: b */
    public AppWalkThroughViewModel m22584b(C1459l0 c1459l0) {
        AppWalkThroughViewModel m22583c = m22583c(c1459l0, this.f16469a.mo42226get(), this.f16470b.mo42226get());
        C13886p.m94a(m22583c, this.f16471c.mo42226get());
        return m22583c;
    }
}
