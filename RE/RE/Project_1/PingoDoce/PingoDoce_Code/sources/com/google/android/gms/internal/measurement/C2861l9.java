package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l9 */
/* loaded from: classes.dex */
public final class C2861l9 extends LinkedHashMap {

    /* renamed from: x */
    private static final C2861l9 f7838x;

    /* renamed from: w */
    private boolean f7839w;

    static {
        C2861l9 c2861l9 = new C2861l9();
        f7838x = c2861l9;
        c2861l9.f7839w = false;
    }

    private C2861l9() {
        this.f7839w = true;
    }

    /* renamed from: b */
    public static C2861l9 m32486b() {
        return f7838x;
    }

    /* renamed from: k */
    private static int m32481k(Object obj) {
        if (obj instanceof byte[]) {
            return C3048x8.m31828b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: l */
    private final void m32480l() {
        if (!this.f7839w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m32480l();
        super.clear();
    }

    /* renamed from: d */
    public final C2861l9 m32485d() {
        return isEmpty() ? new C2861l9() : new C2861l9(this);
    }

    /* renamed from: e */
    public final void m32484e() {
        this.f7839w = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m32483f(C2861l9 c2861l9) {
        m32480l();
        if (c2861l9.isEmpty()) {
            return;
        }
        putAll(c2861l9);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m32481k(entry.getValue()) ^ m32481k(entry.getKey());
        }
        return i;
    }

    /* renamed from: j */
    public final boolean m32482j() {
        return this.f7839w;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m32480l();
        C3048x8.m31825e(obj);
        C3048x8.m31825e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m32480l();
        for (Object obj : map.keySet()) {
            C3048x8.m31825e(obj);
            C3048x8.m31825e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m32480l();
        return super.remove(obj);
    }

    private C2861l9(Map map) {
        super(map);
        this.f7839w = true;
    }
}
