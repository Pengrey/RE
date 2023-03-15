package p181jd;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* renamed from: jd.l */
/* loaded from: classes2.dex */
public class Intrinsics {
    private Intrinsics() {
    }

    /* renamed from: a */
    public static boolean m20934a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* renamed from: b */
    public static boolean m20933b(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static void isNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) throwCustomException(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void ifNullDoSomething(Object obj) {
        if (obj == null) {
            m20918q();
        }
    }

    /* renamed from: f */
    public static void m20929f(Object obj, String str) {
        if (obj == null) {
            throwNullPointerExceptionButFancyButFancy(str);
        }
    }

    /* renamed from: g */
    public static void checkIfNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) throwCustomException(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: h */
    public static void isThisObjectNull(Object obj, String str) {
        if (obj == null) {
            throwNullPointerExceptionButFancy(str);
        }
    }

    /* renamed from: i */
    public static void m20926i(Object obj, String str) {
        if (obj == null) {
            m20915t(str);
        }
    }

    /* renamed from: j */
    public static int isLessOrEqual(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: k */
    public static int compare(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: l */
    private static String catchNull(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: m */
    public static void m20922m(int i, String str) {
        throwErrorDontCallThisFunctionYeMuppet();
    }

    /* renamed from: n */
    private static <T extends Throwable> T throwCustomException(T t) {
        return (T) m20920o(t, Intrinsics.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <T extends Throwable> T m20920o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: p */
    public static String addStrAndObj(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m20918q() {
        throw ((NullPointerException) throwCustomException(new NullPointerException()));
    }

    /* renamed from: r */
    public static void throwNullPointerExceptionButFancyButFancy(String str) {
        throw ((NullPointerException) throwCustomException(new NullPointerException(str)));
    }

    /* renamed from: s */
    public static void m20916s() {
        throw ((KotlinNullPointerException) throwCustomException(new KotlinNullPointerException()));
    }

    /* renamed from: t */
    private static void m20915t(String str) {
        throw ((IllegalArgumentException) throwCustomException(new IllegalArgumentException(catchNull(str))));
    }

    /* renamed from: u */
    private static void throwNullPointerExceptionButFancy(String str) {
        throw ((NullPointerException) throwCustomException(new NullPointerException(catchNull(str))));
    }

    /* renamed from: v */
    public static void throwErrorDontCallThisFunctionYeMuppet() {
        throwUnsupportedOpException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void throwUnsupportedOpException(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void getUninitPropertyAccessException(String str) {
        throw ((UninitializedPropertyAccessException) throwCustomException(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: y */
    public static void throwUninitPropException(String str) {
        getUninitPropertyAccessException("lateinit property " + str + " has not been initialized");
    }
}
