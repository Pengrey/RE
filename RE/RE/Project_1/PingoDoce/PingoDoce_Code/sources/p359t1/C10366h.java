package p359t1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: t1.h */
/* loaded from: classes.dex */
public final class C10366h {

    /* renamed from: b */
    public static final C10367a f26954b = new C10367a(null);

    /* renamed from: c */
    private static final int f26955c = m8135d(0);

    /* renamed from: d */
    private static final int f26956d = m8135d(1);

    /* renamed from: a */
    private final int f26957a;

    /* compiled from: FontStyle.kt */
    /* renamed from: t1.h$a */
    /* loaded from: classes.dex */
    public static final class C10367a {
        private C10367a() {
        }

        public /* synthetic */ C10367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m8129a() {
            return C10366h.f26956d;
        }

        /* renamed from: b */
        public final int m8128b() {
            return C10366h.f26955c;
        }
    }

    private /* synthetic */ C10366h(int i) {
        this.f26957a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C10366h m8136c(int i) {
        return new C10366h(i);
    }

    /* renamed from: d */
    public static int m8135d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m8134e(int i, Object obj) {
        return (obj instanceof C10366h) && i == ((C10366h) obj).m8130i();
    }

    /* renamed from: f */
    public static final boolean m8133f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m8132g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m8131h(int i) {
        return m8133f(i, f26955c) ? "Normal" : m8133f(i, f26956d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m8134e(this.f26957a, obj);
    }

    public int hashCode() {
        return m8132g(this.f26957a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m8130i() {
        return this.f26957a;
    }

    public String toString() {
        return m8131h(this.f26957a);
    }
}
