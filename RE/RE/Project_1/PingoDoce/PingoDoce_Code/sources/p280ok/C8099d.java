package p280ok;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.EncryptedPrefsManager;
import mg.PinRecoveryManager;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p445xc.InterfaceC12341a;
import p494zh.C13886p;

/* renamed from: ok.d */
/* loaded from: classes2.dex */
public final class C8099d {

    /* renamed from: a */
    private final InterfaceC12341a<ResourcesProvider> f20932a;

    /* renamed from: b */
    private final InterfaceC12341a<AuthManager> f20933b;

    /* renamed from: c */
    private final InterfaceC12341a<C0577e> f20934c;

    /* renamed from: d */
    private final InterfaceC12341a<BiometricsManager> f20935d;

    /* renamed from: e */
    private final InterfaceC12341a<OAuthManager> f20936e;

    /* renamed from: f */
    private final InterfaceC12341a<EncryptedPrefsManager> f20937f;

    /* renamed from: g */
    private final InterfaceC12341a<PinRecoveryManager> f20938g;

    /* renamed from: h */
    private final InterfaceC12341a<AnalyticsManager> f20939h;

    /* renamed from: i */
    private final InterfaceC12341a<C7405s1> f20940i;

    /* renamed from: j */
    private final InterfaceC12341a<C7405s1> f20941j;

    public C8099d(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a6, InterfaceC12341a<PinRecoveryManager> interfaceC12341a7, InterfaceC12341a<AnalyticsManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        this.f20932a = interfaceC12341a;
        this.f20933b = interfaceC12341a2;
        this.f20934c = interfaceC12341a3;
        this.f20935d = interfaceC12341a4;
        this.f20936e = interfaceC12341a5;
        this.f20937f = interfaceC12341a6;
        this.f20938g = interfaceC12341a7;
        this.f20939h = interfaceC12341a8;
        this.f20940i = interfaceC12341a9;
        this.f20941j = interfaceC12341a10;
    }

    /* renamed from: a */
    public static C8099d m16898a(InterfaceC12341a<ResourcesProvider> interfaceC12341a, InterfaceC12341a<AuthManager> interfaceC12341a2, InterfaceC12341a<C0577e> interfaceC12341a3, InterfaceC12341a<BiometricsManager> interfaceC12341a4, InterfaceC12341a<OAuthManager> interfaceC12341a5, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a6, InterfaceC12341a<PinRecoveryManager> interfaceC12341a7, InterfaceC12341a<AnalyticsManager> interfaceC12341a8, InterfaceC12341a<C7405s1> interfaceC12341a9, InterfaceC12341a<C7405s1> interfaceC12341a10) {
        return new C8099d(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5, interfaceC12341a6, interfaceC12341a7, interfaceC12341a8, interfaceC12341a9, interfaceC12341a10);
    }

    /* renamed from: c */
    public static RecoverPinViewModel m16896c(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, OAuthManager oAuthManager, EncryptedPrefsManager encryptedPrefsManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        return new RecoverPinViewModel(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, oAuthManager, encryptedPrefsManager, pinRecoveryManager, analyticsManager, c7405s1);
    }

    /* renamed from: b */
    public RecoverPinViewModel m16897b(C1459l0 c1459l0) {
        RecoverPinViewModel m16896c = m16896c(c1459l0, this.f20932a.mo42226get(), this.f20933b.mo42226get(), this.f20934c.mo42226get(), this.f20935d.mo42226get(), this.f20936e.mo42226get(), this.f20937f.mo42226get(), this.f20938g.mo42226get(), this.f20939h.mo42226get(), this.f20940i.mo42226get());
        C13886p.m94a(m16896c, this.f20941j.mo42226get());
        return m16896c;
    }
}
