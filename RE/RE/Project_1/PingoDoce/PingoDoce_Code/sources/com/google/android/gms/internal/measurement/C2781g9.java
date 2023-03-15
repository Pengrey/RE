package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g9 */
/* loaded from: classes.dex */
final class C2781g9 extends AbstractC2715c7 implements RandomAccess, InterfaceC3018v8, InterfaceC3079z9 {

    /* renamed from: z */
    private static final C2781g9 f7755z;

    /* renamed from: x */
    private long[] f7756x;

    /* renamed from: y */
    private int f7757y;

    static {
        C2781g9 c2781g9 = new C2781g9(new long[0], 0);
        f7755z = c2781g9;
        c2781g9.zzb();
    }

    C2781g9() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static C2781g9 m32619f() {
        return f7755z;
    }

    /* renamed from: h */
    private final String m32617h(int i) {
        int i2 = this.f7757y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: l */
    private final void m32616l(int i) {
        if (i < 0 || i >= this.f7757y) {
            throw new IndexOutOfBoundsException(m32617h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7757y)) {
            long[] jArr = this.f7756x;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.f7756x, i, jArr2, i + 1, this.f7757y - i);
                this.f7756x = jArr2;
            }
            this.f7756x[i] = longValue;
            this.f7757y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32617h(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m32808b();
        C3048x8.m31825e(collection);
        if (!(collection instanceof C2781g9)) {
            return super.addAll(collection);
        }
        C2781g9 c2781g9 = (C2781g9) collection;
        int i = c2781g9.f7757y;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7757y;
        if (Reader.READ_DONE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f7756x;
            if (i3 > jArr.length) {
                this.f7756x = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c2781g9.f7756x, 0, this.f7756x, this.f7757y, c2781g9.f7757y);
            this.f7757y = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3018v8
    /* renamed from: e */
    public final long mo31957e(int i) {
        m32616l(i);
        return this.f7756x[i];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2781g9)) {
            return super.equals(obj);
        }
        C2781g9 c2781g9 = (C2781g9) obj;
        if (this.f7757y != c2781g9.f7757y) {
            return false;
        }
        long[] jArr = c2781g9.f7756x;
        for (int i = 0; i < this.f7757y; i++) {
            if (this.f7756x[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final void m32618g(long j) {
        m32808b();
        int i = this.f7757y;
        long[] jArr = this.f7756x;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f7756x = jArr2;
        }
        long[] jArr3 = this.f7756x;
        int i2 = this.f7757y;
        this.f7757y = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m32616l(i);
        return Long.valueOf(this.f7756x[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7757y; i2++) {
            i = (i * 31) + C3048x8.m31827c(this.f7756x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f7757y;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f7756x[i2] == longValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3033w8
    /* renamed from: n */
    public final InterfaceC3018v8 mo31906k(int i) {
        if (i >= this.f7757y) {
            return new C2781g9(Arrays.copyOf(this.f7756x, i), this.f7757y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m32808b();
        m32616l(i);
        long[] jArr = this.f7756x;
        long j = jArr[i];
        if (i < this.f7757y - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f7757y--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m32808b();
        if (i2 >= i) {
            long[] jArr = this.f7756x;
            System.arraycopy(jArr, i2, jArr, i, this.f7757y - i2);
            this.f7757y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m32808b();
        m32616l(i);
        long[] jArr = this.f7756x;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7757y;
    }

    private C2781g9(long[] jArr, int i) {
        this.f7756x = jArr;
        this.f7757y = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m32618g(((Long) obj).longValue());
        return true;
    }
}
