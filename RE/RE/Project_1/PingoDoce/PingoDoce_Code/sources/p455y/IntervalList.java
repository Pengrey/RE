package p455y;

import java.util.List;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: y.d */
/* loaded from: classes.dex */
public final class IntervalList {
    /* renamed from: a */
    private static final int m1909a(List list, int i) {
        int m195i;
        m195i = C13780s.m195i(list);
        int i2 = 0;
        while (i2 < m195i) {
            int i3 = ((m195i - i2) / 2) + i2;
            int m1910c = ((C13016b) list.get(i3)).m1910c();
            if (m1910c == i) {
                return i3;
            }
            if (m1910c < i) {
                i2 = i3 + 1;
                if (i < ((C13016b) list.get(i2)).m1910c()) {
                    return i3;
                }
            } else {
                m195i = i3 - 1;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final C13016b m1908b(InterfaceC13017c interfaceC13017c, int i) {
        Intrinsics.isThisObjectNull(interfaceC13017c, "<this>");
        return (C13016b) interfaceC13017c.mo1783a().get(m1907c(interfaceC13017c, i));
    }

    /* renamed from: c */
    public static final int m1907c(InterfaceC13017c interfaceC13017c, int i) {
        Intrinsics.isThisObjectNull(interfaceC13017c, "<this>");
        if (i >= 0 && i < interfaceC13017c.mo1782b()) {
            return m1909a(interfaceC13017c.mo1783a(), i);
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + interfaceC13017c.mo1782b());
    }
}
