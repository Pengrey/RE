package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.C4175c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p219l9.C7011f;
import p219l9.InterfaceC7002a;
import p238m9.InterfaceC7146a;
import p253n9.InterfaceC7689a;
import p253n9.InterfaceC7690b;
import p269o9.C8037c;
import p269o9.C8049g;
import p355s9.C10098f;
import p382u9.InterfaceC10857e;
import p442x9.C12326a;
import p442x9.C12328c;

/* renamed from: com.google.firebase.crashlytics.internal.common.l */
/* loaded from: classes.dex */
public class C4221l {

    /* renamed from: a */
    private final Context f11502a;

    /* renamed from: b */
    private final C4232r f11503b;

    /* renamed from: c */
    private final long f11504c = System.currentTimeMillis();

    /* renamed from: d */
    private C4226m f11505d;

    /* renamed from: e */
    private C4226m f11506e;

    /* renamed from: f */
    private C4208j f11507f;

    /* renamed from: g */
    private final C4239v f11508g;

    /* renamed from: h */
    private final C10098f f11509h;

    /* renamed from: i */
    public final InterfaceC7690b f11510i;

    /* renamed from: j */
    private final InterfaceC7146a f11511j;

    /* renamed from: k */
    private final ExecutorService f11512k;

    /* renamed from: l */
    private final C4199h f11513l;

    /* renamed from: m */
    private final InterfaceC7002a f11514m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$a */
    /* loaded from: classes.dex */
    public class CallableC4222a implements Callable<AbstractC3419d<Void>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10857e f11515a;

        CallableC4222a(InterfaceC10857e interfaceC10857e) {
            this.f11515a = interfaceC10857e;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC3419d<Void> call() throws Exception {
            return C4221l.this.m28271f(this.f11515a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$b */
    /* loaded from: classes.dex */
    public class RunnableC4223b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10857e f11517w;

        RunnableC4223b(InterfaceC10857e interfaceC10857e) {
            this.f11517w = interfaceC10857e;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4221l.this.m28271f(this.f11517w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$c */
    /* loaded from: classes.dex */
    public class CallableC4224c implements Callable<Boolean> {
        CallableC4224c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean m28255d = C4221l.this.f11505d.m28255d();
                if (!m28255d) {
                    C7011f.m19611f().m19606k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m28255d);
            } catch (Exception e) {
                C7011f.m19611f().m19612e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsCore.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.l$d */
    /* loaded from: classes.dex */
    public class CallableC4225d implements Callable<Boolean> {
        CallableC4225d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(C4221l.this.f11507f.m28293s());
        }
    }

    public C4221l(C4175c c4175c, C4239v c4239v, InterfaceC7002a interfaceC7002a, C4232r c4232r, InterfaceC7690b interfaceC7690b, InterfaceC7146a interfaceC7146a, C10098f c10098f, ExecutorService executorService) {
        this.f11503b = c4232r;
        this.f11502a = c4175c.m28441h();
        this.f11508g = c4239v;
        this.f11514m = interfaceC7002a;
        this.f11510i = interfaceC7690b;
        this.f11511j = interfaceC7146a;
        this.f11512k = executorService;
        this.f11509h = c10098f;
        this.f11513l = new C4199h(executorService);
    }

    /* renamed from: d */
    private void m28273d() {
        try {
            Boolean.TRUE.equals((Boolean) C4204h0.m28337d(this.f11513l.m28344h(new CallableC4225d())));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public AbstractC3419d<Void> m28271f(InterfaceC10857e interfaceC10857e) {
        m28263n();
        try {
            this.f11510i.mo17710a(new InterfaceC7689a() { // from class: com.google.firebase.crashlytics.internal.common.k
                @Override // p253n9.InterfaceC7689a
                /* renamed from: a */
                public final void mo17711a(String str) {
                    C4221l.this.m28266k(str);
                }
            });
            if (!interfaceC10857e.mo6850b().mo5833b().f28691a) {
                C7011f.m19611f().m19615b("Collection of crash reports disabled in Crashlytics settings.");
                return C3425g.m30766d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f11507f.m28286z(interfaceC10857e)) {
                C7011f.m19611f().m19606k("Previous sessions could not be finalized.");
            }
            return this.f11507f.m28316N(interfaceC10857e.mo6851a());
        } catch (Exception e) {
            C7011f.m19611f().m19612e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C3425g.m30766d(e);
        } finally {
            m28264m();
        }
    }

    /* renamed from: h */
    private void m28269h(InterfaceC10857e interfaceC10857e) {
        Future<?> submit = this.f11512k.submit(new RunnableC4223b(interfaceC10857e));
        C7011f.m19611f().m19615b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C7011f.m19611f().m19612e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C7011f.m19611f().m19612e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            C7011f.m19611f().m19612e("Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: i */
    public static String m28268i() {
        return "18.2.8";
    }

    /* renamed from: j */
    static boolean m28267j(String str, boolean z) {
        if (!z) {
            C7011f.m19611f().m19608i("Configured not to require a build ID.");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    boolean m28272e() {
        return this.f11505d.m28256c();
    }

    /* renamed from: g */
    public AbstractC3419d<Void> m28270g(InterfaceC10857e interfaceC10857e) {
        return C4204h0.m28336e(this.f11512k, new CallableC4222a(interfaceC10857e));
    }

    /* renamed from: k */
    public void m28266k(String str) {
        this.f11507f.m28312R(System.currentTimeMillis() - this.f11504c, str);
    }

    /* renamed from: l */
    public void m28265l(Throwable th2) {
        this.f11507f.m28313Q(Thread.currentThread(), th2);
    }

    /* renamed from: m */
    void m28264m() {
        this.f11513l.m28344h(new CallableC4224c());
    }

    /* renamed from: n */
    void m28263n() {
        this.f11513l.m28350b();
        this.f11505d.m28258a();
        C7011f.m19611f().m19608i("Initialization marker file was created.");
    }

    /* renamed from: o */
    public boolean m28262o(C4184a c4184a, InterfaceC10857e interfaceC10857e) {
        if (m28267j(c4184a.f11420b, C4196g.m28367k(this.f11502a, "com.crashlytics.RequireBuildId", true))) {
            String c4194f = new C4194f(this.f11508g).toString();
            try {
                this.f11506e = new C4226m("crash_marker", this.f11509h);
                this.f11505d = new C4226m("initialization_marker", this.f11509h);
                C8049g c8049g = new C8049g(c4194f, this.f11509h, this.f11513l);
                C8037c c8037c = new C8037c(this.f11509h);
                this.f11507f = new C4208j(this.f11502a, this.f11513l, this.f11508g, this.f11503b, this.f11509h, this.f11506e, c4184a, c8049g, c8037c, C4189c0.m28406g(this.f11502a, this.f11508g, this.f11509h, c4184a, c8037c, c8049g, new C12326a(1024, new C12328c(10)), interfaceC10857e), this.f11514m, this.f11511j);
                boolean m28272e = m28272e();
                m28273d();
                this.f11507f.m28288x(c4194f, Thread.getDefaultUncaughtExceptionHandler(), interfaceC10857e);
                if (m28272e && C4196g.m28375c(this.f11502a)) {
                    C7011f.m19611f().m19615b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m28269h(interfaceC10857e);
                    return false;
                }
                C7011f.m19611f().m19615b("Successfully configured exception handler.");
                return true;
            } catch (Exception e) {
                C7011f.m19611f().m19612e("Crashlytics was not started due to an exception during initialization", e);
                this.f11507f = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }
}
