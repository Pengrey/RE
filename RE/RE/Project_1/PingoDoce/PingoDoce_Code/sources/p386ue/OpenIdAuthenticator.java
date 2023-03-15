package p386ue;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.sync.C6943h;
import kotlinx.coroutines.sync.InterfaceC6940f;
import p107ff.Authenticator;
import p107ff.Request;
import p107ff.Response;
import p107ff.Route;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10567r2;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10555p0;

/* renamed from: ue.b */
/* loaded from: classes2.dex */
public final class OpenIdAuthenticator implements Authenticator {

    /* renamed from: b */
    private final OAuthManager f28080b;

    /* renamed from: c */
    private InterfaceC10555p0 f28081c;

    /* renamed from: d */
    private final InterfaceC6940f f28082d;

    /* compiled from: OpenIdAuthenticator.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.authenticators.OpenIdAuthenticator$authenticate$1", m20196f = "OpenIdAuthenticator.kt", m20195l = {77, 39, 44}, m20194m = "invokeSuspend")
    /* renamed from: ue.b$a */
    /* loaded from: classes2.dex */
    static final class C10874a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        private /* synthetic */ Object f28083A;

        /* renamed from: C */
        final /* synthetic */ Response f28085C;

        /* renamed from: x */
        Object f28086x;

        /* renamed from: y */
        Object f28087y;

        /* renamed from: z */
        int f28088z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10874a(Response response, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f28085C = response;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10874a c10874a = new C10874a(this.f28085C, interfaceC1886d);
            c10874a.f28083A = obj;
            return c10874a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10874a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r9.f28088z
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                p468yc.C13186n.m1453b(r10)
                goto La8
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                java.lang.Object r1 = r9.f28086x
                ue.b r1 = (p386ue.OpenIdAuthenticator) r1
                java.lang.Object r3 = r9.f28083A
                kotlinx.coroutines.sync.f r3 = (kotlinx.coroutines.sync.InterfaceC6940f) r3
                p468yc.C13186n.m1453b(r10)     // Catch: java.lang.Throwable -> L2b
                goto L7f
            L2b:
                r10 = move-exception
                goto Lb8
            L2e:
                java.lang.Object r1 = r9.f28087y
                ue.b r1 = (p386ue.OpenIdAuthenticator) r1
                java.lang.Object r6 = r9.f28086x
                kotlinx.coroutines.sync.f r6 = (kotlinx.coroutines.sync.InterfaceC6940f) r6
                java.lang.Object r7 = r9.f28083A
                td.i0 r7 = (td.InterfaceC10524i0) r7
                p468yc.C13186n.m1453b(r10)
                r10 = r6
                goto L5e
            L3f:
                p468yc.C13186n.m1453b(r10)
                java.lang.Object r10 = r9.f28083A
                r7 = r10
                td.i0 r7 = (td.InterfaceC10524i0) r7
                ue.b r10 = p386ue.OpenIdAuthenticator.this
                kotlinx.coroutines.sync.f r10 = p386ue.OpenIdAuthenticator.m6805d(r10)
                ue.b r1 = p386ue.OpenIdAuthenticator.this
                r9.f28083A = r7
                r9.f28086x = r10
                r9.f28087y = r1
                r9.f28088z = r4
                java.lang.Object r6 = r10.mo19752b(r9)
                if (r6 != r0) goto L5e
                return r0
            L5e:
                td.p0 r6 = p386ue.OpenIdAuthenticator.m6806c(r1)     // Catch: java.lang.Throwable -> Lb5
                r8 = 0
                if (r6 == 0) goto L6c
                boolean r6 = r6.mo5659a()     // Catch: java.lang.Throwable -> Lb5
                if (r6 != r4) goto L6c
                goto L6d
            L6c:
                r4 = r8
            L6d:
                if (r4 != 0) goto L8a
                r9.f28083A = r10     // Catch: java.lang.Throwable -> Lb5
                r9.f28086x = r1     // Catch: java.lang.Throwable -> Lb5
                r9.f28087y = r5     // Catch: java.lang.Throwable -> Lb5
                r9.f28088z = r3     // Catch: java.lang.Throwable -> Lb5
                java.lang.Object r3 = p386ue.OpenIdAuthenticator.m6807b(r1, r7, r9)     // Catch: java.lang.Throwable -> Lb5
                if (r3 != r0) goto L7e
                return r0
            L7e:
                r3 = r10
            L7f:
                td.p0 r10 = p386ue.OpenIdAuthenticator.m6806c(r1)     // Catch: java.lang.Throwable -> L2b
                p181jd.Intrinsics.ifNullDoSomething(r10)     // Catch: java.lang.Throwable -> L2b
                r10.start()     // Catch: java.lang.Throwable -> L2b
                goto L8b
            L8a:
                r3 = r10
            L8b:
                yc.u r10 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L2b
                r3.mo19753a()
                ue.b r10 = p386ue.OpenIdAuthenticator.this
                td.p0 r10 = p386ue.OpenIdAuthenticator.m6806c(r10)
                p181jd.Intrinsics.ifNullDoSomething(r10)
                r9.f28083A = r5
                r9.f28086x = r5
                r9.f28087y = r5
                r9.f28088z = r2
                java.lang.Object r10 = r10.mo7666h(r9)
                if (r10 != r0) goto La8
                return r0
            La8:
                java.lang.String r10 = (java.lang.String) r10
                if (r10 == 0) goto Lb4
                ue.b r0 = p386ue.OpenIdAuthenticator.this
                ff.d0 r1 = r9.f28085C
                ff.b0 r5 = p386ue.OpenIdAuthenticator.m6803f(r0, r10, r1)
            Lb4:
                return r5
            Lb5:
                r0 = move-exception
                r3 = r10
                r10 = r0
            Lb8:
                r3.mo19753a()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p386ue.OpenIdAuthenticator.C10874a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OpenIdAuthenticator.kt */
    @InterfaceC6759f(m20197c = "module.network.data.remote.authenticators.OpenIdAuthenticator$createNewRefreshTokenJob$2", m20196f = "OpenIdAuthenticator.kt", m20195l = {55}, m20194m = "invokeSuspend")
    /* renamed from: ue.b$b */
    /* loaded from: classes2.dex */
    public static final class C10875b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f28089x;

        /* renamed from: y */
        private /* synthetic */ Object f28090y;

        C10875b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10875b c10875b = new C10875b(interfaceC1886d);
            c10875b.f28090y = obj;
            return c10875b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10875b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object m1458a;
            m34636d = C2116d.m34636d();
            int i = this.f28089x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f28090y;
                    OpenIdAuthenticator openIdAuthenticator = OpenIdAuthenticator.this;
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    OAuthManager m6804e = OpenIdAuthenticator.m6804e(openIdAuthenticator);
                    this.f28089x = 1;
                    obj = m6804e.m7575g(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                m1458a = C13183m.m1458a((String) obj);
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            if (C13183m.m1455d(m1458a)) {
                return (String) m1458a;
            }
            if (C13183m.m1456c(m1458a)) {
                return null;
            }
            return m1458a;
        }
    }

