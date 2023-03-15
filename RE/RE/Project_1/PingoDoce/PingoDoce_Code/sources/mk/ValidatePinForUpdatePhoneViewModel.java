package mk;

import androidx.biometric.C0577e;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AnalyticsManager;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.PhoneManager;
import mg.PinRecoveryManager;
import p014aj.AbstractC0188n;
import p014aj.EnumC0170a;
import p181jd.Intrinsics;
import p276og.Result;
import p370te.OAuthManager;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;
import td.InterfaceC10524i0;

/* renamed from: mk.m */
/* loaded from: classes2.dex */
public final class ValidatePinForUpdatePhoneViewModel extends AbstractC0188n {

    /* renamed from: W */
    private final PhoneManager f19826W;

    /* compiled from: ValidatePinForUpdatePhoneViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneViewModel$onPinCompleted$1", m20196f = "ValidatePinForUpdatePhoneViewModel.kt", m20195l = {57}, m20194m = "invokeSuspend")
    /* renamed from: mk.m$a */
    /* loaded from: classes2.dex */
    static final class C7500a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19827x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ValidatePinForUpdatePhoneViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.update.ValidatePinForUpdatePhoneViewModel$onPinCompleted$1$1", m20196f = "ValidatePinForUpdatePhoneViewModel.kt", m20195l = {58}, m20194m = "invokeSuspend")
        /* renamed from: mk.m$a$a */
        /* loaded from: classes2.dex */
        public static final class C7501a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f19829x;

            /* renamed from: y */
            final /* synthetic */ ValidatePinForUpdatePhoneViewModel f19830y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7501a(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f19830y = validatePinForUpdatePhoneViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7501a(this.f19830y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7501a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f19829x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PhoneManager m18343S0 = ValidatePinForUpdatePhoneViewModel.m18343S0(this.f19830y);
                    String m14685b = ((UpdatePhoneFlowData) this.f19830y.m34578S()).m14685b();
                    T mo172f = this.f19830y.m41610v0().mo172f();
                    Intrinsics.ifNullDoSomething(mo172f);
                    this.f19829x = 1;
                    obj = m18343S0.m18658f(m14685b, (String) mo172f, this);
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
                    this.f19830y.m34576U(new UpdatePhoneFlowData(null, ((UpdatePhoneFlowData) this.f19830y.m34578S()).m14685b(), ((UpdatePhoneFlowData) this.f19830y.m34578S()).m14686a(), 1, null));
                    ValidatePinForUpdatePhoneViewModel.m18338X0(this.f19830y, EnumC0170a.Authenticated);
                } else if (result instanceof Result.C8077b) {
                    ValidatePinForUpdatePhoneViewModel.m18342T0(this.f19830y);
                    ValidatePinForUpdatePhoneViewModel.m18339W0(this.f19830y, true);
                    ValidatePinForUpdatePhoneViewModel.m18338X0(this.f19830y, EnumC0170a.InvalidAuthentication);
                }
                ValidatePinForUpdatePhoneViewModel.m18341U0(this.f19830y);
                return C13195u.f34156a;
            }
        }

        C7500a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7500a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7500a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19827x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel = ValidatePinForUpdatePhoneViewModel.this;
                C7501a c7501a = new C7501a(validatePinForUpdatePhoneViewModel, null);
                this.f19827x = 1;
                if (ValidatePinForUpdatePhoneViewModel.m18340V0(validatePinForUpdatePhoneViewModel, true, c7501a, this) == m34636d) {
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
    public ValidatePinForUpdatePhoneViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, C0577e c0577e, BiometricsManager biometricsManager, OAuthManager oAuthManager, PhoneManager phoneManager, PinRecoveryManager pinRecoveryManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, authManager, c0577e, biometricsManager, pinRecoveryManager, oAuthManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(c0577e, "biometricManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(phoneManager, "phoneManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f19826W = phoneManager;
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
        m41650E0().mo166p(Boolean.TRUE);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ PhoneManager m18343S0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel) {
        return validatePinForUpdatePhoneViewModel.f19826W;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ void m18342T0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel) {
        validatePinForUpdatePhoneViewModel.m41647H0();
    }

    /* renamed from: U0 */
    public static final /* synthetic */ void m18341U0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel) {
        validatePinForUpdatePhoneViewModel.m41643L0();
    }

    /* renamed from: V0 */
    public static final /* synthetic */ Object m18340V0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return validatePinForUpdatePhoneViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: W0 */
    public static final /* synthetic */ void m18339W0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel, boolean z) {
        validatePinForUpdatePhoneViewModel.m41638Q0(z);
    }

    /* renamed from: X0 */
    public static final /* synthetic */ void m18338X0(ValidatePinForUpdatePhoneViewModel validatePinForUpdatePhoneViewModel, EnumC0170a enumC0170a) {
        validatePinForUpdatePhoneViewModel.m41637R0(enumC0170a);
    }

    /* renamed from: K0 */
    public void m18344K0(String str) {
        Intrinsics.isThisObjectNull(str, "input");
        m41637R0(EnumC0170a.Undefined);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7500a(null), 3, null);
    }

    /* renamed from: a */
    public String mo10002a() {
        return ((UpdatePhoneFlowData) m34578S()).m14685b();
    }
}
