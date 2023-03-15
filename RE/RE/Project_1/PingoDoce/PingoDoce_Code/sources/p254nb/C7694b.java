package p254nb;

import com.google.zxing.C4411o;
import com.google.zxing.NotFoundException;
import p239mb.C7155b;

/* renamed from: nb.b */
/* loaded from: classes2.dex */
public final class C7694b {

    /* renamed from: a */
    private final C7155b f20285a;

    /* renamed from: b */
    private final int f20286b;

    /* renamed from: c */
    private final int f20287c;

    /* renamed from: d */
    private final int f20288d;

    /* renamed from: e */
    private final int f20289e;

    /* renamed from: f */
    private final int f20290f;

    /* renamed from: g */
    private final int f20291g;

    public C7694b(C7155b c7155b) throws NotFoundException {
        this(c7155b, 10, c7155b.m19053l() / 2, c7155b.m19056i() / 2);
    }

    /* renamed from: a */
    private C4411o[] m17701a(C4411o c4411o, C4411o c4411o2, C4411o c4411o3, C4411o c4411o4) {
        float m27640c = c4411o.m27640c();
        float m27639d = c4411o.m27639d();
        float m27640c2 = c4411o2.m27640c();
        float m27639d2 = c4411o2.m27639d();
        float m27640c3 = c4411o3.m27640c();
        float m27639d3 = c4411o3.m27639d();
        float m27640c4 = c4411o4.m27640c();
        float m27639d4 = c4411o4.m27639d();
        return m27640c < ((float) this.f20287c) / 2.0f ? new C4411o[]{new C4411o(m27640c4 - 1.0f, m27639d4 + 1.0f), new C4411o(m27640c2 + 1.0f, m27639d2 + 1.0f), new C4411o(m27640c3 - 1.0f, m27639d3 - 1.0f), new C4411o(m27640c + 1.0f, m27639d - 1.0f)} : new C4411o[]{new C4411o(m27640c4 + 1.0f, m27639d4 + 1.0f), new C4411o(m27640c2 + 1.0f, m27639d2 - 1.0f), new C4411o(m27640c3 - 1.0f, m27639d3 + 1.0f), new C4411o(m27640c - 1.0f, m27639d - 1.0f)};
    }

    /* renamed from: b */
    private boolean m17700b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f20285a.m19059e(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f20285a.m19059e(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: d */
    private C4411o m17698d(float f, float f2, float f3, float f4) {
        int m17703c = C7693a.m17703c(C7693a.m17705a(f, f2, f3, f4));
        float f5 = m17703c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < m17703c; i++) {
            float f8 = i;
            int m17703c2 = C7693a.m17703c((f8 * f6) + f);
            int m17703c3 = C7693a.m17703c((f8 * f7) + f2);
            if (this.f20285a.m19059e(m17703c2, m17703c3)) {
                return new C4411o(m17703c2, m17703c3);
            }
        }
        return null;
    }

    /* renamed from: c */
    public C4411o[] m17699c() throws NotFoundException {
        int i = this.f20288d;
        int i2 = this.f20289e;
        int i3 = this.f20291g;
        int i4 = this.f20290f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        while (z6) {
            boolean z7 = false;
            boolean z8 = true;
            while (true) {
                if ((z8 || !z2) && i2 < this.f20287c) {
                    z8 = m17700b(i3, i4, i2, false);
                    if (z8) {
                        i2++;
                        z2 = true;
                        z7 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 < this.f20287c) {
                boolean z9 = true;
                while (true) {
                    if ((z9 || !z3) && i4 < this.f20286b) {
                        z9 = m17700b(i, i2, i4, true);
                        if (z9) {
                            i4++;
                            z3 = true;
                            z7 = true;
                        } else if (!z3) {
                            i4++;
                        }
                    }
                }
                if (i4 < this.f20286b) {
                    boolean z10 = true;
                    while (true) {
                        if ((z10 || !z4) && i >= 0) {
                            z10 = m17700b(i3, i4, i, false);
                            if (z10) {
                                i--;
                                z4 = true;
                                z7 = true;
                            } else if (!z4) {
                                i--;
                            }
                        }
                    }
                    if (i >= 0) {
                        z6 = z7;
                        boolean z11 = true;
                        while (true) {
                            if ((z11 || !z5) && i3 >= 0) {
                                z11 = m17700b(i, i2, i3, true);
                                if (z11) {
                                    i3--;
                                    z6 = true;
                                    z5 = true;
                                } else if (!z5) {
                                    i3--;
                                }
                            }
                        }
                        if (i3 < 0) {
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z) {
            throw NotFoundException.m27700a();
        }
        int i5 = i2 - i;
        C4411o c4411o = null;
        C4411o c4411o2 = null;
        for (int i6 = 1; c4411o2 == null && i6 < i5; i6++) {
            c4411o2 = m17698d(i, i4 - i6, i + i6, i4);
        }
        if (c4411o2 != null) {
            C4411o c4411o3 = null;
            for (int i7 = 1; c4411o3 == null && i7 < i5; i7++) {
                c4411o3 = m17698d(i, i3 + i7, i + i7, i3);
            }
            if (c4411o3 != null) {
                C4411o c4411o4 = null;
                for (int i8 = 1; c4411o4 == null && i8 < i5; i8++) {
                    c4411o4 = m17698d(i2, i3 + i8, i2 - i8, i3);
                }
                if (c4411o4 != null) {
                    for (int i9 = 1; c4411o == null && i9 < i5; i9++) {
                        c4411o = m17698d(i2, i4 - i9, i2 - i9, i4);
                    }
                    if (c4411o != null) {
                        return m17701a(c4411o, c4411o2, c4411o4, c4411o3);
                    }
                    throw NotFoundException.m27700a();
                }
                throw NotFoundException.m27700a();
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    public C7694b(C7155b c7155b, int i, int i2, int i3) throws NotFoundException {
        this.f20285a = c7155b;
        int m19056i = c7155b.m19056i();
        this.f20286b = m19056i;
        int m19053l = c7155b.m19053l();
        this.f20287c = m19053l;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f20288d = i5;
        int i6 = i2 + i4;
        this.f20289e = i6;
        int i7 = i3 - i4;
        this.f20291g = i7;
        int i8 = i3 + i4;
        this.f20290f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= m19056i || i6 >= m19053l) {
            throw NotFoundException.m27700a();
        }
    }
}
