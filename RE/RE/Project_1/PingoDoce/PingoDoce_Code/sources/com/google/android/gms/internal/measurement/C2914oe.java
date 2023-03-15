package com.google.android.gms.internal.measurement;

import java.util.List;
import org.joda.time.DateTimeConstants;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.oe */
/* loaded from: classes.dex */
public final class C2914oe extends AbstractC2819j {

    /* renamed from: y */
    private final C2978se f7914y;

    public C2914oe(C2978se c2978se) {
        super("internal.registerCallback");
        this.f7914y = c2978se;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        C2969s5.m32120h(this.f7794w, 3, list);
        String mo31990g = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(1));
        if (m32162b instanceof C2915p) {
            InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(2));
            if (m32162b2 instanceof C2883n) {
                C2883n c2883n = (C2883n) m32162b2;
                if (c2883n.mo32460l("type")) {
                    this.f7914y.m32093a(mo31990g, c2883n.mo32460l("priority") ? C2969s5.m32126b(c2883n.mo32459o("priority").mo31992c().doubleValue()) : DateTimeConstants.MILLIS_PER_SECOND, (C2915p) m32162b, c2883n.mo32459o("type").mo31990g());
                    return InterfaceC2931q.f7930f;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
