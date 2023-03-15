package p200ka;

import com.google.firebase.C4175c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ka.c */
/* loaded from: classes.dex */
public class C6619c {

    /* renamed from: a */
    private final File f17874a;

    /* renamed from: b */
    private final C4175c f17875b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: ka.c$a */
    /* loaded from: classes.dex */
    public enum EnumC6620a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C6619c(C4175c c4175c) {
        File filesDir = c4175c.m28441h().getFilesDir();
        this.f17874a = new File(filesDir, "PersistedInstallation." + c4175c.m28437l() + ".json");
        this.f17875b = c4175c;
    }

    /* renamed from: b */
    private JSONObject m20473b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f17874a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: a */
    public AbstractC6621d m20474a(AbstractC6621d abstractC6621d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC6621d.mo20468d());
            jSONObject.put("Status", abstractC6621d.mo20465g().ordinal());
            jSONObject.put("AuthToken", abstractC6621d.mo20470b());
            jSONObject.put("RefreshToken", abstractC6621d.mo20466f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC6621d.mo20464h());
            jSONObject.put("ExpiresInSecs", abstractC6621d.mo20469c());
            jSONObject.put("FisError", abstractC6621d.mo20467e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f17875b.m28441h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f17874a)) {
            return abstractC6621d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: c */
    public AbstractC6621d m20472c() {
        JSONObject m20473b = m20473b();
        String optString = m20473b.optString("Fid", null);
        int optInt = m20473b.optInt("Status", EnumC6620a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m20473b.optString("AuthToken", null);
        String optString3 = m20473b.optString("RefreshToken", null);
        long optLong = m20473b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m20473b.optLong("ExpiresInSecs", 0L);
        return AbstractC6621d.m20471a().mo20448d(optString).mo20445g(EnumC6620a.values()[optInt]).mo20450b(optString2).mo20446f(optString3).mo20444h(optLong).mo20449c(optLong2).mo20447e(m20473b.optString("FisError", null)).mo20451a();
    }
}
