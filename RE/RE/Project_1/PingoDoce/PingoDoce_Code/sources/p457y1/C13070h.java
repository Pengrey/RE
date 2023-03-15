package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y1.h */
/* loaded from: classes.dex */
public final class C13070h {

    /* renamed from: a */
    public static final C13071a f33992a = new C13071a(null);

    /* renamed from: b */
    private static final int f33993b = m1693c(1);

    /* renamed from: c */
    private static final int f33994c = m1693c(2);

    /* renamed from: d */
    private static final int f33995d = m1693c(3);

    /* compiled from: TextOverflow.kt */
    /* renamed from: y1.h$a */
    /* loaded from: classes.dex */
    public static final class C13071a {
        private C13071a() {
        }

        public /* synthetic */ C13071a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m1689a() {
            return C13070h.f33993b;
        }

        /* renamed from: b */
        public final int m1688b() {
            return C13070h.f33994c;
        }
    }

    /* renamed from: c */
    public static int m1693c(int i) {
        return i;
    }

    /* renamed from: d */
    public static final boolean m1692d(int i, int i2) {
        return i == i2;
    }

    /* renamed from: e */
    public static int m1691e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: f */
    public static String m1690f(int i) {
        return m1692d(i, f33993b) ? "Clip" : m1692d(i, f33994c) ? "Ellipsis" : m1692d(i, f33995d) ? "Visible" : "Invalid";
    }
}
