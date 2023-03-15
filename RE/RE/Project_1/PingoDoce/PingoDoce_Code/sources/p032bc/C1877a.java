package p032bc;

import com.google.zxing.ChecksumException;

/* renamed from: bc.a */
/* loaded from: classes2.dex */
public final class C1877a {

    /* renamed from: a */
    private final C1878b f5600a = C1878b.f5601f;

    /* renamed from: b */
    private int[] m35221b(C1879c c1879c) throws ChecksumException {
        int m35205d = c1879c.m35205d();
        int[] iArr = new int[m35205d];
        int i = 0;
        for (int i2 = 1; i2 < this.f5600a.m35214e() && i < m35205d; i2++) {
            if (c1879c.m35207b(i2) == 0) {
                iArr[i] = this.f5600a.m35212g(i2);
                i++;
            }
        }
        if (i == m35205d) {
            return iArr;
        }
        throw ChecksumException.m27703a();
    }

    /* renamed from: c */
    private int[] m35220c(C1879c c1879c, C1879c c1879c2, int[] iArr) {
        int m35205d = c1879c2.m35205d();
        int[] iArr2 = new int[m35205d];
        for (int i = 1; i <= m35205d; i++) {
            iArr2[m35205d - i] = this.f5600a.m35210i(i, c1879c2.m35206c(i));
        }
        C1879c c1879c3 = new C1879c(this.f5600a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m35212g = this.f5600a.m35212g(iArr[i2]);
            iArr3[i2] = this.f5600a.m35210i(this.f5600a.m35209j(0, c1879c.m35207b(m35212g)), this.f5600a.m35212g(c1879c3.m35207b(m35212g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C1879c[] m35219d(C1879c c1879c, C1879c c1879c2, int i) throws ChecksumException {
        if (c1879c.m35205d() < c1879c2.m35205d()) {
            c1879c2 = c1879c;
            c1879c = c1879c2;
        }
        C1879c m35213f = this.f5600a.m35213f();
        C1879c m35215d = this.f5600a.m35215d();
        while (true) {
            C1879c c1879c3 = c1879c2;
            c1879c2 = c1879c;
            c1879c = c1879c3;
            C1879c c1879c4 = m35215d;
            C1879c c1879c5 = m35213f;
            m35213f = c1879c4;
            if (c1879c.m35205d() >= i / 2) {
                if (!c1879c.m35204e()) {
                    C1879c m35213f2 = this.f5600a.m35213f();
                    int m35212g = this.f5600a.m35212g(c1879c.m35206c(c1879c.m35205d()));
                    while (c1879c2.m35205d() >= c1879c.m35205d() && !c1879c2.m35204e()) {
                        int m35205d = c1879c2.m35205d() - c1879c.m35205d();
                        int m35210i = this.f5600a.m35210i(c1879c2.m35206c(c1879c2.m35205d()), m35212g);
                        m35213f2 = m35213f2.m35208a(this.f5600a.m35217b(m35205d, m35210i));
                        c1879c2 = c1879c2.m35199j(c1879c.m35201h(m35205d, m35210i));
                    }
                    m35215d = m35213f2.m35202g(m35213f).m35199j(c1879c5).m35200i();
                } else {
                    throw ChecksumException.m27703a();
                }
            } else {
                int m35206c = m35213f.m35206c(0);
                if (m35206c != 0) {
                    int m35212g2 = this.f5600a.m35212g(m35206c);
                    return new C1879c[]{m35213f.m35203f(m35212g2), c1879c.m35203f(m35212g2)};
                }
                throw ChecksumException.m27703a();
            }
        }
    }

    /* renamed from: a */
    public int m35222a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C1879c c1879c = new C1879c(this.f5600a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m35207b = c1879c.m35207b(this.f5600a.m35216c(i2));
            iArr3[i - i2] = m35207b;
            if (m35207b != 0) {
                z = true;
            }
        }
        if (z) {
            C1879c m35215d = this.f5600a.m35215d();
            if (iArr2 != null) {
                for (int i3 : iArr2) {
                    int m35216c = this.f5600a.m35216c((iArr.length - 1) - i3);
                    C1878b c1878b = this.f5600a;
                    m35215d = m35215d.m35202g(new C1879c(c1878b, new int[]{c1878b.m35209j(0, m35216c), 1}));
                }
            }
            C1879c[] m35219d = m35219d(this.f5600a.m35217b(i, 1), new C1879c(this.f5600a, iArr3), i);
            C1879c c1879c2 = m35219d[0];
            C1879c c1879c3 = m35219d[1];
            int[] m35221b = m35221b(c1879c2);
            int[] m35220c = m35220c(c1879c3, c1879c2, m35221b);
            for (int i4 = 0; i4 < m35221b.length; i4++) {
                int length = (iArr.length - 1) - this.f5600a.m35211h(m35221b[i4]);
                if (length >= 0) {
                    iArr[length] = this.f5600a.m35209j(iArr[length], m35220c[i4]);
                } else {
                    throw ChecksumException.m27703a();
                }
            }
            return m35221b.length;
        }
        return 0;
    }
}
