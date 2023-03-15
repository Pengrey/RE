package p346s0;

import androidx.compose.p018ui.platform.AbstractC0820x0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p346s0.InterfaceC10024e;
import p433x0.InterfaceC12238c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawModifier.kt */
/* renamed from: s0.g */
/* loaded from: classes.dex */
public final class C10029g extends AbstractC0820x0 implements InterfaceC10024e {

    /* renamed from: x */
    private final InterfaceC6108l f26213x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10029g(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(interfaceC6108l2);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDraw");
        Intrinsics.isThisObjectNull(interfaceC6108l2, "inspectorInfo");
        this.f26213x = interfaceC6108l;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        return InterfaceC10024e.C10025a.m9376a(this, interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC10024e.C10025a.m9374c(this, obj, interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10029g) {
            return Intrinsics.equals(this.f26213x, ((C10029g) obj).f26213x);
        }
        return false;
    }

    public int hashCode() {
        return this.f26213x.hashCode();
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        return InterfaceC10024e.C10025a.m9375b(this, obj, interfaceC6112p);
    }

    /* renamed from: p */
    public void m9368p(InterfaceC12238c interfaceC12238c) {
        Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
        this.f26213x.mo9587d(interfaceC12238c);
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return InterfaceC10024e.C10025a.m9373d(this, interfaceC9570f);
    }
}
