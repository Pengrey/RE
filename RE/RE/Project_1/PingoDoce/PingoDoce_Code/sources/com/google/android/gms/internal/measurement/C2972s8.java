package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s8 */
/* loaded from: classes.dex */
public final class C2972s8 extends AbstractC2819j {

    /* renamed from: y */
    private final C2707c f7983y;

    public C2972s8(C2707c c2707c) {
        super("internal.eventLogger");
        this.f7983y = c2707c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        Map hashMap;
        C2969s5.m32120h(this.f7794w, 3, list);
        String mo31990g = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
        long m32127a = (long) C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue());
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(2));
        if (m32162b instanceof C2883n) {
            hashMap = C2969s5.m32121g((C2883n) m32162b);
        } else {
            hashMap = new HashMap();
        }
        this.f7983y.m32824e(mo31990g, m32127a, hashMap);
        return InterfaceC2931q.f7930f;
    }
}
