package p286p1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p1.w */
/* loaded from: classes.dex */
public final class C8393w {

    /* renamed from: b */
    public static final C8394a f21718b = new C8394a(null);

    /* renamed from: c */
    private static final long f21719c = C8395x.m15530a(0);

    /* renamed from: a */
    private final long f21720a;

    /* compiled from: TextRange.kt */
    /* renamed from: p1.w$a */
    /* loaded from: classes.dex */
    public static final class C8394a {
        private C8394a() {
        }

        public /* synthetic */ C8394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m15531a() {
            return C8393w.f21719c;
        }
    }

    private /* synthetic */ C8393w(long j) {
        this.f21720a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C8393w m15543b(long j) {
        return new C8393w(j);
    }

    /* renamed from: c */
    public static long m15542c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m15541d(long j, Object obj) {
        return (obj instanceof C8393w) && j == ((C8393w) obj).m15532m();
    }

    /* renamed from: e */
    public static final boolean m15540e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final boolean m15539f(long j) {
        return m15535j(j) == m15538g(j);
    }

    /* renamed from: g */
    public static final int m15538g(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: h */
    public static final int m15537h(long j) {
        return m15535j(j) > m15538g(j) ? m15535j(j) : m15538g(j);
    }

    /* renamed from: i */
    public static final int m15536i(long j) {
        return m15535j(j) > m15538g(j) ? m15538g(j) : m15535j(j);
    }

    /* renamed from: j */
    public static final int m15535j(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: k */
    public static int m15534k(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: l */
    public static String m15533l(long j) {
        return "TextRange(" + m15535j(j) + ", " + m15538g(j) + ')';
    }

    public boolean equals(Object obj) {
        return m15541d(this.f21720a, obj);
    }

    public int hashCode() {
        return m15534k(this.f21720a);
    }

    /* renamed from: m */
    public final /* synthetic */ long m15532m() {
        return this.f21720a;
    }

    public String toString() {
        return m15533l(this.f21720a);
    }
}
