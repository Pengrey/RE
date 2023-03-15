package p053d2;

import java.util.ArrayList;
import p053d2.C4711d;
import p053d2.C4720i;

/* renamed from: d2.b */
/* loaded from: classes.dex */
public class C4708b implements C4711d.InterfaceC4712a {

    /* renamed from: c */
    boolean f12848c;

    /* renamed from: e */
    public InterfaceC4709a f12850e;

    /* renamed from: a */
    C4720i f12846a = null;

    /* renamed from: b */
    float f12847b = 0.0f;

    /* renamed from: d */
    ArrayList<C4720i> f12849d = new ArrayList<>();

    /* renamed from: f */
    boolean f12851f = false;

    /* compiled from: ArrayRow.java */
    /* renamed from: d2.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4709a {
        /* renamed from: a */
        float mo26812a(int i);

        /* renamed from: b */
        void mo26811b(C4720i c4720i, float f, boolean z);

        /* renamed from: c */
        int mo26810c();

        void clear();

        /* renamed from: d */
        float mo26809d(C4720i c4720i);

        /* renamed from: e */
        boolean mo26808e(C4720i c4720i);

        /* renamed from: f */
        void mo26807f(C4720i c4720i, float f);

        /* renamed from: g */
        float mo26806g(C4720i c4720i, boolean z);

        /* renamed from: h */
        C4720i mo26805h(int i);

        /* renamed from: i */
        void mo26804i(float f);

        /* renamed from: j */
        void mo26803j();

