package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.CardAlreadyRegisteredException;
import p339rg.InvalidCardFormatException;
import p339rg.PinInvalidException;
import p339rg.SmsCodeExpiredException;
import p339rg.UserNotFoundException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.OnboardingApi;
import pt.pingodoce.app.data.remote.models.request.CardOwnerRequest;
import pt.pingodoce.app.data.remote.models.request.GuestAccessRequest;
import pt.pingodoce.app.data.remote.models.request.OnboardingUserLoginRequest;
import pt.pingodoce.app.data.remote.models.request.OnboardingUserRequest;
import pt.pingodoce.app.data.remote.models.response.Consent;
import retrofit2.Retrofit;
import ve.NoAccessException;

/* renamed from: vg.u */
/* loaded from: classes2.dex */
public final class OnboardingService extends BaseService {

    /* renamed from: d */
    private final OnboardingApi f29084d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.OnboardingService$getLoyaltyCards$2", m20196f = "OnboardingService.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: vg.u$a */
    /* loaded from: classes2.dex */
    public static final class C11340a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29085x;

        C11340a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11340a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11340a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29085x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingApi m5396l = OnboardingService.m5396l(OnboardingService.this);
                this.f29085x = 1;
                obj = m5396l.getLoyaltyCards(this);
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
    /* compiled from: OnboardingService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.OnboardingService$login$2", m20196f = "OnboardingService.kt", m20195l = {51}, m20194m = "invokeSuspend")
    /* renamed from: vg.u$b */
    /* loaded from: classes2.dex */
    public static final class C11341b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29087x;

        /* renamed from: z */
        final /* synthetic */ OnboardingUserLoginRequest f29089z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11341b(OnboardingUserLoginRequest onboardingUserLoginRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29089z = onboardingUserLoginRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11341b(this.f29089z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11341b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29087x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingApi m5396l = OnboardingService.m5396l(OnboardingService.this);
                OnboardingUserLoginRequest onboardingUserLoginRequest = this.f29089z;
                this.f29087x = 1;
                obj = m5396l.login(onboardingUserLoginRequest, this);
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
    /* compiled from: OnboardingService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.OnboardingService$register$2", m20196f = "OnboardingService.kt", m20195l = {39}, m20194m = "invokeSuspend")
    /* renamed from: vg.u$c */
    /* loaded from: classes2.dex */
    public static final class C11342c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29090x;

        /* renamed from: z */
        final /* synthetic */ OnboardingUserRequest f29092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11342c(OnboardingUserRequest onboardingUserRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29092z = onboardingUserRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11342c(this.f29092z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11342c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29090x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingApi m5396l = OnboardingService.m5396l(OnboardingService.this);
                OnboardingUserRequest onboardingUserRequest = this.f29092z;
                this.f29090x = 1;
                obj = m5396l.register(onboardingUserRequest, this);
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
    /* compiled from: OnboardingService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.OnboardingService$registerAsGuest$2", m20196f = "OnboardingService.kt", m20195l = {55}, m20194m = "invokeSuspend")
    /* renamed from: vg.u$d */
    /* loaded from: classes2.dex */
    public static final class C11343d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29093x;

        /* renamed from: z */
        final /* synthetic */ GuestAccessRequest f29095z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11343d(GuestAccessRequest guestAccessRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29095z = guestAccessRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11343d(this.f29095z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11343d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29093x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingApi m5396l = OnboardingService.m5396l(OnboardingService.this);
                GuestAccessRequest guestAccessRequest = this.f29095z;
                this.f29093x = 1;
                obj = m5396l.registerAsGuest(guestAccessRequest, this);
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
    /* compiled from: OnboardingService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.OnboardingService$verifyCardOwner$2", m20196f = "OnboardingService.kt", m20195l = {35}, m20194m = "invokeSuspend")
    /* renamed from: vg.u$e */
    /* loaded from: classes2.dex */
    public static final class C11344e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29096x;

        /* renamed from: z */
        final /* synthetic */ String f29098z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11344e(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29098z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11344e(this.f29098z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11344e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29096x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingApi m5396l = OnboardingService.m5396l(OnboardingService.this);
                CardOwnerRequest cardOwnerRequest = new CardOwnerRequest(this.f29098z);
                this.f29096x = 1;
                obj = m5396l.verifyCardOwner(cardOwnerRequest, this);
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
    public OnboardingService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29084d = (OnboardingApi) retrofit.create(OnboardingApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ OnboardingApi m5396l(OnboardingService onboardingService) {
        return onboardingService.f29084d;
    }

    /* renamed from: k */
    protected ApiBaseException m5397k(String str, int i) {
        ApiBaseException invalidCardFormatException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 1015 || i == 1023) {
            invalidCardFormatException = new InvalidCardFormatException(new ApiError(str));
        } else if (i == 2000) {
            invalidCardFormatException = new NoAccessException(new ApiError(str));
        } else if (i == 5000) {
            invalidCardFormatException = new UserNotFoundException(new ApiError(str));
        } else if (i == 5007) {
            invalidCardFormatException = new PinInvalidException(new ApiError(str));
        } else if (i == 5101) {
            invalidCardFormatException = new SmsCodeExpiredException(new ApiError(str));
        } else if (i != 5201) {
            return super.m5556k(str, i);
        } else {
            invalidCardFormatException = new CardAlreadyRegisteredException(new ApiError(str));
        }
        return invalidCardFormatException;
    }

    /* renamed from: m */
    public final Object m5395m(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11340a(null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5394n(String str, String str2, Consent consent, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11341b(new OnboardingUserLoginRequest(UtilsExtensions.m35165g(str), str2, consent), null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5393o(OnboardingUserRequest onboardingUserRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11342c(onboardingUserRequest, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5392p(GuestAccessRequest guestAccessRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11343d(guestAccessRequest, null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5391q(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11344e(str, null), interfaceC1886d);
    }
}
