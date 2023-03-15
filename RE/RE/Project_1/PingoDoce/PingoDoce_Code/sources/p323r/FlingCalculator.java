package p323r;

import p181jd.Intrinsics;
import p479z1.Density;

/* renamed from: r.b */
/* loaded from: classes.dex */
public final class FlingCalculator {

    /* renamed from: a */
    private final float f25709a;

    /* renamed from: b */
    private final Density f25710b;

    /* renamed from: c */
    private final float f25711c;

    /* compiled from: FlingCalculator.kt */
    /* renamed from: r.b$a */
    /* loaded from: classes.dex */
    public static final class C9777a {

        /* renamed from: a */
        private final float f25712a;

        /* renamed from: b */
        private final float f25713b;

        /* renamed from: c */
        private final long f25714c;

        public C9777a(float f, float f2, long j) {
            this.f25712a = f;
            this.f25713b = f2;
            this.f25714c = j;
        }

        /* renamed from: a */
        public final float m9983a(long j) {
            long j2 = this.f25714c;
            return this.f25713b * Math.signum(this.f25712a) * C9775a.f25704a.m9991b(j2 > 0 ? ((float) j) / ((float) j2) : 1.0f).m9990a();
        }

        /* renamed from: b */
        public final float m9982b(long j) {
            long j2 = this.f25714c;
            return (((C9775a.f25704a.m9991b(j2 > 0 ? ((float) j) / ((float) j2) : 1.0f).m9989b() * Math.signum(this.f25712a)) * this.f25713b) / ((float) this.f25714c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9777a) {
                C9777a c9777a = (C9777a) obj;
                return Intrinsics.equals(Float.valueOf(this.f25712a), Float.valueOf(c9777a.f25712a)) && Intrinsics.equals(Float.valueOf(this.f25713b), Float.valueOf(c9777a.f25713b)) && this.f25714c == c9777a.f25714c;
            }
            return false;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f25712a) * 31) + Float.hashCode(this.f25713b)) * 31) + Long.hashCode(this.f25714c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f25712a + ", distance=" + this.f25713b + ", duration=" + this.f25714c + ')';
        }
    }

    public FlingCalculator(float f, Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        this.f25709a = f;
        this.f25710b = density;
        this.f25711c = m9988a(density);
    }

    /* renamed from: a */
    private final float m9988a(Density density) {
        float m9979c;
        m9979c = C9778c.m9979c(0.84f, density.getDensity());
        return m9979c;
    }

    /* renamed from: e */
    private final double m9984e(float f) {
        return C9775a.f25704a.m9992a(f, this.f25709a * this.f25711c);
    }

    /* renamed from: b */
    public final float m9987b(float f) {
        float f2;
        float f3;
        double m9984e = m9984e(f);
        f2 = C9778c.f25715a;
        double d = this.f25709a * this.f25711c;
        f3 = C9778c.f25715a;
        return (float) (d * Math.exp((f3 / (f2 - 1.0d)) * m9984e));
    }

    /* renamed from: c */
    public final long m9986c(float f) {
        float f2;
        double m9984e = m9984e(f);
        f2 = C9778c.f25715a;
        return (long) (Math.exp(m9984e / (f2 - 1.0d)) * 1000.0d);
    }

    /* renamed from: d */
    public final C9777a m9985d(float f) {
        float f2;
        float f3;
        double m9984e = m9984e(f);
        f2 = C9778c.f25715a;
        double d = f2 - 1.0d;
        f3 = C9778c.f25715a;
        return new C9777a(f, (float) (this.f25709a * this.f25711c * Math.exp((f3 / d) * m9984e)), (long) (Math.exp(m9984e / d) * 1000.0d));
    }
}
