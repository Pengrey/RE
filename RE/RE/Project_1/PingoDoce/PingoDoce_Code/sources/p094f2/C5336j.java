package p094f2;

import p073e2.C4966e;
import p073e2.C4970g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f2.j */
/* loaded from: classes.dex */
public class C5336j extends AbstractC5345p {
    public C5336j(C4966e c4966e) {
        super(c4966e);
        c4966e.f13839d.mo24560f();
        c4966e.f13841e.mo24560f();
        this.f14750f = ((C4970g) c4966e).m26015b1();
    }

    /* renamed from: q */
    private void m24584q(C5331f c5331f) {
        this.f14752h.f14727k.add(c5331f);
        c5331f.f14728l.add(this.f14752h);
    }

    @Override // p094f2.AbstractC5345p, p094f2.InterfaceC5329d
    /* renamed from: a */
    public void mo24565a(InterfaceC5329d interfaceC5329d) {
        C5331f c5331f = this.f14752h;
        if (c5331f.f14719c && !c5331f.f14726j) {
            this.f14752h.mo24598d((int) ((c5331f.f14728l.get(0).f14723g * ((C4970g) this.f14746b).m26011e1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: d */
    public void mo24562d() {
        C4970g c4970g = (C4970g) this.f14746b;
        int m26014c1 = c4970g.m26014c1();
        int m26013d1 = c4970g.m26013d1();
        c4970g.m26011e1();
        if (c4970g.m26015b1() == 1) {
            if (m26014c1 != -1) {
                this.f14752h.f14728l.add(this.f14746b.f13824R.f13839d.f14752h);
                this.f14746b.f13824R.f13839d.f14752h.f14727k.add(this.f14752h);
                this.f14752h.f14722f = m26014c1;
            } else if (m26013d1 != -1) {
                this.f14752h.f14728l.add(this.f14746b.f13824R.f13839d.f14753i);
                this.f14746b.f13824R.f13839d.f14753i.f14727k.add(this.f14752h);
                this.f14752h.f14722f = -m26013d1;
            } else {
                C5331f c5331f = this.f14752h;
                c5331f.f14718b = true;
                c5331f.f14728l.add(this.f14746b.f13824R.f13839d.f14753i);
                this.f14746b.f13824R.f13839d.f14753i.f14727k.add(this.f14752h);
            }
            m24584q(this.f14746b.f13839d.f14752h);
            m24584q(this.f14746b.f13839d.f14753i);
            return;
        }
        if (m26014c1 != -1) {
            this.f14752h.f14728l.add(this.f14746b.f13824R.f13841e.f14752h);
            this.f14746b.f13824R.f13841e.f14752h.f14727k.add(this.f14752h);
            this.f14752h.f14722f = m26014c1;
        } else if (m26013d1 != -1) {
            this.f14752h.f14728l.add(this.f14746b.f13824R.f13841e.f14753i);
            this.f14746b.f13824R.f13841e.f14753i.f14727k.add(this.f14752h);
            this.f14752h.f14722f = -m26013d1;
        } else {
            C5331f c5331f2 = this.f14752h;
            c5331f2.f14718b = true;
            c5331f2.f14728l.add(this.f14746b.f13824R.f13841e.f14753i);
            this.f14746b.f13824R.f13841e.f14753i.f14727k.add(this.f14752h);
        }
        m24584q(this.f14746b.f13841e.f14752h);
        m24584q(this.f14746b.f13841e.f14753i);
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: e */
    public void mo24561e() {
        if (((C4970g) this.f14746b).m26015b1() == 1) {
            this.f14746b.m26097V0(this.f14752h.f14723g);
        } else {
            this.f14746b.m26095W0(this.f14752h.f14723g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: f */
    public void mo24560f() {
        this.f14752h.m24599c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: m */
    public boolean mo24553m() {
        return false;
    }
}
