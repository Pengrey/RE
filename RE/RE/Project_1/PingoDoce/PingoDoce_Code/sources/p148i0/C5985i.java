package p148i0;

/* renamed from: i0.i */
/* loaded from: classes.dex */
public final class C5985i<E> extends AbstractC5981a<E> {

    /* renamed from: y */
    private final E f16541y;

    public C5985i(E e, int i) {
        super(i, 1);
        this.f16541y = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        m22536a();
        m22532e(m22534c() + 1);
        return this.f16541y;
    }

    @Override // java.util.ListIterator
    public E previous() {
        m22535b();
        m22532e(m22534c() - 1);
        return this.f16541y;
    }
}
