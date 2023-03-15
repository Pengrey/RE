package p104fc;

import com.google.zxing.InterfaceC4412p;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import p239mb.C7155b;

/* renamed from: fc.b */
/* loaded from: classes2.dex */
final class C5446b {

    /* renamed from: a */
    private final C7155b f15338a;

    /* renamed from: c */
    private final int f15340c;

    /* renamed from: d */
    private final int f15341d;

    /* renamed from: e */
    private final int f15342e;

    /* renamed from: f */
    private final int f15343f;

    /* renamed from: g */
    private final float f15344g;

    /* renamed from: i */
    private final InterfaceC4412p f15346i;

    /* renamed from: b */
    private final List<C5445a> f15339b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f15345h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5446b(C7155b c7155b, int i, int i2, int i3, int i4, float f, InterfaceC4412p interfaceC4412p) {
        this.f15338a = c7155b;
        this.f15340c = i;
        this.f15341d = i2;
        this.f15342e = i3;
        this.f15343f = i4;
        this.f15344g = f;
        this.f15346i = interfaceC4412p;
    }

    /* renamed from: a */
    private static float m24341a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r2[1] <= r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r10 >= r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r0.m19059e(r11, r10) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        if (r2[2] > r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
        r2[2] = r2[2] + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (r2[2] <= r12) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        if ((java.lang.Math.abs(((r2[0] + r2[1]) + r2[2]) - r13) * 5) < (r13 * 2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
        if (m24338d(r2) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        return m24341a(r2, r10);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m24340b(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            mb.b r0 = r9.f15338a
            int r1 = r0.m19056i()
            int[] r2 = r9.f15345h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = r10
        L12:
            if (r6 < 0) goto L26
            boolean r7 = r0.m19059e(r11, r6)
            if (r7 == 0) goto L26
            r7 = r2[r4]
            if (r7 > r12) goto L26
            r7 = r2[r4]
            int r7 = r7 + r4
            r2[r4] = r7
            int r6 = r6 + (-1)
            goto L12
        L26:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r6 < 0) goto L9c
            r8 = r2[r4]
            if (r8 <= r12) goto L30
            goto L9c
        L30:
            if (r6 < 0) goto L44
            boolean r8 = r0.m19059e(r11, r6)
            if (r8 != 0) goto L44
            r8 = r2[r3]
            if (r8 > r12) goto L44
            r8 = r2[r3]
            int r8 = r8 + r4
            r2[r3] = r8
            int r6 = r6 + (-1)
            goto L30
        L44:
            r6 = r2[r3]
            if (r6 <= r12) goto L49
            return r7
        L49:
            int r10 = r10 + r4
        L4a:
            if (r10 >= r1) goto L5e
            boolean r6 = r0.m19059e(r11, r10)
            if (r6 == 0) goto L5e
            r6 = r2[r4]
            if (r6 > r12) goto L5e
            r6 = r2[r4]
            int r6 = r6 + r4
            r2[r4] = r6
            int r10 = r10 + 1
            goto L4a
        L5e:
            if (r10 == r1) goto L9c
            r6 = r2[r4]
            if (r6 <= r12) goto L65
            goto L9c
        L65:
            if (r10 >= r1) goto L79
            boolean r6 = r0.m19059e(r11, r10)
            if (r6 != 0) goto L79
            r6 = r2[r5]
            if (r6 > r12) goto L79
            r6 = r2[r5]
            int r6 = r6 + r4
            r2[r5] = r6
            int r10 = r10 + 1
            goto L65
        L79:
            r11 = r2[r5]
            if (r11 <= r12) goto L7e
            return r7
        L7e:
            r11 = r2[r3]
            r12 = r2[r4]
            int r11 = r11 + r12
            r12 = r2[r5]
            int r11 = r11 + r12
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 * 5
            int r13 = r13 * r5
            if (r11 < r13) goto L91
            return r7
        L91:
            boolean r11 = r9.m24338d(r2)
            if (r11 == 0) goto L9c
            float r10 = m24341a(r2, r10)
            return r10
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p104fc.C5446b.m24340b(int, int, int, int):float");
    }

    /* renamed from: d */
    private boolean m24338d(int[] iArr) {
        float f = this.f15344g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C5445a m24337e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m24341a = m24341a(iArr, i2);
        float m24340b = m24340b(i, (int) m24341a, iArr[1] * 2, i3);
        if (Float.isNaN(m24340b)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C5445a c5445a : this.f15339b) {
            if (c5445a.m24343f(f, m24340b, m24341a)) {
                return c5445a.m24342g(m24340b, m24341a, f);
            }
        }
        C5445a c5445a2 = new C5445a(m24341a, m24340b, f);
        this.f15339b.add(c5445a2);
        InterfaceC4412p interfaceC4412p = this.f15346i;
        if (interfaceC4412p != null) {
            interfaceC4412p.mo22809a(c5445a2);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C5445a m24339c() throws NotFoundException {
        C5445a m24337e;
        C5445a m24337e2;
        int i = this.f15340c;
        int i2 = this.f15343f;
        int i3 = this.f15342e + i;
        int i4 = this.f15341d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f15338a.m19059e(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f15338a.m19059e(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 == 2) {
                    if (m24338d(iArr) && (m24337e2 = m24337e(iArr, i6, i7)) != null) {
                        return m24337e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                } else {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                }
                i7++;
            }
            if (m24338d(iArr) && (m24337e = m24337e(iArr, i6, i3)) != null) {
                return m24337e;
            }
        }
        if (!this.f15339b.isEmpty()) {
            return this.f15339b.get(0);
        }
        throw NotFoundException.m27700a();
    }
}
