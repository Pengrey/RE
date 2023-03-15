package p473yi;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: yi.f */
/* loaded from: classes2.dex */
public final class C13449f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f34203a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f34204b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f34205c;

    public C13449f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f34203a = interfaceC12341a;
        this.f34204b = interfaceC12341a2;
        this.f34205c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C13449f m1381a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C13449f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static VirtualCardDataConfirmationViewModel m1379c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1) {
        return new VirtualCardDataConfirmationViewModel(c1459l0, resourcesProvider, c7405s1);
    }

    /* renamed from: b */
    public VirtualCardDataConfirmationViewModel m1380b(C1459l0 c1459l0) {
        VirtualCardDataConfirmationViewModel m1379c = m1379c(c1459l0, this.f34203a.mo42226get(), this.f34204b.mo42226get());
        C13886p.m94a(m1379c, this.f34205c.mo42226get());
        return m1379c;
    }
}
