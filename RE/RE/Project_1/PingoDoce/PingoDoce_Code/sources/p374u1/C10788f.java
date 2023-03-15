package p374u1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u1.f */
/* loaded from: classes.dex */
public final class C10788f {

    /* renamed from: b */
    public static final C10789a f27895b = new C10789a(null);

    /* renamed from: c */
    private static final int f27896c = m7072j(1);

    /* renamed from: d */
    private static final int f27897d = m7072j(0);

    /* renamed from: e */
    private static final int f27898e = m7072j(2);

    /* renamed from: f */
    private static final int f27899f = m7072j(3);

    /* renamed from: g */
    private static final int f27900g = m7072j(4);

    /* renamed from: h */
    private static final int f27901h = m7072j(5);

    /* renamed from: i */
    private static final int f27902i = m7072j(6);

    /* renamed from: j */
    private static final int f27903j = m7072j(7);

    /* renamed from: a */
    private final int f27904a;

    /* compiled from: ImeAction.kt */
    /* renamed from: u1.f$a */
    /* loaded from: classes.dex */
    public static final class C10789a {
        private C10789a() {
        }

        public /* synthetic */ C10789a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m7066a() {
            return C10788f.f27896c;
        }

        /* renamed from: b */
        public final int m7065b() {
            return C10788f.f27903j;
        }

        /* renamed from: c */
        public final int m7064c() {
            return C10788f.f27898e;
        }

        /* renamed from: d */
        public final int m7063d() {
            return C10788f.f27902i;
        }

        /* renamed from: e */
        public final int m7062e() {
            return C10788f.f27897d;
        }

        /* renamed from: f */
        public final int m7061f() {
            return C10788f.f27901h;
        }

        /* renamed from: g */
        public final int m7060g() {
            return C10788f.f27899f;
        }

        /* renamed from: h */
        public final int m7059h() {
            return C10788f.f27900g;
        }
    }

    private /* synthetic */ C10788f(int i) {
        this.f27904a = i;
    }

    /* renamed from: i */
    public static final /* synthetic */ C10788f m7073i(int i) {
        return new C10788f(i);
    }

    /* renamed from: j */
    public static int m7072j(int i) {
        return i;
    }

    /* renamed from: k */
    public static boolean m7071k(int i, Object obj) {
        return (obj instanceof C10788f) && i == ((C10788f) obj).m7067o();
    }

    /* renamed from: l */
    public static final boolean m7070l(int i, int i2) {
        return i == i2;
    }

    /* renamed from: m */
    public static int m7069m(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: n */
    public static String m7068n(int i) {
        return m7070l(i, f27897d) ? "None" : m7070l(i, f27896c) ? "Default" : m7070l(i, f27898e) ? "Go" : m7070l(i, f27899f) ? "Search" : m7070l(i, f27900g) ? "Send" : m7070l(i, f27901h) ? "Previous" : m7070l(i, f27902i) ? "Next" : m7070l(i, f27903j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7071k(this.f27904a, obj);
    }

    public int hashCode() {
        return m7069m(this.f27904a);
    }

    /* renamed from: o */
    public final /* synthetic */ int m7067o() {
        return this.f27904a;
    }

    public String toString() {
        return m7068n(this.f27904a);
    }
}
