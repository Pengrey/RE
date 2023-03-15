package p169j1;

import p181jd.Intrinsics;
import p358t0.C10335k;
import p358t0.EnumC10353v;
import p358t0.FocusEventModifier;
import p358t0.FocusModifier;
import p358t0.FocusNodeUtils;
import p358t0.InterfaceC10352u;

/* renamed from: j1.r */
/* loaded from: classes.dex */
public final class ModifiedFocusEventNode extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusEventNode(LayoutNodeWrapper layoutNodeWrapper, FocusEventModifier focusEventModifier) {
        super(layoutNodeWrapper, focusEventModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(focusEventModifier, "modifier");
    }

    /* renamed from: D1 */
    public void m21317D1(InterfaceC10352u interfaceC10352u) {
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
        ((FocusEventModifier) m21755P1()).m8256j0(interfaceC10352u);
        if (((Boolean) m21344z1(C10335k.m8221c())).booleanValue()) {
            super.m21417D1(interfaceC10352u);
        }
    }

    /* renamed from: y1 */
    public void m21316y1() {
        FocusModifier focusModifier;
        super.m21346y1();
        ModifiedFocusNode m21398N0 = m21742k1().m21398N0(false);
        EnumC10353v enumC10353v = null;
        if (m21398N0 == null) {
            m21398N0 = FocusNodeUtils.m8213c(m21378c1(), null, false, 1, null);
        }
        FocusEventModifier focusEventModifier = (FocusEventModifier) m21755P1();
        if (m21398N0 != null && (focusModifier = (FocusModifier) m21398N0.m21755P1()) != null) {
            enumC10353v = focusModifier.m8232c();
        }
        if (enumC10353v == null) {
            enumC10353v = EnumC10353v.Inactive;
        }
        focusEventModifier.m8256j0(enumC10353v);
    }
}
