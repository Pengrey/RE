package p428wi;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.PrefsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: wi.g */
/* loaded from: classes2.dex */
public final class C12163g {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f32116a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f32117b;

    /* renamed from: c */
    private final InterfaceC12341a<PrefsManager> f32118c;

    /* renamed from: d */
    private final InterfaceC12341a<CoachMarkManager> f32119d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f32120e;

    public C12163g(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PrefsManager> interfaceC12341a3, InterfaceC12341a<CoachMarkManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f32116a = interfaceC12341a;
        this.f32117b = interfaceC12341a2;
        this.f32118c = interfaceC12341a3;
        this.f32119d = interfaceC12341a4;
        this.f32120e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C12163g m3506a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<PrefsManager> interfaceC12341a3, InterfaceC12341a<CoachMarkManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C12163g(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static LoyaltyCardInvitesViewModel m3504c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, PrefsManager prefsManager, CoachMarkManager coachMarkManager) {
        return new LoyaltyCardInvitesViewModel(c1459l0, resourcesProvider, loyaltyCardManager, prefsManager, coachMarkManager);
    }

    /* renamed from: b */
    public LoyaltyCardInvitesViewModel m3505b(C1459l0 c1459l0) {
        LoyaltyCardInvitesViewModel m3504c = m3504c(c1459l0, this.f32116a.mo42226get(), this.f32117b.mo42226get(), this.f32118c.mo42226get(), this.f32119d.mo42226get());
        C13886p.m94a(m3504c, this.f32120e.mo42226get());
        return m3504c;
    }
}
