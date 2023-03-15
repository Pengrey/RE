package p358t0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t0.c */
/* loaded from: classes.dex */
public final class C10325c {

    /* renamed from: b */
    public static final C10326a f26902b = new C10326a(null);

    /* renamed from: c */
    private static final int f26903c = m8270j(1);

    /* renamed from: d */
    private static final int f26904d = m8270j(2);

    /* renamed from: e */
    private static final int f26905e = m8270j(3);

    /* renamed from: f */
    private static final int f26906f = m8270j(4);

    /* renamed from: g */
    private static final int f26907g = m8270j(5);

    /* renamed from: h */
    private static final int f26908h = m8270j(6);

    /* renamed from: i */
    private static final int f26909i = m8270j(7);

    /* renamed from: j */
    private static final int f26910j = m8270j(8);

    /* renamed from: a */
    private final int f26911a;

    /* compiled from: FocusTraversal.kt */
    /* renamed from: t0.c$a */
    /* loaded from: classes.dex */
    public static final class C10326a {
        private C10326a() {
        }

        public /* synthetic */ C10326a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m8264a() {
            return C10325c.f26908h;
        }

        /* renamed from: b */
        public final int m8263b() {
            return C10325c.f26909i;
        }

        /* renamed from: c */
        public final int m8262c() {
            return C10325c.f26905e;
        }

        /* renamed from: d */
        public final int m8261d() {
            return C10325c.f26903c;
        }

        /* renamed from: e */
        public final int m8260e() {
            return C10325c.f26910j;
        }

        /* renamed from: f */
        public final int m8259f() {
            return C10325c.f26904d;
        }

        /* renamed from: g */
        public final int m8258g() {
            return C10325c.f26906f;
        }

        /* renamed from: h */
        public final int m8257h() {
            return C10325c.f26907g;
        }
    }

    private /* synthetic */ C10325c(int i) {
        this.f26911a = i;
    }

    /* renamed from: i */
    public static final /* synthetic */ C10325c m8271i(int i) {
        return new C10325c(i);
    }

    /* renamed from: j */
    public static int m8270j(int i) {
        return i;
    }

    /* renamed from: k */
    public static boolean m8269k(int i, Object obj) {
        return (obj instanceof C10325c) && i == ((C10325c) obj).m8265o();
    }

    /* renamed from: l */
    public static final boolean m8268l(int i, int i2) {
        return i == i2;
    }

    /* renamed from: m */
    public static int m8267m(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: n */
    public static String m8266n(int i) {
        return m8268l(i, f26903c) ? "Next" : m8268l(i, f26904d) ? "Previous" : m8268l(i, f26905e) ? "Left" : m8268l(i, f26906f) ? "Right" : m8268l(i, f26907g) ? "Up" : m8268l(i, f26908h) ? "Down" : m8268l(i, f26909i) ? "In" : m8268l(i, f26910j) ? "Out" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m8269k(this.f26911a, obj);
    }

    public int hashCode() {
        return m8267m(this.f26911a);
    }

    /* renamed from: o */
    public final /* synthetic */ int m8265o() {
        return this.f26911a;
    }

    public String toString() {
        return m8266n(this.f26911a);
    }
}
