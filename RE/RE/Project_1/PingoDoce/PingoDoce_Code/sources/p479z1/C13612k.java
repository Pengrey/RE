package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z1.k */
/* loaded from: classes.dex */
public final class C13612k {

    /* renamed from: b */
    public static final C13613a f34607b = new C13613a(null);

    /* renamed from: c */
    private static final long f34608c = C13614l.m833a(0, 0);

    /* renamed from: a */
    private final long f34609a;

    /* compiled from: IntOffset.kt */
    /* renamed from: z1.k$a */
    /* loaded from: classes.dex */
    public static final class C13613a {
        private C13613a() {
        }

        public /* synthetic */ C13613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m834a() {
            return C13612k.f34608c;
        }
    }

    private /* synthetic */ C13612k(long j) {
        this.f34609a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13612k m845b(long j) {
        return new C13612k(j);
    }

    /* renamed from: c */
    public static long m844c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final long m843d(long j, int i, int i2) {
        return C13614l.m833a(i, i2);
    }

    /* renamed from: e */
    public static /* synthetic */ long m842e(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m839h(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m838i(j);
        }
        return m843d(j, i, i2);
    }

    /* renamed from: f */
    public static boolean m841f(long j, Object obj) {
        return (obj instanceof C13612k) && j == ((C13612k) obj).m835l();
    }

    /* renamed from: g */
    public static final boolean m840g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static final int m839h(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: i */
    public static final int m838i(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: j */
    public static int m837j(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: k */
    public static String m836k(long j) {
        return '(' + m839h(j) + ", " + m838i(j) + ')';
    }

    public boolean equals(Object obj) {
        return m841f(this.f34609a, obj);
    }

    public int hashCode() {
        return m837j(this.f34609a);
    }

    /* renamed from: l */
    public final /* synthetic */ long m835l() {
        return this.f34609a;
    }

    public String toString() {
        return m836k(this.f34609a);
    }
}
