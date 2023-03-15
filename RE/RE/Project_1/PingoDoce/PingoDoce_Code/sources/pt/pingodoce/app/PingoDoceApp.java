package pt.pingodoce.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1448j0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.firebase.messaging.FirebaseMessaging;
import dagger.android.AbstractApplicationC4770b;
import dagger.android.InterfaceC4768a;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.AuthManager;
import p065df.C4786a;
import p079e8.InterfaceC5016c;
import p095f3.C5348a;
import p095f3.InterfaceC5359e;
import p124gk.SplashActivity;
import p181jd.Intrinsics;
import p279oj.VersionControlActivity;
import p449xg.C12595x;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.PingoDoceApp;
import pt.pingodoce.app.utils.lifecycle.AppLifeCycleOwner;
import td.C10531j0;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10524i0;
import ve.InvalidGrantException;
import ve.VersionControlException;

/* compiled from: PingoDoceApp.kt */
/* loaded from: classes2.dex */
public final class PingoDoceApp extends AbstractApplicationC4770b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: x */
    public AuthManager f22362x;

    /* renamed from: y */
    private Activity f22363y;

    /* compiled from: PingoDoceApp.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.PingoDoceApp$onCreate$2", m20196f = "PingoDoceApp.kt", m20195l = {60}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.PingoDoceApp$a */
    /* loaded from: classes2.dex */
    static final class C8667a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f22364x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PingoDoceApp.kt */
        /* renamed from: pt.pingodoce.app.PingoDoceApp$a$a */
        /* loaded from: classes2.dex */
        public static final class C8668a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ PingoDoceApp f22366w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PingoDoceApp.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.PingoDoceApp$onCreate$2$1", m20196f = "PingoDoceApp.kt", m20195l = {62}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.PingoDoceApp$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C8669a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f22367w;

                /* renamed from: y */
                int f22369y;

                C8669a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f22367w = obj;
                    this.f22369y |= Integer.MIN_VALUE;
                    return C8668a.this.mo4529a(null, this);
                }
            }

            C8668a(PingoDoceApp pingoDoceApp) {
                this.f22366w = pingoDoceApp;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Throwable r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.PingoDoceApp.C8667a.C8668a.C8669a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.PingoDoceApp$a$a$a r0 = (pt.pingodoce.app.PingoDoceApp.C8667a.C8668a.C8669a) r0
                    int r1 = r0.f22369y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f22369y = r1
                    goto L18
                L13:
                    pt.pingodoce.app.PingoDoceApp$a$a$a r0 = new pt.pingodoce.app.PingoDoceApp$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f22367w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f22369y
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L44
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    pt.pingodoce.app.PingoDoceApp r6 = r4.f22366w
                    r6.m14786h(r5)
                    r5 = 1000(0x3e8, double:4.94E-321)
                    r0.f22369y = r3
                    java.lang.Object r5 = td.C10565r0.m7677a(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    df.a r5 = p065df.C4786a.f13106a
                    r6 = 0
                    r5.m26606a(r6)
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.PingoDoceApp.C8667a.C8668a.mo4529a(java.lang.Throwable, bd.d):java.lang.Object");
            }
        }

        C8667a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8667a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8667a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f22364x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c m20141g = C6788e.m20141g(C4786a.f13106a.m26605b());
                C8668a c8668a = new C8668a(PingoDoceApp.this);
                this.f22364x = 1;
                if (m20141g.mo20086d(c8668a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m14791c(PingoDoceApp pingoDoceApp, AbstractC3419d abstractC3419d) {
        m14787g(pingoDoceApp, abstractC3419d);
    }

    /* renamed from: f */
    private final void m14788f() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkIfNull(applicationContext, "applicationContext");
        C5348a.m24547c(new InterfaceC5359e.C5360a(applicationContext).m24487b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m14787g(PingoDoceApp pingoDoceApp, AbstractC3419d abstractC3419d) {
        String str;
        Intrinsics.isThisObjectNull(pingoDoceApp, "this$0");
        Intrinsics.isThisObjectNull(abstractC3419d, "task");
        if (!abstractC3419d.mo30780p() || (str = (String) abstractC3419d.mo30784l()) == null) {
            return;
        }
        pingoDoceApp.m14790d().m18897C(str);
    }

    /* renamed from: a */
    protected InterfaceC4768a mo26656a() {
        return C12595x.m2892a().mo2982a(this);
    }

    /* renamed from: d */
    public final AuthManager m14790d() {
        AuthManager authManager = this.f22362x;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitPropException("authManager");
        return null;
    }

    /* renamed from: e */
    public final Activity m14789e() {
        return this.f22363y;
    }

    /* renamed from: h */
    public final void m14786h(Throwable th2) {
        if (th2 instanceof InvalidGrantException) {
            SplashActivity.m23307b(this);
        } else if (th2 instanceof VersionControlException) {
            VersionControlActivity.m16919a(this);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.isThisObjectNull(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
        this.f22363y = activity;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.isThisObjectNull(activity, "activity");
        Intrinsics.isThisObjectNull(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
    }

    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        m14788f();
        FirebaseMessaging.m28123f().m28104y("pd_default_channel");
        FirebaseMessaging.m28123f().m28120i().mo30794b(new InterfaceC5016c() { // from class: cg.a
            @Override // p079e8.InterfaceC5016c
            /* renamed from: a */
            public final void mo4683a(AbstractC3419d abstractC3484d) {
                PingoDoceApp.m14787g(PingoDoceApp.this, abstractC3484d);
            }
        });
        C1448j0.m37021k().mo137b().mo10402a(new AppLifeCycleOwner());
        C6772d.m20158d(C10531j0.m7771a(C10549n2.m7695b(null, 1, null).mo4545f0(C10587w0.m7621a())), null, null, new C8667a(null), 3, null);
    }

    public void onTerminate() {
        registerActivityLifecycleCallbacks(this);
        super.onTerminate();
    }
}
