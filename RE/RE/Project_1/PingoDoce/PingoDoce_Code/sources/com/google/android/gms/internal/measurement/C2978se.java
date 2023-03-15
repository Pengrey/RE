package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.se */
/* loaded from: classes.dex */
public final class C2978se {

    /* renamed from: a */
    final TreeMap f7993a = new TreeMap();

    /* renamed from: b */
    final TreeMap f7994b = new TreeMap();

    /* renamed from: c */
    private static final int m32091c(C2952r4 c2952r4, C2915p c2915p, InterfaceC2931q interfaceC2931q) {
        InterfaceC2931q mo32094a = c2915p.mo32094a(c2952r4, Collections.singletonList(interfaceC2931q));
        if (mo32094a instanceof C2803i) {
            return C2969s5.m32126b(mo32094a.mo31992c().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m32093a(String str, int i, C2915p c2915p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f7994b;
        } else if (!"edit".equals(str2)) {
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
        } else {
            treeMap = this.f7993a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), c2915p);
    }

    /* renamed from: b */
    public final void m32092b(C2952r4 c2952r4, C2707c c2707c) {
        C2925p9 c2925p9 = new C2925p9(c2707c);
        for (Integer num : this.f7993a.keySet()) {
            C2691b clone = c2707c.m32827b().clone();
            int m32091c = m32091c(c2952r4, (C2915p) this.f7993a.get(num), c2925p9);
            if (m32091c == 2 || m32091c == -1) {
                c2707c.m32823f(clone);
            }
        }
        for (Integer num2 : this.f7994b.keySet()) {
            m32091c(c2952r4, (C2915p) this.f7994b.get(num2), c2925p9);
        }
    }
}
