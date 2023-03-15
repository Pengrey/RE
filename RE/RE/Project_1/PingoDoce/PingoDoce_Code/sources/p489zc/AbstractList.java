package p489zc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: zc.b */
/* loaded from: classes2.dex */
public abstract class AbstractList<E> extends AbstractCollection implements List {

    /* renamed from: w */
    public static final C13750a f34868w = new C13750a(null);

    /* compiled from: AbstractList.kt */
    /* renamed from: zc.b$a */
    /* loaded from: classes2.dex */
    public static final class C13750a {
        private C13750a() {
        }

        public /* synthetic */ C13750a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m448a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void m447b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void m446c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void m445d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i <= i2) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean m444e(Collection collection, Collection collection2) {
            Intrinsics.isThisObjectNull(collection, "c");
            Intrinsics.isThisObjectNull(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<E> it = collection2.iterator();
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.equals(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int m443f(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "c");
            Iterator<E> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                E next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    /* renamed from: zc.b$b */
    /* loaded from: classes2.dex */
    public class C13751b implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private int f34869w;

        public C13751b() {
        }

        /* renamed from: a */
        protected final int m442a() {
            return this.f34869w;
        }

        /* renamed from: b */
        protected final void m441b(int i) {
            this.f34869w = i;
        }

        public boolean hasNext() {
            return this.f34869w < AbstractList.this.size();
        }

        public Object next() {
            if (hasNext()) {
                AbstractList abstractList = AbstractList.this;
                int i = this.f34869w;
                this.f34869w = i + 1;
                return abstractList.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    /* renamed from: zc.b$c */
    /* loaded from: classes2.dex */
    public class C13752c extends C13751b implements ListIterator {
        public C13752c(int i) {
            super();
            AbstractList.f34868w.m446c(i, AbstractList.this.size());
            m441b(i);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return m442a() > 0;
        }

        public int nextIndex() {
            return m442a();
        }

        public Object previous() {
            if (hasPrevious()) {
                AbstractList abstractList = AbstractList.this;
                m441b(m442a() - 1);
                return abstractList.get(m442a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return m442a() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: zc.b$d */
    /* loaded from: classes2.dex */
    private static final class C13753d<E> extends AbstractList implements RandomAccess {

        /* renamed from: x */
        private final AbstractList f34872x;

        /* renamed from: y */
        private final int f34873y;

        /* renamed from: z */
        private int f34874z;

        public C13753d(AbstractList abstractList, int i, int i2) {
            Intrinsics.isThisObjectNull(abstractList, "list");
            this.f34872x = abstractList;
            this.f34873y = i;
            AbstractList.f34868w.m445d(i, i2, abstractList.size());
            this.f34874z = i2 - i;
        }

        /* renamed from: b */
        public int m440b() {
            return this.f34874z;
        }

        public Object get(int i) {
            AbstractList.f34868w.m447b(i, this.f34874z);
            return this.f34872x.get(this.f34873y + i);
        }
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f34868w.m444e(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i);

    public int hashCode() {
        return f34868w.m443f(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (Intrinsics.equals(e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new C13751b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.equals(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C13752c(0);
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: subList */
    public List mo22469f(int i, int i2) {
        return new C13753d(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new C13752c(i);
    }
}
