package p138hc;

import com.google.zxing.C4404i;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: hc.k */
/* loaded from: classes2.dex */
public class C5898k implements InterfaceC5893h {

    /* renamed from: a */
    private Collection<EnumC4392a> f16339a;

    /* renamed from: b */
    private Map<EnumC4399d, ?> f16340b;

    /* renamed from: c */
    private String f16341c;

    /* renamed from: d */
    private int f16342d;

    public C5898k() {
    }

    @Override // p138hc.InterfaceC5893h
    /* renamed from: a */
    public C5892g mo22795a(Map<EnumC4399d, ?> map) {
        EnumMap enumMap = new EnumMap(EnumC4399d.class);
        enumMap.putAll(map);
        Map<EnumC4399d, ?> map2 = this.f16340b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<EnumC4392a> collection = this.f16339a;
        if (collection != null) {
            enumMap.put((EnumMap) EnumC4399d.POSSIBLE_FORMATS, (EnumC4399d) collection);
        }
        String str = this.f16341c;
        if (str != null) {
            enumMap.put((EnumMap) EnumC4399d.CHARACTER_SET, (EnumC4399d) str);
        }
        C4404i c4404i = new C4404i();
        c4404i.m27655f(enumMap);
        int i = this.f16342d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new C5892g(c4404i);
                }
                return new C5900m(c4404i);
            }
            return new C5899l(c4404i);
        }
        return new C5892g(c4404i);
    }

    public C5898k(Collection<EnumC4392a> collection, Map<EnumC4399d, ?> map, String str, int i) {
        this.f16339a = collection;
        this.f16340b = map;
        this.f16341c = str;
        this.f16342d = i;
    }
}
