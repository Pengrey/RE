package p243n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.b */
/* loaded from: classes.dex */
public class C7547b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: w */
    C7550c<K, V> f20000w;

    /* renamed from: x */
    private C7550c<K, V> f20001x;

    /* renamed from: y */
    private WeakHashMap<InterfaceC7553f<K, V>, Boolean> f20002y = new WeakHashMap<>();

    /* renamed from: z */
    private int f20003z = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$a */
    /* loaded from: classes.dex */
    public static class C7548a<K, V> extends AbstractC7552e<K, V> {
        C7548a(C7550c<K, V> c7550c, C7550c<K, V> c7550c2) {
            super(c7550c, c7550c2);
        }

        @Override // p243n.C7547b.AbstractC7552e
        /* renamed from: b */
        C7550c<K, V> mo18159b(C7550c<K, V> c7550c) {
            return c7550c.f20007z;
        }

        @Override // p243n.C7547b.AbstractC7552e
        /* renamed from: c */
        C7550c<K, V> mo18158c(C7550c<K, V> c7550c) {
            return c7550c.f20006y;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$b */
    /* loaded from: classes.dex */
    public static class C7549b<K, V> extends AbstractC7552e<K, V> {
        C7549b(C7550c<K, V> c7550c, C7550c<K, V> c7550c2) {
            super(c7550c, c7550c2);
        }

        @Override // p243n.C7547b.AbstractC7552e
        /* renamed from: b */
        C7550c<K, V> mo18159b(C7550c<K, V> c7550c) {
            return c7550c.f20006y;
        }

        @Override // p243n.C7547b.AbstractC7552e
        /* renamed from: c */
        C7550c<K, V> mo18158c(C7550c<K, V> c7550c) {
            return c7550c.f20007z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$c */
    /* loaded from: classes.dex */
    public static class C7550c<K, V> implements Map.Entry<K, V> {

        /* renamed from: w */
        final K f20004w;

        /* renamed from: x */
        final V f20005x;

        /* renamed from: y */
        C7550c<K, V> f20006y;

        /* renamed from: z */
        C7550c<K, V> f20007z;

        C7550c(K k, V v) {
            this.f20004w = k;
            this.f20005x = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C7550c) {
                C7550c c7550c = (C7550c) obj;
                return this.f20004w.equals(c7550c.f20004w) && this.f20005x.equals(c7550c.f20005x);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f20004w;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f20005x;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20004w.hashCode() ^ this.f20005x.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20004w + "=" + this.f20005x;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$d */
    /* loaded from: classes.dex */
    public class C7551d implements Iterator<Map.Entry<K, V>>, InterfaceC7553f<K, V> {

        /* renamed from: w */
        private C7550c<K, V> f20008w;

        /* renamed from: x */
        private boolean f20009x = true;

        C7551d() {
        }

        @Override // p243n.C7547b.InterfaceC7553f
        /* renamed from: a */
        public void mo18155a(C7550c<K, V> c7550c) {
            C7550c<K, V> c7550c2 = this.f20008w;
            if (c7550c == c7550c2) {
                C7550c<K, V> c7550c3 = c7550c2.f20007z;
                this.f20008w = c7550c3;
                this.f20009x = c7550c3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f20009x) {
                this.f20009x = false;
                this.f20008w = C7547b.this.f20000w;
            } else {
                C7550c<K, V> c7550c = this.f20008w;
                this.f20008w = c7550c != null ? c7550c.f20006y : null;
            }
            return this.f20008w;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20009x) {
                return C7547b.this.f20000w != null;
            }
            C7550c<K, V> c7550c = this.f20008w;
            return (c7550c == null || c7550c.f20006y == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$e */
    /* loaded from: classes.dex */
    private static abstract class AbstractC7552e<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC7553f<K, V> {

        /* renamed from: w */
        C7550c<K, V> f20011w;

        /* renamed from: x */
        C7550c<K, V> f20012x;

        AbstractC7552e(C7550c<K, V> c7550c, C7550c<K, V> c7550c2) {
            this.f20011w = c7550c2;
            this.f20012x = c7550c;
        }

        /* renamed from: e */
        private C7550c<K, V> m18156e() {
            C7550c<K, V> c7550c = this.f20012x;
            C7550c<K, V> c7550c2 = this.f20011w;
            if (c7550c == c7550c2 || c7550c2 == null) {
                return null;
            }
            return mo18158c(c7550c);
        }

        @Override // p243n.C7547b.InterfaceC7553f
        /* renamed from: a */
        public void mo18155a(C7550c<K, V> c7550c) {
            if (this.f20011w == c7550c && c7550c == this.f20012x) {
                this.f20012x = null;
                this.f20011w = null;
            }
            C7550c<K, V> c7550c2 = this.f20011w;
            if (c7550c2 == c7550c) {
                this.f20011w = mo18159b(c7550c2);
            }
            if (this.f20012x == c7550c) {
                this.f20012x = m18156e();
            }
        }

        /* renamed from: b */
        abstract C7550c<K, V> mo18159b(C7550c<K, V> c7550c);

        /* renamed from: c */
        abstract C7550c<K, V> mo18158c(C7550c<K, V> c7550c);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C7550c<K, V> c7550c = this.f20012x;
            this.f20012x = m18156e();
            return c7550c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20012x != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* renamed from: n.b$f */
    /* loaded from: classes.dex */
    public interface InterfaceC7553f<K, V> {
        /* renamed from: a */
        void mo18155a(C7550c<K, V> c7550c);
    }

    /* renamed from: b */
    public Map.Entry<K, V> m18167b() {
        return this.f20000w;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C7549b c7549b = new C7549b(this.f20001x, this.f20000w);
        this.f20002y.put(c7549b, Boolean.FALSE);
        return c7549b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7547b) {
            C7547b c7547b = (C7547b) obj;
            if (size() != c7547b.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = c7547b.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    /* renamed from: f */
    protected C7550c<K, V> mo18166f(K k) {
        C7550c<K, V> c7550c = this.f20000w;
        while (c7550c != null && !c7550c.f20004w.equals(k)) {
            c7550c = c7550c.f20006y;
        }
        return c7550c;
    }

    /* renamed from: g */
    public C7547b<K, V>.C7551d m18165g() {
        C7547b<K, V>.C7551d c7551d = new C7551d();
        this.f20002y.put(c7551d, Boolean.FALSE);
        return c7551d;
    }

    /* renamed from: h */
    public Map.Entry<K, V> m18164h() {
        return this.f20001x;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C7548a c7548a = new C7548a(this.f20000w, this.f20001x);
        this.f20002y.put(c7548a, Boolean.FALSE);
        return c7548a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public C7550c<K, V> m18163l(K k, V v) {
        C7550c<K, V> c7550c = new C7550c<>(k, v);
        this.f20003z++;
        C7550c<K, V> c7550c2 = this.f20001x;
        if (c7550c2 == null) {
            this.f20000w = c7550c;
            this.f20001x = c7550c;
            return c7550c;
        }
        c7550c2.f20006y = c7550c;
        c7550c.f20007z = c7550c2;
        this.f20001x = c7550c;
        return c7550c;
    }

    /* renamed from: o */
    public V mo18162o(K k, V v) {
        C7550c<K, V> mo18166f = mo18166f(k);
        if (mo18166f != null) {
            return mo18166f.f20005x;
        }
        m18163l(k, v);
        return null;
    }

    /* renamed from: p */
    public V mo18161p(K k) {
        C7550c<K, V> mo18166f = mo18166f(k);
        if (mo18166f == null) {
            return null;
        }
        this.f20003z--;
        if (!this.f20002y.isEmpty()) {
            for (InterfaceC7553f<K, V> interfaceC7553f : this.f20002y.keySet()) {
                interfaceC7553f.mo18155a(mo18166f);
            }
        }
        C7550c<K, V> c7550c = mo18166f.f20007z;
        if (c7550c != null) {
            c7550c.f20006y = mo18166f.f20006y;
        } else {
            this.f20000w = mo18166f.f20006y;
        }
        C7550c<K, V> c7550c2 = mo18166f.f20006y;
        if (c7550c2 != null) {
            c7550c2.f20007z = c7550c;
        } else {
            this.f20001x = c7550c;
        }
        mo18166f.f20006y = null;
        mo18166f.f20007z = null;
        return mo18166f.f20005x;
    }

    public int size() {
        return this.f20003z;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
