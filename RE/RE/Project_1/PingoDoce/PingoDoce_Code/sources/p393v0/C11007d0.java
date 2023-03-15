package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: v0.d0 */
/* loaded from: classes.dex */
public final class C11007d0 {

    /* renamed from: a */
    public static final C11008a f28337a = new C11008a(null);

    /* renamed from: b */
    private static final int f28338b = m6560c(0);

    /* renamed from: c */
    private static final int f28339c = m6560c(1);

    /* renamed from: d */
    private static final int f28340d = m6560c(2);

    /* renamed from: e */
    private static final int f28341e = m6560c(3);

    /* compiled from: FilterQuality.kt */
    /* renamed from: v0.d0$a */
    /* loaded from: classes.dex */
    public static final class C11008a {
        private C11008a() {
        }

        public /* synthetic */ C11008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m6556a() {
            return C11007d0.f28339c;
        }

        /* renamed from: b */
        public final int m6555b() {
            return C11007d0.f28338b;
        }
    }

    /* renamed from: c */
    public static int m6560c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final boolean m6559d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m6558e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m6557f(int i) {
        return m6559d(i, f28338b) ? "None" : m6559d(i, f28339c) ? "Low" : m6559d(i, f28340d) ? "Medium" : m6559d(i, f28341e) ? "High" : "Unknown";
    }
}
