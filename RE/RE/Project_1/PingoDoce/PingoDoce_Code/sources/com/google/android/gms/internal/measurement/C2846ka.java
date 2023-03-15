package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ka */
/* loaded from: classes.dex */
public final class C2846ka implements Map.Entry, Comparable {

    /* renamed from: w */
    private final Comparable f7825w;

    /* renamed from: x */
    private Object f7826x;

    /* renamed from: y */
    final /* synthetic */ C2894na f7827y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2846ka(C2894na c2894na, Comparable comparable, Object obj) {
        this.f7827y = c2894na;
        this.f7825w = comparable;
        this.f7826x = obj;
    }

    /* renamed from: c */
    private static final boolean m32505c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable m32506b() {
        return this.f7825w;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f7825w.compareTo(((C2846ka) obj).f7825w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m32505c(this.f7825w, entry.getKey()) && m32505c(this.f7826x, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f7825w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7826x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f7825w;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7826x;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7827y.m32409r();
        Object obj2 = this.f7826x;
        this.f7826x = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7825w);
        String valueOf2 = String.valueOf(this.f7826x);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
