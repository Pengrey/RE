package p169j1;

import p181jd.Intrinsics;
import p358t0.C10341m;
import p358t0.InterfaceC10342n;

/* renamed from: j1.t */
/* loaded from: classes.dex */
public final class ModifiedFocusOrderNode extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusOrderNode(LayoutNodeWrapper layoutNodeWrapper, InterfaceC10342n interfaceC10342n) {
        super(layoutNodeWrapper, interfaceC10342n);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC10342n, "modifier");
    }

    /* renamed from: C1 */
    public void m21301C1(C10341m c10341m) {
        Intrinsics.isThisObjectNull(c10341m, "focusOrder");
        ((InterfaceC10342n) m21755P1()).m8204y(c10341m);
        super.m21419C1(c10341m);
    }
}
