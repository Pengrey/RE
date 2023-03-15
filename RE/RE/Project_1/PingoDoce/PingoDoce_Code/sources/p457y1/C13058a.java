package p457y1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: y1.a */
/* loaded from: classes.dex */
public final class C13058a {

    /* renamed from: b */
    public static final C13059a f33961b = new C13059a(null);

    /* renamed from: c */
    private static final float f33962c;

    /* renamed from: a */
    private final float f33963a;

    /* compiled from: BaselineShift.kt */
    /* renamed from: y1.a$a */
    /* loaded from: classes.dex */
    public static final class C13059a {
        private C13059a() {
        }

        public /* synthetic */ C13059a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final float m1748a() {
            return C13058a.m1756a();
        }
    }

    static {
        m1754c(0.5f);
        m1754c(-0.5f);
        f33962c = m1754c(0.0f);
    }

    private /* synthetic */ C13058a(float f) {
        this.f33963a = f;
    }

    /* renamed from: a */
    public static final /* synthetic */ float m1756a() {
        return f33962c;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13058a m1755b(float f) {
        return new C13058a(f);
    }

    /* renamed from: c */
    public static float m1754c(float f) {
        return f;
    }

    /* renamed from: d */
    public static boolean m1753d(float f, Object obj) {
        if (obj instanceof C13058a) {
            return Intrinsics.equals(Float.valueOf(f), Float.valueOf(((C13058a) obj).m1749h()));
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m1752e(float f, float f2) {
        return Intrinsics.equals(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: f */
    public static int m1751f(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: g */
    public static String m1750g(float f) {
        return "BaselineShift(multiplier=" + f + ')';
    }

    public boolean equals(Object obj) {
        return m1753d(this.f33963a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ float m1749h() {
        return this.f33963a;
    }

    public int hashCode() {
        return m1751f(this.f33963a);
    }

    public String toString() {
        return m1750g(this.f33963a);
    }
}
