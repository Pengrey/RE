package p479z1;

import com.google.crypto.tink.shaded.protobuf.Reader;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z1.b */
/* loaded from: classes.dex */
public final class C13599b {

    /* renamed from: b */
    public static final C13600a f34590b = new C13600a(null);

    /* renamed from: c */
    private static final int[] f34591c = {18, 20, 17, 15};

    /* renamed from: d */
    private static final int[] f34592d = {65535, 262143, 32767, 8191};

    /* renamed from: e */
    private static final int[] f34593e = {32767, 8191, 65535, 262143};

    /* renamed from: a */
    private final long f34594a;

    /* compiled from: Constraints.kt */
    /* renamed from: z1.b$a */
    /* loaded from: classes.dex */
    public static final class C13600a {
        private C13600a() {
        }

        public /* synthetic */ C13600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final int m910a(int i) {
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        /* renamed from: b */
        public final long m909b(int i, int i2, int i3, int i4) {
            long j;
            int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
            int m910a = m910a(i5);
            int i6 = i2 == Integer.MAX_VALUE ? i : i2;
            int m910a2 = m910a(i6);
            if (m910a + m910a2 <= 31) {
                if (m910a2 == 13) {
                    j = 3;
                } else if (m910a2 == 18) {
                    j = 1;
                } else if (m910a2 == 15) {
                    j = 2;
                } else if (m910a2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                } else {
                    j = 0;
                }
                int i7 = i2 == Integer.MAX_VALUE ? 0 : i2 + 1;
                int i8 = i4 != Integer.MAX_VALUE ? i4 + 1 : 0;
                int i9 = C13599b.f34591c[(int) j];
                return C13599b.m927c((i7 << 33) | j | (i << 2) | (i3 << i9) | (i8 << (i9 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        /* renamed from: c */
        public final long m908c(int i, int i2) {
            if (i >= 0 && i2 >= 0) {
                return m909b(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ C13599b(long j) {
        this.f34594a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13599b m928b(long j) {
        return new C13599b(j);
    }

    /* renamed from: c */
    public static long m927c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final long m926d(long j, int i, int i2, int i3, int i4) {
        boolean z = true;
        if (!(i3 >= 0 && i >= 0)) {
            throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
        }
        if (!(i2 >= i || i2 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        if (i4 < i3 && i4 != Integer.MAX_VALUE) {
            z = false;
        }
        if (z) {
            return f34590b.m909b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
    }

    /* renamed from: e */
    public static /* synthetic */ long m925e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = m914p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = m916n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = m915o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = m917m(j);
        }
        return m926d(j, i6, i7, i8, i4);
    }

    /* renamed from: f */
    public static boolean m924f(long j, Object obj) {
        return (obj instanceof C13599b) && j == ((C13599b) obj).m911s();
    }

    /* renamed from: g */
    public static final boolean m923g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    private static final int m922h(long j) {
        return (int) (j & 3);
    }

    /* renamed from: i */
    public static final boolean m921i(long j) {
        int m922h = m922h(j);
        return (((int) (j >> (f34591c[m922h] + 31))) & f34593e[m922h]) != 0;
    }

    /* renamed from: j */
    public static final boolean m920j(long j) {
        return (((int) (j >> 33)) & f34592d[m922h(j)]) != 0;
    }

    /* renamed from: k */
    public static final boolean m919k(long j) {
        return m917m(j) == m915o(j);
    }

    /* renamed from: l */
    public static final boolean m918l(long j) {
        return m916n(j) == m914p(j);
    }

    /* renamed from: m */
    public static final int m917m(long j) {
        int m922h = m922h(j);
        int i = ((int) (j >> (f34591c[m922h] + 31))) & f34593e[m922h];
        return i == 0 ? Reader.READ_DONE : i - 1;
    }

    /* renamed from: n */
    public static final int m916n(long j) {
        int i = ((int) (j >> 33)) & f34592d[m922h(j)];
        return i == 0 ? Reader.READ_DONE : i - 1;
    }

    /* renamed from: o */
    public static final int m915o(long j) {
        int m922h = m922h(j);
        return ((int) (j >> f34591c[m922h])) & f34593e[m922h];
    }

    /* renamed from: p */
    public static final int m914p(long j) {
        return ((int) (j >> 2)) & f34592d[m922h(j)];
    }

    /* renamed from: q */
    public static int m913q(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: r */
    public static String m912r(long j) {
        int m916n = m916n(j);
        String valueOf = m916n == Integer.MAX_VALUE ? "Infinity" : String.valueOf(m916n);
        int m917m = m917m(j);
        String valueOf2 = m917m != Integer.MAX_VALUE ? String.valueOf(m917m) : "Infinity";
        return "Constraints(minWidth = " + m914p(j) + ", maxWidth = " + valueOf + ", minHeight = " + m915o(j) + ", maxHeight = " + valueOf2 + ')';
    }

    public boolean equals(Object obj) {
        return m924f(this.f34594a, obj);
    }

    public int hashCode() {
        return m913q(this.f34594a);
    }

    /* renamed from: s */
    public final /* synthetic */ long m911s() {
        return this.f34594a;
    }

    public String toString() {
        return m912r(this.f34594a);
    }
}
