package p306q4;

import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;

/* renamed from: q4.e */
/* loaded from: classes.dex */
public class C9654e {

    /* renamed from: a */
    private static final String f25476a = "q4.e";

    /* renamed from: b */
    private static Class<?> f25477b;

    /* renamed from: a */
    public static void m10279a() {
        m10277c("UnityFacebookSDKPlugin", "CaptureViewHierarchy", BuildConfig.VERSION_NAME);
    }

    /* renamed from: b */
    public static void m10278b(String str) {
        m10277c("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    /* renamed from: c */
    public static void m10277c(String str, String str2, String str3) {
        try {
            if (f25477b == null) {
                f25477b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f25477b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(f25477b, str, str2, str3);
        } catch (Exception e) {
            Log.e(f25476a, "Failed to send message to Unity", e);
        }
    }
}
