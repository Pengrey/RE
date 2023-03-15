package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y1.e */
/* loaded from: classes.dex */
public final class C13064e {

    /* renamed from: b */
    public static final C13065a f33977b = new C13065a(null);

    /* renamed from: c */
    private static final int f33978c = m1714g(1);

    /* renamed from: d */
    private static final int f33979d = m1714g(2);

    /* renamed from: e */
    private static final int f33980e = m1714g(3);

    /* renamed from: f */
    private static final int f33981f = m1714g(4);

    /* renamed from: g */
    private static final int f33982g = m1714g(5);

    /* renamed from: a */
    private final int f33983a;

    /* compiled from: TextDirection.kt */
    /* renamed from: y1.e$a */
    /* loaded from: classes.dex */
    public static final class C13065a {
        private C13065a() {
        }

        public /* synthetic */ C13065a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m1708a() {
            return C13064e.f33980e;
        }

        /* renamed from: b */
        public final int m1707b() {
            return C13064e.f33981f;
        }

        /* renamed from: c */
        public final int m1706c() {
            return C13064e.f33982g;
        }

        /* renamed from: d */
        public final int m1705d() {
            return C13064e.f33978c;
        }

        /* renamed from: e */
        public final int m1704e() {
            return C13064e.f33979d;
        }
    }

    private /* synthetic */ C13064e(int i) {
        this.f33983a = i;
    }

    /* renamed from: f */
    public static final /* synthetic */ C13064e m1715f(int i) {
        return new C13064e(i);
    }

    /* renamed from: g */
    public static int m1714g(int i) {
        return i;
    }

    /* renamed from: h */
    public static boolean m1713h(int i, Object obj) {
        return (obj instanceof C13064e) && i == ((C13064e) obj).m1709l();
    }

    /* renamed from: i */
    public static final boolean m1712i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m1711j(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: k */
    public static String m1710k(int i) {
        return m1712i(i, f33978c) ? "Ltr" : m1712i(i, f33979d) ? "Rtl" : m1712i(i, f33980e) ? "Content" : m1712i(i, f33981f) ? "ContentOrLtr" : m1712i(i, f33982g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m1713h(this.f33983a, obj);
    }

    public int hashCode() {
        return m1711j(this.f33983a);
    }

    /* renamed from: l */
    public final /* synthetic */ int m1709l() {
        return this.f33983a;
    }

    public String toString() {
        return m1710k(this.f33983a);
    }
}
