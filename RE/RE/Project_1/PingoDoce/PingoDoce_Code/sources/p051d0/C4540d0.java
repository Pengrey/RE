package p051d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13605g;
import p479z1.Density;

/* compiled from: Swipeable.kt */
/* renamed from: d0.d0 */
/* loaded from: classes.dex */
public final class C4540d0 implements InterfaceC4579g1 {

    /* renamed from: a */
    private final float f12269a;

    private C4540d0(float f) {
        this.f12269a = f;
    }

    public /* synthetic */ C4540d0(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* renamed from: a */
    public float mo27149a(Density density, float f, float f2) {
        Intrinsics.isThisObjectNull(density, "<this>");
        return f + (density.m899A(this.f12269a) * Math.signum(f2 - f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4540d0) && C13605g.m873i(this.f12269a, ((C4540d0) obj).f12269a);
    }

    public int hashCode() {
        return C13605g.m872j(this.f12269a);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) C13605g.m871k(this.f12269a)) + ')';
    }
}
