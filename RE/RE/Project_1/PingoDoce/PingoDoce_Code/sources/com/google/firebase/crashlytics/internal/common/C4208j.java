package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3417c;
import com.google.firebase.crashlytics.internal.common.C4229p;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p219l9.C7011f;
import p219l9.InterfaceC7002a;
import p219l9.InterfaceC7012g;
import p238m9.InterfaceC7146a;
import p269o9.C8037c;
import p269o9.C8049g;
import p294p9.AbstractC8520c0;
import p355s9.C10098f;
import p382u9.InterfaceC10857e;
import p402v9.C11165a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.crashlytics.internal.common.j */
/* loaded from: classes.dex */
public class C4208j {

    /* renamed from: p */
    static final FilenameFilter f11460p = C4207i.f11459a;

    /* renamed from: a */
    private final Context f11461a;

    /* renamed from: b */
    private final C4232r f11462b;

    /* renamed from: c */
    private final C4226m f11463c;

    /* renamed from: d */
    private final C4199h f11464d;

    /* renamed from: e */
    private final C4239v f11465e;

    /* renamed from: f */
    private final C10098f f11466f;

    /* renamed from: g */
    private final C4184a f11467g;

    /* renamed from: h */
    private final C8037c f11468h;

    /* renamed from: i */
    private final InterfaceC7002a f11469i;

    /* renamed from: j */
    private final InterfaceC7146a f11470j;

    /* renamed from: k */
    private final C4189c0 f11471k;

    /* renamed from: l */
    private C4229p f11472l;

    /* renamed from: m */
    final C3421e<Boolean> f11473m = new C3421e<>();

    /* renamed from: n */
    final C3421e<Boolean> f11474n = new C3421e<>();

    /* renamed from: o */
    final C3421e<Void> f11475o = new C3421e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$a */
    /* loaded from: classes.dex */
    public class C4209a implements C4229p.InterfaceC4230a {
        C4209a() {
        }

