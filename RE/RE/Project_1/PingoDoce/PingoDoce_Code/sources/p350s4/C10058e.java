package p350s4;

import android.content.SharedPreferences;
import com.facebook.C2290b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p377u4.AutomaticAnalyticsLogger;

/* renamed from: s4.e */
/* loaded from: classes.dex */
public class C10058e {

    /* renamed from: a */
    private static SharedPreferences f26303a;

    /* renamed from: b */
    private static final Set<String> f26304b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private static final Map<String, Long> f26305c = new ConcurrentHashMap();

    /* renamed from: a */
    static Map<String, JSONObject> m9294a(Map<String, JSONObject> map) {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                try {
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f26305c.containsKey(string)) {
                            map.remove(entry.getKey());
                        } else {
                            Set<String> set = f26304b;
                            set.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            f26303a.edit().putStringSet("PURCHASE_DETAILS_SET", f26304b).apply();
            return new HashMap(map);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
            return null;
        }
    }

    /* renamed from: b */
    private static void m9293b() {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = f26303a.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                f26303a.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                for (Map.Entry entry : new HashMap(f26305c).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (currentTimeMillis - l.longValue() > 86400) {
                        Set<String> set = f26304b;
                        set.remove(str + ";" + l);
                        f26305c.remove(str);
                    }
                }
                f26303a.edit().putStringSet("PURCHASE_DETAILS_SET", f26304b).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
        }
    }

    /* renamed from: c */
    static Map<String, String> m9292c(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
                JSONObject jSONObject = map2.get(entry.getKey());
                JSONObject value = entry.getValue();
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            hashMap.put(value.toString(), jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m9291d() {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return false;
        }
        try {
            m9288g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = f26303a.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j == 0 || currentTimeMillis - j >= 86400) {
                f26303a.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
            return false;
        }
    }

    /* renamed from: e */
    public static void m9290e(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return;
        }
        try {
            m9288g();
            m9289f(new HashMap(m9292c(m9294a(map), map2)));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
        }
    }

    /* renamed from: f */
    static void m9289f(Map<String, String> map) {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    AutomaticAnalyticsLogger.m6934f(key, value, false);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
        }
    }

    /* renamed from: g */
    private static void m9288g() {
        if (CrashShieldHandler.m25963d(C10058e.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C2290b.m34110e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C2290b.m34110e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = C2290b.m34110e().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            f26303a = sharedPreferences3;
            Set<String> set = f26304b;
            set.addAll(sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet()));
            for (String str : set) {
                String[] split = str.split(";", 2);
                f26305c.put(split[0], Long.valueOf(Long.parseLong(split[1])));
            }
            m9293b();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10058e.class);
        }
    }
}
