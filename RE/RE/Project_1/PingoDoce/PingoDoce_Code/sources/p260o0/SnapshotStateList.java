package p260o0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.ExceptionsH;
import p181jd.C6447w;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p203kd.InterfaceC6652c;
import p297pd.C8611f;
import p297pd._Ranges;
import p489zc.AbstractC13762g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o0.d0 */
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements List, InterfaceC6652c {

    /* renamed from: w */
    private final C7982r f20631w;

    /* renamed from: x */
    private final int f20632x;

    /* renamed from: y */
    private int f20633y;

    /* renamed from: z */
    private int f20634z;

    /* compiled from: SnapshotStateList.kt */
    /* renamed from: o0.d0$a */
    /* loaded from: classes.dex */
    public static final class C7955a implements ListIterator, InterfaceC6650a {

        /* renamed from: w */
        final /* synthetic */ C6447w f20635w;

        /* renamed from: x */
        final /* synthetic */ SnapshotStateList f20636x;

        C7955a(C6447w c6447w, SnapshotStateList snapshotStateList) {
            this.f20635w = c6447w;
            this.f20636x = snapshotStateList;
        }

        /* renamed from: a */
        public Void m17433a(Object obj) {
            C7986s.m17257d();
            throw new ExceptionsH();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            m17433a(obj);
            throw new ExceptionsH();
        }

        /* renamed from: b */
        public Void m17432b() {
            C7986s.m17257d();
            throw new ExceptionsH();
        }

        /* renamed from: c */
        public Void m17431c(Object obj) {
            C7986s.m17257d();
            throw new ExceptionsH();
        }

        public boolean hasNext() {
            return this.f20635w.f17531w < this.f20636x.size() - 1;
        }

        public boolean hasPrevious() {
            return this.f20635w.f17531w >= 0;
        }

        public Object next() {
            int i = this.f20635w.f17531w + 1;
            C7986s.m17256e(i, this.f20636x.size());
            this.f20635w.f17531w = i;
            return this.f20636x.get(i);
        }

        public int nextIndex() {
            return this.f20635w.f17531w + 1;
        }

        public Object previous() {
            int i = this.f20635w.f17531w;
            C7986s.m17256e(i, this.f20636x.size());
            this.f20635w.f17531w = i - 1;
            return this.f20636x.get(i);
        }

        public int previousIndex() {
            return this.f20635w.f17531w;
        }

        public /* bridge */ /* synthetic */ void remove() {
            m17432b();
            throw new ExceptionsH();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            m17431c(obj);
            throw new ExceptionsH();
        }
    }

    public SnapshotStateList(C7982r c7982r, int i, int i2) {
        Intrinsics.isThisObjectNull(c7982r, "parentList");
        this.f20631w = c7982r;
        this.f20632x = i;
        this.f20633y = c7982r.m17275l();
        this.f20634z = i2 - i;
    }

    /* renamed from: l */
    private final void m17434l() {
        if (this.f20631w.m17275l() != this.f20633y) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean add(Object obj) {
        m17434l();
        this.f20631w.add(this.f20632x + size(), obj);
        this.f20634z = size() + 1;
        this.f20633y = this.f20631w.m17275l();
        return true;
    }

    public boolean addAll(int i, Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        m17434l();
        boolean addAll = this.f20631w.addAll(i + this.f20632x, collection);
        if (addAll) {
            this.f20634z = size() + collection.size();
            this.f20633y = this.f20631w.m17275l();
        }
        return addAll;
    }

    /* renamed from: b */
    public final C7982r m17437b() {
        return this.f20631w;
    }

    public void clear() {
        if (size() > 0) {
            m17434l();
            C7982r c7982r = this.f20631w;
            int i = this.f20632x;
            c7982r.m17270u(i, size() + i);
            this.f20634z = 0;
            this.f20633y = this.f20631w.m17275l();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    /* renamed from: f */
    public int m17436f() {
        return this.f20634z;
    }

    public Object get(int i) {
        m17434l();
        C7986s.m17256e(i, size());
        return this.f20631w.get(this.f20632x + i);
    }

    /* renamed from: h */
    public Object m17435h(int i) {
        m17434l();
        Object remove = this.f20631w.remove(this.f20632x + i);
        this.f20634z = size() - 1;
        this.f20633y = m17437b().m17275l();
        return remove;
    }

    public int indexOf(Object obj) {
        C8611f m14992q;
        m17434l();
        int i = this.f20632x;
        m14992q = _Ranges.m14992q(i, size() + i);
        Iterator<Integer> it = m14992q.iterator();
        while (it.hasNext()) {
            int mo404a = ((AbstractC13762g0) it).mo404a();
            if (Intrinsics.equals(obj, m17437b().get(mo404a))) {
                return mo404a - this.f20632x;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        m17434l();
        int size = this.f20632x + size();
        while (true) {
            size--;
            if (size < this.f20632x) {
                return -1;
            }
            if (Intrinsics.equals(obj, this.f20631w.get(size))) {
                return size - this.f20632x;
            }
        }
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ Object remove(int i) {
        return m17435h(i);
    }

    public boolean removeAll(Collection collection) {
        boolean z;
        Intrinsics.isThisObjectNull(collection, "elements");
        while (true) {
            for (Object obj : collection) {
                z = remove(obj) || z;
            }
            return z;
        }
    }

    public boolean retainAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        m17434l();
        C7982r c7982r = this.f20631w;
        int i = this.f20632x;
        int m17269v = c7982r.m17269v(collection, i, size() + i);
        if (m17269v > 0) {
            this.f20633y = this.f20631w.m17275l();
            this.f20634z = size() - m17269v;
        }
        return m17269v > 0;
    }

    public Object set(int i, Object obj) {
        C7986s.m17256e(i, size());
        m17434l();
        Object obj2 = this.f20631w.set(i + this.f20632x, obj);
        this.f20633y = this.f20631w.m17275l();
        return obj2;
    }

    public final /* bridge */ int size() {
        return m17436f();
    }

    public List subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > size()) {
            z = false;
        }
        if (z) {
            m17434l();
            C7982r c7982r = this.f20631w;
            int i3 = this.f20632x;
            return new SnapshotStateList(c7982r, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    public ListIterator listIterator(int i) {
        m17434l();
        C6447w c6447w = new C6447w();
        c6447w.f17531w = i - 1;
        return new C7955a(c6447w, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    public void add(int i, Object obj) {
        m17434l();
        this.f20631w.add(this.f20632x + i, obj);
        this.f20634z = size() + 1;
        this.f20633y = this.f20631w.m17275l();
    }

    public boolean addAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return addAll(size(), collection);
    }
}
