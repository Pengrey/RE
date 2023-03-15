package p096f4;

import java.io.IOException;
import p005a4.C0016c;
import p116g4.AbstractC5604c;

/* renamed from: f4.k */
/* loaded from: classes.dex */
class C5392k {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14844a = AbstractC5604c.C5605a.m23609a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0016c m24431a(AbstractC5604c abstractC5604c) throws IOException {
        abstractC5604c.mo23591e();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14844a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                str3 = abstractC5604c.mo23597M();
            } else if (mo23595X == 2) {
                str2 = abstractC5604c.mo23597M();
            } else if (mo23595X != 3) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                f = (float) abstractC5604c.mo23603F();
            }
        }
        abstractC5604c.mo23584t();
        return new C0016c(str, str3, str2, f);
    }
}
