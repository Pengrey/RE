package p350s4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C2290b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;

/* renamed from: s4.d */
/* loaded from: classes.dex */
public class C10057d {

    /* renamed from: a */
    private static final HashMap<String, Method> f26298a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f26299b = new HashMap<>();

    /* renamed from: c */
    private static final String f26300c = C2290b.m34110e().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f26301d = C2290b.m34110e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f26302e = C2290b.m34110e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m9311a(Context context, IBinder iBinder) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            return m9298n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m9310b() {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f26301d;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            } else if (currentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
        }
    }

    /* renamed from: c */
    private static ArrayList<String> m9309c(ArrayList<String> arrayList) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f26302e.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= 86400 && !f26302e.getString(string, BuildConfig.VERSION_NAME).equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(next);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: d */
    private static Class<?> m9308d(Context context, String str) {
        Class<?> loadClass;
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f26299b;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                hashMap.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: e */
    private static Method m9307e(Class<?> cls, String str) {
        Method declaredMethod;
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            HashMap<String, Method> hashMap = f26298a;
            Method method = hashMap.get(str);
            if (method != null) {
                return method;
            }
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case -1801122596:
                        if (str.equals("getPurchases")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1450694211:
                        if (str.equals("isBillingSupported")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1123215065:
                        if (str.equals("asInterface")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -594356707:
                        if (str.equals("getPurchaseHistory")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -573310373:
                        if (str.equals("getSkuDetails")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                declaredMethod = cls.getDeclaredMethod(str, c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? null : new Class[]{Integer.TYPE, String.class, String.class, String.class, Bundle.class} : new Class[]{Integer.TYPE, String.class, String.class, String.class} : new Class[]{Integer.TYPE, String.class, String.class} : new Class[]{Integer.TYPE, String.class, String.class, Bundle.class} : new Class[]{IBinder.class});
                hashMap.put(str, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return declaredMethod;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: f */
    private static ArrayList<String> m9306f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m9297o(context, obj, str).booleanValue()) {
                char c = 0;
                String str2 = null;
                int i = 0;
                boolean z = false;
                while (true) {
                    Object[] objArr = new Object[5];
                    objArr[c] = 6;
                    objArr[1] = f26300c;
                    objArr[2] = str;
                    objArr[3] = str2;
                    objArr[4] = new Bundle();
                    Object m9298n = m9298n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, objArr);
                    if (m9298n != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) m9298n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i < 30 || str2 == null || z) {
                                break;
                                break;
                            }
                            c = 0;
                        }
                    }
                    str2 = null;
                    if (i < 30) {
                        break;
                    }
                    c = 0;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static ArrayList<String> m9305g(Context context, Object obj) {
        Class<?> m9308d;
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            return (obj == null || (m9308d = m9308d(context, "com.android.vending.billing.IInAppBillingService")) == null || m9307e(m9308d, "getPurchaseHistory") == null) ? arrayList : m9309c(m9306f(context, obj, "inapp"));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[EDGE_INSN: B:29:0x0065->B:23:0x0065 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<java.lang.String> m9304h(android.content.Context r10, java.lang.Object r11, java.lang.String r12) {
        /*
            java.lang.Class<s4.d> r0 = p350s4.C10057d.class
            boolean r1 = p076e5.CrashShieldHandler.m25963d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            if (r11 != 0) goto L12
            return r1
        L12:
            java.lang.Boolean r3 = m9297o(r10, r11, r12)     // Catch: java.lang.Throwable -> L66
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L65
            r3 = 0
            r4 = r2
            r5 = r3
        L1f:
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L66
            r7 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L66
            r6[r3] = r8     // Catch: java.lang.Throwable -> L66
            r8 = 1
            java.lang.String r9 = p350s4.C10057d.f26300c     // Catch: java.lang.Throwable -> L66
            r6[r8] = r9     // Catch: java.lang.Throwable -> L66
            r8 = 2
            r6[r8] = r12     // Catch: java.lang.Throwable -> L66
            r6[r7] = r4     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r7 = "getPurchases"
            java.lang.Object r4 = m9298n(r10, r4, r7, r11, r6)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L5e
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "RESPONSE_CODE"
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L66
            if (r6 != 0) goto L5e
            java.lang.String r6 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r6 = r4.getStringArrayList(r6)     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L65
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L66
            int r5 = r5 + r7
            r1.addAll(r6)     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r4 = r4.getString(r6)     // Catch: java.lang.Throwable -> L66
            goto L5f
        L5e:
            r4 = r2
        L5f:
            r6 = 30
            if (r5 >= r6) goto L65
            if (r4 != 0) goto L1f
        L65:
            return r1
        L66:
            r10 = move-exception
            p076e5.CrashShieldHandler.m25965b(r10, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p350s4.C10057d.m9304h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static ArrayList<String> m9303i(Context context, Object obj) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            return m9309c(m9304h(context, obj, "inapp"));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static ArrayList<String> m9302j(Context context, Object obj) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            return m9309c(m9304h(context, obj, "subs"));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Map<String, String> m9301k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            Map<String, String> m9296p = m9296p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!m9296p.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            m9296p.putAll(m9300l(context, arrayList2, obj, z));
            return m9296p;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: l */
    private static Map<String, String> m9300l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = f26300c;
                objArr[2] = z ? "subs" : "inapp";
                objArr[3] = bundle;
                Object m9298n = m9298n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (m9298n != null) {
                    Bundle bundle2 = (Bundle) m9298n;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            for (int i = 0; i < arrayList.size(); i++) {
                                hashMap.put(arrayList.get(i), stringArrayList.get(i));
                            }
                        }
                        m9295q(hashMap);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m9299m(String str) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return false;
        }
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString != null) {
                return !optString.isEmpty();
            }
            return false;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return false;
        }
    }

    /* renamed from: n */
    private static Object m9298n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method m9307e;
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            Class<?> m9308d = m9308d(context, str);
            if (m9308d == null || (m9307e = m9307e(m9308d, str2)) == null) {
                return null;
            }
            if (obj != null) {
                obj = m9308d.cast(obj);
            }
            try {
                return m9307e.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: o */
    private static Boolean m9297o(Context context, Object obj, String str) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            if (obj == null) {
                return Boolean.FALSE;
            }
            boolean z = false;
            Object m9298n = m9298n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f26300c, str});
            if (m9298n != null && ((Integer) m9298n).intValue() == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: p */
    private static Map<String, String> m9296p(ArrayList<String> arrayList) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = f26301d.getString(next, null);
                if (string != null) {
                    String[] split = string.split(";", 2);
                    if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                        hashMap.put(next, split[1]);
                    }
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
            return null;
        }
    }

    /* renamed from: q */
    private static void m9295q(Map<String, String> map) {
        if (CrashShieldHandler.m25963d(C10057d.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f26301d.edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), currentTimeMillis + ";" + entry.getValue());
            }
            edit.apply();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10057d.class);
        }
    }
}
