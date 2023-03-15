package al;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.PinRecoveryManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p014aj.NewPinViewModel;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.C13878n1;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import td.InterfaceC10524i0;

/* renamed from: al.c */
/* loaded from: classes2.dex */
public final class CreatePinViewModel extends NewPinViewModel {

    /* renamed from: e0 */
    private final AnalyticsManager f446e0;

    /* renamed from: f0 */
    private final C7405s1 f447f0;

    /* compiled from: CreatePinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.pin.CreatePinViewModel$submitRequest$1", m20196f = "CreatePinViewModel.kt", m20195l = {64}, m20194m = "invokeSuspend")
    /* renamed from: al.c$a */
    /* loaded from: classes2.dex */
    static final class C0203a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f448x;

        /* renamed from: z */
        final /* synthetic */ OnboardingFlowData f450z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0203a(OnboardingFlowData onboardingFlowData, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f450z = onboardingFlowData;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0203a(this.f450z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0203a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f448x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7405s1 m41586g1 = CreatePinViewModel.m41586g1(CreatePinViewModel.this);
                this.f448x = 1;
                if (m41586g1.m18493q(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            CreatePinViewModel.this.m120B(C13878n1.f34993a, this.f450z);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, authManager, c0577e, pinRecoveryManager, oAuthManager, biometricsManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f446e0 = analyticsManager;
        this.f447f0 = c7405s1;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7800g0.f20424b, null, null, null, 14, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7833r0.f20457b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: g1 */
    public static final /* synthetic */ C7405s1 m41586g1(CreatePinViewModel createPinViewModel) {
        return createPinViewModel.f447f0;
    }

    /* renamed from: a */
    public String mo10002a() {
        return ((OnboardingFlowData) m34578S()).m14723b();
    }

    /* renamed from: f1 */
    public void m41587f1(String str) {
        Intrinsics.isThisObjectNull(str, "newPin");
        InterfaceC7886d.C7887a.m17629a(this.f446e0, AnalyticEvents.AbstractC7780f.C7848w0.f20472b, EnumC7885c.Error, EnumC7884b.View, null, 8, null);
        OnboardingFlowData m14720f = OnboardingFlowData.m14720f((OnboardingFlowData) m34578S(), null, str, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524285, null);
        m34576U(m14720f);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C0203a(m14720f, null), 3, null);
    }

    /* renamed from: h1 */
    public final void m41585h1() {
        if (m41693a1().mo172f() == NewPinViewModel.EnumC0171a.PASSWORD_CREATION) {
            InterfaceC7886d.C7887a.m17629a(this.f446e0, AnalyticEvents.AbstractC7780f.C7836s0.f20460b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(this.f446e0, AnalyticEvents.AbstractC7780f.C7845v0.f20469b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
    }
}
