package p362t4;

import com.facebook.C2290b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p397v4.ModelManager;
import p482z4.FetchedAppGateKeepersManager;

/* renamed from: t4.a */
/* loaded from: classes.dex */
public final class C10380a {

    /* renamed from: a */
    private static boolean f26993a = false;

    /* renamed from: b */
    private static boolean f26994b = false;

    /* renamed from: a */
    public static void m8088a() {
        if (CrashShieldHandler.m25963d(C10380a.class)) {
            return;
        }
        try {
            f26993a = true;
            f26994b = FetchedAppGateKeepersManager.m749f("FBSDKFeatureIntegritySample", C2290b.m34109f(), false);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10380a.class);
        }
    }

    /* renamed from: b */
    private static String m8087b(String str) {
        if (CrashShieldHandler.m25963d(C10380a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] m6083o = ModelManager.m6083o(ModelManager.EnumC11117a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            return m6083o == null ? "none" : m6083o[0];
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10380a.class);
            return null;
        }
    }

    /* renamed from: c */
    public static void m8086c(Map<String, String> map) {
        if (CrashShieldHandler.m25963d(C10380a.class)) {
            return;
        }
        try {
            if (f26993a && map.size() != 0) {
                try {
                    ArrayList<String> arrayList = new ArrayList(map.keySet());
                    JSONObject jSONObject = new JSONObject();
                    for (String str : arrayList) {
                        String str2 = map.get(str);
                        if (m8085d(str) || m8085d(str2)) {
                            map.remove(str);
                            if (!f26994b) {
                                str2 = BuildConfig.VERSION_NAME;
                            }
                            jSONObject.put(str, str2);
                        }
                    }
                    if (jSONObject.length() == 0) {
                        return;
                    }
                    map.put("_onDeviceParams", jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10380a.class);
        }
    }

    /* renamed from: d */
    private static boolean m8085d(String str) {
        if (CrashShieldHandler.m25963d(C10380a.class)) {
            return false;
        }
        try {
            return !"none".equals(m8087b(str));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10380a.class);
            return false;
        }
    }
}
