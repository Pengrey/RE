package p096f4;

import java.io.IOException;
import p040c4.C2072h;
import p116g4.AbstractC5604c;

/* renamed from: f4.v */
/* loaded from: classes.dex */
class C5405v {

    /* renamed from: a */
    private static final AbstractC5604c.C5605a f14867a = AbstractC5604c.C5605a.m23609a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2072h m24398a(AbstractC5604c abstractC5604c) throws IOException {
        String str = null;
        boolean z = false;
        C2072h.EnumC2073a enumC2073a = null;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14867a);
            if (mo23595X == 0) {
                str = abstractC5604c.mo23597M();
            } else if (mo23595X == 1) {
                enumC2073a = C2072h.EnumC2073a.forId(abstractC5604c.mo23600H());
            } else if (mo23595X != 2) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                z = abstractC5604c.mo23605E();
            }
        }
        return new C2072h(str, enumC2073a, z);
    }
}
