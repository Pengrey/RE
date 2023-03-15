package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.w */
/* loaded from: classes.dex */
public final class C3024w extends AbstractC3039x {
    public C3024w() {
        this.f8079a.add(EnumC2884n0.BITWISE_AND);
        this.f8079a.add(EnumC2884n0.BITWISE_LEFT_SHIFT);
        this.f8079a.add(EnumC2884n0.BITWISE_NOT);
        this.f8079a.add(EnumC2884n0.BITWISE_OR);
        this.f8079a.add(EnumC2884n0.BITWISE_RIGHT_SHIFT);
        this.f8079a.add(EnumC2884n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f8079a.add(EnumC2884n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        EnumC2884n0 enumC2884n0 = EnumC2884n0.ADD;
        switch (C2969s5.m32123e(str).ordinal()) {
            case 4:
                C2969s5.m32120h(EnumC2884n0.BITWISE_AND.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) & C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue())));
            case 5:
                C2969s5.m32120h(EnumC2884n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) << ((int) (C2969s5.m32124d(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()) & 31))));
            case 6:
                C2969s5.m32120h(EnumC2884n0.BITWISE_NOT.name(), 1, list);
                return new C2803i(Double.valueOf(~C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue())));
            case 7:
                C2969s5.m32120h(EnumC2884n0.BITWISE_OR.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) | C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue())));
            case 8:
                C2969s5.m32120h(EnumC2884n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) >> ((int) (C2969s5.m32124d(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()) & 31))));
            case 9:
                C2969s5.m32120h(EnumC2884n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32124d(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) >>> ((int) (C2969s5.m32124d(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()) & 31))));
            case 10:
                C2969s5.m32120h(EnumC2884n0.BITWISE_XOR.name(), 2, list);
                return new C2803i(Double.valueOf(C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue()) ^ C2969s5.m32126b(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue())));
            default:
                return super.m31854b(str);
        }
    }
}
