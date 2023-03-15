package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v0.f1 */
/* loaded from: classes.dex */
public final class C11018f1 {

    /* renamed from: b */
    public static final C11019a f28366b = new C11019a(null);

    /* renamed from: c */
    private static final int f28367c = m6520e(0);

    /* renamed from: d */
    private static final int f28368d = m6520e(1);

    /* renamed from: e */
    private static final int f28369e = m6520e(2);

    /* renamed from: a */
    private final int f28370a;

    /* compiled from: StrokeJoin.kt */
    /* renamed from: v0.f1$a */
    /* loaded from: classes.dex */
    public static final class C11019a {
        private C11019a() {
        }

        public /* synthetic */ C11019a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m6514a() {
            return C11018f1.f28369e;
        }

        /* renamed from: b */
        public final int m6513b() {
            return C11018f1.f28367c;
        }

        /* renamed from: c */
        public final int m6512c() {
            return C11018f1.f28368d;
        }
    }

    private /* synthetic */ C11018f1(int i) {
        this.f28370a = i;
    }

    /* renamed from: d */
    public static final /* synthetic */ C11018f1 m6521d(int i) {
        return new C11018f1(i);
    }

    /* renamed from: e */
    public static int m6520e(int i) {
        return i;
    }

    /* renamed from: f */
    public static boolean m6519f(int i, Object obj) {
        return (obj instanceof C11018f1) && i == ((C11018f1) obj).m6515j();
    }

    /* renamed from: g */
    public static final boolean m6518g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m6517h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m6516i(int i) {
        return m6518g(i, f28367c) ? "Miter" : m6518g(i, f28368d) ? "Round" : m6518g(i, f28369e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m6519f(this.f28370a, obj);
    }

    public int hashCode() {
        return m6517h(this.f28370a);
    }

    /* renamed from: j */
    public final /* synthetic */ int m6515j() {
        return this.f28370a;
    }

    public String toString() {
        return m6516i(this.f28370a);
    }
}
