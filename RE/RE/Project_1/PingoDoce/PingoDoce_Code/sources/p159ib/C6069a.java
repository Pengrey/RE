package p159ib;

import com.google.zxing.C4411o;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.C4395a;
import com.google.zxing.common.reedsolomon.C4397c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import gb.C5630a;
import p239mb.AbstractC7162i;
import p239mb.C7155b;
import p254nb.C7693a;
import p254nb.C7694b;

/* renamed from: ib.a */
/* loaded from: classes2.dex */
public final class C6069a {

    /* renamed from: g */
    private static final int[] f16714g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C7155b f16715a;

    /* renamed from: b */
    private boolean f16716b;

    /* renamed from: c */
    private int f16717c;

    /* renamed from: d */
    private int f16718d;

    /* renamed from: e */
    private int f16719e;

    /* renamed from: f */
    private int f16720f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Detector.java */
    /* renamed from: ib.a$a */
    /* loaded from: classes2.dex */
    public static final class C6070a {

        /* renamed from: a */
        private final int f16721a;

        /* renamed from: b */
        private final int f16722b;

        C6070a(int i, int i2) {
            this.f16721a = i;
            this.f16722b = i2;
        }

        /* renamed from: a */
        int m22268a() {
            return this.f16721a;
        }

        /* renamed from: b */
        int m22267b() {
            return this.f16722b;
        }

        /* renamed from: c */
        C4411o m22266c() {
            return new C4411o(m22268a(), m22267b());
        }

        public String toString() {
            return "<" + this.f16721a + ' ' + this.f16722b + '>';
        }
    }

    public C6069a(C7155b c7155b) {
        this.f16715a = c7155b;
    }

    /* renamed from: b */
    private static float m22285b(C4411o c4411o, C4411o c4411o2) {
        return C7693a.m17705a(c4411o.m27640c(), c4411o.m27639d(), c4411o2.m27640c(), c4411o2.m27639d());
    }

    /* renamed from: c */
    private static float m22284c(C6070a c6070a, C6070a c6070a2) {
        return C7693a.m17704b(c6070a.m22268a(), c6070a.m22267b(), c6070a2.m22268a(), c6070a2.m22267b());
    }

    /* renamed from: d */
    private static C4411o[] m22283d(C4411o[] c4411oArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float m27640c = c4411oArr[0].m27640c() - c4411oArr[2].m27640c();
        float m27639d = c4411oArr[0].m27639d() - c4411oArr[2].m27639d();
        float m27640c2 = (c4411oArr[0].m27640c() + c4411oArr[2].m27640c()) / 2.0f;
        float m27639d2 = (c4411oArr[0].m27639d() + c4411oArr[2].m27639d()) / 2.0f;
        float f2 = m27640c * f;
        float f3 = m27639d * f;
        C4411o c4411o = new C4411o(m27640c2 + f2, m27639d2 + f3);
        C4411o c4411o2 = new C4411o(m27640c2 - f2, m27639d2 - f3);
        float m27640c3 = c4411oArr[1].m27640c() - c4411oArr[3].m27640c();
        float m27639d3 = c4411oArr[1].m27639d() - c4411oArr[3].m27639d();
        float m27640c4 = (c4411oArr[1].m27640c() + c4411oArr[3].m27640c()) / 2.0f;
        float m27639d4 = (c4411oArr[1].m27639d() + c4411oArr[3].m27639d()) / 2.0f;
        float f4 = m27640c3 * f;
        float f5 = f * m27639d3;
        return new C4411o[]{c4411o, new C4411o(m27640c4 + f4, m27639d4 + f5), c4411o2, new C4411o(m27640c4 - f4, m27639d4 - f5)};
    }

