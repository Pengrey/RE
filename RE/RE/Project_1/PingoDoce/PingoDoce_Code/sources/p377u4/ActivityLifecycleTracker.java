package p377u4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C2290b;
import com.facebook.EnumC2305f;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.joda.time.DateTimeConstants;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p264o4.C8014a;
import p289p4.C8416b;
import p350s4.C10059f;
import p460y4.C13103d;
import p468yc.C13195u;
import p482z4.FetchedAppSettings;
import p482z4.Logger;

/* renamed from: u4.a */
/* loaded from: classes.dex */
public final class ActivityLifecycleTracker {

    /* renamed from: a */
    private static final String f27980a;

    /* renamed from: b */
    private static final ScheduledExecutorService f27981b;

    /* renamed from: c */
    private static volatile ScheduledFuture f27982c;

    /* renamed from: d */
    private static final Object f27983d;

    /* renamed from: e */
    private static final AtomicInteger f27984e;

    /* renamed from: f */
    private static volatile SessionInfo f27985f;

    /* renamed from: g */
    private static final AtomicBoolean f27986g;

    /* renamed from: h */
    private static String f27987h;

    /* renamed from: i */
    private static long f27988i;

    /* renamed from: j */
    private static int f27989j;

    /* renamed from: k */
    private static WeakReference f27990k;

    /* renamed from: l */
    public static final ActivityLifecycleTracker f27991l = new ActivityLifecycleTracker();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: u4.a$a */
    /* loaded from: classes.dex */
    public static final class RunnableC10827a implements Runnable {

        /* renamed from: w */
        public static final RunnableC10827a f27992w = new RunnableC10827a();

