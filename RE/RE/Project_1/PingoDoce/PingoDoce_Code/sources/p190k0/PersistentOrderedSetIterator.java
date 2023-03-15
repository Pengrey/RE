package p190k0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private Object f17789w;

    /* renamed from: x */
    private final Map f17790x;

    /* renamed from: y */
    private int f17791y;

    public PersistentOrderedSetIterator(Object obj, Map map) {
        Intrinsics.isThisObjectNull(map, "map");
        this.f17789w = obj;
        this.f17790x = map;
    }

    /* renamed from: a */
    private final void m20593a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.f17791y < this.f17790x.size();
    }

    public Object next() {
        m20593a();
        Object obj = this.f17789w;
        this.f17791y++;
        Object obj2 = this.f17790x.get(obj);
        if (obj2 != null) {
            this.f17789w = ((C6554a) obj2).m20600c();
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
