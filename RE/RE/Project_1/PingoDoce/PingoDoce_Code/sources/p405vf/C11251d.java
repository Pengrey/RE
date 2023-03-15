package p405vf;

/* renamed from: vf.d */
/* loaded from: classes2.dex */
public final class C11251d {
    /* renamed from: a */
    public static int m5631a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m5630b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m5629c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj2 == null) {
            return false;
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: d */
    public static int m5628d(int i, int i2) {
        return i >= 0 ? i / i2 : ((i + 1) / i2) - 1;
    }

    /* renamed from: e */
    public static long m5627e(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    /* renamed from: f */
    public static int m5626f(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    /* renamed from: g */
    public static int m5625g(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    /* renamed from: h */
    public static long m5624h(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    /* renamed from: i */
    public static <T> T m5623i(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    /* renamed from: j */
    public static int m5622j(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException("Addition overflows an int: " + i + " + " + i2);
    }

    /* renamed from: k */
    public static long m5621k(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        throw new ArithmeticException("Addition overflows a long: " + j + " + " + j2);
    }

    /* renamed from: l */
    public static long m5620l(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        } else if (i != 0) {
            if (i != 1) {
                long j2 = i;
                long j3 = j * j2;
                if (j3 / j2 == j) {
                    return j3;
                }
                throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
            }
            return j;
        } else {
            return 0L;
        }
    }

    /* renamed from: m */
    public static long m5619m(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 != j || ((j == Long.MIN_VALUE && j2 == -1) || (j2 == Long.MIN_VALUE && j == -1))) {
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + j2);
        }
        return j3;
    }

    /* renamed from: n */
    public static int m5618n(int i, int i2) {
        int i3 = i - i2;
        if ((i ^ i3) >= 0 || (i ^ i2) >= 0) {
            return i3;
        }
        throw new ArithmeticException("Subtraction overflows an int: " + i + " - " + i2);
    }

    /* renamed from: o */
    public static long m5617o(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        throw new ArithmeticException("Subtraction overflows a long: " + j + " - " + j2);
    }

    /* renamed from: p */
    public static int m5616p(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException("Calculation overflows an int: " + j);
        }
        return (int) j;
    }
}
