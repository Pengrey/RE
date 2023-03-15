package sg;

import android.content.res.Resources;
import android.os.Build;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6112p;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.sync.C6943h;
import kotlinx.coroutines.sync.InterfaceC6940f;
import p107ff.InterfaceC5503w;
import p107ff.Request;
import p107ff.Response;
import p108fg.AppInterceptorDataProvider;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10549n2;
import td.C10567r2;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10555p0;

/* renamed from: sg.a */
/* loaded from: classes2.dex */
public final class AppInterceptor implements InterfaceC5503w {

    /* renamed from: a */
    private final AppInterceptorDataProvider f26604a;

    /* renamed from: b */
    private final OAuthManager f26605b;

    /* renamed from: c */
    private final InterfaceC6940f f26606c;

    /* renamed from: d */
    private InterfaceC10555p0 f26607d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptor.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.interceptor.AppInterceptor$createNewRefreshTokenJob$2", m20196f = "AppInterceptor.kt", m20195l = {83}, m20194m = "invokeSuspend")
    /* renamed from: sg.a$a */
    /* loaded from: classes2.dex */
    public static final class C10206a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f26608x;

        /* renamed from: y */
        private /* synthetic */ Object f26609y;

        C10206a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10206a c10206a = new C10206a(interfaceC1886d);
            c10206a.f26609y = obj;
            return c10206a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10206a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object m1458a;
            m34636d = C2116d.m34636d();
            int i = this.f26608x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f26609y;
                    AppInterceptor appInterceptor = AppInterceptor.this;
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    OAuthManager m8507e = AppInterceptor.m8507e(appInterceptor);
                    this.f26608x = 1;
                    obj = m8507e.m7575g(this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptor.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.interceptor.AppInterceptor$refreshExpiredToken$1", m20196f = "AppInterceptor.kt", m20195l = {C0868i.f2973u0, 70, 74}, m20194m = "invokeSuspend")
    /* renamed from: sg.a$b */
    /* loaded from: classes2.dex */
    public static final class C10207b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        private /* synthetic */ Object f26611A;

        /* renamed from: x */
        Object f26613x;

        /* renamed from: y */
        Object f26614y;

        /* renamed from: z */
        int f26615z;

        C10207b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10207b c10207b = new C10207b(interfaceC1886d);
            c10207b.f26611A = obj;
            return c10207b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10207b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r9.f26615z
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L3f
                if (r1 == r5) goto L2e
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
                java.lang.Object r1 = r9.f26613x
                sg.a r1 = (sg.AppInterceptor) r1
                java.lang.Object r3 = r9.f26611A
                kotlinx.coroutines.sync.f r3 = (kotlinx.coroutines.sync.InterfaceC6940f) r3
                p468yc.C13186n.m1453b(r10)     // Catch: java.lang.Throwable -> L2b
                goto L7f
            L2b:
                r10 = move-exception
                goto Lae
            L2e:
                java.lang.Object r1 = r9.f26614y
                sg.a r1 = (sg.AppInterceptor) r1
                java.lang.Object r6 = r9.f26613x
                kotlinx.coroutines.sync.f r6 = (kotlinx.coroutines.sync.InterfaceC6940f) r6
                java.lang.Object r7 = r9.f26611A
                td.i0 r7 = (td.InterfaceC10524i0) r7
                p468yc.C13186n.m1453b(r10)
                r10 = r6
                goto L5e
            L3f:
                p468yc.C13186n.m1453b(r10)
                java.lang.Object r10 = r9.f26611A
                r7 = r10
                td.i0 r7 = (td.InterfaceC10524i0) r7
                sg.a r10 = sg.AppInterceptor.this
                kotlinx.coroutines.sync.f r10 = sg.AppInterceptor.m8508d(r10)
                sg.a r1 = sg.AppInterceptor.this
                r9.f26611A = r7
                r9.f26613x = r10
                r9.f26614y = r1
                r9.f26615z = r5
                java.lang.Object r6 = r10.mo19752b(r9)
                if (r6 != r0) goto L5e
                return r0
            L5e:
                td.p0 r6 = sg.AppInterceptor.m8509c(r1)     // Catch: java.lang.Throwable -> Lab
                r8 = 0
                if (r6 == 0) goto L6c
                boolean r6 = r6.mo5659a()     // Catch: java.lang.Throwable -> Lab
                if (r6 != r5) goto L6c
                goto L6d
            L6c:
                r5 = r8
            L6d:
                if (r5 != 0) goto L8a
                r9.f26611A = r10     // Catch: java.lang.Throwable -> Lab
                r9.f26613x = r1     // Catch: java.lang.Throwable -> Lab
                r9.f26614y = r4     // Catch: java.lang.Throwable -> Lab
                r9.f26615z = r3     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r3 = sg.AppInterceptor.m8510b(r1, r7, r9)     // Catch: java.lang.Throwable -> Lab
                if (r3 != r0) goto L7e
                return r0
            L7e:
                r3 = r10
            L7f:
                td.p0 r10 = sg.AppInterceptor.m8509c(r1)     // Catch: java.lang.Throwable -> L2b
                p181jd.Intrinsics.ifNullDoSomething(r10)     // Catch: java.lang.Throwable -> L2b
                r10.start()     // Catch: java.lang.Throwable -> L2b
                goto L8b
            L8a:
                r3 = r10
            L8b:
                yc.u r10 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L2b
                r3.mo19753a()
                sg.a r10 = sg.AppInterceptor.this
                td.p0 r10 = sg.AppInterceptor.m8509c(r10)
                p181jd.Intrinsics.ifNullDoSomething(r10)
                r9.f26611A = r4
                r9.f26613x = r4
                r9.f26614y = r4
                r9.f26615z = r2
                java.lang.Object r10 = r10.mo7666h(r9)
                if (r10 != r0) goto La8
                return r0
            La8:
                yc.u r10 = p468yc.C13195u.f34156a
                return r10
            Lab:
                r0 = move-exception
                r3 = r10
                r10 = r0
            Lae:
                r3.mo19753a()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.AppInterceptor.C10207b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AppInterceptor(AppInterceptorDataProvider appInterceptorDataProvider, OAuthManager oAuthManager) {
        Intrinsics.isThisObjectNull(appInterceptorDataProvider, "appInterceptorDataProvider");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        this.f26604a = appInterceptorDataProvider;
        this.f26605b = oAuthManager;
        this.f26606c = C6943h.m19744b(1, 0, 2, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m8510b(AppInterceptor appInterceptor, InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
        return appInterceptor.m8506f(interfaceC10524i0, interfaceC1886d);
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC10555p0 m8509c(AppInterceptor appInterceptor) {
        return appInterceptor.f26607d;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC6940f m8508d(AppInterceptor appInterceptor) {
        return appInterceptor.f26606c;
    }

    /* renamed from: e */
    public static final /* synthetic */ OAuthManager m8507e(AppInterceptor appInterceptor) {
        return appInterceptor.f26605b;
    }

    /* renamed from: f */
    private final Object m8506f(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
        InterfaceC10555p0 m20160b;
        m20160b = C6772d.m20160b(interfaceC10524i0, C10567r2.m7672d("GET REFRESH TOKEN THREAD"), null, new C10206a(null), 2, null);
        this.f26607d = m20160b;
        return C13195u.f34156a;
    }

    /* renamed from: g */
    private final void m8505g() {
        C6769b.m20166e(C10549n2.m7695b(null, 1, null).mo4545f0(C10587w0.m7620b()), new C10207b(null));
    }

    /* renamed from: a */
    public Response mo23919a(InterfaceC5503w.InterfaceC5504a interfaceC5504a) {
        Intrinsics.isThisObjectNull(interfaceC5504a, "chain");
        Request.C5460a m24268h = interfaceC5504a.request().m24268h();
        if (this.f26604a.m23807j()) {
            m8505g();
        }
        m24268h.m24260f("pdapp-storeId", this.f26604a.m23808i());
        m24268h.m24260f("pdapp-cardNumber", this.f26604a.m23809h());
        m24268h.m24260f("pdapp-lcid", this.f26604a.m23810g());
        m24268h.m24260f("pdapp-hid", this.f26604a.m23811f());
        m24268h.m24260f("pdapp-clubs", this.f26604a.m23812e());
        C6429c0 c6429c0 = C6429c0.f17515a;
        String format = String.format("v-%s buildType-%s flavor-%s", Arrays.copyOf(new Object[]{"3.1.5", BuildConfig.BUILD_TYPE, "prod"}, 3));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        m24268h.m24260f("x-app-version", format);
        String format2 = String.format("Android-%s", Arrays.copyOf(new Object[]{Integer.valueOf(Build.VERSION.SDK_INT)}, 1));
        Intrinsics.checkIfNull(format2, "format(format, *args)");
        m24268h.m24260f("x-device-version", format2);
        m24268h.m24260f("x-screen-density", String.valueOf(Resources.getSystem().getDisplayMetrics().density));
        return interfaceC5504a.mo23918a(m24268h.m24264b());
    }
}
