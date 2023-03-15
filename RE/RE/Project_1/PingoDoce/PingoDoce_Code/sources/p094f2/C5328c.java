package p094f2;

import java.util.ArrayList;
import java.util.Iterator;
import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.C4969f;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public class C5328c extends AbstractC5345p {

    /* renamed from: k */
    ArrayList<AbstractC5345p> f14707k;

    /* renamed from: l */
    private int f14708l;

    public C5328c(C4966e c4966e, int i) {
        super(c4966e);
        this.f14707k = new ArrayList<>();
        this.f14750f = i;
        m24617q();
    }

    /* renamed from: q */
    private void m24617q() {
        C4966e c4966e;
        C4966e c4966e2 = this.f14746b;
        C4966e m26122J = c4966e2.m26122J(this.f14750f);
        while (true) {
            C4966e c4966e3 = m26122J;
            c4966e = c4966e2;
            c4966e2 = c4966e3;
            if (c4966e2 == null) {
                break;
            }
            m26122J = c4966e2.m26122J(this.f14750f);
        }
        this.f14746b = c4966e;
        this.f14707k.add(c4966e.m26118L(this.f14750f));
        C4966e m26126H = c4966e.m26126H(this.f14750f);
        while (m26126H != null) {
            this.f14707k.add(m26126H.m26118L(this.f14750f));
            m26126H = m26126H.m26126H(this.f14750f);
        }
        Iterator<AbstractC5345p> it = this.f14707k.iterator();
        while (it.hasNext()) {
            AbstractC5345p next = it.next();
            int i = this.f14750f;
            if (i == 0) {
                next.f14746b.f13835b = this;
            } else if (i == 1) {
                next.f14746b.f13837c = this;
            }
        }
        if ((this.f14750f == 0 && ((C4969f) this.f14746b.m26124I()).m26020x1()) && this.f14707k.size() > 1) {
            ArrayList<AbstractC5345p> arrayList = this.f14707k;
            this.f14746b = arrayList.get(arrayList.size() - 1).f14746b;
        }
        this.f14708l = this.f14750f == 0 ? this.f14746b.m26054x() : this.f14746b.m26114N();
    }

    /* renamed from: r */
    private C4966e m24616r() {
        for (int i = 0; i < this.f14707k.size(); i++) {
            AbstractC5345p abstractC5345p = this.f14707k.get(i);
            if (abstractC5345p.f14746b.m26108Q() != 8) {
                return abstractC5345p.f14746b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C4966e m24615s() {
        for (int size = this.f14707k.size() - 1; size >= 0; size--) {
            AbstractC5345p abstractC5345p = this.f14707k.get(size);
            if (abstractC5345p.f14746b.m26108Q() != 8) {
                return abstractC5345p.f14746b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a5, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cd, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d0, code lost:
        r9.f14749e.mo24598d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0418, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // p094f2.AbstractC5345p, p094f2.InterfaceC5329d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo24565a(p094f2.InterfaceC5329d r26) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C5328c.mo24565a(f2.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: d */
    public void mo24562d() {
        Iterator<AbstractC5345p> it = this.f14707k.iterator();
        while (it.hasNext()) {
            it.next().mo24562d();
        }
        int size = this.f14707k.size();
        if (size < 1) {
            return;
        }
        C4966e c4966e = this.f14707k.get(0).f14746b;
        C4966e c4966e2 = this.f14707k.get(size - 1).f14746b;
        if (this.f14750f == 0) {
            C4963d c4963d = c4966e.f13812F;
            C4963d c4963d2 = c4966e2.f13814H;
            C5331f m24557i = m24557i(c4963d, 0);
            int m26155e = c4963d.m26155e();
            C4966e m24616r = m24616r();
            if (m24616r != null) {
                m26155e = m24616r.f13812F.m26155e();
            }
            if (m24557i != null) {
                m24564b(this.f14752h, m24557i, m26155e);
            }
            C5331f m24557i2 = m24557i(c4963d2, 0);
            int m26155e2 = c4963d2.m26155e();
            C4966e m24615s = m24615s();
            if (m24615s != null) {
                m26155e2 = m24615s.f13814H.m26155e();
            }
            if (m24557i2 != null) {
                m24564b(this.f14753i, m24557i2, -m26155e2);
            }
        } else {
            C4963d c4963d3 = c4966e.f13813G;
            C4963d c4963d4 = c4966e2.f13815I;
            C5331f m24557i3 = m24557i(c4963d3, 1);
            int m26155e3 = c4963d3.m26155e();
            C4966e m24616r2 = m24616r();
            if (m24616r2 != null) {
                m26155e3 = m24616r2.f13813G.m26155e();
            }
            if (m24557i3 != null) {
                m24564b(this.f14752h, m24557i3, m26155e3);
            }
            C5331f m24557i4 = m24557i(c4963d4, 1);
            int m26155e4 = c4963d4.m26155e();
            C4966e m24615s2 = m24615s();
            if (m24615s2 != null) {
                m26155e4 = m24615s2.f13815I.m26155e();
            }
            if (m24557i4 != null) {
                m24564b(this.f14753i, m24557i4, -m26155e4);
            }
        }
        this.f14752h.f14717a = this;
        this.f14753i.f14717a = this;
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: e */
    public void mo24561e() {
        for (int i = 0; i < this.f14707k.size(); i++) {
            this.f14707k.get(i).mo24561e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: f */
    public void mo24560f() {
        this.f14747c = null;
        Iterator<AbstractC5345p> it = this.f14707k.iterator();
        while (it.hasNext()) {
            it.next().mo24560f();
        }
    }

    @Override // p094f2.AbstractC5345p
    /* renamed from: j */
    public long mo24556j() {
        int size = this.f14707k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC5345p abstractC5345p = this.f14707k.get(i);
            j = j + abstractC5345p.f14752h.f14722f + abstractC5345p.mo24556j() + abstractC5345p.f14753i.f14722f;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p094f2.AbstractC5345p
    /* renamed from: m */
    public boolean mo24553m() {
        int size = this.f14707k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f14707k.get(i).mo24553m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        Iterator<AbstractC5345p> it;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f14750f == 0 ? "horizontal : " : "vertical : ");
        String sb3 = sb2.toString();
        while (this.f14707k.iterator().hasNext()) {
            sb3 = ((sb3 + "<") + it.next()) + "> ";
        }
        return sb3;
    }
}
