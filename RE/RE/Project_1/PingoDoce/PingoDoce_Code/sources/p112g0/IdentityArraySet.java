package p112g0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p092f0.C5157c;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p489zc.C13768k;
import p489zc._ArraysJvm;

/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class IdentityArraySet<T> implements Set, InterfaceC6650a {

    /* renamed from: w */
    private int f15784w;

    /* renamed from: x */
    private Object[] f15785x = new Object[16];

    /* compiled from: IdentityArraySet.kt */
    /* renamed from: g0.c$a */
    /* loaded from: classes.dex */
    public static final class C5587a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private int f15786w;

        C5587a() {
        }

        public boolean hasNext() {
            return this.f15786w < IdentityArraySet.this.size();
        }

        public Object next() {
            Object[] m23678l = IdentityArraySet.this.m23678l();
            int i = this.f15786w;
            this.f15786w = i + 1;
            Object obj = m23678l[i];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return obj;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: b */
    private final int m23681b(Object obj) {
        int size = size() - 1;
        int m25522a = C5157c.m25522a(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = get(i2);
            int m25522a2 = C5157c.m25522a(obj2) - m25522a;
            if (m25522a2 < 0) {
                i = i2 + 1;
            } else if (m25522a2 <= 0) {
                return obj2 == obj ? i2 : m23680f(i2, obj, m25522a);
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: f */
    private final int m23680f(int i, Object obj, int i2) {
        int i3 = i - 1;
        if (i3 >= 0) {
            while (true) {
                int i4 = i3 - 1;
                Object obj2 = this.f15785x[i3];
                if (obj2 != obj) {
                    if (C5157c.m25522a(obj2) != i2 || i4 < 0) {
                        break;
                    }
                    i3 = i4;
                } else {
                    return i3;
                }
            }
        }
        int i5 = i + 1;
        int size = size();
        while (i5 < size) {
            int i6 = i5 + 1;
            Object obj3 = this.f15785x[i5];
            if (obj3 == obj) {
                return i5;
            }
            if (C5157c.m25522a(obj3) != i2) {
                return -i6;
            }
            i5 = i6;
        }
        return -(size() + 1);
    }

    public final boolean add(Object obj) {
        int i;
        Intrinsics.isThisObjectNull(obj, "value");
        if (size() > 0) {
            i = m23681b(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.f15785x;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            C13768k.m353i(objArr, objArr2, i2 + 1, i2, size());
            _ArraysJvm.m311m(this.f15785x, objArr2, 0, 0, i2, 6, null);
            this.f15785x = objArr2;
        } else {
            C13768k.m353i(objArr, objArr, i2 + 1, i2, size());
        }
        this.f15785x[i2] = obj;
        m23676p(size() + 1);
        return true;
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        int size = size();
        for (int i = 0; i < size; i++) {
            this.f15785x[i] = null;
        }
        m23676p(0);
    }

    public boolean contains(Object obj) {
        return obj != null && m23681b(obj) >= 0;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        Object obj = this.f15785x[i];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    /* renamed from: h */
    public int m23679h() {
        return this.f15784w;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new C5587a();
    }

    /* renamed from: l */
    public final Object[] m23678l() {
        return this.f15785x;
    }

    /* renamed from: o */
    public final boolean m23677o() {
        return size() > 0;
    }

    /* renamed from: p */
    public void m23676p(int i) {
        this.f15784w = i;
    }

    public final boolean remove(Object obj) {
        int m23681b;
        if (obj != null && (m23681b = m23681b(obj)) >= 0) {
            if (m23681b < size() - 1) {
                Object[] objArr = this.f15785x;
                C13768k.m353i(objArr, objArr, m23681b, m23681b + 1, size());
            }
            m23676p(size() - 1);
            this.f15785x[size()] = null;
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m23679h();
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }
}
