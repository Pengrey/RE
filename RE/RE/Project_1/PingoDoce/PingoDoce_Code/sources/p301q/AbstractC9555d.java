package p301q;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q.d */
/* loaded from: classes.dex */
public abstract class AbstractC9555d<T> implements Iterator<T> {

    /* renamed from: w */
    private int f25117w;

    /* renamed from: x */
    private int f25118x;

    /* renamed from: y */
    private boolean f25119y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9555d(int i) {
        this.f25117w = i;
    }

    /* renamed from: a */
    protected abstract T mo10651a(int i);

    /* renamed from: b */
    protected abstract void mo10650b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25118x < this.f25117w;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T mo10651a = mo10651a(this.f25118x);
            this.f25118x++;
            this.f25119y = true;
            return mo10651a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f25119y) {
            int i = this.f25118x - 1;
            this.f25118x = i;
            mo10650b(i);
            this.f25117w--;
            this.f25119y = false;
            return;
        }
        throw new IllegalStateException();
    }
}
