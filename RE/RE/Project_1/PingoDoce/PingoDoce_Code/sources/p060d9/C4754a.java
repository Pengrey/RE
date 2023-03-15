package p060d9;

import android.content.Context;
import android.util.Base64;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: d9.a */
/* loaded from: classes.dex */
public final class C4754a {
    /* renamed from: a */
    public static Context m26695a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: b */
    public static String m26694b(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }
}
