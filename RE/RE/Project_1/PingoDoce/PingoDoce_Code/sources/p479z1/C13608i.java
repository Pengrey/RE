package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;
import p479z1.C13605g;

/* renamed from: z1.i */
/* loaded from: classes.dex */
public final class C13608i {

    /* renamed from: b */
    public static final C13609a f34601b = new C13609a(null);

    /* renamed from: c */
    private static final long f34602c;

    /* renamed from: a */
    private final long f34603a;

    /* compiled from: Dp.kt */
    /* renamed from: z1.i$a */
    /* loaded from: classes.dex */
    public static final class C13609a {
        private C13609a() {
        }

        public /* synthetic */ C13609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m856a() {
            return C13608i.f34602c;
        }
    }

    static {
        float f = 0;
        C13607h.m867a(C13605g.m875g(f), C13605g.m875g(f));
        C13605g.C13606a c13606a = C13605g.f34597x;
        f34602c = C13607h.m867a(c13606a.m868b(), c13606a.m868b());
    }

    private /* synthetic */ C13608i(long j) {
        this.f34603a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13608i m864b(long j) {
        return new C13608i(j);
    }

    /* renamed from: c */
    public static long m863c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m862d(long j, Object obj) {
        return (obj instanceof C13608i) && j == ((C13608i) obj).m857i();
    }

    /* renamed from: e */
    public static final float m861e(long j) {
        if (j != f34602c) {
            C6432f c6432f = C6432f.f17524a;
            return C13605g.m875g(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: f */
    public static final float m860f(long j) {
        if (j != f34602c) {
            C6432f c6432f = C6432f.f17524a;
            return C13605g.m875g(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    /* renamed from: g */
    public static int m859g(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: h */
    public static String m858h(long j) {
        if (j != f34601b.m856a()) {
            return '(' + ((Object) C13605g.m871k(m861e(j))) + ", " + ((Object) C13605g.m871k(m860f(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m862d(this.f34603a, obj);
    }

    public int hashCode() {
        return m859g(this.f34603a);
    }

    /* renamed from: i */
    public final /* synthetic */ long m857i() {
        return this.f34603a;
    }

    public String toString() {
        return m858h(this.f34603a);
    }
}
