package p169j1;

import java.util.LinkedHashSet;
import java.util.Set;
import p127h1.OnGloballyPositionedModifier;
import p181jd.Intrinsics;
import p489zc.MutableCollections;

/* renamed from: j1.a0 */
/* loaded from: classes.dex */
public final class OnGloballyPositionedModifierWrapper extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnGloballyPositionedModifierWrapper(LayoutNodeWrapper layoutNodeWrapper, OnGloballyPositionedModifier onGloballyPositionedModifier) {
        super(layoutNodeWrapper, onGloballyPositionedModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(onGloballyPositionedModifier, "modifier");
    }

    /* renamed from: h1 */
    public Set m21765h1() {
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

    /* renamed from: v1 */
    public void m21764v1() {
        super.m21737v1();
        m21378c1().m21551X().m23659c(this);
    }
}
