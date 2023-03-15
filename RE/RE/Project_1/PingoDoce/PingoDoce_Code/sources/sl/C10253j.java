package sl;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: sl.j */
/* loaded from: classes2.dex */
public final class C10253j {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f26706a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f26707b;

    public C10253j(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f26706a = interfaceC12341a;
        this.f26707b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C10253j m8391a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C10253j(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static TakeAwayCheckoutSuccessViewModel m8389c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new TakeAwayCheckoutSuccessViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public TakeAwayCheckoutSuccessViewModel m8390b(C1459l0 c1459l0) {
        TakeAwayCheckoutSuccessViewModel m8389c = m8389c(c1459l0, this.f26706a.mo42226get());
        C13886p.m94a(m8389c, this.f26707b.mo42226get());
        return m8389c;
    }
}
