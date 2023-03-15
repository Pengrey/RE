package p179jb;

import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4398d;
import p239mb.C7154a;
import p239mb.C7155b;

/* renamed from: jb.c */
/* loaded from: classes2.dex */
public final class C6414c {

    /* renamed from: a */
    private static final int[] f17483a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m21008a(C7154a c7154a, int i, int i2) {
        int[] iArr = new int[i2];
        int m19072l = c7154a.m19072l() / i;
        for (int i3 = 0; i3 < m19072l; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= c7154a.m19076g((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m21007b(C7155b c7155b, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    c7155b.m19051n(i5, i4);
                    c7155b.m19051n(i5, i6);
                    c7155b.m19051n(i4, i5);
                    c7155b.m19051n(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        c7155b.m19051n(i7, i7);
        int i8 = i7 + 1;
        c7155b.m19051n(i8, i7);
        c7155b.m19051n(i7, i8);
        int i9 = i + i2;
        c7155b.m19051n(i9, i7);
        c7155b.m19051n(i9, i8);
        c7155b.m19051n(i9, i9 - 1);
    }

    /* renamed from: c */
    private static void m21006c(C7155b c7155b, boolean z, int i, C7154a c7154a) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (c7154a.m19076g(i3)) {
                    c7155b.m19051n(i4, i2 - 5);
                }
                if (c7154a.m19076g(i3 + 7)) {
                    c7155b.m19051n(i2 + 5, i4);
                }
                if (c7154a.m19076g(20 - i3)) {
                    c7155b.m19051n(i4, i2 + 5);
                }
                if (c7154a.m19076g(27 - i3)) {
                    c7155b.m19051n(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (c7154a.m19076g(i3)) {
                c7155b.m19051n(i5, i2 - 7);
            }
            if (c7154a.m19076g(i3 + 10)) {
                c7155b.m19051n(i2 + 7, i5);
            }
            if (c7154a.m19076g(29 - i3)) {
                c7155b.m19051n(i5, i2 + 7);
            }
            if (c7154a.m19076g(39 - i3)) {
                c7155b.m19051n(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static C6412a m21005d(byte[] bArr, int i, int i2) {
        C7154a c7154a;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        C7154a m20999a = new C6415d(bArr).m20999a();
        int m19072l = ((m20999a.m19072l() * i) / 100) + 11;
        int m19072l2 = m20999a.m19072l() + m19072l;
        int i8 = 0;
        int i9 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (i4 <= (z ? 4 : 32)) {
                i5 = m21000i(i4, z);
                i3 = f17483a[i4];
                int i10 = i5 - (i5 % i3);
                c7154a = m21001h(m20999a, i3);
                if (c7154a.m19072l() + m19072l <= i10) {
                    if (z && c7154a.m19072l() > (i3 << 6)) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                } else {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            C7154a c7154a2 = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 <= 32) {
                boolean z2 = i11 <= 3 ? i9 : i8;
                int i13 = z2 ? i11 + 1 : i11;
                int m21000i = m21000i(i13, z2);
                if (m19072l2 <= m21000i) {
                    if (c7154a2 == null || i12 != f17483a[i13]) {
                        int i14 = f17483a[i13];
                        i12 = i14;
                        c7154a2 = m21001h(m20999a, i14);
                    }
                    int i15 = m21000i - (m21000i % i12);
                    if ((!z2 || c7154a2.m19072l() <= (i12 << 6)) && c7154a2.m19072l() + m19072l <= i15) {
                        c7154a = c7154a2;
                        i3 = i12;
                        z = z2;
                        i4 = i13;
                        i5 = m21000i;
                        i8 = i8;
                    }
                }
                i11++;
                i9 = i9;
                i8 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C7154a m21004e = m21004e(c7154a, i5, i3);
        int m19072l3 = c7154a.m19072l() / i3;
        C7154a m21003f = m21003f(z, i4, m19072l3);
        int i16 = (z ? 11 : 14) + (i4 << 2);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z) {
            for (int i18 = i8; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i6 = i16;
        } else {
            int i19 = i16 / 2;
            i6 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i6 / 2;
            for (int i21 = i8; i21 < i19; i21++) {
                iArr[(i19 - i21) - i9] = (i20 - i7) - 1;
                iArr[i19 + i21] = (i21 / 15) + i21 + i20 + i9;
            }
        }
        C7155b c7155b = new C7155b(i6);
        int i22 = i8;
        int i23 = i22;
        while (i22 < i4) {
            int i24 = ((i4 - i22) << i17) + (z ? 9 : 12);
            int i25 = i8;
            while (i25 < i24) {
                int i26 = i25 << 1;
                while (i8 < i17) {
                    if (m21004e.m19076g(i23 + i26 + i8)) {
                        int i27 = i22 << 1;
                        c7155b.m19051n(iArr[i27 + i8], iArr[i27 + i25]);
                    }
                    if (m21004e.m19076g((i24 << 1) + i23 + i26 + i8)) {
                        int i28 = i22 << 1;
                        c7155b.m19051n(iArr[i28 + i25], iArr[((i16 - 1) - i28) - i8]);
                    }
                    if (m21004e.m19076g((i24 << 2) + i23 + i26 + i8)) {
                        int i29 = (i16 - 1) - (i22 << 1);
                        c7155b.m19051n(iArr[i29 - i8], iArr[i29 - i25]);
                    }
                    if (m21004e.m19076g((i24 * 6) + i23 + i26 + i8)) {
                        int i30 = i22 << 1;
                        c7155b.m19051n(iArr[((i16 - 1) - i30) - i25], iArr[i30 + i8]);
                    }
                    i8++;
                    i17 = 2;
                }
                i25++;
                i8 = 0;
                i17 = 2;
            }
            i23 += i24 << 3;
            i22++;
            i8 = 0;
            i17 = 2;
        }
        m21006c(c7155b, z, i6, m21003f);
        if (z) {
            m21007b(c7155b, i6 / 2, 5);
        } else {
            int i31 = i6 / 2;
            m21007b(c7155b, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i33 < (i16 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i6; i34 += 2) {
                    int i35 = i31 - i32;
                    c7155b.m19051n(i35, i34);
                    int i36 = i31 + i32;
                    c7155b.m19051n(i36, i34);
                    c7155b.m19051n(i34, i35);
                    c7155b.m19051n(i34, i36);
                }
                i33 += 15;
                i32 += 16;
            }
        }
        C6412a c6412a = new C6412a();
        c6412a.m21012c(z);
        c6412a.m21009f(i6);
        c6412a.m21011d(i4);
        c6412a.m21013b(m19072l3);
        c6412a.m21010e(c7155b);
        return c6412a;
    }

    /* renamed from: e */
    private static C7154a m21004e(C7154a c7154a, int i, int i2) {
        C4398d c4398d = new C4398d(m21002g(i2));
        int i3 = i / i2;
        int[] m21008a = m21008a(c7154a, i2, i3);
        c4398d.m27665b(m21008a, i3 - (c7154a.m19072l() / i2));
        C7154a c7154a2 = new C7154a();
        c7154a2.m19080c(0, i % i2);
        for (int i4 : m21008a) {
            c7154a2.m19080c(i4, i2);
        }
        return c7154a2;
    }

    /* renamed from: f */
    static C7154a m21003f(boolean z, int i, int i2) {
        C7154a c7154a = new C7154a();
        if (z) {
            c7154a.m19080c(i - 1, 2);
            c7154a.m19080c(i2 - 1, 6);
            return m21004e(c7154a, 28, 4);
        }
        c7154a.m19080c(i - 1, 5);
        c7154a.m19080c(i2 - 1, 11);
        return m21004e(c7154a, 40, 4);
    }

    /* renamed from: g */
    private static C4395a m21002g(int i) {
        if (i != 4) {
            if (i != 6) {
                if (i != 8) {
                    if (i != 10) {
                        if (i == 12) {
                            return C4395a.f11894h;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
                    }
                    return C4395a.f11895i;
                }
                return C4395a.f11900n;
            }
            return C4395a.f11896j;
        }
        return C4395a.f11897k;
    }

    /* renamed from: h */
    static C7154a m21001h(C7154a c7154a, int i) {
        C7154a c7154a2 = new C7154a();
        int m19072l = c7154a.m19072l();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < m19072l) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= m19072l || c7154a.m19076g(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                c7154a2.m19080c(i7, i);
            } else if (i7 == 0) {
                c7154a2.m19080c(i4 | 1, i);
            } else {
                c7154a2.m19080c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return c7154a2;
    }

    /* renamed from: i */
    private static int m21000i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
