package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r */
/* loaded from: classes.dex */
public final class C2947r implements InterfaceC2931q {

    /* renamed from: w */
    private final String f7955w;

    /* renamed from: x */
    private final ArrayList f7956x;

    public C2947r(String str, List list) {
        this.f7955w = str;
        ArrayList arrayList = new ArrayList();
        this.f7956x = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m32174a() {
        return this.f7955w;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: c */
    public final Double mo31992c() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    /* renamed from: d */
    public final ArrayList m32173d() {
        return this.f7956x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2947r) {
            C2947r c2947r = (C2947r) obj;
            String str = this.f7955w;
            if (str == null ? c2947r.f7955w == null : str.equals(c2947r.f7955w)) {
                return this.f7956x.equals(c2947r.f7956x);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: f */
    public final Boolean mo31991f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: g */
    public final String mo31990g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: h */
    public final Iterator mo31989h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f7955w;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f7956x.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: p */
    public final InterfaceC2931q mo31988p(String str, C2952r4 c2952r4, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
