package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;
import p479z1.C13605g;

/* renamed from: z1.j */
/* loaded from: classes.dex */
public final class C13610j {

    /* renamed from: a */
    public static final C13611a f34604a = new C13611a(null);

    /* renamed from: b */
    private static final long f34605b;

    /* renamed from: c */
    private static final long f34606c;

    /* compiled from: Dp.kt */
    /* renamed from: z1.j$a */
    /* loaded from: classes.dex */
    public static final class C13611a {
        private C13611a() {
        }

        public /* synthetic */ C13611a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m848a() {
            return C13610j.f34606c;
        }

        /* renamed from: b */
        public final long m847b() {
            return C13610j.f34605b;
        }
    }

    static {
        float f = 0;
        f34605b = C13607h.m866b(C13605g.m875g(f), C13605g.m875g(f));
        C13605g.C13606a c13606a = C13605g.f34597x;
        f34606c = C13607h.m866b(c13606a.m868b(), c13606a.m868b());
    }

    /* renamed from: c */
    public static long m853c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final boolean m852d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static final float m851e(long j) {
        if (j != f34606c) {
            C6432f c6432f = C6432f.f17524a;
            return C13605g.m875g(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: f */
    public static final float m850f(long j) {
        if (j != f34606c) {
            C6432f c6432f = C6432f.f17524a;
            return C13605g.m875g(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: g */
    public static int m849g(long j) {
        return Long.hashCode(j);
    }
}
