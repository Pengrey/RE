package ac;

import com.google.zxing.C4411o;

/* renamed from: ac.h */
/* loaded from: classes2.dex */
final class C0123h extends C0122g {

    /* renamed from: c */
    private final boolean f294c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0123h(C0116c c0116c, boolean z) {
        super(c0116c);
        this.f294c = z;
    }

    /* renamed from: h */
    private void m41831h(C0114a c0114a) {
        C0116c m41838a = m41838a();
        C4411o m41875h = this.f294c ? m41838a.m41875h() : m41838a.m41874i();
        C4411o m41881b = this.f294c ? m41838a.m41881b() : m41838a.m41880c();
        int m41834e = m41834e((int) m41881b.m27639d());
        C0117d[] m41835d = m41835d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m41834e2 = m41834e((int) m41875h.m27639d()); m41834e2 < m41834e; m41834e2++) {
            if (m41835d[m41834e2] != null) {
                C0117d c0117d = m41835d[m41834e2];
                c0117d.m41863j();
                int m41870c = c0117d.m41870c() - i;
                if (m41870c == 0) {
                    i2++;
                } else {
                    if (m41870c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c0117d.m41870c();
                    } else if (c0117d.m41870c() >= c0114a.m41887c()) {
                        m41835d[m41834e2] = null;
                    } else {
                        i = c0117d.m41870c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m41827l(C0117d[] c0117dArr, C0114a c0114a) {
        for (int i = 0; i < c0117dArr.length; i++) {
            C0117d c0117d = c0117dArr[i];
            if (c0117dArr[i] != null) {
                int m41868e = c0117d.m41868e() % 30;
                int m41870c = c0117d.m41870c();
                if (m41870c > c0114a.m41887c()) {
                    c0117dArr[i] = null;
                } else {
                    if (!this.f294c) {
                        m41870c += 2;
                    }
                    int i2 = m41870c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m41868e + 1 != c0114a.m41889a()) {
                                c0117dArr[i] = null;
                            }
                        } else if (m41868e / 3 != c0114a.m41888b() || m41868e % 3 != c0114a.m41886d()) {
                            c0117dArr[i] = null;
                        }
                    } else if ((m41868e * 3) + 1 != c0114a.m41885e()) {
                        c0117dArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m41826m() {
        C0117d[] m41835d;
        for (C0117d c0117d : m41835d()) {
            if (c0117d != null) {
                c0117d.m41863j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m41832g(C0114a c0114a) {
        C0117d[] m41835d = m41835d();
        m41826m();
        m41827l(m41835d, c0114a);
        C0116c m41838a = m41838a();
        C4411o m41875h = this.f294c ? m41838a.m41875h() : m41838a.m41874i();
        C4411o m41881b = this.f294c ? m41838a.m41881b() : m41838a.m41880c();
        int m41834e = m41834e((int) m41875h.m27639d());
        int m41834e2 = m41834e((int) m41881b.m27639d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (m41834e < m41834e2) {
            if (m41835d[m41834e] != null) {
                C0117d c0117d = m41835d[m41834e];
                int m41870c = c0117d.m41870c() - i;
                if (m41870c == 0) {
                    i2++;
                } else {
                    if (m41870c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c0117d.m41870c();
                    } else if (m41870c < 0 || c0117d.m41870c() >= c0114a.m41887c() || m41870c > m41834e) {
                        m41835d[m41834e] = null;
                    } else {
                        if (i3 > 2) {
                            m41870c *= i3 - 2;
                        }
                        boolean z = m41870c >= m41834e;
                        for (int i4 = 1; i4 <= m41870c && !z; i4++) {
                            z = m41835d[m41834e - i4] != null;
                        }
                        if (z) {
                            m41835d[m41834e] = null;
                        } else {
                            i = c0117d.m41870c();
                        }
                    }
                    i2 = 1;
                }
            }
            m41834e++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0114a m41830i() {
        C0117d[] m41835d = m41835d();
        C0115b c0115b = new C0115b();
        C0115b c0115b2 = new C0115b();
        C0115b c0115b3 = new C0115b();
        C0115b c0115b4 = new C0115b();
        for (C0117d c0117d : m41835d) {
            if (c0117d != null) {
                c0117d.m41863j();
                int m41868e = c0117d.m41868e() % 30;
                int m41870c = c0117d.m41870c();
                if (!this.f294c) {
                    m41870c += 2;
                }
                int i = m41870c % 3;
                if (i == 0) {
                    c0115b2.m41883b((m41868e * 3) + 1);
                } else if (i == 1) {
                    c0115b4.m41883b(m41868e / 3);
                    c0115b3.m41883b(m41868e % 3);
                } else if (i == 2) {
                    c0115b.m41883b(m41868e + 1);
                }
            }
        }
        if (c0115b.m41884a().length == 0 || c0115b2.m41884a().length == 0 || c0115b3.m41884a().length == 0 || c0115b4.m41884a().length == 0 || c0115b.m41884a()[0] <= 0 || c0115b2.m41884a()[0] + c0115b3.m41884a()[0] < 3 || c0115b2.m41884a()[0] + c0115b3.m41884a()[0] > 90) {
            return null;
        }
        C0114a c0114a = new C0114a(c0115b.m41884a()[0], c0115b2.m41884a()[0], c0115b3.m41884a()[0], c0115b4.m41884a()[0]);
        m41827l(m41835d, c0114a);
        return c0114a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m41829j() {
        C0117d[] m41835d;
        int m41870c;
        C0114a m41830i = m41830i();
        if (m41830i == null) {
            return null;
        }
        m41831h(m41830i);
        int m41887c = m41830i.m41887c();
        int[] iArr = new int[m41887c];
        for (C0117d c0117d : m41835d()) {
            if (c0117d != null && (m41870c = c0117d.m41870c()) < m41887c) {
                iArr[m41870c] = iArr[m41870c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m41828k() {
        return this.f294c;
    }

    @Override // ac.C0122g
    public String toString() {
        return "IsLeft: " + this.f294c + '\n' + super.toString();
    }
}
