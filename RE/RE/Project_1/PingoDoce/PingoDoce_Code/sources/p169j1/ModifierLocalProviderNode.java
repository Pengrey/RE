package p169j1;

import p149i1.AbstractC5988a;
import p149i1.ModifierLocalProvider;
import p181jd.Intrinsics;

/* renamed from: j1.z */
/* loaded from: classes.dex */
public final class ModifierLocalProviderNode<T> extends DelegatingLayoutNodeWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalProviderNode(LayoutNodeWrapper layoutNodeWrapper, ModifierLocalProvider modifierLocalProvider) {
        super(layoutNodeWrapper, modifierLocalProvider);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(modifierLocalProvider, "modifier");
    }

    /* renamed from: z1 */
    public Object m21279z1(AbstractC5988a abstractC5988a) {
        Intrinsics.isThisObjectNull(abstractC5988a, "modifierLocal");
        if (Intrinsics.equals(((ModifierLocalProvider) m21755P1()).getKey(), abstractC5988a)) {
            return ((ModifierLocalProvider) m21755P1()).mo41263getValue();
        }
        return super.m21344z1(abstractC5988a);
    }
}
