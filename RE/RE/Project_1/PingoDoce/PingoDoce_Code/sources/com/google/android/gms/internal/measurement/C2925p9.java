package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.p9 */
/* loaded from: classes.dex */
public final class C2925p9 extends C2883n {

    /* renamed from: x */
    private final C2707c f7924x;

    public C2925p9(C2707c c2707c) {
        this.f7924x = c2707c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C2883n, com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            C2969s5.m32120h("getEventName", 0, list);
            return new C2994u(this.f7924x.m32827b().m32898d());
        } else if (c == 1) {
            C2969s5.m32120h("getParamValue", 1, list);
            return C2986t6.m32064b(this.f7924x.m32827b().m32899c(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g()));
        } else if (c == 2) {
            C2969s5.m32120h("getParams", 0, list);
            Map m32897e = this.f7924x.m32827b().m32897e();
            C2883n c2883n = new C2883n();
            for (String str2 : m32897e.keySet()) {
                c2883n.mo32458q(str2, C2986t6.m32064b(m32897e.get(str2)));
            }
            return c2883n;
        } else if (c == 3) {
            C2969s5.m32120h("getTimestamp", 0, list);
            return new C2803i(Double.valueOf(this.f7924x.m32827b().m32901a()));
        } else if (c != 4) {
            if (c != 5) {
                return super.mo31988p(str, c2952r4, list);
            }
            C2969s5.m32120h("setParamValue", 2, list);
            String mo31990g = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
            InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(1));
            this.f7924x.m32827b().m32895g(mo31990g, C2969s5.m32122f(m32162b));
            return m32162b;
        } else {
            C2969s5.m32120h("setEventName", 1, list);
            InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            if (!InterfaceC2931q.f7930f.equals(m32162b2) && !InterfaceC2931q.f7931g.equals(m32162b2)) {
                this.f7924x.m32827b().m32896f(m32162b2.mo31990g());
                return new C2994u(m32162b2.mo31990g());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
