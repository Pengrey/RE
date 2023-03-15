package p071e0;

import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p357t.InterfaceC10308l;
import p392v.C10988p;
import p392v.InterfaceC10984j;
import p433x0.DrawScope;
import td.InterfaceC10524i0;

/* compiled from: Ripple.kt */
/* renamed from: e0.m */
/* loaded from: classes.dex */
public abstract class AbstractC4928m implements InterfaceC10308l {

    /* renamed from: w */
    private final C4934q f13701w;

    public AbstractC4928m(boolean z, InterfaceC5242r1 interfaceC5242r1) {
        Intrinsics.isThisObjectNull(interfaceC5242r1, "rippleAlpha");
        this.f13701w = new C4934q(z, interfaceC5242r1);
    }

    /* renamed from: d */
    public abstract void m26262d(C10988p c10988p, InterfaceC10524i0 interfaceC10524i0);

    /* renamed from: f */
    public final void m26261f(DrawScope drawScope, float f, long j) {
        Intrinsics.isThisObjectNull(drawScope, "$receiver");
        this.f13701w.m26243b(drawScope, f, j);
    }

    /* renamed from: g */
    public abstract void m26260g(C10988p c10988p);

    /* renamed from: h */
    public final void m26259h(InterfaceC10984j interfaceC10984j, InterfaceC10524i0 interfaceC10524i0) {
        Intrinsics.isThisObjectNull(interfaceC10984j, "interaction");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        this.f13701w.m26242c(interfaceC10984j, interfaceC10524i0);
    }
}
