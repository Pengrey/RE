package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import p026b4.C1804h;
import p040c4.C2081o;
import p116g4.AbstractC5604c;

/* renamed from: f4.g0 */
/* loaded from: classes.dex */
class C5385g0 {

    /* renamed from: a */
    static AbstractC5604c.C5605a f14835a = AbstractC5604c.C5605a.m23609a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2081o m24437a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        int i = 0;
        String str = null;
        C1804h c1804h = null;
        boolean z = false;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14835a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                i = abstractC5604c.mo23600H();
            } else if (mo23595X == 2) {
                c1804h = C5378d.m24444k(abstractC5604c, c2201d);
            } else if (mo23595X != 3) {
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23605E();
            }
        }
        return new C2081o(str, i, c1804h, z);
    }
}
