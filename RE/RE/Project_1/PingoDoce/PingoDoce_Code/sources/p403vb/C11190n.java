package p403vb;

import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.n */
/* loaded from: classes2.dex */
public final class C11190n extends AbstractC11194r {

    /* renamed from: b */
    private static final int[] f28741b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f28742c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f28743d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f28744e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f28745a = -1;

    /* renamed from: i */
    private static int m5793i(int[] iArr) throws NotFoundException {
        int length = f28744e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float m5785f = AbstractC11194r.m5785f(iArr, f28744e[i2], 0.5f);
            if (m5785f < f) {
                i = i2;
                f = m5785f;
            } else if (m5785f == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: j */
    private int[] m5792j(C7154a c7154a) throws NotFoundException {
        int i;
        int[] m5789m;
        c7154a.m19068p();
        try {
            try {
                m5789m = m5789m(c7154a, m5788n(c7154a), f28743d[0]);
            } catch (NotFoundException unused) {
                m5789m = m5789m(c7154a, i, f28743d[1]);
            }
            m5787o(c7154a, m5789m[0]);
            int i2 = m5789m[0];
            m5789m[0] = c7154a.m19072l() - m5789m[1];
            m5789m[1] = c7154a.m19072l() - i2;
            return m5789m;
        } finally {
            c7154a.m19068p();
        }
    }

    /* renamed from: k */
    private static void m5791k(C7154a c7154a, int i, int i2, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            AbstractC11194r.m5784g(c7154a, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb2.append((char) (m5793i(iArr2) + 48));
            sb2.append((char) (m5793i(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    private int[] m5790l(C7154a c7154a) throws NotFoundException {
        int[] m5789m = m5789m(c7154a, m5788n(c7154a), f28742c);
        this.f28745a = (m5789m[1] - m5789m[0]) / 4;
        m5787o(c7154a, m5789m[0]);
        return m5789m;
    }

    /* renamed from: m */
    private static int[] m5789m(C7154a c7154a, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m19072l = c7154a.m19072l();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < m19072l) {
            if (c7154a.m19076g(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (AbstractC11194r.m5785f(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: n */
    private static int m5788n(C7154a c7154a) throws NotFoundException {
        int m19072l = c7154a.m19072l();
        int m19074j = c7154a.m19074j(0);
        if (m19074j != m19072l) {
            return m19074j;
        }
        throw NotFoundException.m27700a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5787o(p239mb.C7154a r3, int r4) throws com.google.zxing.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.f28745a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.m19076g(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.m27700a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p403vb.C11190n.m5787o(mb.a, int):void");
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws FormatException, NotFoundException {
        boolean z;
        int[] m5790l = m5790l(c7154a);
        int[] m5792j = m5792j(c7154a);
        StringBuilder sb2 = new StringBuilder(20);
        m5791k(c7154a, m5790l[1], m5792j[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC4399d.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f28741b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new C4409m(sb3, null, new C4411o[]{new C4411o(m5790l[1], f), new C4411o(m5792j[0], f)}, EnumC4392a.ITF);
        }
        throw FormatException.m27702a();
    }
}
