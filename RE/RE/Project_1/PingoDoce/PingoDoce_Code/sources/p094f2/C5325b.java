package p094f2;

import java.util.ArrayList;
import p053d2.C4711d;
import p053d2.C4714e;
import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.C4969f;
import p073e2.C4970g;
import p073e2.C4974j;
import p073e2.C4975k;
import p073e2.InterfaceC4972h;

/* renamed from: f2.b */
/* loaded from: classes.dex */
public class C5325b {

    /* renamed from: a */
    private final ArrayList<C4966e> f14691a = new ArrayList<>();

    /* renamed from: b */
    private C5326a f14692b = new C5326a();

    /* renamed from: c */
    private C4969f f14693c;

    /* compiled from: BasicMeasure.java */
    /* renamed from: f2.b$a */
    /* loaded from: classes.dex */
    public static class C5326a {

        /* renamed from: k */
        public static int f14694k = 0;

        /* renamed from: l */
        public static int f14695l = 1;

        /* renamed from: m */
        public static int f14696m = 2;

        /* renamed from: a */
        public C4966e.EnumC4968b f14697a;

        /* renamed from: b */
        public C4966e.EnumC4968b f14698b;

        /* renamed from: c */
        public int f14699c;

        /* renamed from: d */
        public int f14700d;

        /* renamed from: e */
        public int f14701e;

        /* renamed from: f */
        public int f14702f;

        /* renamed from: g */
        public int f14703g;

        /* renamed from: h */
        public boolean f14704h;

        /* renamed from: i */
        public boolean f14705i;

        /* renamed from: j */
        public int f14706j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: f2.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC5327b {
        /* renamed from: a */
        void mo24619a();

        /* renamed from: b */
        void mo24618b(C4966e c4966e, C5326a c5326a);
    }

    public C5325b(C4969f c4969f) {
        this.f14693c = c4969f;
    }

