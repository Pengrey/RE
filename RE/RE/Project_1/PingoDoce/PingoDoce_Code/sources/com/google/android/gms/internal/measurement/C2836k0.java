package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes.dex */
public final class C2836k0 extends AbstractC3039x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2836k0() {
        this.f8079a.add(EnumC2884n0.ADD);
        this.f8079a.add(EnumC2884n0.DIVIDE);
        this.f8079a.add(EnumC2884n0.MODULUS);
        this.f8079a.add(EnumC2884n0.MULTIPLY);
        this.f8079a.add(EnumC2884n0.NEGATE);
        this.f8079a.add(EnumC2884n0.POST_DECREMENT);
        this.f8079a.add(EnumC2884n0.POST_INCREMENT);
        this.f8079a.add(EnumC2884n0.PRE_DECREMENT);
        this.f8079a.add(EnumC2884n0.PRE_INCREMENT);
        this.f8079a.add(EnumC2884n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        EnumC2884n0 enumC2884n0 = EnumC2884n0.ADD;
        int ordinal = C2969s5.m32123e(str).ordinal();
        if (ordinal == 0) {
            C2969s5.m32120h(enumC2884n0.name(), 2, list);
            InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
            if (!(m32162b instanceof InterfaceC2867m) && !(m32162b instanceof C2994u) && !(m32162b2 instanceof InterfaceC2867m) && !(m32162b2 instanceof C2994u)) {
                return new C2803i(Double.valueOf(m32162b.mo31992c().doubleValue() + m32162b2.mo31992c().doubleValue()));
            }
            String valueOf = String.valueOf(m32162b.mo31990g());
            String valueOf2 = String.valueOf(m32162b2.mo31990g());
            return new C2994u(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            C2969s5.m32120h(EnumC2884n0.DIVIDE.name(), 2, list);
            return new C2803i(Double.valueOf(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue() / c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()));
        } else if (ordinal == 59) {
            C2969s5.m32120h(EnumC2884n0.SUBTRACT.name(), 2, list);
            return new C2803i(Double.valueOf(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue() + new C2803i(Double.valueOf(-c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue())).mo31992c().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C2969s5.m32120h(str, 2, list);
            InterfaceC2931q m32162b3 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            c2952r4.m32162b((InterfaceC2931q) list.get(1));
            return m32162b3;
        } else if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    C2969s5.m32120h(EnumC2884n0.MODULUS.name(), 2, list);
                    return new C2803i(Double.valueOf(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue() % c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()));
                case 45:
                    C2969s5.m32120h(EnumC2884n0.MULTIPLY.name(), 2, list);
                    return new C2803i(Double.valueOf(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue() * c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()));
                case 46:
                    C2969s5.m32120h(EnumC2884n0.NEGATE.name(), 1, list);
                    return new C2803i(Double.valueOf(-c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()));
                default:
                    return super.m31854b(str);
            }
        } else {
            C2969s5.m32120h(str, 1, list);
            return c2952r4.m32162b((InterfaceC2931q) list.get(0));
        }
    }
}
