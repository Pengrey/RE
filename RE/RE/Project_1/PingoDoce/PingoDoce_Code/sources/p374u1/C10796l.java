package p374u1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: u1.l */
/* loaded from: classes.dex */
public final class C10796l {

    /* renamed from: a */
    public static final C10797a f27914a = new C10797a(null);

    /* renamed from: b */
    private static final int f27915b = m7037e(0);

    /* renamed from: c */
    private static final int f27916c = m7037e(1);

    /* renamed from: d */
    private static final int f27917d = m7037e(2);

    /* renamed from: e */
    private static final int f27918e = m7037e(3);

    /* compiled from: KeyboardCapitalization.kt */
    /* renamed from: u1.l$a */
    /* loaded from: classes.dex */
    public static final class C10797a {
        private C10797a() {
        }

        public /* synthetic */ C10797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m7033a() {
            return C10796l.f27916c;
        }

        /* renamed from: b */
        public final int m7032b() {
            return C10796l.f27915b;
        }

        /* renamed from: c */
        public final int m7031c() {
            return C10796l.f27918e;
        }

        /* renamed from: d */
        public final int m7030d() {
            return C10796l.f27917d;
        }
    }

    /* renamed from: e */
    public static int m7037e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m7036f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m7035g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m7034h(int i) {
        return m7036f(i, f27915b) ? "None" : m7036f(i, f27916c) ? "Characters" : m7036f(i, f27917d) ? "Words" : m7036f(i, f27918e) ? "Sentences" : "Invalid";
    }
}
