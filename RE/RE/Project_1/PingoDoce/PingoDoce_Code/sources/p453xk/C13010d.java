package p453xk;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: xk.d */
/* loaded from: classes2.dex */
public final class C13010d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f33768a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f33769b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f33770c;

    public C13010d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f33768a = interfaceC12341a;
        this.f33769b = interfaceC12341a2;
        this.f33770c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C13010d m1928a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C13010d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static OnboardingMyPdViewModel m1926c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        return new OnboardingMyPdViewModel(c1459l0, resourcesProvider, consentsManager);
    }

    /* renamed from: b */
    public OnboardingMyPdViewModel m1927b(C1459l0 c1459l0) {
        OnboardingMyPdViewModel m1926c = m1926c(c1459l0, this.f33768a.mo42226get(), this.f33769b.mo42226get());
        C13886p.m94a(m1926c, this.f33770c.mo42226get());
        return m1926c;
    }
}
