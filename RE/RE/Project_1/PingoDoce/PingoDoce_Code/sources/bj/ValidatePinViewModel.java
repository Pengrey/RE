package bj;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.PinRecoveryManager;
import p014aj.AbstractC0188n;
import p014aj.EnumC0170a;
import p181jd.Intrinsics;
import p276og.Result;
import p339rg.PinInvalidException;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.ValidatePinFlowData;
import td.InterfaceC10524i0;

/* renamed from: bj.b */
/* loaded from: classes2.dex */
public abstract class ValidatePinViewModel extends AbstractC0188n {

    /* compiled from: ValidatePinViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.pin.validate.ValidatePinViewModel$onPinCompleted$1", m20196f = "ValidatePinViewModel.kt", m20195l = {51}, m20194m = "invokeSuspend")
    /* renamed from: bj.b$a */
    /* loaded from: classes2.dex */
    static final class C1926a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f5683x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ValidatePinViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.pin.validate.ValidatePinViewModel$onPinCompleted$1$1", m20196f = "ValidatePinViewModel.kt", m20195l = {52}, m20194m = "invokeSuspend")
        /* renamed from: bj.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C1927a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f5685x;

            /* renamed from: y */
            final /* synthetic */ ValidatePinViewModel f5686y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1927a(ValidatePinViewModel validatePinViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f5686y = validatePinViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C1927a(this.f5686y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C1927a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f5685x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AuthManager m35133S0 = ValidatePinViewModel.m35133S0(this.f5686y);
                    T mo172f = this.f5686y.m41610v0().mo172f();
                    Intrinsics.ifNullDoSomething(mo172f);
                    this.f5685x = 1;
                    obj = m35133S0.m18896D((String) mo172f, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    this.f5686y.m34576U(new ValidatePinFlowData((String) ((Result.C8078c) result).m16962b()));
                    ValidatePinViewModel.m35126Z0(this.f5686y, EnumC0170a.Authenticated);
                } else if (result instanceof Result.C8077b) {
                    Result.C8077b c8077b = (Result.C8077b) result;
                    if (c8077b.m16964b() instanceof PinInvalidException) {
                        ValidatePinViewModel.m35132T0(this.f5686y).mo166p(c8077b.m16964b().getMessage());
                        ValidatePinViewModel.m35127Y0(this.f5686y, true);
                    } else {
                        ValidatePinViewModel.m35127Y0(this.f5686y, false);
                        ValidatePinViewModel.m35130V0(this.f5686y, c8077b.m16964b());
                    }
                    ValidatePinViewModel.m35131U0(this.f5686y);
                    ValidatePinViewModel.m35126Z0(this.f5686y, EnumC0170a.InvalidAuthentication);
                }
                ValidatePinViewModel.m35129W0(this.f5686y);
                return C13195u.f34156a;
            }
        }

        C1926a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C1926a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C1926a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f5683x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ValidatePinViewModel validatePinViewModel = ValidatePinViewModel.this;
                C1927a c1927a = new C1927a(validatePinViewModel, null);
                this.f5683x = 1;
                if (ValidatePinViewModel.m35128X0(validatePinViewModel, true, c1927a, this) == m34636d) {
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
    public ValidatePinViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, PinRecoveryManager pinRecoveryManager, OAuthManager oAuthManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        C1436e0 m41648G0 = m41648G0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m41648G0.mo166p(string);
        C1436e0 m41649F0 = m41649F0();
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_pin_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m41649F0.mo166p(string2);
        C1436e0 m41653B0 = m41653B0();
        String string3 = resourcesProvider.m6899a().getString(C2336R.string.error_input_pin_invalid);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        m41653B0.mo166p(string3);
        m41650E0().mo166p(Boolean.FALSE);
        m41651D0().mo166p(Boolean.TRUE);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ AuthManager m35133S0(ValidatePinViewModel validatePinViewModel) {
        return validatePinViewModel.m41618n0();
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C1436e0 m35132T0(ValidatePinViewModel validatePinViewModel) {
        return validatePinViewModel.m41653B0();
    }

    /* renamed from: U0 */
    public static final /* synthetic */ void m35131U0(ValidatePinViewModel validatePinViewModel) {
        validatePinViewModel.m41647H0();
    }

    /* renamed from: V0 */
    public static final /* synthetic */ void m35130V0(ValidatePinViewModel validatePinViewModel, Throwable th2) {
        validatePinViewModel.m109l(th2);
    }

    /* renamed from: W0 */
    public static final /* synthetic */ void m35129W0(ValidatePinViewModel validatePinViewModel) {
        validatePinViewModel.m41643L0();
    }

    /* renamed from: X0 */
    public static final /* synthetic */ Object m35128X0(ValidatePinViewModel validatePinViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return validatePinViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ void m35127Y0(ValidatePinViewModel validatePinViewModel, boolean z) {
        validatePinViewModel.m41638Q0(z);
    }

    /* renamed from: Z0 */
    public static final /* synthetic */ void m35126Z0(ValidatePinViewModel validatePinViewModel, EnumC0170a enumC0170a) {
        validatePinViewModel.m41637R0(enumC0170a);
    }

    /* renamed from: K0 */
    public void m35134K0(String str) {
        Intrinsics.isThisObjectNull(str, "input");
        m41637R0(EnumC0170a.Undefined);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C1926a(null), 3, null);
    }

    /* renamed from: a */
    public String mo10002a() {
        return BuildConfig.VERSION_NAME;
    }
}
