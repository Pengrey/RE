package p286p1;

import p297pd._Ranges;

/* renamed from: p1.x */
/* loaded from: classes.dex */
public final class C8395x {
    /* renamed from: a */
    public static final long m15530a(int i) {
        return m15529b(i, i);
    }

    /* renamed from: b */
    public static final long m15529b(int i, int i2) {
        return C8393w.m15542c(m15527d(i, i2));
    }

    /* renamed from: c */
    public static final long m15528c(long j, int i, int i2) {
        int m14996m;
        int m14996m2;
        m14996m = _Ranges.m14996m(C8393w.m15535j(j), i, i2);
        m14996m2 = _Ranges.m14996m(C8393w.m15538g(j), i, i2);
        return (m14996m == C8393w.m15535j(j) && m14996m2 == C8393w.m15538g(j)) ? j : m15529b(m14996m, m14996m2);
    }

    /* renamed from: d */
    private static final long m15527d(int i, int i2) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
        }
        if (i2 >= 0) {
            return (i2 & 4294967295L) | (i << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
    }
}
