package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.u6 */
/* loaded from: classes.dex */
final class C3001u6 extends AbstractC2970s6 {

    /* renamed from: w */
    private final Object f8030w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3001u6(Object obj) {
        this.f8030w = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2970s6
    /* renamed from: a */
    public final Object mo32006a() {
        return this.f8030w;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2970s6
    /* renamed from: b */
    public final boolean mo32005b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof C3001u6) {
            return this.f8030w.equals(((C3001u6) obj).f8030w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8030w.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f8030w.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
