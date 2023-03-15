package p301q;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: q.a */
/* loaded from: classes.dex */
public class C9545a<K, V> extends C9558g<K, V> implements Map<K, V> {

    /* renamed from: D */
    C9545a<K, V>.C9546a f25092D;

    /* renamed from: E */
    C9545a<K, V>.C9548c f25093E;

    /* renamed from: F */
    C9545a<K, V>.C9550e f25094F;

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$a */
    /* loaded from: classes.dex */
    final class C9546a extends AbstractSet<Map.Entry<K, V>> {
        C9546a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C9549d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9545a.this.f25139y;
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$b */
    /* loaded from: classes.dex */
    final class C9547b extends AbstractC9555d<K> {
        C9547b() {
            super(C9545a.this.f25139y);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: a */
        protected K mo10651a(int i) {
            return C9545a.this.m10614m(i);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: b */
        protected void mo10650b(int i) {
            C9545a.this.m10612o(i);
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$d */
    /* loaded from: classes.dex */
    final class C9549d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: w */
        int f25098w;

        /* renamed from: x */
        int f25099x = -1;

        /* renamed from: y */
        boolean f25100y;

        C9549d() {
            this.f25098w = C9545a.this.f25139y - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f25099x++;
                this.f25100y = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f25100y) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return C9554c.m10655c(entry.getKey(), C9545a.this.m10614m(this.f25099x)) && C9554c.m10655c(entry.getValue(), C9545a.this.m10610q(this.f25099x));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f25100y) {
                return C9545a.this.m10614m(this.f25099x);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f25100y) {
                return C9545a.this.m10610q(this.f25099x);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25099x < this.f25098w;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f25100y) {
                K m10614m = C9545a.this.m10614m(this.f25099x);
                V m10610q = C9545a.this.m10610q(this.f25099x);
                return (m10614m == null ? 0 : m10614m.hashCode()) ^ (m10610q != null ? m10610q.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f25100y) {
                C9545a.this.m10612o(this.f25099x);
                this.f25099x--;
                this.f25098w--;
                this.f25100y = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f25100y) {
                return C9545a.this.m10611p(this.f25099x, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$f */
    /* loaded from: classes.dex */
    final class C9551f extends AbstractC9555d<V> {
        C9551f() {
            super(C9545a.this.f25139y);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: a */
        protected V mo10651a(int i) {
            return C9545a.this.m10610q(i);
        }

        @Override // p301q.AbstractC9555d
        /* renamed from: b */
        protected void mo10650b(int i) {
            C9545a.this.m10612o(i);
        }
    }

    public C9545a() {
    }

    /* renamed from: s */
    static <T> boolean m10670s(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C9545a<K, V>.C9546a c9546a = this.f25092D;
        if (c9546a == null) {
            C9545a<K, V>.C9546a c9546a2 = new C9546a();
            this.f25092D = c9546a2;
            return c9546a2;
        }
        return c9546a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        C9545a<K, V>.C9548c c9548c = this.f25093E;
        if (c9548c == null) {
            C9545a<K, V>.C9548c c9548c2 = new C9548c();
            this.f25093E = c9548c2;
            return c9548c2;
        }
        return c9548c;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m10620e(this.f25139y + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: r */
    public boolean m10671r(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public boolean m10669t(Collection<?> collection) {
        int i = this.f25139y;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f25139y;
    }

    /* renamed from: u */
    public boolean m10668u(Collection<?> collection) {
        int i = this.f25139y;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(m10614m(i2))) {
                m10612o(i2);
            }
        }
        return i != this.f25139y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    <T> T[] m10667v(T[] tArr, int i) {
        int i2 = this.f25139y;
        if (tArr.length < i2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
        }
        for (int i3 = 0; i3 < i2; i3++) {
            tArr[i3] = this.f25138x[(i3 << 1) + i];
        }
        if (tArr.length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        C9545a<K, V>.C9550e c9550e = this.f25094F;
        if (c9550e == null) {
            C9545a<K, V>.C9550e c9550e2 = new C9550e();
            this.f25094F = c9550e2;
            return c9550e2;
        }
        return c9550e;
    }

    public C9545a(int i) {
        super(i);
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$c */
    /* loaded from: classes.dex */
    final class C9548c implements Set<K> {
        C9548c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C9545a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C9545a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C9545a.this.m10671r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C9545a.m10670s(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int i2 = C9545a.this.f25139y - 1; i2 >= 0; i2--) {
                K m10614m = C9545a.this.m10614m(i2);
                i += m10614m == null ? 0 : m10614m.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C9545a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C9547b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int m10617j = C9545a.this.m10617j(obj);
            if (m10617j >= 0) {
                C9545a.this.m10612o(m10617j);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C9545a.this.m10669t(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C9545a.this.m10668u(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C9545a.this.f25139y;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i = C9545a.this.f25139y;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C9545a.this.m10614m(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C9545a.this.m10667v(tArr, 0);
        }
    }

    /* compiled from: ArrayMap.java */
    /* renamed from: q.a$e */
    /* loaded from: classes.dex */
    final class C9550e implements Collection<V> {
        C9550e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C9545a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C9545a.this.m10615l(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C9545a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C9551f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int m10615l = C9545a.this.m10615l(obj);
            if (m10615l >= 0) {
                C9545a.this.m10612o(m10615l);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i = C9545a.this.f25139y;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(C9545a.this.m10610q(i2))) {
                    C9545a.this.m10612o(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i = C9545a.this.f25139y;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(C9545a.this.m10610q(i2))) {
                    C9545a.this.m10612o(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return C9545a.this.f25139y;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i = C9545a.this.f25139y;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = C9545a.this.m10610q(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C9545a.this.m10667v(tArr, 1);
        }
    }

    public C9545a(C9558g c9558g) {
        super(c9558g);
    }
}
