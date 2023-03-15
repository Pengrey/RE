package p460y4;

import android.util.Patterns;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C13100a {

    /* renamed from: a */
    private static Map<String, String> f34056a = null;

    /* renamed from: b */
    private static Map<String, String> f34057b = null;

    /* renamed from: c */
    private static Map<String, String> f34058c = null;

    /* renamed from: d */
    private static JSONObject f34059d = null;

    /* renamed from: e */
    private static boolean f34060e = false;

    C13100a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float[] m1630a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String optString;
        JSONArray jSONArray;
        JSONObject m1629b;
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return null;
        }
        try {
            if (f34060e) {
                float[] fArr = new float[30];
                Arrays.fill(fArr, 0.0f);
                try {
                    lowerCase = str.toLowerCase();
                    jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                    optString = jSONObject.optString("screenname");
                    jSONArray = new JSONArray();
                    m1621j(jSONObject2, jSONArray);
                    m1618m(fArr, m1622i(jSONObject2));
                    m1629b = m1629b(jSONObject2);
                } catch (JSONException unused) {
                }
                if (m1629b == null) {
                    return null;
                }
                m1618m(fArr, m1623h(m1629b, jSONArray, optString, jSONObject2.toString(), lowerCase));
                return fArr;
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m1629b(JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject m1629b = m1629b(optJSONArray.getJSONObject(i));
            if (m1629b != null) {
                return m1629b;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m1628c(String str, String str2, String str3) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m1627d(File file) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return;
        }
        try {
            try {
                f34059d = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f34059d = new JSONObject(new String(bArr, "UTF-8"));
                HashMap hashMap = new HashMap();
                f34056a = hashMap;
                hashMap.put("ENGLISH", "1");
                f34056a.put("GERMAN", "2");
                f34056a.put("SPANISH", "3");
                f34056a.put("JAPANESE", "4");
                HashMap hashMap2 = new HashMap();
                f34057b = hashMap2;
                hashMap2.put("VIEW_CONTENT", "0");
                f34057b.put("SEARCH", "1");
                f34057b.put("ADD_TO_CART", "2");
                f34057b.put("ADD_TO_WISHLIST", "3");
                f34057b.put("INITIATE_CHECKOUT", "4");
                f34057b.put("ADD_PAYMENT_INFO", "5");
                f34057b.put("PURCHASE", "6");
                f34057b.put("LEAD", "7");
                f34057b.put("COMPLETE_REGISTRATION", "8");
                HashMap hashMap3 = new HashMap();
                f34058c = hashMap3;
                hashMap3.put("BUTTON_TEXT", "1");
                f34058c.put("PAGE_TITLE", "2");
                f34058c.put("RESOLVED_DOCUMENT_LINK", "3");
                f34058c.put("BUTTON_ID", "4");
                f34060e = true;
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C13100a.class);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private static boolean m1626e(JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            return (jSONObject.optInt("classtypebitmask") & 32) > 0;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m1625f() {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            return f34060e;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m1624g(String[] strArr, String[] strArr2) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (str2.contains(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* renamed from: h */
    private static float[] m1623h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        int length;
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            fArr[3] = jSONArray.length() > 1 ? length - 1 : 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (m1626e(jSONArray.getJSONObject(i))) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                } catch (JSONException unused) {
                }
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            m1617n(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            String sb5 = sb3.toString();
            fArr[15] = m1619l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[16] = m1619l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = m1619l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb4) ? 1.0f : 0.0f;
            fArr[18] = str2.contains("password") ? 1.0f : 0.0f;
            fArr[19] = m1620k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = m1620k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = m1620k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = m1619l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[24] = m1619l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = m1620k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5) ? 1.0f : 0.0f;
            fArr[27] = m1620k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = m1619l("ENGLISH", "LEAD", "BUTTON_TEXT", sb5) ? 1.0f : 0.0f;
            fArr[29] = m1619l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return null;
        }
    }

    /* renamed from: i */
    private static float[] m1622i(JSONObject jSONObject) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m1624g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = (float) (fArr[0] + 1.0d);
            }
            if (m1624g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = (float) (fArr[1] + 1.0d);
            }
            if (m1624g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = (float) (fArr[2] + 1.0d);
            }
            if (m1624g(new String[]{"search"}, strArr)) {
                fArr[4] = (float) (fArr[4] + 1.0d);
            }
            if (optInt >= 0) {
                fArr[5] = (float) (fArr[5] + 1.0d);
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = (float) (fArr[6] + 1.0d);
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = (float) (fArr[7] + 1.0d);
            }
            if (lowerCase3.contains("checkbox")) {
                fArr[8] = (float) (fArr[8] + 1.0d);
            }
            if (m1624g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = (float) (fArr[10] + 1.0d);
            }
            if (lowerCase3.contains("radio") && lowerCase3.contains("button")) {
                fArr[12] = (float) (fArr[12] + 1.0d);
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    m1618m(fArr, m1622i(optJSONArray.getJSONObject(i)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return null;
        }
    }

    /* renamed from: j */
    private static boolean m1621j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int i = 0;
            while (true) {
                if (i >= optJSONArray.length()) {
                    z = false;
                    break;
                } else if (optJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    jSONArray.put(optJSONArray.getJSONObject(i2));
                }
            } else {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    if (m1621j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m1620k(String str, String str2) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* renamed from: l */
    private static boolean m1619l(String str, String str2, String str3, String str4) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return false;
        }
        try {
            return m1620k(f34059d.optJSONObject("rulesForLanguage").optJSONObject(f34056a.get(str)).optJSONObject("rulesForEvent").optJSONObject(f34057b.get(str2)).optJSONObject("positiveRules").optString(f34058c.get(str3)), str4);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
            return false;
        }
    }

    /* renamed from: m */
    private static void m1618m(float[] fArr, float[] fArr2) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            try {
                fArr[i] = fArr[i] + fArr2[i];
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C13100a.class);
                return;
            }
        }
    }

    /* renamed from: n */
    private static void m1617n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (CrashShieldHandler.m25963d(C13100a.class)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString("text", BuildConfig.VERSION_NAME).toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", BuildConfig.VERSION_NAME).toLowerCase();
            if (!lowerCase.isEmpty()) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (!lowerCase2.isEmpty()) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    m1617n(optJSONArray.getJSONObject(i), sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C13100a.class);
        }
    }
}
