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
import p422wb.C11610e;
import p444xb.C12340d;

/* renamed from: vb.p */
/* loaded from: classes2.dex */
public final class C11192p extends AbstractC11194r {

    /* renamed from: b */
    private static final AbstractC11194r[] f28749b = new AbstractC11194r[0];

    /* renamed from: a */
    private final AbstractC11194r[] f28750a;

    public C11192p(Map<EnumC4399d, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(EnumC4399d.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(EnumC4399d.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC4392a.EAN_13) || collection.contains(EnumC4392a.UPC_A) || collection.contains(EnumC4392a.EAN_8) || collection.contains(EnumC4392a.UPC_E)) {
                arrayList.add(new C11193q(map));
            }
            if (collection.contains(EnumC4392a.CODE_39)) {
                arrayList.add(new C11181e(z));
            }
            if (collection.contains(EnumC4392a.CODE_93)) {
                arrayList.add(new C11183g());
            }
            if (collection.contains(EnumC4392a.CODE_128)) {
                arrayList.add(new C11178c());
            }
            if (collection.contains(EnumC4392a.ITF)) {
                arrayList.add(new C11190n());
            }
            if (collection.contains(EnumC4392a.CODABAR)) {
                arrayList.add(new C11174a());
            }
            if (collection.contains(EnumC4392a.RSS_14)) {
                arrayList.add(new C11610e());
            }
            if (collection.contains(EnumC4392a.RSS_EXPANDED)) {
                arrayList.add(new C12340d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C11193q(map));
            arrayList.add(new C11181e());
            arrayList.add(new C11174a());
            arrayList.add(new C11183g());
            arrayList.add(new C11178c());
            arrayList.add(new C11190n());
            arrayList.add(new C11610e());
            arrayList.add(new C12340d());
        }
        this.f28750a = (AbstractC11194r[]) arrayList.toArray(f28749b);
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
        for (AbstractC11194r abstractC11194r : this.f28750a) {
            abstractC11194r.mo517a();
        }
    }

    @Override // p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException {
        for (AbstractC11194r abstractC11194r : this.f28750a) {
            try {
                return abstractC11194r.mo3036d(i, c7154a, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.m27700a();
    }
}
