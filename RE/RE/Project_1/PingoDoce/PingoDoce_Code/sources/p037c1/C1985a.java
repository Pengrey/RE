package p037c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C1985a {

    /* renamed from: b */
    public static final C1986a f5807b = new C1986a(null);

    /* renamed from: c */
    private static final int f5808c = m34981d(1);

    /* renamed from: d */
    private static final int f5809d = m34981d(2);

    /* renamed from: a */
    private final int f5810a;

    /* compiled from: InputModeManager.kt */
    /* renamed from: c1.a$a */
    /* loaded from: classes.dex */
    public static final class C1986a {
        private C1986a() {
        }

        public /* synthetic */ C1986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m34975a() {
            return C1985a.f5809d;
        }

        /* renamed from: b */
        public final int m34974b() {
            return C1985a.f5808c;
        }
    }

    private /* synthetic */ C1985a(int i) {
        this.f5810a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ C1985a m34982c(int i) {
        return new C1985a(i);
    }

    /* renamed from: d */
    public static int m34981d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m34980e(int i, Object obj) {
        return (obj instanceof C1985a) && i == ((C1985a) obj).m34976i();
    }

    /* renamed from: f */
    public static final boolean m34979f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m34978g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m34977h(int i) {
        return m34979f(i, f5808c) ? "Touch" : m34979f(i, f5809d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m34980e(this.f5810a, obj);
    }

    public int hashCode() {
        return m34978g(this.f5810a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m34976i() {
        return this.f5810a;
    }

    public String toString() {
        return m34977h(this.f5810a);
    }
}
