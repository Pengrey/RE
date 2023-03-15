package p143hh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: hh.d */
/* loaded from: classes2.dex */
public final class C5942d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f16435a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f16436b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f16437c;

    public C5942d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        this.f16435a = interfaceC12341a;
        this.f16436b = interfaceC12341a2;
        this.f16437c = interfaceC12341a3;
    }

    /* renamed from: a */
    public static C5942d m22641a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3) {
        return new C5942d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3);
    }

    /* renamed from: c */
    public static LoyaltyPendingViewModel m22639c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        return new LoyaltyPendingViewModel(c1459l0, resourcesProvider, loyaltyCardManager);
    }

    /* renamed from: b */
    public LoyaltyPendingViewModel m22640b(C1459l0 c1459l0) {
        LoyaltyPendingViewModel m22639c = m22639c(c1459l0, this.f16435a.mo42226get(), this.f16436b.mo42226get());
        C13886p.m94a(m22639c, this.f16437c.mo42226get());
        return m22639c;
    }
}
