package p248n4;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import com.facebook.EnumC2305f;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p248n4.AppEventsLogger;
import p377u4.ActivityLifecycleTracker;
import p415w4.OnDeviceProcessingManager;
import p468yc.C13195u;
import p482z4.FetchedAppGateKeepersManager;
import p482z4.InstallReferrerUtil;
import p482z4.Logger;
import p482z4.Validate;

/* renamed from: n4.h */
/* loaded from: classes.dex */
public final class AppEventsLoggerImpl {

    /* renamed from: c */
    private static final String f20235c;

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f20236d;

    /* renamed from: e */
    private static AppEventsLogger.EnumC7659b f20237e;

    /* renamed from: f */
    private static final Object f20238f;

    /* renamed from: g */
    private static String f20239g;

    /* renamed from: h */
    private static boolean f20240h;

    /* renamed from: i */
    private static String f20241i;

    /* renamed from: j */
    public static final C7660a f20242j = new C7660a(null);

    /* renamed from: a */
    private final String f20243a;

    /* renamed from: b */
    private AccessTokenAppIdPair f20244b;

    /* compiled from: AppEventsLoggerImpl.kt */
    /* renamed from: n4.h$a */
    /* loaded from: classes.dex */
    public static final class C7660a {

        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: n4.h$a$a */
        /* loaded from: classes.dex */
        public static final class C7661a implements InstallReferrerUtil.InterfaceC13644a {
            C7661a() {
            }

