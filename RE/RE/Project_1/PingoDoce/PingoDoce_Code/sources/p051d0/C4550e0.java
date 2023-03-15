package p051d0;

import p003a2.C0010a;
import p181jd.Intrinsics;
import p479z1.Density;

/* compiled from: Swipeable.kt */
/* renamed from: d0.e0 */
/* loaded from: classes.dex */
public final class C4550e0 implements InterfaceC4579g1 {

    /* renamed from: a */
    private final float f12306a;

    public C4550e0(float f) {
        this.f12306a = f;
    }

    /* renamed from: a */
    public float mo27149a(Density density, float f, float f2) {
        Intrinsics.isThisObjectNull(density, "<this>");
        return C0010a.m42133a(f, f2, this.f12306a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4550e0) && Intrinsics.equals(Float.valueOf(this.f12306a), Float.valueOf(((C4550e0) obj).f12306a));
    }

    public int hashCode() {
        return Float.hashCode(this.f12306a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f12306a + ')';
    }
}
