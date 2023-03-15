package p245n1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n1.h */
/* loaded from: classes.dex */
public final class C7591h {

    /* renamed from: b */
    public static final C7592a f20087b = new C7592a(null);

    /* renamed from: c */
    private static final int f20088c = m18066h(0);

    /* renamed from: d */
    private static final int f20089d = m18066h(1);

    /* renamed from: e */
    private static final int f20090e = m18066h(2);

    /* renamed from: f */
    private static final int f20091f = m18066h(3);

    /* renamed from: g */
    private static final int f20092g = m18066h(4);

    /* renamed from: h */
    private static final int f20093h = m18066h(5);

    /* renamed from: a */
    private final int f20094a;

    /* compiled from: SemanticsProperties.kt */
    /* renamed from: n1.h$a */
    /* loaded from: classes.dex */
    public static final class C7592a {
        private C7592a() {
        }

        public /* synthetic */ C7592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m18060a() {
            return C7591h.f20088c;
        }

        /* renamed from: b */
        public final int m18059b() {
            return C7591h.f20089d;
        }

        /* renamed from: c */
        public final int m18058c() {
            return C7591h.f20093h;
        }

        /* renamed from: d */
        public final int m18057d() {
            return C7591h.f20091f;
        }

        /* renamed from: e */
        public final int m18056e() {
            return C7591h.f20090e;
        }

        /* renamed from: f */
        public final int m18055f() {
            return C7591h.f20092g;
        }
    }

    private /* synthetic */ C7591h(int i) {
        this.f20094a = i;
    }

    /* renamed from: g */
    public static final /* synthetic */ C7591h m18067g(int i) {
        return new C7591h(i);
    }

    /* renamed from: h */
    private static int m18066h(int i) {
        return i;
    }

    /* renamed from: i */
    public static boolean m18065i(int i, Object obj) {
        return (obj instanceof C7591h) && i == ((C7591h) obj).m18061m();
    }

    /* renamed from: j */
    public static final boolean m18064j(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static int m18063k(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: l */
    public static String m18062l(int i) {
        return m18064j(i, f20088c) ? "Button" : m18064j(i, f20089d) ? "Checkbox" : m18064j(i, f20090e) ? "Switch" : m18064j(i, f20091f) ? "RadioButton" : m18064j(i, f20092g) ? "Tab" : m18064j(i, f20093h) ? "Image" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m18065i(this.f20094a, obj);
    }

    public int hashCode() {
        return m18063k(this.f20094a);
    }

    /* renamed from: m */
    public final /* synthetic */ int m18061m() {
        return this.f20094a;
    }

    public String toString() {
        return m18062l(this.f20094a);
    }
}
