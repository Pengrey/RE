package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v0.s0 */
/* loaded from: classes.dex */
public final class C11059s0 {

    /* renamed from: b */
    public static final C11060a f28438b = new C11060a(null);

    /* renamed from: c */
    private static final int f28439c = m6289d(0);

    /* renamed from: d */
    private static final int f28440d = m6289d(1);

    /* renamed from: a */
    private final int f28441a;

    /* compiled from: PathFillType.kt */
    /* renamed from: v0.s0$a */
    /* loaded from: classes.dex */
    public static final class C11060a {
        private C11060a() {
        }

        public /* synthetic */ C11060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m6283a() {
            return C11059s0.f28440d;
        }

        /* renamed from: b */
        public final int m6282b() {
            return C11059s0.f28439c;
        }
    }

    private /* synthetic */ C11059s0(int i) {
        this.f28441a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C11059s0 m6290c(int i) {
        return new C11059s0(i);
    }

    /* renamed from: d */
    public static int m6289d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m6288e(int i, Object obj) {
        return (obj instanceof C11059s0) && i == ((C11059s0) obj).m6284i();
    }

    /* renamed from: f */
    public static final boolean m6287f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m6286g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m6285h(int i) {
        return m6287f(i, f28439c) ? "NonZero" : m6287f(i, f28440d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6288e(this.f28441a, obj);
    }

    public int hashCode() {
        return m6286g(this.f28441a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m6284i() {
        return this.f28441a;
    }

    public String toString() {
        return m6285h(this.f28441a);
    }
}
