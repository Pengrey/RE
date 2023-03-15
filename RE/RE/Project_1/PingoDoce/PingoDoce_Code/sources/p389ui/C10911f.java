package p389ui;

import androidx.lifecycle.C1459l0;
import fm.C5580d;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ui.f */
/* loaded from: classes2.dex */
public final class C10911f {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f28143a;

    /* renamed from: b */
    private final InterfaceC12341a<C5580d> f28144b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f28145c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f28146d;

    public C10911f(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C5580d> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f28143a = interfaceC12341a;
        this.f28144b = interfaceC12341a2;
        this.f28145c = interfaceC12341a3;
        this.f28146d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C10911f m6756a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C5580d> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C10911f(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static LoyaltyCardViewModel m6754c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C5580d c5580d, LoyaltyCardManager loyaltyCardManager) {
        return new LoyaltyCardViewModel(c1459l0, resourcesProvider, c5580d, loyaltyCardManager);
    }

    /* renamed from: b */
    public LoyaltyCardViewModel m6755b(C1459l0 c1459l0) {
        LoyaltyCardViewModel m6754c = m6754c(c1459l0, this.f28143a.mo42226get(), this.f28144b.mo42226get(), this.f28145c.mo42226get());
        C13886p.m94a(m6754c, this.f28146d.mo42226get());
        return m6754c;
    }
}
