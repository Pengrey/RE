package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1798b;
import p040c4.C2086q;
import p116g4.AbstractC5604c;

/* renamed from: f4.i0 */
/* loaded from: classes.dex */
class C5389i0 {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14841a = AbstractC5604c.C5605a.m23609a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2086q m24433a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        boolean z = false;
        String str = null;
        C2086q.EnumC2087a enumC2087a = null;
        C1798b c1798b = null;
        C1798b c1798b2 = null;
        C1798b c1798b3 = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14841a);
            if (mo23595X == 0) {
                c1798b = C5378d.m24449f(abstractC5604c, c2201d, false);
            } else if (mo23595X == 1) {
                c1798b2 = C5378d.m24449f(abstractC5604c, c2201d, false);
            } else if (mo23595X == 2) {
                c1798b3 = C5378d.m24449f(abstractC5604c, c2201d, false);
            } else if (mo23595X == 3) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 4) {
                enumC2087a = C2086q.EnumC2087a.forId(abstractC5604c.mo23600H());
            } else if (mo23595X != 5) {
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23605E();
            }
        }
        return new C2086q(str, enumC2087a, c1798b, c1798b2, c1798b3, z);
    }
}
