package p373u0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: u0.j */
/* loaded from: classes.dex */
public final class C10779j {

    /* renamed from: a */
    private final float f27877a;

    /* renamed from: b */
    private final float f27878b;

    /* renamed from: c */
    private final float f27879c;

    /* renamed from: d */
    private final float f27880d;

    /* renamed from: e */
    private final long f27881e;

    /* renamed from: f */
    private final long f27882f;

    /* renamed from: g */
    private final long f27883g;

    /* renamed from: h */
    private final long f27884h;

    /* compiled from: RoundRect.kt */
    /* renamed from: u0.j$a */
    /* loaded from: classes.dex */
    public static final class C10780a {
        private C10780a() {
        }

        public /* synthetic */ C10780a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10780a(null);
        RoundRect.m7101c(0.0f, 0.0f, 0.0f, 0.0f, C10769a.f27860a.m7171a());
    }

    private C10779j(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f27877a = f;
        this.f27878b = f2;
        this.f27879c = f3;
        this.f27880d = f4;
        this.f27881e = j;
        this.f27882f = j2;
        this.f27883g = j3;
        this.f27884h = j4;
    }

    public /* synthetic */ C10779j(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    /* renamed from: a */
    public final float m7113a() {
        return this.f27880d;
    }

    /* renamed from: b */
    public final long m7112b() {
        return this.f27884h;
    }

    /* renamed from: c */
    public final long m7111c() {
        return this.f27883g;
    }

    /* renamed from: d */
    public final float m7110d() {
        return this.f27880d - this.f27878b;
    }

    /* renamed from: e */
    public final float m7109e() {
        return this.f27877a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10779j) {
            C10779j c10779j = (C10779j) obj;
            return Intrinsics.equals(Float.valueOf(this.f27877a), Float.valueOf(c10779j.f27877a)) && Intrinsics.equals(Float.valueOf(this.f27878b), Float.valueOf(c10779j.f27878b)) && Intrinsics.equals(Float.valueOf(this.f27879c), Float.valueOf(c10779j.f27879c)) && Intrinsics.equals(Float.valueOf(this.f27880d), Float.valueOf(c10779j.f27880d)) && C10769a.m7176c(this.f27881e, c10779j.f27881e) && C10769a.m7176c(this.f27882f, c10779j.f27882f) && C10769a.m7176c(this.f27883g, c10779j.f27883g) && C10769a.m7176c(this.f27884h, c10779j.f27884h);
        }
        return false;
    }

    /* renamed from: f */
    public final float m7108f() {
        return this.f27879c;
    }

    /* renamed from: g */
    public final float m7107g() {
        return this.f27878b;
    }

    /* renamed from: h */
    public final long m7106h() {
        return this.f27881e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f27877a) * 31) + Float.hashCode(this.f27878b)) * 31) + Float.hashCode(this.f27879c)) * 31) + Float.hashCode(this.f27880d)) * 31) + C10769a.m7173f(this.f27881e)) * 31) + C10769a.m7173f(this.f27882f)) * 31) + C10769a.m7173f(this.f27883g)) * 31) + C10769a.m7173f(this.f27884h);
    }

    /* renamed from: i */
    public final long m7105i() {
        return this.f27882f;
    }

    /* renamed from: j */
    public final float m7104j() {
        return this.f27879c - this.f27877a;
    }

    public String toString() {
        long m7106h = m7106h();
        long m7105i = m7105i();
        long m7111c = m7111c();
        long m7112b = m7112b();
        String str = C10772c.m7168a(this.f27877a, 1) + ", " + C10772c.m7168a(this.f27878b, 1) + ", " + C10772c.m7168a(this.f27879c, 1) + ", " + C10772c.m7168a(this.f27880d, 1);
        if (C10769a.m7176c(m7106h, m7105i) && C10769a.m7176c(m7105i, m7111c) && C10769a.m7176c(m7111c, m7112b)) {
            if (C10769a.m7175d(m7106h) == C10769a.m7174e(m7106h)) {
                return "RoundRect(rect=" + str + ", radius=" + C10772c.m7168a(C10769a.m7175d(m7106h), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + C10772c.m7168a(C10769a.m7175d(m7106h), 1) + ", y=" + C10772c.m7168a(C10769a.m7174e(m7106h), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) C10769a.m7172g(m7106h)) + ", topRight=" + ((Object) C10769a.m7172g(m7105i)) + ", bottomRight=" + ((Object) C10769a.m7172g(m7111c)) + ", bottomLeft=" + ((Object) C10769a.m7172g(m7112b)) + ')';
    }
}
