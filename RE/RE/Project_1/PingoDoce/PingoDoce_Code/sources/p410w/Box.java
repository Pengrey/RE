package p410w;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.ParentDataModifier;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p479z1.Density;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.d */
/* loaded from: classes.dex */
public final class Box extends AbstractC0820x0 implements ParentDataModifier {

    /* renamed from: x */
    private InterfaceC9560a f29309x;

    /* renamed from: y */
    private boolean f29310y;

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return ParentDataModifier.C5748a.m23192a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23190c(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final InterfaceC9560a m5134b() {
        return this.f29309x;
    }

    /* renamed from: c */
    public final boolean m5133c() {
        return this.f29310y;
    }

    /* renamed from: d */
    public Box m5129x(Density density, Object obj) {
        Intrinsics.isThisObjectNull(density, "<this>");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Box box = obj instanceof Box ? (Box) obj : null;
        if (box == null) {
            return false;
        }
        return Intrinsics.equals(this.f29309x, box.f29309x) && this.f29310y == box.f29310y;
    }

    public int hashCode() {
        return (this.f29309x.hashCode() * 31) + Boolean.hashCode(this.f29310y);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return ParentDataModifier.C5748a.m23191b(this, obj, interfaceC6112p);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f29309x + ", matchParentSize=" + this.f29310y + ')';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return ParentDataModifier.C5748a.m23189d(this, interfaceC9570f);
    }
}
