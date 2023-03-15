package p094f2;

import p073e2.C4960a;
import p073e2.C4966e;
import p094f2.C5331f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f2.k */
/* loaded from: classes.dex */
public class C5337k extends AbstractC5345p {
    public C5337k(C4966e c4966e) {
        super(c4966e);
    }

    /* renamed from: q */
    private void m24583q(C5331f c5331f) {
        this.f14752h.f14727k.add(c5331f);
        c5331f.f14728l.add(this.f14752h);
    }

    @Override // p094f2.AbstractC5345p, p094f2.InterfaceC5329d
    /* renamed from: a */
    public void mo24565a(InterfaceC5329d interfaceC5329d) {
        C4960a c4960a = (C4960a) this.f14746b;
        int m26171e1 = c4960a.m26171e1();
        int i = 0;
        int i2 = -1;
        for (C5331f c5331f : this.f14752h.f14728l) {
            int i3 = c5331f.f14723g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m26171e1 != 0 && m26171e1 != 2) {
            this.f14752h.mo24598d(i + c4960a.m26170f1());
        } else {
            this.f14752h.mo24598d(i2 + c4960a.m26170f1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: d */
    public void mo24562d() {
        C4966e c4966e = this.f14746b;
        if (c4966e instanceof C4960a) {
            this.f14752h.f14718b = true;
            C4960a c4960a = (C4960a) c4966e;
            int m26171e1 = c4960a.m26171e1();
            boolean m26172d1 = c4960a.m26172d1();
            int i = 0;
            if (m26171e1 == 0) {
                this.f14752h.f14721e = C5331f.EnumC5332a.LEFT;
                while (i < c4960a.f13902q0) {
                    C4966e c4966e2 = c4960a.f13901p0[i];
                    if (m26172d1 || c4966e2.m26108Q() != 8) {
                        C5331f c5331f = c4966e2.f13839d.f14752h;
                        c5331f.f14727k.add(this.f14752h);
                        this.f14752h.f14728l.add(c5331f);
                    }
                    i++;
                }
                m24583q(this.f14746b.f13839d.f14752h);
                m24583q(this.f14746b.f13839d.f14753i);
            } else if (m26171e1 == 1) {
                this.f14752h.f14721e = C5331f.EnumC5332a.RIGHT;
                while (i < c4960a.f13902q0) {
                    C4966e c4966e3 = c4960a.f13901p0[i];
                    if (m26172d1 || c4966e3.m26108Q() != 8) {
                        C5331f c5331f2 = c4966e3.f13839d.f14753i;
                        c5331f2.f14727k.add(this.f14752h);
                        this.f14752h.f14728l.add(c5331f2);
                    }
                    i++;
                }
                m24583q(this.f14746b.f13839d.f14752h);
                m24583q(this.f14746b.f13839d.f14753i);
            } else if (m26171e1 == 2) {
                this.f14752h.f14721e = C5331f.EnumC5332a.TOP;
                while (i < c4960a.f13902q0) {
                    C4966e c4966e4 = c4960a.f13901p0[i];
                    if (m26172d1 || c4966e4.m26108Q() != 8) {
                        C5331f c5331f3 = c4966e4.f13841e.f14752h;
                        c5331f3.f14727k.add(this.f14752h);
                        this.f14752h.f14728l.add(c5331f3);
                    }
                    i++;
                }
                m24583q(this.f14746b.f13841e.f14752h);
                m24583q(this.f14746b.f13841e.f14753i);
            } else if (m26171e1 != 3) {
            } else {
                this.f14752h.f14721e = C5331f.EnumC5332a.BOTTOM;
                while (i < c4960a.f13902q0) {
                    C4966e c4966e5 = c4960a.f13901p0[i];
                    if (m26172d1 || c4966e5.m26108Q() != 8) {
                        C5331f c5331f4 = c4966e5.f13841e.f14753i;
                        c5331f4.f14727k.add(this.f14752h);
                        this.f14752h.f14728l.add(c5331f4);
                    }
                    i++;
                }
                m24583q(this.f14746b.f13841e.f14752h);
                m24583q(this.f14746b.f13841e.f14753i);
            }
        }
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: e */
    public void mo24561e() {
        C4966e c4966e = this.f14746b;
        if (c4966e instanceof C4960a) {
            int m26171e1 = ((C4960a) c4966e).m26171e1();
            if (m26171e1 != 0 && m26171e1 != 1) {
                this.f14746b.m26095W0(this.f14752h.f14723g);
            } else {
                this.f14746b.m26097V0(this.f14752h.f14723g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: f */
    public void mo24560f() {
        this.f14747c = null;
        this.f14752h.m24599c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: m */
    public boolean mo24553m() {
        return false;
    }
}
