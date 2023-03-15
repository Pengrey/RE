package p460y4;

import android.app.Activity;
import com.facebook.C2290b;
import com.facebook.internal.FetchedAppSettingsManager;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p377u4.ActivityLifecycleTracker;
import p397v4.ModelManager;
import p482z4.FetchedAppSettings;

/* renamed from: y4.d */
/* loaded from: classes.dex */
public final class C13103d {

    /* renamed from: a */
    private static final AtomicBoolean f34065a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Set<String> f34066b = new HashSet();

    /* renamed from: c */
    private static final Set<String> f34067c = new HashSet();

    /* compiled from: SuggestedEventsManager.java */
    /* renamed from: y4.d$a */
    /* loaded from: classes.dex */
    static class RunnableC13104a implements Runnable {
        RunnableC13104a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                if (C13103d.m1607a().get()) {
                    return;
                }
                C13103d.m1607a().set(true);
                C13103d.m1606b();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ AtomicBoolean m1607a() {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return null;
        }
        try {
            return f34065a;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m1606b() {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return;
        }
        try {
            m1604d();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
        }
    }

    /* renamed from: c */
    public static synchronized void m1605c() {
        synchronized (C13103d.class) {
            if (CrashShieldHandler.m25963d(C13103d.class)) {
                return;
            }
            C2290b.m34103l().execute(new RunnableC13104a());
        }
    }

    /* renamed from: d */
    private static void m1604d() {
        String m731j;
        File m6088j;
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return;
        }
        try {
            FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(C2290b.m34109f(), false);
            if (m33985o == null || (m731j = m33985o.m731j()) == null) {
                return;
            }
            m1601g(m731j);
            if ((f34066b.isEmpty() && f34067c.isEmpty()) || (m6088j = ModelManager.m6088j(ModelManager.EnumC11117a.MTML_APP_EVENT_PREDICTION)) == null) {
                return;
            }
            C13100a.m1627d(m6088j);
            Activity m6957p = ActivityLifecycleTracker.m6957p();
            if (m6957p != null) {
                m1600h(m6957p);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m1603e(String str) {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return false;
        }
        try {
            return f34067c.contains(str);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m1602f(String str) {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return false;
        }
        try {
            return f34066b.contains(str);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
            return false;
        }
    }

    /* renamed from: g */
    protected static void m1601g(String str) {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                for (int i = 0; i < jSONArray.length(); i++) {
                    f34066b.add(jSONArray.getString(i));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    f34067c.add(jSONArray2.getString(i2));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
        }
    }

    /* renamed from: h */
    public static void m1600h(Activity activity) {
        if (CrashShieldHandler.m25963d(C13103d.class)) {
            return;
        }
        try {
            if (f34065a.get() && C13100a.m1625f() && (!f34066b.isEmpty() || !f34067c.isEmpty())) {
                ViewTreeObserver$OnGlobalLayoutListenerC13105e.m1596d(activity);
            } else {
                ViewTreeObserver$OnGlobalLayoutListenerC13105e.m1594f(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13103d.class);
        }
    }
}
