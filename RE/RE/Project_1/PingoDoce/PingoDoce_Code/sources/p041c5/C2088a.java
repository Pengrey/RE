package p041c5;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.C2290b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p027b5.InstrumentData;
import p027b5.InstrumentUtility;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;

/* renamed from: c5.a */
/* loaded from: classes.dex */
public final class C2088a {

    /* renamed from: a */
    private static final int f6068a;

    /* renamed from: b */
    private static final ScheduledExecutorService f6069b;

    /* renamed from: c */
    private static String f6070c;

    /* renamed from: d */
    private static final Runnable f6071d;

    /* compiled from: ANRDetector.kt */
    /* renamed from: c5.a$a */
    /* loaded from: classes.dex */
    static final class RunnableC2089a implements Runnable {

        /* renamed from: w */
        public static final RunnableC2089a f6072w = new RunnableC2089a();

        RunnableC2089a() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                Object systemService = C2290b.m34110e().getSystemService("activity");
                if (systemService != null) {
                    C2088a.m34703a((ActivityManager) systemService);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception unused) {
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        new C2088a();
        f6068a = Process.myUid();
        f6069b = Executors.newSingleThreadScheduledExecutor();
        f6070c = BuildConfig.VERSION_NAME;
        f6071d = RunnableC2089a.f6072w;
    }

    private C2088a() {
    }

    /* renamed from: a */
    public static final void m34703a(ActivityManager activityManager) {
        if (CrashShieldHandler.m25963d(C2088a.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f6068a) {
                        Looper mainLooper = Looper.getMainLooper();
                        Intrinsics.checkIfNull(mainLooper, "Looper.getMainLooper()");
                        Thread thread = mainLooper.getThread();
                        Intrinsics.checkIfNull(thread, "Looper.getMainLooper().thread");
                        String m35305d = InstrumentUtility.m35305d(thread);
                        if (!Intrinsics.equals(m35305d, f6070c) && InstrumentUtility.m35302g(thread)) {
                            f6070c = m35305d;
                            InstrumentData.C1812a.m35315a(processErrorStateInfo.shortMsg, m35305d).m35316g();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2088a.class);
        }
    }

    /* renamed from: b */
    public static final void m34702b() {
        if (CrashShieldHandler.m25963d(C2088a.class)) {
            return;
        }
        try {
            f6069b.scheduleAtFixedRate(f6071d, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2088a.class);
        }
    }
}
