package p131h5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p181jd.Intrinsics;

/* renamed from: h5.a */
/* loaded from: classes.dex */
public final class CertificateUtil {
    static {
        new CertificateUtil();
    }

    private CertificateUtil() {
    }

    /* renamed from: a */
    public static final String m22872a(Context context) {
        Intrinsics.isThisObjectNull(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String sb3 = sb2.toString();
            Intrinsics.checkIfNull(sb3, "sb.toString()");
            return sb3;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }
}
