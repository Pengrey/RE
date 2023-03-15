package p256nh;

import androidx.lifecycle.C1459l0;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.ConsentsManager;
import mg.LoyaltyCardManager;
import mg.PrefsManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel;

/* renamed from: nh.o */
/* loaded from: classes2.dex */
public final class C7901o {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20521a;

    /* renamed from: b */
    private final InterfaceC12341a<LoyaltyCardManager> f20522b;

    /* renamed from: c */
    private final InterfaceC12341a<AuthManager> f20523c;

    /* renamed from: d */
    private final InterfaceC12341a<ConsentsManager> f20524d;

    /* renamed from: e */
    private final InterfaceC12341a<BiometricsManager> f20525e;

    /* renamed from: f */
    private final InterfaceC12341a<PrefsManager> f20526f;

    /* renamed from: g */
    private final InterfaceC12341a<CoachMarkManager> f20527g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f20528h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f20529i;

    public C7901o(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AuthManager> interfaceC12341a3, InterfaceC12341a<ConsentsManager> interfaceC12341a4, InterfaceC12341a<BiometricsManager> interfaceC12341a5, InterfaceC12341a<PrefsManager> interfaceC12341a6, InterfaceC12341a<CoachMarkManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        this.f20521a = interfaceC12341a;
        this.f20522b = interfaceC12341a2;
        this.f20523c = interfaceC12341a3;
        this.f20524d = interfaceC12341a4;
        this.f20525e = interfaceC12341a5;
        this.f20526f = interfaceC12341a6;
        this.f20527g = interfaceC12341a7;
        this.f20528h = interfaceC12341a8;
        this.f20529i = interfaceC12341a9;
    }

    /* renamed from: a */
    public static C7901o m17624a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a2, InterfaceC12341a<AuthManager> interfaceC12341a3, InterfaceC12341a<ConsentsManager> interfaceC12341a4, InterfaceC12341a<BiometricsManager> interfaceC12341a5, InterfaceC12341a<PrefsManager> interfaceC12341a6, InterfaceC12341a<CoachMarkManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        return new C7901o(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9);
    }

    /* renamed from: c */
    public static SettingsViewModel m17622c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AuthManager authManager, ConsentsManager consentsManager, BiometricsManager biometricsManager, PrefsManager prefsManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        return new SettingsViewModel(c1459l0, resourcesProvider, loyaltyCardManager, authManager, consentsManager, biometricsManager, prefsManager, coachMarkManager, c7405s1);
    }

    /* renamed from: b */
    public SettingsViewModel m17623b(C1459l0 c1459l0) {
        SettingsViewModel m17622c = m17622c(c1459l0, this.f20521a.mo42226get(), this.f20522b.mo42226get(), this.f20523c.mo42226get(), this.f20524d.mo42226get(), this.f20525e.mo42226get(), this.f20526f.mo42226get(), this.f20527g.mo42226get(), this.f20528h.mo42226get());
        C13886p.m94a(m17622c, this.f20529i.mo42226get());
        return m17622c;
    }
}
