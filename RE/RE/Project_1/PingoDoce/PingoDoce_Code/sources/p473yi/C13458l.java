package p473yi;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: yi.l */
/* loaded from: classes2.dex */
public final class C13458l {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f34228a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f34229b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f34230c;

    public C13458l(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f34228a = interfaceC12341a;
        this.f34229b = interfaceC12341a2;
        this.f34230c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C13458l m1354a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C13458l(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static VirtualCardPreferencesViewModel m1352c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        return new VirtualCardPreferencesViewModel(c1459l0, resourcesProvider, loyaltyCardManager);
    }

    /* renamed from: b */
    public VirtualCardPreferencesViewModel m1353b(C1459l0 c1459l0) {
        VirtualCardPreferencesViewModel m1352c = m1352c(c1459l0, this.f34228a.mo42226get(), this.f34229b.mo42226get());
        C13886p.m94a(m1352c, this.f34230c.mo42226get());
        return m1352c;
    }
}
