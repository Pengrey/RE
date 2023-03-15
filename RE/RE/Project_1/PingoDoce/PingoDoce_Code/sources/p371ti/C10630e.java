package p371ti;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedViewModel;

/* renamed from: ti.e */
/* loaded from: classes2.dex */
public final class C10630e {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f27383a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f27384b;

    public C10630e(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        this.f27383a = interfaceC12341a;
        this.f27384b = interfaceC12341a2;
    }

    /* renamed from: a */
    public static C10630e m7463a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2) {
        return new C10630e(interfaceC12341a, interfaceC12341a2);
    }

    /* renamed from: c */
    public static LoyaltyRemovedViewModel m7461c(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        return new LoyaltyRemovedViewModel(c1459l0, resourcesProvider);
    }

    /* renamed from: b */
    public LoyaltyRemovedViewModel m7462b(C1459l0 c1459l0) {
        LoyaltyRemovedViewModel m7461c = m7461c(c1459l0, this.f27383a.mo42226get());
        C13886p.m94a(m7461c, this.f27384b.mo42226get());
        return m7461c;
    }
}
