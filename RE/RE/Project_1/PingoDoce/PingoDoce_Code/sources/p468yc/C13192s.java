package p468yc;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yc.s */
/* loaded from: classes2.dex */
public final class C13192s implements Comparable<C13192s> {

    /* renamed from: w */
    private final long f34154w;

    /* compiled from: ULong.kt */
    /* renamed from: yc.s$a */
    /* loaded from: classes2.dex */
    public static final class C13193a {
        private C13193a() {
        }

        public /* synthetic */ C13193a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C13193a(null);
    }

    private /* synthetic */ C13192s(long j) {
        this.f34154w = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13192s m1446b(long j) {
        return new C13192s(j);
    }

    /* renamed from: c */
    public static long m1445c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m1444d(long j, Object obj) {
        return (obj instanceof C13192s) && j == ((C13192s) obj).m1441g();
    }

    /* renamed from: e */
    public static int m1443e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: f */
    public static String m1442f(long j) {
        return C13196w.m1437c(j);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C13192s c13192s) {
        return C13196w.m1439a(m1441g(), c13192s.m1441g());
    }

    public boolean equals(Object obj) {
        return m1444d(this.f34154w, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m1441g() {
        return this.f34154w;
    }

    public int hashCode() {
        return m1443e(this.f34154w);
    }

    public String toString() {
        return m1442f(this.f34154w);
    }
}
