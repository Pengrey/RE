package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.ParentDataModifier;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p479z1.Density;

/* compiled from: RowColumnImpl.kt */
/* renamed from: w.p */
/* loaded from: classes.dex */
public final class C11485p extends AbstractC0820x0 implements ParentDataModifier {

    /* renamed from: x */
    private final InterfaceC9560a.InterfaceC9562b f29410x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11485p(InterfaceC9560a.InterfaceC9562b interfaceC9562b, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(interfaceC9562b, "horizontal");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f29410x = interfaceC9562b;
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
    public final InterfaceC9560a.InterfaceC9562b m5018b() {
        return this.f29410x;
    }

    /* renamed from: c */
    public C11412b0 m5014x(Density density, Object obj) {
        Intrinsics.isThisObjectNull(density, "<this>");
        C11412b0 c11412b0 = obj instanceof C11412b0 ? (C11412b0) obj : null;
        if (c11412b0 == null) {
            c11412b0 = new C11412b0(0.0f, false, null, 7, null);
        }
        c11412b0.m5181d(AbstractC11475m.f29401a.m5032a(m5018b()));
        return c11412b0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C11485p c11485p = obj instanceof C11485p ? (C11485p) obj : null;
        if (c11485p == null) {
            return false;
        }
        return Intrinsics.equals(this.f29410x, c11485p.f29410x);
    }

    public int hashCode() {
        return this.f29410x.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23191b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f29410x + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ParentDataModifier.C5748a.m23189d(this, interfaceC9570f);
    }
}
