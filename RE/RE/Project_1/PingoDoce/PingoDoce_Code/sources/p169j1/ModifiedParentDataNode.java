package p169j1;

import p127h1.ParentDataModifier;
import p181jd.Intrinsics;

/* renamed from: j1.x */
/* loaded from: classes.dex */
public final class ModifiedParentDataNode extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedParentDataNode(LayoutNodeWrapper layoutNodeWrapper, ParentDataModifier parentDataModifier) {
        super(layoutNodeWrapper, parentDataModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(parentDataModifier, "parentDataModifier");
    }

    /* renamed from: x */
    public Object mo23120x() {
        return ((ParentDataModifier) m21755P1()).m23193x(m21378c1().m21555T(), m21742k1().mo23120x());
    }
}
