package p127h1;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.ParentDataModifier;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h1.l */
/* loaded from: classes.dex */
public final class LayoutId extends AbstractC0820x0 implements ParentDataModifier, InterfaceC5799n {

    /* renamed from: x */
    private final Object f16130x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutId(Object obj, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        Intrinsics.isThisObjectNull(obj, "layoutId");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        this.f16130x = obj;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ParentDataModifier.C5748a.m23192a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23190c(this, obj, interfaceC6112p);
    }

    /* renamed from: a */
    public Object mo23017a() {
        return this.f16130x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutId layoutId = obj instanceof LayoutId ? (LayoutId) obj : null;
        if (layoutId == null) {
            return false;
        }
        return Intrinsics.equals(mo23017a(), layoutId.mo23017a());
    }

    public int hashCode() {
        return mo23017a().hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23191b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "LayoutId(id=" + mo23017a() + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ParentDataModifier.C5748a.m23189d(this, interfaceC9570f);
    }

    /* renamed from: x */
    public Object m23028x(Density density, Object obj) {
        Intrinsics.isThisObjectNull(density, "<this>");
        return this;
    }
}
