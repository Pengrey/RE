package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import p040c4.C2080n;
import p040c4.InterfaceC2065b;
import p116g4.AbstractC5604c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f4.f0 */
/* loaded from: classes.dex */
public class C5383f0 {

    /* renamed from: a */
    private static AbstractC5604c.C5605a f14833a = AbstractC5604c.C5605a.m23609a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2080n m24439a(AbstractC5604c abstractC5604c, C2201d c2201d) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14833a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                z = abstractC5604c.mo23605E();
            } else if (mo23595X != 2) {
                abstractC5604c.mo23593b0();
            } else {
                abstractC5604c.mo23592c();
                while (abstractC5604c.mo23580y()) {
                    InterfaceC2065b m24438a = C5384g.m24438a(abstractC5604c, c2201d);
                    if (m24438a != null) {
                        arrayList.add(m24438a);
                    }
                }
                abstractC5604c.mo23589h();
            }
        }
        return new C2080n(str, arrayList, z);
    }
}
