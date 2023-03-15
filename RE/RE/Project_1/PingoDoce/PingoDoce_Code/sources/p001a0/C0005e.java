package p001a0;

import p181jd.Intrinsics;
import p373u0.C10781l;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CornerSize.kt */
/* renamed from: a0.e */
/* loaded from: classes.dex */
public final class C0005e implements InterfaceC0002b {

    /* renamed from: a */
    private final float f13a;

    public C0005e(float f) {
        this.f13a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    /* renamed from: a */
    public float mo42199a(long j, Density density) {
        Intrinsics.isThisObjectNull(density, "density");
        return C10781l.m7092h(j) * (this.f13a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0005e) && Intrinsics.equals(Float.valueOf(this.f13a), Float.valueOf(((C0005e) obj).f13a));
    }

    public int hashCode() {
        return Float.hashCode(this.f13a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f13a + "%)";
    }
}
