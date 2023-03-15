package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.n */
/* loaded from: classes.dex */
public class C2883n implements InterfaceC2931q, InterfaceC2867m {

    /* renamed from: w */
    final Map f7864w = new HashMap();

    /* renamed from: a */
    public final List m32461a() {
        return new ArrayList(this.f7864w.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        C2883n c2883n = new C2883n();
        for (Map.Entry entry : this.f7864w.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2867m) {
                c2883n.f7864w.put((String) entry.getKey(), (InterfaceC2931q) entry.getValue());
            } else {
                c2883n.f7864w.put((String) entry.getKey(), ((InterfaceC2931q) entry.getValue()).mo31993b());
            }
        }
        return c2883n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2883n) {
            return this.f7864w.equals(((C2883n) obj).f7864w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return C2835k.m32516b(this.f7864w);
    }

    public final int hashCode() {
        return this.f7864w.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: l */
    public final boolean mo32460l(String str) {
        return this.f7864w.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: o */
    public final InterfaceC2931q mo32459o(String str) {
        return this.f7864w.containsKey(str) ? (InterfaceC2931q) this.f7864w.get(str) : InterfaceC2931q.f7930f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        if ("toString".equals(str)) {
            return new C2994u(toString());
        }
        return C2835k.m32517a(this, new C2994u(str), c2952r4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: q */
    public final void mo32458q(String str, InterfaceC2931q interfaceC2931q) {
        if (interfaceC2931q == null) {
            this.f7864w.remove(str);
        } else {
            this.f7864w.put(str, interfaceC2931q);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f7864w.isEmpty()) {
            for (String str : this.f7864w.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f7864w.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
