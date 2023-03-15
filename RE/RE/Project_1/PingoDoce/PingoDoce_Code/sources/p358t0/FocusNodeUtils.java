package p358t0;

import java.util.List;
import p112g0.MutableVector;
import p169j1.LayoutNode;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;

/* renamed from: t0.l */
/* loaded from: classes.dex */
public final class FocusNodeUtils {
    /* renamed from: a */
    public static final void m8215a(LayoutNode layoutNode, List list, boolean z) {
        Intrinsics.isThisObjectNull(layoutNode, "<this>");
        Intrinsics.isThisObjectNull(list, "focusableChildren");
        ModifiedFocusNode m21398N0 = layoutNode.m21550Y().m21398N0(z);
        if ((m21398N0 == null ? null : Boolean.valueOf(list.add(m21398N0))) == null) {
            List m21575J = layoutNode.m21575J();
            int size = m21575J.size();
            for (int i = 0; i < size; i++) {
                m8215a((LayoutNode) m21575J.get(i), list, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p169j1.ModifiedFocusNode m8214b(p169j1.LayoutNode r5, p112g0.MutableVector r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            p181jd.Intrinsics.isThisObjectNull(r5, r0)
            java.lang.String r0 = "queue"
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            g0.e r5 = r5.m21537f0()
            int r0 = r5.m23649p()
            r1 = 0
            if (r0 <= 0) goto L30
            java.lang.Object[] r5 = r5.m23650o()
            r2 = r1
        L1a:
            r3 = r5[r2]
            j1.k r3 = (p169j1.LayoutNode) r3
            j1.o r4 = r3.m21550Y()
            j1.s r4 = r4.m21398N0(r7)
            if (r4 == 0) goto L29
            return r4
        L29:
            r6.m23659c(r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L1a
        L30:
            boolean r5 = r6.m23646s()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r6.m23642w(r1)
            j1.k r5 = (p169j1.LayoutNode) r5
            j1.s r5 = m8214b(r5, r6, r7)
            if (r5 == 0) goto L30
            return r5
        L43:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p358t0.FocusNodeUtils.m8214b(j1.k, g0.e, boolean):j1.s");
    }

    /* renamed from: c */
    public static /* synthetic */ ModifiedFocusNode m8213c(LayoutNode layoutNode, MutableVector mutableVector, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mutableVector = new MutableVector(new LayoutNode[16], 0);
        }
        return m8214b(layoutNode, mutableVector, z);
    }
}
