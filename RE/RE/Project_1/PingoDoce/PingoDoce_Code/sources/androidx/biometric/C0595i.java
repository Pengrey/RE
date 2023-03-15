package androidx.biometric;

import android.content.Context;
import android.os.Build;

/* renamed from: androidx.biometric.i */
/* loaded from: classes.dex */
class C0595i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m40128a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return m40127b(context, str, C0609n.assume_strong_biometrics_models);
    }

    /* renamed from: b */
    private static boolean m40127b(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m40126c(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m40125d(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m40124e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return m40127b(context, str, C0609n.delay_showing_prompt_models);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m40123f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m40126c(context, str, C0609n.hide_fingerprint_instantly_prefixes);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m40122g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return m40125d(context, str, C0609n.crypto_fingerprint_fallback_vendors) || m40126c(context, str2, C0609n.crypto_fingerprint_fallback_prefixes);
    }
}
