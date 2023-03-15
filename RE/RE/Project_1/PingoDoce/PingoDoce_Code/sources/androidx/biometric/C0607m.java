package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: androidx.biometric.m */
/* loaded from: classes.dex */
class C0607m {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PackageUtils.java */
    /* renamed from: androidx.biometric.m$a */
    /* loaded from: classes.dex */
    public static class C0608a {
        /* renamed from: a */
        static boolean m40099a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m40100a(Context context) {
        return Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && C0608a.m40099a(context.getPackageManager());
    }
}
