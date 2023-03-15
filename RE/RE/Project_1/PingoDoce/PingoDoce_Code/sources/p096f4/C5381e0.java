package p096f4;

import android.graphics.Path;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.Collections;
import p026b4.C1797a;
import p026b4.C1800d;
import p040c4.C2079m;
import p116g4.AbstractC5604c;
import p152i4.C6013a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.e0 */
/* loaded from: classes.dex */
public class C5381e0 {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14831a = AbstractC5604c.C5605a.m23609a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2079m m24441a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        C1800d c1800d = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        String str = null;
        C1797a c1797a = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14831a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                c1797a = C5378d.m24452c(abstractC5604c, c2201d);
            } else if (mo23595X == 2) {
                c1800d = C5378d.m24447h(abstractC5604c, c2201d);
            } else if (mo23595X == 3) {
                z = abstractC5604c.mo23605E();
            } else if (mo23595X == 4) {
                i = abstractC5604c.mo23600H();
            } else if (mo23595X != 5) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                z2 = abstractC5604c.mo23605E();
            }
        }
        return new C2079m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c1797a, c1800d == null ? new C1800d(Collections.singletonList(new C6013a(100))) : c1800d, z2);
    }
}
