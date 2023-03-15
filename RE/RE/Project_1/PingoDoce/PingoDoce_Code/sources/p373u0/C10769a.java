package p373u0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C10769a {

    /* renamed from: a */
    public static final C10770a f27860a = new C10770a(null);

    /* renamed from: b */
    private static final long f27861b = C10771b.m7169b(0.0f, 0.0f, 2, null);

    /* compiled from: CornerRadius.kt */
    /* renamed from: u0.a$a */
    /* loaded from: classes.dex */
    public static final class C10770a {
        private C10770a() {
        }

        public /* synthetic */ C10770a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m7171a() {
            return C10769a.f27861b;
        }
    }

    /* renamed from: b */
    public static long m7177b(long j) {
        return j;
    }

    /* renamed from: c */
    public static final boolean m7176c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m7175d(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: e */
    public static final float m7174e(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: f */
    public static int m7173f(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: g */
    public static String m7172g(long j) {
        if (m7175d(j) == m7174e(j)) {
            return "CornerRadius.circular(" + C10772c.m7168a(m7175d(j), 1) + ')';
        }
        return "CornerRadius.elliptical(" + C10772c.m7168a(m7175d(j), 1) + ", " + C10772c.m7168a(m7174e(j), 1) + ')';
    }
}
