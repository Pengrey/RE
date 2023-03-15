package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* loaded from: classes.dex */
final class C3061y6 implements Serializable, InterfaceC3016v6 {

    /* renamed from: w */
    final Object f8100w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3061y6(Object obj) {
        this.f8100w = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof C3061y6) {
            Object obj2 = this.f8100w;
            Object obj3 = ((C3061y6) obj).f8100w;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8100w});
    }

    public final String toString() {
        String obj = this.f8100w.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3016v6
    public final Object zza() {
        return this.f8100w;
    }
}
