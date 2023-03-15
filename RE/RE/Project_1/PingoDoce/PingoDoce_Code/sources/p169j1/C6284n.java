package p169j1;

import p181jd.Intrinsics;

/* compiled from: LayoutNode.kt */
/* renamed from: j1.n */
/* loaded from: classes.dex */
public final class C6284n {
    /* renamed from: a */
    public static final InterfaceC6253f0 m21433a(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        InterfaceC6253f0 m21549Z = layoutNode.m21549Z();
        if (m21549Z != null) {
            return m21549Z;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
