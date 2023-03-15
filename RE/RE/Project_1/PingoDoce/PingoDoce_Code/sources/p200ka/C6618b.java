package p200ka;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.firebase.C4175c;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ka.b */
/* loaded from: classes.dex */
public class C6618b {

    /* renamed from: c */
    private static final String[] f17871c = {"*", "FCM", "GCM", BuildConfig.VERSION_NAME};

    /* renamed from: a */
    private final SharedPreferences f17872a;

    /* renamed from: b */
    private final String f17873b;

    public C6618b(C4175c c4175c) {
        this.f17872a = c4175c.m28441h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f17873b = m20482b(c4175c);
    }

    /* renamed from: a */
    private String m20483a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m20482b(C4175c c4175c) {
        String m28180d = c4175c.m28438k().m28180d();
        if (m28180d != null) {
            return m28180d;
        }
        String m28181c = c4175c.m28438k().m28181c();
        if (m28181c.startsWith("1:") || m28181c.startsWith("2:")) {
            String[] split = m28181c.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return m28181c;
    }

    /* renamed from: c */
    private static String m20481c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m20480d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m20479e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m20477g() {
        String string;
        synchronized (this.f17872a) {
            string = this.f17872a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m20476h() {
        synchronized (this.f17872a) {
            String string = this.f17872a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m20479e = m20479e(string);
            if (m20479e == null) {
                return null;
            }
            return m20481c(m20479e);
        }
    }

    /* renamed from: f */
    public String m20478f() {
        synchronized (this.f17872a) {
            String m20477g = m20477g();
            if (m20477g != null) {
                return m20477g;
            }
            return m20476h();
        }
    }

    /* renamed from: i */
    public String m20475i() {
        synchronized (this.f17872a) {
            for (String str : f17871c) {
                String string = this.f17872a.getString(m20483a(this.f17873b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m20480d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
