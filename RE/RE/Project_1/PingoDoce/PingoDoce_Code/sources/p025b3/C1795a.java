package p025b3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b3.a */
/* loaded from: classes.dex */
public final class C1795a {

    /* renamed from: a */
    private static long f5484a;

    /* renamed from: b */
    private static Method f5485b;

    /* renamed from: a */
    public static void m35347a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            C1796b.m35342a(str);
        }
    }

    /* renamed from: b */
    public static void m35346b() {
        if (Build.VERSION.SDK_INT >= 18) {
            C1796b.m35341b();
        }
    }

    /* renamed from: c */
    private static void m35345c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m35344d() {
        try {
            if (f5485b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m35343e();
    }

    /* renamed from: e */
    private static boolean m35343e() {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                if (f5485b == null) {
                    f5484a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    f5485b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) f5485b.invoke(null, Long.valueOf(f5484a))).booleanValue();
            } catch (Exception e) {
                m35345c("isTagEnabled", e);
            }
        }
        return false;
    }
}
