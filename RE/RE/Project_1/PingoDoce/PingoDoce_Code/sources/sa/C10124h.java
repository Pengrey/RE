package sa;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: sa.h */
/* loaded from: classes2.dex */
public final class C10124h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: D */
    private static final Comparator<Comparable> f26415D = new C10125a();

    /* renamed from: A */
    final C10131e<K, V> f26416A;

    /* renamed from: B */
    private C10124h<K, V>.C10126b f26417B;

    /* renamed from: C */
    private C10124h<K, V>.C10128c f26418C;

    /* renamed from: w */
    Comparator<? super K> f26419w;

    /* renamed from: x */
    C10131e<K, V> f26420x;

    /* renamed from: y */
    int f26421y;

    /* renamed from: z */
    int f26422z;

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: sa.h$a */
    /* loaded from: classes2.dex */
    class C10125a implements Comparator<Comparable> {
        C10125a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int mo9088a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: sa.h$b */
    /* loaded from: classes2.dex */
    class C10126b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: sa.h$b$a */
        /* loaded from: classes2.dex */
        class C10127a extends C10124h<K, V>.AbstractC10130d<Map.Entry<K, V>> {
            C10127a(C10126b c10126b) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> mo9087b() {
                return m9086a();
            }
        }

        C10126b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C10124h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C10124h.this.m9096e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C10127a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C10131e<K, V> m9096e;
            if ((obj instanceof Map.Entry) && (m9096e = C10124h.this.m9096e((Map.Entry) obj)) != null) {
                C10124h.this.m9093j(m9096e, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10124h.this.f26421y;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* renamed from: sa.h$c */
    /* loaded from: classes2.dex */
    final class C10128c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* renamed from: sa.h$c$a */
        /* loaded from: classes2.dex */
        class C10129a extends C10124h<K, V>.AbstractC10130d<K> {
            C10129a(C10128c c10128c) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m9086a().f26430B;
            }
        }

        C10128c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C10124h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C10124h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C10129a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C10124h.this.m9092k(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C10124h.this.f26421y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: sa.h$d */
    /* loaded from: classes2.dex */
    public abstract class AbstractC10130d<T> implements Iterator<T> {

        /* renamed from: w */
        C10131e<K, V> f26425w;

        /* renamed from: x */
        C10131e<K, V> f26426x = null;

        /* renamed from: y */
        int f26427y;

        AbstractC10130d() {
            this.f26425w = C10124h.this.f26416A.f26436z;
            this.f26427y = C10124h.this.f26422z;
        }

        /* renamed from: a */
        final C10131e<K, V> m9086a() {
            C10131e<K, V> c10131e = this.f26425w;
            C10124h c10124h = C10124h.this;
            if (c10131e != c10124h.f26416A) {
                if (c10124h.f26422z == this.f26427y) {
                    this.f26425w = c10131e.f26436z;
                    this.f26426x = c10131e;
                    return c10131e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f26425w != C10124h.this.f26416A;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C10131e<K, V> c10131e = this.f26426x;
            if (c10131e != null) {
                C10124h.this.m9093j(c10131e, true);
                this.f26426x = null;
                this.f26427y = C10124h.this.f26422z;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C10124h() {
        this(f26415D);
    }

    /* renamed from: b */
    private boolean m9098b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: h */
    private void m9094h(C10131e<K, V> c10131e, boolean z) {
        while (c10131e != null) {
            C10131e<K, V> c10131e2 = c10131e.f26434x;
            C10131e<K, V> c10131e3 = c10131e.f26435y;
            int i = c10131e2 != null ? c10131e2.f26432D : 0;
            int i2 = c10131e3 != null ? c10131e3.f26432D : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C10131e<K, V> c10131e4 = c10131e3.f26434x;
                C10131e<K, V> c10131e5 = c10131e3.f26435y;
                int i4 = (c10131e4 != null ? c10131e4.f26432D : 0) - (c10131e5 != null ? c10131e5.f26432D : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m9089n(c10131e3);
                    m9090m(c10131e);
                } else {
                    m9090m(c10131e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C10131e<K, V> c10131e6 = c10131e2.f26434x;
                C10131e<K, V> c10131e7 = c10131e2.f26435y;
                int i5 = (c10131e6 != null ? c10131e6.f26432D : 0) - (c10131e7 != null ? c10131e7.f26432D : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m9090m(c10131e2);
                    m9089n(c10131e);
                } else {
                    m9089n(c10131e);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c10131e.f26432D = i + 1;
                if (z) {
                    return;
                }
            } else {
                c10131e.f26432D = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c10131e = c10131e.f26433w;
        }
    }

    /* renamed from: l */
    private void m9091l(C10131e<K, V> c10131e, C10131e<K, V> c10131e2) {
        C10131e<K, V> c10131e3 = c10131e.f26433w;
        c10131e.f26433w = null;
        if (c10131e2 != null) {
            c10131e2.f26433w = c10131e3;
        }
        if (c10131e3 != null) {
            if (c10131e3.f26434x == c10131e) {
                c10131e3.f26434x = c10131e2;
                return;
            } else {
                c10131e3.f26435y = c10131e2;
                return;
            }
        }
        this.f26420x = c10131e2;
    }

    /* renamed from: m */
    private void m9090m(C10131e<K, V> c10131e) {
        C10131e<K, V> c10131e2 = c10131e.f26434x;
        C10131e<K, V> c10131e3 = c10131e.f26435y;
        C10131e<K, V> c10131e4 = c10131e3.f26434x;
        C10131e<K, V> c10131e5 = c10131e3.f26435y;
        c10131e.f26435y = c10131e4;
        if (c10131e4 != null) {
            c10131e4.f26433w = c10131e;
        }
        m9091l(c10131e, c10131e3);
        c10131e3.f26434x = c10131e;
        c10131e.f26433w = c10131e3;
        int max = Math.max(c10131e2 != null ? c10131e2.f26432D : 0, c10131e4 != null ? c10131e4.f26432D : 0) + 1;
        c10131e.f26432D = max;
        c10131e3.f26432D = Math.max(max, c10131e5 != null ? c10131e5.f26432D : 0) + 1;
    }

    /* renamed from: n */
    private void m9089n(C10131e<K, V> c10131e) {
        C10131e<K, V> c10131e2 = c10131e.f26434x;
        C10131e<K, V> c10131e3 = c10131e.f26435y;
        C10131e<K, V> c10131e4 = c10131e2.f26434x;
        C10131e<K, V> c10131e5 = c10131e2.f26435y;
        c10131e.f26434x = c10131e5;
        if (c10131e5 != null) {
            c10131e5.f26433w = c10131e;
        }
        m9091l(c10131e, c10131e2);
        c10131e2.f26435y = c10131e;
        c10131e.f26433w = c10131e2;
        int max = Math.max(c10131e3 != null ? c10131e3.f26432D : 0, c10131e5 != null ? c10131e5.f26432D : 0) + 1;
        c10131e.f26432D = max;
        c10131e2.f26432D = Math.max(max, c10131e4 != null ? c10131e4.f26432D : 0) + 1;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f26420x = null;
        this.f26421y = 0;
        this.f26422z++;
        C10131e<K, V> c10131e = this.f26416A;
        c10131e.f26429A = c10131e;
        c10131e.f26436z = c10131e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m9095f(obj) != null;
    }

    /* renamed from: d */
    C10131e<K, V> m9097d(K k, boolean z) {
        int i;
        C10131e<K, V> c10131e;
        Comparator<? super K> comparator = this.f26419w;
        C10131e<K, V> c10131e2 = this.f26420x;
        if (c10131e2 != null) {
            Comparable comparable = comparator == f26415D ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c10131e2.f26430B);
                } else {
                    i = comparator.compare(k, (K) c10131e2.f26430B);
                }
                if (i == 0) {
                    return c10131e2;
                }
                C10131e<K, V> c10131e3 = i < 0 ? c10131e2.f26434x : c10131e2.f26435y;
                if (c10131e3 == null) {
                    break;
                }
                c10131e2 = c10131e3;
            }
        } else {
            i = 0;
        }
        if (z) {
            C10131e<K, V> c10131e4 = this.f26416A;
            if (c10131e2 == null) {
                if (comparator == f26415D && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                c10131e = new C10131e<>(c10131e2, k, c10131e4, c10131e4.f26429A);
                this.f26420x = c10131e;
            } else {
                c10131e = new C10131e<>(c10131e2, k, c10131e4, c10131e4.f26429A);
                if (i < 0) {
                    c10131e2.f26434x = c10131e;
                } else {
                    c10131e2.f26435y = c10131e;
                }
                m9094h(c10131e2, true);
            }
            this.f26421y++;
            this.f26422z++;
            return c10131e;
        }
        return null;
    }

    /* renamed from: e */
    C10131e<K, V> m9096e(Map.Entry<?, ?> entry) {
        C10131e<K, V> m9095f = m9095f(entry.getKey());
        if (m9095f != null && m9098b(m9095f.f26431C, entry.getValue())) {
            return m9095f;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C10124h<K, V>.C10126b c10126b = this.f26417B;
        if (c10126b != null) {
            return c10126b;
        }
        C10124h<K, V>.C10126b c10126b2 = new C10126b();
        this.f26417B = c10126b2;
        return c10126b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    C10131e<K, V> m9095f(Object obj) {
        if (obj != 0) {
            try {
                return m9097d(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C10131e<K, V> m9095f = m9095f(obj);
        if (m9095f != null) {
            return m9095f.f26431C;
        }
        return null;
    }

    /* renamed from: j */
    void m9093j(C10131e<K, V> c10131e, boolean z) {
        int i;
        if (z) {
            C10131e<K, V> c10131e2 = c10131e.f26429A;
            c10131e2.f26436z = c10131e.f26436z;
            c10131e.f26436z.f26429A = c10131e2;
        }
        C10131e<K, V> c10131e3 = c10131e.f26434x;
        C10131e<K, V> c10131e4 = c10131e.f26435y;
        C10131e<K, V> c10131e5 = c10131e.f26433w;
        int i2 = 0;
        if (c10131e3 != null && c10131e4 != null) {
            C10131e<K, V> m9084b = c10131e3.f26432D > c10131e4.f26432D ? c10131e3.m9084b() : c10131e4.m9085a();
            m9093j(m9084b, false);
            C10131e<K, V> c10131e6 = c10131e.f26434x;
            if (c10131e6 != null) {
                i = c10131e6.f26432D;
                m9084b.f26434x = c10131e6;
                c10131e6.f26433w = m9084b;
                c10131e.f26434x = null;
            } else {
                i = 0;
            }
            C10131e<K, V> c10131e7 = c10131e.f26435y;
            if (c10131e7 != null) {
                i2 = c10131e7.f26432D;
                m9084b.f26435y = c10131e7;
                c10131e7.f26433w = m9084b;
                c10131e.f26435y = null;
            }
            m9084b.f26432D = Math.max(i, i2) + 1;
            m9091l(c10131e, m9084b);
            return;
        }
        if (c10131e3 != null) {
            m9091l(c10131e, c10131e3);
            c10131e.f26434x = null;
        } else if (c10131e4 != null) {
            m9091l(c10131e, c10131e4);
            c10131e.f26435y = null;
        } else {
            m9091l(c10131e, null);
        }
        m9094h(c10131e5, false);
        this.f26421y--;
        this.f26422z++;
    }

    /* renamed from: k */
    C10131e<K, V> m9092k(Object obj) {
        C10131e<K, V> m9095f = m9095f(obj);
        if (m9095f != null) {
            m9093j(m9095f, true);
        }
        return m9095f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C10124h<K, V>.C10128c c10128c = this.f26418C;
        if (c10128c != null) {
            return c10128c;
        }
        C10124h<K, V>.C10128c c10128c2 = new C10128c();
        this.f26418C = c10128c2;
        return c10128c2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C10131e<K, V> m9097d = m9097d(k, true);
        V v2 = m9097d.f26431C;
        m9097d.f26431C = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C10131e<K, V> m9092k = m9092k(obj);
        if (m9092k != null) {
            return m9092k.f26431C;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26421y;
    }

    public C10124h(Comparator<? super K> comparator) {
        this.f26421y = 0;
        this.f26422z = 0;
        this.f26416A = new C10131e<>();
        this.f26419w = comparator == null ? f26415D : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* renamed from: sa.h$e */
    /* loaded from: classes2.dex */
    public static final class C10131e<K, V> implements Map.Entry<K, V> {

        /* renamed from: A */
        C10131e<K, V> f26429A;

        /* renamed from: B */
        final K f26430B;

        /* renamed from: C */
        V f26431C;

        /* renamed from: D */
        int f26432D;

        /* renamed from: w */
        C10131e<K, V> f26433w;

        /* renamed from: x */
        C10131e<K, V> f26434x;

        /* renamed from: y */
        C10131e<K, V> f26435y;

        /* renamed from: z */
        C10131e<K, V> f26436z;

        C10131e() {
            this.f26430B = null;
            this.f26429A = this;
            this.f26436z = this;
        }

        /* renamed from: a */
        public C10131e<K, V> m9085a() {
            C10131e<K, V> c10131e = this;
            for (C10131e<K, V> c10131e2 = this.f26434x; c10131e2 != null; c10131e2 = c10131e2.f26434x) {
                c10131e = c10131e2;
            }
            return c10131e;
        }

        /* renamed from: b */
        public C10131e<K, V> m9084b() {
            C10131e<K, V> c10131e = this;
            for (C10131e<K, V> c10131e2 = this.f26435y; c10131e2 != null; c10131e2 = c10131e2.f26435y) {
                c10131e = c10131e2;
            }
            return c10131e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f26430B;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f26431C;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f26430B;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f26431C;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f26430B;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f26431C;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f26431C;
            this.f26431C = v;
            return v2;
        }

        public String toString() {
            return this.f26430B + "=" + this.f26431C;
        }

        C10131e(C10131e<K, V> c10131e, K k, C10131e<K, V> c10131e2, C10131e<K, V> c10131e3) {
            this.f26433w = c10131e;
            this.f26430B = k;
            this.f26432D = 1;
            this.f26436z = c10131e2;
            this.f26429A = c10131e3;
            c10131e3.f26436z = this;
            c10131e2.f26429A = this;
        }
    }
}
