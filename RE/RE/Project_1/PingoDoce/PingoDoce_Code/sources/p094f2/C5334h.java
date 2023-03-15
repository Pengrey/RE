package p094f2;

import java.util.ArrayList;
import java.util.Iterator;
import p073e2.C4960a;
import p073e2.C4963d;
import p073e2.C4966e;
import p073e2.C4969f;
import p073e2.C4970g;
import p094f2.C5325b;

/* renamed from: f2.h */
/* loaded from: classes.dex */
public class C5334h {

    /* renamed from: a */
    private static C5325b.C5326a f14730a = new C5325b.C5326a();

    /* renamed from: a */
    private static boolean m24597a(C4966e c4966e) {
        C4966e.EnumC4968b m26052y = c4966e.m26052y();
        C4966e.EnumC4968b m26112O = c4966e.m26112O();
        C4969f c4969f = c4966e.m26124I() != null ? (C4969f) c4966e.m26124I() : null;
        if (c4969f != null) {
            c4969f.m26052y();
            C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.FIXED;
        }
        if (c4969f != null) {
            c4969f.m26112O();
            C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.FIXED;
        }
        C4966e.EnumC4968b enumC4968b3 = C4966e.EnumC4968b.FIXED;
        boolean z = m26052y == enumC4968b3 || m26052y == C4966e.EnumC4968b.WRAP_CONTENT || (m26052y == C4966e.EnumC4968b.MATCH_CONSTRAINT && c4966e.f13859n == 0 && c4966e.f13827U == 0.0f && c4966e.m26098V(0)) || c4966e.mo26012e0();
        boolean z2 = m26112O == enumC4968b3 || m26112O == C4966e.EnumC4968b.WRAP_CONTENT || (m26112O == C4966e.EnumC4968b.MATCH_CONSTRAINT && c4966e.f13861o == 0 && c4966e.f13827U == 0.0f && c4966e.m26098V(1)) || c4966e.mo26010f0();
        if (c4966e.f13827U <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: b */
    private static void m24596b(C4966e c4966e, C5325b.InterfaceC5327b interfaceC5327b, boolean z) {
        C4963d c4963d;
        C4963d c4963d2;
        C4963d c4963d3;
        C4963d c4963d4;
        C4963d c4963d5;
        if (!(c4966e instanceof C4969f) && c4966e.m26086d0() && m24597a(c4966e)) {
            C4969f.m26048A1(c4966e, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
        }
        C4963d mo26002m = c4966e.mo26002m(C4963d.EnumC4965b.LEFT);
        C4963d mo26002m2 = c4966e.mo26002m(C4963d.EnumC4965b.RIGHT);
        int m26156d = mo26002m.m26156d();
        int m26156d2 = mo26002m2.m26156d();
        if (mo26002m.m26157c() != null && mo26002m.m26147m()) {
            Iterator<C4963d> it = mo26002m.m26157c().iterator();
            while (it.hasNext()) {
                C4963d next = it.next();
                C4966e c4966e2 = next.f13799d;
                boolean m24597a = m24597a(c4966e2);
                if (c4966e2.m26086d0() && m24597a) {
                    C4969f.m26048A1(c4966e2, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
                }
                C4966e.EnumC4968b m26052y = c4966e2.m26052y();
                C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (m26052y == enumC4968b && !m24597a) {
                    if (c4966e2.m26052y() == enumC4968b && c4966e2.f13864r >= 0 && c4966e2.f13863q >= 0 && (c4966e2.m26108Q() == 8 || (c4966e2.f13859n == 0 && c4966e2.m26062t() == 0.0f))) {
                        if (!c4966e2.m26091Z() && !c4966e2.m26088c0()) {
                            if (((next == c4966e2.f13812F && (c4963d5 = c4966e2.f13814H.f13801f) != null && c4963d5.m26147m()) || (next == c4966e2.f13814H && (c4963d4 = c4966e2.f13812F.f13801f) != null && c4963d4.m26147m())) && !c4966e2.m26091Z()) {
                                m24593e(c4966e, interfaceC5327b, c4966e2, z);
                            }
                        }
                    }
                } else if (!c4966e2.m26086d0()) {
                    C4963d c4963d6 = c4966e2.f13812F;
                    if (next == c4963d6 && c4966e2.f13814H.f13801f == null) {
                        int m26155e = c4963d6.m26155e() + m26156d;
                        c4966e2.m26069p0(m26155e, c4966e2.m26106R() + m26155e);
                        m24596b(c4966e2, interfaceC5327b, z);
                    } else {
                        C4963d c4963d7 = c4966e2.f13814H;
                        if (next == c4963d7 && c4963d6.f13801f == null) {
                            int m26155e2 = m26156d - c4963d7.m26155e();
                            c4966e2.m26069p0(m26155e2 - c4966e2.m26106R(), m26155e2);
                            m24596b(c4966e2, interfaceC5327b, z);
                        } else if (next == c4963d6 && (c4963d3 = c4963d7.f13801f) != null && c4963d3.m26147m() && !c4966e2.m26091Z()) {
                            m24594d(interfaceC5327b, c4966e2, z);
                        }
                    }
                }
            }
        }
        if ((c4966e instanceof C4970g) || mo26002m2.m26157c() == null || !mo26002m2.m26147m()) {
            return;
        }
        Iterator<C4963d> it2 = mo26002m2.m26157c().iterator();
        while (it2.hasNext()) {
            C4963d next2 = it2.next();
            C4966e c4966e3 = next2.f13799d;
            boolean m24597a2 = m24597a(c4966e3);
            if (c4966e3.m26086d0() && m24597a2) {
                C4969f.m26048A1(c4966e3, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
            }
            boolean z2 = (next2 == c4966e3.f13812F && (c4963d2 = c4966e3.f13814H.f13801f) != null && c4963d2.m26147m()) || (next2 == c4966e3.f13814H && (c4963d = c4966e3.f13812F.f13801f) != null && c4963d.m26147m());
            C4966e.EnumC4968b m26052y2 = c4966e3.m26052y();
            C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
            if (m26052y2 == enumC4968b2 && !m24597a2) {
                if (c4966e3.m26052y() == enumC4968b2 && c4966e3.f13864r >= 0 && c4966e3.f13863q >= 0 && (c4966e3.m26108Q() == 8 || (c4966e3.f13859n == 0 && c4966e3.m26062t() == 0.0f))) {
                    if (!c4966e3.m26091Z() && !c4966e3.m26088c0() && z2 && !c4966e3.m26091Z()) {
                        m24593e(c4966e, interfaceC5327b, c4966e3, z);
                    }
                }
            } else if (!c4966e3.m26086d0()) {
                C4963d c4963d8 = c4966e3.f13812F;
                if (next2 == c4963d8 && c4966e3.f13814H.f13801f == null) {
                    int m26155e3 = c4963d8.m26155e() + m26156d2;
                    c4966e3.m26069p0(m26155e3, c4966e3.m26106R() + m26155e3);
                    m24596b(c4966e3, interfaceC5327b, z);
                } else {
                    C4963d c4963d9 = c4966e3.f13814H;
                    if (next2 == c4963d9 && c4963d8.f13801f == null) {
                        int m26155e4 = m26156d2 - c4963d9.m26155e();
                        c4966e3.m26069p0(m26155e4 - c4966e3.m26106R(), m26155e4);
                        m24596b(c4966e3, interfaceC5327b, z);
                    } else if (z2 && !c4966e3.m26091Z()) {
                        m24594d(interfaceC5327b, c4966e3, z);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static void m24595c(C4960a c4960a, C5325b.InterfaceC5327b interfaceC5327b, int i, boolean z) {
        if (c4960a.m26173c1()) {
            if (i == 0) {
                m24596b(c4960a, interfaceC5327b, z);
            } else {
                m24589i(c4960a, interfaceC5327b);
            }
        }
    }

    /* renamed from: d */
    private static void m24594d(C5325b.InterfaceC5327b interfaceC5327b, C4966e c4966e, boolean z) {
        float m26056w = c4966e.m26056w();
        int m26156d = c4966e.f13812F.f13801f.m26156d();
        int m26156d2 = c4966e.f13814H.f13801f.m26156d();
        int m26155e = c4966e.f13812F.m26155e() + m26156d;
        int m26155e2 = m26156d2 - c4966e.f13814H.m26155e();
        if (m26156d == m26156d2) {
            m26056w = 0.5f;
        } else {
            m26156d = m26155e;
            m26156d2 = m26155e2;
        }
        int m26106R = c4966e.m26106R();
        int i = (m26156d2 - m26156d) - m26106R;
        if (m26156d > m26156d2) {
            i = (m26156d - m26156d2) - m26106R;
        }
        int i2 = ((int) ((m26056w * i) + 0.5f)) + m26156d;
        int i3 = i2 + m26106R;
        if (m26156d > m26156d2) {
            i3 = i2 - m26106R;
        }
        c4966e.m26069p0(i2, i3);
        m24596b(c4966e, interfaceC5327b, z);
    }

    /* renamed from: e */
    private static void m24593e(C4966e c4966e, C5325b.InterfaceC5327b interfaceC5327b, C4966e c4966e2, boolean z) {
        int m26106R;
        float m26056w = c4966e2.m26056w();
        int m26156d = c4966e2.f13812F.f13801f.m26156d() + c4966e2.f13812F.m26155e();
        int m26156d2 = c4966e2.f13814H.f13801f.m26156d() - c4966e2.f13814H.m26155e();
        if (m26156d2 >= m26156d) {
            int m26106R2 = c4966e2.m26106R();
            if (c4966e2.m26108Q() != 8) {
                int i = c4966e2.f13859n;
                if (i == 2) {
                    if (c4966e instanceof C4969f) {
                        m26106R = c4966e.m26106R();
                    } else {
                        m26106R = c4966e.m26124I().m26106R();
                    }
                    m26106R2 = (int) (c4966e2.m26056w() * 0.5f * m26106R);
                } else if (i == 0) {
                    m26106R2 = m26156d2 - m26156d;
                }
                m26106R2 = Math.max(c4966e2.f13863q, m26106R2);
                int i2 = c4966e2.f13864r;
                if (i2 > 0) {
                    m26106R2 = Math.min(i2, m26106R2);
                }
            }
            int i3 = m26156d + ((int) ((m26056w * ((m26156d2 - m26156d) - m26106R2)) + 0.5f));
            c4966e2.m26069p0(i3, m26106R2 + i3);
            m24596b(c4966e2, interfaceC5327b, z);
        }
    }

    /* renamed from: f */
    private static void m24592f(C5325b.InterfaceC5327b interfaceC5327b, C4966e c4966e) {
        float m26116M = c4966e.m26116M();
        int m26156d = c4966e.f13813G.f13801f.m26156d();
        int m26156d2 = c4966e.f13815I.f13801f.m26156d();
        int m26155e = c4966e.f13813G.m26155e() + m26156d;
        int m26155e2 = m26156d2 - c4966e.f13815I.m26155e();
        if (m26156d == m26156d2) {
            m26116M = 0.5f;
        } else {
            m26156d = m26155e;
            m26156d2 = m26155e2;
        }
        int m26058v = c4966e.m26058v();
        int i = (m26156d2 - m26156d) - m26058v;
        if (m26156d > m26156d2) {
            i = (m26156d - m26156d2) - m26058v;
        }
        int i2 = (int) ((m26116M * i) + 0.5f);
        int i3 = m26156d + i2;
        int i4 = i3 + m26058v;
        if (m26156d > m26156d2) {
            i3 = m26156d - i2;
            i4 = i3 - m26058v;
        }
        c4966e.m26063s0(i3, i4);
        m24589i(c4966e, interfaceC5327b);
    }

    /* renamed from: g */
    private static void m24591g(C4966e c4966e, C5325b.InterfaceC5327b interfaceC5327b, C4966e c4966e2) {
        int m26058v;
        float m26116M = c4966e2.m26116M();
        int m26156d = c4966e2.f13813G.f13801f.m26156d() + c4966e2.f13813G.m26155e();
        int m26156d2 = c4966e2.f13815I.f13801f.m26156d() - c4966e2.f13815I.m26155e();
        if (m26156d2 >= m26156d) {
            int m26058v2 = c4966e2.m26058v();
            if (c4966e2.m26108Q() != 8) {
                int i = c4966e2.f13861o;
                if (i == 2) {
                    if (c4966e instanceof C4969f) {
                        m26058v = c4966e.m26058v();
                    } else {
                        m26058v = c4966e.m26124I().m26058v();
                    }
                    m26058v2 = (int) (m26116M * 0.5f * m26058v);
                } else if (i == 0) {
                    m26058v2 = m26156d2 - m26156d;
                }
                m26058v2 = Math.max(c4966e2.f13866t, m26058v2);
                int i2 = c4966e2.f13867u;
                if (i2 > 0) {
                    m26058v2 = Math.min(i2, m26058v2);
                }
            }
            int i3 = m26156d + ((int) ((m26116M * ((m26156d2 - m26156d) - m26058v2)) + 0.5f));
            c4966e2.m26063s0(i3, m26058v2 + i3);
            m24589i(c4966e2, interfaceC5327b);
        }
    }

    /* renamed from: h */
    public static void m24590h(C4969f c4969f, C5325b.InterfaceC5327b interfaceC5327b) {
        C4966e.EnumC4968b m26052y = c4969f.m26052y();
        C4966e.EnumC4968b m26112O = c4969f.m26112O();
        c4969f.m26081i0();
        ArrayList<C4966e> m25992a1 = c4969f.m25992a1();
        int size = m25992a1.size();
        for (int i = 0; i < size; i++) {
            m25992a1.get(i).m26081i0();
        }
        boolean m26020x1 = c4969f.m26020x1();
        if (m26052y == C4966e.EnumC4968b.FIXED) {
            c4969f.m26069p0(0, c4969f.m26106R());
        } else {
            c4969f.m26067q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C4966e c4966e = m25992a1.get(i2);
            if (c4966e instanceof C4970g) {
                C4970g c4970g = (C4970g) c4966e;
                if (c4970g.m26015b1() == 1) {
                    if (c4970g.m26014c1() != -1) {
                        c4970g.m26009f1(c4970g.m26014c1());
                    } else if (c4970g.m26013d1() != -1 && c4969f.mo26012e0()) {
                        c4970g.m26009f1(c4969f.m26106R() - c4970g.m26013d1());
                    } else if (c4969f.mo26012e0()) {
                        c4970g.m26009f1((int) ((c4970g.m26011e1() * c4969f.m26106R()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c4966e instanceof C4960a) && ((C4960a) c4966e).m26169g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C4966e c4966e2 = m25992a1.get(i3);
                if (c4966e2 instanceof C4970g) {
                    C4970g c4970g2 = (C4970g) c4966e2;
                    if (c4970g2.m26015b1() == 1) {
                        m24596b(c4970g2, interfaceC5327b, m26020x1);
                    }
                }
            }
        }
        m24596b(c4969f, interfaceC5327b, m26020x1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C4966e c4966e3 = m25992a1.get(i4);
                if (c4966e3 instanceof C4960a) {
                    C4960a c4960a = (C4960a) c4966e3;
                    if (c4960a.m26169g1() == 0) {
                        m24595c(c4960a, interfaceC5327b, 0, m26020x1);
                    }
                }
            }
        }
        if (m26112O == C4966e.EnumC4968b.FIXED) {
            c4969f.m26063s0(0, c4969f.m26058v());
        } else {
            c4969f.m26065r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C4966e c4966e4 = m25992a1.get(i5);
            if (c4966e4 instanceof C4970g) {
                C4970g c4970g3 = (C4970g) c4966e4;
                if (c4970g3.m26015b1() == 0) {
                    if (c4970g3.m26014c1() != -1) {
                        c4970g3.m26009f1(c4970g3.m26014c1());
                    } else if (c4970g3.m26013d1() != -1 && c4969f.mo26010f0()) {
                        c4970g3.m26009f1(c4969f.m26058v() - c4970g3.m26013d1());
                    } else if (c4969f.mo26010f0()) {
                        c4970g3.m26009f1((int) ((c4970g3.m26011e1() * c4969f.m26058v()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c4966e4 instanceof C4960a) && ((C4960a) c4966e4).m26169g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C4966e c4966e5 = m25992a1.get(i6);
                if (c4966e5 instanceof C4970g) {
                    C4970g c4970g4 = (C4970g) c4966e5;
                    if (c4970g4.m26015b1() == 0) {
                        m24589i(c4970g4, interfaceC5327b);
                    }
                }
            }
        }
        m24589i(c4969f, interfaceC5327b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C4966e c4966e6 = m25992a1.get(i7);
                if (c4966e6 instanceof C4960a) {
                    C4960a c4960a2 = (C4960a) c4966e6;
                    if (c4960a2.m26169g1() == 1) {
                        m24595c(c4960a2, interfaceC5327b, 1, m26020x1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C4966e c4966e7 = m25992a1.get(i8);
            if (c4966e7.m26086d0() && m24597a(c4966e7)) {
                C4969f.m26048A1(c4966e7, interfaceC5327b, f14730a, C5325b.C5326a.f14694k);
                m24596b(c4966e7, interfaceC5327b, m26020x1);
                m24589i(c4966e7, interfaceC5327b);
            }
        }
    }

    /* renamed from: i */
    private static void m24589i(C4966e c4966e, C5325b.InterfaceC5327b interfaceC5327b) {
        C4963d c4963d;
        C4963d c4963d2;
        C4963d c4963d3;
        C4963d c4963d4;
        C4963d c4963d5;
        if (!(c4966e instanceof C4969f) && c4966e.m26086d0() && m24597a(c4966e)) {
            C4969f.m26048A1(c4966e, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
        }
        C4963d mo26002m = c4966e.mo26002m(C4963d.EnumC4965b.TOP);
        C4963d mo26002m2 = c4966e.mo26002m(C4963d.EnumC4965b.BOTTOM);
        int m26156d = mo26002m.m26156d();
        int m26156d2 = mo26002m2.m26156d();
        if (mo26002m.m26157c() != null && mo26002m.m26147m()) {
            Iterator<C4963d> it = mo26002m.m26157c().iterator();
            while (it.hasNext()) {
                C4963d next = it.next();
                C4966e c4966e2 = next.f13799d;
                boolean m24597a = m24597a(c4966e2);
                if (c4966e2.m26086d0() && m24597a) {
                    C4969f.m26048A1(c4966e2, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
                }
                C4966e.EnumC4968b m26112O = c4966e2.m26112O();
                C4966e.EnumC4968b enumC4968b = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (m26112O == enumC4968b && !m24597a) {
                    if (c4966e2.m26112O() == enumC4968b && c4966e2.f13867u >= 0 && c4966e2.f13866t >= 0 && (c4966e2.m26108Q() == 8 || (c4966e2.f13861o == 0 && c4966e2.m26062t() == 0.0f))) {
                        if (!c4966e2.m26089b0() && !c4966e2.m26088c0()) {
                            if (((next == c4966e2.f13813G && (c4963d5 = c4966e2.f13815I.f13801f) != null && c4963d5.m26147m()) || (next == c4966e2.f13815I && (c4963d4 = c4966e2.f13813G.f13801f) != null && c4963d4.m26147m())) && !c4966e2.m26089b0()) {
                                m24591g(c4966e, interfaceC5327b, c4966e2);
                            }
                        }
                    }
                } else if (!c4966e2.m26086d0()) {
                    C4963d c4963d6 = c4966e2.f13813G;
                    if (next == c4963d6 && c4966e2.f13815I.f13801f == null) {
                        int m26155e = c4963d6.m26155e() + m26156d;
                        c4966e2.m26063s0(m26155e, c4966e2.m26058v() + m26155e);
                        m24589i(c4966e2, interfaceC5327b);
                    } else {
                        C4963d c4963d7 = c4966e2.f13815I;
                        if (next == c4963d7 && c4963d7.f13801f == null) {
                            int m26155e2 = m26156d - c4963d7.m26155e();
                            c4966e2.m26063s0(m26155e2 - c4966e2.m26058v(), m26155e2);
                            m24589i(c4966e2, interfaceC5327b);
                        } else if (next == c4963d6 && (c4963d3 = c4963d7.f13801f) != null && c4963d3.m26147m()) {
                            m24592f(interfaceC5327b, c4966e2);
                        }
                    }
                }
            }
        }
        if (c4966e instanceof C4970g) {
            return;
        }
        if (mo26002m2.m26157c() != null && mo26002m2.m26147m()) {
            Iterator<C4963d> it2 = mo26002m2.m26157c().iterator();
            while (it2.hasNext()) {
                C4963d next2 = it2.next();
                C4966e c4966e3 = next2.f13799d;
                boolean m24597a2 = m24597a(c4966e3);
                if (c4966e3.m26086d0() && m24597a2) {
                    C4969f.m26048A1(c4966e3, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
                }
                boolean z = (next2 == c4966e3.f13813G && (c4963d2 = c4966e3.f13815I.f13801f) != null && c4963d2.m26147m()) || (next2 == c4966e3.f13815I && (c4963d = c4966e3.f13813G.f13801f) != null && c4963d.m26147m());
                C4966e.EnumC4968b m26112O2 = c4966e3.m26112O();
                C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.MATCH_CONSTRAINT;
                if (m26112O2 == enumC4968b2 && !m24597a2) {
                    if (c4966e3.m26112O() == enumC4968b2 && c4966e3.f13867u >= 0 && c4966e3.f13866t >= 0 && (c4966e3.m26108Q() == 8 || (c4966e3.f13861o == 0 && c4966e3.m26062t() == 0.0f))) {
                        if (!c4966e3.m26089b0() && !c4966e3.m26088c0() && z && !c4966e3.m26089b0()) {
                            m24591g(c4966e, interfaceC5327b, c4966e3);
                        }
                    }
                } else if (!c4966e3.m26086d0()) {
                    C4963d c4963d8 = c4966e3.f13813G;
                    if (next2 == c4963d8 && c4966e3.f13815I.f13801f == null) {
                        int m26155e3 = c4963d8.m26155e() + m26156d2;
                        c4966e3.m26063s0(m26155e3, c4966e3.m26058v() + m26155e3);
                        m24589i(c4966e3, interfaceC5327b);
                    } else {
                        C4963d c4963d9 = c4966e3.f13815I;
                        if (next2 == c4963d9 && c4963d8.f13801f == null) {
                            int m26155e4 = m26156d2 - c4963d9.m26155e();
                            c4966e3.m26063s0(m26155e4 - c4966e3.m26058v(), m26155e4);
                            m24589i(c4966e3, interfaceC5327b);
                        } else if (z && !c4966e3.m26089b0()) {
                            m24592f(interfaceC5327b, c4966e3);
                        }
                    }
                }
            }
        }
        C4963d mo26002m3 = c4966e.mo26002m(C4963d.EnumC4965b.BASELINE);
        if (mo26002m3.m26157c() == null || !mo26002m3.m26147m()) {
            return;
        }
        int m26156d3 = mo26002m3.m26156d();
        Iterator<C4963d> it3 = mo26002m3.m26157c().iterator();
        while (it3.hasNext()) {
            C4963d next3 = it3.next();
            C4966e c4966e4 = next3.f13799d;
            boolean m24597a3 = m24597a(c4966e4);
            if (c4966e4.m26086d0() && m24597a3) {
                C4969f.m26048A1(c4966e4, interfaceC5327b, new C5325b.C5326a(), C5325b.C5326a.f14694k);
            }
            if (c4966e4.m26112O() != C4966e.EnumC4968b.MATCH_CONSTRAINT || m24597a3) {
                if (!c4966e4.m26086d0() && next3 == c4966e4.f13816J) {
                    c4966e4.m26071o0(m26156d3);
                    m24589i(c4966e4, interfaceC5327b);
                }
            }
        }
    }
}
