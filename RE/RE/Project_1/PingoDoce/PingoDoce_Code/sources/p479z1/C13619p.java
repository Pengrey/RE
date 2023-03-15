package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;
import p479z1.C13622r;

/* renamed from: z1.p */
/* loaded from: classes.dex */
public final class C13619p {

    /* renamed from: b */
    public static final C13620a f34613b = new C13620a(null);

    /* renamed from: c */
    private static final C13622r[] f34614c;

    /* renamed from: d */
    private static final long f34615d;

    /* renamed from: a */
    private final long f34616a;

    /* compiled from: TextUnit.kt */
    /* renamed from: z1.p$a */
    /* loaded from: classes.dex */
    public static final class C13620a {
        private C13620a() {
        }

        public /* synthetic */ C13620a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m806a() {
            return C13619p.f34615d;
        }
    }

    static {
        C13622r.C13623a c13623a = C13622r.f34617b;
        f34614c = new C13622r[]{C13622r.m797d(c13623a.m788c()), C13622r.m797d(c13623a.m789b()), C13622r.m797d(c13623a.m790a())};
        f34615d = C13621q.m801e(0L, Float.NaN);
    }

    private /* synthetic */ C13619p(long j) {
        this.f34616a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13619p m816b(long j) {
        return new C13619p(j);
    }

    /* renamed from: c */
    public static long m815c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m814d(long j, Object obj) {
        return (obj instanceof C13619p) && j == ((C13619p) obj).m807k();
    }

    /* renamed from: e */
    public static final boolean m813e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final long m812f(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: g */
    public static final long m811g(long j) {
        return f34614c[(int) (m812f(j) >>> 32)].m791j();
    }

    /* renamed from: h */
    public static final float m810h(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: i */
    public static int m809i(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: j */
    public static String m808j(long j) {
        long m811g = m811g(j);
        C13622r.C13623a c13623a = C13622r.f34617b;
        if (C13622r.m794g(m811g, c13623a.m788c())) {
            return "Unspecified";
        }
        if (C13622r.m794g(m811g, c13623a.m789b())) {
            return m810h(j) + ".sp";
        } else if (C13622r.m794g(m811g, c13623a.m790a())) {
            return m810h(j) + ".em";
        } else {
            return "Invalid";
        }
    }

    public boolean equals(Object obj) {
        return m814d(this.f34616a, obj);
    }

    public int hashCode() {
        return m809i(this.f34616a);
    }

    /* renamed from: k */
    public final /* synthetic */ long m807k() {
        return this.f34616a;
    }

    public String toString() {
        return m808j(this.f34616a);
    }
}
