package p370te;

import bd.InterfaceC1886d;
import cf.OAuthService;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.sync.C6939e;
import kotlinx.coroutines.sync.InterfaceC6930c;
import module.network.data.remote.models.response.AuthenticationResponse;
import module.network.data.remote.models.response.authenticationv2.AuthenticationResponseToken;
import org.joda.time.DateTimeConstants;
import p181jd.Intrinsics;
import p468yc.C13195u;
import se.OAuthSharedPrefs;
import td.C10509e2;
import td.InterfaceC10524i0;

/* renamed from: te.a */
/* loaded from: classes2.dex */
public final class OAuthManager {

    /* renamed from: a */
    private final OAuthService f27312a;

    /* renamed from: b */
    private final OAuthSharedPrefs f27313b;

    /* renamed from: c */
    private final InterfaceC6930c f27314c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OAuthManager.kt */
    @InterfaceC6759f(m20197c = "module.network.data.managers.OAuthManager", m20196f = "OAuthManager.kt", m20195l = {69}, m20194m = "logout")
    /* renamed from: te.a$a */
    /* loaded from: classes2.dex */
    public static final class C10603a extends AbstractC6757d {

        /* renamed from: w */
        Object f27315w;

        /* renamed from: x */
        /* synthetic */ Object f27316x;

        /* renamed from: z */
        int f27318z;

        C10603a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27316x = obj;
            this.f27318z |= Integer.MIN_VALUE;
            return OAuthManager.this.m7576f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OAuthManager.kt */
    @InterfaceC6759f(m20197c = "module.network.data.managers.OAuthManager$refreshAccessAndRefreshTokens$2", m20196f = "OAuthManager.kt", m20195l = {85, 53}, m20194m = "invokeSuspend")
    /* renamed from: te.a$b */
    /* loaded from: classes2.dex */
    public static final class C10604b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f27320x;

        /* renamed from: y */
        Object f27321y;

        /* renamed from: z */
        int f27322z;

