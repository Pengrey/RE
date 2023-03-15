package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.a8 */
/* loaded from: classes.dex */
final class C2684a8 extends AbstractC2715c7 implements RandomAccess, InterfaceC3079z9 {

    /* renamed from: z */
    private static final C2684a8 f7639z;

    /* renamed from: x */
    private double[] f7640x;

    /* renamed from: y */
    private int f7641y;

    static {
        C2684a8 c2684a8 = new C2684a8(new double[0], 0);
        f7639z = c2684a8;
        c2684a8.zzb();
    }

    C2684a8() {
        this(new double[10], 0);
    }

    /* renamed from: g */
    private final String m32919g(int i) {
        int i2 = this.f7641y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: h */
    private final void m32918h(int i) {
        if (i < 0 || i >= this.f7641y) {
            throw new IndexOutOfBoundsException(m32919g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7641y)) {
            double[] dArr = this.f7640x;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
            } else {
                double[] dArr2 = new double[((i2 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.f7640x, i, dArr2, i + 1, this.f7641y - i);
                this.f7640x = dArr2;
            }
            this.f7640x[i] = doubleValue;
            this.f7641y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32919g(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m32808b();
        C3048x8.m31825e(collection);
        if (!(collection instanceof C2684a8)) {
            return super.addAll(collection);
        }
        C2684a8 c2684a8 = (C2684a8) collection;
        int i = c2684a8.f7641y;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7641y;
        if (Reader.READ_DONE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f7640x;
            if (i3 > dArr.length) {
                this.f7640x = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(c2684a8.f7640x, 0, this.f7640x, this.f7641y, c2684a8.f7641y);
            this.f7641y = i3;
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
        if (!(obj instanceof C2684a8)) {
            return super.equals(obj);
        }
        C2684a8 c2684a8 = (C2684a8) obj;
        if (this.f7641y != c2684a8.f7641y) {
            return false;
        }
        double[] dArr = c2684a8.f7640x;
        for (int i = 0; i < this.f7641y; i++) {
            if (Double.doubleToLongBits(this.f7640x[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m32920f(double d) {
        m32808b();
        int i = this.f7641y;
        double[] dArr = this.f7640x;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f7640x = dArr2;
        }
        double[] dArr3 = this.f7640x;
        int i2 = this.f7641y;
        this.f7641y = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m32918h(i);
        return Double.valueOf(this.f7640x[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7641y; i2++) {
            i = (i * 31) + C3048x8.m31827c(Double.doubleToLongBits(this.f7640x[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f7641y;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f7640x[i2] == doubleValue) {
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
        if (i >= this.f7641y) {
            return new C2684a8(Arrays.copyOf(this.f7640x, i), this.f7641y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m32808b();
        m32918h(i);
        double[] dArr = this.f7640x;
        double d = dArr[i];
        if (i < this.f7641y - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f7641y--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m32808b();
        if (i2 >= i) {
            double[] dArr = this.f7640x;
            System.arraycopy(dArr, i2, dArr, i, this.f7641y - i2);
            this.f7641y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m32808b();
        m32918h(i);
        double[] dArr = this.f7640x;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7641y;
    }

    private C2684a8(double[] dArr, int i) {
        this.f7640x = dArr;
        this.f7641y = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m32920f(((Double) obj).doubleValue());
        return true;
    }
}
