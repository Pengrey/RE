package p148i0;

import java.util.NoSuchElementException;
import p181jd.Intrinsics;

/* renamed from: i0.c */
/* loaded from: classes.dex */
public final class BufferIterator<T> extends AbstractC5981a {

    /* renamed from: y */
    private final Object[] f16520y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferIterator(Object[] objArr, int i, int i2) {
        super(i, i2);
        Intrinsics.isThisObjectNull(objArr, "buffer");
        this.f16520y = objArr;
    }

    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.f16520y;
            int m22534c = m22534c();
            m22532e(m22534c + 1);
            return objArr[m22534c];
        }
        throw new NoSuchElementException();
    }

    public Object previous() {
        if (hasPrevious()) {
            Object[] objArr = this.f16520y;
            m22532e(m22534c() - 1);
            return objArr[m22534c()];
        }
        throw new NoSuchElementException();
    }
}
