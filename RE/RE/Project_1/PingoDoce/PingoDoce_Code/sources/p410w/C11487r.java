package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.ParentDataModifier;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p479z1.Density;

/* compiled from: RowColumnImpl.kt */
/* renamed from: w.r */
/* loaded from: classes.dex */
public final class C11487r extends AbstractC0820x0 implements ParentDataModifier {

    /* renamed from: x */
    private final float f29411x;

    /* renamed from: y */
    private final boolean f29412y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11487r(float f, boolean z, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f29411x = f;
        this.f29412y = z;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ParentDataModifier.C5748a.m23192a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23190c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final boolean m5011b() {
        return this.f29412y;
    }

    /* renamed from: c */
    public final float m5010c() {
        return this.f29411x;
    }

    /* renamed from: d */
    public C11412b0 m5006x(Density density, Object obj) {
        Intrinsics.isThisObjectNull(density, "<this>");
        C11412b0 c11412b0 = obj instanceof C11412b0 ? (C11412b0) obj : null;
        if (c11412b0 == null) {
            c11412b0 = new C11412b0(0.0f, false, null, 7, null);
        }
        c11412b0.m5179f(m5010c());
        c11412b0.m5180e(m5011b());
        return c11412b0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C11487r c11487r = obj instanceof C11487r ? (C11487r) obj : null;
        if (c11487r == null) {
            return false;
        }
        return (((this.f29411x > c11487r.f29411x ? 1 : (this.f29411x == c11487r.f29411x ? 0 : -1)) == 0) || this.f29412y == c11487r.f29412y) ? false : true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f29411x) * 31) + Boolean.hashCode(this.f29412y);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23191b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f29411x + ", fill=" + this.f29412y + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ParentDataModifier.C5748a.m23189d(this, interfaceC9570f);
    }
}
