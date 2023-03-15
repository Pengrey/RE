package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.util.c */
/* loaded from: classes.dex */
public class C1070c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ObjectsCompat.java */
    /* renamed from: androidx.core.util.c$a */
    /* loaded from: classes.dex */
    public static class C1071a {
        /* renamed from: a */
        static boolean m38629a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m38628b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m38634a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1071a.m38629a(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m38633b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1071a.m38628b(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static <T> T m38632c(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: d */
    public static <T> T m38631d(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: e */
    public static String m38630e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
