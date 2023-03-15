package p289p4;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.C2290b;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p289p4.C8434f;
import p377u4.AppEventUtility;
import p482z4.FetchedAppSettings;

/* renamed from: p4.b */
/* loaded from: classes.dex */
public final class C8416b {

    /* renamed from: b */
    private static SensorManager f21785b;

    /* renamed from: c */
    private static C8428e f21786c;

    /* renamed from: d */
    private static String f21787d;

    /* renamed from: a */
    private static final C8434f f21788a = new C8434f();

    /* renamed from: e */
    private static final AtomicBoolean f21789e = new AtomicBoolean(true);

    /* renamed from: f */
    private static final AtomicBoolean f21790f = new AtomicBoolean(false);

    /* renamed from: g */
    private static volatile Boolean f21791g = Boolean.FALSE;

    /* renamed from: h */
    private static InterfaceC8420d f21792h = new C8417a();

    /* compiled from: CodelessManager.java */
    /* renamed from: p4.b$a */
    /* loaded from: classes.dex */
    static class C8417a implements InterfaceC8420d {
        C8417a() {
        }

        @Override // p289p4.C8416b.InterfaceC8420d
        /* renamed from: a */
        public void mo15448a(String str) {
            C8416b.m15458f(str);
        }
    }

    /* compiled from: CodelessManager.java */
    /* renamed from: p4.b$b */
    /* loaded from: classes.dex */
    static class C8418b implements C8434f.InterfaceC8435a {

        /* renamed from: a */
        final /* synthetic */ FetchedAppSettings f21793a;

        /* renamed from: b */
        final /* synthetic */ String f21794b;

        C8418b(FetchedAppSettings fetchedAppSettings, String str) {
            this.f21793a = fetchedAppSettings;
            this.f21794b = str;
        }

        @Override // p289p4.C8434f.InterfaceC8435a
        /* renamed from: a */
        public void mo15408a() {
            FetchedAppSettings fetchedAppSettings = this.f21793a;
            boolean z = fetchedAppSettings != null && fetchedAppSettings.m739b();
            boolean z2 = C2290b.m34104k();
            if (z && z2) {
                C8416b.m15463a().mo15448a(this.f21794b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessManager.java */
    /* renamed from: p4.b$c */
    /* loaded from: classes.dex */
    public static class RunnableC8419c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f21795w;

        RunnableC8419c(String str) {
            this.f21795w = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                boolean z = true;
                GraphRequest m34187x = GraphRequest.m34187x(null, String.format(Locale.US, "%s/app_indexing_session", this.f21795w), null, null);
                Bundle m34193r = m34187x.m34193r();
                if (m34193r == null) {
                    m34193r = new Bundle();
                }
                AttributionIdentifiers m34029k = AttributionIdentifiers.m34029k(C2290b.m34110e());
                JSONArray jSONArray = new JSONArray();
                String str = Build.MODEL;
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                jSONArray.put(str);
                if (m34029k != null && m34029k.m34032h() != null) {
                    jSONArray.put(m34029k.m34032h());
                } else {
                    jSONArray.put(BuildConfig.VERSION_NAME);
                }
                jSONArray.put("0");
                jSONArray.put(AppEventUtility.m6942f() ? "1" : "0");
                Locale m33941q = Utility.m33941q();
                jSONArray.put(m33941q.getLanguage() + "_" + m33941q.getCountry());
                String jSONArray2 = jSONArray.toString();
                m34193r.putString("device_session_id", C8416b.m15455i());
                m34193r.putString("extinfo", jSONArray2);
                m34187x.m34213C(m34193r);
                JSONObject m34082c = m34187x.m34201j().m34082c();
                AtomicBoolean m15462b = C8416b.m15462b();
                if (m34082c == null || !m34082c.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                m15462b.set(z);
                if (!C8416b.m15462b().get()) {
                    C8416b.m15461c(null);
                } else if (C8416b.m15460d() != null) {
                    C8416b.m15460d().m15414k();
                }
                C8416b.m15459e(Boolean.FALSE);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* compiled from: CodelessManager.java */
    /* renamed from: p4.b$d */
    /* loaded from: classes.dex */
    public interface InterfaceC8420d {
        /* renamed from: a */
        void mo15448a(String str);
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC8420d m15463a() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            return f21792h;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ AtomicBoolean m15462b() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            return f21790f;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ String m15461c(String str) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            f21787d = str;
            return str;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ C8428e m15460d() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            return f21786c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m15459e(Boolean bool) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            f21791g = bool;
            return bool;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* renamed from: f */
    static void m15458f(String str) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            if (f21791g.booleanValue()) {
                return;
            }
            f21791g = Boolean.TRUE;
            C2290b.m34103l().execute(new RunnableC8419c(str));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* renamed from: g */
    public static void m15457g() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            f21789e.set(false);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* renamed from: h */
    public static void m15456h() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            f21789e.set(true);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static String m15455i() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return null;
        }
        try {
            if (f21787d == null) {
                f21787d = UUID.randomUUID().toString();
            }
            return f21787d;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m15454j() {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return false;
        }
        try {
            return f21790f.get();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
            return false;
        }
    }

    /* renamed from: k */
    static boolean m15453k() {
        CrashShieldHandler.m25963d(C8416b.class);
        return false;
    }

    /* renamed from: l */
    public static void m15452l(Activity activity) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            C8421c.m15443e().m15444d(activity);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* renamed from: m */
    public static void m15451m(Activity activity) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            if (f21789e.get()) {
                C8421c.m15443e().m15440h(activity);
                C8428e c8428e = f21786c;
                if (c8428e != null) {
                    c8428e.m15412m();
                }
                SensorManager sensorManager = f21785b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(f21788a);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* renamed from: n */
    public static void m15450n(Activity activity) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            if (f21789e.get()) {
                C8421c.m15443e().m15445c(activity);
                Context applicationContext = activity.getApplicationContext();
                String m34109f = C2290b.m34109f();
                FetchedAppSettings m33990j = FetchedAppSettingsManager.m33990j(m34109f);
                if ((m33990j != null && m33990j.m739b()) || m15453k()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    f21785b = sensorManager;
                    if (sensorManager == null) {
                        return;
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    f21786c = new C8428e(activity);
                    C8434f c8434f = f21788a;
                    c8434f.m15409a(new C8418b(m33990j, m34109f));
                    f21785b.registerListener(c8434f, defaultSensor, 2);
                    if (m33990j != null && m33990j.m739b()) {
                        f21786c.m15414k();
                    }
                }
                if (!m15453k() || f21790f.get()) {
                    return;
                }
                f21792h.mo15448a(m34109f);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m15449o(Boolean bool) {
        if (CrashShieldHandler.m25963d(C8416b.class)) {
            return;
        }
        try {
            f21790f.set(bool.booleanValue());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8416b.class);
        }
    }
}
