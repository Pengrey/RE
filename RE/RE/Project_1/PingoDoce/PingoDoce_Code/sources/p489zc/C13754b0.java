package p489zc;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p203kd.InterfaceC6650a;

/* renamed from: zc.b0 */
/* loaded from: classes2.dex */
public final class C13754b0 implements ListIterator, InterfaceC6650a {

    /* renamed from: w */
    public static final C13754b0 f34875w = new C13754b0();

    private C13754b0() {
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a */
    public Void mo439a() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    /* renamed from: b */
    public Void mo438b() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
