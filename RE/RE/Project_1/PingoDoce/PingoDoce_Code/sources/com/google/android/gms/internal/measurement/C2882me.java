package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.me */
/* loaded from: classes.dex */
public final class C2882me extends AbstractC2819j {

    /* renamed from: y */
    private final InterfaceC2850ke f7863y;

    public C2882me(InterfaceC2850ke interfaceC2850ke) {
        super("internal.logger");
        this.f7863y = interfaceC2850ke;
        this.f7795x.put("log", new C2866le(this, false, true));
        this.f7795x.put("silent", new C2977sd(this, "silent"));
        ((AbstractC2819j) this.f7795x.get("silent")).mo32458q("log", new C2866le(this, true, true));
        this.f7795x.put("unmonitored", new C2834je(this, "unmonitored"));
        ((AbstractC2819j) this.f7795x.get("unmonitored")).mo32458q("log", new C2866le(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        return InterfaceC2931q.f7930f;
    }
}
