package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p026b4.C1798b;
import p026b4.C1799c;
import p026b4.C1800d;
import p026b4.C1802f;
import p040c4.C2068e;
import p040c4.C2082p;
import p040c4.EnumC2069f;
import p116g4.AbstractC5604c;
import p152i4.C6013a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.n */
/* loaded from: classes.dex */
public class C5395n {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14848a = AbstractC5604c.C5605a.m23609a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14849b = AbstractC5604c.C5605a.m23609a("p", "k");

    /* renamed from: c */
    private static final AbstractC5604c.C5605a f14850c = AbstractC5604c.C5605a.m23609a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2068e m24426a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        C1799c c1799c;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        EnumC2069f enumC2069f = null;
        C1799c c1799c2 = null;
        C1802f c1802f = null;
        C1802f c1802f2 = null;
        C1798b c1798b = null;
        C2082p.EnumC2084b enumC2084b = null;
        C2082p.EnumC2085c enumC2085c = null;
        C1798b c1798b2 = null;
        boolean z = false;
        C1800d c1800d = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14848a)) {
                case 0:
                    str = abstractC5604c.mo23597M();
                    break;
                case 1:
                    int i = -1;
                    abstractC5604c.mo23591e();
                    while (abstractC5604c.mo23580y()) {
                        int mo23595X = abstractC5604c.mo23595X(f14849b);
                        if (mo23595X != 0) {
                            c1799c = c1799c2;
                            if (mo23595X != 1) {
                                abstractC5604c.mo23594a0();
                                abstractC5604c.mo23593b0();
                            } else {
                                c1799c2 = C5378d.m24448g(abstractC5604c, c2201d, i);
                            }
                        } else {
                            c1799c = c1799c2;
                            i = abstractC5604c.mo23600H();
                        }
                        c1799c2 = c1799c;
                    }
                    abstractC5604c.mo23584t();
                    break;
                case 2:
                    c1800d = C5378d.m24447h(abstractC5604c, c2201d);
                    break;
                case 3:
                    enumC2069f = abstractC5604c.mo23600H() == 1 ? EnumC2069f.LINEAR : EnumC2069f.RADIAL;
                    break;
                case 4:
                    c1802f = C5378d.m24446i(abstractC5604c, c2201d);
                    break;
                case 5:
                    c1802f2 = C5378d.m24446i(abstractC5604c, c2201d);
                    break;
                case 6:
                    c1798b = C5378d.m24450e(abstractC5604c, c2201d);
                    break;
                case 7:
                    enumC2084b = C2082p.EnumC2084b.values()[abstractC5604c.mo23600H() - 1];
                    break;
                case 8:
                    enumC2085c = C2082p.EnumC2085c.values()[abstractC5604c.mo23600H() - 1];
                    break;
                case 9:
                    f = (float) abstractC5604c.mo23603F();
                    break;
                case 10:
                    z = abstractC5604c.mo23605E();
                    break;
                case 11:
                    abstractC5604c.mo23592c();
                    while (abstractC5604c.mo23580y()) {
                        abstractC5604c.mo23591e();
                        String str2 = null;
                        C1798b c1798b3 = null;
                        while (abstractC5604c.mo23580y()) {
                            int mo23595X2 = abstractC5604c.mo23595X(f14850c);
                            if (mo23595X2 != 0) {
                                C1798b c1798b4 = c1798b2;
                                if (mo23595X2 != 1) {
                                    abstractC5604c.mo23594a0();
                                    abstractC5604c.mo23593b0();
                                } else {
                                    c1798b3 = C5378d.m24450e(abstractC5604c, c2201d);
                                }
                                c1798b2 = c1798b4;
                            } else {
                                str2 = abstractC5604c.mo23597M();
                            }
                        }
                        C1798b c1798b5 = c1798b2;
                        abstractC5604c.mo23584t();
                        if (str2.equals("o")) {
                            c1798b2 = c1798b3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                c2201d.m34411u(true);
                                arrayList.add(c1798b3);
                            }
                            c1798b2 = c1798b5;
                        }
                    }
                    C1798b c1798b6 = c1798b2;
                    abstractC5604c.mo23589h();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    c1798b2 = c1798b6;
                    break;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        if (c1800d == null) {
            c1800d = new C1800d(Collections.singletonList(new C6013a(100)));
        }
        return new C2068e(str, enumC2069f, c1799c2, c1800d, c1802f, c1802f2, c1798b, enumC2084b, enumC2085c, f, arrayList, c1798b2, z);
    }
}