        C10604b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10604b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10604b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0017, B:24:0x006b, B:26:0x0071, B:29:0x008d, B:31:0x0091, B:32:0x0097, B:33:0x0098, B:34:0x009d), top: B:39:0x0017 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0017, B:24:0x006b, B:26:0x0071, B:29:0x008d, B:31:0x0091, B:32:0x0097, B:33:0x0098, B:34:0x009d), top: B:39:0x0017 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r6.f27322z
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L33
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r6.f27321y
                te.a r0 = (p370te.OAuthManager) r0
                java.lang.Object r1 = r6.f27320x
                kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.InterfaceC6930c) r1
                p468yc.C13186n.m1453b(r7)     // Catch: java.lang.Throwable -> L1b
                goto L6b
            L1b:
                r7 = move-exception
                goto La1
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                java.lang.Object r1 = r6.f27321y
                te.a r1 = (p370te.OAuthManager) r1
                java.lang.Object r3 = r6.f27320x
                kotlinx.coroutines.sync.c r3 = (kotlinx.coroutines.sync.InterfaceC6930c) r3
                p468yc.C13186n.m1453b(r7)
                r7 = r3
                goto L4b
            L33:
                p468yc.C13186n.m1453b(r7)
                te.a r7 = p370te.OAuthManager.this
                kotlinx.coroutines.sync.c r7 = p370te.OAuthManager.m7581a(r7)
                te.a r1 = p370te.OAuthManager.this
                r6.f27320x = r7
                r6.f27321y = r1
                r6.f27322z = r3
                java.lang.Object r3 = r7.mo19768c(r4, r6)
                if (r3 != r0) goto L4b
                return r0
            L4b:
                cf.a r3 = p370te.OAuthManager.m7580b(r1)     // Catch: java.lang.Throwable -> L9e
                se.a r5 = p370te.OAuthManager.m7579c(r1)     // Catch: java.lang.Throwable -> L9e
                java.lang.String r5 = r5.m8861d()     // Catch: java.lang.Throwable -> L9e
                if (r5 != 0) goto L5b
                java.lang.String r5 = ""
            L5b:
                r6.f27320x = r7     // Catch: java.lang.Throwable -> L9e
                r6.f27321y = r1     // Catch: java.lang.Throwable -> L9e
                r6.f27322z = r2     // Catch: java.lang.Throwable -> L9e
                java.lang.Object r2 = r3.m34611l(r5, r6)     // Catch: java.lang.Throwable -> L9e
                if (r2 != r0) goto L68
                return r0
            L68:
                r0 = r1
                r1 = r7
                r7 = r2
            L6b:
                df.d r7 = (p065df.NetworkResult) r7     // Catch: java.lang.Throwable -> L1b
                boolean r2 = r7 instanceof p065df.NetworkResult.C4792b     // Catch: java.lang.Throwable -> L1b
                if (r2 == 0) goto L8d
                r2 = r7
                df.d$b r2 = (p065df.NetworkResult.C4792b) r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r2 = r2.m26590a()     // Catch: java.lang.Throwable -> L1b
                module.network.data.remote.models.response.AuthenticationResponse r2 = (module.network.data.remote.models.response.AuthenticationResponse) r2     // Catch: java.lang.Throwable -> L1b
                r0.m7574h(r2)     // Catch: java.lang.Throwable -> L1b
                df.d$b r7 = (p065df.NetworkResult.C4792b) r7     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r7 = r7.m26590a()     // Catch: java.lang.Throwable -> L1b
                module.network.data.remote.models.response.AuthenticationResponse r7 = (module.network.data.remote.models.response.AuthenticationResponse) r7     // Catch: java.lang.Throwable -> L1b
                java.lang.String r7 = r7.m18245a()     // Catch: java.lang.Throwable -> L1b
                r1.mo19770a(r4)
                return r7
            L8d:
                boolean r0 = r7 instanceof p065df.NetworkResult.C4791a     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L98
                df.d$a r7 = (p065df.NetworkResult.C4791a) r7     // Catch: java.lang.Throwable -> L1b
                we.b r7 = r7.m26591a()     // Catch: java.lang.Throwable -> L1b
                throw r7     // Catch: java.lang.Throwable -> L1b
            L98:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L1b
                r7.<init>()     // Catch: java.lang.Throwable -> L1b
                throw r7     // Catch: java.lang.Throwable -> L1b
            L9e:
                r0 = move-exception
                r1 = r7
                r7 = r0
            La1:
                r1.mo19770a(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p370te.OAuthManager.C10604b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public OAuthManager(OAuthService oAuthService, OAuthSharedPrefs oAuthSharedPrefs) {
        Intrinsics.isThisObjectNull(oAuthService, "service");
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "sharedPrefs");
        this.f27312a = oAuthService;
        this.f27313b = oAuthSharedPrefs;
        this.f27314c = C6939e.m19760a(false);
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC6930c m7581a(OAuthManager oAuthManager) {
        return oAuthManager.f27314c;
    }

    /* renamed from: b */
    public static final /* synthetic */ OAuthService m7580b(OAuthManager oAuthManager) {
        return oAuthManager.f27312a;
    }

    /* renamed from: c */
    public static final /* synthetic */ OAuthSharedPrefs m7579c(OAuthManager oAuthManager) {
        return oAuthManager.f27313b;
    }

    /* renamed from: d */
    private final void m7578d() {
        this.f27313b.m8864a();
    }

    /* renamed from: e */
    public final String m7577e() {
        String m8863b = this.f27313b.m8863b();
        return m8863b == null ? BuildConfig.VERSION_NAME : m8863b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7576f(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p370te.OAuthManager.C10603a
            if (r0 == 0) goto L13
            r0 = r6
            te.a$a r0 = (p370te.OAuthManager.C10603a) r0
            int r1 = r0.f27318z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27318z = r1
            goto L18
        L13:
            te.a$a r0 = new te.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27316x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f27318z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f27315w
            te.a r0 = (p370te.OAuthManager) r0
            p468yc.C13186n.m1453b(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            p468yc.C13186n.m1453b(r6)
            cf.a r6 = r5.f27312a
            se.a r2 = r5.f27313b
            java.lang.String r2 = r2.m8861d()
            if (r2 != 0) goto L44
            java.lang.String r2 = ""
        L44:
            r0.f27315w = r5
            r0.f27318z = r3
            java.lang.String r4 = "pdappclient"
            java.lang.Object r6 = r6.m34612k(r4, r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r1 = r6 instanceof p065df.NetworkResult.C4792b
            if (r1 == 0) goto L60
            r0.m7578d()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r6
        L60:
            boolean r0 = r6 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L6b
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            throw r6
        L6b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p370te.OAuthManager.m7576f(bd.d):java.lang.Object");
    }

    /* renamed from: g */
    public final Object m7575g(InterfaceC1886d interfaceC1886d) {
        return C6769b.m20164g(C10509e2.f27234x, new C10604b(null), interfaceC1886d);
    }

    /* renamed from: h */
    public final void m7574h(AuthenticationResponse authenticationResponse) {
        Intrinsics.isThisObjectNull(authenticationResponse, "data");
        if (authenticationResponse.m18245a().length() > 0) {
            this.f27313b.m8858g(System.currentTimeMillis() + (authenticationResponse.m18244b() * ((long) DateTimeConstants.MILLIS_PER_SECOND)));
            this.f27313b.m8859f(authenticationResponse.m18245a());
        }
        if (authenticationResponse.m18243c().length() > 0) {
            this.f27313b.m8857h(authenticationResponse.m18243c());
        }
    }

    /* renamed from: i */
    public final void m7573i(AuthenticationResponseToken authenticationResponseToken) {
        Intrinsics.isThisObjectNull(authenticationResponseToken, "data");
        long currentTimeMillis = System.currentTimeMillis() + authenticationResponseToken.m18225b();
        this.f27313b.m8859f(authenticationResponseToken.m18226a());
        this.f27313b.m8858g(currentTimeMillis);
        this.f27313b.m8857h(authenticationResponseToken.m18223d());
    }
}
