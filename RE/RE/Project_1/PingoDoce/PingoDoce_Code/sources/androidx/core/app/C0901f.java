package androidx.core.app;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0901f {

    /* compiled from: BundleCompat.java */
    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    static class C0902a {
        /* renamed from: a */
        static IBinder m39226a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m39225b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* compiled from: BundleCompat.java */
    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: androidx.core.app.f$b */
    /* loaded from: classes.dex */
    static class C0903b {

        /* renamed from: a */
        private static Method f3087a;

        /* renamed from: b */
        private static boolean f3088b;

        /* renamed from: a */
        public static IBinder m39224a(Bundle bundle, String str) {
            if (!f3088b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f3087a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e);
                }
                f3088b = true;
            }
            Method method2 = f3087a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e2);
                    f3087a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static IBinder m39227a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return C0902a.m39226a(bundle, str);
        }
        return C0903b.m39224a(bundle, str);
    }
}
