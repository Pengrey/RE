package p094f2;

import java.util.ArrayList;
import p073e2.C4966e;
import p073e2.C4970g;
import p073e2.C4973i;

/* renamed from: f2.i */
/* loaded from: classes.dex */
public class C5335i {
    /* renamed from: a */
    public static C5343o m24588a(C4966e c4966e, int i, ArrayList<C5343o> arrayList, C5343o c5343o) {
        int i2;
        int m25999b1;
        if (i == 0) {
            i2 = c4966e.f13858m0;
        } else {
            i2 = c4966e.f13860n0;
        }
        if (i2 != -1 && (c5343o == null || i2 != c5343o.f14741b)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                C5343o c5343o2 = arrayList.get(i3);
                if (c5343o2.m24573c() == i2) {
                    if (c5343o != null) {
                        c5343o.m24569g(i, c5343o2);
                        arrayList.remove(c5343o);
                    }
                    c5343o = c5343o2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return c5343o;
        }
        if (c5343o == null) {
            if ((c4966e instanceof C4973i) && (m25999b1 = ((C4973i) c4966e).m25999b1(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    C5343o c5343o3 = arrayList.get(i4);
                    if (c5343o3.m24573c() == m25999b1) {
                        c5343o = c5343o3;
                        break;
                    }
                    i4++;
                }
            }
            if (c5343o == null) {
                c5343o = new C5343o(i);
            }
            arrayList.add(c5343o);
        }
        if (c5343o.m24575a(c4966e)) {
            if (c4966e instanceof C4970g) {
                C4970g c4970g = (C4970g) c4966e;
                c4970g.m26016a1().m26158b(c4970g.m26015b1() == 0 ? 1 : 0, arrayList, c5343o);
            }
            if (i == 0) {
                c4966e.f13858m0 = c5343o.m24573c();
                c4966e.f13812F.m26158b(i, arrayList, c5343o);
                c4966e.f13814H.m26158b(i, arrayList, c5343o);
            } else {
                c4966e.f13860n0 = c5343o.m24573c();
                c4966e.f13813G.m26158b(i, arrayList, c5343o);
                c4966e.f13816J.m26158b(i, arrayList, c5343o);
                c4966e.f13815I.m26158b(i, arrayList, c5343o);
            }
            c4966e.f13819M.m26158b(i, arrayList, c5343o);
        }
        return c5343o;
    }

    /* renamed from: b */
    private static C5343o m24587b(ArrayList<C5343o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5343o c5343o = arrayList.get(i2);
            if (i == c5343o.f14741b) {
                return c5343o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0380 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m24586c(p073e2.C4969f r16, p094f2.C5325b.InterfaceC5327b r17) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p094f2.C5335i.m24586c(e2.f, f2.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m24585d(C4966e.EnumC4968b enumC4968b, C4966e.EnumC4968b enumC4968b2, C4966e.EnumC4968b enumC4968b3, C4966e.EnumC4968b enumC4968b4) {
        C4966e.EnumC4968b enumC4968b5;
        C4966e.EnumC4968b enumC4968b6;
        C4966e.EnumC4968b enumC4968b7 = C4966e.EnumC4968b.FIXED;
        return (enumC4968b3 == enumC4968b7 || enumC4968b3 == (enumC4968b6 = C4966e.EnumC4968b.WRAP_CONTENT) || (enumC4968b3 == C4966e.EnumC4968b.MATCH_PARENT && enumC4968b != enumC4968b6)) || (enumC4968b4 == enumC4968b7 || enumC4968b4 == (enumC4968b5 = C4966e.EnumC4968b.WRAP_CONTENT) || (enumC4968b4 == C4966e.EnumC4968b.MATCH_PARENT && enumC4968b2 != enumC4968b5));
    }
}
