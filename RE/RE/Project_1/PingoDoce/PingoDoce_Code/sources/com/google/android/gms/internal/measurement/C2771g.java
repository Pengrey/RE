package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g */
/* loaded from: classes.dex */
public final class C2771g implements InterfaceC2931q {

    /* renamed from: w */
    private final boolean f7745w;

    public C2771g(Boolean bool) {
        this.f7745w = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return new C2771g(Boolean.valueOf(this.f7745w));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        return Double.valueOf(true != this.f7745w ? 0.0d : 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2771g) && this.f7745w == ((C2771g) obj).f7745w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        return Boolean.valueOf(this.f7745w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        return Boolean.toString(this.f7745w);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f7745w).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        if ("toString".equals(str)) {
            return new C2994u(Boolean.toString(this.f7745w));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f7745w), str));
    }

    public final String toString() {
        return String.valueOf(this.f7745w);
    }
}
