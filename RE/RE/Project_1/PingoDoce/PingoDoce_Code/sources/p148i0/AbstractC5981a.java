package p148i0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p203kd.InterfaceC6650a;

/* renamed from: i0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5981a<E> implements ListIterator<E>, InterfaceC6650a {

    /* renamed from: w */
    private int f16517w;

    /* renamed from: x */
    private int f16518x;

    public AbstractC5981a(int i, int i2) {
        this.f16517w = i;
        this.f16518x = i2;
    }

    /* renamed from: a */
    public final void m22536a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final void m22535b() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    public final int m22534c() {
        return this.f16517w;
    }

    /* renamed from: d */
    public final int m22533d() {
        return this.f16518x;
    }

    /* renamed from: e */
    public final void m22532e(int i) {
        this.f16517w = i;
    }

    /* renamed from: f */
    public final void m22531f(int i) {
        this.f16518x = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f16517w < this.f16518x;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f16517w > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f16517w;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f16517w - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
