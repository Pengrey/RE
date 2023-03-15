package p411w0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C11507b {

    /* renamed from: a */
    public static final C11508a f29451a = new C11508a(null);

    /* renamed from: b */
    private static final long f29452b;

    /* renamed from: c */
    private static final long f29453c;

    /* renamed from: d */
    private static final long f29454d;

    /* renamed from: e */
    private static final long f29455e;

    /* compiled from: ColorModel.kt */
    /* renamed from: w0.b$a */
    /* loaded from: classes.dex */
    public static final class C11508a {
        private C11508a() {
        }

        public /* synthetic */ C11508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m4928a() {
            return C11507b.f29454d;
        }

        /* renamed from: b */
        public final long m4927b() {
            return C11507b.f29452b;
        }

        /* renamed from: c */
        public final long m4926c() {
            return C11507b.f29453c;
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        f29452b = m4933d((0 & 4294967295L) | j2);
        f29453c = m4933d((1 & 4294967295L) | j2);
        f29454d = m4933d(j2 | (2 & 4294967295L));
        f29455e = m4933d((j & 4294967295L) | (4 << 32));
    }

    /* renamed from: d */
    public static long m4933d(long j) {
        return j;
    }

    /* renamed from: e */
    public static final boolean m4932e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m4931f(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: g */
    public static int m4930g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m4929h(long j) {
        return m4932e(j, f29452b) ? "Rgb" : m4932e(j, f29453c) ? "Xyz" : m4932e(j, f29454d) ? "Lab" : m4932e(j, f29455e) ? "Cmyk" : "Unknown";
    }
}
