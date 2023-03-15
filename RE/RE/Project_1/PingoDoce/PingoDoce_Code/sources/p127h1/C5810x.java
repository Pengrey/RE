package p127h1;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p127h1.OnGloballyPositionedModifier;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnGloballyPositionedModifier.kt */
/* renamed from: h1.x */
/* loaded from: classes.dex */
public final class C5810x extends AbstractC0820x0 implements OnGloballyPositionedModifier {

    /* renamed from: x */
    private final InterfaceC6108l f16141x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5810x(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "callback");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f16141x = interfaceC6108l;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return OnGloballyPositionedModifier.C5809a.m22987a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return OnGloballyPositionedModifier.C5809a.m22985c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5810x) {
            return Intrinsics.equals(this.f16141x, ((C5810x) obj).f16141x);
        }
        return false;
    }

    public int hashCode() {
        return this.f16141x.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return OnGloballyPositionedModifier.C5809a.m22986b(this, obj, interfaceC6112p);
    }

    /* renamed from: q */
    public void m22983q(InterfaceC5776j interfaceC5776j) {
        Intrinsics.isThisObjectNull(interfaceC5776j, "coordinates");
        this.f16141x.mo9587d(interfaceC5776j);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return OnGloballyPositionedModifier.C5809a.m22984d(this, interfaceC9570f);
    }
}
