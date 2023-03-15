package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p248n4.InternalAppEventsLogger;
import p482z4.FetchedAppSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.facebook.h */
/* loaded from: classes.dex */
public final class C2307h {

    /* renamed from: a */
    private static final String f6685a = "com.facebook.h";

    /* renamed from: b */
    private static AtomicBoolean f6686b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f6687c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C2309b f6688d = new C2309b(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C2309b f6689e = new C2309b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    private static C2309b f6690f = new C2309b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    private static C2309b f6691g = new C2309b(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static C2309b f6692h = new C2309b(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    private static SharedPreferences f6693i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserSettingsManager.java */
    /* renamed from: com.facebook.h$a */
    /* loaded from: classes.dex */
    public static class RunnableC2308a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ long f6694w;

        RunnableC2308a(long j) {
            this.f6694w = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            FetchedAppSettings m33985o;
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                if (C2307h.m34058a().m34040a() && (m33985o = FetchedAppSettingsManager.m33985o(C2290b.m34109f(), false)) != null && m33985o.m739b()) {
                    AttributionIdentifiers m34029k = AttributionIdentifiers.m34029k(C2290b.m34110e());
                    if (((m34029k == null || m34029k.m34032h() == null) ? null : m34029k.m34032h()) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", m34029k.m34032h());
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest m34188w = GraphRequest.m34188w(null, C2290b.m34109f(), null);
                        m34188w.m34212D(true);
                        m34188w.m34213C(bundle);
                        JSONObject m34082c = m34188w.m34201j().m34082c();
                        if (m34082c != null) {
                            C2307h.m34057b().f6696b = Boolean.valueOf(m34082c.optBoolean("auto_event_setup_enabled", false));
                            C2307h.m34057b().f6698d = this.f6694w;
                            C2307h.m34056c(C2307h.m34057b());
                        }
                    }
                }
                C2307h.m34055d().set(false);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserSettingsManager.java */
    /* renamed from: com.facebook.h$b */
    /* loaded from: classes.dex */
    public static class C2309b {

        /* renamed from: a */
        String f6695a;

        /* renamed from: b */
        Boolean f6696b;

        /* renamed from: c */
        boolean f6697c;

        /* renamed from: d */
        long f6698d;

        C2309b(boolean z, String str) {
            this.f6697c = z;
            this.f6695a = str;
        }

        /* renamed from: a */
        boolean m34040a() {
            Boolean bool = this.f6696b;
            return bool == null ? this.f6697c : bool.booleanValue();
        }
    }

    C2307h() {
    }

    /* renamed from: a */
    static /* synthetic */ C2309b m34058a() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return null;
        }
        try {
            return f6690f;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ C2309b m34057b() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return null;
        }
        try {
            return f6691g;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m34056c(C2309b c2309b) {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            m34041r(c2309b);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: d */
    static /* synthetic */ AtomicBoolean m34055d() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return null;
        }
        try {
            return f6687c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m34054e() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return false;
        }
        try {
            m34049j();
            return f6690f.m34040a();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m34053f() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return false;
        }
        try {
            m34049j();
            return f6688d.m34040a();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m34052g() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return false;
        }
        try {
            m34049j();
            return f6689e.m34040a();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m34051h() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return false;
        }
        try {
            m34049j();
            return f6691g.m34040a();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
            return false;
        }
    }

    /* renamed from: i */
    private static void m34050i() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            m34043p(f6691g);
            long currentTimeMillis = System.currentTimeMillis();
            C2309b c2309b = f6691g;
            if (c2309b.f6696b == null || currentTimeMillis - c2309b.f6698d >= 604800000) {
                c2309b.f6696b = null;
                c2309b.f6698d = 0L;
                if (f6687c.compareAndSet(false, true)) {
                    C2290b.m34103l().execute(new RunnableC2308a(currentTimeMillis));
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: j */
    public static void m34049j() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            if (C2290b.m34095t() && f6686b.compareAndSet(false, true)) {
                f6693i = C2290b.m34110e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                m34048k(f6689e, f6690f, f6688d);
                m34050i();
                m34044o();
                m34045n();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: k */
    private static void m34048k(C2309b... c2309bArr) {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        for (C2309b c2309b : c2309bArr) {
            try {
                if (c2309b == f6691g) {
                    m34050i();
                } else if (c2309b.f6696b == null) {
                    m34043p(c2309b);
                    if (c2309b.f6696b == null) {
                        m34047l(c2309b);
                    }
                } else {
                    m34041r(c2309b);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C2307h.class);
                return;
            }
        }
    }

    /* renamed from: l */
    private static void m34047l(C2309b c2309b) {
        Bundle bundle;
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            m34042q();
            try {
                Context m34110e = C2290b.m34110e();
                ApplicationInfo applicationInfo = m34110e.getPackageManager().getApplicationInfo(m34110e.getPackageName(), 128);
                if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(c2309b.f6695a)) {
                    return;
                }
                c2309b.f6696b = Boolean.valueOf(applicationInfo.metaData.getBoolean(c2309b.f6695a, c2309b.f6697c));
            } catch (PackageManager.NameNotFoundException e) {
                Utility.m33974J(f6685a, e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static void m34046m() {
        Bundle bundle;
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            Context m34110e = C2290b.m34110e();
            ApplicationInfo applicationInfo = m34110e.getPackageManager().getApplicationInfo(m34110e.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(m34110e);
            Bundle bundle2 = new Bundle();
            if (!Utility.m33980D()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f6685a, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            internalAppEventsLogger.m17760e("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: n */
    private static void m34045n() {
        int i;
        ApplicationInfo applicationInfo;
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            if (f6686b.get() && C2290b.m34095t()) {
                Context m34110e = C2290b.m34110e();
                int i2 = 0;
                int i3 = ((f6688d.m34040a() ? 1 : 0) << 0) | 0 | ((f6689e.m34040a() ? 1 : 0) << 1) | ((f6690f.m34040a() ? 1 : 0) << 2) | ((f6692h.m34040a() ? 1 : 0) << 3);
                int i4 = f6693i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i4 != i3) {
                    f6693i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).commit();
                    try {
                        applicationInfo = m34110e.getPackageManager().getApplicationInfo(m34110e.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo != null && applicationInfo.metaData != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < 4; i6++) {
                            try {
                                i5 |= (applicationInfo.metaData.containsKey(strArr[i6]) ? 1 : 0) << i6;
                                i |= (applicationInfo.metaData.getBoolean(strArr[i6], zArr[i6]) ? 1 : 0) << i6;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        i2 = i5;
                        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(m34110e);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i2);
                        bundle.putInt("initial", i);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        internalAppEventsLogger.m17762c(bundle);
                    }
                    i = 0;
                    InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(m34110e);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i2);
                    bundle2.putInt("initial", i);
                    bundle2.putInt("previous", i4);
                    bundle2.putInt("current", i3);
                    internalAppEventsLogger2.m17762c(bundle2);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: o */
    private static void m34044o() {
        Bundle bundle;
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            Context m34110e = C2290b.m34110e();
            ApplicationInfo applicationInfo = m34110e.getPackageManager().getApplicationInfo(m34110e.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return;
            }
            if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                Log.w(f6685a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                Log.w(f6685a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
            }
            if (m34054e()) {
                return;
            }
            Log.w(f6685a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: p */
    private static void m34043p(C2309b c2309b) {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            m34042q();
            try {
                String string = f6693i.getString(c2309b.f6695a, BuildConfig.VERSION_NAME);
                if (string.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string);
                c2309b.f6696b = Boolean.valueOf(jSONObject.getBoolean("value"));
                c2309b.f6698d = jSONObject.getLong("last_timestamp");
            } catch (JSONException e) {
                Utility.m33974J(f6685a, e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: q */
    private static void m34042q() {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            if (f6686b.get()) {
                return;
            }
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }

    /* renamed from: r */
    private static void m34041r(C2309b c2309b) {
        if (CrashShieldHandler.m25963d(C2307h.class)) {
            return;
        }
        try {
            m34042q();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", c2309b.f6696b);
                jSONObject.put("last_timestamp", c2309b.f6698d);
                f6693i.edit().putString(c2309b.f6695a, jSONObject.toString()).commit();
                m34045n();
            } catch (Exception e) {
                Utility.m33974J(f6685a, e);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C2307h.class);
        }
    }
}