        @Override // com.google.firebase.crashlytics.internal.common.C4229p.InterfaceC4230a
        /* renamed from: a */
        public void mo28224a(InterfaceC10857e interfaceC10857e, Thread thread, Throwable th2) {
            C4208j.this.m28323G(interfaceC10857e, thread, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$b */
    /* loaded from: classes.dex */
    public class CallableC4210b implements Callable<AbstractC3419d<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f11477a;

        /* renamed from: b */
        final /* synthetic */ Throwable f11478b;

        /* renamed from: c */
        final /* synthetic */ Thread f11479c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC10857e f11480d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.j$b$a */
        /* loaded from: classes.dex */
        public class C4211a implements InterfaceC3417c<C11165a, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f11482a;

            C4211a(Executor executor) {
                this.f11482a = executor;
            }

            @Override // com.google.android.gms.tasks.InterfaceC3417c
            /* renamed from: b */
            public AbstractC3419d<Void> mo6853a(C11165a c11165a) throws Exception {
                if (c11165a == null) {
                    C7011f.m19611f().m19606k("Received null app settings, cannot send reports at crash time.");
                    return C3425g.m30765e(null);
                }
                return C3425g.m30763g(C4208j.this.m28318L(), C4208j.this.f11471k.m28391v(this.f11482a));
            }
        }

        CallableC4210b(long j, Throwable th2, Thread thread, InterfaceC10857e interfaceC10857e) {
            this.f11477a = j;
            this.f11478b = th2;
            this.f11479c = thread;
            this.f11480d = interfaceC10857e;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public AbstractC3419d<Void> call() throws Exception {
            long m28324F = C4208j.m28324F(this.f11477a);
            String m28327C = C4208j.this.m28327C();
            if (m28327C != null) {
                C4208j.this.f11463c.m28258a();
                C4208j.this.f11471k.m28395r(this.f11478b, this.f11479c, m28327C, m28324F);
                C4208j.this.m28289w(this.f11477a);
                C4208j.this.m28292t(this.f11480d);
                C4208j.this.m28290v(new C4194f(C4208j.this.f11465e).toString());
                if (C4208j.this.f11462b.m28219d()) {
                    Executor m28349c = C4208j.this.f11464d.m28349c();
                    return this.f11480d.mo6851a().mo30778r(m28349c, new C4211a(m28349c));
                }
                return C3425g.m30765e(null);
            }
            C7011f.m19611f().m19613d("Tried to write a fatal exception while no session was open.");
            return C3425g.m30765e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$c */
    /* loaded from: classes.dex */
    public class C4212c implements InterfaceC3417c<Void, Boolean> {
        C4212c(C4208j c4208j) {
        }

        @Override // com.google.android.gms.tasks.InterfaceC3417c
        /* renamed from: b */
        public AbstractC3419d<Boolean> mo6853a(Void r1) throws Exception {
            return C3425g.m30765e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$d */
    /* loaded from: classes.dex */
    public class C4213d implements InterfaceC3417c<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ AbstractC3419d f11484a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CrashlyticsController.java */
        /* renamed from: com.google.firebase.crashlytics.internal.common.j$d$a */
        /* loaded from: classes.dex */
        public class CallableC4214a implements Callable<AbstractC3419d<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f11486a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CrashlyticsController.java */
            /* renamed from: com.google.firebase.crashlytics.internal.common.j$d$a$a */
            /* loaded from: classes.dex */
            public class C4215a implements InterfaceC3417c<C11165a, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f11488a;

                C4215a(Executor executor) {
                    this.f11488a = executor;
                }

                @Override // com.google.android.gms.tasks.InterfaceC3417c
                /* renamed from: b */
                public AbstractC3419d<Void> mo6853a(C11165a c11165a) throws Exception {
                    if (c11165a != null) {
                        C4208j.this.m28318L();
                        C4208j.this.f11471k.m28391v(this.f11488a);
                        C4208j.this.f11475o.m30798e(null);
                        return C3425g.m30765e(null);
                    }
                    C7011f.m19611f().m19606k("Received null app settings at app startup. Cannot send cached reports");
                    return C3425g.m30765e(null);
                }
            }

            CallableC4214a(Boolean bool) {
                this.f11486a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a */
            public AbstractC3419d<Void> call() throws Exception {
                if (!this.f11486a.booleanValue()) {
                    C7011f.m19611f().m19608i("Deleting cached crash reports...");
                    C4208j.m28294r(C4208j.this.m28320J());
                    C4208j.this.f11471k.m28392u();
                    C4208j.this.f11475o.m30798e(null);
                    return C3425g.m30765e(null);
                }
                C7011f.m19611f().m19615b("Sending cached crash reports...");
                C4208j.this.f11462b.m28220c(this.f11486a.booleanValue());
                Executor m28349c = C4208j.this.f11464d.m28349c();
                return C4213d.this.f11484a.mo30778r(m28349c, new C4215a(m28349c));
            }
        }

        C4213d(AbstractC3419d abstractC3419d) {
            this.f11484a = abstractC3419d;
        }

        @Override // com.google.android.gms.tasks.InterfaceC3417c
        /* renamed from: b */
        public AbstractC3419d<Void> mo6853a(Boolean bool) throws Exception {
            return C4208j.this.f11464d.m28343i(new CallableC4214a(bool));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$e */
    /* loaded from: classes.dex */
    public class CallableC4216e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f11490a;

        /* renamed from: b */
        final /* synthetic */ String f11491b;

        CallableC4216e(long j, String str) {
            this.f11490a = j;
            this.f11491b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (C4208j.this.m28322H()) {
                return null;
            }
            C4208j.this.f11468h.m17108g(this.f11490a, this.f11491b);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$f */
    /* loaded from: classes.dex */
    public class RunnableC4217f implements Runnable {

        /* renamed from: w */
        final /* synthetic */ long f11493w;

        /* renamed from: x */
        final /* synthetic */ Throwable f11494x;

        /* renamed from: y */
        final /* synthetic */ Thread f11495y;

        RunnableC4217f(long j, Throwable th2, Thread thread) {
            this.f11493w = j;
            this.f11494x = th2;
            this.f11495y = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4208j.this.m28322H()) {
                return;
            }
            long m28324F = C4208j.m28324F(this.f11493w);
            String m28327C = C4208j.this.m28327C();
            if (m28327C != null) {
                C4208j.this.f11471k.m28394s(this.f11494x, this.f11495y, m28327C, m28324F);
            } else {
                C7011f.m19611f().m19606k("Tried to write a non-fatal exception while no session was open.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$g */
    /* loaded from: classes.dex */
    public class CallableC4218g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f11497a;

        CallableC4218g(String str) {
            this.f11497a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            C4208j.this.m28290v(this.f11497a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CrashlyticsController.java */
    /* renamed from: com.google.firebase.crashlytics.internal.common.j$h */
    /* loaded from: classes.dex */
    public class CallableC4219h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f11499a;

        CallableC4219h(long j) {
            this.f11499a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f11499a);
            C4208j.this.f11470j.mo19085a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4208j(Context context, C4199h c4199h, C4239v c4239v, C4232r c4232r, C10098f c10098f, C4226m c4226m, C4184a c4184a, C8049g c8049g, C8037c c8037c, C4189c0 c4189c0, InterfaceC7002a interfaceC7002a, InterfaceC7146a interfaceC7146a) {
        new AtomicBoolean(false);
        this.f11461a = context;
        this.f11464d = c4199h;
        this.f11465e = c4239v;
        this.f11462b = c4232r;
        this.f11466f = c10098f;
        this.f11463c = c4226m;
        this.f11467g = c4184a;
        this.f11468h = c8037c;
        this.f11469i = interfaceC7002a;
        this.f11470j = interfaceC7146a;
        this.f11471k = c4189c0;
    }

    /* renamed from: A */
    private static boolean m28329A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: B */
    private Context m28328B() {
        return this.f11461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public String m28327C() {
        SortedSet<String> m28399n = this.f11471k.m28399n();
        if (m28399n.isEmpty()) {
            return null;
        }
        return m28399n.first();
    }

    /* renamed from: D */
    private static long m28326D() {
        return m28324F(System.currentTimeMillis());
    }

    /* renamed from: E */
    static List<InterfaceC4242y> m28325E(InterfaceC7012g interfaceC7012g, String str, C10098f c10098f, byte[] bArr) {
        File m9150n = c10098f.m9150n(str, "user-data");
        File m9150n2 = c10098f.m9150n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4192e("logs_file", "logs", bArr));
        arrayList.add(new C4238u("crash_meta_file", "metadata", interfaceC7012g.mo19599f()));
        arrayList.add(new C4238u("session_meta_file", "session", interfaceC7012g.mo19600e()));
        arrayList.add(new C4238u("app_meta_file", "app", interfaceC7012g.mo19604a()));
        arrayList.add(new C4238u("device_meta_file", "device", interfaceC7012g.mo19602c()));
        arrayList.add(new C4238u("os_meta_file", "os", interfaceC7012g.mo19603b()));
        arrayList.add(new C4238u("minidump_file", "minidump", interfaceC7012g.mo19601d()));
        arrayList.add(new C4238u("user_meta_file", "user", m9150n));
        arrayList.add(new C4238u("keys_file", "keys", m9150n2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static long m28324F(long j) {
        return j / 1000;
    }

    /* renamed from: K */
    private AbstractC3419d<Void> m28319K(long j) {
        if (m28329A()) {
            C7011f.m19611f().m19606k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C3425g.m30765e(null);
        }
        C7011f.m19611f().m19615b("Logging app exception event to Firebase Analytics");
        return C3425g.m30767c(new ScheduledThreadPoolExecutor(1), new CallableC4219h(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public AbstractC3419d<Void> m28318L() {
        ArrayList arrayList = new ArrayList();
        for (File file : m28320J()) {
            try {
                arrayList.add(m28319K(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C7011f m19611f = C7011f.m19611f();
                m19611f.m19606k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return C3425g.m30764f(arrayList);
    }

    /* renamed from: O */
    private AbstractC3419d<Boolean> m28315O() {
        if (this.f11462b.m28219d()) {
            C7011f.m19611f().m19615b("Automatic data collection is enabled. Allowing upload.");
            this.f11473m.m30798e(Boolean.FALSE);
            return C3425g.m30765e(Boolean.TRUE);
        }
        C7011f.m19611f().m19615b("Automatic data collection is disabled.");
        C7011f.m19611f().m19608i("Notifying that unsent reports are available.");
        this.f11473m.m30798e(Boolean.TRUE);
        AbstractC3419d<TContinuationResult> mo30779q = this.f11462b.m28216g().mo30779q(new C4212c(this));
        C7011f.m19611f().m19615b("Waiting for send/deleteUnsentReports to be called.");
        return C4204h0.m28332i(mo30779q, this.f11474n.m30802a());
    }

    /* renamed from: P */
    private void m28314P(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f11461a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f11471k.m28393t(str, historicalProcessExitReasons, new C8037c(this.f11466f, str), C8049g.m17062c(str, this.f11466f, this.f11464d));
                return;
            }
            C7011f m19611f = C7011f.m19611f();
            m19611f.m19608i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C7011f m19611f2 = C7011f.m19611f();
        m19611f2.m19608i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static AbstractC8520c0.AbstractC8521a m28297o(C4239v c4239v, C4184a c4184a) {
        return AbstractC8520c0.AbstractC8521a.m15297b(c4239v.m28203f(), c4184a.f11423e, c4184a.f11424f, c4239v.mo28195a(), EnumC4233s.determineFrom(c4184a.f11421c).getId(), c4184a.f11425g);
    }

    /* renamed from: p */
    private static AbstractC8520c0.AbstractC8522b m28296p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return AbstractC8520c0.AbstractC8522b.m15296c(C4196g.m28366l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C4196g.m28359s(), statFs.getBlockCount() * statFs.getBlockSize(), C4196g.m28354x(context), C4196g.m28365m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static AbstractC8520c0.AbstractC8523c m28295q(Context context) {
        return AbstractC8520c0.AbstractC8523c.m15295a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C4196g.m28353y(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m28294r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private void m28291u(boolean z, InterfaceC10857e interfaceC10857e) {
        ArrayList arrayList = new ArrayList(this.f11471k.m28399n());
        if (arrayList.size() <= z) {
            C7011f.m19611f().m19608i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (interfaceC10857e.mo6850b().mo5833b().f28692b) {
            m28314P(str);
        } else {
            C7011f.m19611f().m19608i("ANR feature disabled.");
        }
        if (this.f11469i.mo19629d(str)) {
            m28287y(str);
        }
        this.f11471k.m28404i(m28326D(), z != 0 ? (String) arrayList.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m28290v(String str) {
        long m28326D = m28326D();
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19615b("Opening a new session with ID " + str);
        this.f11469i.mo19630c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C4221l.m28268i()), m28326D, AbstractC8520c0.m15298b(m28297o(this.f11465e, this.f11467g), m28295q(m28328B()), m28296p(m28328B())));
        this.f11468h.m17110e(str);
        this.f11471k.m28398o(str, m28326D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m28289w(long j) {
        try {
            C10098f c10098f = this.f11466f;
            if (c10098f.m9160d(".ae" + j).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e) {
            C7011f.m19611f().m19605l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: y */
    private void m28287y(String str) {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Finalizing native report for session " + str);
        InterfaceC7012g mo19632a = this.f11469i.mo19632a(str);
        File mo19601d = mo19632a.mo19601d();
        if (mo19601d != null && mo19601d.exists()) {
            long lastModified = mo19601d.lastModified();
            C8037c c8037c = new C8037c(this.f11466f, str);
            File m9156h = this.f11466f.m9156h(str);
            if (!m9156h.isDirectory()) {
                C7011f.m19611f().m19606k("Couldn't create directory to store native session files, aborting.");
                return;
            }
            m28289w(lastModified);
            List<InterfaceC4242y> m28325E = m28325E(mo19632a, str, this.f11466f, c8037c.m17113b());
            C4243z.m28188b(m9156h, m28325E);
            C7011f.m19611f().m19615b("CrashlyticsController#finalizePreviousNativeSession");
            this.f11471k.m28405h(str, m28325E);
            c8037c.m17114a();
            return;
        }
        C7011f m19611f2 = C7011f.m19611f();
        m19611f2.m19606k("No minidump data found for session " + str);
    }

    /* renamed from: G */
    synchronized void m28323G(InterfaceC10857e interfaceC10857e, Thread thread, Throwable th2) {
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19615b("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
        try {
            C4204h0.m28337d(this.f11464d.m28343i(new CallableC4210b(System.currentTimeMillis(), th2, thread, interfaceC10857e)));
        } catch (Exception e) {
            C7011f.m19611f().m19612e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: H */
    boolean m28322H() {
        C4229p c4229p = this.f11472l;
        return c4229p != null && c4229p.m28226a();
    }

    /* renamed from: J */
    List<File> m28320J() {
        return this.f11466f.m9159e(f11460p);
    }

    /* renamed from: M */
    void m28317M(String str) {
        this.f11464d.m28344h(new CallableC4218g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public AbstractC3419d<Void> m28316N(AbstractC3419d<C11165a> abstractC3419d) {
        if (!this.f11471k.m28401l()) {
            C7011f.m19611f().m19608i("No crash reports are available to be sent.");
            this.f11473m.m30798e(Boolean.FALSE);
            return C3425g.m30765e(null);
        }
        C7011f.m19611f().m19608i("Crash reports are available to be sent.");
        return m28315O().mo30779q(new C4213d(abstractC3419d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public void m28313Q(Thread thread, Throwable th2) {
        this.f11464d.m28345g(new RunnableC4217f(System.currentTimeMillis(), th2, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m28312R(long j, String str) {
        this.f11464d.m28344h(new CallableC4216e(j, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m28293s() {
        if (!this.f11463c.m28256c()) {
            String m28327C = m28327C();
            return m28327C != null && this.f11469i.mo19629d(m28327C);
        }
        C7011f.m19611f().m19608i("Found previous crash marker.");
        this.f11463c.m28255d();
        return true;
    }

    /* renamed from: t */
    void m28292t(InterfaceC10857e interfaceC10857e) {
        m28291u(false, interfaceC10857e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m28288x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC10857e interfaceC10857e) {
        m28317M(str);
        C4229p c4229p = new C4229p(new C4209a(), interfaceC10857e, uncaughtExceptionHandler, this.f11469i);
        this.f11472l = c4229p;
        Thread.setDefaultUncaughtExceptionHandler(c4229p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m28286z(InterfaceC10857e interfaceC10857e) {
        this.f11464d.m28350b();
        if (m28322H()) {
            C7011f.m19611f().m19606k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C7011f.m19611f().m19608i("Finalizing previously open sessions.");
        try {
            m28291u(true, interfaceC10857e);
            C7011f.m19611f().m19608i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C7011f.m19611f().m19612e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }
}
