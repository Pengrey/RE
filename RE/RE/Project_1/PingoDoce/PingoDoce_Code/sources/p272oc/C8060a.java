package p272oc;

import android.util.Log;

/* renamed from: oc.a */
/* loaded from: classes2.dex */
public final class C8060a {

    /* renamed from: a */
    public static int f20844a = 5;

    /* renamed from: a */
    public static void m17021a(Exception exc) {
        if (m17018d()) {
            exc.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m17020b(Object obj) {
        if (m17018d()) {
            Log.e("RootBeer", m17019c() + String.valueOf(obj));
            Log.e("QLog", m17019c() + String.valueOf(obj));
        }
    }

    /* renamed from: c */
    private static String m17019c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return substring + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* renamed from: d */
    public static boolean m17018d() {
        return f20844a > 0;
    }

    /* renamed from: e */
    public static boolean m17017e() {
        return f20844a > 4;
    }

    /* renamed from: f */
    public static void m17016f(Object obj) {
        if (m17017e()) {
            Log.v("RootBeer", m17019c() + String.valueOf(obj));
        }
    }
}
