package cc;

import com.google.zxing.C4394c;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4399d;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: cc.a */
/* loaded from: classes2.dex */
public final class C2108a {

    /* renamed from: a */
    private static final int[] f6114a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f6115b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f6116c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f6117d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static void m34652a(C4411o[] c4411oArr, C4411o[] c4411oArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            c4411oArr[iArr[i]] = c4411oArr2[i];
        }
    }

    /* renamed from: b */
    public static C2109b m34651b(C4394c c4394c, Map<EnumC4399d, ?> map, boolean z) throws NotFoundException {
        C7155b m27696a = c4394c.m27696a();
        List<C4411o[]> m34650c = m34650c(z, m27696a);
        if (m34650c.isEmpty()) {
            m27696a = m27696a.m19061c();
            m27696a.m19052m();
            m34650c = m34650c(z, m27696a);
        }
        return new C2109b(m27696a, m34650c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r5 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r4.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r5 = (com.google.zxing.C4411o[]) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5[1] == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r3 = (int) java.lang.Math.max(r3, r5[1].m27639d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r5[3] == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].m27639d());
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.zxing.C4411o[]> m34650c(boolean r8, p239mb.C7155b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = r4
        La:
            int r6 = r9.m19056i()
            if (r3 >= r6) goto L7d
            com.google.zxing.o[] r4 = m34647f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L53
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L53
            if (r5 == 0) goto L7d
            java.util.Iterator r4 = r0.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            com.google.zxing.o[] r5 = (com.google.zxing.C4411o[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L3f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.m27639d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L3f:
            r7 = r5[r6]
            if (r7 == 0) goto L23
            r5 = r5[r6]
            float r5 = r5.m27639d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L23
        L4f:
            int r3 = r3 + 5
            r4 = r2
            goto L9
        L53:
            r0.add(r4)
            if (r8 == 0) goto L7d
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L6b
            r5 = r4[r3]
            float r5 = r5.m27640c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.m27639d()
            goto L79
        L6b:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.m27640c()
            int r5 = (int) r5
            r3 = r4[r3]
            float r3 = r3.m27639d()
        L79:
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto La
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C2108a.m34650c(boolean, mb.b):java.util.List");
    }

    /* renamed from: d */
    private static int[] m34649d(C7155b c7155b, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (c7155b.m19059e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (c7155b.m19059e(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else if (m34646g(iArr2, iArr, 0.8f) < 0.42f) {
                    return new int[]{i7, i};
                } else {
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m34646g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: e */
    private static C4411o[] m34648e(C7155b c7155b, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        C4411o[] c4411oArr = new C4411o[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i) {
                z = false;
                break;
            }
            int[] m34649d = m34649d(c7155b, i4, i8, i2, false, iArr, iArr2);
            if (m34649d != null) {
                int i9 = i8;
                int[] iArr3 = m34649d;
                int i10 = i9;
                while (true) {
                    if (i10 <= 0) {
                        i7 = i10;
                        break;
                    }
                    int i11 = i10 - 1;
                    int[] m34649d2 = m34649d(c7155b, i4, i11, i2, false, iArr, iArr2);
                    if (m34649d2 == null) {
                        i7 = i11 + 1;
                        break;
                    }
                    iArr3 = m34649d2;
                    i10 = i11;
                }
                float f = i7;
                c4411oArr[0] = new C4411o(iArr3[0], f);
                c4411oArr[1] = new C4411o(iArr3[1], f);
                z = true;
                i8 = i7;
            } else {
                i8 += 5;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) c4411oArr[0].m27640c(), (int) c4411oArr[1].m27640c()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 >= i) {
                    i5 = i14;
                    i6 = i13;
                    break;
                }
                i5 = i14;
                i6 = i13;
                int[] m34649d3 = m34649d(c7155b, iArr4[0], i13, i2, false, iArr, iArr2);
                if (m34649d3 != null && Math.abs(iArr4[0] - m34649d3[0]) < 5 && Math.abs(iArr4[1] - m34649d3[1]) < 5) {
                    iArr4 = m34649d3;
                    i14 = 0;
                } else if (i5 > 25) {
                    break;
                } else {
                    i14 = i5 + 1;
                }
                i13 = i6 + 1;
            }
            i12 = i6 - (i5 + 1);
            float f2 = i12;
            c4411oArr[2] = new C4411o(iArr4[0], f2);
            c4411oArr[3] = new C4411o(iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(c4411oArr, (Object) null);
        }
        return c4411oArr;
    }

    /* renamed from: f */
    private static C4411o[] m34647f(C7155b c7155b, int i, int i2) {
        int m19056i = c7155b.m19056i();
        int m19053l = c7155b.m19053l();
        C4411o[] c4411oArr = new C4411o[8];
        m34652a(c4411oArr, m34648e(c7155b, m19056i, m19053l, i, i2, f6116c), f6114a);
        if (c4411oArr[4] != null) {
            i2 = (int) c4411oArr[4].m27640c();
            i = (int) c4411oArr[4].m27639d();
        }
        m34652a(c4411oArr, m34648e(c7155b, m19056i, m19053l, i, i2, f6117d), f6115b);
        return c4411oArr;
    }

    /* renamed from: g */
    private static float m34646g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
