package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes.dex */
public final class C2740e0 extends AbstractC3039x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2740e0() {
        this.f8079a.add(EnumC2884n0.AND);
        this.f8079a.add(EnumC2884n0.NOT);
        this.f8079a.add(EnumC2884n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        EnumC2884n0 enumC2884n0 = EnumC2884n0.ADD;
        int ordinal = C2969s5.m32123e(str).ordinal();
        if (ordinal == 1) {
            C2969s5.m32120h(EnumC2884n0.AND.name(), 2, list);
            InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            return !m32162b.mo31991f().booleanValue() ? m32162b : c2952r4.m32162b((InterfaceC2931q) list.get(1));
        } else if (ordinal == 47) {
            C2969s5.m32120h(EnumC2884n0.NOT.name(), 1, list);
            return new C2771g(Boolean.valueOf(!c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31991f().booleanValue()));
        } else if (ordinal != 50) {
            return super.m31854b(str);
        } else {
            C2969s5.m32120h(EnumC2884n0.OR.name(), 2, list);
            InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
            return m32162b2.mo31991f().booleanValue() ? m32162b2 : c2952r4.m32162b((InterfaceC2931q) list.get(1));
        }
    }
}
