package p051d0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d0.a0 */
/* loaded from: classes.dex */
public final class C4524a0 {

    /* renamed from: b */
    public static final C4525a f12180b = new C4525a(null);

    /* renamed from: c */
    private static final int f12181c = m27301c(0);

    /* renamed from: d */
    private static final int f12182d = m27301c(1);

    /* renamed from: a */
    private final int f12183a;

    /* compiled from: Scaffold.kt */
    /* renamed from: d0.a0$a */
    /* loaded from: classes.dex */
    public static final class C4525a {
        private C4525a() {
        }

        public /* synthetic */ C4525a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m27295a() {
            return C4524a0.f12182d;
        }
    }

    private /* synthetic */ C4524a0(int i) {
        this.f12183a = i;
    }

    /* renamed from: b */
    public static final /* synthetic */ C4524a0 m27302b(int i) {
        return new C4524a0(i);
    }

    /* renamed from: c */
    public static int m27301c(int i) {
        return i;
    }

    /* renamed from: d */
    public static boolean m27300d(int i, Object obj) {
        return (obj instanceof C4524a0) && i == ((C4524a0) obj).m27296h();
    }

    /* renamed from: e */
    public static final boolean m27299e(int i, int i2) {
        return i == i2;
    }

    /* renamed from: f */
    public static int m27298f(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m27297g(int i) {
        return m27299e(i, f12181c) ? "FabPosition.Center" : "FabPosition.End";
    }

    public boolean equals(Object obj) {
        return m27300d(this.f12183a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int m27296h() {
        return this.f12183a;
    }

    public int hashCode() {
        return m27298f(this.f12183a);
    }

    public String toString() {
        return m27297g(this.f12183a);
    }
}
