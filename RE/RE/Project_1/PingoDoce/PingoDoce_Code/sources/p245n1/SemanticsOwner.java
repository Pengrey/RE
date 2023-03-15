package p245n1;

import p169j1.LayoutNode;
import p181jd.Intrinsics;

/* renamed from: n1.r */
/* loaded from: classes.dex */
public final class SemanticsOwner {

    /* renamed from: a */
    private final LayoutNode f20137a;

    public SemanticsOwner(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "rootNode");
        this.f20137a = layoutNode;
    }

    /* renamed from: a */
    public final SemanticsNode m17971a() {
        SemanticsWrapper m17974j = C7607q.m17974j(this.f20137a);
        Intrinsics.ifNullDoSomething(m17974j);
        return new SemanticsNode(m17974j, false);
    }
}
