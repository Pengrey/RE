package p277oh;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import bj.ValidatePinViewModel;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.PinRecoveryManager;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13877n0;
import pt.pingodoce.app.data.local.flows.ValidatePinFlowData;
import td.InterfaceC10524i0;

/* renamed from: oh.c */
/* loaded from: classes2.dex */
public final class DeleteAccountViewModel extends ValidatePinViewModel {

    /* renamed from: W */
    private final C7405s1 f20883W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeleteAccountViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.delete.DeleteLoggedAccountViewModel$deleteAccount$1", m20196f = "DeleteAccountViewModel.kt", m20195l = {37}, m20194m = "invokeSuspend")
    /* renamed from: oh.c$a */
    /* loaded from: classes2.dex */
    public static final class C8084a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f20884x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeleteAccountViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.delete.DeleteLoggedAccountViewModel$deleteAccount$1$1", m20196f = "DeleteAccountViewModel.kt", m20195l = {38, 39}, m20194m = "invokeSuspend")
        /* renamed from: oh.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C8085a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f20886x;

            /* renamed from: y */
            final /* synthetic */ DeleteAccountViewModel f20887y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8085a(DeleteAccountViewModel deleteAccountViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f20887y = deleteAccountViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8085a(this.f20887y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8085a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f20886x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7405s1 m16954b1 = DeleteAccountViewModel.m16954b1(this.f20887y);
                    String m14681a = ((ValidatePinFlowData) this.f20887y.m34578S()).m14681a();
                    this.f20886x = 1;
                    if (m16954b1.m18507c(m14681a, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13186n.m1453b(obj);
                    BaseViewModel.m119C(this.f20887y, C13877n0.f34992a, null, 2, null);
                    return C13195u.f34156a;
                } else {
                    C13186n.m1453b(obj);
                }
                AuthManager m16955a1 = DeleteAccountViewModel.m16955a1(this.f20887y);
                this.f20886x = 2;
                if (m16955a1.m18885k(this) == m34636d) {
                    return m34636d;
                }
                BaseViewModel.m119C(this.f20887y, C13877n0.f34992a, null, 2, null);
                return C13195u.f34156a;
            }
        }

        C8084a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8084a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8084a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f20884x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DeleteAccountViewModel deleteAccountViewModel = DeleteAccountViewModel.this;
                C8085a c8085a = new C8085a(deleteAccountViewModel, null);
                this.f20884x = 1;
                if (DeleteAccountViewModel.m16953c1(deleteAccountViewModel, true, c8085a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f20883W = c7405s1;
    }

    /* renamed from: a1 */
    public static final /* synthetic */ AuthManager m16955a1(DeleteAccountViewModel deleteAccountViewModel) {
        return deleteAccountViewModel.m41618n0();
    }

    /* renamed from: b1 */
    public static final /* synthetic */ C7405s1 m16954b1(DeleteAccountViewModel deleteAccountViewModel) {
        return deleteAccountViewModel.f20883W;
    }

    /* renamed from: c1 */
    public static final /* synthetic */ Object m16953c1(DeleteAccountViewModel deleteAccountViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return deleteAccountViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: d1 */
    public final void m16952d1() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8084a(null), 3, null);
    }
}
