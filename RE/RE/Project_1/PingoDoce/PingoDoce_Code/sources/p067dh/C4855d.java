package p067dh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: dh.d */
/* loaded from: classes2.dex */
public final class C4855d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f13277a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f13278b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f13279c;

    public C4855d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f13277a = interfaceC12341a;
        this.f13278b = interfaceC12341a2;
        this.f13279c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C4855d m26459a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C4855d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static AssociationsViewModel m26457c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        return new AssociationsViewModel(c1459l0, resourcesProvider, loyaltyCardManager);
    }

    /* renamed from: b */
    public AssociationsViewModel m26458b(C1459l0 c1459l0) {
        AssociationsViewModel m26457c = m26457c(c1459l0, this.f13277a.mo42226get(), this.f13278b.mo42226get());
        C13886p.m94a(m26457c, this.f13279c.mo42226get());
        return m26457c;
    }
}
