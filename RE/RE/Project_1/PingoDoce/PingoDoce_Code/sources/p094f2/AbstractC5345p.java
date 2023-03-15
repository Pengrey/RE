package p094f2;

import p073e2.C4963d;
import p073e2.C4966e;

/* renamed from: f2.p */
/* loaded from: classes.dex */
public abstract class AbstractC5345p implements InterfaceC5329d {

    /* renamed from: a */
    public int f14745a;

    /* renamed from: b */
    C4966e f14746b;

    /* renamed from: c */
    C5340m f14747c;

    /* renamed from: d */
    protected C4966e.EnumC4968b f14748d;

    /* renamed from: e */
    C5333g f14749e = new C5333g(this);

    /* renamed from: f */
    public int f14750f = 0;

    /* renamed from: g */
    boolean f14751g = false;

    /* renamed from: h */
    public C5331f f14752h = new C5331f(this);

    /* renamed from: i */
    public C5331f f14753i = new C5331f(this);

    /* renamed from: j */
    protected EnumC5347b f14754j = EnumC5347b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WidgetRun.java */
    /* renamed from: f2.p$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C5346a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14755a;

        static {
            int[] iArr = new int[C4963d.EnumC4965b.values().length];
            f14755a = iArr;
            try {
                iArr[C4963d.EnumC4965b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14755a[C4963d.EnumC4965b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14755a[C4963d.EnumC4965b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14755a[C4963d.EnumC4965b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14755a[C4963d.EnumC4965b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* renamed from: f2.p$b */
    /* loaded from: classes.dex */
    enum EnumC5347b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC5345p(C4966e c4966e) {
        this.f14746b = c4966e;
    }

    /* renamed from: l */
    private void m24554l(int i, int i2) {
        int i3;
        int i4 = this.f14745a;
        if (i4 == 0) {
            this.f14749e.mo24598d(m24559g(i2, i));
        } else if (i4 == 1) {
            this.f14749e.mo24598d(Math.min(m24559g(this.f14749e.f14729m, i), i2));
        } else if (i4 == 2) {
            C4966e m26124I = this.f14746b.m26124I();
            if (m26124I != null) {
                C5333g c5333g = (i == 0 ? m26124I.f13839d : m26124I.f13841e).f14749e;
                if (c5333g.f14726j) {
                    C4966e c4966e = this.f14746b;
                    this.f14749e.mo24598d(m24559g((int) ((c5333g.f14723g * (i == 0 ? c4966e.f13865s : c4966e.f13868v)) + 0.5f), i));
                }
            }
        } else if (i4 != 3) {
        } else {
            C4966e c4966e2 = this.f14746b;
            AbstractC5345p abstractC5345p = c4966e2.f13839d;
            C4966e.EnumC4968b enumC4968b = abstractC5345p.f14748d;
            C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
            if (enumC4968b == enumC4968b2 && abstractC5345p.f14745a == 3) {
                C5341n c5341n = c4966e2.f13841e;
                if (c5341n.f14748d == enumC4968b2 && c5341n.f14745a == 3) {
                    return;
                }
            }
            if (i == 0) {
                abstractC5345p = c4966e2.f13841e;
            }
            if (abstractC5345p.f14749e.f14726j) {
                float m26062t = c4966e2.m26062t();
                if (i == 1) {
                    i3 = (int) ((abstractC5345p.f14749e.f14723g / m26062t) + 0.5f);
                } else {
                    i3 = (int) ((m26062t * abstractC5345p.f14749e.f14723g) + 0.5f);
                }
                this.f14749e.mo24598d(i3);
            }
        }
    }

    @Override // p094f2.InterfaceC5329d
    /* renamed from: a */
    public void mo24565a(InterfaceC5329d interfaceC5329d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m24564b(C5331f c5331f, C5331f c5331f2, int i) {
        c5331f.f14728l.add(c5331f2);
        c5331f.f14722f = i;
        c5331f2.f14727k.add(c5331f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m24563c(C5331f c5331f, C5331f c5331f2, int i, C5333g c5333g) {
        c5331f.f14728l.add(c5331f2);
        c5331f.f14728l.add(this.f14749e);
        c5331f.f14724h = i;
        c5331f.f14725i = c5333g;
        c5331f2.f14727k.add(c5331f);
        c5333g.f14727k.add(c5331f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo24562d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo24561e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo24560f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m24559g(int i, int i2) {
        int max;
        if (i2 == 0) {
            C4966e c4966e = this.f14746b;
            int i3 = c4966e.f13864r;
            max = Math.max(c4966e.f13863q, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C4966e c4966e2 = this.f14746b;
            int i4 = c4966e2.f13867u;
            max = Math.max(c4966e2.f13866t, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C5331f m24558h(C4963d c4963d) {
        C4963d c4963d2 = c4963d.f13801f;
        if (c4963d2 == null) {
            return null;
        }
        C4966e c4966e = c4963d2.f13799d;
        int i = C5346a.f14755a[c4963d2.f13800e.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c4966e.f13841e.f14753i;
                    }
                    return c4966e.f13841e.f14736k;
                }
                return c4966e.f13841e.f14752h;
            }
            return c4966e.f13839d.f14753i;
        }
        return c4966e.f13839d.f14752h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C5331f m24557i(C4963d c4963d, int i) {
        C4963d c4963d2 = c4963d.f13801f;
        if (c4963d2 == null) {
            return null;
        }
        C4966e c4966e = c4963d2.f13799d;
        AbstractC5345p abstractC5345p = i == 0 ? c4966e.f13839d : c4966e.f13841e;
        int i2 = C5346a.f14755a[c4963d2.f13800e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC5345p.f14753i;
        }
        return abstractC5345p.f14752h;
    }

    /* renamed from: j */
    public long mo24556j() {
        C5333g c5333g = this.f14749e;
        if (c5333g.f14726j) {
            return c5333g.f14723g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m24555k() {
        return this.f14751g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo24553m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m24552n(InterfaceC5329d interfaceC5329d, C4963d c4963d, C4963d c4963d2, int i) {
        C5331f m24558h = m24558h(c4963d);
        C5331f m24558h2 = m24558h(c4963d2);
        if (m24558h.f14726j && m24558h2.f14726j) {
            int m26155e = m24558h.f14723g + c4963d.m26155e();
            int m26155e2 = m24558h2.f14723g - c4963d2.m26155e();
            int i2 = m26155e2 - m26155e;
            if (!this.f14749e.f14726j && this.f14748d == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                m24554l(i, i2);
            }
            C5333g c5333g = this.f14749e;
            if (c5333g.f14726j) {
                if (c5333g.f14723g == i2) {
                    this.f14752h.mo24598d(m26155e);
                    this.f14753i.mo24598d(m26155e2);
                    return;
                }
                C4966e c4966e = this.f14746b;
                float m26056w = i == 0 ? c4966e.m26056w() : c4966e.m26116M();
                if (m24558h == m24558h2) {
                    m26155e = m24558h.f14723g;
                    m26155e2 = m24558h2.f14723g;
                    m26056w = 0.5f;
                }
                this.f14752h.mo24598d((int) (m26155e + 0.5f + (((m26155e2 - m26155e) - this.f14749e.f14723g) * m26056w)));
                this.f14753i.mo24598d(this.f14752h.f14723g + this.f14749e.f14723g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m24551o(InterfaceC5329d interfaceC5329d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m24550p(InterfaceC5329d interfaceC5329d) {
    }
}
