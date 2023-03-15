package p406vh;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.PinRecoveryManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: vh.i */
/* loaded from: classes2.dex */
public final class C11361i {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f29151a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f29152b;

    /* renamed from: c */
    private final InterfaceC12341a<OAuthManager> f29153c;

    /* renamed from: d */
    private final InterfaceC12341a<C0577e> f29154d;

    /* renamed from: e */
    private final InterfaceC12341a<BiometricsManager> f29155e;

    /* renamed from: f */
    private final InterfaceC12341a<PinRecoveryManager> f29156f;

    /* renamed from: g */
    private final InterfaceC12341a<AnalyticsManager> f29157g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f29158h;

    public C11361i(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<OAuthManager> interfaceC12341a3, InterfaceC12341a<C0577e> interfaceC12341a4, InterfaceC12341a<BiometricsManager> interfaceC12341a5, InterfaceC12341a<PinRecoveryManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        this.f29151a = interfaceC12341a;
        this.f29152b = interfaceC12341a2;
        this.f29153c = interfaceC12341a3;
        this.f29154d = interfaceC12341a4;
        this.f29155e = interfaceC12341a5;
        this.f29156f = interfaceC12341a6;
        this.f29157g = interfaceC12341a7;
        this.f29158h = interfaceC12341a8;
    }

    /* renamed from: a */
    public static C11361i m5340a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<OAuthManager> interfaceC12341a3, InterfaceC12341a<C0577e> interfaceC12341a4, InterfaceC12341a<BiometricsManager> interfaceC12341a5, InterfaceC12341a<PinRecoveryManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        return new C11361i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8);
    }

    /* renamed from: c */
    public static ReplacePinViewModel m5338c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, OAuthManager oAuthManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        return new ReplacePinViewModel(c1459l0, resourcesProvider, authManager, oAuthManager, c0577e, biometricsManager, pinRecoveryManager, analyticsManager);
    }

    /* renamed from: b */
    public ReplacePinViewModel m5339b(C1459l0 c1459l0) {
        ReplacePinViewModel m5338c = m5338c(c1459l0, this.f29151a.mo42226get(), this.f29152b.mo42226get(), this.f29153c.mo42226get(), this.f29154d.mo42226get(), this.f29155e.mo42226get(), this.f29156f.mo42226get(), this.f29157g.mo42226get());
        C13886p.m94a(m5338c, this.f29158h.mo42226get());
        return m5338c;
    }
}