    /* renamed from: e */
    private void m22282e(C4411o[] c4411oArr) throws NotFoundException {
        long j;
        long j2;
        if (m22272o(c4411oArr[0]) && m22272o(c4411oArr[1]) && m22272o(c4411oArr[2]) && m22272o(c4411oArr[3])) {
            int i = this.f16719e * 2;
            int[] iArr = {m22269r(c4411oArr[0], c4411oArr[1], i), m22269r(c4411oArr[1], c4411oArr[2], i), m22269r(c4411oArr[2], c4411oArr[3], i), m22269r(c4411oArr[3], c4411oArr[0], i)};
            this.f16720f = m22274m(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f16720f + i2) % 4];
                if (this.f16716b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int m22279h = m22279h(j3, this.f16716b);
            if (this.f16716b) {
                this.f16717c = (m22279h >> 6) + 1;
                this.f16718d = (m22279h & 63) + 1;
                return;
            }
            this.f16717c = (m22279h >> 11) + 1;
            this.f16718d = (m22279h & 2047) + 1;
            return;
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: f */
    private C4411o[] m22281f(C6070a c6070a) throws NotFoundException {
        this.f16719e = 1;
        C6070a c6070a2 = c6070a;
        C6070a c6070a3 = c6070a2;
        C6070a c6070a4 = c6070a3;
        boolean z = true;
        while (this.f16719e < 9) {
            C6070a m22277j = m22277j(c6070a, z, 1, -1);
            C6070a m22277j2 = m22277j(c6070a2, z, 1, 1);
            C6070a m22277j3 = m22277j(c6070a3, z, -1, 1);
            C6070a m22277j4 = m22277j(c6070a4, z, -1, -1);
            if (this.f16719e > 2) {
                double m22284c = (m22284c(m22277j4, m22277j) * this.f16719e) / (m22284c(c6070a4, c6070a) * (this.f16719e + 2));
                if (m22284c < 0.75d || m22284c > 1.25d || !m22271p(m22277j, m22277j2, m22277j3, m22277j4)) {
                    break;
                }
            }
            z = !z;
            this.f16719e++;
            c6070a4 = m22277j4;
            c6070a = m22277j;
            c6070a2 = m22277j2;
            c6070a3 = m22277j3;
        }
        int i = this.f16719e;
        if (i != 5 && i != 7) {
            throw NotFoundException.m27700a();
        }
        this.f16716b = i == 5;
        C4411o[] c4411oArr = {new C4411o(c6070a.m22268a() + 0.5f, c6070a.m22267b() - 0.5f), new C4411o(c6070a2.m22268a() + 0.5f, c6070a2.m22267b() + 0.5f), new C4411o(c6070a3.m22268a() - 0.5f, c6070a3.m22267b() + 0.5f), new C4411o(c6070a4.m22268a() - 0.5f, c6070a4.m22267b() - 0.5f)};
        int i2 = this.f16719e;
        return m22283d(c4411oArr, (i2 * 2) - 3, i2 * 2);
    }

    /* renamed from: g */
    private int m22280g(C6070a c6070a, C6070a c6070a2) {
        float m22284c = m22284c(c6070a, c6070a2);
        float m22268a = (c6070a2.m22268a() - c6070a.m22268a()) / m22284c;
        float m22267b = (c6070a2.m22267b() - c6070a.m22267b()) / m22284c;
        float m22268a2 = c6070a.m22268a();
        float m22267b2 = c6070a.m22267b();
        boolean m19059e = this.f16715a.m19059e(c6070a.m22268a(), c6070a.m22267b());
        int ceil = (int) Math.ceil(m22284c);
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            m22268a2 += m22268a;
            m22267b2 += m22267b;
            if (this.f16715a.m19059e(C7693a.m17703c(m22268a2), C7693a.m17703c(m22267b2)) != m19059e) {
                i++;
            }
        }
        float f = i / m22284c;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == m19059e ? 1 : -1;
        }
        return 0;
    }

