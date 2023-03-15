package mk;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.PhoneManager;
import mg.PinRecoveryManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: mk.n */
/* loaded from: classes2.dex */
public final class C7502n {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f19831a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f19832b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f19833c;

    /* renamed from: d */
    private final InterfaceC12341a<BiometricsManager> f19834d;

    /* renamed from: e */
    private final InterfaceC12341a<OAuthManager> f19835e;

    /* renamed from: f */
    private final InterfaceC12341a<PhoneManager> f19836f;

    /* renamed from: g */
    private final InterfaceC12341a<PinRecoveryManager> f19837g;

    /* renamed from: h */
    private final InterfaceC12341a<AnalyticsManager> f19838h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f19839i;

    public C7502n(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<PhoneManager> interfaceC12341a6, InterfaceC12341a<PinRecoveryManager> interfaceC12341a7, InterfaceC12341a<AnalyticsManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        this.f19831a = interfaceC12341a;
        this.f19832b = interfaceC12341a2;
        this.f19833c = interfaceC12341a3;
        this.f19834d = interfaceC12341a4;
        this.f19835e = interfaceC12341a5;
        this.f19836f = interfaceC12341a6;
        this.f19837g = interfaceC12341a7;
        this.f19838h = interfaceC12341a8;
        this.f19839i = interfaceC12341a9;
    }

    /* renamed from: a */
    public static C7502n m18335a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<PhoneManager> interfaceC12341a6, InterfaceC12341a<PinRecoveryManager> interfaceC12341a7, InterfaceC12341a<AnalyticsManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        return new C7502n(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9);
    }

    /* renamed from: c */
    public static ValidatePinForUpdatePhoneViewModel m18333c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, OAuthManager oAuthManager, PhoneManager phoneManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        return new ValidatePinForUpdatePhoneViewModel(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, oAuthManager, phoneManager, pinRecoveryManager, analyticsManager);
    }

    /* renamed from: b */
    public ValidatePinForUpdatePhoneViewModel m18334b(C1459l0 c1459l0) {
        ValidatePinForUpdatePhoneViewModel m18333c = m18333c(c1459l0, this.f19831a.mo42226get(), this.f19832b.mo42226get(), this.f19833c.mo42226get(), this.f19834d.mo42226get(), this.f19835e.mo42226get(), this.f19836f.mo42226get(), this.f19837g.mo42226get(), this.f19838h.mo42226get());
        C13886p.m94a(m18333c, this.f19839i.mo42226get());
        return m18333c;
    }
}
