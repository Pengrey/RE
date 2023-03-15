package p096f4;

import android.graphics.Path;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.Collections;
import p026b4.C1799c;
import p026b4.C1800d;
import p026b4.C1802f;
import p040c4.C2067d;
import p040c4.EnumC2069f;
import p116g4.AbstractC5604c;
import p152i4.C6013a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.m */
/* loaded from: classes.dex */
public class C5394m {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14846a = AbstractC5604c.C5605a.m23609a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14847b = AbstractC5604c.C5605a.m23609a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2067d m24427a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        C1800d c1800d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        EnumC2069f enumC2069f = null;
        C1799c c1799c = null;
        C1802f c1802f = null;
        C1802f c1802f2 = null;
        boolean z = false;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14846a)) {
                case 0:
                    str = abstractC5604c.mo23597M();
                    break;
                case 1:
                    int i = -1;
                    abstractC5604c.mo23591e();
                    while (abstractC5604c.mo23580y()) {
                        int mo23595X = abstractC5604c.mo23595X(f14847b);
                        if (mo23595X == 0) {
                            i = abstractC5604c.mo23600H();
                        } else if (mo23595X != 1) {
                            abstractC5604c.mo23594a0();
                            abstractC5604c.mo23593b0();
                        } else {
                            c1799c = C5378d.m24448g(abstractC5604c, c2201d, i);
                        }
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
                    fillType = abstractC5604c.mo23600H() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = abstractC5604c.mo23605E();
                    break;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        return new C2067d(str, enumC2069f, fillType, c1799c, c1800d == null ? new C1800d(Collections.singletonList(new C6013a(100))) : c1800d, c1802f, c1802f2, null, null, z);
    }
}
