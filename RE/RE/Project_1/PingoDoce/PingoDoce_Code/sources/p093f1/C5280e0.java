package p093f1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f1.e0 */
/* loaded from: classes.dex */
public final class C5280e0 {

    /* renamed from: a */
    public static final C5281a f14552a = new C5281a(null);

    /* renamed from: b */
    private static final int f14553b = m24807f(0);

    /* renamed from: c */
    private static final int f14554c = m24807f(1);

    /* renamed from: d */
    private static final int f14555d = m24807f(2);

    /* renamed from: e */
    private static final int f14556e = m24807f(3);

    /* renamed from: f */
    private static final int f14557f = m24807f(4);

    /* compiled from: PointerEvent.kt */
    /* renamed from: f1.e0$a */
    /* loaded from: classes.dex */
    public static final class C5281a {
        private C5281a() {
        }

        public /* synthetic */ C5281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m24803a() {
            return C5280e0.f14557f;
        }

        /* renamed from: b */
        public final int m24802b() {
            return C5280e0.f14555d;
        }

        /* renamed from: c */
        public final int m24801c() {
            return C5280e0.f14556e;
        }

        /* renamed from: d */
        public final int m24800d() {
            return C5280e0.f14554c;
        }

        /* renamed from: e */
        public final int m24799e() {
            return C5280e0.f14553b;
        }
    }

    /* renamed from: f */
    private static int m24807f(int i) {
        return i;
    }

    /* renamed from: g */
    public static final boolean m24806g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m24805h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m24804i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
