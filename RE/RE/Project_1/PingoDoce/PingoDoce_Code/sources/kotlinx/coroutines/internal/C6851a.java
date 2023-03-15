package kotlinx.coroutines.internal;

import java.util.Objects;
import p489zc._ArraysJvm;

/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: classes2.dex */
public class C6851a<T> {

    /* renamed from: a */
    private Object[] f18297a = new Object[16];

    /* renamed from: b */
    private int f18298b;

    /* renamed from: c */
    private int f18299c;

    /* renamed from: b */
    private final void m20013b() {
        Object[] objArr = this.f18297a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        _ArraysJvm.m311m(objArr, objArr2, 0, this.f18298b, 0, 10, null);
        Object[] objArr3 = this.f18297a;
        int length2 = objArr3.length;
        int i = this.f18298b;
        _ArraysJvm.m311m(objArr3, objArr2, length2 - i, 0, i, 4, null);
        this.f18297a = objArr2;
        this.f18298b = 0;
        this.f18299c = length;
    }

    /* renamed from: a */
    public final void m20014a(T t) {
        Object[] objArr = this.f18297a;
        int i = this.f18299c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f18299c = length;
        if (length == this.f18298b) {
            m20013b();
        }
    }

    /* renamed from: c */
    public final boolean m20012c() {
        return this.f18298b == this.f18299c;
    }

    /* renamed from: d */
    public final T m20011d() {
        int i = this.f18298b;
        if (i == this.f18299c) {
            return null;
        }
        Object[] objArr = this.f18297a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f18298b = (i + 1) & (objArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
