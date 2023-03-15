package androidx.biometric;

import android.content.Context;
import android.util.Log;
import com.github.aachartmodel.aainfographics.BuildConfig;

/* renamed from: androidx.biometric.j */
/* loaded from: classes.dex */
class C0596j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m40121a(Context context, int i) {
        if (context == null) {
            return BuildConfig.VERSION_NAME;
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(C0615t.fingerprint_error_user_canceled);
                    case 11:
                        return context.getString(C0615t.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(C0615t.fingerprint_error_hw_not_present);
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i);
                        return context.getString(C0615t.default_error_msg);
                }
            }
            return context.getString(C0615t.fingerprint_error_lockout);
        }
        return context.getString(C0615t.fingerprint_error_hw_not_available);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m40120b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m40119c(int i) {
        return i == 7 || i == 9;
    }
}
