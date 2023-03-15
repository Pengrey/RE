package p468yc;

import p181jd.Intrinsics;
import sd.CharJVM;

/* renamed from: yc.w */
/* loaded from: classes2.dex */
public final class C13196w {
    /* renamed from: a */
    public static final int m1439a(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static final double m1438b(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    /* renamed from: c */
    public static final String m1437c(long j) {
        return m1436d(j, 10);
    }

    /* renamed from: d */
    public static final String m1436d(long j, int i) {
        int m9044a;
        int m9044a2;
        int m9044a3;
        if (j >= 0) {
            m9044a3 = CharJVM.m9044a(i);
            String l = Long.toString(j, m9044a3);
            Intrinsics.checkIfNull(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb2 = new StringBuilder();
        m9044a = CharJVM.m9044a(i);
        String l2 = Long.toString(j3, m9044a);
        Intrinsics.checkIfNull(l2, "toString(this, checkRadix(radix))");
        sb2.append(l2);
        m9044a2 = CharJVM.m9044a(i);
        String l3 = Long.toString(j4, m9044a2);
        Intrinsics.checkIfNull(l3, "toString(this, checkRadix(radix))");
        sb2.append(l3);
        return sb2.toString();
    }
}
