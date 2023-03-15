package p411w0;

import p181jd.Intrinsics;

/* renamed from: w0.m */
/* loaded from: classes.dex */
public final class C11533m {

    /* renamed from: a */
    private final float f29536a;

    /* renamed from: b */
    private final float f29537b;

    public C11533m(float f, float f2) {
        this.f29536a = f;
        this.f29537b = f2;
    }

    /* renamed from: a */
    public final float m4807a() {
        return this.f29536a;
    }

    /* renamed from: b */
    public final float m4806b() {
        return this.f29537b;
    }

    /* renamed from: c */
    public final float[] m4805c() {
        float f = this.f29536a;
        float f2 = this.f29537b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11533m) {
            C11533m c11533m = (C11533m) obj;
            return Intrinsics.equals(Float.valueOf(this.f29536a), Float.valueOf(c11533m.f29536a)) && Intrinsics.equals(Float.valueOf(this.f29537b), Float.valueOf(c11533m.f29537b));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f29536a) * 31) + Float.hashCode(this.f29537b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f29536a + ", y=" + this.f29537b + ')';
    }
}
