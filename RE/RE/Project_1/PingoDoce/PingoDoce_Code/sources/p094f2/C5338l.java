package p094f2;

import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.InterfaceC4972h;
import p094f2.AbstractC5345p;
import p094f2.C5331f;

/* renamed from: f2.l */
/* loaded from: classes.dex */
public class C5338l extends AbstractC5345p {

    /* renamed from: k */
    private static int[] f14731k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* renamed from: f2.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C5339a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14732a;

        static {
            int[] iArr = new int[AbstractC5345p.EnumC5347b.values().length];
            f14732a = iArr;
            try {
                iArr[AbstractC5345p.EnumC5347b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14732a[AbstractC5345p.EnumC5347b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14732a[AbstractC5345p.EnumC5347b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5338l(C4966e c4966e) {
        super(c4966e);
        this.f14752h.f14721e = C5331f.EnumC5332a.LEFT;
        this.f14753i.f14721e = C5331f.EnumC5332a.RIGHT;
        this.f14750f = 0;
    }

    /* renamed from: q */
    private void m24582q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // p094f2.AbstractC5345p, p094f2.InterfaceC5329d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo24565a(p094f2.InterfaceC5329d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C5338l.mo24565a(f2.d):void");
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: d */
    void mo24562d() {
        C4966e m26124I;
        C4966e m26124I2;
        C4966e c4966e = this.f14746b;
        if (c4966e.f13833a) {
            this.f14749e.mo24598d(c4966e.m26106R());
        }
        if (!this.f14749e.f14726j) {
            C4966e.EnumC4968b m26052y = this.f14746b.m26052y();
            this.f14748d = m26052y;
            if (m26052y != C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_PARENT;
                if (m26052y == enumC4968b && (((m26124I2 = this.f14746b.m26124I()) != null && m26124I2.m26052y() == C4966e.EnumC4968b.FIXED) || m26124I2.m26052y() == enumC4968b)) {
                    int m26106R = (m26124I2.m26106R() - this.f14746b.f13812F.m26155e()) - this.f14746b.f13814H.m26155e();
                    m24564b(this.f14752h, m26124I2.f13839d.f14752h, this.f14746b.f13812F.m26155e());
                    m24564b(this.f14753i, m26124I2.f13839d.f14753i, -this.f14746b.f13814H.m26155e());
                    this.f14749e.mo24598d(m26106R);
                    return;
                } else if (this.f14748d == C4966e.EnumC4968b.FIXED) {
                    this.f14749e.mo24598d(this.f14746b.m26106R());
                }
            }
        } else {
            C4966e.EnumC4968b enumC4968b2 = this.f14748d;
            C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.MATCH_PARENT;
            if (enumC4968b2 == enumC4968b3 && (((m26124I = this.f14746b.m26124I()) != null && m26124I.m26052y() == C4966e.EnumC4968b.FIXED) || m26124I.m26052y() == enumC4968b3)) {
                m24564b(this.f14752h, m26124I.f13839d.f14752h, this.f14746b.f13812F.m26155e());
                m24564b(this.f14753i, m26124I.f13839d.f14753i, -this.f14746b.f13814H.m26155e());
                return;
            }
        }
        C5333g c5333g = this.f14749e;
        if (c5333g.f14726j) {
            C4966e c4966e2 = this.f14746b;
            if (c4966e2.f13833a) {
                C4963d[] c4963dArr = c4966e2.f13820N;
                if (c4963dArr[0].f13801f != null && c4963dArr[1].f13801f != null) {
                    if (c4966e2.m26091Z()) {
                        this.f14752h.f14722f = this.f14746b.f13820N[0].m26155e();
                        this.f14753i.f14722f = -this.f14746b.f13820N[1].m26155e();
                        return;
                    }
                    C5331f m24558h = m24558h(this.f14746b.f13820N[0]);
                    if (m24558h != null) {
                        m24564b(this.f14752h, m24558h, this.f14746b.f13820N[0].m26155e());
                    }
                    C5331f m24558h2 = m24558h(this.f14746b.f13820N[1]);
                    if (m24558h2 != null) {
                        m24564b(this.f14753i, m24558h2, -this.f14746b.f13820N[1].m26155e());
                    }
                    this.f14752h.f14718b = true;
                    this.f14753i.f14718b = true;
                    return;
                } else if (c4963dArr[0].f13801f != null) {
                    C5331f m24558h3 = m24558h(c4963dArr[0]);
                    if (m24558h3 != null) {
                        m24564b(this.f14752h, m24558h3, this.f14746b.f13820N[0].m26155e());
                        m24564b(this.f14753i, this.f14752h, this.f14749e.f14723g);
                        return;
                    }
                    return;
                } else if (c4963dArr[1].f13801f != null) {
                    C5331f m24558h4 = m24558h(c4963dArr[1]);
                    if (m24558h4 != null) {
                        m24564b(this.f14753i, m24558h4, -this.f14746b.f13820N[1].m26155e());
                        m24564b(this.f14752h, this.f14753i, -this.f14749e.f14723g);
                        return;
                    }
                    return;
                } else if ((c4966e2 instanceof InterfaceC4972h) || c4966e2.m26124I() == null || this.f14746b.mo26002m(C4963d.EnumC4965b.CENTER).f13801f != null) {
                    return;
                } else {
                    m24564b(this.f14752h, this.f14746b.m26124I().f13839d.f14752h, this.f14746b.m26104S());
                    m24564b(this.f14753i, this.f14752h, this.f14749e.f14723g);
                    return;
                }
            }
        }
        if (this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
            C4966e c4966e3 = this.f14746b;
            int i = c4966e3.f13859n;
            if (i == 2) {
                C4966e m26124I3 = c4966e3.m26124I();
                if (m26124I3 != null) {
                    C5333g c5333g2 = m26124I3.f13841e.f14749e;
                    this.f14749e.f14728l.add(c5333g2);
                    c5333g2.f14727k.add(this.f14749e);
                    C5333g c5333g3 = this.f14749e;
                    c5333g3.f14718b = true;
                    c5333g3.f14727k.add(this.f14752h);
                    this.f14749e.f14727k.add(this.f14753i);
                }
            } else if (i == 3) {
                if (c4966e3.f13861o == 3) {
                    this.f14752h.f14717a = this;
                    this.f14753i.f14717a = this;
                    C5341n c5341n = c4966e3.f13841e;
                    c5341n.f14752h.f14717a = this;
                    c5341n.f14753i.f14717a = this;
                    c5333g.f14717a = this;
                    if (c4966e3.m26089b0()) {
                        this.f14749e.f14728l.add(this.f14746b.f13841e.f14749e);
                        this.f14746b.f13841e.f14749e.f14727k.add(this.f14749e);
                        C5341n c5341n2 = this.f14746b.f13841e;
                        c5341n2.f14749e.f14717a = this;
                        this.f14749e.f14728l.add(c5341n2.f14752h);
                        this.f14749e.f14728l.add(this.f14746b.f13841e.f14753i);
                        this.f14746b.f13841e.f14752h.f14727k.add(this.f14749e);
                        this.f14746b.f13841e.f14753i.f14727k.add(this.f14749e);
                    } else if (this.f14746b.m26091Z()) {
                        this.f14746b.f13841e.f14749e.f14728l.add(this.f14749e);
                        this.f14749e.f14727k.add(this.f14746b.f13841e.f14749e);
                    } else {
                        this.f14746b.f13841e.f14749e.f14728l.add(this.f14749e);
                    }
                } else {
                    C5333g c5333g4 = c4966e3.f13841e.f14749e;
                    c5333g.f14728l.add(c5333g4);
                    c5333g4.f14727k.add(this.f14749e);
                    this.f14746b.f13841e.f14752h.f14727k.add(this.f14749e);
                    this.f14746b.f13841e.f14753i.f14727k.add(this.f14749e);
                    C5333g c5333g5 = this.f14749e;
                    c5333g5.f14718b = true;
                    c5333g5.f14727k.add(this.f14752h);
                    this.f14749e.f14727k.add(this.f14753i);
                    this.f14752h.f14728l.add(this.f14749e);
                    this.f14753i.f14728l.add(this.f14749e);
                }
            }
        }
        C4966e c4966e4 = this.f14746b;
        C4963d[] c4963dArr2 = c4966e4.f13820N;
        if (c4963dArr2[0].f13801f != null && c4963dArr2[1].f13801f != null) {
            if (c4966e4.m26091Z()) {
                this.f14752h.f14722f = this.f14746b.f13820N[0].m26155e();
                this.f14753i.f14722f = -this.f14746b.f13820N[1].m26155e();
                return;
            }
            C5331f m24558h5 = m24558h(this.f14746b.f13820N[0]);
            C5331f m24558h6 = m24558h(this.f14746b.f13820N[1]);
            m24558h5.m24600b(this);
            m24558h6.m24600b(this);
            this.f14754j = AbstractC5345p.EnumC5347b.CENTER;
        } else if (c4963dArr2[0].f13801f != null) {
            C5331f m24558h7 = m24558h(c4963dArr2[0]);
            if (m24558h7 != null) {
                m24564b(this.f14752h, m24558h7, this.f14746b.f13820N[0].m26155e());
                m24563c(this.f14753i, this.f14752h, 1, this.f14749e);
            }
        } else if (c4963dArr2[1].f13801f != null) {
            C5331f m24558h8 = m24558h(c4963dArr2[1]);
            if (m24558h8 != null) {
                m24564b(this.f14753i, m24558h8, -this.f14746b.f13820N[1].m26155e());
                m24563c(this.f14752h, this.f14753i, -1, this.f14749e);
            }
        } else if ((c4966e4 instanceof InterfaceC4972h) || c4966e4.m26124I() == null) {
        } else {
            m24564b(this.f14752h, this.f14746b.m26124I().f13839d.f14752h, this.f14746b.m26104S());
            m24563c(this.f14753i, this.f14752h, 1, this.f14749e);
        }
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: e */
    public void mo24561e() {
        C5331f c5331f = this.f14752h;
        if (c5331f.f14726j) {
            this.f14746b.m26097V0(c5331f.f14723g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: f */
    public void mo24560f() {
        this.f14747c = null;
        this.f14752h.m24599c();
        this.f14753i.m24599c();
        this.f14749e.m24599c();
        this.f14751g = false;
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: m */
    boolean mo24553m() {
        return this.f14748d != C4966e.EnumC4968b.MATCH_CONSTRAINT || this.f14746b.f13859n == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m24581r() {
        this.f14751g = false;
        this.f14752h.m24599c();
        this.f14752h.f14726j = false;
        this.f14753i.m24599c();
        this.f14753i.f14726j = false;
        this.f14749e.f14726j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f14746b.m26066r();
    }
}
