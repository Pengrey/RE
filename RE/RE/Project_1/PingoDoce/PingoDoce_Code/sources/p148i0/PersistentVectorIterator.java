package p148i0;

import p181jd.Intrinsics;
import p297pd._Ranges;

/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class PersistentVectorIterator<T> extends AbstractC5981a {

    /* renamed from: y */
    private final Object[] f16535y;

    /* renamed from: z */
    private final TrieIterator f16536z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentVectorIterator(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        int m15000i;
        Intrinsics.isThisObjectNull(objArr, "root");
        Intrinsics.isThisObjectNull(objArr2, "tail");
        this.f16535y = objArr2;
        int m22455d = C5987l.m22455d(i2);
        m15000i = _Ranges.m15000i(i, m22455d);
        this.f16536z = new TrieIterator(objArr, m15000i, m22455d, i3);
    }

    public Object next() {
        m22536a();
        if (this.f16536z.hasNext()) {
            m22532e(m22534c() + 1);
            return this.f16536z.next();
        }
        Object[] objArr = this.f16535y;
        int m22534c = m22534c();
        m22532e(m22534c + 1);
        return objArr[m22534c - this.f16536z.m22533d()];
    }

    public Object previous() {
        m22535b();
        if (m22534c() > this.f16536z.m22533d()) {
            Object[] objArr = this.f16535y;
            m22532e(m22534c() - 1);
            return objArr[m22534c() - this.f16536z.m22533d()];
        }
        m22532e(m22534c() - 1);
        return this.f16536z.previous();
    }
}
