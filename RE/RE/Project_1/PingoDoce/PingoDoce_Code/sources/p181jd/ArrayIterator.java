package p181jd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jd.a */
/* loaded from: classes2.dex */
public final class ArrayIterator<T> implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private final Object[] f17512w;

    /* renamed from: x */
    private int f17513x;

    public ArrayIterator(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "array");
        this.f17512w = objArr;
    }

    public boolean hasNext() {
        return this.f17513x < this.f17512w.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.f17512w;
            int i = this.f17513x;
            this.f17513x = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f17513x--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
