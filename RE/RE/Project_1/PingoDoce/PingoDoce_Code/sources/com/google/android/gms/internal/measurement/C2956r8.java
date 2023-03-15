package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r8 */
/* loaded from: classes.dex */
final class C2956r8 extends AbstractC2715c7 implements RandomAccess, InterfaceC3003u8, InterfaceC3079z9 {

    /* renamed from: z */
    private static final C2956r8 f7971z;

    /* renamed from: x */
    private int[] f7972x;

    /* renamed from: y */
    private int f7973y;

    static {
        C2956r8 c2956r8 = new C2956r8(new int[0], 0);
        f7971z = c2956r8;
        c2956r8.zzb();
    }

    C2956r8() {
        this(new int[10], 0);
    }

    /* renamed from: g */
    public static C2956r8 m32141g() {
        return f7971z;
    }

    /* renamed from: l */
    private final String m32139l(int i) {
        int i2 = this.f7973y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: o */
    private final void m32138o(int i) {
        if (i < 0 || i >= this.f7973y) {
            throw new IndexOutOfBoundsException(m32139l(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3033w8
    /* renamed from: A */
    public final InterfaceC3003u8 mo31906k(int i) {
        if (i >= this.f7973y) {
            return new C2956r8(Arrays.copyOf(this.f7972x, i), this.f7973y);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7973y)) {
            int[] iArr = this.f7972x;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
            } else {
                int[] iArr2 = new int[((i2 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.f7972x, i, iArr2, i + 1, this.f7973y - i);
                this.f7972x = iArr2;
            }
            this.f7972x[i] = intValue;
            this.f7973y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32139l(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m32808b();
        C3048x8.m31825e(collection);
        if (!(collection instanceof C2956r8)) {
            return super.addAll(collection);
        }
        C2956r8 c2956r8 = (C2956r8) collection;
        int i = c2956r8.f7973y;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7973y;
        if (Reader.READ_DONE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f7972x;
            if (i3 > iArr.length) {
                this.f7972x = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c2956r8.f7972x, 0, this.f7972x, this.f7973y, c2956r8.f7973y);
            this.f7973y = i3;
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
        if (!(obj instanceof C2956r8)) {
            return super.equals(obj);
        }
        C2956r8 c2956r8 = (C2956r8) obj;
        if (this.f7973y != c2956r8.f7973y) {
            return false;
        }
        int[] iArr = c2956r8.f7972x;
        for (int i = 0; i < this.f7973y; i++) {
            if (this.f7972x[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final int m32142f(int i) {
        m32138o(i);
        return this.f7972x[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m32138o(i);
        return Integer.valueOf(this.f7972x[i]);
    }

    /* renamed from: h */
    public final void m32140h(int i) {
        m32808b();
        int i2 = this.f7973y;
        int[] iArr = this.f7972x;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f7972x = iArr2;
        }
        int[] iArr3 = this.f7972x;
        int i3 = this.f7973y;
        this.f7973y = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7973y; i2++) {
            i = (i * 31) + this.f7972x[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f7973y;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f7972x[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m32808b();
        m32138o(i);
        int[] iArr = this.f7972x;
        int i3 = iArr[i];
        if (i < this.f7973y - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f7973y--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m32808b();
        if (i2 >= i) {
            int[] iArr = this.f7972x;
            System.arraycopy(iArr, i2, iArr, i, this.f7973y - i2);
            this.f7973y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m32808b();
        m32138o(i);
        int[] iArr = this.f7972x;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7973y;
    }

    private C2956r8(int[] iArr, int i) {
        this.f7972x = iArr;
        this.f7973y = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m32140h(((Integer) obj).intValue());
        return true;
    }
}
