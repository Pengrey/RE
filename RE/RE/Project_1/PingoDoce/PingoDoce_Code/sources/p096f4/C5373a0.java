package p096f4;

import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1798b;
import p026b4.C1802f;
import p026b4.InterfaceC1809m;
import p040c4.C2076j;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.a0 */
/* loaded from: classes.dex */
public class C5373a0 {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14821a = AbstractC5604c.C5605a.m23609a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2076j m24466a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        String str = null;
        InterfaceC1809m<PointF, PointF> interfaceC1809m = null;
        C1802f c1802f = null;
        C1798b c1798b = null;
        boolean z = false;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14821a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                interfaceC1809m = C5372a.m24467b(abstractC5604c, c2201d);
            } else if (mo23595X == 2) {
                c1802f = C5378d.m24446i(abstractC5604c, c2201d);
            } else if (mo23595X == 3) {
                c1798b = C5378d.m24450e(abstractC5604c, c2201d);
            } else if (mo23595X != 4) {
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23605E();
            }
        }
        return new C2076j(str, interfaceC1809m, c1802f, c1798b, z);
    }
}
