package p096f4;

import android.graphics.PointF;
import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import p026b4.C1798b;
import p026b4.C1801e;
import p026b4.C1805i;
import p026b4.InterfaceC1809m;
import p116g4.AbstractC5604c;
import p130h4.C5852h;
import p152i4.C6013a;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public class C5372a {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14820a = AbstractC5604c.C5605a.m23609a("k", "x", "y");

    /* renamed from: a */
    public static C1801e m24468a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY) {
            abstractC5604c.mo23592c();
            while (abstractC5604c.mo23580y()) {
                arrayList.add(C5406w.m24397a(abstractC5604c, c2201d));
            }
            abstractC5604c.mo23589h();
            C5400r.m24408b(arrayList);
        } else {
            arrayList.add(new C6013a(C5397p.m24420e(abstractC5604c, C5852h.m22886e())));
        }
        return new C1801e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1809m<PointF, PointF> m24467b(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        abstractC5604c.mo23591e();
        C1801e c1801e = null;
        C1798b c1798b = null;
        boolean z = false;
        C1798b c1798b2 = null;
        while (abstractC5604c.mo23596R() != AbstractC5604c.EnumC5606b.END_OBJECT) {
            int mo23595X = abstractC5604c.mo23595X(f14820a);
            if (mo23595X == 0) {
                c1801e = m24468a(abstractC5604c, c2201d);
            } else if (mo23595X != 1) {
                if (mo23595X != 2) {
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                } else if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.STRING) {
                    abstractC5604c.mo23593b0();
                    z = true;
                } else {
                    c1798b = C5378d.m24450e(abstractC5604c, c2201d);
                }
            } else if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.STRING) {
                abstractC5604c.mo23593b0();
                z = true;
            } else {
                c1798b2 = C5378d.m24450e(abstractC5604c, c2201d);
            }
        }
        abstractC5604c.mo23584t();
        if (z) {
            c2201d.m34431a("Lottie doesn't support expressions.");
        }
        return c1801e != null ? c1801e : new C1805i(c1798b2, c1798b);
    }
}
