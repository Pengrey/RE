package p073e2;

import p053d2.C4711d;
import p073e2.C4966e;

/* renamed from: e2.j */
/* loaded from: classes.dex */
public class C4974j {

    /* renamed from: a */
    static boolean[] f13903a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25997a(C4969f c4969f, C4711d c4711d, C4966e c4966e) {
        c4966e.f13855l = -1;
        c4966e.f13857m = -1;
        C4966e.EnumC4968b enumC4968b = c4969f.f13823Q[0];
        C4966e.EnumC4968b enumC4968b2 = C4966e.EnumC4968b.WRAP_CONTENT;
        if (enumC4968b != enumC4968b2 && c4966e.f13823Q[0] == C4966e.EnumC4968b.MATCH_PARENT) {
            int i = c4966e.f13812F.f13802g;
            int m26106R = c4969f.m26106R() - c4966e.f13814H.f13802g;
            C4963d c4963d = c4966e.f13812F;
            c4963d.f13804i = c4711d.m26845q(c4963d);
            C4963d c4963d2 = c4966e.f13814H;
            c4963d2.f13804i = c4711d.m26845q(c4963d2);
            c4711d.m26856f(c4966e.f13812F.f13804i, i);
            c4711d.m26856f(c4966e.f13814H.f13804i, m26106R);
            c4966e.f13855l = 2;
            c4966e.m26051y0(i, m26106R);
        }
        if (c4969f.f13823Q[1] == enumC4968b2 || c4966e.f13823Q[1] != C4966e.EnumC4968b.MATCH_PARENT) {
            return;
        }
        int i2 = c4966e.f13813G.f13802g;
        int m26058v = c4969f.m26058v() - c4966e.f13815I.f13802g;
        C4963d c4963d3 = c4966e.f13813G;
        c4963d3.f13804i = c4711d.m26845q(c4963d3);
        C4963d c4963d4 = c4966e.f13815I;
        c4963d4.f13804i = c4711d.m26845q(c4963d4);
        c4711d.m26856f(c4966e.f13813G.f13804i, i2);
        c4711d.m26856f(c4966e.f13815I.f13804i, m26058v);
        if (c4966e.f13831Y > 0 || c4966e.m26108Q() == 8) {
            C4963d c4963d5 = c4966e.f13816J;
            c4963d5.f13804i = c4711d.m26845q(c4963d5);
            c4711d.m26856f(c4966e.f13816J.f13804i, c4966e.f13831Y + i2);
        }
        c4966e.f13857m = 2;
        c4966e.m26109P0(i2, m26058v);
    }

    /* renamed from: b */
    public static final boolean m25996b(int i, int i2) {
        return (i & i2) == i2;
    }
}