    /* renamed from: a */
    private boolean m24624a(InterfaceC5327b interfaceC5327b, C4966e c4966e, int i) {
        this.f14692b.f14697a = c4966e.m26052y();
        this.f14692b.f14698b = c4966e.m26112O();
        this.f14692b.f14699c = c4966e.m26106R();
        this.f14692b.f14700d = c4966e.m26058v();
        C5326a c5326a = this.f14692b;
        c5326a.f14705i = false;
        c5326a.f14706j = i;
        C4966e.EnumC4968b enumC4968b = c5326a.f14697a;
        C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
        boolean z = enumC4968b == enumC4968b2;
        boolean z2 = c5326a.f14698b == enumC4968b2;
        boolean z3 = z && c4966e.f13827U > 0.0f;
        boolean z4 = z2 && c4966e.f13827U > 0.0f;
        if (z3 && c4966e.f13862p[0] == 4) {
            c5326a.f14697a = C4966e.EnumC4968b.FIXED;
        }
        if (z4 && c4966e.f13862p[1] == 4) {
            c5326a.f14698b = C4966e.EnumC4968b.FIXED;
        }
        interfaceC5327b.mo24618b(c4966e, c5326a);
        c4966e.m26099U0(this.f14692b.f14701e);
        c4966e.m26057v0(this.f14692b.f14702f);
        c4966e.m26059u0(this.f14692b.f14704h);
        c4966e.m26078k0(this.f14692b.f14703g);
        C5326a c5326a2 = this.f14692b;
        c5326a2.f14706j = C5326a.f14694k;
        return c5326a2.f14705i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
        if (r8 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r5.f13827U <= 0.0f) goto L55;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m24623b(p073e2.C4969f r13) {
        /*
            r12 = this;
            java.util.ArrayList<e2.e> r0 = r13.f13905p0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.m26047B1(r1)
            f2.b$b r2 = r13.m26026r1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<e2.e> r5 = r13.f13905p0
            java.lang.Object r5 = r5.get(r4)
            e2.e r5 = (p073e2.C4966e) r5
            boolean r6 = r5 instanceof p073e2.C4970g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof p073e2.C4960a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.m26088c0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            f2.l r6 = r5.f13839d
            if (r6 == 0) goto L47
            f2.n r7 = r5.f13841e
            if (r7 == 0) goto L47
            f2.g r6 = r6.f14749e
            boolean r6 = r6.f14726j
            if (r6 == 0) goto L47
            f2.g r6 = r7.f14749e
            boolean r6 = r6.f14726j
            if (r6 == 0) goto L47
            goto La0
        L47:
            e2.e$b r6 = r5.m26064s(r3)
            r7 = 1
            e2.e$b r8 = r5.m26064s(r7)
            e2.e$b r9 = p073e2.C4966e.EnumC4968b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f13859n
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f13861o
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.m26047B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof p073e2.C4975k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f13859n
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.m26091Z()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f13861o
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.m26091Z()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f13827U
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = p094f2.C5325b.C5326a.f14694k
            r12.m24624a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.mo24619a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C5325b.m24623b(e2.f):void");
    }

    /* renamed from: c */
    private void m24622c(C4969f c4969f, String str, int i, int i2) {
        int m26128G = c4969f.m26128G();
        int m26130F = c4969f.m26130F();
        c4969f.m26119K0(0);
        c4969f.m26121J0(0);
        c4969f.m26099U0(i);
        c4969f.m26057v0(i2);
        c4969f.m26119K0(m26128G);
        c4969f.m26121J0(m26130F);
        this.f14693c.mo25990b1();
    }

    /* renamed from: d */
    public long m24621d(C4969f c4969f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        C4969f c4969f2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        InterfaceC5327b m26026r1 = c4969f.m26026r1();
        int size = c4969f.f13905p0.size();
        int m26106R = c4969f.m26106R();
        int m26058v = c4969f.m26058v();
        boolean m25996b = C4974j.m25996b(i, 128);
        boolean z7 = m25996b || C4974j.m25996b(i, 64);
        if (z7) {
            for (int i14 = 0; i14 < size; i14++) {
                C4966e c4966e = c4969f.f13905p0.get(i14);
                C4966e.EnumC4968b m26052y = c4966e.m26052y();
                C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                boolean z8 = (m26052y == enumC4968b) && (c4966e.m26112O() == enumC4968b) && c4966e.m26062t() > 0.0f;
                if ((c4966e.m26091Z() && z8) || ((c4966e.m26089b0() && z8) || (c4966e instanceof C4975k) || c4966e.m26091Z() || c4966e.m26089b0())) {
                    z7 = false;
                    break;
                }
            }
        }
        if (z7) {
            C4714e c4714e = C4711d.f12862x;
        }
        boolean z9 = z7 & ((i4 == 1073741824 && i6 == 1073741824) || m25996b);
        int i15 = 2;
        if (z9) {
            int min = Math.min(c4969f.m26132E(), i5);
            int min2 = Math.min(c4969f.m26134D(), i7);
            if (i4 == 1073741824 && c4969f.m26106R() != min) {
                c4969f.m26099U0(min);
                c4969f.m26023u1();
            }
            if (i6 == 1073741824 && c4969f.m26058v() != min2) {
                c4969f.m26057v0(min2);
                c4969f.m26023u1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = c4969f.m26029o1(m25996b);
                i10 = 2;
            } else {
                boolean m26028p1 = c4969f.m26028p1(m25996b);
                if (i4 == 1073741824) {
                    m26028p1 &= c4969f.m26027q1(m25996b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = c4969f.m26027q1(m25996b, 1) & m26028p1;
                    i10++;
                } else {
                    z = m26028p1;
                }
            }
            if (z) {
                c4969f.mo26040Y0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        int m26025s1 = c4969f.m26025s1();
        if (size > 0) {
            m24623b(c4969f);
        }
        m24620e(c4969f);
        int size2 = this.f14691a.size();
        if (size > 0) {
            m24622c(c4969f, "First pass", m26106R, m26058v);
        }
        if (size2 > 0) {
            C4966e.EnumC4968b m26052y2 = c4969f.m26052y();
            C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.WRAP_CONTENT;
            boolean z10 = m26052y2 == enumC4968b2;
            boolean z11 = c4969f.m26112O() == enumC4968b2;
            int max = Math.max(c4969f.m26106R(), this.f14693c.m26128G());
            int max2 = Math.max(c4969f.m26058v(), this.f14693c.m26130F());
            int i16 = 0;
            boolean z12 = false;
            while (i16 < size2) {
                C4966e c4966e2 = this.f14691a.get(i16);
                if (c4966e2 instanceof C4975k) {
                    int m26106R2 = c4966e2.m26106R();
                    i13 = m26025s1;
                    int m26058v2 = c4966e2.m26058v();
                    boolean m24624a = m24624a(m26026r1, c4966e2, C5326a.f14695l) | z12;
                    int m26106R3 = c4966e2.m26106R();
                    int m26058v3 = c4966e2.m26058v();
                    if (m26106R3 != m26106R2) {
                        c4966e2.m26099U0(m26106R3);
                        if (z10 && c4966e2.m26120K() > max) {
                            max = Math.max(max, c4966e2.m26120K() + c4966e2.mo26002m(C4963d.EnumC4965b.RIGHT).m26155e());
                        }
                        z6 = true;
                    } else {
                        z6 = m24624a;
                    }
                    if (m26058v3 != m26058v2) {
                        c4966e2.m26057v0(m26058v3);
                        if (z11 && c4966e2.m26070p() > max2) {
                            max2 = Math.max(max2, c4966e2.m26070p() + c4966e2.mo26002m(C4963d.EnumC4965b.BOTTOM).m26155e());
                        }
                        z6 = true;
                    }
                    z12 = z6 | ((C4975k) c4966e2).m25993d1();
                } else {
                    i13 = m26025s1;
                }
                i16++;
                m26025s1 = i13;
                i15 = 2;
            }
            i11 = m26025s1;
            int i17 = i15;
            int i18 = 0;
            while (i18 < i17) {
                int i19 = 0;
                while (i19 < size2) {
                    C4966e c4966e3 = this.f14691a.get(i19);
                    if (((c4966e3 instanceof InterfaceC4972h) && !(c4966e3 instanceof C4975k)) || (c4966e3 instanceof C4970g) || c4966e3.m26108Q() == 8 || ((z9 && c4966e3.f13839d.f14749e.f14726j && c4966e3.f13841e.f14749e.f14726j) || (c4966e3 instanceof C4975k))) {
                        z4 = z9;
                        i12 = size2;
                    } else {
                        int m26106R4 = c4966e3.m26106R();
                        int m26058v4 = c4966e3.m26058v();
                        z4 = z9;
                        int m26074n = c4966e3.m26074n();
                        int i20 = C5326a.f14695l;
                        i12 = size2;
                        if (i18 == 1) {
                            i20 = C5326a.f14696m;
                        }
                        boolean m24624a2 = m24624a(m26026r1, c4966e3, i20) | z12;
                        int m26106R5 = c4966e3.m26106R();
                        int m26058v5 = c4966e3.m26058v();
                        if (m26106R5 != m26106R4) {
                            c4966e3.m26099U0(m26106R5);
                            if (z10 && c4966e3.m26120K() > max) {
                                max = Math.max(max, c4966e3.m26120K() + c4966e3.mo26002m(C4963d.EnumC4965b.RIGHT).m26155e());
                            }
                            z5 = true;
                        } else {
                            z5 = m24624a2;
                        }
                        if (m26058v5 != m26058v4) {
                            c4966e3.m26057v0(m26058v5);
                            if (z11 && c4966e3.m26070p() > max2) {
                                max2 = Math.max(max2, c4966e3.m26070p() + c4966e3.mo26002m(C4963d.EnumC4965b.BOTTOM).m26155e());
                            }
                            z5 = true;
                        }
                        z12 = (!c4966e3.m26100U() || m26074n == c4966e3.m26074n()) ? z5 : true;
                    }
                    i19++;
                    size2 = i12;
                    z9 = z4;
                }
                boolean z13 = z9;
                int i21 = size2;
                if (!z12) {
                    break;
                }
                m24622c(c4969f, "intermediate pass", m26106R, m26058v);
                i18++;
                size2 = i21;
                z9 = z13;
                i17 = 2;
                z12 = false;
            }
            c4969f2 = c4969f;
            if (z12) {
                m24622c(c4969f2, "2nd pass", m26106R, m26058v);
                if (c4969f.m26106R() < max) {
                    c4969f2.m26099U0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c4969f.m26058v() < max2) {
                    c4969f2.m26057v0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m24622c(c4969f2, "3rd pass", m26106R, m26058v);
                }
            }
        } else {
            i11 = m26025s1;
            c4969f2 = c4969f;
        }
        c4969f2.m26044E1(i11);
        return 0L;
    }

    /* renamed from: e */
    public void m24620e(C4969f c4969f) {
        this.f14691a.clear();
        int size = c4969f.f13905p0.size();
        for (int i = 0; i < size; i++) {
            C4966e c4966e = c4969f.f13905p0.get(i);
            C4966e.EnumC4968b m26052y = c4966e.m26052y();
            C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_CONSTRAINT;
            if (m26052y == enumC4968b || c4966e.m26112O() == enumC4968b) {
                this.f14691a.add(c4966e);
            }
        }
        c4969f.m26023u1();
    }
}
