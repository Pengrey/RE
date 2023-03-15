package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class C0898e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppOpsManagerCompat.java */
    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    public static class C0899a {
        /* renamed from: a */
        static <T> T m39234a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m39233b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m39232c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m39231d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    static class C0900b {
        /* renamed from: a */
        static int m39230a(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        /* renamed from: b */
        static String m39229b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m39228c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m39237a(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m39228c = C0900b.m39228c(context);
            int m39230a = C0900b.m39230a(m39228c, str, Binder.getCallingUid(), str2);
            return m39230a != 0 ? m39230a : C0900b.m39230a(m39228c, str, i, C0900b.m39229b(context));
        }
        return m39236b(context, str, str2);
    }

    /* renamed from: b */
    public static int m39236b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0899a.m39232c((AppOpsManager) C0899a.m39234a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m39235c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0899a.m39231d(str);
        }
        return null;
    }
}
