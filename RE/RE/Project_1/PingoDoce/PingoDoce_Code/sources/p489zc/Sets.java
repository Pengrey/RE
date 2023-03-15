package p489zc;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: zc.e0 */
/* loaded from: classes2.dex */
public final class Sets implements Set, Serializable, InterfaceC6650a {

    /* renamed from: w */
    public static final Sets f34879w = new Sets();

    private Sets() {
    }

    private final Object readResolve() {
        return f34879w;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean m413b(Void r2) {
        Intrinsics.isThisObjectNull(r2, "element");
        return false;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return m413b((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    /* renamed from: f */
    public int m412f() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C13754b0.f34875w;
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

    public final /* bridge */ int size() {
        return m412f();
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
}