        /* renamed from: k */
        float mo26802k(C4708b c4708b, boolean z);
    }

    public C4708b() {
    }

    /* renamed from: u */
    private boolean m26871u(C4720i c4720i, C4711d c4711d) {
        return c4720i.f12904m <= 1;
    }

    /* renamed from: w */
    private C4720i m26869w(boolean[] zArr, C4720i c4720i) {
        C4720i.EnumC4721a enumC4721a;
        int mo26810c = this.f12850e.mo26810c();
        C4720i c4720i2 = null;
        float f = 0.0f;
        for (int i = 0; i < mo26810c; i++) {
            float mo26812a = this.f12850e.mo26812a(i);
            if (mo26812a < 0.0f) {
                C4720i mo26805h = this.f12850e.mo26805h(i);
                if ((zArr == null || !zArr[mo26805h.f12894c]) && mo26805h != c4720i && (((enumC4721a = mo26805h.f12901j) == C4720i.EnumC4721a.SLACK || enumC4721a == C4720i.EnumC4721a.ERROR) && mo26812a < f)) {
                    f = mo26812a;
                    c4720i2 = mo26805h;
                }
            }
        }
        return c4720i2;
    }

    /* renamed from: A */
    public void m26891A(C4711d c4711d, C4720i c4720i, boolean z) {
        if (c4720i.f12898g) {
            this.f12847b += c4720i.f12897f * this.f12850e.mo26809d(c4720i);
            this.f12850e.mo26806g(c4720i, z);
            if (z) {
                c4720i.m26817c(this);
            }
            if (C4711d.f12858t && this.f12850e.mo26810c() == 0) {
                this.f12851f = true;
                c4711d.f12865a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo26831B(C4711d c4711d, C4708b c4708b, boolean z) {
        this.f12847b += c4708b.f12847b * this.f12850e.mo26802k(c4708b, z);
        if (z) {
            c4708b.f12846a.m26817c(this);
        }
        if (C4711d.f12858t && this.f12846a != null && this.f12850e.mo26810c() == 0) {
            this.f12851f = true;
            c4711d.f12865a = true;
        }
    }

    /* renamed from: C */
    public void m26890C(C4711d c4711d, C4720i c4720i, boolean z) {
        if (c4720i.f12905n) {
            float mo26809d = this.f12850e.mo26809d(c4720i);
            this.f12847b += c4720i.f12907p * mo26809d;
            this.f12850e.mo26806g(c4720i, z);
            if (z) {
                c4720i.m26817c(this);
            }
            this.f12850e.mo26811b(c4711d.f12878n.f12855d[c4720i.f12906o], mo26809d, z);
            if (C4711d.f12858t && this.f12850e.mo26810c() == 0) {
                this.f12851f = true;
                c4711d.f12865a = true;
            }
        }
    }

    /* renamed from: D */
    public void m26889D(C4711d c4711d) {
        if (c4711d.f12871g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int mo26810c = this.f12850e.mo26810c();
            for (int i = 0; i < mo26810c; i++) {
                C4720i mo26805h = this.f12850e.mo26805h(i);
                if (mo26805h.f12895d != -1 || mo26805h.f12898g || mo26805h.f12905n) {
                    this.f12849d.add(mo26805h);
                }
            }
            int size = this.f12849d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    C4720i c4720i = this.f12849d.get(i2);
                    if (c4720i.f12898g) {
                        m26891A(c4711d, c4720i, true);
                    } else if (c4720i.f12905n) {
                        m26890C(c4711d, c4720i, true);
                    } else {
                        mo26831B(c4711d, c4711d.f12871g[c4720i.f12895d], true);
                    }
                }
                this.f12849d.clear();
            } else {
                z = true;
            }
        }
        if (C4711d.f12858t && this.f12846a != null && this.f12850e.mo26810c() == 0) {
            this.f12851f = true;
            c4711d.f12865a = true;
        }
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    /* renamed from: a */
    public void mo26835a(C4711d.InterfaceC4712a interfaceC4712a) {
        if (interfaceC4712a instanceof C4708b) {
            C4708b c4708b = (C4708b) interfaceC4712a;
            this.f12846a = null;
            this.f12850e.clear();
            for (int i = 0; i < c4708b.f12850e.mo26810c(); i++) {
                this.f12850e.mo26811b(c4708b.f12850e.mo26805h(i), c4708b.f12850e.mo26812a(i), true);
            }
        }
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    /* renamed from: b */
    public C4720i mo26827b(C4711d c4711d, boolean[] zArr) {
        return m26869w(zArr, null);
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    /* renamed from: c */
    public void mo26826c(C4720i c4720i) {
        int i = c4720i.f12896e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f12850e.mo26807f(c4720i, f);
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    public void clear() {
        this.f12850e.clear();
        this.f12846a = null;
        this.f12847b = 0.0f;
    }

    /* renamed from: d */
    public C4708b m26888d(C4711d c4711d, int i) {
        this.f12850e.mo26807f(c4711d.m26847o(i, "ep"), 1.0f);
        this.f12850e.mo26807f(c4711d.m26847o(i, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4708b m26887e(C4720i c4720i, int i) {
        this.f12850e.mo26807f(c4720i, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m26886f(C4711d c4711d) {
        boolean z;
        C4720i m26885g = m26885g(c4711d);
        if (m26885g == null) {
            z = true;
        } else {
            m26868x(m26885g);
            z = false;
        }
        if (this.f12850e.mo26810c() == 0) {
            this.f12851f = true;
        }
        return z;
    }

    /* renamed from: g */
    C4720i m26885g(C4711d c4711d) {
        boolean m26871u;
        boolean m26871u2;
        int mo26810c = this.f12850e.mo26810c();
        C4720i c4720i = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        C4720i c4720i2 = null;
        for (int i = 0; i < mo26810c; i++) {
            float mo26812a = this.f12850e.mo26812a(i);
            C4720i mo26805h = this.f12850e.mo26805h(i);
            if (mo26805h.f12901j == C4720i.EnumC4721a.UNRESTRICTED) {
                if (c4720i == null) {
                    m26871u2 = m26871u(mo26805h, c4711d);
                } else if (f > mo26812a) {
                    m26871u2 = m26871u(mo26805h, c4711d);
                } else if (!z && m26871u(mo26805h, c4711d)) {
                    f = mo26812a;
                    c4720i = mo26805h;
                    z = true;
                }
                z = m26871u2;
                f = mo26812a;
                c4720i = mo26805h;
            } else if (c4720i == null && mo26812a < 0.0f) {
                if (c4720i2 == null) {
                    m26871u = m26871u(mo26805h, c4711d);
                } else if (f2 > mo26812a) {
                    m26871u = m26871u(mo26805h, c4711d);
                } else if (!z2 && m26871u(mo26805h, c4711d)) {
                    f2 = mo26812a;
                    c4720i2 = mo26805h;
                    z2 = true;
                }
                z2 = m26871u;
                f2 = mo26812a;
                c4720i2 = mo26805h;
            }
        }
        return c4720i != null ? c4720i : c4720i2;
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    public C4720i getKey() {
        return this.f12846a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4708b m26884h(C4720i c4720i, C4720i c4720i2, int i, float f, C4720i c4720i3, C4720i c4720i4, int i2) {
        if (c4720i2 == c4720i3) {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i4, 1.0f);
            this.f12850e.mo26807f(c4720i2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12850e.mo26807f(c4720i3, -1.0f);
            this.f12850e.mo26807f(c4720i4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f12847b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.f12850e.mo26807f(c4720i, -1.0f);
            this.f12850e.mo26807f(c4720i2, 1.0f);
            this.f12847b = i;
        } else if (f >= 1.0f) {
            this.f12850e.mo26807f(c4720i4, -1.0f);
            this.f12850e.mo26807f(c4720i3, 1.0f);
            this.f12847b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.f12850e.mo26807f(c4720i, f2 * 1.0f);
            this.f12850e.mo26807f(c4720i2, f2 * (-1.0f));
            this.f12850e.mo26807f(c4720i3, (-1.0f) * f);
            this.f12850e.mo26807f(c4720i4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f12847b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C4708b m26883i(C4720i c4720i, int i) {
        this.f12846a = c4720i;
        float f = i;
        c4720i.f12897f = f;
        this.f12847b = f;
        this.f12851f = true;
        return this;
    }

    @Override // p053d2.C4711d.InterfaceC4712a
    public boolean isEmpty() {
        return this.f12846a == null && this.f12847b == 0.0f && this.f12850e.mo26810c() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C4708b m26882j(C4720i c4720i, C4720i c4720i2, float f) {
        this.f12850e.mo26807f(c4720i, -1.0f);
        this.f12850e.mo26807f(c4720i2, f);
        return this;
    }

    /* renamed from: k */
    public C4708b m26881k(C4720i c4720i, C4720i c4720i2, C4720i c4720i3, C4720i c4720i4, float f) {
        this.f12850e.mo26807f(c4720i, -1.0f);
        this.f12850e.mo26807f(c4720i2, 1.0f);
        this.f12850e.mo26807f(c4720i3, f);
        this.f12850e.mo26807f(c4720i4, -f);
        return this;
    }

    /* renamed from: l */
    public C4708b m26880l(float f, float f2, float f3, C4720i c4720i, C4720i c4720i2, C4720i c4720i3, C4720i c4720i4) {
        this.f12847b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12850e.mo26807f(c4720i4, 1.0f);
            this.f12850e.mo26807f(c4720i3, -1.0f);
        } else if (f == 0.0f) {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f12850e.mo26807f(c4720i3, 1.0f);
            this.f12850e.mo26807f(c4720i4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12850e.mo26807f(c4720i4, f4);
            this.f12850e.mo26807f(c4720i3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C4708b m26879m(C4720i c4720i, int i) {
        if (i < 0) {
            this.f12847b = i * (-1);
            this.f12850e.mo26807f(c4720i, 1.0f);
        } else {
            this.f12847b = i;
            this.f12850e.mo26807f(c4720i, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C4708b m26878n(C4720i c4720i, C4720i c4720i2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f12847b = i;
        }
        if (!z) {
            this.f12850e.mo26807f(c4720i, -1.0f);
            this.f12850e.mo26807f(c4720i2, 1.0f);
        } else {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C4708b m26877o(C4720i c4720i, C4720i c4720i2, C4720i c4720i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f12847b = i;
        }
        if (!z) {
            this.f12850e.mo26807f(c4720i, -1.0f);
            this.f12850e.mo26807f(c4720i2, 1.0f);
            this.f12850e.mo26807f(c4720i3, 1.0f);
        } else {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12850e.mo26807f(c4720i3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C4708b m26876p(C4720i c4720i, C4720i c4720i2, C4720i c4720i3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f12847b = i;
        }
        if (!z) {
            this.f12850e.mo26807f(c4720i, -1.0f);
            this.f12850e.mo26807f(c4720i2, 1.0f);
            this.f12850e.mo26807f(c4720i3, -1.0f);
        } else {
            this.f12850e.mo26807f(c4720i, 1.0f);
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12850e.mo26807f(c4720i3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C4708b m26875q(C4720i c4720i, C4720i c4720i2, C4720i c4720i3, C4720i c4720i4, float f) {
        this.f12850e.mo26807f(c4720i3, 0.5f);
        this.f12850e.mo26807f(c4720i4, 0.5f);
        this.f12850e.mo26807f(c4720i, -0.5f);
        this.f12850e.mo26807f(c4720i2, -0.5f);
        this.f12847b = -f;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m26874r() {
        float f = this.f12847b;
        if (f < 0.0f) {
            this.f12847b = f * (-1.0f);
            this.f12850e.mo26803j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m26873s() {
        C4720i c4720i = this.f12846a;
        return c4720i != null && (c4720i.f12901j == C4720i.EnumC4721a.UNRESTRICTED || this.f12847b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m26872t(C4720i c4720i) {
        return this.f12850e.mo26808e(c4720i);
    }

    public String toString() {
        return m26866z();
    }

    /* renamed from: v */
    public C4720i m26870v(C4720i c4720i) {
        return m26869w(null, c4720i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m26868x(C4720i c4720i) {
        C4720i c4720i2 = this.f12846a;
        if (c4720i2 != null) {
            this.f12850e.mo26807f(c4720i2, -1.0f);
            this.f12846a.f12895d = -1;
            this.f12846a = null;
        }
        float mo26806g = this.f12850e.mo26806g(c4720i, true) * (-1.0f);
        this.f12846a = c4720i;
        if (mo26806g == 1.0f) {
            return;
        }
        this.f12847b /= mo26806g;
        this.f12850e.mo26804i(mo26806g);
    }

    /* renamed from: y */
    public void m26867y() {
        this.f12846a = null;
        this.f12850e.clear();
        this.f12847b = 0.0f;
        this.f12851f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m26866z() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p053d2.C4708b.m26866z():java.lang.String");
    }

    public C4708b(C4710c c4710c) {
        this.f12850e = new C4707a(this, c4710c);
    }
}
