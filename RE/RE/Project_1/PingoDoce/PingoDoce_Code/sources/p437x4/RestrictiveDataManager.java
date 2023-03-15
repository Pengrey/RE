package p437x4;

import android.util.Log;
import com.facebook.C2290b;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p482z4.FetchedAppSettings;

/* renamed from: x4.a */
/* loaded from: classes.dex */
public final class RestrictiveDataManager {

    /* renamed from: a */
    private static boolean f32448a;

    /* renamed from: e */
    public static final RestrictiveDataManager f32452e = new RestrictiveDataManager();

    /* renamed from: b */
    private static final String f32449b = RestrictiveDataManager.class.getCanonicalName();

    /* renamed from: c */
    private static final List f32450c = new ArrayList();

    /* renamed from: d */
    private static final Set f32451d = new CopyOnWriteArraySet();

    /* compiled from: RestrictiveDataManager.kt */
    /* renamed from: x4.a$a */
    /* loaded from: classes.dex */
    public static final class C12283a {

        /* renamed from: a */
        private String f32453a;

        /* renamed from: b */
        private Map f32454b;

        public C12283a(String str, Map map) {
            Intrinsics.isThisObjectNull(str, "eventName");
            Intrinsics.isThisObjectNull(map, "restrictiveParams");
            this.f32453a = str;
            this.f32454b = map;
        }

        /* renamed from: a */
        public final String m3131a() {
            return this.f32453a;
        }

        /* renamed from: b */
        public final Map m3130b() {
            return this.f32454b;
        }

        /* renamed from: c */
        public final void m3129c(Map map) {
            Intrinsics.isThisObjectNull(map, "<set-?>");
            this.f32454b = map;
        }
    }

    private RestrictiveDataManager() {
    }

    /* renamed from: a */
    public static final void m3137a() {
        if (CrashShieldHandler.m25963d(RestrictiveDataManager.class)) {
            return;
        }
        try {
            f32448a = true;
            f32452e.m3135c();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RestrictiveDataManager.class);
        }
    }

    /* renamed from: b */
    private final String m3136b(String str, String str2) {
        try {
            if (CrashShieldHandler.m25963d(this)) {
                return null;
            }
            try {
                for (C12283a c12283a : new ArrayList(f32450c)) {
                    if (c12283a != null && Intrinsics.equals(str, c12283a.m3131a())) {
                        for (String str3 : c12283a.m3130b().keySet()) {
                            if (Intrinsics.equals(str2, str3)) {
                                return (String) c12283a.m3130b().get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e) {
                Log.w(f32449b, "getMatchedRuleType failed", e);
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    private final void m3135c() {
        String m734g;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            String m34109f = C2290b.m34109f();
            Intrinsics.checkIfNull(m34109f, "FacebookSdk.getApplicationId()");
            FetchedAppSettings m33985o = FetchedAppSettingsManager.m33985o(m34109f, false);
            if (m33985o == null || (m734g = m33985o.m734g()) == null) {
                return;
            }
            if (m734g.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m734g);
            f32450c.clear();
            f32451d.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    Intrinsics.checkIfNull(next, "key");
                    C12283a c12283a = new C12283a(next, new HashMap());
                    if (optJSONObject != null) {
                        c12283a.m3129c(Utility.m33949i(optJSONObject));
                        f32450c.add(c12283a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f32451d.add(c12283a.m3131a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: d */
    private final boolean m3134d(String str) {
        if (CrashShieldHandler.m25963d(this)) {
            return false;
        }
        try {
            return f32451d.contains(str);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return false;
        }
    }

    /* renamed from: e */
    public static final String m3133e(String str) {
        if (CrashShieldHandler.m25963d(RestrictiveDataManager.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(str, "eventName");
            return f32448a ? f32452e.m3134d(str) ? "_removed_" : str : str;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RestrictiveDataManager.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m3132f(Map map, String str) {
        if (CrashShieldHandler.m25963d(RestrictiveDataManager.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(map, "parameters");
            Intrinsics.isThisObjectNull(str, "eventName");
            if (f32448a) {
                HashMap hashMap = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String m3136b = f32452e.m3136b(str, str2);
                    if (m3136b != null) {
                        hashMap.put(str2, m3136b);
                        map.remove(str2);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, RestrictiveDataManager.class);
        }
    }
}
