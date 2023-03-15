package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.UserEmailAlreadyExistsException;
import p339rg.UserEmailNotConfirmedException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.EmailApi;
import pt.pingodoce.app.data.remote.models.request.ConfirmationEmailRequest;
import pt.pingodoce.app.data.remote.models.request.EmailRequest;
import pt.pingodoce.app.data.remote.models.request.ValidateAndSendEmailRequest;
import retrofit2.Retrofit;

/* renamed from: vg.o */
/* loaded from: classes2.dex */
public final class EmailService extends BaseService {

    /* renamed from: d */
    private final EmailApi f29033d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.EmailService$checkConfirmation$2", m20196f = "EmailService.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: vg.o$a */
    /* loaded from: classes2.dex */
    public static final class C11322a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29034x;

        C11322a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11322a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11322a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29034x;
            if (i == 0) {
                C13186n.m1453b(obj);
                EmailApi m5441l = EmailService.m5441l(EmailService.this);
                this.f29034x = 1;
                obj = m5441l.checkConfirmation(this);
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
    /* compiled from: EmailService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.EmailService$sendConfirmationEmail$2", m20196f = "EmailService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.o$b */
    /* loaded from: classes2.dex */
    public static final class C11323b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29036x;

        /* renamed from: z */
        final /* synthetic */ ConfirmationEmailRequest f29038z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11323b(ConfirmationEmailRequest confirmationEmailRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29038z = confirmationEmailRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11323b(this.f29038z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11323b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29036x;
            if (i == 0) {
                C13186n.m1453b(obj);
                EmailApi m5441l = EmailService.m5441l(EmailService.this);
                ConfirmationEmailRequest confirmationEmailRequest = this.f29038z;
                this.f29036x = 1;
                obj = m5441l.sendConfirmationEmail(confirmationEmailRequest, this);
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
    /* compiled from: EmailService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.EmailService$validateAndSendEmail$2", m20196f = "EmailService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.o$c */
    /* loaded from: classes2.dex */
    public static final class C11324c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29039x;

        /* renamed from: z */
        final /* synthetic */ ValidateAndSendEmailRequest f29041z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11324c(ValidateAndSendEmailRequest validateAndSendEmailRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29041z = validateAndSendEmailRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11324c(this.f29041z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11324c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29039x;
            if (i == 0) {
                C13186n.m1453b(obj);
                EmailApi m5441l = EmailService.m5441l(EmailService.this);
                ValidateAndSendEmailRequest validateAndSendEmailRequest = this.f29041z;
                this.f29039x = 1;
                obj = m5441l.validateAndSendEmail(validateAndSendEmailRequest, this);
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
    /* compiled from: EmailService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.EmailService$validateEmail$2", m20196f = "EmailService.kt", m20195l = {24}, m20194m = "invokeSuspend")
    /* renamed from: vg.o$d */
    /* loaded from: classes2.dex */
    public static final class C11325d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29042x;

        /* renamed from: z */
        final /* synthetic */ EmailRequest f29044z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11325d(EmailRequest emailRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29044z = emailRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11325d(this.f29044z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11325d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29042x;
            if (i == 0) {
                C13186n.m1453b(obj);
                EmailApi m5441l = EmailService.m5441l(EmailService.this);
                EmailRequest emailRequest = this.f29044z;
                this.f29042x = 1;
                obj = m5441l.validateEmail(emailRequest, this);
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
    public EmailService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29033d = (EmailApi) retrofit.create(EmailApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ EmailApi m5441l(EmailService emailService) {
        return emailService.f29033d;
    }

    /* renamed from: k */
    protected ApiBaseException m5442k(String str, int i) {
        ApiBaseException userEmailNotConfirmedException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5014) {
            userEmailNotConfirmedException = new UserEmailNotConfirmedException(new ApiError(str));
        } else if (i != 5016) {
            return super.m5556k(str, i);
        } else {
            userEmailNotConfirmedException = new UserEmailAlreadyExistsException(new ApiError(str));
        }
        return userEmailNotConfirmedException;
    }

    /* renamed from: m */
    public final Object m5440m(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11322a(null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5439n(ConfirmationEmailRequest confirmationEmailRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11323b(confirmationEmailRequest, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5438o(ValidateAndSendEmailRequest validateAndSendEmailRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11324c(validateAndSendEmailRequest, null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5437p(EmailRequest emailRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11325d(emailRequest, null), interfaceC1886d);
    }
}
