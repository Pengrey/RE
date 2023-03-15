package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.C6432f;

/* renamed from: v0.g1 */
/* loaded from: classes.dex */
public final class C11022g1 {

    /* renamed from: b */
    public static final C11023a f28371b = new C11023a(null);

    /* renamed from: c */
    private static final long f28372c = C11027h1.m6476a(0.5f, 0.5f);

    /* renamed from: a */
    private final long f28373a;

    /* compiled from: TransformOrigin.kt */
    /* renamed from: v0.g1$a */
    /* loaded from: classes.dex */
    public static final class C11023a {
        private C11023a() {
        }

        public /* synthetic */ C11023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m6480a() {
            return C11022g1.f28372c;
        }
    }

    private /* synthetic */ C11022g1(long j) {
        this.f28373a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C11022g1 m6489b(long j) {
        return new C11022g1(j);
    }

    /* renamed from: c */
    public static long m6488c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m6487d(long j, Object obj) {
        return (obj instanceof C11022g1) && j == ((C11022g1) obj).m6481j();
    }

    /* renamed from: e */
    public static final boolean m6486e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final float m6485f(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: g */
    public static final float m6484g(long j) {
        C6432f c6432f = C6432f.f17524a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: h */
    public static int m6483h(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: i */
    public static String m6482i(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m6487d(this.f28373a, obj);
    }

    public int hashCode() {
        return m6483h(this.f28373a);
    }

    /* renamed from: j */
    public final /* synthetic */ long m6481j() {
        return this.f28373a;
    }

    public String toString() {
        return m6482i(this.f28373a);
    }
}
