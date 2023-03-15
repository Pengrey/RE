package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes.dex */
public final class C3054y {

    /* renamed from: a */
    final Map f8094a = new HashMap();

    /* renamed from: b */
    final C2852l0 f8095b = new C2852l0();

    public C3054y() {
        m31816b(new C3024w());
        m31816b(new C3069z());
        m31816b(new C2676a0());
        m31816b(new C2740e0());
        m31816b(new C2820j0());
        m31816b(new C2836k0());
        m31816b(new C2868m0());
    }

    /* renamed from: a */
    public final InterfaceC2931q m31817a(C2952r4 c2952r4, InterfaceC2931q interfaceC2931q) {
        AbstractC3039x abstractC3039x;
        C2969s5.m32125c(c2952r4);
        if (interfaceC2931q instanceof C2947r) {
            C2947r c2947r = (C2947r) interfaceC2931q;
            ArrayList m32173d = c2947r.m32173d();
            String m32174a = c2947r.m32174a();
            if (this.f8094a.containsKey(m32174a)) {
                abstractC3039x = (AbstractC3039x) this.f8094a.get(m32174a);
            } else {
                abstractC3039x = this.f8095b;
            }
            return abstractC3039x.mo31735a(m32174a, c2952r4, m32173d);
        }
        return interfaceC2931q;
    }

    /* renamed from: b */
    final void m31816b(AbstractC3039x abstractC3039x) {
        for (EnumC2884n0 enumC2884n0 : abstractC3039x.f8079a) {
            this.f8094a.put(enumC2884n0.zzb().toString(), abstractC3039x);
        }
    }
}
