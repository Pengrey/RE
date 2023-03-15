package p374u1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u1.m */
/* loaded from: classes.dex */
public final class C10798m {

    /* renamed from: a */
    public static final C10799a f27919a = new C10799a(null);

    /* renamed from: b */
    private static final int f27920b = m7021i(1);

    /* renamed from: c */
    private static final int f27921c = m7021i(2);

    /* renamed from: d */
    private static final int f27922d = m7021i(3);

    /* renamed from: e */
    private static final int f27923e = m7021i(4);

    /* renamed from: f */
    private static final int f27924f = m7021i(5);

    /* renamed from: g */
    private static final int f27925g = m7021i(6);

    /* renamed from: h */
    private static final int f27926h = m7021i(7);

    /* renamed from: i */
    private static final int f27927i = m7021i(8);

    /* compiled from: KeyboardType.kt */
    /* renamed from: u1.m$a */
    /* loaded from: classes.dex */
    public static final class C10799a {
        private C10799a() {
        }

        public /* synthetic */ C10799a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m7017a() {
            return C10798m.f27921c;
        }

        /* renamed from: b */
        public final int m7016b() {
            return C10798m.f27925g;
        }

        /* renamed from: c */
        public final int m7015c() {
            return C10798m.f27922d;
        }

        /* renamed from: d */
        public final int m7014d() {
            return C10798m.f27927i;
        }

        /* renamed from: e */
        public final int m7013e() {
            return C10798m.f27926h;
        }

        /* renamed from: f */
        public final int m7012f() {
            return C10798m.f27923e;
        }

        /* renamed from: g */
        public final int m7011g() {
            return C10798m.f27920b;
        }

        /* renamed from: h */
        public final int m7010h() {
            return C10798m.f27924f;
        }
    }

    /* renamed from: i */
    public static int m7021i(int i) {
        return i;
    }

    /* renamed from: j */
    public static final boolean m7020j(int i, int i2) {
        return i == i2;
    }

    /* renamed from: k */
    public static int m7019k(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: l */
    public static String m7018l(int i) {
        return m7020j(i, f27920b) ? "Text" : m7020j(i, f27921c) ? "Ascii" : m7020j(i, f27922d) ? "Number" : m7020j(i, f27923e) ? "Phone" : m7020j(i, f27924f) ? "Uri" : m7020j(i, f27925g) ? "Email" : m7020j(i, f27926h) ? "Password" : m7020j(i, f27927i) ? "NumberPassword" : "Invalid";
    }
}
