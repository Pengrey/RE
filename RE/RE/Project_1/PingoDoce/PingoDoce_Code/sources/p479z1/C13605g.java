package p479z1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: z1.g */
/* loaded from: classes.dex */
public final class C13605g implements Comparable {

    /* renamed from: x */
    public static final C13606a f34597x = new C13606a(null);

    /* renamed from: y */
    private static final float f34598y = m875g(0.0f);

    /* renamed from: z */
    private static final float f34599z;

    /* renamed from: w */
    private final float f34600w;

    /* compiled from: Dp.kt */
    /* renamed from: z1.g$a */
    /* loaded from: classes.dex */
    public static final class C13606a {
        private C13606a() {
        }

        public /* synthetic */ C13606a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m869a() {
            return C13605g.m880b();
        }

        /* renamed from: b */
        public final float m868b() {
            return C13605g.m879c();
        }
    }

    static {
        m875g(Float.POSITIVE_INFINITY);
        f34599z = m875g(Float.NaN);
    }

    private /* synthetic */ C13605g(float f) {
        this.f34600w = f;
    }

    /* renamed from: b */
    public static final /* synthetic */ float m880b() {
        return f34598y;
    }

    /* renamed from: c */
    public static final /* synthetic */ float m879c() {
        return f34599z;
    }

    /* renamed from: d */
    public static final /* synthetic */ C13605g m878d(float f) {
        return new C13605g(f);
    }

    /* renamed from: f */
    public static int m876f(float f, float f2) {
        return Float.compare(f, f2);
    }

    /* renamed from: g */
    public static float m875g(float f) {
        return f;
    }

    /* renamed from: h */
    public static boolean m874h(float f, Object obj) {
        if (obj instanceof C13605g) {
            return Intrinsics.equals(Float.valueOf(f), Float.valueOf(((C13605g) obj).m870l()));
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m873i(float f, float f2) {
        return Intrinsics.equals(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: j */
    public static int m872j(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: k */
    public static String m871k(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m877e(((C13605g) obj).m870l());
    }

    /* renamed from: e */
    public int m877e(float f) {
        return m876f(this.f34600w, f);
    }

    public boolean equals(Object obj) {
        return m874h(this.f34600w, obj);
    }

    public int hashCode() {
        return m872j(this.f34600w);
    }

    /* renamed from: l */
    public final /* synthetic */ float m870l() {
        return this.f34600w;
    }

    public String toString() {
        return m871k(this.f34600w);
    }
}
