package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v0.e1 */
/* loaded from: classes.dex */
public final class C11012e1 {

    /* renamed from: b */
    public static final C11013a f28346b = new C11013a(null);

    /* renamed from: c */
    private static final int f28347c = m6543e(0);

    /* renamed from: d */
    private static final int f28348d = m6543e(1);

    /* renamed from: e */
    private static final int f28349e = m6543e(2);

    /* renamed from: a */
    private final int f28350a;

    /* compiled from: StrokeCap.kt */
    /* renamed from: v0.e1$a */
    /* loaded from: classes.dex */
    public static final class C11013a {
        private C11013a() {
        }

        public /* synthetic */ C11013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m6537a() {
            return C11012e1.f28347c;
        }

        /* renamed from: b */
        public final int m6536b() {
            return C11012e1.f28348d;
        }

        /* renamed from: c */
        public final int m6535c() {
            return C11012e1.f28349e;
        }
    }

    private /* synthetic */ C11012e1(int i) {
        this.f28350a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C11012e1 m6544d(int i) {
        return new C11012e1(i);
    }

    /* renamed from: e */
    public static int m6543e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m6542f(int i, Object obj) {
        return (obj instanceof C11012e1) && i == ((C11012e1) obj).m6538j();
    }

    /* renamed from: g */
    public static final boolean m6541g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m6540h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m6539i(int i) {
        return m6541g(i, f28347c) ? "Butt" : m6541g(i, f28348d) ? "Round" : m6541g(i, f28349e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6542f(this.f28350a, obj);
    }

    public int hashCode() {
        return m6540h(this.f28350a);
    }

    /* renamed from: j */
    public final /* synthetic */ int m6538j() {
        return this.f28350a;
    }

    public String toString() {
        return m6539i(this.f28350a);
    }
}
