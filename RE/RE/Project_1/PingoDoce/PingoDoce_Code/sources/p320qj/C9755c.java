package p320qj;

import androidx.lifecycle.C1459l0;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.LoyaltyCardManager;
import mg.StoreManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;
import se.OAuthSharedPrefs;

/* renamed from: qj.c */
/* loaded from: classes2.dex */
public final class C9755c {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f25667a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthManager> f25668b;

    /* renamed from: c */
    private final InterfaceC12341a<C7405s1> f25669c;

    /* renamed from: d */
    private final InterfaceC12341a<OAuthSharedPrefs> f25670d;

    /* renamed from: e */
    private final InterfaceC12341a<LoyaltyCardManager> f25671e;

    /* renamed from: f */
    private final InterfaceC12341a<CoachMarkManager> f25672f;

    /* renamed from: g */
    private final InterfaceC12341a<StoreManager> f25673g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f25674h;

    public C9755c(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a4, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a5, InterfaceC12341a<CoachMarkManager> interfaceC12341a6, InterfaceC12341a<StoreManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        this.f25667a = interfaceC12341a;
        this.f25668b = interfaceC12341a2;
        this.f25669c = interfaceC12341a3;
        this.f25670d = interfaceC12341a4;
        this.f25671e = interfaceC12341a5;
        this.f25672f = interfaceC12341a6;
        this.f25673g = interfaceC12341a7;
        this.f25674h = interfaceC12341a8;
    }

    /* renamed from: a */
    public static C9755c m10014a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<C7405s1> interfaceC12341a3, InterfaceC12341a<OAuthSharedPrefs> interfaceC12341a4, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a5, InterfaceC12341a<CoachMarkManager> interfaceC12341a6, InterfaceC12341a<StoreManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        return new C9755c(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8);
    }

    /* renamed from: c */
    public static DebugViewModel m10012c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, OAuthManager oAuthManager, C7405s1 c7405s1, OAuthSharedPrefs oAuthSharedPrefs, LoyaltyCardManager loyaltyCardManager, CoachMarkManager coachMarkManager, StoreManager storeManager) {
        return new DebugViewModel(c1459l0, resourcesProvider, oAuthManager, c7405s1, oAuthSharedPrefs, loyaltyCardManager, coachMarkManager, storeManager);
    }

    /* renamed from: b */
    public DebugViewModel m10013b(C1459l0 c1459l0) {
        DebugViewModel m10012c = m10012c(c1459l0, this.f25667a.mo42226get(), this.f25668b.mo42226get(), this.f25669c.mo42226get(), this.f25670d.mo42226get(), this.f25671e.mo42226get(), this.f25672f.mo42226get(), this.f25673g.mo42226get());
        C13886p.m94a(m10012c, this.f25674h.mo42226get());
        return m10012c;
    }
}
