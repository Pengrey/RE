package tk;

import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import mg.PinRecoveryManager;
import mg.SmsManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: tk.d */
/* loaded from: classes2.dex */
public final class C10639d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f27405a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthManager> f27406b;

    /* renamed from: c */
    private final InterfaceC12341a<SmsManager> f27407c;

    /* renamed from: d */
    private final InterfaceC12341a<C7296j0> f27408d;

    /* renamed from: e */
    private final InterfaceC12341a<LoyaltyCardManager> f27409e;

    /* renamed from: f */
    private final InterfaceC12341a<PinRecoveryManager> f27410f;

    /* renamed from: g */
    private final InterfaceC12341a<AnalyticsManager> f27411g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f27412h;

    public C10639d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a5, InterfaceC12341a<PinRecoveryManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        this.f27405a = interfaceC12341a;
        this.f27406b = interfaceC12341a2;
        this.f27407c = interfaceC12341a3;
        this.f27408d = interfaceC12341a4;
        this.f27409e = interfaceC12341a5;
        this.f27410f = interfaceC12341a6;
        this.f27411g = interfaceC12341a7;
        this.f27412h = interfaceC12341a8;
    }

    /* renamed from: a */
    public static C10639d m7437a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<SmsManager> interfaceC12341a3, InterfaceC12341a<C7296j0> interfaceC12341a4, InterfaceC12341a<LoyaltyCardManager> interfaceC12341a5, InterfaceC12341a<PinRecoveryManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        return new C10639d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8);
    }

    /* renamed from: c */
    public static SmsValidationViewModel m7435c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, OAuthManager oAuthManager, SmsManager smsManager, C7296j0 c7296j0, LoyaltyCardManager loyaltyCardManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        return new SmsValidationViewModel(c1459l0, resourcesProvider, oAuthManager, smsManager, c7296j0, loyaltyCardManager, pinRecoveryManager, analyticsManager);
    }

    /* renamed from: b */
    public SmsValidationViewModel m7436b(C1459l0 c1459l0) {
        SmsValidationViewModel m7435c = m7435c(c1459l0, this.f27405a.mo42226get(), this.f27406b.mo42226get(), this.f27407c.mo42226get(), this.f27408d.mo42226get(), this.f27409e.mo42226get(), this.f27410f.mo42226get(), this.f27411g.mo42226get());
        C13886p.m94a(m7435c, this.f27412h.mo42226get());
        return m7435c;
    }
}
