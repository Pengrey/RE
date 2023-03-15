package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z1.m */
/* loaded from: classes.dex */
public final class C13615m {

    /* renamed from: b */
    public static final C13616a f34610b = new C13616a(null);

    /* renamed from: c */
    private static final long f34611c = m828c(0);

    /* renamed from: a */
    private final long f34612a;

    /* compiled from: IntSize.kt */
    /* renamed from: z1.m$a */
    /* loaded from: classes.dex */
    public static final class C13616a {
        private C13616a() {
        }

        public /* synthetic */ C13616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m820a() {
            return C13615m.f34611c;
        }
    }

    private /* synthetic */ C13615m(long j) {
        this.f34612a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13615m m829b(long j) {
        return new C13615m(j);
    }

    /* renamed from: c */
    public static long m828c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m827d(long j, Object obj) {
        return (obj instanceof C13615m) && j == ((C13615m) obj).m821j();
    }

    /* renamed from: e */
    public static final boolean m826e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final int m825f(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: g */
    public static final int m824g(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: h */
    public static int m823h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m822i(long j) {
        return m824g(j) + " x " + m825f(j);
    }

    public boolean equals(Object obj) {
        return m827d(this.f34612a, obj);
    }

    public int hashCode() {
        return m823h(this.f34612a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m821j() {
        return this.f34612a;
    }

    public String toString() {
        return m822i(this.f34612a);
    }
}
