package p271ob;

import com.google.zxing.C4400e;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import java.util.Map;
import p122gc.C5634b;
import p239mb.C7155b;
import p335rb.C9839e;
import p335rb.C9843i;
import p335rb.C9844j;
import p335rb.C9845k;
import p335rb.EnumC9846l;

/* renamed from: ob.b */
/* loaded from: classes2.dex */
public final class C8059b implements InterfaceC4413q {
    /* renamed from: b */
    private static C7155b m17023b(C5634b c5634b, int i, int i2) {
        C7155b c7155b;
        int m23515e = c5634b.m23515e();
        int m23516d = c5634b.m23516d();
        int max = Math.max(i, m23515e);
        int max2 = Math.max(i2, m23516d);
        int min = Math.min(max / m23515e, max2 / m23516d);
        int i3 = (max - (m23515e * min)) / 2;
        int i4 = (max2 - (m23516d * min)) / 2;
        if (i2 >= m23516d && i >= m23515e) {
            c7155b = new C7155b(i, i2);
        } else {
            c7155b = new C7155b(m23515e, m23516d);
            i3 = 0;
            i4 = 0;
        }
        c7155b.m19062b();
        int i5 = 0;
        while (i5 < m23516d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < m23515e) {
                if (c5634b.m23518b(i7, i5) == 1) {
                    c7155b.m19050o(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return c7155b;
    }

    /* renamed from: c */
    private static C7155b m17022c(C9839e c9839e, C9845k c9845k, int i, int i2) {
        int m9838h = c9845k.m9838h();
        int m9839g = c9845k.m9839g();
        C5634b c5634b = new C5634b(c9845k.m9836j(), c9845k.m9837i());
        int i3 = 0;
        for (int i4 = 0; i4 < m9839g; i4++) {
            if (i4 % c9845k.f25799e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < c9845k.m9836j(); i6++) {
                    c5634b.m23513g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < m9838h; i8++) {
                if (i8 % c9845k.f25798d == 0) {
                    c5634b.m23513g(i7, i3, true);
                    i7++;
                }
                c5634b.m23513g(i7, i3, c9839e.m9892e(i8, i4));
                i7++;
                int i9 = c9845k.f25798d;
                if (i8 % i9 == i9 - 1) {
                    c5634b.m23513g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = c9845k.f25799e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < c9845k.m9836j(); i12++) {
                    c5634b.m23513g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m17023b(c5634b, i, i2);
    }

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) {
        C4400e c4400e;
        if (!str.isEmpty()) {
            if (enumC4392a == EnumC4392a.DATA_MATRIX) {
                if (i >= 0 && i2 >= 0) {
                    EnumC9846l enumC9846l = EnumC9846l.FORCE_NONE;
                    C4400e c4400e2 = null;
                    if (map != null) {
                        EnumC9846l enumC9846l2 = (EnumC9846l) map.get(EnumC4401f.DATA_MATRIX_SHAPE);
                        if (enumC9846l2 != null) {
                            enumC9846l = enumC9846l2;
                        }
                        C4400e c4400e3 = (C4400e) map.get(EnumC4401f.MIN_SIZE);
                        if (c4400e3 == null) {
                            c4400e3 = null;
                        }
                        c4400e = (C4400e) map.get(EnumC4401f.MAX_SIZE);
                        if (c4400e == null) {
                            c4400e = null;
                        }
                        c4400e2 = c4400e3;
                    } else {
                        c4400e = null;
                    }
                    String m9859b = C9844j.m9859b(str, enumC9846l, c4400e2, c4400e);
                    C9845k m9834l = C9845k.m9834l(m9859b.length(), enumC9846l, c4400e2, c4400e, true);
                    C9839e c9839e = new C9839e(C9843i.m9861c(m9859b, m9834l), m9834l.m9838h(), m9834l.m9839g());
                    c9839e.m9889h();
                    return m17022c(c9839e, m9834l, i, i2);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC4392a)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
