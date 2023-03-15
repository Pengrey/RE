package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes.dex */
public abstract class AbstractC2819j implements InterfaceC2931q, InterfaceC2867m {

    /* renamed from: w */
    protected final String f7794w;

    /* renamed from: x */
    protected final Map f7795x = new HashMap();

    public AbstractC2819j(String str) {
        this.f7794w = str;
    }

    /* renamed from: a */
    public abstract InterfaceC2931q mo32094a(C2952r4 c2952r4, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public InterfaceC2931q mo31993b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: d */
    public final String m32562d() {
        return this.f7794w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC2819j) {
            AbstractC2819j abstractC2819j = (AbstractC2819j) obj;
            String str = this.f7794w;
            if (str != null) {
                return str.equals(abstractC2819j.f7794w);
            }
            return false;
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
        return this.f7794w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return C2835k.m32516b(this.f7795x);
    }

    public final int hashCode() {
        String str = this.f7794w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: l */
    public final boolean mo32460l(String str) {
        return this.f7795x.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: o */
    public final InterfaceC2931q mo32459o(String str) {
        return this.f7795x.containsKey(str) ? (InterfaceC2931q) this.f7795x.get(str) : InterfaceC2931q.f7930f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        if ("toString".equals(str)) {
            return new C2994u(this.f7794w);
        }
        return C2835k.m32517a(this, new C2994u(str), c2952r4, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867m
    /* renamed from: q */
    public final void mo32458q(String str, InterfaceC2931q interfaceC2931q) {
        if (interfaceC2931q == null) {
            this.f7795x.remove(str);
        } else {
            this.f7795x.put(str, interfaceC2931q);
        }
    }
}
