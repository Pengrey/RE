package p032bc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bc.c */
/* loaded from: classes2.dex */
public final class C1879c {

    /* renamed from: a */
    private final C1878b f5607a;

    /* renamed from: b */
    private final int[] f5608b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1879c(C1878b c1878b, int[] iArr) {
        if (iArr.length != 0) {
            this.f5607a = c1878b;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f5608b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f5608b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f5608b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C1879c m35208a(C1879c c1879c) {
        if (this.f5607a.equals(c1879c.f5607a)) {
            if (m35204e()) {
                return c1879c;
            }
            if (c1879c.m35204e()) {
                return this;
            }
            int[] iArr = this.f5608b;
            int[] iArr2 = c1879c.f5608b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f5607a.m35218a(iArr2[i - length], iArr[i]);
            }
            return new C1879c(this.f5607a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m35207b(int i) {
        if (i == 0) {
            return m35206c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f5608b) {
                i2 = this.f5607a.m35218a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f5608b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            C1878b c1878b = this.f5607a;
            i4 = c1878b.m35218a(c1878b.m35210i(i, i4), this.f5608b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m35206c(int i) {
        int[] iArr = this.f5608b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m35205d() {
        return this.f5608b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m35204e() {
        return this.f5608b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C1879c m35203f(int i) {
        if (i == 0) {
            return this.f5607a.m35213f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f5608b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f5607a.m35210i(this.f5608b[i2], i);
        }
        return new C1879c(this.f5607a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1879c m35202g(C1879c c1879c) {
        if (this.f5607a.equals(c1879c.f5607a)) {
            if (!m35204e() && !c1879c.m35204e()) {
                int[] iArr = this.f5608b;
                int length = iArr.length;
                int[] iArr2 = c1879c.f5608b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        C1878b c1878b = this.f5607a;
                        iArr3[i4] = c1878b.m35218a(iArr3[i4], c1878b.m35210i(i2, iArr2[i3]));
                    }
                }
                return new C1879c(this.f5607a, iArr3);
            }
            return this.f5607a.m35213f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C1879c m35201h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f5607a.m35213f();
            }
            int length = this.f5608b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f5607a.m35210i(this.f5608b[i3], i2);
            }
            return new C1879c(this.f5607a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C1879c m35200i() {
        int length = this.f5608b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f5607a.m35209j(0, this.f5608b[i]);
        }
        return new C1879c(this.f5607a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C1879c m35199j(C1879c c1879c) {
        if (this.f5607a.equals(c1879c.f5607a)) {
            return c1879c.m35204e() ? this : m35208a(c1879c.m35200i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m35205d() * 8);
        for (int m35205d = m35205d(); m35205d >= 0; m35205d--) {
            int m35206c = m35206c(m35205d);
            if (m35206c != 0) {
                if (m35206c < 0) {
                    sb2.append(" - ");
                    m35206c = -m35206c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m35205d == 0 || m35206c != 1) {
                    sb2.append(m35206c);
                }
                if (m35205d != 0) {
                    if (m35205d == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m35205d);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
