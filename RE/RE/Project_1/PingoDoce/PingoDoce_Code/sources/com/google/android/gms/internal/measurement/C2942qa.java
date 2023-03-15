package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.qa */
/* loaded from: classes.dex */
public final class C2942qa extends AbstractC2819j {

    /* renamed from: y */
    final /* synthetic */ InterfaceC2960rc f7951y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2942qa(C2943qb c2943qb, String str, InterfaceC2960rc interfaceC2960rc) {
        super("getValue");
        this.f7951y = interfaceC2960rc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        C2969s5.m32120h("getValue", 2, list);
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
        InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
        String mo31408n = this.f7951y.mo31408n(m32162b.mo31990g());
        return mo31408n != null ? new C2994u(mo31408n) : m32162b2;
    }
}
