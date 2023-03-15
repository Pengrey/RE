package p269o9;

import com.google.firebase.crashlytics.internal.common.C4196g;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p219l9.C7011f;
import p355s9.C10098f;

/* renamed from: o9.d */
/* loaded from: classes.dex */
class C8040d {

    /* renamed from: a */
    private final C10098f f20782a;

    static {
        Charset.forName("UTF-8");
    }

    public C8040d(C10098f c10098f) {
        this.f20782a = c10098f;
    }

    /* renamed from: d */
    private static Map<String, String> m17104d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m17100h(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private String m17103e(String str) throws JSONException {
        return m17100h(new JSONObject(str), "userId");
    }

    /* renamed from: h */
    private static String m17100h(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m17107a(String str) {
        return this.f20782a.m9150n(str, "internal-keys");
    }

    /* renamed from: b */
    public File m17106b(String str) {
        return this.f20782a.m9150n(str, "keys");
    }

    /* renamed from: c */
    public File m17105c(String str) {
        return this.f20782a.m9150n(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> m17102f(String str, boolean z) {
        File m17107a = z ? m17107a(str) : m17106b(str);
        if (!m17107a.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(m17107a);
                try {
                    Map<String, String> m17104d = m17104d(C4196g.m28378A(fileInputStream2));
                    C4196g.m28373e(fileInputStream2, "Failed to close user metadata file.");
                    return m17104d;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    C7011f.m19611f().m19612e("Error deserializing user metadata.", e);
                    C4196g.m28373e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    C4196g.m28373e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: g */
    public String m17101g(String str) {
        FileInputStream fileInputStream;
        File m17105c = m17105c(str);
        FileInputStream fileInputStream2 = null;
        if (!m17105c.exists()) {
            C7011f.m19611f().m19615b("No userId set for session " + str);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(m17105c);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            C4196g.m28373e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                String m17103e = m17103e(C4196g.m28378A(fileInputStream));
                C7011f.m19611f().m19615b("Loaded userId " + m17103e + " for session " + str);
                C4196g.m28373e(fileInputStream, "Failed to close user metadata file.");
                return m17103e;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                C4196g.m28373e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C7011f.m19611f().m19612e("Error deserializing user metadata.", e);
            C4196g.m28373e(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }
}
