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
import p339rg.SmsCodeValidationAppException;
import p339rg.UserCantSignInException;
import p339rg.UserNameOrPasswordInvalidException;
import p339rg.UserNotFoundException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.PhoneApi;
import pt.pingodoce.app.data.remote.models.request.ChangeNumberRequest;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.SendSmsRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateOwnerRequest;
import retrofit2.Retrofit;
import ve.NoAccessException;

/* renamed from: vg.w */
/* loaded from: classes2.dex */
public final class PhoneService extends BaseService {

    /* renamed from: d */
    private final PhoneApi f29102d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PhoneService$changeNumber$2", m20196f = "PhoneService.kt", m20195l = {38}, m20194m = "invokeSuspend")
    /* renamed from: vg.w$a */
    /* loaded from: classes2.dex */
    public static final class C11346a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f29103A;

        /* renamed from: x */
        int f29104x;

        /* renamed from: z */
        final /* synthetic */ String f29106z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11346a(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29106z = str;
            this.f29103A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11346a(this.f29106z, this.f29103A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11346a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29104x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneApi m5381l = PhoneService.m5381l(PhoneService.this);
                ChangeNumberRequest changeNumberRequest = new ChangeNumberRequest(this.f29106z, this.f29103A);
                this.f29104x = 1;
                obj = m5381l.changeNumber(changeNumberRequest, this);
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
    /* compiled from: PhoneService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PhoneService$sendValidationSms$2", m20196f = "PhoneService.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: vg.w$b */
    /* loaded from: classes2.dex */
    public static final class C11347b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29107x;

        /* renamed from: z */
        final /* synthetic */ String f29109z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11347b(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29109z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11347b(this.f29109z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11347b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29107x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneApi m5381l = PhoneService.m5381l(PhoneService.this);
                SendSmsRequest sendSmsRequest = new SendSmsRequest(this.f29109z, null, 2, null);
                this.f29107x = 1;
                obj = m5381l.sendValidationSms(sendSmsRequest, this);
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
    /* compiled from: PhoneService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PhoneService$validateNumber$2", m20196f = "PhoneService.kt", m20195l = {26}, m20194m = "invokeSuspend")
    /* renamed from: vg.w$c */
    /* loaded from: classes2.dex */
    public static final class C11348c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29110x;

        /* renamed from: z */
        final /* synthetic */ PhoneRequest f29112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11348c(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29112z = phoneRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11348c(this.f29112z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11348c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29110x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneApi m5381l = PhoneService.m5381l(PhoneService.this);
                PhoneRequest phoneRequest = this.f29112z;
                this.f29110x = 1;
                obj = m5381l.validateNumber(phoneRequest, this);
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
    /* compiled from: PhoneService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.PhoneService$validateOwner$2", m20196f = "PhoneService.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: vg.w$d */
    /* loaded from: classes2.dex */
    public static final class C11349d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f29113A;

        /* renamed from: x */
        int f29114x;

        /* renamed from: z */
        final /* synthetic */ String f29116z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11349d(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29116z = str;
            this.f29113A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11349d(this.f29116z, this.f29113A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11349d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29114x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneApi m5381l = PhoneService.m5381l(PhoneService.this);
                ValidateOwnerRequest validateOwnerRequest = new ValidateOwnerRequest(this.f29116z, this.f29113A);
                this.f29114x = 1;
                obj = m5381l.validateOwner(validateOwnerRequest, this);
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
    public PhoneService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29102d = (PhoneApi) retrofit.create(PhoneApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ PhoneApi m5381l(PhoneService phoneService) {
        return phoneService.f29102d;
    }

    /* renamed from: k */
    protected ApiBaseException m5382k(String str, int i) {
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
        } else if (i == 5005) {
            notEmptyValidationException = new UserCantSignInException(new ApiError(str));
        } else if (i == 5007) {
            notEmptyValidationException = new UserNameOrPasswordInvalidException(new ApiError(str));
        } else if (i != 5100) {
            return super.m5556k(str, i);
        } else {
            notEmptyValidationException = new SmsCodeValidationAppException(new ApiError(str));
        }
        return notEmptyValidationException;
    }

    /* renamed from: m */
    public final Object m5380m(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11346a(str, str2, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5379n(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11347b(str, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5378o(PhoneRequest phoneRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11348c(phoneRequest, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5377p(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11349d(str, str2, null), interfaceC1886d);
    }
}
