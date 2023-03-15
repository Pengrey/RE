package p245n1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n1.e */
/* loaded from: classes.dex */
public final class C7584e {

    /* renamed from: b */
    public static final C7585a f20070b = new C7585a(null);

    /* renamed from: c */
    private static final int f20071c = m18092d(0);

    /* renamed from: d */
    private static final int f20072d = m18092d(1);

    /* renamed from: a */
    private final int f20073a;

    /* compiled from: SemanticsProperties.kt */
    /* renamed from: n1.e$a */
    /* loaded from: classes.dex */
    public static final class C7585a {
        private C7585a() {
        }

        public /* synthetic */ C7585a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m18086a() {
            return C7584e.f20072d;
        }

        /* renamed from: b */
        public final int m18085b() {
            return C7584e.f20071c;
        }
    }

    private /* synthetic */ C7584e(int i) {
        this.f20073a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C7584e m18093c(int i) {
        return new C7584e(i);
    }

    /* renamed from: d */
    private static int m18092d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m18091e(int i, Object obj) {
        return (obj instanceof C7584e) && i == ((C7584e) obj).m18087i();
    }

    /* renamed from: f */
    public static final boolean m18090f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m18089g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m18088h(int i) {
        return m18090f(i, f20071c) ? "Polite" : m18090f(i, f20072d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m18091e(this.f20073a, obj);
    }

    public int hashCode() {
        return m18089g(this.f20073a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m18087i() {
        return this.f20073a;
    }

    public String toString() {
        return m18088h(this.f20073a);
    }
}
