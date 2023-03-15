package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b */
/* loaded from: classes.dex */
public final class C2691b {

    /* renamed from: a */
    private String f7651a;

    /* renamed from: b */
    private final long f7652b;

    /* renamed from: c */
    private final Map f7653c;

    public C2691b(String str, long j, Map map) {
        this.f7651a = str;
        this.f7652b = j;
        HashMap hashMap = new HashMap();
        this.f7653c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m32901a() {
        return this.f7652b;
    }

    /* renamed from: b */
    public final C2691b clone() {
        return new C2691b(this.f7651a, this.f7652b, new HashMap(this.f7653c));
    }

    /* renamed from: c */
    public final Object m32899c(String str) {
        if (this.f7653c.containsKey(str)) {
            return this.f7653c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m32898d() {
        return this.f7651a;
    }

    /* renamed from: e */
    public final Map m32897e() {
        return this.f7653c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2691b) {
            C2691b c2691b = (C2691b) obj;
            if (this.f7652b == c2691b.f7652b && this.f7651a.equals(c2691b.f7651a)) {
                return this.f7653c.equals(c2691b.f7653c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m32896f(String str) {
        this.f7651a = str;
    }

    /* renamed from: g */
    public final void m32895g(String str, Object obj) {
        if (obj == null) {
            this.f7653c.remove(str);
        } else {
            this.f7653c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f7651a.hashCode();
        long j = this.f7652b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f7653c.hashCode();
    }

    public final String toString() {
        String str = this.f7651a;
        long j = this.f7652b;
        String obj = this.f7653c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
