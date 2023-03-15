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

/* renamed from: vh.d */
/* loaded from: classes2.dex */
public final class C11356d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f29135a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f29136b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f29137c;

    /* renamed from: d */
    private final InterfaceC12341a<BiometricsManager> f29138d;

    /* renamed from: e */
    private final InterfaceC12341a<PinRecoveryManager> f29139e;

    /* renamed from: f */
    private final InterfaceC12341a<OAuthManager> f29140f;

    /* renamed from: g */
    private final InterfaceC12341a<AnalyticsManager> f29141g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f29142h;

    public C11356d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        this.f29135a = interfaceC12341a;
        this.f29136b = interfaceC12341a2;
        this.f29137c = interfaceC12341a3;
        this.f29138d = interfaceC12341a4;
        this.f29139e = interfaceC12341a5;
        this.f29140f = interfaceC12341a6;
        this.f29141g = interfaceC12341a7;
        this.f29142h = interfaceC12341a8;
    }

    /* renamed from: a */
    public static C11356d m5355a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8) {
        return new C11356d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8);
    }

    /* renamed from: c */
    public static ChangePinViewModel m5353c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager) {
        return new ChangePinViewModel(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
    }

    /* renamed from: b */
    public ChangePinViewModel m5354b(C1459l0 c1459l0) {
        ChangePinViewModel m5353c = m5353c(c1459l0, this.f29135a.mo42226get(), this.f29136b.mo42226get(), this.f29137c.mo42226get(), this.f29138d.mo42226get(), this.f29139e.mo42226get(), this.f29140f.mo42226get(), this.f29141g.mo42226get());
        C13886p.m94a(m5353c, this.f29142h.mo42226get());
        return m5353c;
    }
}
