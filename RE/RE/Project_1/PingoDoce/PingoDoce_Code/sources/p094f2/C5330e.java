package p094f2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.C4969f;
import p073e2.C4970g;
import p073e2.C4973i;
import p094f2.C5325b;

/* renamed from: f2.e */
/* loaded from: classes.dex */
public class C5330e {

    /* renamed from: a */
    private C4969f f14709a;

    /* renamed from: d */
    private C4969f f14712d;

    /* renamed from: f */
    private C5325b.InterfaceC5327b f14714f;

    /* renamed from: g */
    private C5325b.C5326a f14715g;

    /* renamed from: h */
    ArrayList<C5340m> f14716h;

    /* renamed from: b */
    private boolean f14710b = true;

    /* renamed from: c */
    private boolean f14711c = true;

    /* renamed from: e */
    private ArrayList<AbstractC5345p> f14713e = new ArrayList<>();

    public C5330e(C4969f c4969f) {
        new ArrayList();
        this.f14714f = null;
        this.f14715g = new C5325b.C5326a();
        this.f14716h = new ArrayList<>();
        this.f14709a = c4969f;
        this.f14712d = c4969f;
    }

    /* renamed from: a */
    private void m24614a(C5331f c5331f, int i, int i2, C5331f c5331f2, ArrayList<C5340m> arrayList, C5340m c5340m) {
        AbstractC5345p abstractC5345p = c5331f.f14720d;
        if (abstractC5345p.f14747c == null) {
            C4969f c4969f = this.f14709a;
            if (abstractC5345p == c4969f.f13839d || abstractC5345p == c4969f.f13841e) {
                return;
            }
            if (c5340m == null) {
                c5340m = new C5340m(abstractC5345p, i2);
                arrayList.add(c5340m);
            }
            abstractC5345p.f14747c = c5340m;
            c5340m.m24580a(abstractC5345p);
            for (InterfaceC5329d interfaceC5329d : abstractC5345p.f14752h.f14727k) {
                if (interfaceC5329d instanceof C5331f) {
                    m24614a((C5331f) interfaceC5329d, i, 0, c5331f2, arrayList, c5340m);
                }
            }
            for (InterfaceC5329d interfaceC5329d2 : abstractC5345p.f14753i.f14727k) {
                if (interfaceC5329d2 instanceof C5331f) {
                    m24614a((C5331f) interfaceC5329d2, i, 1, c5331f2, arrayList, c5340m);
                }
            }
            if (i == 1 && (abstractC5345p instanceof C5341n)) {
                for (InterfaceC5329d interfaceC5329d3 : ((C5341n) abstractC5345p).f14736k.f14727k) {
                    if (interfaceC5329d3 instanceof C5331f) {
                        m24614a((C5331f) interfaceC5329d3, i, 2, c5331f2, arrayList, c5340m);
                    }
                }
            }
            for (C5331f c5331f3 : abstractC5345p.f14752h.f14728l) {
                m24614a(c5331f3, i, 0, c5331f2, arrayList, c5340m);
            }
            for (C5331f c5331f4 : abstractC5345p.f14753i.f14728l) {
                m24614a(c5331f4, i, 1, c5331f2, arrayList, c5340m);
            }
            if (i == 1 && (abstractC5345p instanceof C5341n)) {
                for (C5331f c5331f5 : ((C5341n) abstractC5345p).f14736k.f14728l) {
                    m24614a(c5331f5, i, 2, c5331f2, arrayList, c5340m);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m24613b(C4969f c4969f) {
        int i;
        C4966e.EnumC4968b enumC4968b;
        int i2;
        C4966e.EnumC4968b enumC4968b2;
        C4966e.EnumC4968b enumC4968b3;
        C4966e.EnumC4968b enumC4968b4;
        Iterator<C4966e> it = c4969f.f13905p0.iterator();
        while (it.hasNext()) {
            C4966e next = it.next();
            C4966e.EnumC4968b[] enumC4968bArr = next.f13823Q;
            C4966e.EnumC4968b enumC4968b5 = enumC4968bArr[0];
            C4966e.EnumC4968b enumC4968b6 = enumC4968bArr[1];
            if (next.m26108Q() == 8) {
                next.f13833a = true;
            } else {
                if (next.f13865s < 1.0f && enumC4968b5 == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                    next.f13859n = 2;
                }
                if (next.f13868v < 1.0f && enumC4968b6 == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                    next.f13861o = 2;
                }
                if (next.m26062t() > 0.0f) {
                    C4966e.EnumC4968b enumC4968b7 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                    if (enumC4968b5 == enumC4968b7 && (enumC4968b6 == C4966e.EnumC4968b.WRAP_CONTENT || enumC4968b6 == C4966e.EnumC4968b.FIXED)) {
                        next.f13859n = 3;
                    } else if (enumC4968b6 == enumC4968b7 && (enumC4968b5 == C4966e.EnumC4968b.WRAP_CONTENT || enumC4968b5 == C4966e.EnumC4968b.FIXED)) {
                        next.f13861o = 3;
                    } else if (enumC4968b5 == enumC4968b7 && enumC4968b6 == enumC4968b7) {
                        if (next.f13859n == 0) {
                            next.f13859n = 3;
                        }
                        if (next.f13861o == 0) {
                            next.f13861o = 3;
                        }
                    }
                }
                C4966e.EnumC4968b enumC4968b8 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (enumC4968b5 == enumC4968b8 && next.f13859n == 1 && (next.f13812F.f13801f == null || next.f13814H.f13801f == null)) {
                    enumC4968b5 = C4966e.EnumC4968b.WRAP_CONTENT;
                }
                C4966e.EnumC4968b enumC4968b9 = enumC4968b5;
                if (enumC4968b6 == enumC4968b8 && next.f13861o == 1 && (next.f13813G.f13801f == null || next.f13815I.f13801f == null)) {
                    enumC4968b6 = C4966e.EnumC4968b.WRAP_CONTENT;
                }
                C4966e.EnumC4968b enumC4968b10 = enumC4968b6;
                C5338l c5338l = next.f13839d;
                c5338l.f14748d = enumC4968b9;
                int i3 = next.f13859n;
                c5338l.f14745a = i3;
                C5341n c5341n = next.f13841e;
                c5341n.f14748d = enumC4968b10;
                int i4 = next.f13861o;
                c5341n.f14745a = i4;
                C4966e.EnumC4968b enumC4968b11 = C4966e.EnumC4968b.MATCH_PARENT;
                if ((enumC4968b9 == enumC4968b11 || enumC4968b9 == C4966e.EnumC4968b.FIXED || enumC4968b9 == C4966e.EnumC4968b.WRAP_CONTENT) && (enumC4968b10 == enumC4968b11 || enumC4968b10 == C4966e.EnumC4968b.FIXED || enumC4968b10 == C4966e.EnumC4968b.WRAP_CONTENT)) {
                    int m26106R = next.m26106R();
                    if (enumC4968b9 == enumC4968b11) {
                        i = (c4969f.m26106R() - next.f13812F.f13802g) - next.f13814H.f13802g;
                        enumC4968b = C4966e.EnumC4968b.FIXED;
                    } else {
                        i = m26106R;
                        enumC4968b = enumC4968b9;
                    }
                    int m26058v = next.m26058v();
                    if (enumC4968b10 == enumC4968b11) {
                        i2 = (c4969f.m26058v() - next.f13813G.f13802g) - next.f13815I.f13802g;
                        enumC4968b2 = C4966e.EnumC4968b.FIXED;
                    } else {
                        i2 = m26058v;
                        enumC4968b2 = enumC4968b10;
                    }
                    m24603l(next, enumC4968b, i, enumC4968b2, i2);
                    next.f13839d.f14749e.mo24598d(next.m26106R());
                    next.f13841e.f14749e.mo24598d(next.m26058v());
                    next.f13833a = true;
                } else {
                    if (enumC4968b9 == enumC4968b8 && (enumC4968b10 == (enumC4968b4 = C4966e.EnumC4968b.WRAP_CONTENT) || enumC4968b10 == C4966e.EnumC4968b.FIXED)) {
                        if (i3 == 3) {
                            if (enumC4968b10 == enumC4968b4) {
                                m24603l(next, enumC4968b4, 0, enumC4968b4, 0);
                            }
                            int m26058v2 = next.m26058v();
                            C4966e.EnumC4968b enumC4968b12 = C4966e.EnumC4968b.FIXED;
                            m24603l(next, enumC4968b12, (int) ((m26058v2 * next.f13827U) + 0.5f), enumC4968b12, m26058v2);
                            next.f13839d.f14749e.mo24598d(next.m26106R());
                            next.f13841e.f14749e.mo24598d(next.m26058v());
                            next.f13833a = true;
                        } else if (i3 == 1) {
                            m24603l(next, enumC4968b4, 0, enumC4968b10, 0);
                            next.f13839d.f14749e.f14729m = next.m26106R();
                        } else if (i3 == 2) {
                            C4966e.EnumC4968b[] enumC4968bArr2 = c4969f.f13823Q;
                            C4966e.EnumC4968b enumC4968b13 = enumC4968bArr2[0];
                            C4966e.EnumC4968b enumC4968b14 = C4966e.EnumC4968b.FIXED;
                            if (enumC4968b13 == enumC4968b14 || enumC4968bArr2[0] == enumC4968b11) {
                                m24603l(next, enumC4968b14, (int) ((next.f13865s * c4969f.m26106R()) + 0.5f), enumC4968b10, next.m26058v());
                                next.f13839d.f14749e.mo24598d(next.m26106R());
                                next.f13841e.f14749e.mo24598d(next.m26058v());
                                next.f13833a = true;
                            }
                        } else {
                            C4963d[] c4963dArr = next.f13820N;
                            if (c4963dArr[0].f13801f == null || c4963dArr[1].f13801f == null) {
                                m24603l(next, enumC4968b4, 0, enumC4968b10, 0);
                                next.f13839d.f14749e.mo24598d(next.m26106R());
                                next.f13841e.f14749e.mo24598d(next.m26058v());
                                next.f13833a = true;
                            }
                        }
                    }
                    if (enumC4968b10 == enumC4968b8 && (enumC4968b9 == (enumC4968b3 = C4966e.EnumC4968b.WRAP_CONTENT) || enumC4968b9 == C4966e.EnumC4968b.FIXED)) {
                        if (i4 == 3) {
                            if (enumC4968b9 == enumC4968b3) {
                                m24603l(next, enumC4968b3, 0, enumC4968b3, 0);
                            }
                            int m26106R2 = next.m26106R();
                            float f = next.f13827U;
                            if (next.m26060u() == -1) {
                                f = 1.0f / f;
                            }
                            C4966e.EnumC4968b enumC4968b15 = C4966e.EnumC4968b.FIXED;
                            m24603l(next, enumC4968b15, m26106R2, enumC4968b15, (int) ((m26106R2 * f) + 0.5f));
                            next.f13839d.f14749e.mo24598d(next.m26106R());
                            next.f13841e.f14749e.mo24598d(next.m26058v());
                            next.f13833a = true;
                        } else if (i4 == 1) {
                            m24603l(next, enumC4968b9, 0, enumC4968b3, 0);
                            next.f13841e.f14749e.f14729m = next.m26058v();
                        } else if (i4 == 2) {
                            C4966e.EnumC4968b[] enumC4968bArr3 = c4969f.f13823Q;
                            C4966e.EnumC4968b enumC4968b16 = enumC4968bArr3[1];
                            C4966e.EnumC4968b enumC4968b17 = C4966e.EnumC4968b.FIXED;
                            if (enumC4968b16 == enumC4968b17 || enumC4968bArr3[1] == enumC4968b11) {
                                m24603l(next, enumC4968b9, next.m26106R(), enumC4968b17, (int) ((next.f13868v * c4969f.m26058v()) + 0.5f));
                                next.f13839d.f14749e.mo24598d(next.m26106R());
                                next.f13841e.f14749e.mo24598d(next.m26058v());
                                next.f13833a = true;
                            }
                        } else {
                            C4963d[] c4963dArr2 = next.f13820N;
                            if (c4963dArr2[2].f13801f == null || c4963dArr2[3].f13801f == null) {
                                m24603l(next, enumC4968b3, 0, enumC4968b10, 0);
                                next.f13839d.f14749e.mo24598d(next.m26106R());
                                next.f13841e.f14749e.mo24598d(next.m26058v());
                                next.f13833a = true;
                            }
                        }
                    }
                    if (enumC4968b9 == enumC4968b8 && enumC4968b10 == enumC4968b8) {
                        if (i3 == 1 || i4 == 1) {
                            C4966e.EnumC4968b enumC4968b18 = C4966e.EnumC4968b.WRAP_CONTENT;
                            m24603l(next, enumC4968b18, 0, enumC4968b18, 0);
                            next.f13839d.f14749e.f14729m = next.m26106R();
                            next.f13841e.f14749e.f14729m = next.m26058v();
                        } else if (i4 == 2 && i3 == 2) {
                            C4966e.EnumC4968b[] enumC4968bArr4 = c4969f.f13823Q;
                            C4966e.EnumC4968b enumC4968b19 = enumC4968bArr4[0];
                            C4966e.EnumC4968b enumC4968b20 = C4966e.EnumC4968b.FIXED;
                            if (enumC4968b19 == enumC4968b20 || enumC4968bArr4[0] == enumC4968b20) {
                                if (enumC4968bArr4[1] == enumC4968b20 || enumC4968bArr4[1] == enumC4968b20) {
                                    m24603l(next, enumC4968b20, (int) ((next.f13865s * c4969f.m26106R()) + 0.5f), enumC4968b20, (int) ((next.f13868v * c4969f.m26058v()) + 0.5f));
                                    next.f13839d.f14749e.mo24598d(next.m26106R());
                                    next.f13841e.f14749e.mo24598d(next.m26058v());
                                    next.f13833a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m24610e(C4969f c4969f, int i) {
        int size = this.f14716h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f14716h.get(i2).m24579b(c4969f, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m24606i(AbstractC5345p abstractC5345p, int i, ArrayList<C5340m> arrayList) {
        for (InterfaceC5329d interfaceC5329d : abstractC5345p.f14752h.f14727k) {
            if (interfaceC5329d instanceof C5331f) {
                m24614a((C5331f) interfaceC5329d, i, 0, abstractC5345p.f14753i, arrayList, null);
            } else if (interfaceC5329d instanceof AbstractC5345p) {
                m24614a(((AbstractC5345p) interfaceC5329d).f14752h, i, 0, abstractC5345p.f14753i, arrayList, null);
            }
        }
        for (InterfaceC5329d interfaceC5329d2 : abstractC5345p.f14753i.f14727k) {
            if (interfaceC5329d2 instanceof C5331f) {
                m24614a((C5331f) interfaceC5329d2, i, 1, abstractC5345p.f14752h, arrayList, null);
            } else if (interfaceC5329d2 instanceof AbstractC5345p) {
                m24614a(((AbstractC5345p) interfaceC5329d2).f14753i, i, 1, abstractC5345p.f14752h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC5329d interfaceC5329d3 : ((C5341n) abstractC5345p).f14736k.f14727k) {
                if (interfaceC5329d3 instanceof C5331f) {
                    m24614a((C5331f) interfaceC5329d3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m24603l(C4966e c4966e, C4966e.EnumC4968b enumC4968b, int i, C4966e.EnumC4968b enumC4968b2, int i2) {
        C5325b.C5326a c5326a = this.f14715g;
        c5326a.f14697a = enumC4968b;
        c5326a.f14698b = enumC4968b2;
        c5326a.f14699c = i;
        c5326a.f14700d = i2;
        this.f14714f.mo24618b(c4966e, c5326a);
        c4966e.m26099U0(this.f14715g.f14701e);
        c4966e.m26057v0(this.f14715g.f14702f);
        c4966e.m26059u0(this.f14715g.f14704h);
        c4966e.m26078k0(this.f14715g.f14703g);
    }

    /* renamed from: c */
    public void m24612c() {
        m24611d(this.f14713e);
        this.f14716h.clear();
        C5340m.f14733c = 0;
        m24606i(this.f14709a.f13839d, 0, this.f14716h);
        m24606i(this.f14709a.f13841e, 1, this.f14716h);
        this.f14710b = false;
    }

    /* renamed from: d */
    public void m24611d(ArrayList<AbstractC5345p> arrayList) {
        arrayList.clear();
        this.f14712d.f13839d.mo24560f();
        this.f14712d.f13841e.mo24560f();
        arrayList.add(this.f14712d.f13839d);
        arrayList.add(this.f14712d.f13841e);
        Iterator<C4966e> it = this.f14712d.f13905p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C4966e next = it.next();
            if (next instanceof C4970g) {
                arrayList.add(new C5336j(next));
            } else {
                if (next.m26091Z()) {
                    if (next.f13835b == null) {
                        next.f13835b = new C5328c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f13835b);
                } else {
                    arrayList.add(next.f13839d);
                }
                if (next.m26089b0()) {
                    if (next.f13837c == null) {
                        next.f13837c = new C5328c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f13837c);
                } else {
                    arrayList.add(next.f13841e);
                }
                if (next instanceof C4973i) {
                    arrayList.add(new C5337k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC5345p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo24560f();
        }
        Iterator<AbstractC5345p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC5345p next2 = it3.next();
            if (next2.f14746b != this.f14712d) {
                next2.mo24562d();
            }
        }
    }

    /* renamed from: f */
    public boolean m24609f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f14710b || this.f14711c) {
            Iterator<C4966e> it = this.f14709a.f13905p0.iterator();
            while (it.hasNext()) {
                C4966e next = it.next();
                next.m26077l();
                next.f13833a = false;
                next.f13839d.m24581r();
                next.f13841e.m24576q();
            }
            this.f14709a.m26077l();
            C4969f c4969f = this.f14709a;
            c4969f.f13833a = false;
            c4969f.f13839d.m24581r();
            this.f14709a.f13841e.m24576q();
            this.f14711c = false;
        }
        if (m24613b(this.f14712d)) {
            return false;
        }
        this.f14709a.m26097V0(0);
        this.f14709a.m26095W0(0);
        C4966e.EnumC4968b m26064s = this.f14709a.m26064s(0);
        C4966e.EnumC4968b m26064s2 = this.f14709a.m26064s(1);
        if (this.f14710b) {
            m24612c();
        }
        int m26104S = this.f14709a.m26104S();
        int m26102T = this.f14709a.m26102T();
        this.f14709a.f13839d.f14752h.mo24598d(m26104S);
        this.f14709a.f13841e.f14752h.mo24598d(m26102T);
        m24602m();
        C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.WRAP_CONTENT;
        if (m26064s == enumC4968b || m26064s2 == enumC4968b) {
            if (z4) {
                Iterator<AbstractC5345p> it2 = this.f14713e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().mo24553m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m26064s == C4966e.EnumC4968b.WRAP_CONTENT) {
                this.f14709a.m26049z0(C4966e.EnumC4968b.FIXED);
                C4969f c4969f2 = this.f14709a;
                c4969f2.m26099U0(m24610e(c4969f2, 0));
                C4969f c4969f3 = this.f14709a;
                c4969f3.f13839d.f14749e.mo24598d(c4969f3.m26106R());
            }
            if (z4 && m26064s2 == C4966e.EnumC4968b.WRAP_CONTENT) {
                this.f14709a.m26107Q0(C4966e.EnumC4968b.FIXED);
                C4969f c4969f4 = this.f14709a;
                c4969f4.m26057v0(m24610e(c4969f4, 1));
                C4969f c4969f5 = this.f14709a;
                c4969f5.f13841e.f14749e.mo24598d(c4969f5.m26058v());
            }
        }
        C4969f c4969f6 = this.f14709a;
        C4966e.EnumC4968b[] enumC4968bArr = c4969f6.f13823Q;
        C4966e.EnumC4968b enumC4968b2 = enumC4968bArr[0];
        C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.FIXED;
        if (enumC4968b2 == enumC4968b3 || enumC4968bArr[0] == C4966e.EnumC4968b.MATCH_PARENT) {
            int m26106R = c4969f6.m26106R() + m26104S;
            this.f14709a.f13839d.f14753i.mo24598d(m26106R);
            this.f14709a.f13839d.f14749e.mo24598d(m26106R - m26104S);
            m24602m();
            C4969f c4969f7 = this.f14709a;
            C4966e.EnumC4968b[] enumC4968bArr2 = c4969f7.f13823Q;
            if (enumC4968bArr2[1] == enumC4968b3 || enumC4968bArr2[1] == C4966e.EnumC4968b.MATCH_PARENT) {
                int m26058v = c4969f7.m26058v() + m26102T;
                this.f14709a.f13841e.f14753i.mo24598d(m26058v);
                this.f14709a.f13841e.f14749e.mo24598d(m26058v - m26102T);
            }
            m24602m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<AbstractC5345p> it3 = this.f14713e.iterator();
        while (it3.hasNext()) {
            AbstractC5345p next2 = it3.next();
            if (next2.f14746b != this.f14709a || next2.f14751g) {
                next2.mo24561e();
            }
        }
        Iterator<AbstractC5345p> it4 = this.f14713e.iterator();
        while (it4.hasNext()) {
            AbstractC5345p next3 = it4.next();
            if (z2 || next3.f14746b != this.f14709a) {
                if (!next3.f14752h.f14726j || ((!next3.f14753i.f14726j && !(next3 instanceof C5336j)) || (!next3.f14749e.f14726j && !(next3 instanceof C5328c) && !(next3 instanceof C5336j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f14709a.m26049z0(m26064s);
        this.f14709a.m26107Q0(m26064s2);
        return z3;
    }

    /* renamed from: g */
    public boolean m24608g(boolean z) {
        if (this.f14710b) {
            Iterator<C4966e> it = this.f14709a.f13905p0.iterator();
            while (it.hasNext()) {
                C4966e next = it.next();
                next.m26077l();
                next.f13833a = false;
                C5338l c5338l = next.f13839d;
                c5338l.f14749e.f14726j = false;
                c5338l.f14751g = false;
                c5338l.m24581r();
                C5341n c5341n = next.f13841e;
                c5341n.f14749e.f14726j = false;
                c5341n.f14751g = false;
                c5341n.m24576q();
            }
            this.f14709a.m26077l();
            C4969f c4969f = this.f14709a;
            c4969f.f13833a = false;
            C5338l c5338l2 = c4969f.f13839d;
            c5338l2.f14749e.f14726j = false;
            c5338l2.f14751g = false;
            c5338l2.m24581r();
            C5341n c5341n2 = this.f14709a.f13841e;
            c5341n2.f14749e.f14726j = false;
            c5341n2.f14751g = false;
            c5341n2.m24576q();
            m24612c();
        }
        if (m24613b(this.f14712d)) {
            return false;
        }
        this.f14709a.m26097V0(0);
        this.f14709a.m26095W0(0);
        this.f14709a.f13839d.f14752h.mo24598d(0);
        this.f14709a.f13841e.f14752h.mo24598d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m24607h(boolean z, int i) {
        boolean z2;
        C4966e.EnumC4968b enumC4968b;
        boolean z3 = true;
        boolean z4 = z & true;
        C4966e.EnumC4968b m26064s = this.f14709a.m26064s(0);
        C4966e.EnumC4968b m26064s2 = this.f14709a.m26064s(1);
        int m26104S = this.f14709a.m26104S();
        int m26102T = this.f14709a.m26102T();
        if (z4 && (m26064s == (enumC4968b = C4966e.EnumC4968b.WRAP_CONTENT) || m26064s2 == enumC4968b)) {
            Iterator<AbstractC5345p> it = this.f14713e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC5345p next = it.next();
                if (next.f14750f == i && !next.mo24553m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m26064s == C4966e.EnumC4968b.WRAP_CONTENT) {
                    this.f14709a.m26049z0(C4966e.EnumC4968b.FIXED);
                    C4969f c4969f = this.f14709a;
                    c4969f.m26099U0(m24610e(c4969f, 0));
                    C4969f c4969f2 = this.f14709a;
                    c4969f2.f13839d.f14749e.mo24598d(c4969f2.m26106R());
                }
            } else if (z4 && m26064s2 == C4966e.EnumC4968b.WRAP_CONTENT) {
                this.f14709a.m26107Q0(C4966e.EnumC4968b.FIXED);
                C4969f c4969f3 = this.f14709a;
                c4969f3.m26057v0(m24610e(c4969f3, 1));
                C4969f c4969f4 = this.f14709a;
                c4969f4.f13841e.f14749e.mo24598d(c4969f4.m26058v());
            }
        }
        if (i == 0) {
            C4969f c4969f5 = this.f14709a;
            C4966e.EnumC4968b[] enumC4968bArr = c4969f5.f13823Q;
            if (enumC4968bArr[0] == C4966e.EnumC4968b.FIXED || enumC4968bArr[0] == C4966e.EnumC4968b.MATCH_PARENT) {
                int m26106R = c4969f5.m26106R() + m26104S;
                this.f14709a.f13839d.f14753i.mo24598d(m26106R);
                this.f14709a.f13839d.f14749e.mo24598d(m26106R - m26104S);
                z2 = true;
            }
            z2 = false;
        } else {
            C4969f c4969f6 = this.f14709a;
            C4966e.EnumC4968b[] enumC4968bArr2 = c4969f6.f13823Q;
            if (enumC4968bArr2[1] == C4966e.EnumC4968b.FIXED || enumC4968bArr2[1] == C4966e.EnumC4968b.MATCH_PARENT) {
                int m26058v = c4969f6.m26058v() + m26102T;
                this.f14709a.f13841e.f14753i.mo24598d(m26058v);
                this.f14709a.f13841e.f14749e.mo24598d(m26058v - m26102T);
                z2 = true;
            }
            z2 = false;
        }
        m24602m();
        Iterator<AbstractC5345p> it2 = this.f14713e.iterator();
        while (it2.hasNext()) {
            AbstractC5345p next2 = it2.next();
            if (next2.f14750f == i && (next2.f14746b != this.f14709a || next2.f14751g)) {
                next2.mo24561e();
            }
        }
        Iterator<AbstractC5345p> it3 = this.f14713e.iterator();
        while (it3.hasNext()) {
            AbstractC5345p next3 = it3.next();
            if (next3.f14750f == i && (z2 || next3.f14746b != this.f14709a)) {
                if (!next3.f14752h.f14726j || !next3.f14753i.f14726j || (!(next3 instanceof C5328c) && !next3.f14749e.f14726j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f14709a.m26049z0(m26064s);
        this.f14709a.m26107Q0(m26064s2);
        return z3;
    }

    /* renamed from: j */
    public void m24605j() {
        this.f14710b = true;
    }

    /* renamed from: k */
    public void m24604k() {
        this.f14711c = true;
    }

    /* renamed from: m */
    public void m24602m() {
        C5333g c5333g;
        Iterator<C4966e> it = this.f14709a.f13905p0.iterator();
        while (it.hasNext()) {
            C4966e next = it.next();
            if (!next.f13833a) {
                C4966e.EnumC4968b[] enumC4968bArr = next.f13823Q;
                boolean z = false;
                C4966e.EnumC4968b enumC4968b = enumC4968bArr[0];
                C4966e.EnumC4968b enumC4968b2 = enumC4968bArr[1];
                int i = next.f13859n;
                int i2 = next.f13861o;
                C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.WRAP_CONTENT;
                boolean z2 = enumC4968b == enumC4968b3 || (enumC4968b == C4966e.EnumC4968b.MATCH_CONSTRAINT && i == 1);
                if (enumC4968b2 == enumC4968b3 || (enumC4968b2 == C4966e.EnumC4968b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C5333g c5333g2 = next.f13839d.f14749e;
                boolean z3 = c5333g2.f14726j;
                C5333g c5333g3 = next.f13841e.f14749e;
                boolean z4 = c5333g3.f14726j;
                if (z3 && z4) {
                    C4966e.EnumC4968b enumC4968b4 = C4966e.EnumC4968b.FIXED;
                    m24603l(next, enumC4968b4, c5333g2.f14723g, enumC4968b4, c5333g3.f14723g);
                    next.f13833a = true;
                } else if (z3 && z) {
                    m24603l(next, C4966e.EnumC4968b.FIXED, c5333g2.f14723g, enumC4968b3, c5333g3.f14723g);
                    if (enumC4968b2 == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                        next.f13841e.f14749e.f14729m = next.m26058v();
                    } else {
                        next.f13841e.f14749e.mo24598d(next.m26058v());
                        next.f13833a = true;
                    }
                } else if (z4 && z2) {
                    m24603l(next, enumC4968b3, c5333g2.f14723g, C4966e.EnumC4968b.FIXED, c5333g3.f14723g);
                    if (enumC4968b == C4966e.EnumC4968b.MATCH_CONSTRAINT) {
                        next.f13839d.f14749e.f14729m = next.m26106R();
                    } else {
                        next.f13839d.f14749e.mo24598d(next.m26106R());
                        next.f13833a = true;
                    }
                }
                if (next.f13833a && (c5333g = next.f13841e.f14737l) != null) {
                    c5333g.mo24598d(next.m26074n());
                }
            }
        }
    }

    /* renamed from: n */
    public void m24601n(C5325b.InterfaceC5327b interfaceC5327b) {
        this.f14714f = interfaceC5327b;
    }
}
