package p277oh;

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

/* renamed from: oh.d */
/* loaded from: classes2.dex */
public final class C8086d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20888a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f20889b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f20890c;

    /* renamed from: d */
    private final InterfaceC12341a<BiometricsManager> f20891d;

    /* renamed from: e */
    private final InterfaceC12341a<PinRecoveryManager> f20892e;

    /* renamed from: f */
    private final InterfaceC12341a<OAuthManager> f20893f;

    /* renamed from: g */
    private final InterfaceC12341a<AnalyticsManager> f20894g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f20895h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f20896i;

    public C8086d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        this.f20888a = interfaceC12341a;
        this.f20889b = interfaceC12341a2;
        this.f20890c = interfaceC12341a3;
        this.f20891d = interfaceC12341a4;
        this.f20892e = interfaceC12341a5;
        this.f20893f = interfaceC12341a6;
        this.f20894g = interfaceC12341a7;
        this.f20895h = interfaceC12341a8;
        this.f20896i = interfaceC12341a9;
    }

    /* renamed from: a */
    public static C8086d m16949a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        return new C8086d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9);
    }

    /* renamed from: c */
    public static DeleteAccountViewModel m16947c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        return new DeleteAccountViewModel(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager, c7405s1);
    }

    /* renamed from: b */
    public DeleteAccountViewModel m16948b(C1459l0 c1459l0) {
        DeleteAccountViewModel m16947c = m16947c(c1459l0, this.f20888a.mo42226get(), this.f20889b.mo42226get(), this.f20890c.mo42226get(), this.f20891d.mo42226get(), this.f20892e.mo42226get(), this.f20893f.mo42226get(), this.f20894g.mo42226get(), this.f20895h.mo42226get());
        C13886p.m94a(m16947c, this.f20896i.mo42226get());
        return m16947c;
    }
}