            /* renamed from: a */
            public void m17773a(String str) {
                AppEventsLoggerImpl.f20242j.m17774p(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: n4.h$a$b */
        /* loaded from: classes.dex */
        public static final class RunnableC7662b implements Runnable {

            /* renamed from: w */
            final /* synthetic */ Context f20245w;

            /* renamed from: x */
            final /* synthetic */ AppEventsLoggerImpl f20246x;

            RunnableC7662b(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
                this.f20245w = context;
                this.f20246x = appEventsLoggerImpl;
            }

            public final void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.f20245w.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                        sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                        this.f20246x.m17793o("fb_sdk_initialize", null, bundle);
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: n4.h$a$c */
        /* loaded from: classes.dex */
        public static final class RunnableC7663c implements Runnable {

            /* renamed from: w */
            public static final RunnableC7663c f20247w = new RunnableC7663c();

            RunnableC7663c() {
            }

            public final void run() {
                if (CrashShieldHandler.m25963d(this)) {
                    return;
                }
                try {
                    HashSet<String> hashSet = new HashSet();
                    for (AccessTokenAppIdPair accessTokenAppIdPair : AppEventQueue.m17827m()) {
                        hashSet.add(accessTokenAppIdPair.m17863b());
                    }
                    for (String str : hashSet) {
                        FetchedAppSettingsManager.m33985o(str, true);
                    }
                } catch (Throwable th2) {
                    CrashShieldHandler.m25965b(th2, this);
                }
            }
        }

        private C7660a() {
        }

        /* renamed from: a */
        public static final /* synthetic */ void m17789a(C7660a c7660a) {
            c7660a.m17778l();
        }

        /* renamed from: b */
        public static final /* synthetic */ void m17788b(C7660a c7660a, AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            c7660a.m17777m(appEvent, accessTokenAppIdPair);
        }

        /* renamed from: c */
        public static final /* synthetic */ void m17787c(C7660a c7660a, String str) {
            c7660a.m17776n(str);
        }

        /* renamed from: l */
        private final void m17778l() {
            synchronized (AppEventsLoggerImpl.m17803e()) {
                if (AppEventsLoggerImpl.m17806b() != null) {
                    return;
                }
                AppEventsLoggerImpl.m17799i(new ScheduledThreadPoolExecutor(1));
                C13195u c13195u = C13195u.f34156a;
                RunnableC7663c runnableC7663c = RunnableC7663c.f20247w;
                ScheduledThreadPoolExecutor m17806b = AppEventsLoggerImpl.m17806b();
                if (m17806b != null) {
                    m17806b.scheduleAtFixedRate(runnableC7663c, 0L, (long) DateTimeConstants.SECONDS_PER_DAY, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }

        /* renamed from: m */
        private final void m17777m(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
            AppEventQueue.m17832h(accessTokenAppIdPair, appEvent);
            if (FeatureManager.m34002g(FeatureManager.EnumC2317b.OnDevicePostInstallEventProcessing) && OnDeviceProcessingManager.m4702b()) {
                OnDeviceProcessingManager.m4701c(accessTokenAppIdPair.m17863b(), appEvent);
            }
            if (appEvent.m17856c() || AppEventsLoggerImpl.m17802f()) {
                return;
            }
            if (Intrinsics.equals(appEvent.m17853f(), "fb_mobile_activate_app")) {
                AppEventsLoggerImpl.m17801g(true);
            } else {
                Logger.f34697f.m702c(EnumC2305f.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* renamed from: n */
        private final void m17776n(String str) {
            Logger.f34697f.m702c(EnumC2305f.DEVELOPER_ERRORS, "AppEvents", str);
        }

        /* renamed from: d */
        public final void m17786d(Application application, String str) {
            Intrinsics.isThisObjectNull(application, "application");
            if (C2290b.m34095t()) {
                C7645b.m17859d();
                UserDataStore.m17736g();
                if (str == null) {
                    str = C2290b.m34109f();
                }
                C2290b.m34090y(application, str);
                ActivityLifecycleTracker.m6949x(application, str);
                return;
            }
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }

        /* renamed from: e */
        public final void m17785e() {
            if (m17782h() != AppEventsLogger.EnumC7659b.EXPLICIT_ONLY) {
                AppEventQueue.m17829k(EnumC7671j.EAGER_FLUSHING_EVENT);
            }
        }

        /* renamed from: f */
        public final Executor m17784f() {
            if (AppEventsLoggerImpl.m17806b() == null) {
                m17778l();
            }
            ScheduledThreadPoolExecutor m17806b = AppEventsLoggerImpl.m17806b();
            if (m17806b != null) {
                return m17806b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: g */
        public final String m17783g(Context context) {
            Intrinsics.isThisObjectNull(context, "context");
            if (AppEventsLoggerImpl.m17807a() == null) {
                synchronized (AppEventsLoggerImpl.m17803e()) {
                    if (AppEventsLoggerImpl.m17807a() == null) {
                        AppEventsLoggerImpl.m17800h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (AppEventsLoggerImpl.m17807a() == null) {
                            AppEventsLoggerImpl.m17800h("XZ" + UUID.randomUUID().toString());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", AppEventsLoggerImpl.m17807a()).apply();
                        }
                    }
                    C13195u c13195u = C13195u.f34156a;
                }
            }
            String m17807a = AppEventsLoggerImpl.m17807a();
            if (m17807a != null) {
                return m17807a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: h */
        public final AppEventsLogger.EnumC7659b m17782h() {
            AppEventsLogger.EnumC7659b m17805c;
            synchronized (AppEventsLoggerImpl.m17803e()) {
                m17805c = AppEventsLoggerImpl.m17805c();
            }
            return m17805c;
        }

        /* renamed from: i */
        public final String m17781i() {
            InstallReferrerUtil.m722d(new C7661a());
            return C2290b.m34110e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        /* renamed from: j */
        public final String m17780j() {
            String m17804d;
            synchronized (AppEventsLoggerImpl.m17803e()) {
                m17804d = AppEventsLoggerImpl.m17804d();
            }
            return m17804d;
        }

        /* renamed from: k */
        public final void m17779k(Context context, String str) {
            Intrinsics.isThisObjectNull(context, "context");
            if (C2290b.m34106i()) {
                AppEventsLoggerImpl appEventsLoggerImpl = new AppEventsLoggerImpl(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor m17806b = AppEventsLoggerImpl.m17806b();
                if (m17806b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                m17806b.execute(new RunnableC7662b(context, appEventsLoggerImpl));
            }
        }

        /* renamed from: o */
        public final void m17775o() {
            AppEventQueue.m17825o();
        }

        /* renamed from: p */
        public final void m17774p(String str) {
            SharedPreferences sharedPreferences = C2290b.m34110e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }

        public /* synthetic */ C7660a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String canonicalName = AppEventsLoggerImpl.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        Intrinsics.checkIfNull(canonicalName, "AppEventsLoggerImpl::cla…ents.AppEventsLoggerImpl\"");
        f20235c = canonicalName;
        f20237e = AppEventsLogger.EnumC7659b.AUTO;
        f20238f = new Object();
    }

    public AppEventsLoggerImpl(String str, String str2, AccessToken accessToken) {
        Intrinsics.isThisObjectNull(str, "activityName");
        Validate.m669i();
        this.f20243a = str;
        accessToken = accessToken == null ? AccessToken.f6572L.m34232e() : accessToken;
        if (accessToken != null && !accessToken.m34243t() && (str2 == null || Intrinsics.equals(str2, accessToken.m34256b()))) {
            this.f20244b = new AccessTokenAppIdPair(accessToken);
        } else {
            str2 = str2 == null ? Utility.m33937u(C2290b.m34110e()) : str2;
            if (str2 != null) {
                this.f20244b = new AccessTokenAppIdPair(null, str2);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        C7660a.m17789a(f20242j);
    }

    /* renamed from: a */
    public static final /* synthetic */ String m17807a() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f20239g;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m17806b() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f20236d;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ AppEventsLogger.EnumC7659b m17805c() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f20237e;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m17804d() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f20241i;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m17803e() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return null;
        }
        try {
            return f20238f;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m17802f() {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return false;
        }
        try {
            return f20240h;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m17801g(boolean z) {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f20240h = z;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m17800h(String str) {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f20239g = str;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m17799i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (CrashShieldHandler.m25963d(AppEventsLoggerImpl.class)) {
            return;
        }
        try {
            f20236d = scheduledThreadPoolExecutor;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, AppEventsLoggerImpl.class);
        }
    }

    /* renamed from: j */
    public final void m17798j() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            AppEventQueue.m17829k(EnumC7671j.EXPLICIT);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: k */
    public final void m17797k(String str, double d, Bundle bundle) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m17795m(str, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.m6956q());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: l */
    public final void m17796l(String str, Bundle bundle) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m17795m(str, null, bundle, false, ActivityLifecycleTracker.m6956q());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: m */
    public final void m17795m(String str, Double d, Bundle bundle, boolean z, UUID uuid) {
        if (CrashShieldHandler.m25963d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (FetchedAppGateKeepersManager.m749f("app_events_killswitch", C2290b.m34109f(), false)) {
                Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                C7660a.m17788b(f20242j, new AppEvent(this.f20243a, str, d, bundle, z, ActivityLifecycleTracker.m6954s(), uuid), this.f20244b);
            } catch (FacebookException e) {
                Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (JSONException e2) {
                Logger.f34697f.m701d(EnumC2305f.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: n */
    public final void m17794n(String str, String str2) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            m17796l(str, bundle);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: o */
    public final void m17793o(String str, Double d, Bundle bundle) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m17795m(str, d, bundle, true, ActivityLifecycleTracker.m6956q());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: p */
    public final void m17792p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (bigDecimal != null && currency != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                m17795m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, ActivityLifecycleTracker.m6956q());
                return;
            }
            Utility.m33973K(f20235c, "purchaseAmount and currency cannot be null");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: q */
    public final void m17791q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                C7660a.m17787c(f20242j, "purchaseAmount cannot be null");
            } else if (currency == null) {
                C7660a.m17787c(f20242j, "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                m17795m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, ActivityLifecycleTracker.m6956q());
                f20242j.m17785e();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: r */
    public final void m17790r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m17791q(bigDecimal, currency, bundle, true);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    public AppEventsLoggerImpl(Context context, String str, AccessToken accessToken) {
        this(Utility.m33945m(context), str, accessToken);
    }
}
