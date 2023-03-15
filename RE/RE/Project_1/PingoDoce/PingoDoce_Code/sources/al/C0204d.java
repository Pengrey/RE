package al;

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

/* renamed from: al.d */
/* loaded from: classes2.dex */
public final class C0204d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f451a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f452b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f453c;

    /* renamed from: d */
    private final InterfaceC12341a<BiometricsManager> f454d;

    /* renamed from: e */
    private final InterfaceC12341a<PinRecoveryManager> f455e;

    /* renamed from: f */
    private final InterfaceC12341a<OAuthManager> f456f;

    /* renamed from: g */
    private final InterfaceC12341a<AnalyticsManager> f457g;

    /* renamed from: h */
    private final InterfaceC12341a<C7405s1> f458h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f459i;

    public C0204d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        this.f451a = interfaceC12341a;
        this.f452b = interfaceC12341a2;
        this.f453c = interfaceC12341a3;
        this.f454d = interfaceC12341a4;
        this.f455e = interfaceC12341a5;
        this.f456f = interfaceC12341a6;
        this.f457g = interfaceC12341a7;
        this.f458h = interfaceC12341a8;
        this.f459i = interfaceC12341a9;
    }

    /* renamed from: a */
    public static C0204d m41583a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<PinRecoveryManager> interfaceC12341a5, InterfaceC12341a<OAuthManager> interfaceC12341a6, InterfaceC12341a<AnalyticsManager> interfaceC12341a7, InterfaceC12341a<C7405s1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9) {
        return new C0204d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9);
    }

    /* renamed from: c */
    public static CreatePinViewModel m41581c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        return new CreatePinViewModel(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager, c7405s1);
    }

    /* renamed from: b */
    public CreatePinViewModel m41582b(C1459l0 c1459l0) {
        CreatePinViewModel m41581c = m41581c(c1459l0, this.f451a.mo42226get(), this.f452b.mo42226get(), this.f453c.mo42226get(), this.f454d.mo42226get(), this.f455e.mo42226get(), this.f456f.mo42226get(), this.f457g.mo42226get(), this.f458h.mo42226get());
        C13886p.m94a(m41581c, this.f459i.mo42226get());
        return m41581c;
    }
}
