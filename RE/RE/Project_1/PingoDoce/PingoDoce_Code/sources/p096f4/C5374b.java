package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1797a;
import p026b4.C1798b;
import p026b4.C1807k;
import p116g4.AbstractC5604c;

/* renamed from: f4.b */
/* loaded from: classes.dex */
public class C5374b {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14822a = AbstractC5604c.C5605a.m23609a("a");

    /* renamed from: b */
    private static AbstractC5604c.C5605a f14823b = AbstractC5604c.C5605a.m23609a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C1807k m24465a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        abstractC5604c.mo23591e();
        C1807k c1807k = null;
        while (abstractC5604c.mo23580y()) {
            if (abstractC5604c.mo23595X(f14822a) != 0) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                c1807k = m24464b(abstractC5604c, c2201d);
            }
        }
        abstractC5604c.mo23584t();
        return c1807k == null ? new C1807k(null, null, null, null) : c1807k;
    }

    /* renamed from: b */
    private static C1807k m24464b(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        abstractC5604c.mo23591e();
        C1797a c1797a = null;
        C1797a c1797a2 = null;
        C1798b c1798b = null;
        C1798b c1798b2 = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14823b);
            if (mo23595X == 0) {
                c1797a = C5378d.m24452c(abstractC5604c, c2201d);
            } else if (mo23595X == 1) {
                c1797a2 = C5378d.m24452c(abstractC5604c, c2201d);
            } else if (mo23595X == 2) {
                c1798b = C5378d.m24450e(abstractC5604c, c2201d);
            } else if (mo23595X != 3) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                c1798b2 = C5378d.m24450e(abstractC5604c, c2201d);
            }
        }
        abstractC5604c.mo23584t();
        return new C1807k(c1797a, c1797a2, c1798b, c1798b2);
    }
}