    public OpenIdAuthenticator(OAuthManager oAuthManager) {
        Intrinsics.isThisObjectNull(oAuthManager, "manager");
        this.f28080b = oAuthManager;
        this.f28082d = C6943h.m19744b(1, 0, 2, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m6807b(OpenIdAuthenticator openIdAuthenticator, InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
        return openIdAuthenticator.m6802g(interfaceC10524i0, interfaceC1886d);
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC10555p0 m6806c(OpenIdAuthenticator openIdAuthenticator) {
        return openIdAuthenticator.f28081c;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC6940f m6805d(OpenIdAuthenticator openIdAuthenticator) {
        return openIdAuthenticator.f28082d;
    }

    /* renamed from: e */
    public static final /* synthetic */ OAuthManager m6804e(OpenIdAuthenticator openIdAuthenticator) {
        return openIdAuthenticator.f28080b;
    }

    /* renamed from: f */
    public static final /* synthetic */ Request m6803f(OpenIdAuthenticator openIdAuthenticator, String str, Response response) {
        return openIdAuthenticator.m6801h(str, response);
    }

    /* renamed from: g */
    private final Object m6802g(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
        InterfaceC10555p0 m20160b;
        m20160b = C6772d.m20160b(interfaceC10524i0, C10567r2.m7672d("GET REFRESH TOKEN THREAD"), null, new C10875b(null), 2, null);
        this.f28081c = m20160b;
        return C13195u.f34156a;
    }

    /* renamed from: h */
    private final Request m6801h(String str, Response response) {
        Request.C5460a m24268h = response.m24202a0().m24268h();
        return m24268h.m24260f("Authorization", "Bearer " + str).m24264b();
    }

    /* renamed from: a */
    public Request m6808a(Route route, Response response) {
        Intrinsics.isThisObjectNull(response, "response");
        if (C10873a.m6809a(response, 6)) {
            return null;
        }
        return (Request) C6769b.m20166e(C10587w0.m7620b(), new C10874a(response, null));
    }
}
