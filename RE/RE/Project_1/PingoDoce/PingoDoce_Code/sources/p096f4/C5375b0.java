package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1798b;
import p026b4.C1808l;
import p040c4.C2077k;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.b0 */
/* loaded from: classes.dex */
public class C5375b0 {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14824a = AbstractC5604c.C5605a.m23609a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2077k m24463a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        boolean z = false;
        String str = null;
        C1798b c1798b = null;
        C1798b c1798b2 = null;
        C1808l c1808l = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14824a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                c1798b = C5378d.m24449f(abstractC5604c, c2201d, false);
            } else if (mo23595X == 2) {
                c1798b2 = C5378d.m24449f(abstractC5604c, c2201d, false);
            } else if (mo23595X == 3) {
                c1808l = C5376c.m24456g(abstractC5604c, c2201d);
            } else if (mo23595X != 4) {
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23605E();
            }
        }
        return new C2077k(str, c1798b, c1798b2, c1808l, z);
    }
}
