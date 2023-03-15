package com.google.zxing.common.reedsolomon;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.zxing.common.reedsolomon.b */
/* loaded from: classes2.dex */
public final class C4396b {

    /* renamed from: a */
    private final C4395a f11909a;

    /* renamed from: b */
    private final int[] f11910b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4396b(C4395a c4395a, int[] iArr) {
        if (iArr.length != 0) {
            this.f11909a = c4395a;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f11910b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f11910b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f11910b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4396b m27680a(C4396b c4396b) {
        if (this.f11909a.equals(c4396b.f11909a)) {
            if (m27674g()) {
                return c4396b;
            }
            if (c4396b.m27674g()) {
                return this;
            }
            int[] iArr = this.f11910b;
            int[] iArr2 = c4396b.f11910b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = C4395a.m27690a(iArr2[i - length], iArr[i]);
            }
            return new C4396b(this.f11909a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4396b[] m27679b(C4396b c4396b) {
        if (this.f11909a.equals(c4396b.f11909a)) {
            if (!c4396b.m27674g()) {
                C4396b m27684g = this.f11909a.m27684g();
                int m27683h = this.f11909a.m27683h(c4396b.m27677d(c4396b.m27675f()));
                C4396b c4396b2 = this;
                while (c4396b2.m27675f() >= c4396b.m27675f() && !c4396b2.m27674g()) {
                    int m27675f = c4396b2.m27675f() - c4396b.m27675f();
                    int m27681j = this.f11909a.m27681j(c4396b2.m27677d(c4396b2.m27675f()), m27683h);
                    C4396b m27671j = c4396b.m27671j(m27675f, m27681j);
                    m27684g = m27684g.m27680a(this.f11909a.m27689b(m27675f, m27681j));
                    c4396b2 = c4396b2.m27680a(m27671j);
                }
                return new C4396b[]{m27684g, c4396b2};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27678c(int i) {
        if (i == 0) {
            return m27677d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f11910b) {
                i2 = C4395a.m27690a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f11910b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = C4395a.m27690a(this.f11909a.m27681j(i, i4), this.f11910b[i5]);
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m27677d(int i) {
        int[] iArr = this.f11910b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m27676e() {
        return this.f11910b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m27675f() {
        return this.f11910b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m27674g() {
        return this.f11910b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4396b m27673h(int i) {
        if (i == 0) {
            return this.f11909a.m27684g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f11910b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f11909a.m27681j(this.f11910b[i2], i);
        }
        return new C4396b(this.f11909a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C4396b m27672i(C4396b c4396b) {
        if (this.f11909a.equals(c4396b.f11909a)) {
            if (!m27674g() && !c4396b.m27674g()) {
                int[] iArr = this.f11910b;
                int length = iArr.length;
                int[] iArr2 = c4396b.f11910b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = C4395a.m27690a(iArr3[i4], this.f11909a.m27681j(i2, iArr2[i3]));
                    }
                }
                return new C4396b(this.f11909a, iArr3);
            }
            return this.f11909a.m27684g();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C4396b m27671j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f11909a.m27684g();
            }
            int length = this.f11910b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f11909a.m27681j(this.f11910b[i3], i2);
            }
            return new C4396b(this.f11909a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        if (m27674g()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m27675f() * 8);
        for (int m27675f = m27675f(); m27675f >= 0; m27675f--) {
            int m27677d = m27677d(m27675f);
            if (m27677d != 0) {
                if (m27677d < 0) {
                    if (m27675f == m27675f()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    m27677d = -m27677d;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m27675f == 0 || m27677d != 1) {
                    int m27682i = this.f11909a.m27682i(m27677d);
                    if (m27682i == 0) {
                        sb2.append('1');
                    } else if (m27682i == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(m27682i);
                    }
                }
                if (m27675f != 0) {
                    if (m27675f == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m27675f);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
