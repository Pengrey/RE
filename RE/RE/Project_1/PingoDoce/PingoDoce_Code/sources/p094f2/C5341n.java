package p094f2;

import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.InterfaceC4972h;
import p094f2.AbstractC5345p;
import p094f2.C5331f;

/* renamed from: f2.n */
/* loaded from: classes.dex */
public class C5341n extends AbstractC5345p {

    /* renamed from: k */
    public C5331f f14736k;

    /* renamed from: l */
    C5333g f14737l;

    /* compiled from: VerticalWidgetRun.java */
    /* renamed from: f2.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C5342a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14738a;

        static {
            int[] iArr = new int[AbstractC5345p.EnumC5347b.values().length];
            f14738a = iArr;
            try {
                iArr[AbstractC5345p.EnumC5347b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14738a[AbstractC5345p.EnumC5347b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14738a[AbstractC5345p.EnumC5347b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5341n(C4966e c4966e) {
        super(c4966e);
        C5331f c5331f = new C5331f(this);
        this.f14736k = c5331f;
        this.f14737l = null;
        this.f14752h.f14721e = C5331f.EnumC5332a.TOP;
        this.f14753i.f14721e = C5331f.EnumC5332a.BOTTOM;
        c5331f.f14721e = C5331f.EnumC5332a.BASELINE;
        this.f14750f = 1;
    }

    @Override // p094f2.AbstractC5345p, p094f2.InterfaceC5329d
    /* renamed from: a */
    public void mo24565a(InterfaceC5329d interfaceC5329d) {
        C5333g c5333g;
        float f;
        float m26062t;
        float f2;
        int i;
        C4966e c4966e;
        int i2 = C5342a.f14738a[this.f14754j.ordinal()];
        if (i2 == 1) {
            m24550p(interfaceC5329d);
        } else if (i2 == 2) {
            m24551o(interfaceC5329d);
        } else if (i2 == 3) {
            C4966e c4966e2 = this.f14746b;
            m24552n(interfaceC5329d, c4966e2.f13813G, c4966e2.f13815I, 1);
            return;
        }
        C5333g c5333g2 = this.f14749e;
        if (c5333g2.f14719c && !c5333g2.f14726j && this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
            C4966e c4966e3 = this.f14746b;
            int i3 = c4966e3.f13861o;
            if (i3 != 2) {
                if (i3 == 3 && c4966e3.f13839d.f14749e.f14726j) {
                    int m26060u = c4966e3.m26060u();
                    if (m26060u == -1) {
                        C4966e c4966e4 = this.f14746b;
                        f = c4966e4.f13839d.f14749e.f14723g;
                        m26062t = c4966e4.m26062t();
                    } else if (m26060u == 0) {
                        f2 = c4966e.f13839d.f14749e.f14723g * this.f14746b.m26062t();
                        i = (int) (f2 + 0.5f);
                        this.f14749e.mo24598d(i);
                    } else if (m26060u == 1) {
                        C4966e c4966e5 = this.f14746b;
                        f = c4966e5.f13839d.f14749e.f14723g;
                        m26062t = c4966e5.m26062t();
                    } else {
                        i = 0;
                        this.f14749e.mo24598d(i);
                    }
                    f2 = f / m26062t;
                    i = (int) (f2 + 0.5f);
                    this.f14749e.mo24598d(i);
                }
            } else {
                C4966e m26124I = c4966e3.m26124I();
                if (m26124I != null) {
                    if (m26124I.f13841e.f14749e.f14726j) {
                        this.f14749e.mo24598d((int) ((c5333g.f14723g * this.f14746b.f13868v) + 0.5f));
                    }
                }
            }
        }
        C5331f c5331f = this.f14752h;
        if (c5331f.f14719c) {
            C5331f c5331f2 = this.f14753i;
            if (c5331f2.f14719c) {
                if (c5331f.f14726j && c5331f2.f14726j && this.f14749e.f14726j) {
                    return;
                }
                if (!this.f14749e.f14726j && this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                    C4966e c4966e6 = this.f14746b;
                    if (c4966e6.f13859n == 0 && !c4966e6.m26089b0()) {
                        int i4 = this.f14752h.f14728l.get(0).f14723g;
                        C5331f c5331f3 = this.f14752h;
                        int i5 = i4 + c5331f3.f14722f;
                        int i6 = this.f14753i.f14728l.get(0).f14723g + this.f14753i.f14722f;
                        c5331f3.mo24598d(i5);
                        this.f14753i.mo24598d(i6);
                        this.f14749e.mo24598d(i6 - i5);
                        return;
                    }
                }
                if (!this.f14749e.f14726j && this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT && this.f14745a == 1 && this.f14752h.f14728l.size() > 0 && this.f14753i.f14728l.size() > 0) {
                    int i7 = (this.f14753i.f14728l.get(0).f14723g + this.f14753i.f14722f) - (this.f14752h.f14728l.get(0).f14723g + this.f14752h.f14722f);
                    C5333g c5333g3 = this.f14749e;
                    int i8 = c5333g3.f14729m;
                    if (i7 < i8) {
                        c5333g3.mo24598d(i7);
                    } else {
                        c5333g3.mo24598d(i8);
                    }
                }
                if (this.f14749e.f14726j && this.f14752h.f14728l.size() > 0 && this.f14753i.f14728l.size() > 0) {
                    C5331f c5331f4 = this.f14752h.f14728l.get(0);
                    C5331f c5331f5 = this.f14753i.f14728l.get(0);
                    int i9 = c5331f4.f14723g + this.f14752h.f14722f;
                    int i10 = c5331f5.f14723g + this.f14753i.f14722f;
                    float m26116M = this.f14746b.m26116M();
                    if (c5331f4 == c5331f5) {
                        i9 = c5331f4.f14723g;
                        i10 = c5331f5.f14723g;
                        m26116M = 0.5f;
                    }
                    this.f14752h.mo24598d((int) (i9 + 0.5f + (((i10 - i9) - this.f14749e.f14723g) * m26116M)));
                    this.f14753i.mo24598d(this.f14752h.f14723g + this.f14749e.f14723g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: d */
    public void mo24562d() {
        C4966e m26124I;
        C4966e m26124I2;
        C4966e c4966e = this.f14746b;
        if (c4966e.f13833a) {
            this.f14749e.mo24598d(c4966e.m26058v());
        }
        if (!this.f14749e.f14726j) {
            this.f14748d = this.f14746b.m26112O();
            if (this.f14746b.m26100U()) {
                this.f14737l = new C5324a(this);
            }
            C4966e.EnumC4968b enumC4968b = this.f14748d;
            if (enumC4968b != C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                if (enumC4968b == C4966e.EnumC4968b.MATCH_PARENT && (m26124I2 = this.f14746b.m26124I()) != null && m26124I2.m26112O() == C4966e.EnumC4968b.FIXED) {
                    int m26058v = (m26124I2.m26058v() - this.f14746b.f13813G.m26155e()) - this.f14746b.f13815I.m26155e();
                    m24564b(this.f14752h, m26124I2.f13841e.f14752h, this.f14746b.f13813G.m26155e());
                    m24564b(this.f14753i, m26124I2.f13841e.f14753i, -this.f14746b.f13815I.m26155e());
                    this.f14749e.mo24598d(m26058v);
                    return;
                } else if (this.f14748d == C4966e.EnumC4968b.FIXED) {
                    this.f14749e.mo24598d(this.f14746b.m26058v());
                }
            }
        } else if (this.f14748d == C4966e.EnumC4968b.MATCH_PARENT && (m26124I = this.f14746b.m26124I()) != null && m26124I.m26112O() == C4966e.EnumC4968b.FIXED) {
            m24564b(this.f14752h, m26124I.f13841e.f14752h, this.f14746b.f13813G.m26155e());
            m24564b(this.f14753i, m26124I.f13841e.f14753i, -this.f14746b.f13815I.m26155e());
            return;
        }
        C5333g c5333g = this.f14749e;
        boolean z = c5333g.f14726j;
        if (z) {
            C4966e c4966e2 = this.f14746b;
            if (c4966e2.f13833a) {
                C4963d[] c4963dArr = c4966e2.f13820N;
                if (c4963dArr[2].f13801f != null && c4963dArr[3].f13801f != null) {
                    if (c4966e2.m26089b0()) {
                        this.f14752h.f14722f = this.f14746b.f13820N[2].m26155e();
                        this.f14753i.f14722f = -this.f14746b.f13820N[3].m26155e();
                    } else {
                        C5331f m24558h = m24558h(this.f14746b.f13820N[2]);
                        if (m24558h != null) {
                            m24564b(this.f14752h, m24558h, this.f14746b.f13820N[2].m26155e());
                        }
                        C5331f m24558h2 = m24558h(this.f14746b.f13820N[3]);
                        if (m24558h2 != null) {
                            m24564b(this.f14753i, m24558h2, -this.f14746b.f13820N[3].m26155e());
                        }
                        this.f14752h.f14718b = true;
                        this.f14753i.f14718b = true;
                    }
                    if (this.f14746b.m26100U()) {
                        m24564b(this.f14736k, this.f14752h, this.f14746b.m26074n());
                        return;
                    }
                    return;
                } else if (c4963dArr[2].f13801f != null) {
                    C5331f m24558h3 = m24558h(c4963dArr[2]);
                    if (m24558h3 != null) {
                        m24564b(this.f14752h, m24558h3, this.f14746b.f13820N[2].m26155e());
                        m24564b(this.f14753i, this.f14752h, this.f14749e.f14723g);
                        if (this.f14746b.m26100U()) {
                            m24564b(this.f14736k, this.f14752h, this.f14746b.m26074n());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (c4963dArr[3].f13801f != null) {
                    C5331f m24558h4 = m24558h(c4963dArr[3]);
                    if (m24558h4 != null) {
                        m24564b(this.f14753i, m24558h4, -this.f14746b.f13820N[3].m26155e());
                        m24564b(this.f14752h, this.f14753i, -this.f14749e.f14723g);
                    }
                    if (this.f14746b.m26100U()) {
                        m24564b(this.f14736k, this.f14752h, this.f14746b.m26074n());
                        return;
                    }
                    return;
                } else if (c4963dArr[4].f13801f != null) {
                    C5331f m24558h5 = m24558h(c4963dArr[4]);
                    if (m24558h5 != null) {
                        m24564b(this.f14736k, m24558h5, 0);
                        m24564b(this.f14752h, this.f14736k, -this.f14746b.m26074n());
                        m24564b(this.f14753i, this.f14752h, this.f14749e.f14723g);
                        return;
                    }
                    return;
                } else if ((c4966e2 instanceof InterfaceC4972h) || c4966e2.m26124I() == null || this.f14746b.mo26002m(C4963d.EnumC4965b.CENTER).f13801f != null) {
                    return;
                } else {
                    m24564b(this.f14752h, this.f14746b.m26124I().f13841e.f14752h, this.f14746b.m26102T());
                    m24564b(this.f14753i, this.f14752h, this.f14749e.f14723g);
                    if (this.f14746b.m26100U()) {
                        m24564b(this.f14736k, this.f14752h, this.f14746b.m26074n());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z && this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
            C4966e c4966e3 = this.f14746b;
            int i = c4966e3.f13861o;
            if (i != 2) {
                if (i == 3 && !c4966e3.m26089b0()) {
                    C4966e c4966e4 = this.f14746b;
                    if (c4966e4.f13859n != 3) {
                        C5333g c5333g2 = c4966e4.f13839d.f14749e;
                        this.f14749e.f14728l.add(c5333g2);
                        c5333g2.f14727k.add(this.f14749e);
                        C5333g c5333g3 = this.f14749e;
                        c5333g3.f14718b = true;
                        c5333g3.f14727k.add(this.f14752h);
                        this.f14749e.f14727k.add(this.f14753i);
                    }
                }
            } else {
                C4966e m26124I3 = c4966e3.m26124I();
                if (m26124I3 != null) {
                    C5333g c5333g4 = m26124I3.f13841e.f14749e;
                    this.f14749e.f14728l.add(c5333g4);
                    c5333g4.f14727k.add(this.f14749e);
                    C5333g c5333g5 = this.f14749e;
                    c5333g5.f14718b = true;
                    c5333g5.f14727k.add(this.f14752h);
                    this.f14749e.f14727k.add(this.f14753i);
                }
            }
        } else {
            c5333g.m24600b(this);
        }
        C4966e c4966e5 = this.f14746b;
        C4963d[] c4963dArr2 = c4966e5.f13820N;
        if (c4963dArr2[2].f13801f != null && c4963dArr2[3].f13801f != null) {
            if (c4966e5.m26089b0()) {
                this.f14752h.f14722f = this.f14746b.f13820N[2].m26155e();
                this.f14753i.f14722f = -this.f14746b.f13820N[3].m26155e();
            } else {
                C5331f m24558h6 = m24558h(this.f14746b.f13820N[2]);
                C5331f m24558h7 = m24558h(this.f14746b.f13820N[3]);
                m24558h6.m24600b(this);
                m24558h7.m24600b(this);
                this.f14754j = AbstractC5345p.EnumC5347b.CENTER;
            }
            if (this.f14746b.m26100U()) {
                m24563c(this.f14736k, this.f14752h, 1, this.f14737l);
            }
        } else if (c4963dArr2[2].f13801f != null) {
            C5331f m24558h8 = m24558h(c4963dArr2[2]);
            if (m24558h8 != null) {
                m24564b(this.f14752h, m24558h8, this.f14746b.f13820N[2].m26155e());
                m24563c(this.f14753i, this.f14752h, 1, this.f14749e);
                if (this.f14746b.m26100U()) {
                    m24563c(this.f14736k, this.f14752h, 1, this.f14737l);
                }
                C4966e.EnumC4968b enumC4968b2 = this.f14748d;
                C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (enumC4968b2 == enumC4968b3 && this.f14746b.m26062t() > 0.0f) {
                    C5338l c5338l = this.f14746b.f13839d;
                    if (c5338l.f14748d == enumC4968b3) {
                        c5338l.f14749e.f14727k.add(this.f14749e);
                        this.f14749e.f14728l.add(this.f14746b.f13839d.f14749e);
                        this.f14749e.f14717a = this;
                    }
                }
            }
        } else if (c4963dArr2[3].f13801f != null) {
            C5331f m24558h9 = m24558h(c4963dArr2[3]);
            if (m24558h9 != null) {
                m24564b(this.f14753i, m24558h9, -this.f14746b.f13820N[3].m26155e());
                m24563c(this.f14752h, this.f14753i, -1, this.f14749e);
                if (this.f14746b.m26100U()) {
                    m24563c(this.f14736k, this.f14752h, 1, this.f14737l);
                }
            }
        } else if (c4963dArr2[4].f13801f != null) {
            C5331f m24558h10 = m24558h(c4963dArr2[4]);
            if (m24558h10 != null) {
                m24564b(this.f14736k, m24558h10, 0);
                m24563c(this.f14752h, this.f14736k, -1, this.f14737l);
                m24563c(this.f14753i, this.f14752h, 1, this.f14749e);
            }
        } else if (!(c4966e5 instanceof InterfaceC4972h) && c4966e5.m26124I() != null) {
            m24564b(this.f14752h, this.f14746b.m26124I().f13841e.f14752h, this.f14746b.m26102T());
            m24563c(this.f14753i, this.f14752h, 1, this.f14749e);
            if (this.f14746b.m26100U()) {
                m24563c(this.f14736k, this.f14752h, 1, this.f14737l);
            }
            C4966e.EnumC4968b enumC4968b4 = this.f14748d;
            C4966e.EnumC4968b enumC4968b5 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
            if (enumC4968b4 == enumC4968b5 && this.f14746b.m26062t() > 0.0f) {
                C5338l c5338l2 = this.f14746b.f13839d;
                if (c5338l2.f14748d == enumC4968b5) {
                    c5338l2.f14749e.f14727k.add(this.f14749e);
                    this.f14749e.f14728l.add(this.f14746b.f13839d.f14749e);
                    this.f14749e.f14717a = this;
                }
            }
        }
        if (this.f14749e.f14728l.size() == 0) {
            this.f14749e.f14719c = true;
        }
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: e */
    public void mo24561e() {
        C5331f c5331f = this.f14752h;
        if (c5331f.f14726j) {
            this.f14746b.m26095W0(c5331f.f14723g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: f */
    public void mo24560f() {
        this.f14747c = null;
        this.f14752h.m24599c();
        this.f14753i.m24599c();
        this.f14736k.m24599c();
        this.f14749e.m24599c();
        this.f14751g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: m */
    public boolean mo24553m() {
        return this.f14748d != C4966e.EnumC4968b.MATCH_CONSTRAINT || this.f14746b.f13861o == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m24576q() {
        this.f14751g = false;
        this.f14752h.m24599c();
        this.f14752h.f14726j = false;
        this.f14753i.m24599c();
        this.f14753i.f14726j = false;
        this.f14736k.m24599c();
        this.f14736k.f14726j = false;
        this.f14749e.f14726j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f14746b.m26066r();
    }
}
