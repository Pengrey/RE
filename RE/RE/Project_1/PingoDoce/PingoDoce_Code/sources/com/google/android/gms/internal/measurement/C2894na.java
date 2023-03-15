package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.na */
/* loaded from: classes.dex */
public class C2894na extends AbstractMap {

    /* renamed from: A */
    private volatile C2878ma f7895A;

    /* renamed from: w */
    private final int f7897w;

    /* renamed from: z */
    private boolean f7900z;

    /* renamed from: x */
    private List f7898x = Collections.emptyList();

    /* renamed from: y */
    private Map f7899y = Collections.emptyMap();

    /* renamed from: B */
    private Map f7896B = Collections.emptyMap();

    /* renamed from: o */
    private final int m32412o(Comparable comparable) {
        int size = this.f7898x.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C2846ka) this.f7898x.get(size)).m32506b());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C2846ka) this.f7898x.get(i2)).m32506b());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final Object m32411p(int i) {
        m32409r();
        Object value = ((C2846ka) this.f7898x.remove(i)).getValue();
        if (!this.f7899y.isEmpty()) {
            Iterator it = m32410q().entrySet().iterator();
            List list = this.f7898x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C2846ka(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: q */
    private final SortedMap m32410q() {
        m32409r();
        if (this.f7899y.isEmpty() && !(this.f7899y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7899y = treeMap;
            this.f7896B = treeMap.descendingMap();
        }
        return (SortedMap) this.f7899y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m32409r() {
        if (this.f7900z) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public void mo32422b() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f7900z) {
            return;
        }
        if (this.f7899y.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f7899y);
        }
        this.f7899y = unmodifiableMap;
        if (this.f7896B.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f7896B);
        }
        this.f7896B = unmodifiableMap2;
        this.f7900z = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m32409r();
        if (!this.f7898x.isEmpty()) {
            this.f7898x.clear();
        }
        if (this.f7899y.isEmpty()) {
            return;
        }
        this.f7899y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m32412o(comparable) >= 0 || this.f7899y.containsKey(comparable);
    }

    /* renamed from: d */
    public final int m32421d() {
        return this.f7898x.size();
    }

    /* renamed from: e */
    public final Iterable m32420e() {
        return this.f7899y.isEmpty() ? C2830ja.m32530a() : this.f7899y.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f7895A == null) {
            this.f7895A = new C2878ma(this, null);
        }
        return this.f7895A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2894na)) {
            return super.equals(obj);
        }
        C2894na c2894na = (C2894na) obj;
        int size = size();
        if (size != c2894na.size()) {
            return false;
        }
        int m32421d = m32421d();
        if (m32421d == c2894na.m32421d()) {
            for (int i = 0; i < m32421d; i++) {
                if (!m32416k(i).equals(c2894na.m32416k(i))) {
                    return false;
                }
            }
            if (m32421d != size) {
                return this.f7899y.equals(c2894na.f7899y);
            }
            return true;
        }
        return entrySet().equals(c2894na.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m32412o = m32412o(comparable);
        if (m32412o >= 0) {
            return ((C2846ka) this.f7898x.get(m32412o)).getValue();
        }
        return this.f7899y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public final Object put(Comparable comparable, Object obj) {
        m32409r();
        int m32412o = m32412o(comparable);
        if (m32412o >= 0) {
            return ((C2846ka) this.f7898x.get(m32412o)).setValue(obj);
        }
        m32409r();
        if (this.f7898x.isEmpty() && !(this.f7898x instanceof ArrayList)) {
            this.f7898x = new ArrayList(this.f7897w);
        }
        int i = -(m32412o + 1);
        if (i >= this.f7897w) {
            return m32410q().put(comparable, obj);
        }
        int size = this.f7898x.size();
        int i2 = this.f7897w;
        if (size == i2) {
            C2846ka c2846ka = (C2846ka) this.f7898x.remove(i2 - 1);
            m32410q().put(c2846ka.m32506b(), c2846ka.getValue());
        }
        this.f7898x.add(i, new C2846ka(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int m32421d = m32421d();
        int i = 0;
        for (int i2 = 0; i2 < m32421d; i2++) {
            i += ((C2846ka) this.f7898x.get(i2)).hashCode();
        }
        return this.f7899y.size() > 0 ? i + this.f7899y.hashCode() : i;
    }

    /* renamed from: k */
    public final Map.Entry m32416k(int i) {
        return (Map.Entry) this.f7898x.get(i);
    }

    /* renamed from: n */
    public final boolean m32413n() {
        return this.f7900z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m32409r();
        Comparable comparable = (Comparable) obj;
        int m32412o = m32412o(comparable);
        if (m32412o >= 0) {
            return m32411p(m32412o);
        }
        if (this.f7899y.isEmpty()) {
            return null;
        }
        return this.f7899y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7898x.size() + this.f7899y.size();
    }
}
