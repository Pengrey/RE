package p359t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t1.i */
/* loaded from: classes.dex */
public final class C10368i {

    /* renamed from: b */
    public static final C10369a f26958b = new C10369a(null);

    /* renamed from: c */
    private static final int f26959c = m8124d(0);

    /* renamed from: d */
    private static final int f26960d = m8124d(1);

    /* renamed from: e */
    private static final int f26961e = m8124d(2);

    /* renamed from: f */
    private static final int f26962f = m8124d(3);

    /* renamed from: a */
    private final int f26963a;

    /* compiled from: FontSynthesis.kt */
    /* renamed from: t1.i$a */
    /* loaded from: classes.dex */
    public static final class C10369a {
        private C10369a() {
        }

        public /* synthetic */ C10369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m8116a() {
            return C10368i.f26960d;
        }

        /* renamed from: b */
        public final int m8115b() {
            return C10368i.f26959c;
        }
    }

    private /* synthetic */ C10368i(int i) {
        this.f26963a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C10368i m8125c(int i) {
        return new C10368i(i);
    }

    /* renamed from: d */
    public static int m8124d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m8123e(int i, Object obj) {
        return (obj instanceof C10368i) && i == ((C10368i) obj).m8117k();
    }

    /* renamed from: f */
    public static final boolean m8122f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m8121g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static final boolean m8120h(int i) {
        return m8122f(i, f26960d) || m8122f(i, f26962f);
    }

    /* renamed from: i */
    public static final boolean m8119i(int i) {
        return m8122f(i, f26960d) || m8122f(i, f26961e);
    }

    /* renamed from: j */
    public static String m8118j(int i) {
        return m8122f(i, f26959c) ? "None" : m8122f(i, f26960d) ? "All" : m8122f(i, f26961e) ? "Weight" : m8122f(i, f26962f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m8123e(this.f26963a, obj);
    }

    public int hashCode() {
        return m8121g(this.f26963a);
    }

    /* renamed from: k */
    public final /* synthetic */ int m8117k() {
        return this.f26963a;
    }

    public String toString() {
        return m8118j(this.f26963a);
    }
}
