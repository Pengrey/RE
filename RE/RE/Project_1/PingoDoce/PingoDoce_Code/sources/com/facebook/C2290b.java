package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p027b5.C1817e;
import p076e5.CrashShieldHandler;
import p233m4.AccessTokenManager;
import p233m4.ProfileManager;
import p248n4.AppEventsLogger;
import p248n4.C7664i;
import p377u4.ActivityLifecycleTracker;
import p377u4.AppEventsLoggerUtility;
import p415w4.OnDeviceProcessingManager;
import p482z4.C13649l;
import p482z4.C13656n;
import p482z4.LockOnGetVariable;
import p482z4.Validate;

/* renamed from: com.facebook.b */
/* loaded from: classes.dex */
public final class C2290b {

    /* renamed from: a */
    private static final String f6640a = "com.facebook.b";

    /* renamed from: c */
    private static Executor f6641c;

    /* renamed from: d */
    private static volatile String f6642d;

    /* renamed from: e */
    private static volatile String f6643e;

    /* renamed from: f */
    private static volatile String f6644f;

    /* renamed from: g */
    private static volatile Boolean f6645g;

    /* renamed from: l */
    private static Context f6646l;

    /* renamed from: p */
    public static boolean f6647p;

    /* renamed from: q */
    public static boolean f6648q;

    /* renamed from: b */
    private static final HashSet<EnumC2305f> f6649b = new HashSet<>(Arrays.asList(EnumC2305f.DEVELOPER_ERRORS));

    /* renamed from: h */
    private static volatile String f6650h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f6651i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f6652j = false;

    /* renamed from: k */
    private static boolean f6653k = false;

    /* renamed from: m */
    private static int f6654m = 64206;

    /* renamed from: n */
    private static final Object f6655n = new Object();

    /* renamed from: o */
    private static String f6656o = C13656n.m680a();

    /* renamed from: r */
    private static final AtomicBoolean f6657r = new AtomicBoolean(false);

    /* renamed from: s */
    private static Boolean f6658s = Boolean.FALSE;

    /* renamed from: t */
    private static InterfaceC2299i f6659t = new C2291a();

    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$a */
    /* loaded from: classes.dex */
    static class C2291a implements InterfaceC2299i {
        C2291a() {
        }

