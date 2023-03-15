package p478z0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181jd.Intrinsics;
import p297pd.C8608d;
import p297pd.C8611f;
import p297pd._Ranges;
import p478z0.AbstractC13505e;
import p489zc.AbstractC13762g0;
import p489zc.CollectionsJVM;
import p489zc.Iterables;
import p489zc._Arrays;
import p489zc._Collections;

/* renamed from: z0.f */
/* loaded from: classes.dex */
public final class PathNode {
    /* renamed from: a */
    public static final List m1125a(char c, float[] fArr) {
        C8608d m14993p;
        ArrayList arrayList;
        int m186r;
        C8611f m14992q;
        List<Float> m281M;
        float[] m457l0;
        C8608d m14993p2;
        int m186r2;
        C8611f m14992q2;
        List<Float> m281M2;
        float[] m457l02;
        C8608d m14993p3;
        int m186r3;
        C8611f m14992q3;
        List<Float> m281M3;
        float[] m457l03;
        C8608d m14993p4;
        int m186r4;
        C8611f m14992q4;
        List<Float> m281M4;
        float[] m457l04;
        C8608d m14993p5;
        int m186r5;
        C8611f m14992q5;
        List<Float> m281M5;
        float[] m457l05;
        C8608d m14993p6;
        int m186r6;
        C8611f m14992q6;
        List<Float> m281M6;
        float[] m457l06;
        C8608d m14993p7;
        int m186r7;
        C8611f m14992q7;
        List<Float> m281M7;
        float[] m457l07;
        C8608d m14993p8;
        int m186r8;
        C8611f m14992q8;
        List<Float> m281M8;
        float[] m457l08;
        C8608d m14993p9;
        int m186r9;
        C8611f m14992q9;
        List<Float> m281M9;
        float[] m457l09;
        C8608d m14993p10;
        int m186r10;
        C8611f m14992q10;
        List<Float> m281M10;
        float[] m457l010;
        AbstractC13505e c13518m;
        C8608d m14993p11;
        int m186r11;
        C8611f m14992q11;
        List<Float> m281M11;
        float[] m457l011;
        C8608d m14993p12;
        int m186r12;
        C8611f m14992q12;
        List<Float> m281M12;
        float[] m457l012;
        C8608d m14993p13;
        int m186r13;
        C8611f m14992q13;
        List<Float> m281M13;
        float[] m457l013;
        C8608d m14993p14;
        int m186r14;
        C8611f m14992q14;
        List<Float> m281M14;
        float[] m457l014;
        C8608d m14993p15;
        int m186r15;
        C8611f m14992q15;
        List<Float> m281M15;
        float[] m457l015;
        C8608d m14993p16;
        int m186r16;
        C8611f m14992q16;
        List<Float> m281M16;
        float[] m457l016;
        C8608d m14993p17;
        int m186r17;
        C8611f m14992q17;
        List<Float> m281M17;
        float[] m457l017;
        C8608d m14993p18;
        int m186r18;
        C8611f m14992q18;
        List<Float> m281M18;
        float[] m457l018;
        List m202b;
        Intrinsics.isThisObjectNull(fArr, "args");
        if (c == 'z' || c == 'Z') {
            m202b = CollectionsJVM.m202b(AbstractC13505e.C13507b.f34388c);
            return m202b;
        }
        if (c == 'm') {
            m14993p18 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
            m186r18 = Iterables.m186r(m14993p18, 10);
            arrayList = new ArrayList(m186r18);
            Iterator<Integer> it = m14993p18.iterator();
            while (it.hasNext()) {
                int mo404a = ((AbstractC13762g0) it).mo404a();
                m14992q18 = _Ranges.m14992q(mo404a, mo404a + 2);
                m281M18 = _Arrays.m281M(fArr, m14992q18);
                m457l018 = _Collections.m457l0(m281M18);
                AbstractC13505e c13519n = new AbstractC13505e.C13519n(m457l018[0], m457l018[1]);
                if ((c13519n instanceof AbstractC13505e.C13511f) && mo404a > 0) {
                    c13519n = new AbstractC13505e.C13510e(m457l018[0], m457l018[1]);
                } else if (mo404a > 0) {
                    c13519n = new AbstractC13505e.C13518m(m457l018[0], m457l018[1]);
                }
                arrayList.add(c13519n);
            }
        } else if (c == 'M') {
            m14993p17 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
            m186r17 = Iterables.m186r(m14993p17, 10);
            arrayList = new ArrayList(m186r17);
            Iterator<Integer> it2 = m14993p17.iterator();
            while (it2.hasNext()) {
                int mo404a2 = ((AbstractC13762g0) it2).mo404a();
                m14992q17 = _Ranges.m14992q(mo404a2, mo404a2 + 2);
                m281M17 = _Arrays.m281M(fArr, m14992q17);
                m457l017 = _Collections.m457l0(m281M17);
                AbstractC13505e c13511f = new AbstractC13505e.C13511f(m457l017[0], m457l017[1]);
                if (mo404a2 > 0) {
                    c13511f = new AbstractC13505e.C13510e(m457l017[0], m457l017[1]);
                } else if ((c13511f instanceof AbstractC13505e.C13519n) && mo404a2 > 0) {
                    c13511f = new AbstractC13505e.C13518m(m457l017[0], m457l017[1]);
                }
                arrayList.add(c13511f);
            }
        } else if (c == 'l') {
            m14993p16 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
            m186r16 = Iterables.m186r(m14993p16, 10);
            arrayList = new ArrayList(m186r16);
            Iterator<Integer> it3 = m14993p16.iterator();
            while (it3.hasNext()) {
                int mo404a3 = ((AbstractC13762g0) it3).mo404a();
                m14992q16 = _Ranges.m14992q(mo404a3, mo404a3 + 2);
                m281M16 = _Arrays.m281M(fArr, m14992q16);
                m457l016 = _Collections.m457l0(m281M16);
                AbstractC13505e c13518m2 = new AbstractC13505e.C13518m(m457l016[0], m457l016[1]);
                if ((c13518m2 instanceof AbstractC13505e.C13511f) && mo404a3 > 0) {
                    c13518m2 = new AbstractC13505e.C13510e(m457l016[0], m457l016[1]);
                } else if ((c13518m2 instanceof AbstractC13505e.C13519n) && mo404a3 > 0) {
                    c13518m2 = new AbstractC13505e.C13518m(m457l016[0], m457l016[1]);
                }
                arrayList.add(c13518m2);
            }
        } else if (c == 'L') {
            m14993p15 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
            m186r15 = Iterables.m186r(m14993p15, 10);
            arrayList = new ArrayList(m186r15);
            Iterator<Integer> it4 = m14993p15.iterator();
            while (it4.hasNext()) {
                int mo404a4 = ((AbstractC13762g0) it4).mo404a();
                m14992q15 = _Ranges.m14992q(mo404a4, mo404a4 + 2);
                m281M15 = _Arrays.m281M(fArr, m14992q15);
                m457l015 = _Collections.m457l0(m281M15);
                AbstractC13505e c13510e = new AbstractC13505e.C13510e(m457l015[0], m457l015[1]);
                if ((c13510e instanceof AbstractC13505e.C13511f) && mo404a4 > 0) {
                    c13510e = new AbstractC13505e.C13510e(m457l015[0], m457l015[1]);
                } else if ((c13510e instanceof AbstractC13505e.C13519n) && mo404a4 > 0) {
                    c13510e = new AbstractC13505e.C13518m(m457l015[0], m457l015[1]);
                }
                arrayList.add(c13510e);
            }
        } else if (c == 'h') {
            m14993p14 = _Ranges.m14993p(new C8611f(0, fArr.length - 1), 1);
            m186r14 = Iterables.m186r(m14993p14, 10);
            arrayList = new ArrayList(m186r14);
            Iterator<Integer> it5 = m14993p14.iterator();
            while (it5.hasNext()) {
                int mo404a5 = ((AbstractC13762g0) it5).mo404a();
                m14992q14 = _Ranges.m14992q(mo404a5, mo404a5 + 1);
                m281M14 = _Arrays.m281M(fArr, m14992q14);
                m457l014 = _Collections.m457l0(m281M14);
                AbstractC13505e c13517l = new AbstractC13505e.C13517l(m457l014[0]);
                if ((c13517l instanceof AbstractC13505e.C13511f) && mo404a5 > 0) {
                    c13517l = new AbstractC13505e.C13510e(m457l014[0], m457l014[1]);
                } else if ((c13517l instanceof AbstractC13505e.C13519n) && mo404a5 > 0) {
                    c13517l = new AbstractC13505e.C13518m(m457l014[0], m457l014[1]);
                }
                arrayList.add(c13517l);
            }
        } else if (c == 'H') {
            m14993p13 = _Ranges.m14993p(new C8611f(0, fArr.length - 1), 1);
            m186r13 = Iterables.m186r(m14993p13, 10);
            arrayList = new ArrayList(m186r13);
            Iterator<Integer> it6 = m14993p13.iterator();
            while (it6.hasNext()) {
                int mo404a6 = ((AbstractC13762g0) it6).mo404a();
                m14992q13 = _Ranges.m14992q(mo404a6, mo404a6 + 1);
                m281M13 = _Arrays.m281M(fArr, m14992q13);
                m457l013 = _Collections.m457l0(m281M13);
                AbstractC13505e c13509d = new AbstractC13505e.C13509d(m457l013[0]);
                if ((c13509d instanceof AbstractC13505e.C13511f) && mo404a6 > 0) {
                    c13509d = new AbstractC13505e.C13510e(m457l013[0], m457l013[1]);
                } else if ((c13509d instanceof AbstractC13505e.C13519n) && mo404a6 > 0) {
                    c13509d = new AbstractC13505e.C13518m(m457l013[0], m457l013[1]);
                }
                arrayList.add(c13509d);
            }
        } else if (c == 'v') {
            m14993p12 = _Ranges.m14993p(new C8611f(0, fArr.length - 1), 1);
            m186r12 = Iterables.m186r(m14993p12, 10);
            arrayList = new ArrayList(m186r12);
            Iterator<Integer> it7 = m14993p12.iterator();
            while (it7.hasNext()) {
                int mo404a7 = ((AbstractC13762g0) it7).mo404a();
                m14992q12 = _Ranges.m14992q(mo404a7, mo404a7 + 1);
                m281M12 = _Arrays.m281M(fArr, m14992q12);
                m457l012 = _Collections.m457l0(m281M12);
                AbstractC13505e c13523r = new AbstractC13505e.C13523r(m457l012[0]);
                if ((c13523r instanceof AbstractC13505e.C13511f) && mo404a7 > 0) {
                    c13523r = new AbstractC13505e.C13510e(m457l012[0], m457l012[1]);
                } else if ((c13523r instanceof AbstractC13505e.C13519n) && mo404a7 > 0) {
                    c13523r = new AbstractC13505e.C13518m(m457l012[0], m457l012[1]);
                }
                arrayList.add(c13523r);
            }
        } else if (c == 'V') {
            m14993p11 = _Ranges.m14993p(new C8611f(0, fArr.length - 1), 1);
            m186r11 = Iterables.m186r(m14993p11, 10);
            arrayList = new ArrayList(m186r11);
            Iterator<Integer> it8 = m14993p11.iterator();
            while (it8.hasNext()) {
                int mo404a8 = ((AbstractC13762g0) it8).mo404a();
                m14992q11 = _Ranges.m14992q(mo404a8, mo404a8 + 1);
                m281M11 = _Arrays.m281M(fArr, m14992q11);
                m457l011 = _Collections.m457l0(m281M11);
                AbstractC13505e c13524s = new AbstractC13505e.C13524s(m457l011[0]);
                if ((c13524s instanceof AbstractC13505e.C13511f) && mo404a8 > 0) {
                    c13524s = new AbstractC13505e.C13510e(m457l011[0], m457l011[1]);
                } else if ((c13524s instanceof AbstractC13505e.C13519n) && mo404a8 > 0) {
                    c13524s = new AbstractC13505e.C13518m(m457l011[0], m457l011[1]);
                }
                arrayList.add(c13524s);
            }
        } else {
            char c2 = 5;
            if (c == 'c') {
                m14993p10 = _Ranges.m14993p(new C8611f(0, fArr.length - 6), 6);
                m186r10 = Iterables.m186r(m14993p10, 10);
                arrayList = new ArrayList(m186r10);
                Iterator<Integer> it9 = m14993p10.iterator();
                while (it9.hasNext()) {
                    int mo404a9 = ((AbstractC13762g0) it9).mo404a();
                    m14992q10 = _Ranges.m14992q(mo404a9, mo404a9 + 6);
                    m281M10 = _Arrays.m281M(fArr, m14992q10);
                    m457l010 = _Collections.m457l0(m281M10);
                    AbstractC13505e c13516k = new AbstractC13505e.C13516k(m457l010[0], m457l010[1], m457l010[2], m457l010[3], m457l010[4], m457l010[c2]);
                    if (!(c13516k instanceof AbstractC13505e.C13511f) || mo404a9 <= 0) {
                        c13518m = (!(c13516k instanceof AbstractC13505e.C13519n) || mo404a9 <= 0) ? c13516k : new AbstractC13505e.C13518m(m457l010[0], m457l010[1]);
                    } else {
                        c13518m = new AbstractC13505e.C13510e(m457l010[0], m457l010[1]);
                    }
                    arrayList.add(c13518m);
                    c2 = 5;
                }
            } else if (c == 'C') {
                m14993p9 = _Ranges.m14993p(new C8611f(0, fArr.length - 6), 6);
                m186r9 = Iterables.m186r(m14993p9, 10);
                arrayList = new ArrayList(m186r9);
                Iterator<Integer> it10 = m14993p9.iterator();
                while (it10.hasNext()) {
                    int mo404a10 = ((AbstractC13762g0) it10).mo404a();
                    m14992q9 = _Ranges.m14992q(mo404a10, mo404a10 + 6);
                    m281M9 = _Arrays.m281M(fArr, m14992q9);
                    m457l09 = _Collections.m457l0(m281M9);
                    AbstractC13505e c13508c = new AbstractC13505e.C13508c(m457l09[0], m457l09[1], m457l09[2], m457l09[3], m457l09[4], m457l09[5]);
                    if ((c13508c instanceof AbstractC13505e.C13511f) && mo404a10 > 0) {
                        c13508c = new AbstractC13505e.C13510e(m457l09[0], m457l09[1]);
                    } else if ((c13508c instanceof AbstractC13505e.C13519n) && mo404a10 > 0) {
                        c13508c = new AbstractC13505e.C13518m(m457l09[0], m457l09[1]);
                    }
                    arrayList.add(c13508c);
                }
            } else if (c == 's') {
                m14993p8 = _Ranges.m14993p(new C8611f(0, fArr.length - 4), 4);
                m186r8 = Iterables.m186r(m14993p8, 10);
                arrayList = new ArrayList(m186r8);
                Iterator<Integer> it11 = m14993p8.iterator();
                while (it11.hasNext()) {
                    int mo404a11 = ((AbstractC13762g0) it11).mo404a();
                    m14992q8 = _Ranges.m14992q(mo404a11, mo404a11 + 4);
                    m281M8 = _Arrays.m281M(fArr, m14992q8);
                    m457l08 = _Collections.m457l0(m281M8);
                    AbstractC13505e c13521p = new AbstractC13505e.C13521p(m457l08[0], m457l08[1], m457l08[2], m457l08[3]);
                    if ((c13521p instanceof AbstractC13505e.C13511f) && mo404a11 > 0) {
                        c13521p = new AbstractC13505e.C13510e(m457l08[0], m457l08[1]);
                    } else if ((c13521p instanceof AbstractC13505e.C13519n) && mo404a11 > 0) {
                        c13521p = new AbstractC13505e.C13518m(m457l08[0], m457l08[1]);
                    }
                    arrayList.add(c13521p);
                }
            } else if (c == 'S') {
                m14993p7 = _Ranges.m14993p(new C8611f(0, fArr.length - 4), 4);
                m186r7 = Iterables.m186r(m14993p7, 10);
                arrayList = new ArrayList(m186r7);
                Iterator<Integer> it12 = m14993p7.iterator();
                while (it12.hasNext()) {
                    int mo404a12 = ((AbstractC13762g0) it12).mo404a();
                    m14992q7 = _Ranges.m14992q(mo404a12, mo404a12 + 4);
                    m281M7 = _Arrays.m281M(fArr, m14992q7);
                    m457l07 = _Collections.m457l0(m281M7);
                    AbstractC13505e c13513h = new AbstractC13505e.C13513h(m457l07[0], m457l07[1], m457l07[2], m457l07[3]);
                    if ((c13513h instanceof AbstractC13505e.C13511f) && mo404a12 > 0) {
                        c13513h = new AbstractC13505e.C13510e(m457l07[0], m457l07[1]);
                    } else if ((c13513h instanceof AbstractC13505e.C13519n) && mo404a12 > 0) {
                        c13513h = new AbstractC13505e.C13518m(m457l07[0], m457l07[1]);
                    }
                    arrayList.add(c13513h);
                }
            } else if (c == 'q') {
                m14993p6 = _Ranges.m14993p(new C8611f(0, fArr.length - 4), 4);
                m186r6 = Iterables.m186r(m14993p6, 10);
                arrayList = new ArrayList(m186r6);
                Iterator<Integer> it13 = m14993p6.iterator();
                while (it13.hasNext()) {
                    int mo404a13 = ((AbstractC13762g0) it13).mo404a();
                    m14992q6 = _Ranges.m14992q(mo404a13, mo404a13 + 4);
                    m281M6 = _Arrays.m281M(fArr, m14992q6);
                    m457l06 = _Collections.m457l0(m281M6);
                    AbstractC13505e c13520o = new AbstractC13505e.C13520o(m457l06[0], m457l06[1], m457l06[2], m457l06[3]);
                    if ((c13520o instanceof AbstractC13505e.C13511f) && mo404a13 > 0) {
                        c13520o = new AbstractC13505e.C13510e(m457l06[0], m457l06[1]);
                    } else if ((c13520o instanceof AbstractC13505e.C13519n) && mo404a13 > 0) {
                        c13520o = new AbstractC13505e.C13518m(m457l06[0], m457l06[1]);
                    }
                    arrayList.add(c13520o);
                }
            } else if (c == 'Q') {
                m14993p5 = _Ranges.m14993p(new C8611f(0, fArr.length - 4), 4);
                m186r5 = Iterables.m186r(m14993p5, 10);
                arrayList = new ArrayList(m186r5);
                Iterator<Integer> it14 = m14993p5.iterator();
                while (it14.hasNext()) {
                    int mo404a14 = ((AbstractC13762g0) it14).mo404a();
                    m14992q5 = _Ranges.m14992q(mo404a14, mo404a14 + 4);
                    m281M5 = _Arrays.m281M(fArr, m14992q5);
                    m457l05 = _Collections.m457l0(m281M5);
                    AbstractC13505e c13512g = new AbstractC13505e.C13512g(m457l05[0], m457l05[1], m457l05[2], m457l05[3]);
                    if ((c13512g instanceof AbstractC13505e.C13511f) && mo404a14 > 0) {
                        c13512g = new AbstractC13505e.C13510e(m457l05[0], m457l05[1]);
                    } else if ((c13512g instanceof AbstractC13505e.C13519n) && mo404a14 > 0) {
                        c13512g = new AbstractC13505e.C13518m(m457l05[0], m457l05[1]);
                    }
                    arrayList.add(c13512g);
                }
            } else if (c == 't') {
                m14993p4 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
                m186r4 = Iterables.m186r(m14993p4, 10);
                arrayList = new ArrayList(m186r4);
                Iterator<Integer> it15 = m14993p4.iterator();
                while (it15.hasNext()) {
                    int mo404a15 = ((AbstractC13762g0) it15).mo404a();
                    m14992q4 = _Ranges.m14992q(mo404a15, mo404a15 + 2);
                    m281M4 = _Arrays.m281M(fArr, m14992q4);
                    m457l04 = _Collections.m457l0(m281M4);
                    AbstractC13505e c13522q = new AbstractC13505e.C13522q(m457l04[0], m457l04[1]);
                    if ((c13522q instanceof AbstractC13505e.C13511f) && mo404a15 > 0) {
                        c13522q = new AbstractC13505e.C13510e(m457l04[0], m457l04[1]);
                    } else if ((c13522q instanceof AbstractC13505e.C13519n) && mo404a15 > 0) {
                        c13522q = new AbstractC13505e.C13518m(m457l04[0], m457l04[1]);
                    }
                    arrayList.add(c13522q);
                }
            } else if (c == 'T') {
                m14993p3 = _Ranges.m14993p(new C8611f(0, fArr.length - 2), 2);
                m186r3 = Iterables.m186r(m14993p3, 10);
                arrayList = new ArrayList(m186r3);
                Iterator<Integer> it16 = m14993p3.iterator();
                while (it16.hasNext()) {
                    int mo404a16 = ((AbstractC13762g0) it16).mo404a();
                    m14992q3 = _Ranges.m14992q(mo404a16, mo404a16 + 2);
                    m281M3 = _Arrays.m281M(fArr, m14992q3);
                    m457l03 = _Collections.m457l0(m281M3);
                    AbstractC13505e c13514i = new AbstractC13505e.C13514i(m457l03[0], m457l03[1]);
                    if ((c13514i instanceof AbstractC13505e.C13511f) && mo404a16 > 0) {
                        c13514i = new AbstractC13505e.C13510e(m457l03[0], m457l03[1]);
                    } else if ((c13514i instanceof AbstractC13505e.C13519n) && mo404a16 > 0) {
                        c13514i = new AbstractC13505e.C13518m(m457l03[0], m457l03[1]);
                    }
                    arrayList.add(c13514i);
                }
            } else if (c == 'a') {
                m14993p2 = _Ranges.m14993p(new C8611f(0, fArr.length - 7), 7);
                m186r2 = Iterables.m186r(m14993p2, 10);
                arrayList = new ArrayList(m186r2);
                Iterator<Integer> it17 = m14993p2.iterator();
                while (it17.hasNext()) {
                    int mo404a17 = ((AbstractC13762g0) it17).mo404a();
                    m14992q2 = _Ranges.m14992q(mo404a17, mo404a17 + 7);
                    m281M2 = _Arrays.m281M(fArr, m14992q2);
                    m457l02 = _Collections.m457l0(m281M2);
                    AbstractC13505e c13515j = new AbstractC13505e.C13515j(m457l02[0], m457l02[1], m457l02[2], Float.compare(m457l02[3], 0.0f) != 0, Float.compare(m457l02[4], 0.0f) != 0, m457l02[5], m457l02[6]);
                    if ((c13515j instanceof AbstractC13505e.C13511f) && mo404a17 > 0) {
                        c13515j = new AbstractC13505e.C13510e(m457l02[0], m457l02[1]);
                    } else if ((c13515j instanceof AbstractC13505e.C13519n) && mo404a17 > 0) {
                        c13515j = new AbstractC13505e.C13518m(m457l02[0], m457l02[1]);
                    }
                    arrayList.add(c13515j);
                }
            } else if (c == 'A') {
                m14993p = _Ranges.m14993p(new C8611f(0, fArr.length - 7), 7);
                m186r = Iterables.m186r(m14993p, 10);
                arrayList = new ArrayList(m186r);
                Iterator<Integer> it18 = m14993p.iterator();
                while (it18.hasNext()) {
                    int mo404a18 = ((AbstractC13762g0) it18).mo404a();
                    m14992q = _Ranges.m14992q(mo404a18, mo404a18 + 7);
                    m281M = _Arrays.m281M(fArr, m14992q);
                    m457l0 = _Collections.m457l0(m281M);
                    AbstractC13505e c13506a = new AbstractC13505e.C13506a(m457l0[0], m457l0[1], m457l0[2], Float.compare(m457l0[3], 0.0f) != 0, Float.compare(m457l0[4], 0.0f) != 0, m457l0[5], m457l0[6]);
                    if ((c13506a instanceof AbstractC13505e.C13511f) && mo404a18 > 0) {
                        c13506a = new AbstractC13505e.C13510e(m457l0[0], m457l0[1]);
                    } else if ((c13506a instanceof AbstractC13505e.C13519n) && mo404a18 > 0) {
                        c13506a = new AbstractC13505e.C13518m(m457l0[0], m457l0[1]);
                    }
                    arrayList.add(c13506a);
                }
            } else {
                throw new IllegalArgumentException(Intrinsics.addStrAndObj("Unknown command for: ", Character.valueOf(c)));
            }
        }
        return arrayList;
    }
}