        RunnableC10827a() {
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
                if (ActivityLifecycleTracker.m6968e(activityLifecycleTracker) == null) {
                    ActivityLifecycleTracker.m6959n(activityLifecycleTracker, SessionInfo.f28017g.m6908b());
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: u4.a$b */
    /* loaded from: classes.dex */
    public static final class RunnableC10828b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ long f27993w;

        /* renamed from: x */
        final /* synthetic */ String f27994x;

        /* compiled from: ActivityLifecycleTracker.kt */
        /* renamed from: u4.a$b$a */
        /* loaded from: classes.dex */
        static final class RunnableC10829a implements Runnable {
            RunnableC10829a() {
            }

            public final void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
                    if (ActivityLifecycleTracker.m6968e(activityLifecycleTracker) == null) {
                        ActivityLifecycleTracker.m6959n(activityLifecycleTracker, new SessionInfo(Long.valueOf(RunnableC10828b.this.f27993w), null, null, 4, null));
                    }
                    if (ActivityLifecycleTracker.m6967f(activityLifecycleTracker).get() <= 0) {
                        SessionLogger.m6903e(RunnableC10828b.this.f27994x, ActivityLifecycleTracker.m6968e(activityLifecycleTracker), ActivityLifecycleTracker.m6971b(activityLifecycleTracker));
                        SessionInfo.f28017g.m6909a();
                        ActivityLifecycleTracker.m6959n(activityLifecycleTracker, null);
                    }
                    synchronized (ActivityLifecycleTracker.m6969d(activityLifecycleTracker)) {
                        ActivityLifecycleTracker.m6960m(activityLifecycleTracker, null);
                        C13195u c13195u = C13195u.f34156a;
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        RunnableC10828b(long j, String str) {
            this.f27993w = j;
            this.f27994x = str;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
                if (ActivityLifecycleTracker.m6968e(activityLifecycleTracker) == null) {
                    ActivityLifecycleTracker.m6959n(activityLifecycleTracker, new SessionInfo(Long.valueOf(this.f27993w), null, null, 4, null));
                }
                SessionInfo m6968e = ActivityLifecycleTracker.m6968e(activityLifecycleTracker);
                if (m6968e != null) {
                    m6968e.m6912k(Long.valueOf(this.f27993w));
                }
                if (ActivityLifecycleTracker.m6967f(activityLifecycleTracker).get() <= 0) {
                    RunnableC10829a runnableC10829a = new RunnableC10829a();
                    synchronized (ActivityLifecycleTracker.m6969d(activityLifecycleTracker)) {
                        ActivityLifecycleTracker.m6960m(activityLifecycleTracker, ActivityLifecycleTracker.m6965h(activityLifecycleTracker).schedule(runnableC10829a, ActivityLifecycleTracker.m6966g(activityLifecycleTracker), TimeUnit.SECONDS));
                        C13195u c13195u = C13195u.f34156a;
                    }
                }
                long m6970c = ActivityLifecycleTracker.m6970c(activityLifecycleTracker);
                AutomaticAnalyticsLogger.m6935e(this.f27994x, m6970c > 0 ? (this.f27993w - m6970c) / ((long) DateTimeConstants.MILLIS_PER_SECOND) : 0L);
                SessionInfo m6968e2 = ActivityLifecycleTracker.m6968e(activityLifecycleTracker);
                if (m6968e2 != null) {
                    m6968e2.m6910m();
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: u4.a$c */
    /* loaded from: classes.dex */
    public static final class RunnableC10830c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ long f27996w;

        /* renamed from: x */
        final /* synthetic */ String f27997x;

        /* renamed from: y */
        final /* synthetic */ Context f27998y;

        RunnableC10830c(long j, String str, Context context) {
            this.f27996w = j;
            this.f27997x = str;
            this.f27998y = context;
        }

        public final void run() {
            SessionInfo m6968e;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
                SessionInfo m6968e2 = ActivityLifecycleTracker.m6968e(activityLifecycleTracker);
                Long m6918e = m6968e2 != null ? m6968e2.m6918e() : null;
                if (ActivityLifecycleTracker.m6968e(activityLifecycleTracker) == null) {
                    ActivityLifecycleTracker.m6959n(activityLifecycleTracker, new SessionInfo(Long.valueOf(this.f27996w), null, null, 4, null));
                    String str = this.f27997x;
                    String m6971b = ActivityLifecycleTracker.m6971b(activityLifecycleTracker);
                    Context context = this.f27998y;
                    Intrinsics.checkIfNull(context, "appContext");
                    SessionLogger.m6905c(str, null, m6971b, context);
                } else if (m6918e != null) {
                    long longValue = this.f27996w - m6918e.longValue();
                    if (longValue > ActivityLifecycleTracker.m6966g(activityLifecycleTracker) * DateTimeConstants.MILLIS_PER_SECOND) {
                        SessionLogger.m6903e(this.f27997x, ActivityLifecycleTracker.m6968e(activityLifecycleTracker), ActivityLifecycleTracker.m6971b(activityLifecycleTracker));
                        String str2 = this.f27997x;
                        String m6971b2 = ActivityLifecycleTracker.m6971b(activityLifecycleTracker);
                        Context context2 = this.f27998y;
                        Intrinsics.checkIfNull(context2, "appContext");
                        SessionLogger.m6905c(str2, null, m6971b2, context2);
                        ActivityLifecycleTracker.m6959n(activityLifecycleTracker, new SessionInfo(Long.valueOf(this.f27996w), null, null, 4, null));
                    } else if (longValue > 1000 && (m6968e = ActivityLifecycleTracker.m6968e(activityLifecycleTracker)) != null) {
                        m6968e.m6915h();
                    }
                }
                SessionInfo m6968e3 = ActivityLifecycleTracker.m6968e(activityLifecycleTracker);
                if (m6968e3 != null) {
                    m6968e3.m6912k(Long.valueOf(this.f27996w));
                }
                SessionInfo m6968e4 = ActivityLifecycleTracker.m6968e(activityLifecycleTracker);
                if (m6968e4 != null) {
                    m6968e4.m6910m();
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: u4.a$d */
    /* loaded from: classes.dex */
    public static final class C10831d implements FeatureManager.InterfaceC2316a {

        /* renamed from: a */
        public static final C10831d f27999a = new C10831d();

        C10831d() {
        }

        /* renamed from: a */
        public final void mo17769a(boolean z) {
            if (z) {
                C8416b.m15456h();
            } else {
                C8416b.m15457g();
            }
        }
    }

    /* compiled from: ActivityLifecycleTracker.kt */
    /* renamed from: u4.a$e */
    /* loaded from: classes.dex */
    public static final class C10832e implements Application.ActivityLifecycleCallbacks {
        C10832e() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Logger.f34697f.m702c(EnumC2305f.APP_EVENTS, ActivityLifecycleTracker.m6964i(ActivityLifecycleTracker.f27991l), "onActivityCreated");
            AppEventUtility.m6947a();
            ActivityLifecycleTracker.m6953t(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Logger.C13648a c13648a = Logger.f34697f;
            EnumC2305f enumC2305f = EnumC2305f.APP_EVENTS;
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
            c13648a.m702c(enumC2305f, ActivityLifecycleTracker.m6964i(activityLifecycleTracker), "onActivityDestroyed");
            ActivityLifecycleTracker.m6963j(activityLifecycleTracker, activity);
        }

        public void onActivityPaused(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Logger.C13648a c13648a = Logger.f34697f;
            EnumC2305f enumC2305f = EnumC2305f.APP_EVENTS;
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
            c13648a.m702c(enumC2305f, ActivityLifecycleTracker.m6964i(activityLifecycleTracker), "onActivityPaused");
            AppEventUtility.m6947a();
            ActivityLifecycleTracker.m6962k(activityLifecycleTracker, activity);
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Logger.f34697f.m702c(EnumC2305f.APP_EVENTS, ActivityLifecycleTracker.m6964i(ActivityLifecycleTracker.f27991l), "onActivityResumed");
            AppEventUtility.m6947a();
            ActivityLifecycleTracker.m6950w(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Intrinsics.isThisObjectNull(bundle, "outState");
            Logger.f34697f.m702c(EnumC2305f.APP_EVENTS, ActivityLifecycleTracker.m6964i(ActivityLifecycleTracker.f27991l), "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
            ActivityLifecycleTracker.m6961l(activityLifecycleTracker, ActivityLifecycleTracker.m6972a(activityLifecycleTracker) + 1);
            Logger.f34697f.m702c(EnumC2305f.APP_EVENTS, ActivityLifecycleTracker.m6964i(activityLifecycleTracker), "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            Logger.C13648a c13648a = Logger.f34697f;
            EnumC2305f enumC2305f = EnumC2305f.APP_EVENTS;
            ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27991l;
            c13648a.m702c(enumC2305f, ActivityLifecycleTracker.m6964i(activityLifecycleTracker), "onActivityStopped");
            AppEventsLogger.f20233b.m17808g();
            ActivityLifecycleTracker.m6961l(activityLifecycleTracker, ActivityLifecycleTracker.m6972a(activityLifecycleTracker) - 1);
        }
    }

    static {
        String canonicalName = ActivityLifecycleTracker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f27980a = canonicalName;
        f27981b = Executors.newSingleThreadScheduledExecutor();
        f27983d = new Object();
        f27984e = new AtomicInteger(0);
        f27986g = new AtomicBoolean(false);
    }

    private ActivityLifecycleTracker() {
    }

    /* renamed from: a */
    public static final /* synthetic */ int m6972a(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27989j;
    }

    /* renamed from: b */
    public static final /* synthetic */ String m6971b(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27987h;
    }

    /* renamed from: c */
    public static final /* synthetic */ long m6970c(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27988i;
    }

    /* renamed from: d */
    public static final /* synthetic */ Object m6969d(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27983d;
    }

    /* renamed from: e */
    public static final /* synthetic */ SessionInfo m6968e(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27985f;
    }

    /* renamed from: f */
    public static final /* synthetic */ AtomicInteger m6967f(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27984e;
    }

    /* renamed from: g */
    public static final /* synthetic */ int m6966g(ActivityLifecycleTracker activityLifecycleTracker) {
        return activityLifecycleTracker.m6955r();
    }

    /* renamed from: h */
    public static final /* synthetic */ ScheduledExecutorService m6965h(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27981b;
    }

    /* renamed from: i */
    public static final /* synthetic */ String m6964i(ActivityLifecycleTracker activityLifecycleTracker) {
        return f27980a;
    }

    /* renamed from: j */
    public static final /* synthetic */ void m6963j(ActivityLifecycleTracker activityLifecycleTracker, Activity activity) {
        activityLifecycleTracker.m6952u(activity);
    }

    /* renamed from: k */
    public static final /* synthetic */ void m6962k(ActivityLifecycleTracker activityLifecycleTracker, Activity activity) {
        activityLifecycleTracker.m6951v(activity);
    }

    /* renamed from: l */
    public static final /* synthetic */ void m6961l(ActivityLifecycleTracker activityLifecycleTracker, int i) {
        f27989j = i;
    }

    /* renamed from: m */
    public static final /* synthetic */ void m6960m(ActivityLifecycleTracker activityLifecycleTracker, ScheduledFuture scheduledFuture) {
        f27982c = scheduledFuture;
    }

    /* renamed from: n */
    public static final /* synthetic */ void m6959n(ActivityLifecycleTracker activityLifecycleTracker, SessionInfo sessionInfo) {
        f27985f = sessionInfo;
    }

    /* renamed from: o */
    private final void m6958o() {
        ScheduledFuture scheduledFuture;
        synchronized (f27983d) {
            if (f27982c != null && (scheduledFuture = f27982c) != null) {
                scheduledFuture.cancel(false);
            }
            f27982c = null;
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: p */
    public static final Activity m6957p() {
        WeakReference weakReference = f27990k;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: q */
    public static final UUID m6956q() {
        SessionInfo sessionInfo;
        if (f27985f == null || (sessionInfo = f27985f) == null) {
            return null;
        }
        return sessionInfo.m6919d();
    }

    /* renamed from: r */
    private final int m6955r() {
        FetchedAppSettings m33990j = FetchedAppSettingsManager.m33990j(C2290b.m34109f());
        if (m33990j != null) {
            return m33990j.m732i();
        }
        return C10835e.m6930a();
    }

    /* renamed from: s */
    public static final boolean m6954s() {
        return f27989j == 0;
    }

    /* renamed from: t */
    public static final void m6953t(Activity activity) {
        f27981b.execute(RunnableC10827a.f27992w);
    }

    /* renamed from: u */
    private final void m6952u(Activity activity) {
        C8416b.m15452l(activity);
    }

    /* renamed from: v */
    private final void m6951v(Activity activity) {
        AtomicInteger atomicInteger = f27984e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f27980a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m6958o();
        long currentTimeMillis = System.currentTimeMillis();
        String m33945m = Utility.m33945m(activity);
        C8416b.m15451m(activity);
        f27981b.execute(new RunnableC10828b(currentTimeMillis, m33945m));
    }

    /* renamed from: w */
    public static final void m6950w(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "activity");
        f27990k = new WeakReference(activity);
        f27984e.incrementAndGet();
        f27991l.m6958o();
        long currentTimeMillis = System.currentTimeMillis();
        f27988i = currentTimeMillis;
        String m33945m = Utility.m33945m(activity);
        C8416b.m15450n(activity);
        C8014a.m17169d(activity);
        C13103d.m1600h(activity);
        C10059f.m9286b();
        f27981b.execute(new RunnableC10830c(currentTimeMillis, m33945m, activity.getApplicationContext()));
    }

    /* renamed from: x */
    public static final void m6949x(Application application, String str) {
        Intrinsics.isThisObjectNull(application, "application");
        if (f27986g.compareAndSet(false, true)) {
            FeatureManager.m34008a(FeatureManager.EnumC2317b.CodelessEvents, C10831d.f27999a);
            f27987h = str;
            application.registerActivityLifecycleCallbacks(new C10832e());
        }
    }
}
