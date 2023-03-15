package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.biometric.b */
/* loaded from: classes.dex */
public class C0555b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m40287a(int i) {
        return i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m40286b(BiometricPrompt.C0547d c0547d, BiometricPrompt.C0546c c0546c) {
        if (c0547d.m40303a() != 0) {
            return c0547d.m40303a();
        }
        int i = c0546c != null ? 15 : 255;
        return c0547d.m40297g() ? 32768 | i : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m40285c(int i) {
        return (i & 32768) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m40284d(int i) {
        return (i & 32767) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m40283e(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        } else if (i != 32783) {
            return i == 33023 || i == 0;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            return i2 < 28 || i2 > 29;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m40282f(int i) {
        return (i & 255) == 255;
    }
}
