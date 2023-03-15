package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: z1.s */
/* loaded from: classes.dex */
public final class C13624s {

    /* renamed from: b */
    public static final C13625a f34622b = new C13625a(null);

    /* renamed from: c */
    private static final long f34623c = C13626t.m772a(0.0f, 0.0f);

    /* renamed from: a */
    private final long f34624a;

    /* compiled from: Velocity.kt */
    /* renamed from: z1.s$a */
    /* loaded from: classes.dex */
    public static final class C13625a {
        private C13625a() {
        }

        public /* synthetic */ C13625a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m773a() {
            return C13624s.f34623c;
        }
    }

    private /* synthetic */ C13624s(long j) {
        this.f34624a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13624s m786b(long j) {
        return new C13624s(j);
    }

    /* renamed from: c */
    public static long m785c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final long m784d(long j, float f, float f2) {
        return C13626t.m772a(f, f2);
    }

    /* renamed from: e */
    public static /* synthetic */ long m783e(long j, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m780h(j);
        }
        if ((i & 2) != 0) {
            f2 = m779i(j);
        }
        return m784d(j, f, f2);
    }

    /* renamed from: f */
    public static boolean m782f(long j, Object obj) {
        return (obj instanceof C13624s) && j == ((C13624s) obj).m774n();
    }

    /* renamed from: g */
    public static final boolean m781g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final float m780h(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: i */
    public static final float m779i(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: j */
    public static int m778j(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: k */
    public static final long m777k(long j, long j2) {
        return C13626t.m772a(m780h(j) - m780h(j2), m779i(j) - m779i(j2));
    }

    /* renamed from: l */
    public static final long m776l(long j, long j2) {
        return C13626t.m772a(m780h(j) + m780h(j2), m779i(j) + m779i(j2));
    }

    /* renamed from: m */
    public static String m775m(long j) {
        return '(' + m780h(j) + ", " + m779i(j) + ") px/sec";
    }

    public boolean equals(Object obj) {
        return m782f(this.f34624a, obj);
    }

    public int hashCode() {
        return m778j(this.f34624a);
    }

    /* renamed from: n */
    public final /* synthetic */ long m774n() {
        return this.f34624a;
    }

    public String toString() {
        return m775m(this.f34624a);
    }
}
