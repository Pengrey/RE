package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C2835k {
    /* renamed from: a */
    public static InterfaceC2931q m32517a(InterfaceC2867m interfaceC2867m, InterfaceC2931q interfaceC2931q, C2952r4 c2952r4, List list) {
        if (interfaceC2867m.mo32460l(interfaceC2931q.mo31990g())) {
            InterfaceC2931q mo32459o = interfaceC2867m.mo32459o(interfaceC2931q.mo31990g());
            if (mo32459o instanceof AbstractC2819j) {
                return ((AbstractC2819j) mo32459o).mo32094a(c2952r4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2931q.mo31990g()));
        } else if ("hasOwnProperty".equals(interfaceC2931q.mo31990g())) {
            C2969s5.m32120h("hasOwnProperty", 1, list);
            return interfaceC2867m.mo32460l(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g()) ? InterfaceC2931q.f7935k : InterfaceC2931q.f7936l;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2931q.mo31990g()));
        }
    }

    /* renamed from: b */
    public static Iterator m32516b(Map map) {
        return new C2851l(map.keySet().iterator());
    }
}
