package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.g7 */
/* loaded from: classes.dex */
final class C2779g7 extends AbstractC2715c7 implements RandomAccess, InterfaceC3079z9 {

    /* renamed from: z */
    private static final C2779g7 f7750z;

    /* renamed from: x */
    private boolean[] f7751x;

    /* renamed from: y */
    private int f7752y;

    static {
        C2779g7 c2779g7 = new C2779g7(new boolean[0], 0);
        f7750z = c2779g7;
        c2779g7.zzb();
    }

    C2779g7() {
        this(new boolean[10], 0);
    }

    /* renamed from: g */
    private final String m32623g(int i) {
        int i2 = this.f7752y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: h */
    private final void m32622h(int i) {
        if (i < 0 || i >= this.f7752y) {
            throw new IndexOutOfBoundsException(m32623g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7752y)) {
            boolean[] zArr = this.f7751x;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.f7751x, i, zArr2, i + 1, this.f7752y - i);
                this.f7751x = zArr2;
            }
            this.f7751x[i] = booleanValue;
            this.f7752y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32623g(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m32808b();
        C3048x8.m31825e(collection);
        if (!(collection instanceof C2779g7)) {
            return super.addAll(collection);
        }
        C2779g7 c2779g7 = (C2779g7) collection;
        int i = c2779g7.f7752y;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7752y;
        if (Reader.READ_DONE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f7751x;
            if (i3 > zArr.length) {
                this.f7751x = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(c2779g7.f7751x, 0, this.f7751x, this.f7752y, c2779g7.f7752y);
            this.f7752y = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2779g7)) {
            return super.equals(obj);
        }
        C2779g7 c2779g7 = (C2779g7) obj;
        if (this.f7752y != c2779g7.f7752y) {
            return false;
        }
        boolean[] zArr = c2779g7.f7751x;
        for (int i = 0; i < this.f7752y; i++) {
            if (this.f7751x[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m32624f(boolean z) {
        m32808b();
        int i = this.f7752y;
        boolean[] zArr = this.f7751x;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f7751x = zArr2;
        }
        boolean[] zArr3 = this.f7751x;
        int i2 = this.f7752y;
        this.f7752y = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m32622h(i);
        return Boolean.valueOf(this.f7751x[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7752y; i2++) {
            i = (i * 31) + C3048x8.m31829a(this.f7751x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f7752y;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f7751x[i2] == booleanValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3033w8
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ InterfaceC3033w8 mo31906k(int i) {
        if (i >= this.f7752y) {
            return new C2779g7(Arrays.copyOf(this.f7751x, i), this.f7752y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m32808b();
        m32622h(i);
        boolean[] zArr = this.f7751x;
        boolean z = zArr[i];
        if (i < this.f7752y - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f7752y--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m32808b();
        if (i2 >= i) {
            boolean[] zArr = this.f7751x;
            System.arraycopy(zArr, i2, zArr, i, this.f7752y - i2);
            this.f7752y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m32808b();
        m32622h(i);
        boolean[] zArr = this.f7751x;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7752y;
    }

    private C2779g7(boolean[] zArr, int i) {
        this.f7751x = zArr;
        this.f7752y = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m32624f(((Boolean) obj).booleanValue());
        return true;
    }
}
