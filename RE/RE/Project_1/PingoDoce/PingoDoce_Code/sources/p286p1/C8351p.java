package p286p1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: p1.p */
/* loaded from: classes.dex */
public final class C8351p {

    /* renamed from: a */
    public static final C8352a f21623a = new C8352a(null);

    /* renamed from: b */
    private static final int f21624b = m15663h(1);

    /* renamed from: c */
    private static final int f21625c = m15663h(2);

    /* renamed from: d */
    private static final int f21626d = m15663h(3);

    /* renamed from: e */
    private static final int f21627e = m15663h(4);

    /* renamed from: f */
    private static final int f21628f = m15663h(5);

    /* renamed from: g */
    private static final int f21629g = m15663h(6);

    /* renamed from: h */
    private static final int f21630h = m15663h(7);

    /* compiled from: Placeholder.kt */
    /* renamed from: p1.p$a */
    /* loaded from: classes.dex */
    public static final class C8352a {
        private C8352a() {
        }

        public /* synthetic */ C8352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m15659a() {
            return C8351p.f21624b;
        }

        /* renamed from: b */
        public final int m15658b() {
            return C8351p.f21626d;
        }

        /* renamed from: c */
        public final int m15657c() {
            return C8351p.f21627e;
        }

        /* renamed from: d */
        public final int m15656d() {
            return C8351p.f21629g;
        }

        /* renamed from: e */
        public final int m15655e() {
            return C8351p.f21630h;
        }

        /* renamed from: f */
        public final int m15654f() {
            return C8351p.f21628f;
        }

        /* renamed from: g */
        public final int m15653g() {
            return C8351p.f21625c;
        }
    }

    /* renamed from: h */
    public static int m15663h(int i) {
        return i;
    }

    /* renamed from: i */
    public static final boolean m15662i(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    public static int m15661j(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: k */
    public static String m15660k(int i) {
        return m15662i(i, f21624b) ? "AboveBaseline" : m15662i(i, f21625c) ? "Top" : m15662i(i, f21626d) ? "Bottom" : m15662i(i, f21627e) ? "Center" : m15662i(i, f21628f) ? "TextTop" : m15662i(i, f21629g) ? "TextBottom" : m15662i(i, f21630h) ? "TextCenter" : "Invalid";
    }
}
