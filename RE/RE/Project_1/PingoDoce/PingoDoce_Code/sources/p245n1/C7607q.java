package p245n1;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import p112g0.MutableVector;
import p169j1.LayoutNode;
import p169j1.LayoutNodeWrapper;
import p181jd.Intrinsics;

/* compiled from: SemanticsNode.kt */
/* renamed from: n1.q */
/* loaded from: classes.dex */
public final class C7607q {
    /* renamed from: a */
    public static final /* synthetic */ int m17983a(SemanticsNode semanticsNode) {
        return m17979e(semanticsNode);
    }

    /* renamed from: b */
    public static final /* synthetic */ LayoutNode m17982b(LayoutNode layoutNode, InterfaceC6108l interfaceC6108l) {
        return m17978f(layoutNode, interfaceC6108l);
    }

    /* renamed from: c */
    public static final /* synthetic */ C7591h m17981c(SemanticsNode semanticsNode) {
        return m17973k(semanticsNode);
    }

    /* renamed from: d */
    public static final /* synthetic */ int m17980d(SemanticsNode semanticsNode) {
        return m17972l(semanticsNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m17979e(SemanticsNode semanticsNode) {
        return semanticsNode.m18004i() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final LayoutNode m17978f(LayoutNode layoutNode, InterfaceC6108l interfaceC6108l) {
        for (LayoutNode m21547a0 = layoutNode.m21547a0(); m21547a0 != null; m21547a0 = m21547a0.m21547a0()) {
            if (((Boolean) interfaceC6108l.mo9587d(m21547a0)).booleanValue()) {
                return m21547a0;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static final List m17977g(LayoutNode layoutNode, List list) {
        MutableVector m21539e0 = layoutNode.m21539e0();
        int m23649p = m21539e0.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = m21539e0.m23650o();
            do {
                LayoutNode layoutNode2 = (LayoutNode) m23650o[i];
                SemanticsWrapper m17974j = m17974j(layoutNode2);
                if (m17974j != null) {
                    list.add(m17974j);
                } else {
                    m17977g(layoutNode2, list);
                }
                i++;
            } while (i < m23649p);
            return list;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ List m17976h(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m17977g(layoutNode, list);
    }

    /* renamed from: i */
    public static final SemanticsWrapper m17975i(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        for (LayoutNodeWrapper m21550Y = layoutNode.m21550Y(); m21550Y != null; m21550Y = m21550Y.m21369k1()) {
            if (m21550Y instanceof SemanticsWrapper) {
                SemanticsWrapper semanticsWrapper = (SemanticsWrapper) m21550Y;
                if (((SemanticsModifier) semanticsWrapper.m21755P1()).m18024c0().m18029u()) {
                    return semanticsWrapper;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public static final SemanticsWrapper m17974j(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        for (LayoutNodeWrapper m21550Y = layoutNode.m21550Y(); m21550Y != null; m21550Y = m21550Y.m21369k1()) {
            if (m21550Y instanceof SemanticsWrapper) {
                return (SemanticsWrapper) m21550Y;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final C7591h m17973k(SemanticsNode semanticsNode) {
        return (C7591h) C7595l.m18025a(semanticsNode.m17993t(), C7608s.f20138a.m17954q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final int m17972l(SemanticsNode semanticsNode) {
        return semanticsNode.m18004i() + 1000000000;
    }
}
