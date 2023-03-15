package p051d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0006g;
import p001a0.CornerBasedShape;
import p181jd.Intrinsics;
import p479z1.C13605g;

/* renamed from: d0.r0 */
/* loaded from: classes.dex */
public final class Shapes {

    /* renamed from: a */
    private final CornerBasedShape f12622a;

    /* renamed from: b */
    private final CornerBasedShape f12623b;

    /* renamed from: c */
    private final CornerBasedShape f12624c;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3) {
        Intrinsics.isThisObjectNull(cornerBasedShape, "small");
        Intrinsics.isThisObjectNull(cornerBasedShape2, "medium");
        Intrinsics.isThisObjectNull(cornerBasedShape3, "large");
        this.f12622a = cornerBasedShape;
        this.f12623b = cornerBasedShape2;
        this.f12624c = cornerBasedShape3;
    }

    /* renamed from: a */
    public final CornerBasedShape m27060a() {
        return this.f12624c;
    }

    /* renamed from: b */
    public final CornerBasedShape m27059b() {
        return this.f12622a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Shapes) {
            Shapes shapes = (Shapes) obj;
            return Intrinsics.equals(this.f12622a, shapes.f12622a) && Intrinsics.equals(this.f12623b, shapes.f12623b) && Intrinsics.equals(this.f12624c, shapes.f12624c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12622a.hashCode() * 31) + this.f12623b.hashCode()) * 31) + this.f12624c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f12622a + ", medium=" + this.f12623b + ", large=" + this.f12624c + ')';
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C0006g.m42190c(C13605g.m875g(4)) : cornerBasedShape, (i & 2) != 0 ? C0006g.m42190c(C13605g.m875g(4)) : cornerBasedShape2, (i & 4) != 0 ? C0006g.m42190c(C13605g.m875g(0)) : cornerBasedShape3);
    }
}
