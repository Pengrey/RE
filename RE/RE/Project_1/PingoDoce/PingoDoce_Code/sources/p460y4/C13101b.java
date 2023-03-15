package p460y4;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p306q4.C9655f;

/* renamed from: y4.b */
/* loaded from: classes.dex */
final class C13101b {

    /* renamed from: b */
    private static SharedPreferences f34062b;

    /* renamed from: a */
    private static final Map<String, String> f34061a = new HashMap();

    /* renamed from: c */
    private static final AtomicBoolean f34063c = new AtomicBoolean(false);

    C13101b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m1616a(String str, String str2) {
        if (CrashShieldHandler.m25963d(C13101b.class)) {
            return;
        }
        try {
            if (!f34063c.get()) {
                m1614c();
            }
            Map<String, String> map = f34061a;
            map.put(str, str2);
            f34062b.edit().putString("SUGGESTED_EVENTS_HISTORY", Utility.m33972L(map)).apply();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13101b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m1615b(View view, String str) {
        if (CrashShieldHandler.m25963d(C13101b.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C9655f.m10267j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return Utility.m33959Y(jSONObject.toString());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13101b.class);
            return null;
        }
    }

    /* renamed from: c */
    private static void m1614c() {
        if (CrashShieldHandler.m25963d(C13101b.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f34063c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C2290b.m34110e().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            f34062b = sharedPreferences;
            f34061a.putAll(Utility.m33975I(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", BuildConfig.VERSION_NAME)));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13101b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m1613d(String str) {
        if (CrashShieldHandler.m25963d(C13101b.class)) {
            return null;
        }
        try {
            Map<String, String> map = f34061a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13101b.class);
            return null;
        }
    }
}
