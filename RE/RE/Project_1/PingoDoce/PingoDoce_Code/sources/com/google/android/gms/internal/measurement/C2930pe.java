package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.pe */
/* loaded from: classes.dex */
public final class C2930pe extends AbstractC2819j {

    /* renamed from: y */
    private final C3002u7 f7928y;

    /* renamed from: z */
    final Map f7929z;

    public C2930pe(C3002u7 c3002u7) {
        super("require");
        this.f7929z = new HashMap();
        this.f7928y = c3002u7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        InterfaceC2931q interfaceC2931q;
        C2969s5.m32120h("require", 1, list);
        String mo31990g = c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31990g();
        if (this.f7929z.containsKey(mo31990g)) {
            return (InterfaceC2931q) this.f7929z.get(mo31990g);
        }
        C3002u7 c3002u7 = this.f7928y;
        if (c3002u7.f8031a.containsKey(mo31990g)) {
            try {
                interfaceC2931q = (InterfaceC2931q) ((Callable) c3002u7.f8031a.get(mo31990g)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(mo31990g);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            interfaceC2931q = InterfaceC2931q.f7930f;
        }
        if (interfaceC2931q instanceof AbstractC2819j) {
            this.f7929z.put(mo31990g, (AbstractC2819j) interfaceC2931q);
        }
        return interfaceC2931q;
    }
}
