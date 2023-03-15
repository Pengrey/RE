package p169j1;

import java.util.List;
import p181jd.Intrinsics;

/* renamed from: j1.p */
/* loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {

    /* renamed from: a */
    private final LayoutNode f17249a;

    /* renamed from: b */
    private final DepthSortedSet f17250b;

    /* renamed from: c */
    private final List f17251c;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSet depthSortedSet, List list) {
        Intrinsics.isThisObjectNull(layoutNode, "root");
        Intrinsics.isThisObjectNull(depthSortedSet, "relayoutNodes");
        Intrinsics.isThisObjectNull(list, "postponedMeasureRequests");
        this.f17249a = layoutNode;
        this.f17250b = depthSortedSet;
        this.f17251c = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r0 != null && r0.mo23015f()) != false) goto L13;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m21337b(p169j1.LayoutNode r7) {
        /*
            r6 = this;
            j1.k r0 = r7.m21547a0()
            boolean r1 = r7.mo23015f()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            int r1 = r7.m21545b0()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L6f
            if (r0 != 0) goto L19
        L17:
            r1 = r2
            goto L20
        L19:
            boolean r1 = r0.mo23015f()
            if (r1 != r3) goto L17
            r1 = r3
        L20:
            if (r1 == 0) goto L6f
        L22:
            j1.k$e r1 = r7.m21561Q()
            j1.k$e r4 = p169j1.LayoutNode.EnumC6272e.NeedsRemeasure
            if (r1 != r4) goto L33
            java.util.List r1 = r6.f17251c
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L33
            return r3
        L33:
            if (r0 != 0) goto L37
            r0 = 0
            goto L3b
        L37:
            j1.k$e r0 = r0.m21561Q()
        L3b:
            j1.k$e r1 = r7.m21561Q()
            if (r1 != r4) goto L51
            j1.c r1 = r6.f17250b
            boolean r7 = r1.m21724b(r7)
            if (r7 != 0) goto L4f
            if (r0 == r4) goto L4f
            j1.k$e r7 = p169j1.LayoutNode.EnumC6272e.Measuring
            if (r0 != r7) goto L50
        L4f:
            r2 = r3
        L50:
            return r2
        L51:
            j1.k$e r1 = r7.m21561Q()
            j1.k$e r5 = p169j1.LayoutNode.EnumC6272e.NeedsRelayout
            if (r1 != r5) goto L6f
            j1.c r1 = r6.f17250b
            boolean r7 = r1.m21724b(r7)
            if (r7 != 0) goto L6d
            if (r0 == r4) goto L6d
            if (r0 == r5) goto L6d
            j1.k$e r7 = p169j1.LayoutNode.EnumC6272e.Measuring
            if (r0 == r7) goto L6d
            j1.k$e r7 = p169j1.LayoutNode.EnumC6272e.LayingOut
            if (r0 != r7) goto L6e
        L6d:
            r2 = r3
        L6e:
            return r2
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p169j1.LayoutTreeConsistencyChecker.m21337b(j1.k):boolean");
    }

    /* renamed from: c */
    private final boolean m21336c(LayoutNode layoutNode) {
        if (m21337b(layoutNode)) {
            List m21575J = layoutNode.m21575J();
            int size = m21575J.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!m21336c((LayoutNode) m21575J.get(i))) {
                    return false;
                }
                i = i2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final String m21335d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        Intrinsics.checkIfNull(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkIfNull(sb2, "append('\\n')");
        m21334e(this, sb2, this.f17249a, 0);
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "stringBuilder.toString()");
        return sb3;
    }

    /* renamed from: e */
    private static final void m21334e(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb2, LayoutNode layoutNode, int i) {
        String m21333f = layoutTreeConsistencyChecker.m21333f(layoutNode);
        if (m21333f.length() > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2++;
                sb2.append("..");
            }
            sb2.append(m21333f);
            Intrinsics.checkIfNull(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkIfNull(sb2, "append('\\n')");
            i++;
        }
        List m21575J = layoutNode.m21575J();
        int size = m21575J.size();
        for (int i3 = 0; i3 < size; i3++) {
            m21334e(layoutTreeConsistencyChecker, sb2, (LayoutNode) m21575J.get(i3), i);
        }
    }

    /* renamed from: f */
    private final String m21333f(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(layoutNode);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(layoutNode.m21561Q());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!layoutNode.mo23015f()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + layoutNode.m21554U() + ']');
        if (!m21337b(layoutNode)) {
            sb2.append("[INCONSISTENT]");
        }
        String sb4 = sb2.toString();
        Intrinsics.checkIfNull(sb4, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb4;
    }

    /* renamed from: a */
    public final void m21338a() {
        if (!m21336c(this.f17249a)) {
            System.out.println((Object) m21335d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
