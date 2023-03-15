package p312qb;

import com.google.zxing.C4411o;
import com.google.zxing.NotFoundException;
import p239mb.AbstractC7162i;
import p239mb.C7155b;
import p239mb.C7160g;
import p254nb.C7694b;

/* renamed from: qb.a */
/* loaded from: classes2.dex */
public final class C9710a {

    /* renamed from: a */
    private final C7155b f25565a;

    /* renamed from: b */
    private final C7694b f25566b;

    public C9710a(C7155b c7155b) throws NotFoundException {
        this.f25565a = c7155b;
        this.f25566b = new C7694b(c7155b);
    }

    /* renamed from: a */
    private C4411o m10154a(C4411o[] c4411oArr) {
        C4411o c4411o = c4411oArr[0];
        C4411o c4411o2 = c4411oArr[1];
        C4411o c4411o3 = c4411oArr[2];
        C4411o c4411o4 = c4411oArr[3];
        int m10145j = m10145j(c4411o, c4411o4);
        C4411o m10147h = m10147h(c4411o, c4411o2, (m10145j(c4411o2, c4411o4) + 1) << 2);
        C4411o m10147h2 = m10147h(c4411o3, c4411o2, (m10145j + 1) << 2);
        int m10145j2 = m10145j(m10147h, c4411o4);
        int m10145j3 = m10145j(m10147h2, c4411o4);
        float f = m10145j2 + 1;
        C4411o c4411o5 = new C4411o(c4411o4.m27640c() + ((c4411o3.m27640c() - c4411o2.m27640c()) / f), c4411o4.m27639d() + ((c4411o3.m27639d() - c4411o2.m27639d()) / f));
        float f2 = m10145j3 + 1;
        C4411o c4411o6 = new C4411o(c4411o4.m27640c() + ((c4411o.m27640c() - c4411o2.m27640c()) / f2), c4411o4.m27639d() + ((c4411o.m27639d() - c4411o2.m27639d()) / f2));
        if (m10150e(c4411o5)) {
            return (m10150e(c4411o6) && m10145j(m10147h, c4411o5) + m10145j(m10147h2, c4411o5) <= m10145j(m10147h, c4411o6) + m10145j(m10147h2, c4411o6)) ? c4411o6 : c4411o5;
        } else if (m10150e(c4411o6)) {
            return c4411o6;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    private C4411o[] m10152c(C4411o[] c4411oArr) {
        C4411o c4411o = c4411oArr[0];
        C4411o c4411o2 = c4411oArr[1];
        C4411o c4411o3 = c4411oArr[3];
        C4411o c4411o4 = c4411oArr[2];
        int m10145j = m10145j(c4411o, c4411o2);
        int m10145j2 = m10145j(c4411o2, c4411o3);
        int m10145j3 = m10145j(c4411o3, c4411o4);
        int m10145j4 = m10145j(c4411o4, c4411o);
        C4411o[] c4411oArr2 = {c4411o4, c4411o, c4411o2, c4411o3};
        if (m10145j > m10145j2) {
            c4411oArr2[0] = c4411o;
            c4411oArr2[1] = c4411o2;
            c4411oArr2[2] = c4411o3;
            c4411oArr2[3] = c4411o4;
            m10145j = m10145j2;
        }
        if (m10145j > m10145j3) {
            c4411oArr2[0] = c4411o2;
            c4411oArr2[1] = c4411o3;
            c4411oArr2[2] = c4411o4;
            c4411oArr2[3] = c4411o;
        } else {
            m10145j3 = m10145j;
        }
        if (m10145j3 > m10145j4) {
            c4411oArr2[0] = c4411o3;
            c4411oArr2[1] = c4411o4;
            c4411oArr2[2] = c4411o;
            c4411oArr2[3] = c4411o2;
        }
        return c4411oArr2;
    }

    /* renamed from: d */
    private C4411o[] m10151d(C4411o[] c4411oArr) {
        C4411o c4411o = c4411oArr[0];
        C4411o c4411o2 = c4411oArr[1];
        C4411o c4411o3 = c4411oArr[2];
        C4411o c4411o4 = c4411oArr[3];
        int m10145j = (m10145j(c4411o, c4411o4) + 1) << 2;
        if (m10145j(m10147h(c4411o2, c4411o3, m10145j), c4411o) < m10145j(m10147h(c4411o3, c4411o2, m10145j), c4411o4)) {
            c4411oArr[0] = c4411o;
            c4411oArr[1] = c4411o2;
            c4411oArr[2] = c4411o3;
            c4411oArr[3] = c4411o4;
        } else {
            c4411oArr[0] = c4411o2;
            c4411oArr[1] = c4411o3;
            c4411oArr[2] = c4411o4;
            c4411oArr[3] = c4411o;
        }
        return c4411oArr;
    }

    /* renamed from: e */
    private boolean m10150e(C4411o c4411o) {
        return c4411o.m27640c() >= 0.0f && c4411o.m27640c() < ((float) this.f25565a.m19053l()) && c4411o.m27639d() > 0.0f && c4411o.m27639d() < ((float) this.f25565a.m19056i());
    }

    /* renamed from: f */
    private static C4411o m10149f(C4411o c4411o, float f, float f2) {
        float m27640c = c4411o.m27640c();
        float m27639d = c4411o.m27639d();
        return new C4411o(m27640c < f ? m27640c - 1.0f : m27640c + 1.0f, m27639d < f2 ? m27639d - 1.0f : m27639d + 1.0f);
    }

    /* renamed from: g */
    private static C7155b m10148g(C7155b c7155b, C4411o c4411o, C4411o c4411o2, C4411o c4411o3, C4411o c4411o4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC7162i.m19024b().mo19023c(c7155b, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, c4411o.m27640c(), c4411o.m27639d(), c4411o4.m27640c(), c4411o4.m27639d(), c4411o3.m27640c(), c4411o3.m27639d(), c4411o2.m27640c(), c4411o2.m27639d());
    }

    /* renamed from: h */
    private static C4411o m10147h(C4411o c4411o, C4411o c4411o2, int i) {
        float f = i + 1;
        return new C4411o(c4411o.m27640c() + ((c4411o2.m27640c() - c4411o.m27640c()) / f), c4411o.m27639d() + ((c4411o2.m27639d() - c4411o.m27639d()) / f));
    }

    /* renamed from: i */
    private C4411o[] m10146i(C4411o[] c4411oArr) {
        C4411o c4411o = c4411oArr[0];
        C4411o c4411o2 = c4411oArr[1];
        C4411o c4411o3 = c4411oArr[2];
        C4411o c4411o4 = c4411oArr[3];
        C4411o m10147h = m10147h(c4411o, c4411o2, (m10145j(c4411o3, c4411o4) + 1) << 2);
        C4411o m10147h2 = m10147h(c4411o3, c4411o2, (m10145j(c4411o, c4411o4) + 1) << 2);
        int m10145j = m10145j(m10147h, c4411o4) + 1;
        int m10145j2 = m10145j(m10147h2, c4411o4) + 1;
        if ((m10145j & 1) == 1) {
            m10145j++;
        }
        if ((m10145j2 & 1) == 1) {
            m10145j2++;
        }
        float m27640c = (((c4411o.m27640c() + c4411o2.m27640c()) + c4411o3.m27640c()) + c4411o4.m27640c()) / 4.0f;
        float m27639d = (((c4411o.m27639d() + c4411o2.m27639d()) + c4411o3.m27639d()) + c4411o4.m27639d()) / 4.0f;
        C4411o m10149f = m10149f(c4411o, m27640c, m27639d);
        C4411o m10149f2 = m10149f(c4411o2, m27640c, m27639d);
        C4411o m10149f3 = m10149f(c4411o3, m27640c, m27639d);
        C4411o m10149f4 = m10149f(c4411o4, m27640c, m27639d);
        int i = m10145j2 << 2;
        int i2 = m10145j << 2;
        return new C4411o[]{m10147h(m10147h(m10149f, m10149f2, i), m10149f4, i2), m10147h(m10147h(m10149f2, m10149f, i), m10149f3, i2), m10147h(m10147h(m10149f3, m10149f4, i), m10149f2, i2), m10147h(m10147h(m10149f4, m10149f3, i), m10149f, i2)};
    }

    /* renamed from: j */
    private int m10145j(C4411o c4411o, C4411o c4411o2) {
        int m27640c = (int) c4411o.m27640c();
        int m27639d = (int) c4411o.m27639d();
        int m27640c2 = (int) c4411o2.m27640c();
        int m27639d2 = (int) c4411o2.m27639d();
        int i = 0;
        boolean z = Math.abs(m27639d2 - m27639d) > Math.abs(m27640c2 - m27640c);
        if (z) {
            m27639d = m27640c;
            m27640c = m27639d;
            m27639d2 = m27640c2;
            m27640c2 = m27639d2;
        }
        int abs = Math.abs(m27640c2 - m27640c);
        int abs2 = Math.abs(m27639d2 - m27639d);
        int i2 = (-abs) / 2;
        int i3 = m27639d < m27639d2 ? 1 : -1;
        int i4 = m27640c >= m27640c2 ? -1 : 1;
        boolean m19059e = this.f25565a.m19059e(z ? m27639d : m27640c, z ? m27640c : m27639d);
        while (m27640c != m27640c2) {
            boolean m19059e2 = this.f25565a.m19059e(z ? m27639d : m27640c, z ? m27640c : m27639d);
            if (m19059e2 != m19059e) {
                i++;
                m19059e = m19059e2;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (m27639d == m27639d2) {
                    break;
                }
                m27639d += i3;
                i2 -= abs;
            }
            m27640c += i4;
        }
        return i;
    }

    /* renamed from: b */
    public C7160g m10153b() throws NotFoundException {
        int i;
        int i2;
        C4411o[] m10151d = m10151d(m10152c(this.f25566b.m17699c()));
        m10151d[3] = m10154a(m10151d);
        if (m10151d[3] != null) {
            C4411o[] m10146i = m10146i(m10151d);
            C4411o c4411o = m10146i[0];
            C4411o c4411o2 = m10146i[1];
            C4411o c4411o3 = m10146i[2];
            C4411o c4411o4 = m10146i[3];
            int m10145j = m10145j(c4411o, c4411o4) + 1;
            int m10145j2 = m10145j(c4411o3, c4411o4) + 1;
            if ((m10145j & 1) == 1) {
                m10145j++;
            }
            if ((m10145j2 & 1) == 1) {
                m10145j2++;
            }
            if (m10145j * 4 >= m10145j2 * 7 || m10145j2 * 4 >= m10145j * 7) {
                i = m10145j;
                i2 = m10145j2;
            } else {
                i = Math.max(m10145j, m10145j2);
                i2 = i;
            }
            return new C7160g(m10148g(this.f25565a, c4411o, c4411o2, c4411o3, c4411o4, i, i2), new C4411o[]{c4411o, c4411o2, c4411o3, c4411o4});
        }
        throw NotFoundException.m27700a();
    }
}
