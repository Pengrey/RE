package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3417c;
import com.google.firebase.C4165a;
import com.google.firebase.C4175c;
import com.google.firebase.messaging.C4317q0;
import com.google.firebase.messaging.C4326u0;
import com.google.firebase.messaging.FirebaseMessaging;
import ga.InterfaceC5628a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p070e.C4906j;
import p079e8.InterfaceC5018e;
import p081ea.C5023a;
import p081ea.InterfaceC5024b;
import p081ea.InterfaceC5026d;
import p099f7.ThreadFactoryC5416b;
import p102fa.InterfaceC5439f;
import p136ha.InterfaceC5882b;
import p158ia.InterfaceC6066d;
import p461y5.InterfaceC13116g;
import pa.InterfaceC8592i;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: m */
    private static final long f11604m = TimeUnit.HOURS.toSeconds(8);
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: n */
    private static C4326u0 f11605n;
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: o */
    static InterfaceC13116g f11606o;
    @GuardedBy("FirebaseMessaging.class")

    /* renamed from: p */
    static ScheduledExecutorService f11607p;

    /* renamed from: a */
    private final C4175c f11608a;

    /* renamed from: b */
    private final InterfaceC5628a f11609b;

    /* renamed from: c */
    private final InterfaceC6066d f11610c;

    /* renamed from: d */
    private final Context f11611d;

    /* renamed from: e */
    private final C4280c0 f11612e;

    /* renamed from: f */
    private final C4317q0 f11613f;

    /* renamed from: g */
    private final C4268a f11614g;

    /* renamed from: h */
    private final Executor f11615h;

    /* renamed from: i */
    private final AbstractC3419d<C4338z0> f11616i;

    /* renamed from: j */
    private final C4297h0 f11617j;
    @GuardedBy("this")

    /* renamed from: k */
    private boolean f11618k;

    /* renamed from: l */
    private final Application.ActivityLifecycleCallbacks f11619l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes.dex */
    public class C4268a {

        /* renamed from: a */
        private final InterfaceC5026d f11620a;
        @GuardedBy("this")

        /* renamed from: b */
        private boolean f11621b;
        @GuardedBy("this")

        /* renamed from: c */
        private InterfaceC5024b<C4165a> f11622c;
        @GuardedBy("this")

        /* renamed from: d */
        private Boolean f11623d;

        C4268a(InterfaceC5026d interfaceC5026d) {
            this.f11620a = interfaceC5026d;
        }

        /* renamed from: d */
        private Boolean m28099d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m28441h = FirebaseMessaging.this.f11608a.m28441h();
            SharedPreferences sharedPreferences = m28441h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m28441h.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m28441h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        synchronized void m28102a() {
            if (this.f11621b) {
                return;
            }
            Boolean m28099d = m28099d();
            this.f11623d = m28099d;
            if (m28099d == null) {
                InterfaceC5024b<C4165a> interfaceC5024b = new InterfaceC5024b() { // from class: com.google.firebase.messaging.y
                    @Override // p081ea.InterfaceC5024b
                    /* renamed from: a */
                    public final void mo22291a(C5023a c5023a) {
                        FirebaseMessaging.C4268a.this.m28100c(c5023a);
                    }
                };
                this.f11622c = interfaceC5024b;
                this.f11620a.mo21039b(C4165a.class, interfaceC5024b);
            }
            this.f11621b = true;
        }

        /* renamed from: b */
        synchronized boolean m28101b() {
            boolean m28432q;
            m28102a();
            Boolean bool = this.f11623d;
            if (bool != null) {
                m28432q = bool.booleanValue();
            } else {
                m28432q = FirebaseMessaging.this.f11608a.m28432q();
            }
            return m28432q;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public /* synthetic */ void m28100c(C5023a c5023a) {
            if (m28101b()) {
                FirebaseMessaging.this.m28105x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C4175c c4175c, InterfaceC5628a interfaceC5628a, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2, InterfaceC6066d interfaceC6066d, InterfaceC13116g interfaceC13116g, InterfaceC5026d interfaceC5026d) {
        this(c4175c, interfaceC5628a, interfaceC5882b, interfaceC5882b2, interfaceC6066d, interfaceC13116g, interfaceC5026d, new C4297h0(c4175c.m28441h()));
    }

    /* renamed from: f */
    public static synchronized FirebaseMessaging m28123f() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C4175c.m28440i());
        }
        return firebaseMessaging;
    }

    /* renamed from: g */
    private static synchronized C4326u0 m28122g(Context context) {
        C4326u0 c4326u0;
        synchronized (FirebaseMessaging.class) {
            if (f11605n == null) {
                f11605n = new C4326u0(context);
            }
            c4326u0 = f11605n;
        }
        return c4326u0;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C4175c c4175c) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c4175c.m28442g(FirebaseMessaging.class);
            C2597i.m33075k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: h */
    private String m28121h() {
        return "[DEFAULT]".equals(this.f11608a.m28439j()) ? BuildConfig.VERSION_NAME : this.f11608a.m28437l();
    }

    /* renamed from: k */
    public static InterfaceC13116g m28118k() {
        return f11606o;
    }

    /* renamed from: l */
    private void m28117l(String str) {
        if ("[DEFAULT]".equals(this.f11608a.m28439j())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.f11608a.m28439j());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C4308m(this.f11611d).m27932g(intent);
        }
    }

    /* renamed from: w */
    private synchronized void m28106w() {
        if (this.f11618k) {
            return;
        }
        m28103z(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m28105x() {
        InterfaceC5628a interfaceC5628a = this.f11609b;
        if (interfaceC5628a != null) {
            interfaceC5628a.m23527c();
        } else if (m28129A(m28119j())) {
            m28106w();
        }
    }

    /* renamed from: A */
    boolean m28129A(C4326u0.C4327a c4327a) {
        return c4327a == null || c4327a.m27893b(this.f11617j.m27986a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m28126c() throws IOException {
        InterfaceC5628a interfaceC5628a = this.f11609b;
        if (interfaceC5628a != null) {
            try {
                return (String) C3425g.m30769a(interfaceC5628a.m23529a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final C4326u0.C4327a m28119j = m28119j();
        if (!m28129A(m28119j)) {
            return m28119j.f11738a;
        }
        final String m27984c = C4297h0.m27984c(this.f11608a);
        try {
            return (String) C3425g.m30769a(this.f11613f.m27919a(m27984c, new C4317q0.InterfaceC4318a() { // from class: com.google.firebase.messaging.v
                @Override // com.google.firebase.messaging.C4317q0.InterfaceC4318a
                public final AbstractC3419d start() {
                    return FirebaseMessaging.this.m28113p(m27984c, m28119j);
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m28125d(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f11607p == null) {
                f11607p = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC5416b("TAG"));
            }
            f11607p.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Context m28124e() {
        return this.f11611d;
    }

    /* renamed from: i */
    public AbstractC3419d<String> m28120i() {
        InterfaceC5628a interfaceC5628a = this.f11609b;
        if (interfaceC5628a != null) {
            return interfaceC5628a.m23529a();
        }
        final C3421e c3421e = new C3421e();
        this.f11615h.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m28112q(c3421e);
            }
        });
        return c3421e.m30802a();
    }

    /* renamed from: j */
    C4326u0.C4327a m28119j() {
        return m28122g(this.f11611d).m27897d(m28121h(), C4297h0.m27984c(this.f11608a));
    }

    /* renamed from: m */
    public boolean m28116m() {
        return this.f11614g.m28101b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m28115n() {
        return this.f11617j.m27980g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public /* synthetic */ AbstractC3419d m28114o(String str, C4326u0.C4327a c4327a, String str2) throws Exception {
        m28122g(this.f11611d).m27895f(m28121h(), str, str2, this.f11617j.m27986a());
        if (c4327a == null || !str2.equals(c4327a.f11738a)) {
            m28117l(str2);
        }
        return C3425g.m30765e(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public /* synthetic */ AbstractC3419d m28113p(final String str, final C4326u0.C4327a c4327a) {
        return this.f11612e.m28039d().mo30778r(ExecutorC4319r.f11719w, new InterfaceC3417c() { // from class: com.google.firebase.messaging.s
            @Override // com.google.android.gms.tasks.InterfaceC3417c
            /* renamed from: a */
            public final AbstractC3419d mo6853a(Object obj) {
                return FirebaseMessaging.this.m28114o(str, c4327a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public /* synthetic */ void m28112q(C3421e c3421e) {
        try {
            c3421e.m30800c(m28126c());
        } catch (Exception e) {
            c3421e.m30801b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public /* synthetic */ void m28111r() {
        if (m28116m()) {
            m28105x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public /* synthetic */ void m28110s(C4338z0 c4338z0) {
        if (m28116m()) {
            c4338z0.m27859p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public /* synthetic */ void m28109t() {
        C4307l0.m27942b(this.f11611d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public synchronized void m28107v(boolean z) {
        this.f11618k = z;
    }

    /* renamed from: y */
    public AbstractC3419d<Void> m28104y(final String str) {
        return this.f11616i.mo30779q(new InterfaceC3417c() { // from class: com.google.firebase.messaging.t
            @Override // com.google.android.gms.tasks.InterfaceC3417c
            /* renamed from: a */
            public final AbstractC3419d mo6853a(Object obj) {
                AbstractC3419d m27858q;
                m27858q = ((C4338z0) obj).m27858q(str);
                return m27858q;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public synchronized void m28103z(long j) {
        m28125d(new RunnableC4329v0(this, Math.min(Math.max(30L, j + j), f11604m)), j);
        this.f11618k = true;
    }

    FirebaseMessaging(C4175c c4175c, InterfaceC5628a interfaceC5628a, InterfaceC5882b<InterfaceC8592i> interfaceC5882b, InterfaceC5882b<InterfaceC5439f> interfaceC5882b2, InterfaceC6066d interfaceC6066d, InterfaceC13116g interfaceC13116g, InterfaceC5026d interfaceC5026d, C4297h0 c4297h0) {
        this(c4175c, interfaceC5628a, interfaceC6066d, interfaceC13116g, interfaceC5026d, c4297h0, new C4280c0(c4175c, c4297h0, interfaceC5882b, interfaceC5882b2, interfaceC6066d), C4310n.m27924d(), C4310n.m27927a());
    }

    FirebaseMessaging(C4175c c4175c, InterfaceC5628a interfaceC5628a, InterfaceC6066d interfaceC6066d, InterfaceC13116g interfaceC13116g, InterfaceC5026d interfaceC5026d, C4297h0 c4297h0, C4280c0 c4280c0, Executor executor, Executor executor2) {
        this.f11618k = false;
        f11606o = interfaceC13116g;
        this.f11608a = c4175c;
        this.f11609b = interfaceC5628a;
        this.f11610c = interfaceC6066d;
        this.f11614g = new C4268a(interfaceC5026d);
        Context m28441h = c4175c.m28441h();
        this.f11611d = m28441h;
        C4312o c4312o = new C4312o();
        this.f11619l = c4312o;
        this.f11617j = c4297h0;
        this.f11612e = c4280c0;
        this.f11613f = new C4317q0(executor);
        this.f11615h = executor2;
        Context m28441h2 = c4175c.m28441h();
        if (m28441h2 instanceof Application) {
            ((Application) m28441h2).registerActivityLifecycleCallbacks(c4312o);
        } else {
            String valueOf = String.valueOf(m28441h2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + C4906j.f13415H0);
            sb2.append("Context ");
            sb2.append(valueOf);
            sb2.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb2.toString());
        }
        if (interfaceC5628a != null) {
            interfaceC5628a.m23528b(new InterfaceC5628a.InterfaceC5629a(this) { // from class: com.google.firebase.messaging.u
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.w
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m28111r();
            }
        });
        AbstractC3419d<C4338z0> m27870e = C4338z0.m27870e(this, c4297h0, c4280c0, m28441h, C4310n.m27923e());
        this.f11616i = m27870e;
        m27870e.mo30790f(executor2, new InterfaceC5018e() { // from class: com.google.firebase.messaging.p
            @Override // p079e8.InterfaceC5018e
            /* renamed from: b */
            public final void mo20210b(Object obj) {
                FirebaseMessaging.this.m28110s((C4338z0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m28109t();
            }
        });
    }
}
