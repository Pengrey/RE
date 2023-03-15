package com.google.zxing.common.reedsolomon;

/* renamed from: com.google.zxing.common.reedsolomon.c */
/* loaded from: classes2.dex */
public final class C4397c {

    /* renamed from: a */
    private final C4395a f11911a;

    public C4397c(C4395a c4395a) {
        this.f11911a = c4395a;
    }

    /* renamed from: b */
    private int[] m27669b(C4396b c4396b) throws ReedSolomonException {
        int m27675f = c4396b.m27675f();
        int i = 0;
        if (m27675f == 1) {
            return new int[]{c4396b.m27677d(1)};
        }
        int[] iArr = new int[m27675f];
        for (int i2 = 1; i2 < this.f11911a.m27685f() && i < m27675f; i2++) {
            if (c4396b.m27678c(i2) == 0) {
                iArr[i] = this.f11911a.m27683h(i2);
                i++;
            }
        }
        if (i == m27675f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m27668c(C4396b c4396b, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int m27683h = this.f11911a.m27683h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int m27681j = this.f11911a.m27681j(iArr[i3], m27683h);
                    i2 = this.f11911a.m27681j(i2, (m27681j & 1) == 0 ? m27681j | 1 : m27681j & (-2));
                }
            }
            iArr2[i] = this.f11911a.m27681j(c4396b.m27678c(m27683h), this.f11911a.m27683h(i2));
            if (this.f11911a.m27687d() != 0) {
                iArr2[i] = this.f11911a.m27681j(iArr2[i], m27683h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C4396b[] m27667d(C4396b c4396b, C4396b c4396b2, int i) throws ReedSolomonException {
        if (c4396b.m27675f() < c4396b2.m27675f()) {
            c4396b2 = c4396b;
            c4396b = c4396b2;
        }
        C4396b m27684g = this.f11911a.m27684g();
        C4396b m27686e = this.f11911a.m27686e();
        do {
            C4396b c4396b3 = c4396b2;
            c4396b2 = c4396b;
            c4396b = c4396b3;
            C4396b c4396b4 = m27686e;
            C4396b c4396b5 = m27684g;
            m27684g = c4396b4;
            if (c4396b.m27675f() >= i / 2) {
                if (!c4396b.m27674g()) {
                    C4396b m27684g2 = this.f11911a.m27684g();
                    int m27683h = this.f11911a.m27683h(c4396b.m27677d(c4396b.m27675f()));
                    while (c4396b2.m27675f() >= c4396b.m27675f() && !c4396b2.m27674g()) {
                        int m27675f = c4396b2.m27675f() - c4396b.m27675f();
                        int m27681j = this.f11911a.m27681j(c4396b2.m27677d(c4396b2.m27675f()), m27683h);
                        m27684g2 = m27684g2.m27680a(this.f11911a.m27689b(m27675f, m27681j));
                        c4396b2 = c4396b2.m27680a(c4396b.m27671j(m27675f, m27681j));
                    }
                    m27686e = m27684g2.m27672i(m27684g).m27680a(c4396b5);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int m27677d = m27684g.m27677d(0);
                if (m27677d != 0) {
                    int m27683h2 = this.f11911a.m27683h(m27677d);
                    return new C4396b[]{m27684g.m27673h(m27683h2), c4396b.m27673h(m27683h2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (c4396b2.m27675f() < c4396b.m27675f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void m27670a(int[] iArr, int i) throws ReedSolomonException {
        C4396b c4396b = new C4396b(this.f11911a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            C4395a c4395a = this.f11911a;
            int m27678c = c4396b.m27678c(c4395a.m27688c(c4395a.m27687d() + i2));
            iArr2[(i - 1) - i2] = m27678c;
            if (m27678c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        C4396b[] m27667d = m27667d(this.f11911a.m27689b(i, 1), new C4396b(this.f11911a, iArr2), i);
        C4396b c4396b2 = m27667d[0];
        C4396b c4396b3 = m27667d[1];
        int[] m27669b = m27669b(c4396b2);
        int[] m27668c = m27668c(c4396b3, m27669b);
        for (int i3 = 0; i3 < m27669b.length; i3++) {
            int length = (iArr.length - 1) - this.f11911a.m27682i(m27669b[i3]);
            if (length >= 0) {
                iArr[length] = C4395a.m27690a(iArr[length], m27668c[i3]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }
}
