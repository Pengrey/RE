package cf;

import bd.InterfaceC1886d;
import bf.TokenRequest;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import module.network.data.remote.endpoints.OAuthEndpoint;
import module.network.data.remote.models.response.IdentityErrorResponse;
import p065df.CoreBaseService;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import retrofit2.Retrofit;
import ve.InvalidGrantException;

/* renamed from: cf.a */
/* loaded from: classes2.dex */
public final class OAuthService extends CoreBaseService {

    /* renamed from: c */
    private final OAuthEndpoint f6152c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OAuthService.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.services.OAuthService$logout$2", m20196f = "OAuthService.kt", m20195l = {56}, m20194m = "invokeSuspend")
    /* renamed from: cf.a$a */
    /* loaded from: classes2.dex */
    public static final class C2125a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f6153A;

        /* renamed from: x */
        int f6154x;

        /* renamed from: z */
        final /* synthetic */ String f6156z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2125a(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f6156z = str;
            this.f6153A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C2125a(this.f6156z, this.f6153A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C2125a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f6154x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OAuthEndpoint m34613j = OAuthService.m34613j(OAuthService.this);
                Intrinsics.checkIfNull(m34613j, "api");
                String str = this.f6156z;
                String str2 = this.f6153A;
                this.f6154x = 1;
                obj = OAuthEndpoint.C7539a.m18255a(m34613j, str, str2, null, this, 4, null);
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
    /* compiled from: OAuthService.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.services.OAuthService$refreshAccessAndRefreshTokens$2", m20196f = "OAuthService.kt", m20195l = {47}, m20194m = "invokeSuspend")
    /* renamed from: cf.a$b */
    /* loaded from: classes2.dex */
    public static final class C2126b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f6157x;

        /* renamed from: z */
        final /* synthetic */ TokenRequest f6159z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2126b(TokenRequest tokenRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f6159z = tokenRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C2126b(this.f6159z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C2126b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f6157x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OAuthEndpoint m34613j = OAuthService.m34613j(OAuthService.this);
                String m35162a = this.f6159z.m35162a();
                String m35161b = this.f6159z.m35161b();
                String m35160c = this.f6159z.m35160c();
                this.f6157x = 1;
                obj = m34613j.revalidateToken(m35162a, m35161b, m35160c, this);
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
    public OAuthService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider, null, 2, null);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f6152c = (OAuthEndpoint) retrofit.create(OAuthEndpoint.class);
    }

    /* renamed from: j */
    public static final /* synthetic */ OAuthEndpoint m34613j(OAuthService oAuthService) {
        return oAuthService.f6152c;
    }

    /* renamed from: i */
    protected ApiBaseException m34614i(String str, String str2, int i, String str3) {
        Intrinsics.isThisObjectNull(str, "requestPath");
        Intrinsics.isThisObjectNull(str2, "responseMessage");
        Intrinsics.isThisObjectNull(str3, "errorBodyJson");
        try {
            IdentityErrorResponse identityErrorResponse = (IdentityErrorResponse) m26598g().m27369c(IdentityErrorResponse.class).m27476c(str3);
            Intrinsics.ifNullDoSomething(identityErrorResponse);
            String m18229b = identityErrorResponse.m18229b();
            if (m18229b == null && (m18229b = identityErrorResponse.m18230a()) == null) {
                m18229b = str2;
            }
            if (i == 400 && Intrinsics.equals(m18229b, "invalid_grant")) {
                return new InvalidGrantException(CoreBaseService.m26599f(this, null, 1, null));
            }
            return new ApiBaseException(m26600e(m18229b));
        } catch (Throwable unused) {
            return new ApiBaseException(m26600e(str2));
        }
    }

    /* renamed from: k */
    public final Object m34612k(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C2125a(str, str2, null), interfaceC1886d);
    }

    /* renamed from: l */
    public final Object m34611l(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C2126b(new TokenRequest(null, null, str, 3, null), null), interfaceC1886d);
    }
}
