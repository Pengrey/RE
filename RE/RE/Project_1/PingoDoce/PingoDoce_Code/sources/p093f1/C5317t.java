package p093f1;

/* renamed from: f1.t */
/* loaded from: classes.dex */
public final class C5317t {

    /* renamed from: a */
    private final long f14660a;

    private /* synthetic */ C5317t(long j) {
        this.f14660a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5317t m24665a(long j) {
        return new C5317t(j);
    }

    /* renamed from: b */
    public static long m24664b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m24663c(long j, Object obj) {
        return (obj instanceof C5317t) && j == ((C5317t) obj).m24659g();
    }

    /* renamed from: d */
    public static final boolean m24662d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static int m24661e(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: f */
    public static String m24660f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m24663c(this.f14660a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m24659g() {
        return this.f14660a;
    }

    public int hashCode() {
        return m24661e(this.f14660a);
    }

    public String toString() {
        return m24660f(this.f14660a);
    }
}
