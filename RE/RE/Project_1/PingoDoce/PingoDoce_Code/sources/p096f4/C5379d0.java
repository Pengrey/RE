package p096f4;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005a4.C0013a;
import p040c4.C2078l;
import p116g4.AbstractC5604c;
import p130h4.C5851g;

/* renamed from: f4.d0 */
/* loaded from: classes.dex */
public class C5379d0 implements InterfaceC5391j0<C2078l> {

    /* renamed from: a */
    public static final C5379d0 f14828a = new C5379d0();

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14829b = AbstractC5604c.C5605a.m23609a("c", "v", "i", "o");

    private C5379d0() {
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: b */
    public C2078l mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.BEGIN_ARRAY) {
            abstractC5604c.mo23592c();
        }
        abstractC5604c.mo23591e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (abstractC5604c.mo23580y()) {
            int mo23595X = abstractC5604c.mo23595X(f14829b);
            if (mo23595X == 0) {
                z = abstractC5604c.mo23605E();
            } else if (mo23595X == 1) {
                list = C5397p.m24419f(abstractC5604c, f);
            } else if (mo23595X == 2) {
                list2 = C5397p.m24419f(abstractC5604c, f);
            } else if (mo23595X != 3) {
                abstractC5604c.mo23594a0();
                abstractC5604c.mo23593b0();
            } else {
                list3 = C5397p.m24419f(abstractC5604c, f);
            }
        }
        abstractC5604c.mo23584t();
        if (abstractC5604c.mo23596R() == AbstractC5604c.EnumC5606b.END_ARRAY) {
            abstractC5604c.mo23589h();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new C2078l(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C0013a(C5851g.m22903a(list.get(i2), list3.get(i2)), C5851g.m22903a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C0013a(C5851g.m22903a(list.get(i3), list3.get(i3)), C5851g.m22903a(pointF3, list2.get(0)), pointF3));
            }
            return new C2078l(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
