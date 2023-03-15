package p094f2;

import java.util.ArrayList;
import p073e2.C4969f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f2.m */
/* loaded from: classes.dex */
public class C5340m {

    /* renamed from: c */
    public static int f14733c;

    /* renamed from: a */
    AbstractC5345p f14734a;

    /* renamed from: b */
    ArrayList<AbstractC5345p> f14735b = new ArrayList<>();

    public C5340m(AbstractC5345p abstractC5345p, int i) {
        this.f14734a = null;
        f14733c++;
        this.f14734a = abstractC5345p;
    }

    /* renamed from: c */
    private long m24578c(C5331f c5331f, long j) {
        AbstractC5345p abstractC5345p = c5331f.f14720d;
        if (abstractC5345p instanceof C5337k) {
            return j;
        }
        int size = c5331f.f14727k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC5329d interfaceC5329d = c5331f.f14727k.get(i);
            if (interfaceC5329d instanceof C5331f) {
                C5331f c5331f2 = (C5331f) interfaceC5329d;
                if (c5331f2.f14720d != abstractC5345p) {
                    j2 = Math.min(j2, m24578c(c5331f2, c5331f2.f14722f + j));
                }
            }
        }
        if (c5331f == abstractC5345p.f14753i) {
            long mo24556j = j - abstractC5345p.mo24556j();
            return Math.min(Math.min(j2, m24578c(abstractC5345p.f14752h, mo24556j)), mo24556j - abstractC5345p.f14752h.f14722f);
        }
        return j2;
    }

    /* renamed from: d */
    private long m24577d(C5331f c5331f, long j) {
        AbstractC5345p abstractC5345p = c5331f.f14720d;
        if (abstractC5345p instanceof C5337k) {
            return j;
        }
        int size = c5331f.f14727k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC5329d interfaceC5329d = c5331f.f14727k.get(i);
            if (interfaceC5329d instanceof C5331f) {
                C5331f c5331f2 = (C5331f) interfaceC5329d;
                if (c5331f2.f14720d != abstractC5345p) {
                    j2 = Math.max(j2, m24577d(c5331f2, c5331f2.f14722f + j));
                }
            }
        }
        if (c5331f == abstractC5345p.f14752h) {
            long mo24556j = j + abstractC5345p.mo24556j();
            return Math.max(Math.max(j2, m24577d(abstractC5345p.f14753i, mo24556j)), mo24556j - abstractC5345p.f14753i.f14722f);
        }
        return j2;
    }

    /* renamed from: a */
    public void m24580a(AbstractC5345p abstractC5345p) {
        this.f14735b.add(abstractC5345p);
    }

    /* renamed from: b */
    public long m24579b(C4969f c4969f, int i) {
        long mo24556j;
        int i2;
        AbstractC5345p abstractC5345p = this.f14734a;
        if (abstractC5345p instanceof C5328c) {
            if (((C5328c) abstractC5345p).f14750f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC5345p instanceof C5338l)) {
                return 0L;
            }
        } else if (!(abstractC5345p instanceof C5341n)) {
            return 0L;
        }
        C5331f c5331f = (i == 0 ? c4969f.f13839d : c4969f.f13841e).f14752h;
        C5331f c5331f2 = (i == 0 ? c4969f.f13839d : c4969f.f13841e).f14753i;
        boolean contains = abstractC5345p.f14752h.f14728l.contains(c5331f);
        boolean contains2 = this.f14734a.f14753i.f14728l.contains(c5331f2);
        long mo24556j2 = this.f14734a.mo24556j();
        if (contains && contains2) {
            long m24577d = m24577d(this.f14734a.f14752h, 0L);
            long m24578c = m24578c(this.f14734a.f14753i, 0L);
            long j = m24577d - mo24556j2;
            AbstractC5345p abstractC5345p2 = this.f14734a;
            int i3 = abstractC5345p2.f14753i.f14722f;
            if (j >= (-i3)) {
                j += i3;
            }
            int i4 = abstractC5345p2.f14752h.f14722f;
            long j2 = ((-m24578c) - mo24556j2) - i4;
            if (j2 >= i4) {
                j2 -= i4;
            }
            float m26072o = abstractC5345p2.f14746b.m26072o(i);
            float f = (float) (m26072o > 0.0f ? (((float) j2) / m26072o) + (((float) j) / (1.0f - m26072o)) : 0L);
            long j3 = (f * m26072o) + 0.5f + mo24556j2 + (f * (1.0f - m26072o)) + 0.5f;
            AbstractC5345p abstractC5345p3 = this.f14734a;
            mo24556j = abstractC5345p3.f14752h.f14722f + j3;
            i2 = abstractC5345p3.f14753i.f14722f;
        } else if (contains) {
            C5331f c5331f3 = this.f14734a.f14752h;
            return Math.max(m24577d(c5331f3, c5331f3.f14722f), this.f14734a.f14752h.f14722f + mo24556j2);
        } else if (contains2) {
            C5331f c5331f4 = this.f14734a.f14753i;
            return Math.max(-m24578c(c5331f4, c5331f4.f14722f), (-this.f14734a.f14753i.f14722f) + mo24556j2);
        } else {
            AbstractC5345p abstractC5345p4 = this.f14734a;
            mo24556j = abstractC5345p4.f14752h.f14722f + abstractC5345p4.mo24556j();
            i2 = this.f14734a.f14753i.f14722f;
        }
        return mo24556j - i2;
    }
}
