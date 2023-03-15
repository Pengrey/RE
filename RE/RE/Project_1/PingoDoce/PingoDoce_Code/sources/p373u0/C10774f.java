package p373u0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: u0.f */
/* loaded from: classes.dex */
public final class C10774f {

    /* renamed from: b */
    public static final C10775a f27866b = new C10775a(null);

    /* renamed from: c */
    private static final long f27867c = C10776g.m7133a(0.0f, 0.0f);

    /* renamed from: d */
    private static final long f27868d = C10776g.m7133a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    private static final long f27869e = C10776g.m7133a(Float.NaN, Float.NaN);

    /* renamed from: a */
    private final long f27870a;

    /* compiled from: Offset.kt */
    /* renamed from: u0.f$a */
    /* loaded from: classes.dex */
    public static final class C10775a {
        private C10775a() {
        }

        public /* synthetic */ C10775a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m7136a() {
            return C10774f.f27868d;
        }

        /* renamed from: b */
        public final long m7135b() {
            return C10774f.f27869e;
        }

        /* renamed from: c */
        public final long m7134c() {
            return C10774f.f27867c;
        }
    }

    private /* synthetic */ C10774f(long j) {
        this.f27870a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ C10774f m7152d(long j) {
        return new C10774f(j);
    }

    /* renamed from: e */
    public static final float m7151e(long j) {
        return m7145k(j);
    }

    /* renamed from: f */
    public static final float m7150f(long j) {
        return m7144l(j);
    }

    /* renamed from: g */
    public static long m7149g(long j) {
        return j;
    }

    /* renamed from: h */
    public static boolean m7148h(long j, Object obj) {
        return (obj instanceof C10774f) && j == ((C10774f) obj).m7137s();
    }

    /* renamed from: i */
    public static final boolean m7147i(long j, long j2) {
        return j == j2;
    }

    /* renamed from: j */
    public static final float m7146j(long j) {
        return (float) Math.sqrt((m7145k(j) * m7145k(j)) + (m7144l(j) * m7144l(j)));
    }

    /* renamed from: k */
    public static final float m7145k(long j) {
        if (j != f27869e) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: l */
    public static final float m7144l(long j) {
        if (j != f27869e) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* renamed from: m */
    public static int m7143m(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: n */
    public static final boolean m7142n(long j) {
        if ((Float.isNaN(m7145k(j)) || Float.isNaN(m7144l(j))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    /* renamed from: o */
    public static final long m7141o(long j, long j2) {
        return C10776g.m7133a(m7145k(j) - m7145k(j2), m7144l(j) - m7144l(j2));
    }

    /* renamed from: p */
    public static final long m7140p(long j, long j2) {
        return C10776g.m7133a(m7145k(j) + m7145k(j2), m7144l(j) + m7144l(j2));
    }

    /* renamed from: q */
    public static final long m7139q(long j, float f) {
        return C10776g.m7133a(m7145k(j) * f, m7144l(j) * f);
    }

    /* renamed from: r */
    public static String m7138r(long j) {
        if (C10776g.m7131c(j)) {
            return "Offset(" + C10772c.m7168a(m7145k(j), 1) + ", " + C10772c.m7168a(m7144l(j), 1) + ')';
        }
        return "Offset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m7148h(this.f27870a, obj);
    }

    public int hashCode() {
        return m7143m(this.f27870a);
    }

    /* renamed from: s */
    public final /* synthetic */ long m7137s() {
        return this.f27870a;
    }

    public String toString() {
        return m7138r(this.f27870a);
    }
}
