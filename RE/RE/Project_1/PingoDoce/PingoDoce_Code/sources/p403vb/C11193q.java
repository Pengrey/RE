package p403vb;

import com.google.zxing.C4409m;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.q */
/* loaded from: classes2.dex */
public final class C11193q extends AbstractC11194r {

    /* renamed from: b */
    private static final AbstractC11201y[] f28751b = new AbstractC11201y[0];

    /* renamed from: a */
    private final AbstractC11201y[] f28752a;

    public C11193q(Map<EnumC4399d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC4399d.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC4392a.EAN_13)) {
                arrayList.add(new C11185i());
            } else if (collection.contains(EnumC4392a.UPC_A)) {
                arrayList.add(new C11196t());
            }
            if (collection.contains(EnumC4392a.EAN_8)) {
                arrayList.add(new C11187k());
            }
            if (collection.contains(EnumC4392a.UPC_E)) {
                arrayList.add(new C11175a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C11185i());
            arrayList.add(new C11187k());
            arrayList.add(new C11175a0());
        }
        this.f28752a = (AbstractC11201y[]) arrayList.toArray(f28751b);
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
        for (AbstractC11201y abstractC11201y : this.f28752a) {
            abstractC11201y.mo517a();
        }
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException {
        boolean z;
        int[] m5758q = AbstractC11201y.m5758q(c7154a);
        for (AbstractC11201y abstractC11201y : this.f28752a) {
            try {
                C4409m mo5761n = abstractC11201y.mo5761n(i, c7154a, m5758q, map);
                boolean z2 = mo5761n.m27649b() == EnumC4392a.EAN_13 && mo5761n.m27645f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC4399d.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(EnumC4392a.UPC_A)) {
                    z = false;
                    if (z2 || !z) {
                        return mo5761n;
                    }
                    C4409m c4409m = new C4409m(mo5761n.m27645f().substring(1), mo5761n.m27648c(), mo5761n.m27646e(), EnumC4392a.UPC_A);
                    c4409m.m27644g(mo5761n.m27647d());
                    return c4409m;
                }
                z = true;
                if (z2) {
                }
                return mo5761n;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.m27700a();
    }
}
