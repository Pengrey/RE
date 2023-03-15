package p112g0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p203kd.InterfaceC6652c;
import p489zc.C13768k;
import p489zc.C13780s;
import p489zc._ArraysJvm;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {

    /* renamed from: z */
    public static final int f15792z = 8;

    /* renamed from: w */
    private Object[] f15793w;

    /* renamed from: x */
    private List f15794x;

    /* renamed from: y */
    private int f15795y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MutableVector.kt */
    /* renamed from: g0.e$a */
    /* loaded from: classes.dex */
    public static final class C5588a<T> implements List, InterfaceC6652c {

        /* renamed from: w */
        private final MutableVector f15796w;

        public C5588a(MutableVector mutableVector) {
            Intrinsics.isThisObjectNull(mutableVector, "vector");
            this.f15796w = mutableVector;
        }

        public boolean add(Object obj) {
            return this.f15796w.m23659c(obj);
        }

        public boolean addAll(int i, Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            return this.f15796w.m23657f(i, collection);
        }

        /* renamed from: b */
        public int m23638b() {
            return this.f15796w.m23649p();
        }

        public void clear() {
            this.f15796w.m23654i();
        }

        public boolean contains(Object obj) {
            return this.f15796w.m23653j(obj);
        }

        public boolean containsAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            return this.f15796w.m23652l(collection);
        }

        /* renamed from: f */
        public Object m23637f(int i) {
            return this.f15796w.m23642w(i);
        }

        public Object get(int i) {
            return this.f15796w.m23650o()[i];
        }

        public int indexOf(Object obj) {
            return this.f15796w.m23648q(obj);
        }

        public boolean isEmpty() {
            return this.f15796w.m23647r();
        }

        public Iterator iterator() {
            return new C5590c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f15796w.m23645t(obj);
        }

        public ListIterator listIterator() {
            return new C5590c(this, 0);
        }

        public final /* bridge */ Object remove(int i) {
            return m23637f(i);
        }

        public boolean removeAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            return this.f15796w.m23643v(collection);
        }

        public boolean retainAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            return this.f15796w.m23641x(collection);
        }

        public Object set(int i, Object obj) {
            return this.f15796w.m23640y(i, obj);
        }

        public final /* bridge */ int size() {
            return m23638b();
        }

        public List subList(int i, int i2) {
            return new C5589b(this, i, i2);
        }

        public Object[] toArray() {
            return CollectionToArray.m20939a(this);
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.isThisObjectNull(objArr, "array");
            return CollectionToArray.m20938b(this, objArr);
        }

        public void add(int i, Object obj) {
            this.f15796w.m23660b(i, obj);
        }

        public boolean addAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            return this.f15796w.m23656g(collection);
        }

        public ListIterator listIterator(int i) {
            return new C5590c(this, i);
        }

        public boolean remove(Object obj) {
            return this.f15796w.m23644u(obj);
        }
    }

    /* compiled from: MutableVector.kt */
    /* renamed from: g0.e$b */
    /* loaded from: classes.dex */
    private static final class C5589b<T> implements List, InterfaceC6652c {

        /* renamed from: w */
        private final List f15797w;

        /* renamed from: x */
        private final int f15798x;

        /* renamed from: y */
        private int f15799y;

        public C5589b(List list, int i, int i2) {
            Intrinsics.isThisObjectNull(list, "list");
            this.f15797w = list;
            this.f15798x = i;
            this.f15799y = i2;
        }

        public boolean add(Object obj) {
            List list = this.f15797w;
            int i = this.f15799y;
            this.f15799y = i + 1;
            list.add(i, obj);
            return true;
        }

        public boolean addAll(int i, Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            this.f15797w.addAll(i + this.f15798x, collection);
            this.f15799y += collection.size();
            return collection.size() > 0;
        }

        /* renamed from: b */
        public int m23636b() {
            return this.f15799y - this.f15798x;
        }

        public void clear() {
            int i = this.f15799y - 1;
            int i2 = this.f15798x;
            if (i2 <= i) {
                while (true) {
                    int i3 = i - 1;
                    this.f15797w.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i = i3;
                }
            }
            this.f15799y = this.f15798x;
        }

        public boolean contains(Object obj) {
            int i = this.f15798x;
            int i2 = this.f15799y;
            while (i < i2) {
                int i3 = i + 1;
                if (Intrinsics.equals(this.f15797w.get(i), obj)) {
                    return true;
                }
                i = i3;
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public Object m23635f(int i) {
            this.f15799y--;
            return this.f15797w.remove(i + this.f15798x);
        }

        public Object get(int i) {
            return this.f15797w.get(i + this.f15798x);
        }

        public int indexOf(Object obj) {
            int i = this.f15798x;
            int i2 = this.f15799y;
            while (i < i2) {
                int i3 = i + 1;
                if (Intrinsics.equals(this.f15797w.get(i), obj)) {
                    return i - this.f15798x;
                }
                i = i3;
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f15799y == this.f15798x;
        }

        public Iterator iterator() {
            return new C5590c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f15799y - 1;
            int i2 = this.f15798x;
            if (i2 > i) {
                return -1;
            }
            while (true) {
                int i3 = i - 1;
                if (Intrinsics.equals(this.f15797w.get(i), obj)) {
                    return i - this.f15798x;
                }
                if (i == i2) {
                    return -1;
                }
                i = i3;
            }
        }

        public ListIterator listIterator() {
            return new C5590c(this, 0);
        }

        public final /* bridge */ Object remove(int i) {
            return m23635f(i);
        }

        public boolean removeAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            int i = this.f15799y;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f15799y;
        }

        public boolean retainAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            int i = this.f15799y;
            int i2 = i - 1;
            int i3 = this.f15798x;
            if (i3 <= i2) {
                while (true) {
                    int i4 = i2 - 1;
                    if (!collection.contains(this.f15797w.get(i2))) {
                        this.f15797w.remove(i2);
                        this.f15799y--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i4;
                }
            }
            return i != this.f15799y;
        }

        public Object set(int i, Object obj) {
            return this.f15797w.set(i + this.f15798x, obj);
        }

        public final /* bridge */ int size() {
            return m23636b();
        }

        public List subList(int i, int i2) {
            return new C5589b(this, i, i2);
        }

        public Object[] toArray() {
            return CollectionToArray.m20939a(this);
        }

        public Object[] toArray(Object[] objArr) {
            Intrinsics.isThisObjectNull(objArr, "array");
            return CollectionToArray.m20938b(this, objArr);
        }

        public void add(int i, Object obj) {
            this.f15797w.add(i + this.f15798x, obj);
            this.f15799y++;
        }

        public ListIterator listIterator(int i) {
            return new C5590c(this, i);
        }

        public boolean remove(Object obj) {
            int i = this.f15798x;
            int i2 = this.f15799y;
            while (i < i2) {
                int i3 = i + 1;
                if (Intrinsics.equals(this.f15797w.get(i), obj)) {
                    this.f15797w.remove(i);
                    this.f15799y--;
                    return true;
                }
                i = i3;
            }
            return false;
        }

        public boolean addAll(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "elements");
            this.f15797w.addAll(this.f15799y, collection);
            this.f15799y += collection.size();
            return collection.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    /* renamed from: g0.e$c */
    /* loaded from: classes.dex */
    private static final class C5590c<T> implements ListIterator, InterfaceC6650a {

        /* renamed from: w */
        private final List f15800w;

        /* renamed from: x */
        private int f15801x;

        public C5590c(List list, int i) {
            Intrinsics.isThisObjectNull(list, "list");
            this.f15800w = list;
            this.f15801x = i;
        }

        public void add(Object obj) {
            this.f15800w.add(this.f15801x, obj);
            this.f15801x++;
        }

        public boolean hasNext() {
            return this.f15801x < this.f15800w.size();
        }

        public boolean hasPrevious() {
            return this.f15801x > 0;
        }

        public Object next() {
            List list = this.f15800w;
            int i = this.f15801x;
            this.f15801x = i + 1;
            return list.get(i);
        }

        public int nextIndex() {
            return this.f15801x;
        }

        public Object previous() {
            int i = this.f15801x - 1;
            this.f15801x = i;
            return this.f15800w.get(i);
        }

        public int previousIndex() {
            return this.f15801x - 1;
        }

        public void remove() {
            int i = this.f15801x - 1;
            this.f15801x = i;
            this.f15800w.remove(i);
        }

        public void set(Object obj) {
            this.f15800w.set(this.f15801x, obj);
        }
    }

    public MutableVector(Object[] objArr, int i) {
        Intrinsics.isThisObjectNull(objArr, "content");
        this.f15793w = objArr;
        this.f15795y = i;
    }

    /* renamed from: b */
    public final void m23660b(int i, Object obj) {
        m23651m(this.f15795y + 1);
        Object[] objArr = this.f15793w;
        int i2 = this.f15795y;
        if (i != i2) {
            C13768k.m353i(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.f15795y++;
    }

    /* renamed from: c */
    public final boolean m23659c(Object obj) {
        m23651m(this.f15795y + 1);
        Object[] objArr = this.f15793w;
        int i = this.f15795y;
        objArr[i] = obj;
        this.f15795y = i + 1;
        return true;
    }

    /* renamed from: d */
    public final boolean m23658d(int i, MutableVector mutableVector) {
        Intrinsics.isThisObjectNull(mutableVector, "elements");
        if (mutableVector.m23647r()) {
            return false;
        }
        m23651m(this.f15795y + mutableVector.f15795y);
        Object[] objArr = this.f15793w;
        int i2 = this.f15795y;
        if (i != i2) {
            C13768k.m353i(objArr, objArr, mutableVector.f15795y + i, i, i2);
        }
        C13768k.m353i(mutableVector.f15793w, objArr, i, 0, mutableVector.f15795y);
        this.f15795y += mutableVector.f15795y;
        return true;
    }

    /* renamed from: f */
    public final boolean m23657f(int i, Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        m23651m(this.f15795y + collection.size());
        Object[] objArr = this.f15793w;
        if (i != this.f15795y) {
            C13768k.m353i(objArr, objArr, collection.size() + i, i, this.f15795y);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C13780s.m187q();
            }
            objArr[i2 + i] = t;
            i2 = i3;
        }
        this.f15795y += collection.size();
        return true;
    }

    /* renamed from: g */
    public final boolean m23656g(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return m23657f(this.f15795y, collection);
    }

    /* renamed from: h */
    public final List m23655h() {
        List list = this.f15794x;
        if (list == null) {
            C5588a c5588a = new C5588a(this);
            this.f15794x = c5588a;
            return c5588a;
        }
        return list;
    }

    /* renamed from: i */
    public final void m23654i() {
        Object[] objArr = this.f15793w;
        int m23649p = m23649p() - 1;
        if (m23649p >= 0) {
            while (true) {
                int i = m23649p - 1;
                objArr[m23649p] = null;
                if (i < 0) {
                    break;
                }
                m23649p = i;
            }
        }
        this.f15795y = 0;
    }

    /* renamed from: j */
    public final boolean m23653j(Object obj) {
        int m23649p = m23649p() - 1;
        if (m23649p >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (Intrinsics.equals(m23650o()[i], obj)) {
                    return true;
                }
                if (i == m23649p) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m23652l(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!m23653j(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m23651m(int i) {
        Object[] objArr = this.f15793w;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            this.f15793w = copyOf;
        }
    }

    /* renamed from: o */
    public final Object[] m23650o() {
        return this.f15793w;
    }

    /* renamed from: p */
    public final int m23649p() {
        return this.f15795y;
    }

    /* renamed from: q */
    public final int m23648q(Object obj) {
        int i = this.f15795y;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = this.f15793w;
            while (!Intrinsics.equals(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: r */
    public final boolean m23647r() {
        return this.f15795y == 0;
    }

    /* renamed from: s */
    public final boolean m23646s() {
        return this.f15795y != 0;
    }

    /* renamed from: t */
    public final int m23645t(Object obj) {
        int i = this.f15795y;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f15793w;
            while (!Intrinsics.equals(obj, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    /* renamed from: u */
    public final boolean m23644u(Object obj) {
        int m23648q = m23648q(obj);
        if (m23648q >= 0) {
            m23642w(m23648q);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m23643v(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.f15795y;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            m23644u(it.next());
        }
        return i != this.f15795y;
    }

    /* renamed from: w */
    public final Object m23642w(int i) {
        Object[] objArr = this.f15793w;
        Object obj = objArr[i];
        if (i != m23649p() - 1) {
            C13768k.m353i(objArr, objArr, i, i + 1, this.f15795y);
        }
        int i2 = this.f15795y - 1;
        this.f15795y = i2;
        objArr[i2] = null;
        return obj;
    }

    /* renamed from: x */
    public final boolean m23641x(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        int i = this.f15795y;
        int m23649p = m23649p() - 1;
        if (m23649p >= 0) {
            while (true) {
                int i2 = m23649p - 1;
                if (!collection.contains(m23650o()[m23649p])) {
                    m23642w(m23649p);
                }
                if (i2 < 0) {
                    break;
                }
                m23649p = i2;
            }
        }
        return i != this.f15795y;
    }

    /* renamed from: y */
    public final Object m23640y(int i, Object obj) {
        Object[] objArr = this.f15793w;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    /* renamed from: z */
    public final void m23639z(Comparator comparator) {
        Intrinsics.isThisObjectNull(comparator, "comparator");
        _ArraysJvm.m300x(this.f15793w, comparator, 0, this.f15795y);
    }
}
