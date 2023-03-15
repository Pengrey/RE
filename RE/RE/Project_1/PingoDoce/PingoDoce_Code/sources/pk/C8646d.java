package pk;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7256f1;
import mg.C7405s1;
import mg.PinRecoveryManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: pk.d */
/* loaded from: classes2.dex */
public final class C8646d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f22297a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f22298b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f22299c;

    /* renamed from: d */
    private final InterfaceC12341a<PinRecoveryManager> f22300d;

    /* renamed from: e */
    private final InterfaceC12341a<OAuthManager> f22301e;

    /* renamed from: f */
    private final InterfaceC12341a<AnalyticsManager> f22302f;

    /* renamed from: g */
    private final InterfaceC12341a<BiometricsManager> f22303g;

    /* renamed from: h */
    private final InterfaceC12341a<C7256f1> f22304h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f22305i;

    /* renamed from: j */
    private final InterfaceC12341a<C7405s1> f22306j;

    public C8646d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<PinRecoveryManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<AnalyticsManager> interfaceC12341a6, InterfaceC12341a<BiometricsManager> interfaceC12341a7, InterfaceC12341a<C7256f1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        this.f22297a = interfaceC12341a;
        this.f22298b = interfaceC12341a2;
        this.f22299c = interfaceC12341a3;
        this.f22300d = interfaceC12341a4;
        this.f22301e = interfaceC12341a5;
        this.f22302f = interfaceC12341a6;
        this.f22303g = interfaceC12341a7;
        this.f22304h = interfaceC12341a8;
        this.f22305i = interfaceC12341a9;
        this.f22306j = interfaceC12341a10;
    }

    /* renamed from: a */
    public static C8646d m14908a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<PinRecoveryManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<AnalyticsManager> interfaceC12341a6, InterfaceC12341a<BiometricsManager> interfaceC12341a7, InterfaceC12341a<C7256f1> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        return new C8646d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10);
    }

    /* renamed from: c */
    public static InsertPinViewModel m14906c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, BiometricsManager biometricsManager, C7256f1 c7256f1, C7405s1 c7405s1) {
        return new InsertPinViewModel(c1459l0, resourcesProvider, authManager, c0577e, pinRecoveryManager, oAuthManager, analyticsManager, biometricsManager, c7256f1, c7405s1);
    }

    /* renamed from: b */
    public InsertPinViewModel m14907b(C1459l0 c1459l0) {
        InsertPinViewModel m14906c = m14906c(c1459l0, this.f22297a.mo42226get(), this.f22298b.mo42226get(), this.f22299c.mo42226get(), this.f22300d.mo42226get(), this.f22301e.mo42226get(), this.f22302f.mo42226get(), this.f22303g.mo42226get(), this.f22304h.mo42226get(), this.f22305i.mo42226get());
        C13886p.m94a(m14906c, this.f22306j.mo42226get());
        return m14906c;
    }
}
