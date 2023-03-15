package p096f4;

import com.airbnb.lottie.C2201d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p116g4.AbstractC5604c;
import p152i4.C6013a;
import p459y3.C13091h;

/* renamed from: f4.r */
/* loaded from: classes.dex */
class C5400r {

    /* renamed from: a */
    static AbstractC5604c.C5605a f14858a = AbstractC5604c.C5605a.m23609a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<C6013a<T>> m24409a(AbstractC5604c abstractC5604c, C2201d c2201d, float f, InterfaceC5391j0<T> interfaceC5391j0, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.STRING) {
            c2201d.m34431a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC5604c.mo23591e();
        while (abstractC5604c.mo23580y()) {
            if (abstractC5604c.mo23595X(f14858a) != 0) {
                abstractC5604c.mo23593b0();
            } else if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY) {
                abstractC5604c.mo23592c();
                if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.NUMBER) {
                    arrayList.add(C5399q.m24415c(abstractC5604c, c2201d, f, interfaceC5391j0, false, z));
                } else {
                    while (abstractC5604c.mo23580y()) {
                        arrayList.add(C5399q.m24415c(abstractC5604c, c2201d, f, interfaceC5391j0, true, z));
                    }
                }
                abstractC5604c.mo23589h();
            } else {
                arrayList.add(C5399q.m24415c(abstractC5604c, c2201d, f, interfaceC5391j0, false, z));
            }
        }
        abstractC5604c.mo23584t();
        m24408b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m24408b(List<? extends C6013a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C6013a<T> c6013a = list.get(i2);
            i2++;
            C6013a<T> c6013a2 = list.get(i2);
            c6013a.f16609h = Float.valueOf(c6013a2.f16608g);
            if (c6013a.f16604c == null && (t = c6013a2.f16603b) != null) {
                c6013a.f16604c = t;
                if (c6013a instanceof C13091h) {
                    ((C13091h) c6013a).m1658i();
                }
            }
        }
        C6013a<T> c6013a3 = list.get(i);
        if ((c6013a3.f16603b == null || c6013a3.f16604c == null) && list.size() > 1) {
            list.remove(c6013a3);
        }
    }
}
