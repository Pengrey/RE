package p113g1;

import java.util.List;
import p181jd.Intrinsics;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public final class VelocityTracker {

    /* renamed from: a */
    private final List f15805a;

    /* renamed from: b */
    private final float f15806b;

    public VelocityTracker(List list, float f) {
        Intrinsics.isThisObjectNull(list, "coefficients");
        this.f15805a = list;
        this.f15806b = f;
    }

    /* renamed from: a */
    public final List m23629a() {
        return this.f15805a;
    }

    /* renamed from: b */
    public final float m23628b() {
        return this.f15806b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VelocityTracker) {
            VelocityTracker velocityTracker = (VelocityTracker) obj;
            return Intrinsics.equals(this.f15805a, velocityTracker.f15805a) && Intrinsics.equals(Float.valueOf(this.f15806b), Float.valueOf(velocityTracker.f15806b));
        }
        return false;
    }

    public int hashCode() {
        return (this.f15805a.hashCode() * 31) + Float.hashCode(this.f15806b);
    }

    public String toString() {
        return "PolynomialFit(coefficients=" + this.f15805a + ", confidence=" + this.f15806b + ')';
    }
}
