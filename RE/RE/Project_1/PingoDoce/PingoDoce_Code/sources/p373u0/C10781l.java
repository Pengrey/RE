package p373u0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: u0.l */
/* loaded from: classes.dex */
public final class C10781l {

    /* renamed from: b */
    public static final C10782a f27885b = new C10782a(null);

    /* renamed from: c */
    private static final long f27886c = C10783m.m7085a(0.0f, 0.0f);

    /* renamed from: d */
    private static final long f27887d = C10783m.m7085a(Float.NaN, Float.NaN);

    /* renamed from: a */
    private final long f27888a;

    /* compiled from: Size.kt */
    /* renamed from: u0.l$a */
    /* loaded from: classes.dex */
    public static final class C10782a {
        private C10782a() {
        }

        public /* synthetic */ C10782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m7087a() {
            return C10781l.f27887d;
        }

        /* renamed from: b */
        public final long m7086b() {
            return C10781l.f27886c;
        }
    }

    private /* synthetic */ C10781l(long j) {
        this.f27888a = j;
    }

    /* renamed from: c */
    public static final /* synthetic */ C10781l m7097c(long j) {
        return new C10781l(j);
    }

    /* renamed from: d */
    public static long m7096d(long j) {
        return j;
    }

    /* renamed from: e */
    public static boolean m7095e(long j, Object obj) {
        return (obj instanceof C10781l) && j == ((C10781l) obj).m7088l();
    }

    /* renamed from: f */
    public static final boolean m7094f(long j, long j2) {
        return j == j2;
    }

    /* renamed from: g */
    public static final float m7093g(long j) {
        if (j != f27887d) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: h */
    public static final float m7092h(long j) {
        return Math.min(Math.abs(m7091i(j)), Math.abs(m7093g(j)));
    }

    /* renamed from: i */
    public static final float m7091i(long j) {
        if (j != f27887d) {
            C6432f c6432f = C6432f.f17524a;
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* renamed from: j */
    public static int m7090j(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: k */
    public static String m7089k(long j) {
        if (j != f27885b.m7087a()) {
            return "Size(" + C10772c.m7168a(m7091i(j), 1) + ", " + C10772c.m7168a(m7093g(j), 1) + ')';
        }
        return "Size.Unspecified";
    }

    public boolean equals(Object obj) {
        return m7095e(this.f27888a, obj);
    }

    public int hashCode() {
        return m7090j(this.f27888a);
    }

    /* renamed from: l */
    public final /* synthetic */ long m7088l() {
        return this.f27888a;
    }

    public String toString() {
        return m7089k(this.f27888a);
    }
}
