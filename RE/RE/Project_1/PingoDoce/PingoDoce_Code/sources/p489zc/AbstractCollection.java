package p489zc;

import id.InterfaceC6108l;
import java.util.Collection;
import p181jd.AbstractC6438m;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: zc.a */
/* loaded from: classes2.dex */
public abstract class AbstractCollection<E> implements Collection, InterfaceC6650a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: zc.a$a */
    /* loaded from: classes2.dex */
    static final class C13748a extends AbstractC6438m implements InterfaceC6108l {
        C13748a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo9587d(Object obj) {
            return obj == AbstractCollection.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int m493b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (E e : this) {
            if (Intrinsics.equals(e, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
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
        return m493b();
    }

    public Object[] toArray() {
        return CollectionToArray.m20939a(this);
    }

    public String toString() {
        String m474U;
        m474U = _Collections.m474U(this, ", ", "[", "]", 0, null, new C13748a(), 24, null);
        return m474U;
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        Object[] m20938b = CollectionToArray.m20938b(this, objArr);
        Intrinsics.m20929f(m20938b, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return m20938b;
    }
}
