package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.UserAddingPasswordException;
import p339rg.UserChangePasswordTokenException;
import p339rg.UserEmailAlreadyExistsException;
import p339rg.UserEmailNotConfirmedException;
import p339rg.UserEmailNotRegisteredException;
import p339rg.UserRemovingPasswordException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.PinRecoveryApi;
import pt.pingodoce.app.data.remote.models.request.ChangePinSmsRequest;
import pt.pingodoce.app.data.remote.models.request.RecoveryPinRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateSmsCodeRequest;
import retrofit2.Retrofit;

/* renamed from: vg.y */
/* loaded from: classes2.dex */
public final class PinRecoveryService extends BaseService {

    /* renamed from: d */
    private final PinRecoveryApi f29120d;

    /* renamed from: e */
    private final PinRecoveryApi f29121e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoveryService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PinRecoveryService$changePin$2", m20196f = "PinRecoveryService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.y$a */
    /* loaded from: classes2.dex */
    public static final class C11351a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29122x;

        /* renamed from: z */
        final /* synthetic */ ChangePinSmsRequest f29124z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11351a(ChangePinSmsRequest changePinSmsRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29124z = changePinSmsRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11351a(this.f29124z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11351a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29122x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryApi m5368l = PinRecoveryService.m5368l(PinRecoveryService.this);
                ChangePinSmsRequest changePinSmsRequest = this.f29124z;
                this.f29122x = 1;
                obj = m5368l.changePin(changePinSmsRequest, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoveryService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PinRecoveryService$sendPinRecoveryEmail$2", m20196f = "PinRecoveryService.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: vg.y$b */
    /* loaded from: classes2.dex */
    public static final class C11352b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29125x;

        /* renamed from: z */
        final /* synthetic */ RecoveryPinRequest f29127z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11352b(RecoveryPinRequest recoveryPinRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29127z = recoveryPinRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11352b(this.f29127z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11352b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29125x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryApi m5367m = PinRecoveryService.m5367m(PinRecoveryService.this);
                RecoveryPinRequest recoveryPinRequest = this.f29127z;
                this.f29125x = 1;
                obj = m5367m.recoverPin(recoveryPinRequest, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoveryService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PinRecoveryService$validateSmsCode$2", m20196f = "PinRecoveryService.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: vg.y$c */
    /* loaded from: classes2.dex */
    public static final class C11353c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29128x;

        /* renamed from: z */
        final /* synthetic */ ValidateSmsCodeRequest f29130z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11353c(ValidateSmsCodeRequest validateSmsCodeRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29130z = validateSmsCodeRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11353c(this.f29130z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11353c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29128x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoveryApi m5368l = PinRecoveryService.m5368l(PinRecoveryService.this);
                ValidateSmsCodeRequest validateSmsCodeRequest = this.f29130z;
                this.f29128x = 1;
                obj = m5368l.validateSmsCode(validateSmsCodeRequest, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinRecoveryService(Retrofit retrofit, Retrofit retrofit3, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(retrofit3, "retrofitWithoutHeaders");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29120d = (PinRecoveryApi) retrofit.create(PinRecoveryApi.class);
        this.f29121e = (PinRecoveryApi) retrofit3.create(PinRecoveryApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ PinRecoveryApi m5368l(PinRecoveryService pinRecoveryService) {
        return pinRecoveryService.f29120d;
    }

    /* renamed from: m */
    public static final /* synthetic */ PinRecoveryApi m5367m(PinRecoveryService pinRecoveryService) {
        return pinRecoveryService.f29121e;
    }

    /* renamed from: k */
    protected ApiBaseException m5369k(String str, int i) {
        ApiBaseException userAddingPasswordException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i != 5009) {
            switch (i) {
                case 5014:
                    userAddingPasswordException = new UserEmailNotConfirmedException(new ApiError(str));
                    break;
                case 5015:
                    userAddingPasswordException = new UserEmailNotRegisteredException(new ApiError(str));
                    break;
                case 5016:
                    userAddingPasswordException = new UserEmailAlreadyExistsException(new ApiError(str));
                    break;
                case 5017:
                    userAddingPasswordException = new UserRemovingPasswordException(new ApiError(str));
                    break;
                case 5018:
                    userAddingPasswordException = new UserChangePasswordTokenException(new ApiError(str));
                    break;
                default:
                    return super.m5556k(str, i);
            }
        } else {
            userAddingPasswordException = new UserAddingPasswordException(new ApiError(str));
        }
        return userAddingPasswordException;
    }

    /* renamed from: n */
    public final Object m5366n(ChangePinSmsRequest changePinSmsRequest, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11351a(changePinSmsRequest, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: o */
    public final Object m5365o(RecoveryPinRequest recoveryPinRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11352b(recoveryPinRequest, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5364p(ValidateSmsCodeRequest validateSmsCodeRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11353c(validateSmsCodeRequest, null), interfaceC1886d);
    }
}
