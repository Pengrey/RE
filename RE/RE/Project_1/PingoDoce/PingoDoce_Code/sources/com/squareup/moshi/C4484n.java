package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.n */
/* loaded from: classes2.dex */
public final class C4484n<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: E */
    private static final Comparator<Comparable> f12107E = new C4485a();

    /* renamed from: A */
    int f12108A;

    /* renamed from: B */
    int f12109B;

    /* renamed from: C */
    private C4484n<K, V>.C4488d f12110C;

    /* renamed from: D */
    private C4484n<K, V>.C4490e f12111D;

    /* renamed from: w */
    final Comparator<? super K> f12112w;

    /* renamed from: x */
    C4493g<K, V>[] f12113x;

    /* renamed from: y */
    final C4493g<K, V> f12114y;

    /* renamed from: z */
    int f12115z;

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$a */
    /* loaded from: classes2.dex */
    class C4485a implements Comparator<Comparable> {
        C4485a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$b */
    /* loaded from: classes2.dex */
    public static final class C4486b<K, V> {

        /* renamed from: a */
        private C4493g<K, V> f12116a;

        /* renamed from: b */
        private int f12117b;

        /* renamed from: c */
        private int f12118c;

        /* renamed from: d */
        private int f12119d;

        C4486b() {
        }

        /* renamed from: a */
        void m27382a(C4493g<K, V> c4493g) {
            c4493g.f12134y = null;
            c4493g.f12132w = null;
            c4493g.f12133x = null;
            c4493g.f12131E = 1;
            int i = this.f12117b;
            if (i > 0) {
                int i2 = this.f12119d;
                if ((i2 & 1) == 0) {
                    this.f12119d = i2 + 1;
                    this.f12117b = i - 1;
                    this.f12118c++;
                }
            }
            c4493g.f12132w = this.f12116a;
            this.f12116a = c4493g;
            int i3 = this.f12119d + 1;
            this.f12119d = i3;
            int i4 = this.f12117b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f12119d = i3 + 1;
                this.f12117b = i4 - 1;
                this.f12118c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f12119d & i6) != i6) {
                    return;
                }
                int i7 = this.f12118c;
                if (i7 == 0) {
                    C4493g<K, V> c4493g2 = this.f12116a;
                    C4493g<K, V> c4493g3 = c4493g2.f12132w;
                    C4493g<K, V> c4493g4 = c4493g3.f12132w;
                    c4493g3.f12132w = c4493g4.f12132w;
                    this.f12116a = c4493g3;
                    c4493g3.f12133x = c4493g4;
                    c4493g3.f12134y = c4493g2;
                    c4493g3.f12131E = c4493g2.f12131E + 1;
                    c4493g4.f12132w = c4493g3;
                    c4493g2.f12132w = c4493g3;
                } else if (i7 == 1) {
                    C4493g<K, V> c4493g5 = this.f12116a;
                    C4493g<K, V> c4493g6 = c4493g5.f12132w;
                    this.f12116a = c4493g6;
                    c4493g6.f12134y = c4493g5;
                    c4493g6.f12131E = c4493g5.f12131E + 1;
                    c4493g5.f12132w = c4493g6;
                    this.f12118c = 0;
                } else if (i7 == 2) {
                    this.f12118c = 0;
                }
                i5 *= 2;
            }
        }

        /* renamed from: b */
        void m27381b(int i) {
            this.f12117b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f12119d = 0;
            this.f12118c = 0;
            this.f12116a = null;
        }

        /* renamed from: c */
        C4493g<K, V> m27380c() {
            C4493g<K, V> c4493g = this.f12116a;
            if (c4493g.f12132w == null) {
                return c4493g;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$c */
    /* loaded from: classes2.dex */
    public static class C4487c<K, V> {

        /* renamed from: a */
        private C4493g<K, V> f12120a;

        C4487c() {
        }

        /* renamed from: a */
        public C4493g<K, V> m27379a() {
            C4493g<K, V> c4493g = this.f12120a;
            if (c4493g == null) {
                return null;
            }
            C4493g<K, V> c4493g2 = c4493g.f12132w;
            c4493g.f12132w = null;
            C4493g<K, V> c4493g3 = c4493g.f12134y;
            while (true) {
                C4493g<K, V> c4493g4 = c4493g2;
                c4493g2 = c4493g3;
                if (c4493g2 != null) {
                    c4493g2.f12132w = c4493g4;
                    c4493g3 = c4493g2.f12133x;
                } else {
                    this.f12120a = c4493g4;
                    return c4493g;
                }
            }
        }

        /* renamed from: b */
        void m27378b(C4493g<K, V> c4493g) {
            C4493g<K, V> c4493g2 = null;
            while (c4493g != null) {
                c4493g.f12132w = c4493g2;
                c4493g2 = c4493g;
                c4493g = c4493g.f12133x;
            }
            this.f12120a = c4493g2;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$d */
    /* loaded from: classes2.dex */
    final class C4488d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap.java */
        /* renamed from: com.squareup.moshi.n$d$a */
        /* loaded from: classes2.dex */
        class C4489a extends C4484n<K, V>.AbstractC4492f<Map.Entry<K, V>> {
            C4489a(C4488d c4488d) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return m27376a();
            }
        }

        C4488d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4484n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C4484n.this.m27392h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C4489a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C4493g<K, V> m27392h;
            if ((obj instanceof Map.Entry) && (m27392h = C4484n.this.m27392h((Map.Entry) obj)) != null) {
                C4484n.this.m27389l(m27392h, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4484n.this.f12115z;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$e */
    /* loaded from: classes2.dex */
    final class C4490e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap.java */
        /* renamed from: com.squareup.moshi.n$e$a */
        /* loaded from: classes2.dex */
        class C4491a extends C4484n<K, V>.AbstractC4492f<K> {
            C4491a(C4490e c4490e) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m27376a().f12128B;
            }
        }

        C4490e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C4484n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C4484n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C4491a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C4484n.this.m27388m(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4484n.this.f12115z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$f */
    /* loaded from: classes2.dex */
    public abstract class AbstractC4492f<T> implements Iterator<T> {

        /* renamed from: w */
        C4493g<K, V> f12123w;

        /* renamed from: x */
        C4493g<K, V> f12124x = null;

        /* renamed from: y */
        int f12125y;

        AbstractC4492f() {
            this.f12123w = C4484n.this.f12114y.f12135z;
            this.f12125y = C4484n.this.f12108A;
        }

        /* renamed from: a */
        final C4493g<K, V> m27376a() {
            C4493g<K, V> c4493g = this.f12123w;
            C4484n c4484n = C4484n.this;
            if (c4493g != c4484n.f12114y) {
                if (c4484n.f12108A == this.f12125y) {
                    this.f12123w = c4493g.f12135z;
                    this.f12124x = c4493g;
                    return c4493g;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12123w != C4484n.this.f12114y;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C4493g<K, V> c4493g = this.f12124x;
            if (c4493g != null) {
                C4484n.this.m27389l(c4493g, true);
                this.f12124x = null;
                this.f12125y = C4484n.this.f12108A;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4484n() {
        this(null);
    }

    /* renamed from: b */
    private void m27396b() {
        C4493g<K, V>[] m27395d = m27395d(this.f12113x);
        this.f12113x = m27395d;
        this.f12109B = (m27395d.length / 2) + (m27395d.length / 4);
    }

    /* renamed from: d */
    static <K, V> C4493g<K, V>[] m27395d(C4493g<K, V>[] c4493gArr) {
        int length = c4493gArr.length;
        C4493g<K, V>[] c4493gArr2 = new C4493g[length * 2];
        C4487c c4487c = new C4487c();
        C4486b c4486b = new C4486b();
        C4486b c4486b2 = new C4486b();
        for (int i = 0; i < length; i++) {
            C4493g<K, V> c4493g = c4493gArr[i];
            if (c4493g != null) {
                c4487c.m27378b(c4493g);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C4493g<K, V> m27379a = c4487c.m27379a();
                    if (m27379a == null) {
                        break;
                    } else if ((m27379a.f12129C & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c4486b.m27381b(i2);
                c4486b2.m27381b(i3);
                c4487c.m27378b(c4493g);
                while (true) {
                    C4493g<K, V> m27379a2 = c4487c.m27379a();
                    if (m27379a2 == null) {
                        break;
                    } else if ((m27379a2.f12129C & length) == 0) {
                        c4486b.m27382a(m27379a2);
                    } else {
                        c4486b2.m27382a(m27379a2);
                    }
                }
                c4493gArr2[i] = i2 > 0 ? c4486b.m27380c() : null;
                c4493gArr2[i + length] = i3 > 0 ? c4486b2.m27380c() : null;
            }
        }
        return c4493gArr2;
    }

    /* renamed from: e */
    private boolean m27394e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: k */
    private void m27390k(C4493g<K, V> c4493g, boolean z) {
        while (c4493g != null) {
            C4493g<K, V> c4493g2 = c4493g.f12133x;
            C4493g<K, V> c4493g3 = c4493g.f12134y;
            int i = c4493g2 != null ? c4493g2.f12131E : 0;
            int i2 = c4493g3 != null ? c4493g3.f12131E : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C4493g<K, V> c4493g4 = c4493g3.f12133x;
                C4493g<K, V> c4493g5 = c4493g3.f12134y;
                int i4 = (c4493g4 != null ? c4493g4.f12131E : 0) - (c4493g5 != null ? c4493g5.f12131E : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m27385p(c4493g3);
                }
                m27386o(c4493g);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C4493g<K, V> c4493g6 = c4493g2.f12133x;
                C4493g<K, V> c4493g7 = c4493g2.f12134y;
                int i5 = (c4493g6 != null ? c4493g6.f12131E : 0) - (c4493g7 != null ? c4493g7.f12131E : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m27386o(c4493g2);
                }
                m27385p(c4493g);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c4493g.f12131E = i + 1;
                if (z) {
                    return;
                }
            } else {
                c4493g.f12131E = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c4493g = c4493g.f12132w;
        }
    }

    /* renamed from: n */
    private void m27387n(C4493g<K, V> c4493g, C4493g<K, V> c4493g2) {
        C4493g<K, V> c4493g3 = c4493g.f12132w;
        c4493g.f12132w = null;
        if (c4493g2 != null) {
            c4493g2.f12132w = c4493g3;
        }
        if (c4493g3 != null) {
            if (c4493g3.f12133x == c4493g) {
                c4493g3.f12133x = c4493g2;
                return;
            } else {
                c4493g3.f12134y = c4493g2;
                return;
            }
        }
        int i = c4493g.f12129C;
        C4493g<K, V>[] c4493gArr = this.f12113x;
        c4493gArr[i & (c4493gArr.length - 1)] = c4493g2;
    }

    /* renamed from: o */
    private void m27386o(C4493g<K, V> c4493g) {
        C4493g<K, V> c4493g2 = c4493g.f12133x;
        C4493g<K, V> c4493g3 = c4493g.f12134y;
        C4493g<K, V> c4493g4 = c4493g3.f12133x;
        C4493g<K, V> c4493g5 = c4493g3.f12134y;
        c4493g.f12134y = c4493g4;
        if (c4493g4 != null) {
            c4493g4.f12132w = c4493g;
        }
        m27387n(c4493g, c4493g3);
        c4493g3.f12133x = c4493g;
        c4493g.f12132w = c4493g3;
        int max = Math.max(c4493g2 != null ? c4493g2.f12131E : 0, c4493g4 != null ? c4493g4.f12131E : 0) + 1;
        c4493g.f12131E = max;
        c4493g3.f12131E = Math.max(max, c4493g5 != null ? c4493g5.f12131E : 0) + 1;
    }

    /* renamed from: p */
    private void m27385p(C4493g<K, V> c4493g) {
        C4493g<K, V> c4493g2 = c4493g.f12133x;
        C4493g<K, V> c4493g3 = c4493g.f12134y;
        C4493g<K, V> c4493g4 = c4493g2.f12133x;
        C4493g<K, V> c4493g5 = c4493g2.f12134y;
        c4493g.f12133x = c4493g5;
        if (c4493g5 != null) {
            c4493g5.f12132w = c4493g;
        }
        m27387n(c4493g, c4493g2);
        c4493g2.f12134y = c4493g;
        c4493g.f12132w = c4493g2;
        int max = Math.max(c4493g3 != null ? c4493g3.f12131E : 0, c4493g5 != null ? c4493g5.f12131E : 0) + 1;
        c4493g.f12131E = max;
        c4493g2.f12131E = Math.max(max, c4493g4 != null ? c4493g4.f12131E : 0) + 1;
    }

    /* renamed from: q */
    private static int m27384q(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f12113x, (Object) null);
        this.f12115z = 0;
        this.f12108A++;
        C4493g<K, V> c4493g = this.f12114y;
        C4493g<K, V> c4493g2 = c4493g.f12135z;
        while (c4493g2 != c4493g) {
            C4493g<K, V> c4493g3 = c4493g2.f12135z;
            c4493g2.f12127A = null;
            c4493g2.f12135z = null;
            c4493g2 = c4493g3;
        }
        c4493g.f12127A = c4493g;
        c4493g.f12135z = c4493g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m27391j(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C4484n<K, V>.C4488d c4488d = this.f12110C;
        if (c4488d != null) {
            return c4488d;
        }
        C4484n<K, V>.C4488d c4488d2 = new C4488d();
        this.f12110C = c4488d2;
        return c4488d2;
    }

    /* renamed from: f */
    C4493g<K, V> m27393f(K k, boolean z) {
        int i;
        C4493g<K, V> c4493g;
        Comparator<? super K> comparator = this.f12112w;
        C4493g<K, V>[] c4493gArr = this.f12113x;
        int m27384q = m27384q(k.hashCode());
        int length = (c4493gArr.length - 1) & m27384q;
        C4493g<K, V> c4493g2 = c4493gArr[length];
        if (c4493g2 != null) {
            Comparable comparable = comparator == f12107E ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c4493g2.f12128B);
                } else {
                    i = comparator.compare(k, (K) c4493g2.f12128B);
                }
                if (i == 0) {
                    return c4493g2;
                }
                C4493g<K, V> c4493g3 = i < 0 ? c4493g2.f12133x : c4493g2.f12134y;
                if (c4493g3 == null) {
                    break;
                }
                c4493g2 = c4493g3;
            }
        } else {
            i = 0;
        }
        C4493g<K, V> c4493g4 = c4493g2;
        int i2 = i;
        if (z) {
            C4493g<K, V> c4493g5 = this.f12114y;
            if (c4493g4 == null) {
                if (comparator == f12107E && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                c4493g = new C4493g<>(c4493g4, k, m27384q, c4493g5, c4493g5.f12127A);
                c4493gArr[length] = c4493g;
            } else {
                c4493g = new C4493g<>(c4493g4, k, m27384q, c4493g5, c4493g5.f12127A);
                if (i2 < 0) {
                    c4493g4.f12133x = c4493g;
                } else {
                    c4493g4.f12134y = c4493g;
                }
                m27390k(c4493g4, true);
            }
            int i3 = this.f12115z;
            this.f12115z = i3 + 1;
            if (i3 > this.f12109B) {
                m27396b();
            }
            this.f12108A++;
            return c4493g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C4493g<K, V> m27391j = m27391j(obj);
        if (m27391j != null) {
            return m27391j.f12130D;
        }
        return null;
    }

    /* renamed from: h */
    C4493g<K, V> m27392h(Map.Entry<?, ?> entry) {
        C4493g<K, V> m27391j = m27391j(entry.getKey());
        if (m27391j != null && m27394e(m27391j.f12130D, entry.getValue())) {
            return m27391j;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    C4493g<K, V> m27391j(Object obj) {
        if (obj != 0) {
            try {
                return m27393f(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C4484n<K, V>.C4490e c4490e = this.f12111D;
        if (c4490e != null) {
            return c4490e;
        }
        C4484n<K, V>.C4490e c4490e2 = new C4490e();
        this.f12111D = c4490e2;
        return c4490e2;
    }

    /* renamed from: l */
    void m27389l(C4493g<K, V> c4493g, boolean z) {
        int i;
        if (z) {
            C4493g<K, V> c4493g2 = c4493g.f12127A;
            c4493g2.f12135z = c4493g.f12135z;
            c4493g.f12135z.f12127A = c4493g2;
            c4493g.f12127A = null;
            c4493g.f12135z = null;
        }
        C4493g<K, V> c4493g3 = c4493g.f12133x;
        C4493g<K, V> c4493g4 = c4493g.f12134y;
        C4493g<K, V> c4493g5 = c4493g.f12132w;
        int i2 = 0;
        if (c4493g3 != null && c4493g4 != null) {
            C4493g<K, V> m27374b = c4493g3.f12131E > c4493g4.f12131E ? c4493g3.m27374b() : c4493g4.m27375a();
            m27389l(m27374b, false);
            C4493g<K, V> c4493g6 = c4493g.f12133x;
            if (c4493g6 != null) {
                i = c4493g6.f12131E;
                m27374b.f12133x = c4493g6;
                c4493g6.f12132w = m27374b;
                c4493g.f12133x = null;
            } else {
                i = 0;
            }
            C4493g<K, V> c4493g7 = c4493g.f12134y;
            if (c4493g7 != null) {
                i2 = c4493g7.f12131E;
                m27374b.f12134y = c4493g7;
                c4493g7.f12132w = m27374b;
                c4493g.f12134y = null;
            }
            m27374b.f12131E = Math.max(i, i2) + 1;
            m27387n(c4493g, m27374b);
            return;
        }
        if (c4493g3 != null) {
            m27387n(c4493g, c4493g3);
            c4493g.f12133x = null;
        } else if (c4493g4 != null) {
            m27387n(c4493g, c4493g4);
            c4493g.f12134y = null;
        } else {
            m27387n(c4493g, null);
        }
        m27390k(c4493g5, false);
        this.f12115z--;
        this.f12108A++;
    }

    /* renamed from: m */
    C4493g<K, V> m27388m(Object obj) {
        C4493g<K, V> m27391j = m27391j(obj);
        if (m27391j != null) {
            m27389l(m27391j, true);
        }
        return m27391j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C4493g<K, V> m27393f = m27393f(k, true);
        V v2 = m27393f.f12130D;
        m27393f.f12130D = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C4493g<K, V> m27388m = m27388m(obj);
        if (m27388m != null) {
            return m27388m.f12130D;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12115z;
    }

    C4484n(Comparator<? super K> comparator) {
        this.f12115z = 0;
        this.f12108A = 0;
        this.f12112w = comparator == null ? f12107E : comparator;
        this.f12114y = new C4493g<>();
        C4493g<K, V>[] c4493gArr = new C4493g[16];
        this.f12113x = c4493gArr;
        this.f12109B = (c4493gArr.length / 2) + (c4493gArr.length / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedHashTreeMap.java */
    /* renamed from: com.squareup.moshi.n$g */
    /* loaded from: classes2.dex */
    public static final class C4493g<K, V> implements Map.Entry<K, V> {

        /* renamed from: A */
        C4493g<K, V> f12127A;

        /* renamed from: B */
        final K f12128B;

        /* renamed from: C */
        final int f12129C;

        /* renamed from: D */
        V f12130D;

        /* renamed from: E */
        int f12131E;

        /* renamed from: w */
        C4493g<K, V> f12132w;

        /* renamed from: x */
        C4493g<K, V> f12133x;

        /* renamed from: y */
        C4493g<K, V> f12134y;

        /* renamed from: z */
        C4493g<K, V> f12135z;

        C4493g() {
            this.f12128B = null;
            this.f12129C = -1;
            this.f12127A = this;
            this.f12135z = this;
        }

        /* renamed from: a */
        public C4493g<K, V> m27375a() {
            C4493g<K, V> c4493g = this;
            for (C4493g<K, V> c4493g2 = this.f12133x; c4493g2 != null; c4493g2 = c4493g2.f12133x) {
                c4493g = c4493g2;
            }
            return c4493g;
        }

        /* renamed from: b */
        public C4493g<K, V> m27374b() {
            C4493g<K, V> c4493g = this;
            for (C4493g<K, V> c4493g2 = this.f12134y; c4493g2 != null; c4493g2 = c4493g2.f12134y) {
                c4493g = c4493g2;
            }
            return c4493g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f12128B;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.f12130D;
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
            return this.f12128B;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12130D;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f12128B;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f12130D;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f12130D;
            this.f12130D = v;
            return v2;
        }

        public String toString() {
            return this.f12128B + "=" + this.f12130D;
        }

        C4493g(C4493g<K, V> c4493g, K k, int i, C4493g<K, V> c4493g2, C4493g<K, V> c4493g3) {
            this.f12132w = c4493g;
            this.f12128B = k;
            this.f12129C = i;
            this.f12131E = 1;
            this.f12135z = c4493g2;
            this.f12127A = c4493g3;
            c4493g3.f12135z = this;
            c4493g2.f12127A = this;
        }
    }
}
