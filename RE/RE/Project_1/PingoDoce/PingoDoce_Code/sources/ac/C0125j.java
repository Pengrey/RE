package ac;

import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p032bc.C1877a;
import p239mb.C7155b;
import p239mb.C7158e;
import p254nb.C7693a;
import p488zb.C13744a;

/* renamed from: ac.j */
/* loaded from: classes2.dex */
public final class C0125j {

    /* renamed from: a */
    private static final C1877a f296a = new C1877a();

    /* renamed from: a */
    private static C0116c m41820a(C0123h c0123h) throws NotFoundException {
        int[] m41829j;
        if (c0123h == null || (m41829j = c0123h.m41829j()) == null) {
            return null;
        }
        int m41805p = m41805p(m41829j);
        int i = 0;
        int i2 = 0;
        for (int i3 : m41829j) {
            i2 += m41805p - i3;
            if (i3 > 0) {
                break;
            }
        }
        C0117d[] m41835d = c0123h.m41835d();
        for (int i4 = 0; i2 > 0 && m41835d[i4] == null; i4++) {
            i2--;
        }
        for (int length = m41829j.length - 1; length >= 0; length--) {
            i += m41805p - m41829j[length];
            if (m41829j[length] > 0) {
                break;
            }
        }
        for (int length2 = m41835d.length - 1; i > 0 && m41835d[length2] == null; length2--) {
            i--;
        }
        return c0123h.m41838a().m41882a(i2, i, c0123h.m41828k());
    }

