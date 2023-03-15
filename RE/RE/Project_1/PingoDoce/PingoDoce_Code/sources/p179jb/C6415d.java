package p179jb;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import p070e.C4906j;

/* renamed from: jb.d */
/* loaded from: classes2.dex */
public final class C6415d {

    /* renamed from: b */
    static final String[] f17484b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f17485c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f17486d;

    /* renamed from: e */
    static final int[][] f17487e;

    /* renamed from: a */
    private final byte[] f17488a;

    /* compiled from: HighLevelEncoder.java */
    /* renamed from: jb.d$a */
    /* loaded from: classes2.dex */
    class C6416a implements Comparator<C6418f> {
        C6416a(C6415d c6415d) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C6418f c6418f, C6418f c6418f2) {
            return c6418f.m20988e() - c6418f2.m20988e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 5, 256);
        f17486d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f17486d[0][i] = (i - 65) + 2;
        }
        f17486d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f17486d[1][i2] = (i2 - 97) + 2;
        }
        f17486d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f17486d[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f17486d;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, C4906j.f13410G0, C4906j.f13420I0, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f17486d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, C4906j.f13405F0, C4906j.f13415H0};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f17486d[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(int.class, 6, 6);
        f17487e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f17487e;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public C6415d(byte[] bArr) {
        this.f17488a = bArr;
    }

    /* renamed from: b */
    private static Collection<C6418f> m20998b(Iterable<C6418f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C6418f c6418f : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6418f c6418f2 = (C6418f) it.next();
                if (c6418f2.m20986g(c6418f)) {
                    z = false;
                    break;
                } else if (c6418f.m20986g(c6418f2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(c6418f);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m20997c(C6418f c6418f, int i, Collection<C6418f> collection) {
        char c = (char) (this.f17488a[i] & 255);
        boolean z = f17486d[c6418f.m20987f()][c] > 0;
        C6418f c6418f2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f17486d[i2][c];
            if (i3 > 0) {
                if (c6418f2 == null) {
                    c6418f2 = c6418f.m20990c(i);
                }
                if (!z || i2 == c6418f.m20987f() || i2 == 2) {
                    collection.add(c6418f2.m20985h(i2, i3));
                }
                if (!z && f17487e[c6418f.m20987f()][i2] >= 0) {
                    collection.add(c6418f2.m20984i(i2, i3));
                }
            }
        }
        if (c6418f.m20989d() > 0 || f17486d[c6418f.m20987f()][c] == 0) {
            collection.add(c6418f.m20992a(i));
        }
    }

    /* renamed from: d */
    private static void m20996d(C6418f c6418f, int i, int i2, Collection<C6418f> collection) {
        C6418f m20990c = c6418f.m20990c(i);
        collection.add(m20990c.m20985h(4, i2));
        if (c6418f.m20987f() != 4) {
            collection.add(m20990c.m20984i(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(m20990c.m20985h(2, 16 - i2).m20985h(2, 1));
        }
        if (c6418f.m20989d() > 0) {
            collection.add(c6418f.m20992a(i).m20992a(i + 1));
        }
    }

    /* renamed from: e */
    private Collection<C6418f> m20995e(Iterable<C6418f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C6418f c6418f : iterable) {
            m20997c(c6418f, i, linkedList);
        }
        return m20998b(linkedList);
    }

    /* renamed from: f */
    private static Collection<C6418f> m20994f(Iterable<C6418f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C6418f c6418f : iterable) {
            m20996d(c6418f, i, i2, linkedList);
        }
        return m20998b(linkedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p239mb.C7154a m20999a() {
        /*
            r8 = this;
            jb.f r0 = p179jb.C6418f.f17491e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L8:
            byte[] r3 = r8.f17488a
            int r4 = r3.length
            if (r2 >= r4) goto L4c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = r1
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L38
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L34
            r6 = 46
            if (r3 == r6) goto L30
            r6 = 58
            if (r3 == r6) goto L2c
        L2a:
            r3 = r1
            goto L3d
        L2c:
            if (r5 != r7) goto L2a
            r3 = 5
            goto L3d
        L30:
            if (r5 != r7) goto L2a
            r3 = 3
            goto L3d
        L34:
            if (r5 != r7) goto L2a
            r3 = 4
            goto L3d
        L38:
            r3 = 10
            if (r5 != r3) goto L2a
            r3 = 2
        L3d:
            if (r3 <= 0) goto L45
            java.util.Collection r0 = m20994f(r0, r2, r3)
            r2 = r4
            goto L49
        L45:
            java.util.Collection r0 = r8.m20995e(r0, r2)
        L49:
            int r2 = r2 + 1
            goto L8
        L4c:
            jb.d$a r1 = new jb.d$a
            r1.<init>(r8)
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            jb.f r0 = (p179jb.C6418f) r0
            byte[] r1 = r8.f17488a
            mb.a r0 = r0.m20983j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p179jb.C6415d.m20999a():mb.a");
    }
}
