package p184jh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel;

/* renamed from: jh.o */
/* loaded from: classes2.dex */
public final class C6472o {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f17578a;

    /* renamed from: b */
    private final InterfaceC12341a<C7405s1> f17579b;

    /* renamed from: c */
    private final InterfaceC12341a<LoyaltyCardManager> f17580c;

    /* renamed from: d */
    private final InterfaceC12341a<C7405s1> f17581d;

    public C6472o(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        this.f17578a = interfaceC12341a;
        this.f17579b = interfaceC12341a2;
        this.f17580c = interfaceC12341a3;
        this.f17581d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C6472o m20845a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<C7405s1> interfaceC12341a2, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a3, InterfaceC12341a<C7405s1> interfaceC12341a4) {
        return new C6472o(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static ProfileViewModel m20843c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, LoyaltyCardManager loyaltyCardManager) {
        return new ProfileViewModel(c1459l0, resourcesProvider, c7405s1, loyaltyCardManager);
    }

    /* renamed from: b */
    public ProfileViewModel m20844b(C1459l0 c1459l0) {
        ProfileViewModel m20843c = m20843c(c1459l0, this.f17578a.mo42226get(), this.f17579b.mo42226get(), this.f17580c.mo42226get());
        C13886p.m94a(m20843c, this.f17581d.mo42226get());
        return m20843c;
    }
}
