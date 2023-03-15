package p496zj;

import androidx.lifecycle.C1459l0;
import mg.C7296j0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: zj.d */
/* loaded from: classes2.dex */
public final class C13937d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f35081a;

    /* renamed from: b */
    private final InterfaceC12341a<C7296j0> f35082b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f35083c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f35084d;

    public C13937d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f35081a = interfaceC12341a;
        this.f35082b = interfaceC12341a2;
        this.f35083c = interfaceC12341a3;
        this.f35084d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C13937d m47a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7296j0> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C13937d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static CardRegistrationLandingViewModel m45c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7296j0 c7296j0, C7405s1 c7405s1) {
        return new CardRegistrationLandingViewModel(c1459l0, resourcesProvider, c7296j0, c7405s1);
    }

    /* renamed from: b */
    public CardRegistrationLandingViewModel m46b(C1459l0 c1459l0) {
        CardRegistrationLandingViewModel m45c = m45c(c1459l0, this.f35081a.mo42226get(), this.f35082b.mo42226get(), this.f35083c.mo42226get());
        C13886p.m94a(m45c, this.f35084d.mo42226get());
        return m45c;
    }
}
