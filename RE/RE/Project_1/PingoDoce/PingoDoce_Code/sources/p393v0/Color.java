package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p411w0.AbstractC11509c;
import p411w0.C11511e;
import p411w0.ColorSpace;
import p411w0.Connector;
import p468yc.C13192s;
import p468yc.C13196w;

/* renamed from: v0.a0 */
/* loaded from: classes.dex */
public final class Color {

    /* renamed from: b */
    public static final C10994a f28297b = new C10994a(null);

    /* renamed from: c */
    private static final long f28298c = C11003c0.m6593c(4278190080L);

    /* renamed from: d */
    private static final long f28299d;

    /* renamed from: e */
    private static final long f28300e;

    /* renamed from: f */
    private static final long f28301f;

    /* renamed from: g */
    private static final long f28302g;

    /* renamed from: h */
    private static final long f28303h;

    /* renamed from: i */
    private static final long f28304i;

    /* renamed from: a */
    private final long f28305a;

    /* compiled from: Color.kt */
    /* renamed from: v0.a0$a */
    /* loaded from: classes.dex */
    public static final class C10994a {
        private C10994a() {
        }

        public /* synthetic */ C10994a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m6637a() {
            return Color.m6659a();
        }

        /* renamed from: b */
        public final long m6636b() {
            return Color.m6658b();
        }

        /* renamed from: c */
        public final long m6635c() {
            return Color.m6657c();
        }

        /* renamed from: d */
        public final long m6634d() {
            return Color.m6656d();
        }

        /* renamed from: e */
        public final long m6633e() {
            return Color.m6655e();
        }

        /* renamed from: f */
        public final long m6632f() {
            return Color.m6654f();
        }

        /* renamed from: g */
        public final long m6631g() {
            return Color.m6653g();
        }
    }

    static {
        C11003c0.m6593c(4282664004L);
        C11003c0.m6593c(4287137928L);
        f28299d = C11003c0.m6593c(4291611852L);
        f28300e = C11003c0.m6593c(4294967295L);
        f28301f = C11003c0.m6593c(4294901760L);
        C11003c0.m6593c(4278255360L);
        f28302g = C11003c0.m6593c(4278190335L);
        C11003c0.m6593c(4294967040L);
        C11003c0.m6593c(4278255615L);
        C11003c0.m6593c(4294902015L);
        f28303h = C11003c0.m6594b(0);
        f28304i = C11003c0.m6595a(0.0f, 0.0f, 0.0f, 0.0f, C11511e.f29459a.m4880t());
    }

    private /* synthetic */ Color(long j) {
        this.f28305a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ long m6659a() {
        return f28298c;
    }

    /* renamed from: b */
    public static final /* synthetic */ long m6658b() {
        return f28302g;
    }

    /* renamed from: c */
    public static final /* synthetic */ long m6657c() {
        return f28299d;
    }

    /* renamed from: d */
    public static final /* synthetic */ long m6656d() {
        return f28301f;
    }

    /* renamed from: e */
    public static final /* synthetic */ long m6655e() {
        return f28303h;
    }

    /* renamed from: f */
    public static final /* synthetic */ long m6654f() {
        return f28304i;
    }

    /* renamed from: g */
    public static final /* synthetic */ long m6653g() {
        return f28300e;
    }

    /* renamed from: h */
    public static final /* synthetic */ Color m6652h(long j) {
        return new Color(j);
    }

    /* renamed from: i */
    public static long m6651i(long j) {
        return j;
    }

    /* renamed from: j */
    public static final long m6650j(long j, AbstractC11509c abstractC11509c) {
        Intrinsics.isThisObjectNull(abstractC11509c, "colorSpace");
        if (Intrinsics.equals(abstractC11509c, m6643q(j))) {
            return j;
        }
        Connector m4908i = ColorSpace.m4908i(m6643q(j), abstractC11509c, 0, 2, null);
        float[] m6592d = C11003c0.m6592d(j);
        m4908i.m4877a(m6592d);
        return C11003c0.m6595a(m6592d[0], m6592d[1], m6592d[2], m6592d[3], abstractC11509c);
    }

    /* renamed from: k */
    public static final long m6649k(long j, float f, float f2, float f3, float f4) {
        return C11003c0.m6595a(f2, f3, f4, f, m6643q(j));
    }

    /* renamed from: l */
    public static /* synthetic */ long m6648l(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m6645o(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m6641s(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m6642r(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m6644p(j);
        }
        return m6649k(j, f5, f6, f7, f4);
    }

    /* renamed from: m */
    public static boolean m6647m(long j, Object obj) {
        return (obj instanceof Color) && j == ((Color) obj).m6638v();
    }

    /* renamed from: n */
    public static final boolean m6646n(long j, long j2) {
        return j == j2;
    }

    /* renamed from: o */
    public static final float m6645o(long j) {
        float m1438b;
        float f;
        if (C13192s.m1445c(63 & j) == 0) {
            m1438b = (float) C13196w.m1438b(C13192s.m1445c(C13192s.m1445c(j >>> 56) & 255));
            f = 255.0f;
        } else {
            m1438b = (float) C13196w.m1438b(C13192s.m1445c(C13192s.m1445c(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return m1438b / f;
    }

    /* renamed from: p */
    public static final float m6644p(long j) {
        if (C13192s.m1445c(63 & j) == 0) {
            return ((float) C13196w.m1438b(C13192s.m1445c(C13192s.m1445c(j >>> 32) & 255))) / 255.0f;
        }
        return C11010e0.m6550d(C11010e0.m6551c((short) C13192s.m1445c(C13192s.m1445c(j >>> 16) & 65535)));
    }

    /* renamed from: q */
    public static final AbstractC11509c m6643q(long j) {
        return C11511e.f29459a.m4892h()[(int) C13192s.m1445c(j & 63)];
    }

    /* renamed from: r */
    public static final float m6642r(long j) {
        if (C13192s.m1445c(63 & j) == 0) {
            return ((float) C13196w.m1438b(C13192s.m1445c(C13192s.m1445c(j >>> 40) & 255))) / 255.0f;
        }
        return C11010e0.m6550d(C11010e0.m6551c((short) C13192s.m1445c(C13192s.m1445c(j >>> 32) & 65535)));
    }

    /* renamed from: s */
    public static final float m6641s(long j) {
        if (C13192s.m1445c(63 & j) == 0) {
            return ((float) C13196w.m1438b(C13192s.m1445c(C13192s.m1445c(j >>> 48) & 255))) / 255.0f;
        }
        return C11010e0.m6550d(C11010e0.m6551c((short) C13192s.m1445c(C13192s.m1445c(j >>> 48) & 65535)));
    }

    /* renamed from: t */
    public static int m6640t(long j) {
        return C13192s.m1443e(j);
    }

    /* renamed from: u */
    public static String m6639u(long j) {
        return "Color(" + m6641s(j) + ", " + m6642r(j) + ", " + m6644p(j) + ", " + m6645o(j) + ", " + m6643q(j).m4919g() + ')';
    }

    public boolean equals(Object obj) {
        return m6647m(this.f28305a, obj);
    }

    public int hashCode() {
        return m6640t(this.f28305a);
    }

    public String toString() {
        return m6639u(this.f28305a);
    }

    /* renamed from: v */
    public final /* synthetic */ long m6638v() {
        return this.f28305a;
    }
}
