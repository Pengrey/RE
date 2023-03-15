package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p297pd._Ranges;

/* renamed from: kotlinx.coroutines.internal.c0 */
/* loaded from: classes2.dex */
public final class C6856c0<T> {
    private volatile AtomicReferenceArray<T> array;

    public C6856c0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m20005a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T m20004b(int i) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m20003c(int i, T t) {
        int m15005d;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, t);
            return;
        }
        m15005d = _Ranges.m15005d(i + 1, length * 2);
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(m15005d);
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, t);
        this.array = atomicReferenceArray2;
    }
}
