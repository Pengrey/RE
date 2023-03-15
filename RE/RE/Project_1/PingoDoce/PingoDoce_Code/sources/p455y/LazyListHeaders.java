package p455y;

import java.util.List;
import p181jd.Intrinsics;
import p489zc.C13777q;
import p489zc.C13780s;

/* renamed from: y.g */
/* loaded from: classes.dex */
public final class LazyListHeaders {
    /* renamed from: a */
    public static final LazyMeasuredItem m1900a(List list, C13044v c13044v, List list2, int i, int i2, int i3) {
        int i4;
        int m195i;
        Intrinsics.isThisObjectNull(list, "composedVisibleItems");
        Intrinsics.isThisObjectNull(c13044v, "itemProvider");
        Intrinsics.isThisObjectNull(list2, "headerIndexes");
        int index = ((LazyMeasuredItem) C13777q.m256L(list)).getIndex();
        int size = list2.size();
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i5 < size) {
            int i8 = i5 + 1;
            if (((Number) list2.get(i5)).intValue() > index) {
                break;
            }
            i6 = ((Number) list2.get(i5)).intValue();
            if (i8 >= 0) {
                m195i = C13780s.m195i(list2);
                if (i8 <= m195i) {
                    i4 = list2.get(i8);
                    i7 = ((Number) i4).intValue();
                    i5 = i8;
                }
            }
            i4 = -1;
            i7 = ((Number) i4).intValue();
            i5 = i8;
        }
        int size2 = list.size();
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        int i12 = -1;
        while (i11 < size2) {
            int i13 = i11 + 1;
            LazyMeasuredItem lazyMeasuredItem = (LazyMeasuredItem) list.get(i11);
            if (lazyMeasuredItem.getIndex() == i6) {
                i9 = lazyMeasuredItem.m1829g();
                i12 = i11;
            } else if (lazyMeasuredItem.getIndex() == i7) {
                i10 = lazyMeasuredItem.m1829g();
            }
            i11 = i13;
        }
        if (i6 == -1) {
            return null;
        }
        C13043u m1800a = c13044v.m1800a(C13015a.m1914a(i6));
        int max = i9 != Integer.MIN_VALUE ? Math.max(-i, i9) : -i;
        if (i10 != Integer.MIN_VALUE) {
            max = Math.min(max, i10 - m1800a.m1803d());
        }
        LazyMeasuredItem m1801f = m1800a.m1801f(max, i2, i3);
        if (i12 != -1) {
            list.set(i12, m1801f);
        } else {
            list.add(0, m1801f);
        }
        return m1801f;
    }
}
