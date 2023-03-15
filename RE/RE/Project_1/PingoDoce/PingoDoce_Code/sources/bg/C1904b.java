package bg;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.ConsentsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: bg.b */
/* loaded from: classes2.dex */
public final class C1904b {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f5652a;

    /* renamed from: b */
    private final InterfaceC12341a<ConsentsManager> f5653b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f5654c;

    public C1904b(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f5652a = interfaceC12341a;
        this.f5653b = interfaceC12341a2;
        this.f5654c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C1904b m35151a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<ConsentsManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C1904b(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static FetchTermsAndConditionsViewModel m35149c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        return new FetchTermsAndConditionsViewModel(c1459l0, resourcesProvider, consentsManager);
    }

    /* renamed from: b */
    public FetchTermsAndConditionsViewModel m35150b(C1459l0 c1459l0) {
        FetchTermsAndConditionsViewModel m35149c = m35149c(c1459l0, this.f5652a.mo42226get(), this.f5653b.mo42226get());
        C13886p.m94a(m35149c, this.f5654c.mo42226get());
        return m35149c;
    }
}
