package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z1.r */
/* loaded from: classes.dex */
public final class C13622r {

    /* renamed from: b */
    public static final C13623a f34617b = new C13623a(null);

    /* renamed from: c */
    private static final long f34618c = m796e(0);

    /* renamed from: d */
    private static final long f34619d = m796e(4294967296L);

    /* renamed from: e */
    private static final long f34620e = m796e(8589934592L);

    /* renamed from: a */
    private final long f34621a;

    /* compiled from: TextUnit.kt */
    /* renamed from: z1.r$a */
    /* loaded from: classes.dex */
    public static final class C13623a {
        private C13623a() {
        }

        public /* synthetic */ C13623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m790a() {
            return C13622r.f34620e;
        }

        /* renamed from: b */
        public final long m789b() {
            return C13622r.f34619d;
        }

        /* renamed from: c */
        public final long m788c() {
            return C13622r.f34618c;
        }
    }

    private /* synthetic */ C13622r(long j) {
        this.f34621a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ C13622r m797d(long j) {
        return new C13622r(j);
    }

    /* renamed from: e */
    public static long m796e(long j) {
        return j;
    }

    /* renamed from: f */
    public static boolean m795f(long j, Object obj) {
        return (obj instanceof C13622r) && j == ((C13622r) obj).m791j();
    }

    /* renamed from: g */
    public static final boolean m794g(long j, long j2) {
        return j == j2;
    }

    /* renamed from: h */
    public static int m793h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m792i(long j) {
        return m794g(j, f34618c) ? "Unspecified" : m794g(j, f34619d) ? "Sp" : m794g(j, f34620e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m795f(this.f34621a, obj);
    }

    public int hashCode() {
        return m793h(this.f34621a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m791j() {
        return this.f34621a;
    }

    public String toString() {
        return m792i(this.f34621a);
    }
}
