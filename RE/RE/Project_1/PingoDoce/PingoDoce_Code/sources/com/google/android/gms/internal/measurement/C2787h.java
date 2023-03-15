package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.h */
/* loaded from: classes.dex */
public final class C2787h implements InterfaceC2931q {

    /* renamed from: w */
    private final InterfaceC2931q f7762w;

    /* renamed from: x */
    private final String f7763x;

    public C2787h() {
        throw null;
    }

    public C2787h(String str) {
        this.f7762w = InterfaceC2931q.f7930f;
        this.f7763x = str;
    }

    public C2787h(String str, InterfaceC2931q interfaceC2931q) {
        this.f7762w = interfaceC2931q;
        this.f7763x = str;
    }

    /* renamed from: a */
    public final InterfaceC2931q m32607a() {
        return this.f7762w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return new C2787h(this.f7763x, this.f7762w.mo31993b());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        throw new IllegalStateException("Control is not a double");
    }

    /* renamed from: d */
    public final String m32606d() {
        return this.f7763x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2787h) {
            C2787h c2787h = (C2787h) obj;
            return this.f7763x.equals(c2787h.f7763x) && this.f7762w.equals(c2787h.f7762w);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return null;
    }

    public final int hashCode() {
        return (this.f7763x.hashCode() * 31) + this.f7762w.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
