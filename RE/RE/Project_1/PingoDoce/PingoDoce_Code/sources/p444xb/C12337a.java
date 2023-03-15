package p444xb;

import java.util.List;
import p239mb.C7154a;

/* renamed from: xb.a */
/* loaded from: classes2.dex */
final class C12337a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7154a m3053a(List<C12338b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).m3050c() == null) {
            size--;
        }
        C7154a c7154a = new C7154a(size * 12);
        int i = 0;
        int m4615b = list.get(0).m3050c().m4615b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & m4615b) != 0) {
                c7154a.m19067q(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C12338b c12338b = list.get(i3);
            int m4615b2 = c12338b.m3051b().m4615b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & m4615b2) != 0) {
                    c7154a.m19067q(i);
                }
                i++;
            }
            if (c12338b.m3050c() != null) {
                int m4615b3 = c12338b.m3050c().m4615b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & m4615b3) != 0) {
                        c7154a.m19067q(i);
                    }
                    i++;
                }
            }
        }
        return c7154a;
    }
}
