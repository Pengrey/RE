package p479z1;

import p181jd.Intrinsics;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z1.e */
/* loaded from: classes.dex */
public final class C13603e implements Density {

    /* renamed from: w */
    private final float f34595w;

    /* renamed from: x */
    private final float f34596x;

    public C13603e(float f, float f2) {
        this.f34595w = f;
        this.f34596x = f2;
    }

    /* renamed from: A */
    public float m888A(float f) {
        return Density.C13602a.m890d(this, f);
    }

    /* renamed from: O */
    public int m887O(float f) {
        return Density.C13602a.m893a(this, f);
    }

    /* renamed from: U */
    public long m886U(long j) {
        return Density.C13602a.m889e(this, j);
    }

    /* renamed from: Y */
    public float m885Y(long j) {
        return Density.C13602a.m891c(this, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13603e) {
            C13603e c13603e = (C13603e) obj;
            return Intrinsics.equals(Float.valueOf(getDensity()), Float.valueOf(c13603e.getDensity())) && Intrinsics.equals(Float.valueOf(m883r()), Float.valueOf(c13603e.m883r()));
        }
        return false;
    }

    public float getDensity() {
        return this.f34595w;
    }

    public int hashCode() {
        return (Float.hashCode(getDensity()) * 31) + Float.hashCode(m883r());
    }

    /* renamed from: i0 */
    public float m884i0(int i) {
        return Density.C13602a.m892b(this, i);
    }

    /* renamed from: r */
    public float m883r() {
        return this.f34596x;
    }

    public String toString() {
        return "DensityImpl(density=" + getDensity() + ", fontScale=" + m883r() + ')';
    }
}
