package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k8 */
/* loaded from: classes.dex */
final class C2844k8 extends AbstractC2715c7 implements RandomAccess, InterfaceC3079z9 {

    /* renamed from: z */
    private static final C2844k8 f7822z;

    /* renamed from: x */
    private float[] f7823x;

    /* renamed from: y */
    private int f7824y;

    static {
        C2844k8 c2844k8 = new C2844k8(new float[0], 0);
        f7822z = c2844k8;
        c2844k8.zzb();
    }

    C2844k8() {
        this(new float[10], 0);
    }

    /* renamed from: g */
    private final String m32508g(int i) {
        int i2 = this.f7824y;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i);
        sb2.append(", Size:");
        sb2.append(i2);
        return sb2.toString();
    }

    /* renamed from: h */
    private final void m32507h(int i) {
        if (i < 0 || i >= this.f7824y) {
            throw new IndexOutOfBoundsException(m32508g(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m32808b();
        if (i >= 0 && i <= (i2 = this.f7824y)) {
            float[] fArr = this.f7823x;
            if (i2 < fArr.length) {
                System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
            } else {
                float[] fArr2 = new float[((i2 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i);
                System.arraycopy(this.f7823x, i, fArr2, i + 1, this.f7824y - i);
                this.f7823x = fArr2;
            }
            this.f7823x[i] = floatValue;
            this.f7824y++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m32508g(i));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m32808b();
        C3048x8.m31825e(collection);
        if (!(collection instanceof C2844k8)) {
            return super.addAll(collection);
        }
        C2844k8 c2844k8 = (C2844k8) collection;
        int i = c2844k8.f7824y;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7824y;
        if (Reader.READ_DONE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f7823x;
            if (i3 > fArr.length) {
                this.f7823x = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c2844k8.f7823x, 0, this.f7823x, this.f7824y, c2844k8.f7824y);
            this.f7824y = i3;
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
        if (!(obj instanceof C2844k8)) {
            return super.equals(obj);
        }
        C2844k8 c2844k8 = (C2844k8) obj;
        if (this.f7824y != c2844k8.f7824y) {
            return false;
        }
        float[] fArr = c2844k8.f7823x;
        for (int i = 0; i < this.f7824y; i++) {
            if (Float.floatToIntBits(this.f7823x[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m32509f(float f) {
        m32808b();
        int i = this.f7824y;
        float[] fArr = this.f7823x;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f7823x = fArr2;
        }
        float[] fArr3 = this.f7823x;
        int i2 = this.f7824y;
        this.f7824y = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m32507h(i);
        return Float.valueOf(this.f7823x[i]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7824y; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f7823x[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f7824y;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f7823x[i2] == floatValue) {
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
        if (i >= this.f7824y) {
            return new C2844k8(Arrays.copyOf(this.f7823x, i), this.f7824y);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m32808b();
        m32507h(i);
        float[] fArr = this.f7823x;
        float f = fArr[i];
        if (i < this.f7824y - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f7824y--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        m32808b();
        if (i2 >= i) {
            float[] fArr = this.f7823x;
            System.arraycopy(fArr, i2, fArr, i, this.f7824y - i2);
            this.f7824y -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m32808b();
        m32507h(i);
        float[] fArr = this.f7823x;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7824y;
    }

    private C2844k8(float[] fArr, int i) {
        this.f7823x = fArr;
        this.f7824y = i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2715c7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m32509f(((Float) obj).floatValue());
        return true;
    }
}