        @Override // com.facebook.C2290b.InterfaceC2299i
        /* renamed from: a */
        public GraphRequest mo34086a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC2278b interfaceC2278b) {
            return GraphRequest.m34187x(accessToken, str, jSONObject, interfaceC2278b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$b */
    /* loaded from: classes.dex */
    public static class CallableC2292b implements Callable<File> {
        CallableC2292b() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public File mo34088a() throws Exception {
            return C2290b.f6646l.getCacheDir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$c */
    /* loaded from: classes.dex */
    public static class C2293c implements FeatureManager.InterfaceC2316a {
        C2293c() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public void mo17769a(boolean z) {
            if (z) {
                C1817e.m35309a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$d */
    /* loaded from: classes.dex */
    public static class C2294d implements FeatureManager.InterfaceC2316a {
        C2294d() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public void mo17769a(boolean z) {
            if (z) {
                C7664i.m17772a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$e */
    /* loaded from: classes.dex */
    public static class C2295e implements FeatureManager.InterfaceC2316a {
        C2295e() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public void mo17769a(boolean z) {
            if (z) {
                C2290b.f6647p = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$f */
    /* loaded from: classes.dex */
    public static class C2296f implements FeatureManager.InterfaceC2316a {
        C2296f() {
        }

        @Override // com.facebook.internal.FeatureManager.InterfaceC2316a
        /* renamed from: a */
        public void mo17769a(boolean z) {
            if (z) {
                C2290b.f6648q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$g */
    /* loaded from: classes.dex */
    public static class CallableC2297g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2300j f6660a;

        /* renamed from: b */
        final /* synthetic */ Context f6661b;

        CallableC2297g(InterfaceC2300j interfaceC2300j, Context context) {
            this.f6660a = interfaceC2300j;
            this.f6661b = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void mo34087a() throws Exception {
            AccessTokenManager.m19174h().m19173i();
            ProfileManager.m19119d().m19118e();
            if (AccessToken.m34244s() && Profile.m34124c() == null) {
                Profile.m34125b();
            }
            InterfaceC2300j interfaceC2300j = this.f6660a;
            if (interfaceC2300j != null) {
                interfaceC2300j.m34085a();
            }
            AppEventsLogger.m17817c(C2290b.f6646l, C2290b.f6642d);
            C2307h.m34046m();
            AppEventsLogger.m17815e(this.f6661b.getApplicationContext()).m17819a();
            return null;
        }
    }

    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$h */
    /* loaded from: classes.dex */
    static class RunnableC2298h implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Context f6662w;

        /* renamed from: x */
        final /* synthetic */ String f6663x;

        RunnableC2298h(Context context, String str) {
            this.f6662w = context;
            this.f6663x = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C2290b.m34091x(this.f6662w, this.f6663x);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$i */
    /* loaded from: classes.dex */
    public interface InterfaceC2299i {
        /* renamed from: a */
        GraphRequest mo34086a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC2278b interfaceC2278b);
    }

    /* compiled from: FacebookSdk.java */
    /* renamed from: com.facebook.b$j */
    /* loaded from: classes.dex */
    public interface InterfaceC2300j {
        /* renamed from: a */
        void m34085a();
    }

    @Deprecated
    /* renamed from: A */
    public static synchronized void m34115A(Context context, InterfaceC2300j interfaceC2300j) {
        synchronized (C2290b.class) {
            AtomicBoolean atomicBoolean = f6657r;
            if (atomicBoolean.get()) {
                if (interfaceC2300j != null) {
                    interfaceC2300j.m34085a();
                }
                return;
            }
            Validate.m671g(context, "applicationContext");
            Validate.m676b(context, false);
            Validate.m675c(context, false);
            f6646l = context.getApplicationContext();
            AppEventsLogger.m17818b(context);
            m34092w(f6646l);
            if (!Utility.m33977G(f6642d)) {
                atomicBoolean.set(true);
                if (m34107h()) {
                    m34112c();
                }
                if ((f6646l instanceof Application) && C2307h.m34052g()) {
                    ActivityLifecycleTracker.m6949x((Application) f6646l, f6642d);
                }
                FetchedAppSettingsManager.m33989k();
                C13649l.m689i();
                BoltsMeasurementEventListener.m34011e(f6646l);
                new LockOnGetVariable(new CallableC2292b());
                FeatureManager.m34008a(FeatureManager.EnumC2317b.Instrument, new C2293c());
                FeatureManager.m34008a(FeatureManager.EnumC2317b.AppEvents, new C2294d());
                FeatureManager.m34008a(FeatureManager.EnumC2317b.ChromeCustomTabsPrefetching, new C2295e());
                FeatureManager.m34008a(FeatureManager.EnumC2317b.IgnoreAppSwitchToLoggedOut, new C2296f());
                m34103l().execute(new FutureTask(new CallableC2297g(interfaceC2300j, context)));
                return;
            }
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
    }

    /* renamed from: c */
    public static void m34112c() {
        f6658s = Boolean.TRUE;
    }

    /* renamed from: d */
    public static boolean m34111d() {
        return C2307h.m34054e();
    }

    /* renamed from: e */
    public static Context m34110e() {
        Validate.m669i();
        return f6646l;
    }

    /* renamed from: f */
    public static String m34109f() {
        Validate.m669i();
        return f6642d;
    }

    /* renamed from: g */
    public static String m34108g() {
        Validate.m669i();
        return f6643e;
    }

    /* renamed from: h */
    public static boolean m34107h() {
        return C2307h.m34053f();
    }

    /* renamed from: i */
    public static boolean m34106i() {
        return C2307h.m34052g();
    }

    /* renamed from: j */
    public static String m34105j() {
        Validate.m669i();
        return f6644f;
    }

    /* renamed from: k */
    public static boolean m34104k() {
        return C2307h.m34051h();
    }

    /* renamed from: l */
    public static Executor m34103l() {
        synchronized (f6655n) {
            if (f6641c == null) {
                f6641c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f6641c;
    }

    /* renamed from: m */
    public static String m34102m() {
        Utility.m33973K(f6640a, String.format("getGraphApiVersion: %s", f6656o));
        return f6656o;
    }

    /* renamed from: n */
    public static String m34101n() {
        AccessToken m34255c = AccessToken.m34255c();
        String m34250i = m34255c != null ? m34255c.m34250i() : null;
        if (m34250i == null) {
            return f6650h;
        }
        if (m34250i.equals("gaming")) {
            return f6650h.replace("facebook.com", "fb.gg");
        }
        return f6650h;
    }

    /* renamed from: o */
    public static boolean m34100o(Context context) {
        Validate.m669i();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: p */
    public static long m34099p() {
        Validate.m669i();
        return f6651i.get();
    }

    /* renamed from: q */
    public static String m34098q() {
        return "11.1.1";
    }

    /* renamed from: r */
    public static boolean m34097r() {
        return f6652j;
    }

    /* renamed from: s */
    public static synchronized boolean m34096s() {
        boolean booleanValue;
        synchronized (C2290b.class) {
            booleanValue = f6658s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: t */
    public static boolean m34095t() {
        return f6657r.get();
    }

    /* renamed from: u */
    public static boolean m34094u() {
        return f6653k;
    }

    /* renamed from: v */
    public static boolean m34093v(EnumC2305f enumC2305f) {
        boolean z;
        HashSet<EnumC2305f> hashSet = f6649b;
        synchronized (hashSet) {
            z = m34097r() && hashSet.contains(enumC2305f);
        }
        return z;
    }

    /* renamed from: w */
    static void m34092w(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return;
            }
            if (f6642d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                        f6642d = str.substring(2);
                    } else {
                        f6642d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f6643e == null) {
                f6643e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f6644f == null) {
                f6644f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f6654m == 64206) {
                f6654m = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f6645g == null) {
                f6645g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: x */
    static void m34091x(Context context, String str) {
        if (CrashShieldHandler.m25963d(C2290b.class)) {
            return;
        }
        try {
            try {
                if (context != null && str != null) {
                    AttributionIdentifiers m34029k = AttributionIdentifiers.m34029k(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String str2 = str + "ping";
                    long j = sharedPreferences.getLong(str2, 0L);
                    try {
                        GraphRequest mo34086a = f6659t.mo34086a(null, String.format("%s/activities", str), AppEventsLoggerUtility.m6940a(AppEventsLoggerUtility.EnumC10833a.MOBILE_INSTALL_EVENT, m34029k, AppEventsLogger.m17818b(context), m34100o(context), context), null);
                        if (j == 0 && mo34086a.m34201j().m34083b() == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(str2, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (JSONException e) {
                        throw new FacebookException("An error occurred while publishing install.", e);
                    }
                }
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C2290b.class);
            }
        } catch (Exception e2) {
            Utility.m33974J("Facebook-publish", e2);
        }
    }

    /* renamed from: y */
    public static void m34090y(Context context, String str) {
        if (CrashShieldHandler.m25963d(C2290b.class)) {
            return;
        }
        try {
            m34103l().execute(new RunnableC2298h(context.getApplicationContext(), str));
            if (FeatureManager.m34002g(FeatureManager.EnumC2317b.OnDeviceEventProcessing) && OnDeviceProcessingManager.m4702b()) {
                OnDeviceProcessingManager.m4700d(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2290b.class);
        }
    }

    @Deprecated
    /* renamed from: z */
    public static synchronized void m34089z(Context context) {
        synchronized (C2290b.class) {
            m34115A(context, null);
        }
    }
}
