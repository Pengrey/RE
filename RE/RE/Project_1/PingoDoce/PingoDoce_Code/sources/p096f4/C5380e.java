package p096f4;

import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1802f;
import p026b4.InterfaceC1809m;
import p040c4.C2064a;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.e */
/* loaded from: classes.dex */
public class C5380e {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14830a = AbstractC5604c.C5605a.m23609a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2064a m24442a(AbstractC5604c abstractC5604c, C2201d c2201d, int i) throws IOException {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        InterfaceC1809m<PointF, PointF> interfaceC1809m = null;
        C1802f c1802f = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14830a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                interfaceC1809m = C5372a.m24467b(abstractC5604c, c2201d);
            } else if (mo23595X == 2) {
                c1802f = C5378d.m24446i(abstractC5604c, c2201d);
            } else if (mo23595X == 3) {
                z2 = abstractC5604c.mo23605E();
            } else if (mo23595X != 4) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23600H() == 3;
            }
        }
        return new C2064a(str, interfaceC1809m, c1802f, z, z2);
    }
}
