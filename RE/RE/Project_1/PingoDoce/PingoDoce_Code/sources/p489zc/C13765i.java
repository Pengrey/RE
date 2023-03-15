package p489zc;

import java.util.Collection;
import java.util.Iterator;
import p181jd.C6426b;
import p181jd.CollectionToArray;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Collections.kt */
/* renamed from: zc.i */
/* loaded from: classes2.dex */
public final class C13765i<T> implements Collection, InterfaceC6650a {

    /* renamed from: w */
    private final Object[] f34883w;

    /* renamed from: x */
    private final boolean f34884x;

    public C13765i(Object[] objArr, boolean z) {
        Intrinsics.isThisObjectNull(objArr, "values");
        this.f34883w = objArr;
        this.f34884x = z;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int m400b() {
        return this.f34883w.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        boolean m272z;
        m272z = _Arrays.m272z(this.f34883w, obj);
        return m272z;
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

    public boolean isEmpty() {
        return this.f34883w.length == 0;
    }

    public Iterator iterator() {
        return C6426b.m20963a(this.f34883w);
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
        return m400b();
    }

    public final Object[] toArray() {
        return CollectionsJVM.m203a(this.f34883w, this.f34884x);
    }

    public Object[] toArray(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        return CollectionToArray.m20938b(this, objArr);
    }
}
