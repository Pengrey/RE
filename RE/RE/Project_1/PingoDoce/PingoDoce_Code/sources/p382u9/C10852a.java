package p382u9;

import com.google.firebase.crashlytics.internal.common.C4196g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p219l9.C7011f;
import p355s9.C10098f;

/* renamed from: u9.a */
/* loaded from: classes.dex */
public class C10852a {

    /* renamed from: a */
    private final File f28053a;

    public C10852a(C10098f c10098f) {
        this.f28053a = c10098f.m9160d("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m6877a() {
        return this.f28053a;
    }

    /* renamed from: b */
    public JSONObject m6876b() {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C7011f.m19611f().m19615b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m6877a = m6877a();
                if (m6877a.exists()) {
                    fileInputStream = new FileInputStream(m6877a);
                    try {
                        jSONObject = new JSONObject(C4196g.m28378A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        C7011f.m19611f().m19612e("Failed to fetch cached settings", e);
                        C4196g.m28373e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C7011f.m19611f().m19608i("Settings file does not exist.");
                    jSONObject = null;
                }
                C4196g.m28373e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                C4196g.m28373e(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            C4196g.m28373e(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    /* renamed from: c */
    public void m6875c(long j, JSONObject jSONObject) {
        C7011f.m19611f().m19608i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m6877a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C4196g.m28373e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    C7011f.m19611f().m19612e("Failed to cache settings", e);
                    C4196g.m28373e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C4196g.m28373e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
