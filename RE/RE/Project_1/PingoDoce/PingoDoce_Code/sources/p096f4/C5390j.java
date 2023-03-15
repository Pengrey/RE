package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import p005a4.C0017d;
import p040c4.C2080n;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.j */
/* loaded from: classes.dex */
public class C5390j {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14842a = AbstractC5604c.C5605a.m23609a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14843b = AbstractC5604c.C5605a.m23609a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0017d m24432a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC5604c.mo23591e();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14842a);
            if (mo23595X == 0) {
                c = abstractC5604c.mo23597M().charAt(0);
            } else if (mo23595X == 1) {
                d = abstractC5604c.mo23603F();
            } else if (mo23595X == 2) {
                d2 = abstractC5604c.mo23603F();
            } else if (mo23595X == 3) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 4) {
                str2 = abstractC5604c.mo23597M();
            } else if (mo23595X != 5) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                abstractC5604c.mo23591e();
                while (abstractC5604c.mo23580y()) {
                    if (abstractC5604c.mo23595X(f14843b) != 0) {
                        abstractC5604c.mo23594a0();
                        abstractC5604c.mo23593b0();
                    } else {
                        abstractC5604c.mo23592c();
                        while (abstractC5604c.mo23580y()) {
                            arrayList.add((C2080n) C5384g.m24438a(abstractC5604c, c2201d));
                        }
                        abstractC5604c.mo23589h();
                    }
                }
                abstractC5604c.mo23584t();
            }
        }
        abstractC5604c.mo23584t();
        return new C0017d(arrayList, c, d, d2, str, str2);
    }
}
