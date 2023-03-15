package p295pb;

import com.google.zxing.FormatException;
import p239mb.C7155b;

/* renamed from: pb.a */
/* loaded from: classes2.dex */
final class C8593a {

    /* renamed from: a */
    private final C7155b f22195a;

    /* renamed from: b */
    private final C7155b f22196b;

    /* renamed from: c */
    private final C8599e f22197c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8593a(C7155b c7155b) throws FormatException {
        int m19056i = c7155b.m19056i();
        if (m19056i >= 8 && m19056i <= 144 && (m19056i & 1) == 0) {
            this.f22197c = m15067j(c7155b);
            C7155b m15076a = m15076a(c7155b);
            this.f22195a = m15076a;
            this.f22196b = new C7155b(m15076a.m19053l(), m15076a.m19056i());
            return;
        }
        throw FormatException.m27702a();
    }

    /* renamed from: a */
    private C7155b m15076a(C7155b c7155b) {
        int m15047f = this.f22197c.m15047f();
        int m15048e = this.f22197c.m15048e();
        if (c7155b.m19056i() == m15047f) {
            int m15050c = this.f22197c.m15050c();
            int m15051b = this.f22197c.m15051b();
            int i = m15047f / m15050c;
            int i2 = m15048e / m15051b;
            C7155b c7155b2 = new C7155b(i2 * m15051b, i * m15050c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * m15050c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * m15051b;
                    for (int i7 = 0; i7 < m15050c; i7++) {
                        int i8 = ((m15050c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < m15051b; i10++) {
                            if (c7155b.m19059e(((m15051b + 2) * i5) + 1 + i10, i8)) {
                                c7155b2.m19051n(i6 + i10, i9);
                            }
                        }
                    }
                }
            }
            return c7155b2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: d */
    private int m15073d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m15069h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (m15069h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m15069h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m15069h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (m15069h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (m15069h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (m15069h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return m15069h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    private int m15072e(int i, int i2) {
        int i3 = (m15069h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m15069h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m15069h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m15069h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (m15069h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (m15069h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (m15069h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return m15069h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    private int m15071f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (m15069h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (m15069h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (m15069h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (m15069h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (m15069h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (m15069h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m15069h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return m15069h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    private int m15070g(int i, int i2) {
        int i3 = (m15069h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (m15069h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (m15069h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (m15069h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (m15069h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (m15069h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (m15069h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return m15069h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    private boolean m15069h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f22196b.m19051n(i2, i);
        return this.f22195a.m19059e(i2, i);
    }

    /* renamed from: i */
    private int m15068i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (m15069h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (m15069h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (m15069h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (m15069h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (m15069h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (m15069h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (m15069h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return m15069h(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    /* renamed from: j */
    private static C8599e m15067j(C7155b c7155b) throws FormatException {
        return C8599e.m15045h(c7155b.m19056i(), c7155b.m19053l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C8599e m15075b() {
        return this.f22197c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m15074c() throws FormatException {
        byte[] bArr = new byte[this.f22197c.m15046g()];
        int m19056i = this.f22195a.m19056i();
        int m19053l = this.f22195a.m19053l();
        int i = 0;
        int i2 = 4;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (i2 == m19056i && i == 0 && !z) {
                bArr[i3] = (byte) m15073d(m19056i, m19053l);
                i2 -= 2;
                i += 2;
                i3++;
                z = true;
            } else {
                int i4 = m19056i - 2;
                if (i2 == i4 && i == 0 && (m19053l & 3) != 0 && !z2) {
                    bArr[i3] = (byte) m15072e(m19056i, m19053l);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z2 = true;
                } else if (i2 == m19056i + 4 && i == 2 && (m19053l & 7) == 0 && !z3) {
                    bArr[i3] = (byte) m15071f(m19056i, m19053l);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z3 = true;
                } else if (i2 == i4 && i == 0 && (m19053l & 7) == 4 && !z4) {
                    bArr[i3] = (byte) m15070g(m19056i, m19053l);
                    i2 -= 2;
                    i += 2;
                    i3++;
                    z4 = true;
                } else {
                    do {
                        if (i2 < m19056i && i >= 0 && !this.f22196b.m19059e(i, i2)) {
                            bArr[i3] = (byte) m15068i(i2, i, m19056i, m19053l);
                            i3++;
                        }
                        i2 -= 2;
                        i += 2;
                        if (i2 < 0) {
                            break;
                        }
                    } while (i < m19053l);
                    int i5 = i2 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < m19053l && !this.f22196b.m19059e(i6, i5)) {
                            bArr[i3] = (byte) m15068i(i5, i6, m19056i, m19053l);
                            i3++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= m19056i) {
                            break;
                        }
                    } while (i6 >= 0);
                    i2 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i2 >= m19056i && i >= m19053l) {
                break;
            }
        }
        if (i3 == this.f22197c.m15046g()) {
            return bArr;
        }
        throw FormatException.m27702a();
    }
}
