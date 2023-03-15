package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C13061c {

    /* renamed from: b */
    public static final C13062a f33964b = new C13062a(null);

    /* renamed from: c */
    private static final int f33965c = m1740h(1);

    /* renamed from: d */
    private static final int f33966d = m1740h(2);

    /* renamed from: e */
    private static final int f33967e = m1740h(3);

    /* renamed from: f */
    private static final int f33968f = m1740h(4);

    /* renamed from: g */
    private static final int f33969g = m1740h(5);

    /* renamed from: h */
    private static final int f33970h = m1740h(6);

    /* renamed from: a */
    private final int f33971a;

    /* compiled from: TextAlign.kt */
    /* renamed from: y1.c$a */
    /* loaded from: classes.dex */
    public static final class C13062a {
        private C13062a() {
        }

        public /* synthetic */ C13062a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m1734a() {
            return C13061c.f33967e;
        }

        /* renamed from: b */
        public final int m1733b() {
            return C13061c.f33970h;
        }

        /* renamed from: c */
        public final int m1732c() {
            return C13061c.f33968f;
        }

        /* renamed from: d */
        public final int m1731d() {
            return C13061c.f33965c;
        }

        /* renamed from: e */
        public final int m1730e() {
            return C13061c.f33966d;
        }

        /* renamed from: f */
        public final int m1729f() {
            return C13061c.f33969g;
        }
    }

    private /* synthetic */ C13061c(int i) {
        this.f33971a = i;
    }

    /* renamed from: g */
    public static final /* synthetic */ C13061c m1741g(int i) {
        return new C13061c(i);
    }

    /* renamed from: h */
    public static int m1740h(int i) {
        return i;
    }

    /* renamed from: i */
    public static boolean m1739i(int i, Object obj) {
        return (obj instanceof C13061c) && i == ((C13061c) obj).m1735m();
    }

    /* renamed from: j */
    public static final boolean m1738j(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static int m1737k(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: l */
    public static String m1736l(int i) {
        return m1738j(i, f33965c) ? "Left" : m1738j(i, f33966d) ? "Right" : m1738j(i, f33967e) ? "Center" : m1738j(i, f33968f) ? "Justify" : m1738j(i, f33969g) ? "Start" : m1738j(i, f33970h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m1739i(this.f33971a, obj);
    }

    public int hashCode() {
        return m1737k(this.f33971a);
    }

    /* renamed from: m */
    public final /* synthetic */ int m1735m() {
        return this.f33971a;
    }

    public String toString() {
        return m1736l(this.f33971a);
    }
}
