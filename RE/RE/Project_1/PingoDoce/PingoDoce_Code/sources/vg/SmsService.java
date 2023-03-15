package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.NotEmptyValidationException;
import p339rg.PortugueseMobilePhoneValidationException;
import p339rg.SmsCodeAlreadyValidatedError;
import p339rg.SmsCodeExpiredError;
import p339rg.SmsCodeValidationAppException;
import p339rg.SmsDebounceError;
import p339rg.UserNotFoundException;
import p339rg.UserReachedMaxRetriesException;
import p339rg.UserUpdateException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.SmsApi;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.SendSmsRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateSmsRequest;
import retrofit2.Retrofit;
import ve.NoAccessException;

/* renamed from: vg.e0 */
/* loaded from: classes2.dex */
public final class SmsService extends BaseService {

    /* renamed from: d */
    private final SmsApi f28895d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.SmsService$sendSmsToken$2", m20196f = "SmsService.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: vg.e0$a */
    /* loaded from: classes2.dex */
    public static final class C11275a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28896x;

        /* renamed from: z */
        final /* synthetic */ SendSmsRequest f28898z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11275a(SendSmsRequest sendSmsRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28898z = sendSmsRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11275a(this.f28898z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11275a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28896x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsApi m5554l = SmsService.m5554l(SmsService.this);
                SendSmsRequest sendSmsRequest = this.f28898z;
                this.f28896x = 1;
                obj = m5554l.sendSmsToken(sendSmsRequest, this);
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
    /* compiled from: SmsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.SmsService$validateSmsAndGetPmCards$2", m20196f = "SmsService.kt", m20195l = {35}, m20194m = "invokeSuspend")
    /* renamed from: vg.e0$b */
    /* loaded from: classes2.dex */
    public static final class C11276b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28899x;

        /* renamed from: z */
        final /* synthetic */ ValidateSmsRequest f28901z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11276b(ValidateSmsRequest validateSmsRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28901z = validateSmsRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11276b(this.f28901z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11276b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28899x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsApi m5554l = SmsService.m5554l(SmsService.this);
                ValidateSmsRequest validateSmsRequest = this.f28901z;
                this.f28899x = 1;
                obj = m5554l.validateSmsAndGetPmCards(validateSmsRequest, this);
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
    /* compiled from: SmsService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.SmsService$verifyNumber$2", m20196f = "SmsService.kt", m20195l = {27}, m20194m = "invokeSuspend")
    /* renamed from: vg.e0$c */
    /* loaded from: classes2.dex */
    public static final class C11277c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28902x;

        /* renamed from: z */
        final /* synthetic */ PhoneRequest f28904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11277c(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28904z = phoneRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11277c(this.f28904z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11277c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28902x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsApi m5554l = SmsService.m5554l(SmsService.this);
                PhoneRequest phoneRequest = this.f28904z;
                this.f28902x = 1;
                obj = m5554l.verifyNumber(phoneRequest, this);
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
    public SmsService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28895d = (SmsApi) retrofit.create(SmsApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ SmsApi m5554l(SmsService smsService) {
        return smsService.f28895d;
    }

    /* renamed from: k */
    protected ApiBaseException m5555k(String str, int i) {
        ApiBaseException notEmptyValidationException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 1002) {
            notEmptyValidationException = new NotEmptyValidationException(new ApiError(str));
        } else if (i == 1022) {
            notEmptyValidationException = new PortugueseMobilePhoneValidationException(new ApiError(str));
        } else if (i == 2000) {
            notEmptyValidationException = new NoAccessException(new ApiError(str));
        } else if (i == 5000) {
            notEmptyValidationException = new UserNotFoundException(new ApiError(str));
        } else if (i == 5002) {
            notEmptyValidationException = new UserUpdateException(new ApiError(str));
        } else if (i == 5010) {
            notEmptyValidationException = new UserReachedMaxRetriesException(new ApiError(str));
        } else if (i != 5104) {
            switch (i) {
                case 5100:
                    notEmptyValidationException = new SmsCodeValidationAppException(new ApiError(str));
                    break;
                case 5101:
                    notEmptyValidationException = new SmsCodeExpiredError(new ApiError(str));
                    break;
                case 5102:
                    notEmptyValidationException = new SmsCodeAlreadyValidatedError(new ApiError(str));
                    break;
                default:
                    return super.m5556k(str, i);
            }
        } else {
            notEmptyValidationException = new SmsDebounceError(new ApiError(str));
        }
        return notEmptyValidationException;
    }

    /* renamed from: m */
    public final Object m5553m(SendSmsRequest sendSmsRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11275a(sendSmsRequest, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5552n(ValidateSmsRequest validateSmsRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11276b(validateSmsRequest, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5551o(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11277c(phoneRequest, null), interfaceC1886d);
    }
}
