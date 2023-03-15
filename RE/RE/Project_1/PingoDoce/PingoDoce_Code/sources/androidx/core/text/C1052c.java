package androidx.core.text;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.c */
/* loaded from: classes.dex */
public final class C1052c {

    /* renamed from: a */
    private static Method f3382a;

    /* renamed from: b */
    private static Method f3383b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ICUCompat.java */
    /* renamed from: androidx.core.text.c$a */
    /* loaded from: classes.dex */
    public static class C1053a {
        /* renamed from: a */
        static String m38659a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ICUCompat.java */
    /* renamed from: androidx.core.text.c$b */
    /* loaded from: classes.dex */
    public static class C1054b {
        /* renamed from: a */
        static ULocale m38658a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        static ULocale m38657b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m38656c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f3383b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f3382a = cls.getMethod("getScript", String.class);
            f3383b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e2) {
            f3382a = null;
            f3383b = null;
            Log.w("ICUCompat", e2);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    private static String m38662a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f3383b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    private static String m38661b(String str) {
        try {
            Method method = f3382a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m38660c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return C1054b.m38656c(C1054b.m38658a(C1054b.m38657b(locale)));
        }
        if (i >= 21) {
            try {
                return C1053a.m38659a((Locale) f3383b.invoke(null, locale));
            } catch (IllegalAccessException e) {
                Log.w("ICUCompat", e);
                return C1053a.m38659a(locale);
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return C1053a.m38659a(locale);
            }
        }
        String m38662a = m38662a(locale);
        if (m38662a != null) {
            return m38661b(m38662a);
        }
        return null;
    }
}