    /* renamed from: h */
    private static int m22279h(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C4397c(C4395a.f11897k).m27670a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.m27700a();
        }
    }

    /* renamed from: i */
    private int m22278i() {
        if (this.f16716b) {
            return (this.f16717c * 4) + 11;
        }
        int i = this.f16717c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C6070a m22277j(C6070a c6070a, boolean z, int i, int i2) {
        int m22268a = c6070a.m22268a() + i;
        int m22267b = c6070a.m22267b();
        while (true) {
            m22267b += i2;
            if (!m22273n(m22268a, m22267b) || this.f16715a.m19059e(m22268a, m22267b) != z) {
                break;
            }
            m22268a += i;
        }
        int i3 = m22268a - i;
        int i4 = m22267b - i2;
        while (m22273n(i3, i4) && this.f16715a.m19059e(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (m22273n(i5, i4) && this.f16715a.m19059e(i5, i4) == z) {
            i4 += i2;
        }
        return new C6070a(i5, i4 - i2);
    }

    /* renamed from: k */
    private C6070a m22276k() {
        C4411o m22266c;
        C4411o c4411o;
        C4411o c4411o2;
        C4411o c4411o3;
        C4411o m22266c2;
        C4411o m22266c3;
        C4411o m22266c4;
        C4411o m22266c5;
        try {
            C4411o[] m17699c = new C7694b(this.f16715a).m17699c();
            c4411o2 = m17699c[0];
            c4411o3 = m17699c[1];
            c4411o = m17699c[2];
            m22266c = m17699c[3];
        } catch (NotFoundException unused) {
            int m19053l = this.f16715a.m19053l() / 2;
            int m19056i = this.f16715a.m19056i() / 2;
            int i = m19053l + 7;
            int i2 = m19056i - 7;
            C4411o m22266c6 = m22277j(new C6070a(i, i2), false, 1, -1).m22266c();
            int i3 = m19056i + 7;
            C4411o m22266c7 = m22277j(new C6070a(i, i3), false, 1, 1).m22266c();
            int i4 = m19053l - 7;
            C4411o m22266c8 = m22277j(new C6070a(i4, i3), false, -1, 1).m22266c();
            m22266c = m22277j(new C6070a(i4, i2), false, -1, -1).m22266c();
            c4411o = m22266c8;
            c4411o2 = m22266c6;
            c4411o3 = m22266c7;
        }
        int m17703c = C7693a.m17703c((((c4411o2.m27640c() + m22266c.m27640c()) + c4411o3.m27640c()) + c4411o.m27640c()) / 4.0f);
        int m17703c2 = C7693a.m17703c((((c4411o2.m27639d() + m22266c.m27639d()) + c4411o3.m27639d()) + c4411o.m27639d()) / 4.0f);
        try {
            C4411o[] m17699c2 = new C7694b(this.f16715a, 15, m17703c, m17703c2).m17699c();
            m22266c2 = m17699c2[0];
            m22266c3 = m17699c2[1];
            m22266c4 = m17699c2[2];
            m22266c5 = m17699c2[3];
        } catch (NotFoundException unused2) {
            int i5 = m17703c + 7;
            int i6 = m17703c2 - 7;
            m22266c2 = m22277j(new C6070a(i5, i6), false, 1, -1).m22266c();
            int i7 = m17703c2 + 7;
            m22266c3 = m22277j(new C6070a(i5, i7), false, 1, 1).m22266c();
            int i8 = m17703c - 7;
            m22266c4 = m22277j(new C6070a(i8, i7), false, -1, 1).m22266c();
            m22266c5 = m22277j(new C6070a(i8, i6), false, -1, -1).m22266c();
        }
        return new C6070a(C7693a.m17703c((((m22266c2.m27640c() + m22266c5.m27640c()) + m22266c3.m27640c()) + m22266c4.m27640c()) / 4.0f), C7693a.m17703c((((m22266c2.m27639d() + m22266c5.m27639d()) + m22266c3.m27639d()) + m22266c4.m27639d()) / 4.0f));
    }

    /* renamed from: l */
    private C4411o[] m22275l(C4411o[] c4411oArr) {
        return m22283d(c4411oArr, this.f16719e * 2, m22278i());
    }

    /* renamed from: m */
    private static int m22274m(int[] iArr, int i) throws NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f16714g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: n */
    private boolean m22273n(int i, int i2) {
        return i >= 0 && i < this.f16715a.m19053l() && i2 > 0 && i2 < this.f16715a.m19056i();
    }

    /* renamed from: o */
    private boolean m22272o(C4411o c4411o) {
        return m22273n(C7693a.m17703c(c4411o.m27640c()), C7693a.m17703c(c4411o.m27639d()));
    }

    /* renamed from: p */
    private boolean m22271p(C6070a c6070a, C6070a c6070a2, C6070a c6070a3, C6070a c6070a4) {
        C6070a c6070a5 = new C6070a(c6070a.m22268a() - 3, c6070a.m22267b() + 3);
        C6070a c6070a6 = new C6070a(c6070a2.m22268a() - 3, c6070a2.m22267b() - 3);
        C6070a c6070a7 = new C6070a(c6070a3.m22268a() + 3, c6070a3.m22267b() - 3);
        C6070a c6070a8 = new C6070a(c6070a4.m22268a() + 3, c6070a4.m22267b() + 3);
        int m22280g = m22280g(c6070a8, c6070a5);
        return m22280g != 0 && m22280g(c6070a5, c6070a6) == m22280g && m22280g(c6070a6, c6070a7) == m22280g && m22280g(c6070a7, c6070a8) == m22280g;
    }

    /* renamed from: q */
    private C7155b m22270q(C7155b c7155b, C4411o c4411o, C4411o c4411o2, C4411o c4411o3, C4411o c4411o4) throws NotFoundException {
        AbstractC7162i m19024b = AbstractC7162i.m19024b();
        int m22278i = m22278i();
        float f = m22278i / 2.0f;
        int i = this.f16719e;
        float f2 = f - i;
        float f3 = f + i;
        return m19024b.mo19023c(c7155b, m22278i, m22278i, f2, f2, f3, f2, f3, f3, f2, f3, c4411o.m27640c(), c4411o.m27639d(), c4411o2.m27640c(), c4411o2.m27639d(), c4411o3.m27640c(), c4411o3.m27639d(), c4411o4.m27640c(), c4411o4.m27639d());
    }

    /* renamed from: r */
    private int m22269r(C4411o c4411o, C4411o c4411o2, int i) {
        float m22285b = m22285b(c4411o, c4411o2);
        float f = m22285b / i;
        float m27640c = c4411o.m27640c();
        float m27639d = c4411o.m27639d();
        float m27640c2 = ((c4411o2.m27640c() - c4411o.m27640c()) * f) / m22285b;
        float m27639d2 = (f * (c4411o2.m27639d() - c4411o.m27639d())) / m22285b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f16715a.m19059e(C7693a.m17703c((f2 * m27640c2) + m27640c), C7693a.m17703c((f2 * m27639d2) + m27639d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C5630a m22286a(boolean z) throws NotFoundException {
        C4411o[] m22281f = m22281f(m22276k());
        if (z) {
            C4411o c4411o = m22281f[0];
            m22281f[0] = m22281f[2];
            m22281f[2] = c4411o;
        }
        m22282e(m22281f);
        C7155b c7155b = this.f16715a;
        int i = this.f16720f;
        return new C5630a(m22270q(c7155b, m22281f[i % 4], m22281f[(i + 1) % 4], m22281f[(i + 2) % 4], m22281f[(i + 3) % 4]), m22275l(m22281f), this.f16716b, this.f16718d, this.f16717c);
    }
}
