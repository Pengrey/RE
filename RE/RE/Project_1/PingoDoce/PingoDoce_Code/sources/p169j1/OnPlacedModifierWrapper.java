package p169j1;

import java.util.LinkedHashSet;
import java.util.Set;
import p127h1.InterfaceC5813z;
import p181jd.Intrinsics;
import p489zc.MutableCollections;

/* renamed from: j1.b0 */
/* loaded from: classes.dex */
public final class OnPlacedModifierWrapper extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnPlacedModifierWrapper(LayoutNodeWrapper layoutNodeWrapper, InterfaceC5813z interfaceC5813z) {
        super(layoutNodeWrapper, interfaceC5813z);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC5813z, "modifier");
    }

    /* renamed from: A1 */
    public void m21727A1() {
        ((InterfaceC5813z) m21755P1()).m22980I(this);
    }

    /* renamed from: h1 */
    public Set m21726h1() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m21378c1();
        for (LayoutNodeWrapper m21742k1 = m21742k1(); m21742k1 != null; m21742k1 = m21742k1.m21369k1()) {
            MutableCollections.m181u(linkedHashSet, m21742k1.m21373h1());
            if (Intrinsics.equals(m21742k1, m21378c1().m21563P())) {
                break;
            }
        }
        return linkedHashSet;
    }
}
