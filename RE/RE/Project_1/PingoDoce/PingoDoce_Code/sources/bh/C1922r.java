package bh;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.ClubManager;
import mg.LoyaltyCardManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.loggedAccount.LoggedAccountViewModel;

/* renamed from: bh.r */
/* loaded from: classes2.dex */
public final class C1922r {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f5673a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f5674b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f5675c;

    /* renamed from: d */
    private final InterfaceC12341a<ClubManager> f5676d;

    /* renamed from: e */
    private final InterfaceC12341a<C7405s1> f5677e;

    public C1922r(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<ClubManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        this.f5673a = interfaceC12341a;
        this.f5674b = interfaceC12341a2;
        this.f5675c = interfaceC12341a3;
        this.f5676d = interfaceC12341a4;
        this.f5677e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C1922r m35143a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<ClubManager> interfaceC12341a4, InterfaceC12341a<C7405s1> interfaceC12341a5) {
        return new C1922r(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static LoggedAccountViewModel m35141c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, C7405s1 c7405s1, ClubManager clubManager) {
        return new LoggedAccountViewModel(c1459l0, resourcesProvider, loyaltyCardManager, c7405s1, clubManager);
    }

    /* renamed from: b */
    public LoggedAccountViewModel m35142b(C1459l0 c1459l0) {
        LoggedAccountViewModel m35141c = m35141c(c1459l0, this.f5673a.mo42226get(), this.f5674b.mo42226get(), this.f5675c.mo42226get(), this.f5676d.mo42226get());
        C13886p.m94a(m35141c, this.f5677e.mo42226get());
        return m35141c;
    }
}
