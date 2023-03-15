package p489zc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: zc.c0 */
/* loaded from: classes2.dex */
public final class Collections implements List, Serializable, RandomAccess, InterfaceC6650a {

    /* renamed from: w */
    public static final Collections f34877w = new Collections();

    private Collections() {
    }

    private final Object readResolve() {
        return f34877w;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean m428b(Void r2) {
        Intrinsics.isThisObjectNull(r2, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m428b((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    /* renamed from: f */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    /* renamed from: h */
    public int m426h() {
        return 0;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return m425l((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C13754b0.f34875w;
    }

    /* renamed from: l */
    public int m425l(Void r2) {
        Intrinsics.isThisObjectNull(r2, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return m424o((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C13754b0.f34875w;
    }

    /* renamed from: o */
    public int m424o(Void r2) {
        Intrinsics.isThisObjectNull(r2, "element");
        return -1;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return m426h();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }

    public String toString() {
        return "[]";
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C13754b0.f34875w;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }
}
