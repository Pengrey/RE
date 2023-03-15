package p098f6;

import android.util.Log;

/* renamed from: f6.a */
/* loaded from: classes.dex */
public final class C5414a {
    /* renamed from: a */
    public static void m24382a(String str, String str2, Object obj) {
        Log.d(m24379d(str), String.format(str2, obj));
    }

    /* renamed from: b */
    public static void m24381b(String str, String str2, Object... objArr) {
        Log.d(m24379d(str), String.format(str2, objArr));
    }

    /* renamed from: c */
    public static void m24380c(String str, String str2, Throwable th2) {
        Log.e(m24379d(str), str2, th2);
    }

    /* renamed from: d */
    private static String m24379d(String str) {
        return "TransportRuntime." + str;
    }

    /* renamed from: e */
    public static void m24378e(String str, String str2) {
        Log.i(m24379d(str), str2);
    }

    /* renamed from: f */
    public static void m24377f(String str, String str2, Object obj) {
        Log.w(m24379d(str), String.format(str2, obj));
    }
}
