package p373u0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: u0.h */
/* loaded from: classes.dex */
public final class Rect {

    /* renamed from: e */
    public static final C10777a f27871e = new C10777a(null);

    /* renamed from: f */
    private static final Rect f27872f = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    private final float f27873a;

    /* renamed from: b */
    private final float f27874b;

    /* renamed from: c */
    private final float f27875c;

    /* renamed from: d */
    private final float f27876d;

    /* compiled from: Rect.kt */
    /* renamed from: u0.h$a */
    /* loaded from: classes.dex */
    public static final class C10777a {
        private C10777a() {
        }

        public /* synthetic */ C10777a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Rect m7115a() {
            return Rect.m7130a();
        }
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.f27873a = f;
        this.f27874b = f2;
        this.f27875c = f3;
        this.f27876d = f4;
    }

    /* renamed from: a */
    public static final /* synthetic */ Rect m7130a() {
        return f27872f;
    }

    /* renamed from: b */
    public final boolean m7129b(long j) {
        return C10774f.m7145k(j) >= this.f27873a && C10774f.m7145k(j) < this.f27875c && C10774f.m7144l(j) >= this.f27874b && C10774f.m7144l(j) < this.f27876d;
    }

    /* renamed from: c */
    public final float m7128c() {
        return this.f27876d;
    }

    /* renamed from: d */
    public final long m7127d() {
        return C10776g.m7133a(this.f27873a + (m7120k() / 2.0f), this.f27874b + (m7126e() / 2.0f));
    }

    /* renamed from: e */
    public final float m7126e() {
        return this.f27876d - this.f27874b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return Intrinsics.equals(Float.valueOf(this.f27873a), Float.valueOf(rect.f27873a)) && Intrinsics.equals(Float.valueOf(this.f27874b), Float.valueOf(rect.f27874b)) && Intrinsics.equals(Float.valueOf(this.f27875c), Float.valueOf(rect.f27875c)) && Intrinsics.equals(Float.valueOf(this.f27876d), Float.valueOf(rect.f27876d));
        }
        return false;
    }

    /* renamed from: f */
    public final float m7125f() {
        return this.f27873a;
    }

    /* renamed from: g */
    public final float m7124g() {
        return this.f27875c;
    }

    /* renamed from: h */
    public final long m7123h() {
        return C10783m.m7085a(m7120k(), m7126e());
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f27873a) * 31) + Float.hashCode(this.f27874b)) * 31) + Float.hashCode(this.f27875c)) * 31) + Float.hashCode(this.f27876d);
    }

    /* renamed from: i */
    public final float m7122i() {
        return this.f27874b;
    }

    /* renamed from: j */
    public final long m7121j() {
        return C10776g.m7133a(this.f27873a, this.f27874b);
    }

    /* renamed from: k */
    public final float m7120k() {
        return this.f27875c - this.f27873a;
    }

    /* renamed from: l */
    public final Rect m7119l(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "other");
        return new Rect(Math.max(this.f27873a, rect.f27873a), Math.max(this.f27874b, rect.f27874b), Math.min(this.f27875c, rect.f27875c), Math.min(this.f27876d, rect.f27876d));
    }

    /* renamed from: m */
    public final boolean m7118m(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "other");
        return this.f27875c > rect.f27873a && rect.f27875c > this.f27873a && this.f27876d > rect.f27874b && rect.f27876d > this.f27874b;
    }

    /* renamed from: n */
    public final Rect m7117n(float f, float f2) {
        return new Rect(this.f27873a + f, this.f27874b + f2, this.f27875c + f, this.f27876d + f2);
    }

    /* renamed from: o */
    public final Rect m7116o(long j) {
        return new Rect(this.f27873a + C10774f.m7145k(j), this.f27874b + C10774f.m7144l(j), this.f27875c + C10774f.m7145k(j), this.f27876d + C10774f.m7144l(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + C10772c.m7168a(this.f27873a, 1) + ", " + C10772c.m7168a(this.f27874b, 1) + ", " + C10772c.m7168a(this.f27875c, 1) + ", " + C10772c.m7168a(this.f27876d, 1) + ')';
    }
}
