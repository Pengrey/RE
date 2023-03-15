package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* renamed from: androidx.biometric.l */
/* loaded from: classes.dex */
class C0604l {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyguardUtils.java */
    /* renamed from: androidx.biometric.l$a */
    /* loaded from: classes.dex */
    public static class C0605a {
        /* renamed from: a */
        static boolean m40103a(KeyguardManager keyguardManager) {
            return keyguardManager.isKeyguardSecure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyguardUtils.java */
    /* renamed from: androidx.biometric.l$b */
    /* loaded from: classes.dex */
    public static class C0606b {
        /* renamed from: a */
        static KeyguardManager m40102a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        /* renamed from: b */
        static boolean m40101b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static KeyguardManager m40105a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0606b.m40102a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m40104b(Context context) {
        KeyguardManager m40105a = m40105a(context);
        if (m40105a == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0606b.m40101b(m40105a);
        }
        if (i >= 16) {
            return C0605a.m40103a(m40105a);
        }
        return false;
    }
}
