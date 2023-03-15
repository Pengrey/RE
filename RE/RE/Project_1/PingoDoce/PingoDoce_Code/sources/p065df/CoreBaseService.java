package p065df;

import af.ApiError;
import android.accounts.NetworkErrorException;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.squareup.moshi.C4496p;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p065df.NetworkResult;
import p107ff.ResponseBody;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p425we.NetworkBaseException;
import p447xe.NoConnectionException;
import p468yc.C13186n;
import p468yc.C13195u;
import re.C9882a;
import retrofit2.HttpException;
import retrofit2.Response;
import td.C10587w0;
import td.InterfaceC10524i0;
import ve.NullBodyException;

/* renamed from: df.b */
/* loaded from: classes2.dex */
public abstract class CoreBaseService {

    /* renamed from: a */
    private final ResourcesProvider f13109a;

    /* renamed from: b */
    private final C4496p f13110b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseService.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.services.base.CoreBaseService", m20196f = "CoreBaseService.kt", m20195l = {66}, m20194m = "apiCall")
    /* renamed from: df.b$a */
    /* loaded from: classes2.dex */
    public static final class C4787a<T> extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f13111w;

        /* renamed from: y */
        int f13113y;

        C4787a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f13111w = obj;
            this.f13113y |= Integer.MIN_VALUE;
            return CoreBaseService.this.m26603b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseService.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.services.base.CoreBaseService$apiCall$2", m20196f = "CoreBaseService.kt", m20195l = {69}, m20194m = "invokeSuspend")
    /* renamed from: df.b$b */
    /* loaded from: classes2.dex */
    public static final class C4788b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13114x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l f13115y;

