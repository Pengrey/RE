package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.PinInvalidException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.AuthApi;
import pt.pingodoce.app.data.remote.models.request.ChangePinRequest;
import pt.pingodoce.app.data.remote.models.request.PinValidationRequest;
import retrofit2.Retrofit;

/* renamed from: vg.a */
/* loaded from: classes2.dex */
public final class AuthService extends BaseService {

    /* renamed from: d */
    private final AuthApi f28818d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.AuthService$changePin$2", m20196f = "AuthService.kt", m20195l = {52}, m20194m = "invokeSuspend")
    /* renamed from: vg.a$a */
    /* loaded from: classes2.dex */
    public static final class C11252a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f28819A;

        /* renamed from: x */
        int f28820x;

        /* renamed from: z */
        final /* synthetic */ String f28822z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11252a(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28822z = str;
            this.f28819A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11252a(this.f28822z, this.f28819A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11252a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28820x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AuthApi m5614l = AuthService.m5614l(AuthService.this);
                ChangePinRequest changePinRequest = new ChangePinRequest(BuildConfig.VERSION_NAME, this.f28822z, this.f28819A);
                this.f28820x = 1;
                obj = m5614l.changePin(changePinRequest, this);
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
    /* compiled from: AuthService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.AuthService$login$2", m20196f = "AuthService.kt", m20195l = {35}, m20194m = "invokeSuspend")
    /* renamed from: vg.a$b */
    /* loaded from: classes2.dex */
    public static final class C11253b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f28823A;

        /* renamed from: B */
        final /* synthetic */ String f28824B;

        /* renamed from: x */
        int f28825x;

        /* renamed from: z */
        final /* synthetic */ String f28827z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11253b(String str, String str2, String str3, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28827z = str;
            this.f28823A = str2;
            this.f28824B = str3;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11253b(this.f28827z, this.f28823A, this.f28824B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11253b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28825x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AuthApi m5614l = AuthService.m5614l(AuthService.this);
                String str = this.f28827z;
                String str2 = this.f28823A;
                String str3 = this.f28824B;
                this.f28825x = 1;
                obj = m5614l.login("pdappclient", "password", str, str2, str3, this);
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
    /* compiled from: AuthService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.AuthService$validatePin$2", m20196f = "AuthService.kt", m20195l = {47}, m20194m = "invokeSuspend")
    /* renamed from: vg.a$c */
    /* loaded from: classes2.dex */
    public static final class C11254c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28828x;

        /* renamed from: z */
        final /* synthetic */ String f28830z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11254c(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28830z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11254c(this.f28830z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11254c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28828x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AuthApi m5614l = AuthService.m5614l(AuthService.this);
                PinValidationRequest pinValidationRequest = new PinValidationRequest(this.f28830z);
                this.f28828x = 1;
                obj = m5614l.validatePin(pinValidationRequest, this);
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
    public AuthService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28818d = (AuthApi) retrofit.create(AuthApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ AuthApi m5614l(AuthService authService) {
        return authService.f28818d;
    }

    /* renamed from: k */
    protected ApiBaseException m5615k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5007) {
            return new PinInvalidException(new ApiError(str));
        }
        return super.m5556k(str, i);
    }

    /* renamed from: m */
    public final Object m5613m(String str, String str2, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11252a(str, str2, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: n */
    public final Object m5612n(String str, String str2, String str3, InterfaceC1886d interfaceC1886d) throws PinInvalidException {
        return m26603b(new C11253b(str, str3, str2, null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5611o(String str, InterfaceC1886d interfaceC1886d) throws PinInvalidException {
        return m26603b(new C11254c(str, null), interfaceC1886d);
    }
}