    /* renamed from: b */
    private static void m41819b(C0121f c0121f, C0115b[][] c0115bArr) throws NotFoundException {
        C0115b c0115b = c0115bArr[0][1];
        int[] m41884a = c0115b.m41884a();
        int m41846j = (c0121f.m41846j() * c0121f.m41844l()) - m41803r(c0121f.m41845k());
        if (m41884a.length != 0) {
            if (m41884a[0] != m41846j) {
                c0115b.m41883b(m41846j);
            }
        } else if (m41846j > 0 && m41846j <= 928) {
            c0115b.m41883b(m41846j);
        } else {
            throw NotFoundException.m27700a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m41818c(p239mb.C7155b r5, int r6, int r7, boolean r8, int r9, int r10) {
        /*
            if (r8 == 0) goto L4
            r0 = -1
            goto L5
        L4:
            r0 = 1
        L5:
            r1 = 0
            r2 = r9
        L7:
            r3 = 2
            if (r1 >= r3) goto L28
        La:
            if (r8 == 0) goto Lf
            if (r2 < r6) goto L22
            goto L11
        Lf:
            if (r2 >= r7) goto L22
        L11:
            boolean r4 = r5.m19059e(r2, r10)
            if (r8 != r4) goto L22
            int r4 = r9 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r4 <= r3) goto L20
            return r9
        L20:
            int r2 = r2 + r0
            goto La
        L22:
            int r0 = -r0
            r8 = r8 ^ 1
            int r1 = r1 + 1
            goto L7
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0125j.m41818c(mb.b, int, int, boolean, int, int):int");
    }

    /* renamed from: d */
    private static boolean m41817d(int i, int i2, int i3) {
        return i2 + (-2) <= i && i <= i3 + 2;
    }

    /* renamed from: e */
    private static int m41816e(int[] iArr, int[] iArr2, int i) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return f296a.m35222a(iArr, i, iArr2);
        }
        throw ChecksumException.m27703a();
    }

    /* renamed from: f */
    private static C0115b[][] m41815f(C0121f c0121f) {
        C0122g[] m41841o;
        C0117d[] m41835d;
        int m41870c;
        C0115b[][] c0115bArr = (C0115b[][]) Array.newInstance(C0115b.class, c0121f.m41844l(), c0121f.m41846j() + 2);
        for (int i = 0; i < c0115bArr.length; i++) {
            for (int i2 = 0; i2 < c0115bArr[i].length; i2++) {
                c0115bArr[i][i2] = new C0115b();
            }
        }
        int i3 = 0;
        for (C0122g c0122g : c0121f.m41841o()) {
            if (c0122g != null) {
                for (C0117d c0117d : c0122g.m41835d()) {
                    if (c0117d != null && (m41870c = c0117d.m41870c()) >= 0 && m41870c < c0115bArr.length) {
                        c0115bArr[m41870c][i3].m41883b(c0117d.m41868e());
                    }
                }
            }
            i3++;
        }
        return c0115bArr;
    }

    /* renamed from: g */
    private static C7158e m41814g(C0121f c0121f) throws FormatException, ChecksumException, NotFoundException {
        C0115b[][] m41815f = m41815f(c0121f);
        m41819b(c0121f, m41815f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[c0121f.m41844l() * c0121f.m41846j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < c0121f.m41844l(); i++) {
            int i2 = 0;
            while (i2 < c0121f.m41846j()) {
                int i3 = i2 + 1;
                int[] m41884a = m41815f[i][i3].m41884a();
                int m41846j = (c0121f.m41846j() * i) + i2;
                if (m41884a.length == 0) {
                    arrayList.add(Integer.valueOf(m41846j));
                } else if (m41884a.length == 1) {
                    iArr[m41846j] = m41884a[0];
                } else {
                    arrayList3.add(Integer.valueOf(m41846j));
                    arrayList2.add(m41884a);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return m41813h(c0121f.m41845k(), iArr, C13744a.m518b(arrayList), C13744a.m518b(arrayList3), iArr2);
    }

    /* renamed from: h */
    private static C7158e m41813h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws FormatException, ChecksumException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return m41811j(iArr, i, iArr2);
                } catch (ChecksumException unused) {
                    if (length == 0) {
                        throw ChecksumException.m27703a();
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        } else if (iArr5[i5] < iArr4[i5].length - 1) {
                            iArr5[i5] = iArr5[i5] + 1;
                            break;
                        } else {
                            iArr5[i5] = 0;
                            if (i5 == length - 1) {
                                throw ChecksumException.m27703a();
                            }
                            i5++;
                        }
                    }
                    i2 = i3;
                }
            } else {
                throw ChecksumException.m27703a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r3 = r27;
        r6 = r28;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        if (r7 > r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        r8 = r5 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r4.m41842n(r8) != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r8 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (r8 != r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        r9 = new ac.C0122g(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
        if (r8 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
        r9 = new ac.C0123h(r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
        r4.m41839q(r8, r9);
        r15 = -1;
        r14 = r10.m41876g();
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r14 > r10.m41878e()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        r11 = m41801t(r4, r8, r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r11 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        if (r11 <= r10.m41879d()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
        r19 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
        if (r13 == r15) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
        r20 = r13;
        r23 = r14;
        r21 = r15;
        r11 = m41810k(r22, r10.m41877f(), r10.m41879d(), r0, r19, r23, r3, r6);
        r12 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
        if (r11 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
        r9.m41833f(r12, r11);
        r3 = java.lang.Math.min(r3, r11.m41867f());
        r6 = java.lang.Math.max(r6, r11.m41867f());
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
        r20 = r13;
        r12 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
        r14 = r12 + 1;
        r15 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
        return m41814g(r4);
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p239mb.C7158e m41812i(p239mb.C7155b r22, com.google.zxing.C4411o r23, com.google.zxing.C4411o r24, com.google.zxing.C4411o r25, com.google.zxing.C4411o r26, int r27, int r28) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0125j.m41812i(mb.b, com.google.zxing.o, com.google.zxing.o, com.google.zxing.o, com.google.zxing.o, int, int):mb.e");
    }

    /* renamed from: j */
    private static C7158e m41811j(int[] iArr, int i, int[] iArr2) throws FormatException, ChecksumException {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int m41816e = m41816e(iArr, iArr2, i2);
            m41798w(iArr, i2);
            C7158e m41861b = C0118e.m41861b(iArr, String.valueOf(i));
            m41861b.m19033k(Integer.valueOf(m41816e));
            m41861b.m19034j(Integer.valueOf(iArr2.length));
            return m41861b;
        }
        throw FormatException.m27702a();
    }

    /* renamed from: k */
    private static C0117d m41810k(C7155b c7155b, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int m41822d;
        int m519a;
        int m41818c = m41818c(c7155b, i, i2, z, i3, i4);
        int[] m41804q = m41804q(c7155b, i, i2, z, m41818c, i4);
        if (m41804q == null) {
            return null;
        }
        int m17702d = C7693a.m17702d(m41804q);
        if (z) {
            i7 = m41818c + m17702d;
        } else {
            for (int i8 = 0; i8 < m41804q.length / 2; i8++) {
                int i9 = m41804q[i8];
                m41804q[i8] = m41804q[(m41804q.length - 1) - i8];
                m41804q[(m41804q.length - 1) - i8] = i9;
            }
            m41818c -= m17702d;
            i7 = m41818c;
        }
        if (m41817d(m17702d, i5, i6) && (m519a = C13744a.m519a((m41822d = C0124i.m41822d(m41804q)))) != -1) {
            return new C0117d(m41818c, i7, m41807n(m41822d), m519a);
        }
        return null;
    }

    /* renamed from: l */
    private static C0114a m41809l(C0123h c0123h, C0123h c0123h2) {
        C0114a m41830i;
        C0114a m41830i2;
        if (c0123h == null || (m41830i = c0123h.m41830i()) == null) {
            if (c0123h2 == null) {
                return null;
            }
            return c0123h2.m41830i();
        } else if (c0123h2 == null || (m41830i2 = c0123h2.m41830i()) == null || m41830i.m41889a() == m41830i2.m41889a() || m41830i.m41888b() == m41830i2.m41888b() || m41830i.m41887c() == m41830i2.m41887c()) {
            return m41830i;
        } else {
            return null;
        }
    }

    /* renamed from: m */
    private static int[] m41808m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 < 0) {
                    return iArr;
                }
                i2 = i4;
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    /* renamed from: n */
    private static int m41807n(int i) {
        return m41806o(m41808m(i));
    }

    /* renamed from: o */
    private static int m41806o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* renamed from: p */
    private static int m41805p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[] m41804q(p239mb.C7155b r7, int r8, int r9, boolean r10, int r11, int r12) {
        /*
            r0 = 8
            int[] r1 = new int[r0]
            r2 = 1
            if (r10 == 0) goto L9
            r3 = r2
            goto La
        L9:
            r3 = -1
        La:
            r4 = 0
            r5 = r10
        Lc:
            if (r10 == 0) goto L11
            if (r11 >= r9) goto L27
            goto L13
        L11:
            if (r11 < r8) goto L27
        L13:
            if (r4 >= r0) goto L27
            boolean r6 = r7.m19059e(r11, r12)
            if (r6 != r5) goto L22
            r6 = r1[r4]
            int r6 = r6 + r2
            r1[r4] = r6
            int r11 = r11 + r3
            goto Lc
        L22:
            int r4 = r4 + 1
            r5 = r5 ^ 1
            goto Lc
        L27:
            if (r4 == r0) goto L34
            if (r10 == 0) goto L2c
            r8 = r9
        L2c:
            if (r11 != r8) goto L32
            r7 = 7
            if (r4 != r7) goto L32
            goto L34
        L32:
            r7 = 0
            return r7
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C0125j.m41804q(mb.b, int, int, boolean, int, int):int[]");
    }

    /* renamed from: r */
    private static int m41803r(int i) {
        return 2 << i;
    }

    /* renamed from: s */
    private static C0123h m41802s(C7155b c7155b, C0116c c0116c, C4411o c4411o, boolean z, int i, int i2) {
        int m41871b;
        C0123h c0123h = new C0123h(c0116c, z);
        int i3 = 0;
        while (i3 < 2) {
            int i4 = i3 == 0 ? 1 : -1;
            int m27640c = (int) c4411o.m27640c();
            for (int m27639d = (int) c4411o.m27639d(); m27639d <= c0116c.m41878e() && m27639d >= c0116c.m41876g(); m27639d += i4) {
                C0117d m41810k = m41810k(c7155b, 0, c7155b.m19053l(), z, m27640c, m27639d, i, i2);
                if (m41810k != null) {
                    c0123h.m41833f(m27639d, m41810k);
                    if (z) {
                        m41871b = m41810k.m41869d();
                    } else {
                        m41871b = m41810k.m41871b();
                    }
                    m27640c = m41871b;
                }
            }
            i3++;
        }
        return c0123h;
    }

    /* renamed from: t */
    private static int m41801t(C0121f c0121f, int i, int i2, boolean z) {
        C0117d[] m41835d;
        int i3 = z ? 1 : -1;
        int i4 = i - i3;
        C0117d m41837b = m41800u(c0121f, i4) ? c0121f.m41842n(i4).m41837b(i2) : null;
        if (m41837b != null) {
            return z ? m41837b.m41871b() : m41837b.m41869d();
        }
        C0117d m41836c = c0121f.m41842n(i).m41836c(i2);
        if (m41836c != null) {
            return z ? m41836c.m41869d() : m41836c.m41871b();
        }
        if (m41800u(c0121f, i4)) {
            m41836c = c0121f.m41842n(i4).m41836c(i2);
        }
        if (m41836c != null) {
            return z ? m41836c.m41871b() : m41836c.m41869d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (m41800u(c0121f, i)) {
                for (C0117d c0117d : c0121f.m41842n(i).m41835d()) {
                    if (c0117d != null) {
                        return (z ? c0117d.m41871b() : c0117d.m41869d()) + (i3 * i5 * (c0117d.m41871b() - c0117d.m41869d()));
                    }
                }
                i5++;
            } else {
                C0116c m41843m = c0121f.m41843m();
                return z ? m41843m.m41877f() : m41843m.m41879d();
            }
        }
    }

    /* renamed from: u */
    private static boolean m41800u(C0121f c0121f, int i) {
        return i >= 0 && i <= c0121f.m41846j() + 1;
    }

    /* renamed from: v */
    private static C0121f m41799v(C0123h c0123h, C0123h c0123h2) throws NotFoundException {
        C0114a m41809l;
        if ((c0123h == null && c0123h2 == null) || (m41809l = m41809l(c0123h, c0123h2)) == null) {
            return null;
        }
        return new C0121f(m41809l, C0116c.m41873j(m41820a(c0123h), m41820a(c0123h2)));
    }

    /* renamed from: w */
    private static void m41798w(int[] iArr, int i) throws FormatException {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 > iArr.length) {
                throw FormatException.m27702a();
            }
            if (i2 == 0) {
                if (i < iArr.length) {
                    iArr[0] = iArr.length - i;
                    return;
                }
                throw FormatException.m27702a();
            }
            return;
        }
        throw FormatException.m27702a();
    }
}
