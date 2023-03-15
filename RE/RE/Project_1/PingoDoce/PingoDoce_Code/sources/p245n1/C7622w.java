package p245n1;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import p169j1.LayoutNode;
import p169j1.LayoutNodeWrapper;
import p181jd.Intrinsics;
import p245n1.SemanticsSort;
import p489zc.MutableCollectionsJVM;
import p489zc._Collections;

/* compiled from: SemanticsSort.kt */
/* renamed from: n1.w */
/* loaded from: classes.dex */
public final class C7622w {
    /* renamed from: a */
    public static final LayoutNode m17909a(LayoutNode layoutNode, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        if (((Boolean) interfaceC6108l.mo9587d(layoutNode)).booleanValue()) {
            return layoutNode;
        }
        List m21575J = layoutNode.m21575J();
        int i = 0;
        int size = m21575J.size();
        while (i < size) {
            int i2 = i + 1;
            LayoutNode m17909a = m17909a((LayoutNode) m21575J.get(i), interfaceC6108l);
            if (m17909a != null) {
                return m17909a;
            }
            i = i2;
        }
        return null;
    }

    /* renamed from: b */
    public static final List m17908b(LayoutNode layoutNode, List list) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        Intrinsics.isThisObjectNull(list, "list");
        if (layoutNode.m21515q0()) {
            ArrayList arrayList = new ArrayList();
            List m21575J = layoutNode.m21575J();
            int size = m21575J.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                LayoutNode layoutNode2 = (LayoutNode) m21575J.get(i2);
                if (layoutNode2.m21515q0()) {
                    arrayList.add(new SemanticsSort(layoutNode, layoutNode2));
                }
                i2 = i3;
            }
            List m17906d = m17906d(arrayList);
            ArrayList arrayList2 = new ArrayList(m17906d.size());
            int size2 = m17906d.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList2.add(((SemanticsSort) m17906d.get(i4)).m18082d());
            }
            int size3 = arrayList2.size();
            while (i < size3) {
                int i5 = i + 1;
                LayoutNode layoutNode3 = (LayoutNode) arrayList2.get(i);
                SemanticsWrapper m17974j = C7607q.m17974j(layoutNode3);
                if (m17974j != null) {
                    list.add(m17974j);
                } else {
                    m17908b(layoutNode3, list);
                }
                i = i5;
            }
            return list;
        }
        return list;
    }

    /* renamed from: c */
    public static /* synthetic */ List m17907c(LayoutNode layoutNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return m17908b(layoutNode, list);
    }

    /* renamed from: d */
    private static final List m17906d(List list) {
        List m453p0;
        List m453p02;
        try {
            SemanticsSort.f20074A.m18081a(SemanticsSort.EnumC7587b.Stripe);
            m453p02 = _Collections.m453p0(list);
            MutableCollectionsJVM.m185s(m453p02);
            return m453p02;
        } catch (IllegalArgumentException unused) {
            SemanticsSort.f20074A.m18081a(SemanticsSort.EnumC7587b.Location);
            m453p0 = _Collections.m453p0(list);
            MutableCollectionsJVM.m185s(m453p0);
            return m453p0;
        }
    }

    /* renamed from: e */
    public static final LayoutNodeWrapper m17905e(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        SemanticsWrapper m17975i = C7607q.m17975i(layoutNode);
        if (m17975i == null) {
            SemanticsWrapper m17974j = C7607q.m17974j(layoutNode);
            return m17974j == null ? layoutNode.m21563P() : m17974j;
        }
        return m17975i;
    }
}