        /* renamed from: z */
        final /* synthetic */ CoreBaseService f13116z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4788b(InterfaceC6108l interfaceC6108l, CoreBaseService coreBaseService, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13115y = interfaceC6108l;
            this.f13116z = coreBaseService;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4788b(this.f13115y, this.f13116z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4788b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String str;
            m34636d = C2116d.m34636d();
            int i = this.f13114x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC6108l interfaceC6108l = this.f13115y;
                    this.f13114x = 1;
                    obj = interfaceC6108l.mo9587d(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Response response = (Response) obj;
                if (!response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    CoreBaseService coreBaseService = this.f13116z;
                    String m26593a = C4790c.m26593a(response);
                    String message = response.message();
                    Intrinsics.checkIfNull(message, "response.message()");
                    int code = response.code();
                    if (errorBody == null || (str = errorBody.string()) == null) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    throw coreBaseService.m26596i(m26593a, message, code, str);
                } else if (response.body() != null) {
                    Object body = response.body();
                    Intrinsics.ifNullDoSomething(body);
                    return body;
                } else {
                    throw new NullBodyException(new ApiError("response.body() can't be null"));
                }
            } catch (Throwable th2) {
                throw CoreBaseService.m26604a(this.f13116z, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreBaseService.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.services.base.CoreBaseService$apiCallCatching$2", m20196f = "CoreBaseService.kt", m20195l = {39}, m20194m = "invokeSuspend")
    /* renamed from: df.b$c */
    /* loaded from: classes2.dex */
    public static final class C4789c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13117x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l f13118y;

        /* renamed from: z */
        final /* synthetic */ CoreBaseService f13119z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4789c(InterfaceC6108l interfaceC6108l, CoreBaseService coreBaseService, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13118y = interfaceC6108l;
            this.f13119z = coreBaseService;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4789c(this.f13118y, this.f13119z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4789c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String str;
            m34636d = C2116d.m34636d();
            int i = this.f13117x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC6108l interfaceC6108l = this.f13118y;
                    this.f13117x = 1;
                    obj = interfaceC6108l.mo9587d(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Response response = (Response) obj;
                if (!response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    CoreBaseService coreBaseService = this.f13119z;
                    String m26593a = C4790c.m26593a(response);
                    String message = response.message();
                    Intrinsics.checkIfNull(message, "response.message()");
                    int code = response.code();
                    if (errorBody == null || (str = errorBody.string()) == null) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    return new NetworkResult.C4791a(coreBaseService.m26596i(m26593a, message, code, str));
                } else if (response.body() == null) {
                    return new NetworkResult.C4791a(new NullBodyException(new ApiError("response.body() can't be null")));
                } else {
                    Object body = response.body();
                    Intrinsics.ifNullDoSomething(body);
                    return new NetworkResult.C4792b(body);
                }
            } catch (Throwable th2) {
                return new NetworkResult.C4791a(CoreBaseService.m26604a(this.f13119z, th2));
            }
        }
    }

    public CoreBaseService(ResourcesProvider resourcesProvider, C4496p c4496p) {
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        this.f13109a = resourcesProvider;
        this.f13110b = c4496p;
    }

    /* renamed from: a */
    public static final /* synthetic */ NetworkBaseException m26604a(CoreBaseService coreBaseService, Throwable th2) {
        return coreBaseService.m26597h(th2);
    }

    /* renamed from: f */
    public static /* synthetic */ ApiError m26599f(CoreBaseService coreBaseService, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = BuildConfig.VERSION_NAME;
            }
            return coreBaseService.m26600e(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createApiError");
    }

    /* renamed from: h */
    private final NetworkBaseException m26597h(Throwable th2) {
        if (th2 instanceof HttpException) {
            Response<?> response = ((HttpException) th2).response();
            String message = response != null ? response.message() : null;
            if (message == null) {
                message = BuildConfig.VERSION_NAME;
            }
            return new NetworkBaseException(m26600e(message), th2);
        } else if (th2 instanceof NetworkErrorException) {
            return new NoConnectionException(m26601d(C9882a.err_no_internet), th2);
        } else {
            if (th2 instanceof SocketTimeoutException ? true : th2 instanceof UnknownHostException) {
                return new NoConnectionException(m26601d(C9882a.err_timeout), th2);
            }
            return new NetworkBaseException(m26601d(C9882a.err_api_generic), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26603b(id.InterfaceC6108l r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p065df.CoreBaseService.C4787a
            if (r0 == 0) goto L13
            r0 = r7
            df.b$a r0 = (p065df.CoreBaseService.C4787a) r0
            int r1 = r0.f13113y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13113y = r1
            goto L18
        L13:
            df.b$a r0 = new df.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13111w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f13113y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            p468yc.C13186n.m1453b(r7)
            td.e0 r7 = td.C10587w0.m7620b()
            df.b$b r2 = new df.b$b
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.f13113y = r3
            java.lang.Object r7 = kotlinx.coroutines.C6769b.m20164g(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = "protected suspend fun <T…        }\n        }\n    }"
            p181jd.Intrinsics.checkIfNull(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p065df.CoreBaseService.m26603b(id.l, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Object m26602c(InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return C6769b.m20164g(C10587w0.m7620b(), new C4789c(interfaceC6108l, this, null), interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final ApiError m26601d(int i) {
        String string = this.f13109a.m6899a().getString(i);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        return new ApiError(string);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final ApiError m26600e(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        return new ApiError(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final C4496p m26598g() {
        return this.f13110b;
    }

    /* renamed from: i */
    protected abstract ApiBaseException m26596i(String str, String str2, int i, String str3);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CoreBaseService(p378u5.ResourcesProvider r1, com.squareup.moshi.C4496p r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L12
            com.squareup.moshi.p$a r2 = new com.squareup.moshi.p$a
            r2.<init>()
            com.squareup.moshi.p r2 = r2.m27364a()
            java.lang.String r3 = "Builder().build()"
            p181jd.Intrinsics.checkIfNull(r2, r3)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p065df.CoreBaseService.<init>(u5.a, com.squareup.moshi.p, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
