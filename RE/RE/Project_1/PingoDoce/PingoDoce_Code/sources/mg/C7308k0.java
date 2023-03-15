package mg;

import p066dg.UserProfileAgent;
import p370te.OAuthManager;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import pg.OnboardingFlowDataSharedPreferences;
import vg.OnboardingService;

/* renamed from: mg.k0 */
/* loaded from: classes2.dex */
public final class C7308k0 implements InterfaceC11614c<C7296j0> {

    /* renamed from: a */
    private final InterfaceC12341a<OnboardingService> f19374a;

    /* renamed from: b */
    private final InterfaceC12341a<OAuthManager> f19375b;

    /* renamed from: c */
    private final InterfaceC12341a<EncryptedPrefsManager> f19376c;

    /* renamed from: d */
    private final InterfaceC12341a<OnboardingFlowDataSharedPreferences> f19377d;

    /* renamed from: e */
    private final InterfaceC12341a<UserProfileAgent> f19378e;

    public C7308k0(InterfaceC12341a<OnboardingService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3, InterfaceC12341a<OnboardingFlowDataSharedPreferences> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5) {
        this.f19374a = interfaceC12341a;
        this.f19375b = interfaceC12341a2;
        this.f19376c = interfaceC12341a3;
        this.f19377d = interfaceC12341a4;
        this.f19378e = interfaceC12341a5;
    }

    /* renamed from: a */
    public static C7308k0 m18748a(InterfaceC12341a<OnboardingService> interfaceC12341a, InterfaceC12341a<OAuthManager> interfaceC12341a2, InterfaceC12341a<EncryptedPrefsManager> interfaceC12341a3, InterfaceC12341a<OnboardingFlowDataSharedPreferences> interfaceC12341a4, InterfaceC12341a<UserProfileAgent> interfaceC12341a5) {
        return new C7308k0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4, interfaceC12341a5);
    }

    /* renamed from: c */
    public static C7296j0 m18746c(OnboardingService onboardingService, OAuthManager oAuthManager, EncryptedPrefsManager encryptedPrefsManager, OnboardingFlowDataSharedPreferences onboardingFlowDataSharedPreferences, UserProfileAgent userProfileAgent) {
        return new C7296j0(onboardingService, oAuthManager, encryptedPrefsManager, onboardingFlowDataSharedPreferences, userProfileAgent);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public C7296j0 mo42226get() {
        return m18746c(this.f19374a.mo42226get(), this.f19375b.mo42226get(), this.f19376c.mo42226get(), this.f19377d.mo42226get(), this.f19378e.mo42226get());
    }
}
