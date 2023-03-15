package p096f4;

import androidx.constraintlayout.widget.C0868i;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p026b4.C1797a;
import p026b4.C1798b;
import p026b4.C1800d;
import p040c4.C2082p;
import p116g4.AbstractC5604c;
import p152i4.C6013a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.h0 */
/* loaded from: classes.dex */
public class C5387h0 {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14838a = AbstractC5604c.C5605a.m23609a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14839b = AbstractC5604c.C5605a.m23609a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C2082p m24435a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        char c;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        float f = 0.0f;
        String str = null;
        C1798b c1798b = null;
        C1797a c1797a = null;
        C1798b c1798b2 = null;
        C2082p.EnumC2084b enumC2084b = null;
        C2082p.EnumC2085c enumC2085c = null;
        C1800d c1800d = null;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14838a)) {
                case 0:
                    str = abstractC5604c.mo23597M();
                    break;
                case 1:
                    c1797a = C5378d.m24452c(abstractC5604c, c2201d);
                    break;
                case 2:
                    c1798b2 = C5378d.m24450e(abstractC5604c, c2201d);
                    break;
                case 3:
                    c1800d = C5378d.m24447h(abstractC5604c, c2201d);
                    break;
                case 4:
                    enumC2084b = C2082p.EnumC2084b.values()[abstractC5604c.mo23600H() - 1];
                    break;
                case 5:
                    enumC2085c = C2082p.EnumC2085c.values()[abstractC5604c.mo23600H() - 1];
                    break;
                case 6:
                    f = (float) abstractC5604c.mo23603F();
                    break;
                case 7:
                    z = abstractC5604c.mo23605E();
                    break;
                case 8:
                    abstractC5604c.mo23592c();
                    while (abstractC5604c.mo23580y()) {
                        abstractC5604c.mo23591e();
                        String str2 = null;
                        C1798b c1798b3 = null;
                        while (abstractC5604c.mo23580y()) {
                            int mo23595X = abstractC5604c.mo23595X(f14839b);
                            if (mo23595X == 0) {
                                str2 = abstractC5604c.mo23597M();
                            } else if (mo23595X != 1) {
                                abstractC5604c.mo23594a0();
                                abstractC5604c.mo23593b0();
                            } else {
                                c1798b3 = C5378d.m24450e(abstractC5604c, c2201d);
                            }
                        }
                        abstractC5604c.mo23584t();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case C0868i.f2738A0 /* 100 */:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case C0868i.f2753D0 /* 103 */:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                c2201d.m34411u(true);
                                arrayList.add(c1798b3);
                                break;
                            case 2:
                                c1798b = c1798b3;
                                break;
                        }
                    }
                    abstractC5604c.mo23589h();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        if (c1800d == null) {
            c1800d = new C1800d(Collections.singletonList(new C6013a(100)));
        }
        return new C2082p(str, c1798b, arrayList, c1797a, c1800d, c1798b2, enumC2084b, enumC2085c, f, z);
    }
}
